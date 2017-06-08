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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'", "'operation'", "'{'", "'variables'", "'='", "'}'", "'timestamp'", "'var'", "'feature'", "'.'", "'group'", "'set'", "'('", "')'", "','", "'mapping'"
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


    // $ANTLR start "entryRuleEvoGenericVariable"
    // InternalEvoOperationDsl.g:153:1: entryRuleEvoGenericVariable : ruleEvoGenericVariable EOF ;
    public final void entryRuleEvoGenericVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:154:1: ( ruleEvoGenericVariable EOF )
            // InternalEvoOperationDsl.g:155:1: ruleEvoGenericVariable EOF
            {
             before(grammarAccess.getEvoGenericVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoGenericVariable();

            state._fsp--;

             after(grammarAccess.getEvoGenericVariableRule()); 
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
    // $ANTLR end "entryRuleEvoGenericVariable"


    // $ANTLR start "ruleEvoGenericVariable"
    // InternalEvoOperationDsl.g:162:1: ruleEvoGenericVariable : ( ( rule__EvoGenericVariable__Group__0 ) ) ;
    public final void ruleEvoGenericVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:166:2: ( ( ( rule__EvoGenericVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:167:2: ( ( rule__EvoGenericVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:167:2: ( ( rule__EvoGenericVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:168:3: ( rule__EvoGenericVariable__Group__0 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:169:3: ( rule__EvoGenericVariable__Group__0 )
            // InternalEvoOperationDsl.g:169:4: rule__EvoGenericVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoGenericVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoGenericVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoGenericVariable"


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalEvoOperationDsl.g:178:1: entryRuleEvoFeatureVariable : ruleEvoFeatureVariable EOF ;
    public final void entryRuleEvoFeatureVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:179:1: ( ruleEvoFeatureVariable EOF )
            // InternalEvoOperationDsl.g:180:1: ruleEvoFeatureVariable EOF
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
    // InternalEvoOperationDsl.g:187:1: ruleEvoFeatureVariable : ( ( rule__EvoFeatureVariable__Group__0 ) ) ;
    public final void ruleEvoFeatureVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:191:2: ( ( ( rule__EvoFeatureVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:192:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:192:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:193:3: ( rule__EvoFeatureVariable__Group__0 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:194:3: ( rule__EvoFeatureVariable__Group__0 )
            // InternalEvoOperationDsl.g:194:4: rule__EvoFeatureVariable__Group__0
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


    // $ANTLR start "ruleEvoVariableType"
    // InternalEvoOperationDsl.g:278:1: ruleEvoVariableType : ( ( rule__EvoVariableType__Alternatives ) ) ;
    public final void ruleEvoVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:282:1: ( ( ( rule__EvoVariableType__Alternatives ) ) )
            // InternalEvoOperationDsl.g:283:2: ( ( rule__EvoVariableType__Alternatives ) )
            {
            // InternalEvoOperationDsl.g:283:2: ( ( rule__EvoVariableType__Alternatives ) )
            // InternalEvoOperationDsl.g:284:3: ( rule__EvoVariableType__Alternatives )
            {
             before(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); 
            // InternalEvoOperationDsl.g:285:3: ( rule__EvoVariableType__Alternatives )
            // InternalEvoOperationDsl.g:285:4: rule__EvoVariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoVariableType"


    // $ANTLR start "ruleEvoFeatureVariableType"
    // InternalEvoOperationDsl.g:294:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:298:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoOperationDsl.g:299:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoOperationDsl.g:299:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoOperationDsl.g:300:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoOperationDsl.g:301:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoOperationDsl.g:301:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoOperationDsl.g:309:1: rule__EvoVariable__Alternatives : ( ( ruleEvoGenericVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:313:1: ( ( ruleEvoGenericVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case 32:
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
                    // InternalEvoOperationDsl.g:314:2: ( ruleEvoGenericVariable )
                    {
                    // InternalEvoOperationDsl.g:314:2: ( ruleEvoGenericVariable )
                    // InternalEvoOperationDsl.g:315:3: ruleEvoGenericVariable
                    {
                     before(grammarAccess.getEvoVariableAccess().getEvoGenericVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoGenericVariable();

                    state._fsp--;

                     after(grammarAccess.getEvoVariableAccess().getEvoGenericVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:320:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoOperationDsl.g:320:2: ( ruleEvoFeatureVariable )
                    // InternalEvoOperationDsl.g:321:3: ruleEvoFeatureVariable
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
                    // InternalEvoOperationDsl.g:326:2: ( ruleEvoGroupVariable )
                    {
                    // InternalEvoOperationDsl.g:326:2: ( ruleEvoGroupVariable )
                    // InternalEvoOperationDsl.g:327:3: ruleEvoGroupVariable
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
                    // InternalEvoOperationDsl.g:332:2: ( ruleEvoSetVariable )
                    {
                    // InternalEvoOperationDsl.g:332:2: ( ruleEvoSetVariable )
                    // InternalEvoOperationDsl.g:333:3: ruleEvoSetVariable
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
                    // InternalEvoOperationDsl.g:338:2: ( ruleEvoMappingVariable )
                    {
                    // InternalEvoOperationDsl.g:338:2: ( ruleEvoMappingVariable )
                    // InternalEvoOperationDsl.g:339:3: ruleEvoMappingVariable
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


    // $ANTLR start "rule__EvoVariableType__Alternatives"
    // InternalEvoOperationDsl.g:348:1: rule__EvoVariableType__Alternatives : ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) );
    public final void rule__EvoVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:352:1: ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) )
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
                    // InternalEvoOperationDsl.g:353:2: ( ( '@ident' ) )
                    {
                    // InternalEvoOperationDsl.g:353:2: ( ( '@ident' ) )
                    // InternalEvoOperationDsl.g:354:3: ( '@ident' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 
                    // InternalEvoOperationDsl.g:355:3: ( '@ident' )
                    // InternalEvoOperationDsl.g:355:4: '@ident'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:359:2: ( ( '@pre' ) )
                    {
                    // InternalEvoOperationDsl.g:359:2: ( ( '@pre' ) )
                    // InternalEvoOperationDsl.g:360:3: ( '@pre' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 
                    // InternalEvoOperationDsl.g:361:3: ( '@pre' )
                    // InternalEvoOperationDsl.g:361:4: '@pre'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:365:2: ( ( '@post' ) )
                    {
                    // InternalEvoOperationDsl.g:365:2: ( ( '@post' ) )
                    // InternalEvoOperationDsl.g:366:3: ( '@post' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); 
                    // InternalEvoOperationDsl.g:367:3: ( '@post' )
                    // InternalEvoOperationDsl.g:367:4: '@post'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__EvoVariableType__Alternatives"


    // $ANTLR start "rule__EvoFeatureVariableType__Alternatives"
    // InternalEvoOperationDsl.g:375:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:379:1: ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEvoOperationDsl.g:380:2: ( ( 'parent' ) )
                    {
                    // InternalEvoOperationDsl.g:380:2: ( ( 'parent' ) )
                    // InternalEvoOperationDsl.g:381:3: ( 'parent' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoOperationDsl.g:382:3: ( 'parent' )
                    // InternalEvoOperationDsl.g:382:4: 'parent'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:386:2: ( ( 'source' ) )
                    {
                    // InternalEvoOperationDsl.g:386:2: ( ( 'source' ) )
                    // InternalEvoOperationDsl.g:387:3: ( 'source' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoOperationDsl.g:388:3: ( 'source' )
                    // InternalEvoOperationDsl.g:388:4: 'source'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:392:2: ( ( 'child' ) )
                    {
                    // InternalEvoOperationDsl.g:392:2: ( ( 'child' ) )
                    // InternalEvoOperationDsl.g:393:3: ( 'child' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoOperationDsl.g:394:3: ( 'child' )
                    // InternalEvoOperationDsl.g:394:4: 'child'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalEvoOperationDsl.g:402:1: rule__EvoOperationContainer__Group__0 : rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 ;
    public final void rule__EvoOperationContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:406:1: ( rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 )
            // InternalEvoOperationDsl.g:407:2: rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1
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
    // InternalEvoOperationDsl.g:414:1: rule__EvoOperationContainer__Group__0__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) ;
    public final void rule__EvoOperationContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:418:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) )
            // InternalEvoOperationDsl.g:419:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            {
            // InternalEvoOperationDsl.g:419:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            // InternalEvoOperationDsl.g:420:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_0()); 
            // InternalEvoOperationDsl.g:421:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            // InternalEvoOperationDsl.g:421:3: rule__EvoOperationContainer__OperationsAssignment_0
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
    // InternalEvoOperationDsl.g:429:1: rule__EvoOperationContainer__Group__1 : rule__EvoOperationContainer__Group__1__Impl ;
    public final void rule__EvoOperationContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:433:1: ( rule__EvoOperationContainer__Group__1__Impl )
            // InternalEvoOperationDsl.g:434:2: rule__EvoOperationContainer__Group__1__Impl
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
    // InternalEvoOperationDsl.g:440:1: rule__EvoOperationContainer__Group__1__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) ;
    public final void rule__EvoOperationContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:444:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) )
            // InternalEvoOperationDsl.g:445:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            {
            // InternalEvoOperationDsl.g:445:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            // InternalEvoOperationDsl.g:446:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_1()); 
            // InternalEvoOperationDsl.g:447:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:447:3: rule__EvoOperationContainer__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EvoOperationContainer__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalEvoOperationDsl.g:456:1: rule__EvoOperation__Group__0 : rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 ;
    public final void rule__EvoOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:460:1: ( rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 )
            // InternalEvoOperationDsl.g:461:2: rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1
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
    // InternalEvoOperationDsl.g:468:1: rule__EvoOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__EvoOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:472:1: ( ( 'operation' ) )
            // InternalEvoOperationDsl.g:473:1: ( 'operation' )
            {
            // InternalEvoOperationDsl.g:473:1: ( 'operation' )
            // InternalEvoOperationDsl.g:474:2: 'operation'
            {
             before(grammarAccess.getEvoOperationAccess().getOperationKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:483:1: rule__EvoOperation__Group__1 : rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 ;
    public final void rule__EvoOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:487:1: ( rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 )
            // InternalEvoOperationDsl.g:488:2: rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2
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
    // InternalEvoOperationDsl.g:495:1: rule__EvoOperation__Group__1__Impl : ( ( rule__EvoOperation__NameAssignment_1 ) ) ;
    public final void rule__EvoOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:499:1: ( ( ( rule__EvoOperation__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:500:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:500:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:501:2: ( rule__EvoOperation__NameAssignment_1 )
            {
             before(grammarAccess.getEvoOperationAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:502:2: ( rule__EvoOperation__NameAssignment_1 )
            // InternalEvoOperationDsl.g:502:3: rule__EvoOperation__NameAssignment_1
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
    // InternalEvoOperationDsl.g:510:1: rule__EvoOperation__Group__2 : rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 ;
    public final void rule__EvoOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:514:1: ( rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 )
            // InternalEvoOperationDsl.g:515:2: rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3
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
    // InternalEvoOperationDsl.g:522:1: rule__EvoOperation__Group__2__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:526:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:527:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:527:1: ( '{' )
            // InternalEvoOperationDsl.g:528:2: '{'
            {
             before(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:537:1: rule__EvoOperation__Group__3 : rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 ;
    public final void rule__EvoOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:541:1: ( rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 )
            // InternalEvoOperationDsl.g:542:2: rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalEvoOperationDsl.g:549:1: rule__EvoOperation__Group__3__Impl : ( 'variables' ) ;
    public final void rule__EvoOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:553:1: ( ( 'variables' ) )
            // InternalEvoOperationDsl.g:554:1: ( 'variables' )
            {
            // InternalEvoOperationDsl.g:554:1: ( 'variables' )
            // InternalEvoOperationDsl.g:555:2: 'variables'
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:564:1: rule__EvoOperation__Group__4 : rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 ;
    public final void rule__EvoOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:568:1: ( rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 )
            // InternalEvoOperationDsl.g:569:2: rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalEvoOperationDsl.g:576:1: rule__EvoOperation__Group__4__Impl : ( '=' ) ;
    public final void rule__EvoOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:580:1: ( ( '=' ) )
            // InternalEvoOperationDsl.g:581:1: ( '=' )
            {
            // InternalEvoOperationDsl.g:581:1: ( '=' )
            // InternalEvoOperationDsl.g:582:2: '='
            {
             before(grammarAccess.getEvoOperationAccess().getEqualsSignKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
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
    // InternalEvoOperationDsl.g:591:1: rule__EvoOperation__Group__5 : rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 ;
    public final void rule__EvoOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:595:1: ( rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 )
            // InternalEvoOperationDsl.g:596:2: rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6
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
    // InternalEvoOperationDsl.g:603:1: rule__EvoOperation__Group__5__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:607:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:608:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:608:1: ( '{' )
            // InternalEvoOperationDsl.g:609:2: '{'
            {
             before(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalEvoOperationDsl.g:618:1: rule__EvoOperation__Group__6 : rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 ;
    public final void rule__EvoOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:622:1: ( rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 )
            // InternalEvoOperationDsl.g:623:2: rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalEvoOperationDsl.g:630:1: rule__EvoOperation__Group__6__Impl : ( ( rule__EvoOperation__VariablesAssignment_6 ) ) ;
    public final void rule__EvoOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:634:1: ( ( ( rule__EvoOperation__VariablesAssignment_6 ) ) )
            // InternalEvoOperationDsl.g:635:1: ( ( rule__EvoOperation__VariablesAssignment_6 ) )
            {
            // InternalEvoOperationDsl.g:635:1: ( ( rule__EvoOperation__VariablesAssignment_6 ) )
            // InternalEvoOperationDsl.g:636:2: ( rule__EvoOperation__VariablesAssignment_6 )
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_6()); 
            // InternalEvoOperationDsl.g:637:2: ( rule__EvoOperation__VariablesAssignment_6 )
            // InternalEvoOperationDsl.g:637:3: rule__EvoOperation__VariablesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__VariablesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationAccess().getVariablesAssignment_6()); 

            }


            }

        }
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
    // InternalEvoOperationDsl.g:645:1: rule__EvoOperation__Group__7 : rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 ;
    public final void rule__EvoOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:649:1: ( rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 )
            // InternalEvoOperationDsl.g:650:2: rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalEvoOperationDsl.g:657:1: rule__EvoOperation__Group__7__Impl : ( ( rule__EvoOperation__VariablesAssignment_7 )* ) ;
    public final void rule__EvoOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:661:1: ( ( ( rule__EvoOperation__VariablesAssignment_7 )* ) )
            // InternalEvoOperationDsl.g:662:1: ( ( rule__EvoOperation__VariablesAssignment_7 )* )
            {
            // InternalEvoOperationDsl.g:662:1: ( ( rule__EvoOperation__VariablesAssignment_7 )* )
            // InternalEvoOperationDsl.g:663:2: ( rule__EvoOperation__VariablesAssignment_7 )*
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_7()); 
            // InternalEvoOperationDsl.g:664:2: ( rule__EvoOperation__VariablesAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=24 && LA5_0<=25)||(LA5_0>=27 && LA5_0<=28)||LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:664:3: rule__EvoOperation__VariablesAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EvoOperation__VariablesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEvoOperationAccess().getVariablesAssignment_7()); 

            }


            }

        }
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
    // InternalEvoOperationDsl.g:672:1: rule__EvoOperation__Group__8 : rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 ;
    public final void rule__EvoOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:676:1: ( rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 )
            // InternalEvoOperationDsl.g:677:2: rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9
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
    // InternalEvoOperationDsl.g:684:1: rule__EvoOperation__Group__8__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:688:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:689:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:689:1: ( '}' )
            // InternalEvoOperationDsl.g:690:2: '}'
            {
             before(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:699:1: rule__EvoOperation__Group__9 : rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 ;
    public final void rule__EvoOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:703:1: ( rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 )
            // InternalEvoOperationDsl.g:704:2: rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10
            {
            pushFollow(FOLLOW_8);
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
    // InternalEvoOperationDsl.g:711:1: rule__EvoOperation__Group__9__Impl : ( 'timestamp' ) ;
    public final void rule__EvoOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:715:1: ( ( 'timestamp' ) )
            // InternalEvoOperationDsl.g:716:1: ( 'timestamp' )
            {
            // InternalEvoOperationDsl.g:716:1: ( 'timestamp' )
            // InternalEvoOperationDsl.g:717:2: 'timestamp'
            {
             before(grammarAccess.getEvoOperationAccess().getTimestampKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getTimestampKeyword_9()); 

            }


            }

        }
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
    // InternalEvoOperationDsl.g:726:1: rule__EvoOperation__Group__10 : rule__EvoOperation__Group__10__Impl rule__EvoOperation__Group__11 ;
    public final void rule__EvoOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:730:1: ( rule__EvoOperation__Group__10__Impl rule__EvoOperation__Group__11 )
            // InternalEvoOperationDsl.g:731:2: rule__EvoOperation__Group__10__Impl rule__EvoOperation__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__EvoOperation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__11();

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
    // InternalEvoOperationDsl.g:738:1: rule__EvoOperation__Group__10__Impl : ( '=' ) ;
    public final void rule__EvoOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:742:1: ( ( '=' ) )
            // InternalEvoOperationDsl.g:743:1: ( '=' )
            {
            // InternalEvoOperationDsl.g:743:1: ( '=' )
            // InternalEvoOperationDsl.g:744:2: '='
            {
             before(grammarAccess.getEvoOperationAccess().getEqualsSignKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvoOperation__Group__11"
    // InternalEvoOperationDsl.g:753:1: rule__EvoOperation__Group__11 : rule__EvoOperation__Group__11__Impl rule__EvoOperation__Group__12 ;
    public final void rule__EvoOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:757:1: ( rule__EvoOperation__Group__11__Impl rule__EvoOperation__Group__12 )
            // InternalEvoOperationDsl.g:758:2: rule__EvoOperation__Group__11__Impl rule__EvoOperation__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__EvoOperation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__12();

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
    // $ANTLR end "rule__EvoOperation__Group__11"


    // $ANTLR start "rule__EvoOperation__Group__11__Impl"
    // InternalEvoOperationDsl.g:765:1: rule__EvoOperation__Group__11__Impl : ( ( rule__EvoOperation__DateAssignment_11 ) ) ;
    public final void rule__EvoOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:769:1: ( ( ( rule__EvoOperation__DateAssignment_11 ) ) )
            // InternalEvoOperationDsl.g:770:1: ( ( rule__EvoOperation__DateAssignment_11 ) )
            {
            // InternalEvoOperationDsl.g:770:1: ( ( rule__EvoOperation__DateAssignment_11 ) )
            // InternalEvoOperationDsl.g:771:2: ( rule__EvoOperation__DateAssignment_11 )
            {
             before(grammarAccess.getEvoOperationAccess().getDateAssignment_11()); 
            // InternalEvoOperationDsl.g:772:2: ( rule__EvoOperation__DateAssignment_11 )
            // InternalEvoOperationDsl.g:772:3: rule__EvoOperation__DateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__DateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationAccess().getDateAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOperation__Group__11__Impl"


    // $ANTLR start "rule__EvoOperation__Group__12"
    // InternalEvoOperationDsl.g:780:1: rule__EvoOperation__Group__12 : rule__EvoOperation__Group__12__Impl ;
    public final void rule__EvoOperation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:784:1: ( rule__EvoOperation__Group__12__Impl )
            // InternalEvoOperationDsl.g:785:2: rule__EvoOperation__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__12__Impl();

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
    // $ANTLR end "rule__EvoOperation__Group__12"


    // $ANTLR start "rule__EvoOperation__Group__12__Impl"
    // InternalEvoOperationDsl.g:791:1: rule__EvoOperation__Group__12__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:795:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:796:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:796:1: ( '}' )
            // InternalEvoOperationDsl.g:797:2: '}'
            {
             before(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOperation__Group__12__Impl"


    // $ANTLR start "rule__EvoGenericVariable__Group__0"
    // InternalEvoOperationDsl.g:807:1: rule__EvoGenericVariable__Group__0 : rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1 ;
    public final void rule__EvoGenericVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:811:1: ( rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1 )
            // InternalEvoOperationDsl.g:812:2: rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoGenericVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoGenericVariable__Group__1();

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
    // $ANTLR end "rule__EvoGenericVariable__Group__0"


    // $ANTLR start "rule__EvoGenericVariable__Group__0__Impl"
    // InternalEvoOperationDsl.g:819:1: rule__EvoGenericVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__EvoGenericVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:823:1: ( ( 'var' ) )
            // InternalEvoOperationDsl.g:824:1: ( 'var' )
            {
            // InternalEvoOperationDsl.g:824:1: ( 'var' )
            // InternalEvoOperationDsl.g:825:2: 'var'
            {
             before(grammarAccess.getEvoGenericVariableAccess().getVarKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvoGenericVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGenericVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoGenericVariable__Group__1"
    // InternalEvoOperationDsl.g:834:1: rule__EvoGenericVariable__Group__1 : rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2 ;
    public final void rule__EvoGenericVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:838:1: ( rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2 )
            // InternalEvoOperationDsl.g:839:2: rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EvoGenericVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoGenericVariable__Group__2();

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
    // $ANTLR end "rule__EvoGenericVariable__Group__1"


    // $ANTLR start "rule__EvoGenericVariable__Group__1__Impl"
    // InternalEvoOperationDsl.g:846:1: rule__EvoGenericVariable__Group__1__Impl : ( ( rule__EvoGenericVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGenericVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:850:1: ( ( ( rule__EvoGenericVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:851:1: ( ( rule__EvoGenericVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:851:1: ( ( rule__EvoGenericVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:852:2: ( rule__EvoGenericVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:853:2: ( rule__EvoGenericVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:853:3: rule__EvoGenericVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoGenericVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoGenericVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGenericVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoGenericVariable__Group__2"
    // InternalEvoOperationDsl.g:861:1: rule__EvoGenericVariable__Group__2 : rule__EvoGenericVariable__Group__2__Impl ;
    public final void rule__EvoGenericVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:865:1: ( rule__EvoGenericVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:866:2: rule__EvoGenericVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoGenericVariable__Group__2__Impl();

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
    // $ANTLR end "rule__EvoGenericVariable__Group__2"


    // $ANTLR start "rule__EvoGenericVariable__Group__2__Impl"
    // InternalEvoOperationDsl.g:872:1: rule__EvoGenericVariable__Group__2__Impl : ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) ) ;
    public final void rule__EvoGenericVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:876:1: ( ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) ) )
            // InternalEvoOperationDsl.g:877:1: ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) )
            {
            // InternalEvoOperationDsl.g:877:1: ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) )
            // InternalEvoOperationDsl.g:878:2: ( rule__EvoGenericVariable__VariableTypeAssignment_2 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getVariableTypeAssignment_2()); 
            // InternalEvoOperationDsl.g:879:2: ( rule__EvoGenericVariable__VariableTypeAssignment_2 )
            // InternalEvoOperationDsl.g:879:3: rule__EvoGenericVariable__VariableTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoGenericVariable__VariableTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoGenericVariableAccess().getVariableTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGenericVariable__Group__2__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group__0"
    // InternalEvoOperationDsl.g:888:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:892:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoOperationDsl.g:893:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
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
    // InternalEvoOperationDsl.g:900:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:904:1: ( ( 'feature' ) )
            // InternalEvoOperationDsl.g:905:1: ( 'feature' )
            {
            // InternalEvoOperationDsl.g:905:1: ( 'feature' )
            // InternalEvoOperationDsl.g:906:2: 'feature'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:915:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:919:1: ( rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 )
            // InternalEvoOperationDsl.g:920:2: rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalEvoOperationDsl.g:927:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:931:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:932:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:932:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:933:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:934:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:934:3: rule__EvoFeatureVariable__NameAssignment_1
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
    // InternalEvoOperationDsl.g:942:1: rule__EvoFeatureVariable__Group__2 : rule__EvoFeatureVariable__Group__2__Impl ;
    public final void rule__EvoFeatureVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:946:1: ( rule__EvoFeatureVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:947:2: rule__EvoFeatureVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__2__Impl();

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
    // InternalEvoOperationDsl.g:953:1: rule__EvoFeatureVariable__Group__2__Impl : ( ( rule__EvoFeatureVariable__Group_2__0 )? ) ;
    public final void rule__EvoFeatureVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:957:1: ( ( ( rule__EvoFeatureVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:958:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:958:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:959:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:960:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoOperationDsl.g:960:3: rule__EvoFeatureVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFeatureVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFeatureVariableAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvoFeatureVariable__Group_2__0"
    // InternalEvoOperationDsl.g:969:1: rule__EvoFeatureVariable__Group_2__0 : rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 ;
    public final void rule__EvoFeatureVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:973:1: ( rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:974:2: rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__EvoFeatureVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_2__1();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_2__0"


    // $ANTLR start "rule__EvoFeatureVariable__Group_2__0__Impl"
    // InternalEvoOperationDsl.g:981:1: rule__EvoFeatureVariable__Group_2__0__Impl : ( '.' ) ;
    public final void rule__EvoFeatureVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:985:1: ( ( '.' ) )
            // InternalEvoOperationDsl.g:986:1: ( '.' )
            {
            // InternalEvoOperationDsl.g:986:1: ( '.' )
            // InternalEvoOperationDsl.g:987:2: '.'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_2__0__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group_2__1"
    // InternalEvoOperationDsl.g:996:1: rule__EvoFeatureVariable__Group_2__1 : rule__EvoFeatureVariable__Group_2__1__Impl ;
    public final void rule__EvoFeatureVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1000:1: ( rule__EvoFeatureVariable__Group_2__1__Impl )
            // InternalEvoOperationDsl.g:1001:2: rule__EvoFeatureVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_2__1__Impl();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_2__1"


    // $ANTLR start "rule__EvoFeatureVariable__Group_2__1__Impl"
    // InternalEvoOperationDsl.g:1007:1: rule__EvoFeatureVariable__Group_2__1__Impl : ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1011:1: ( ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1012:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1012:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1013:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1014:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            // InternalEvoOperationDsl.g:1014:3: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__FeatureTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_2__1__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group__0"
    // InternalEvoOperationDsl.g:1023:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1027:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoOperationDsl.g:1028:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
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
    // InternalEvoOperationDsl.g:1035:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1039:1: ( ( 'group' ) )
            // InternalEvoOperationDsl.g:1040:1: ( 'group' )
            {
            // InternalEvoOperationDsl.g:1040:1: ( 'group' )
            // InternalEvoOperationDsl.g:1041:2: 'group'
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
    // InternalEvoOperationDsl.g:1050:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1054:1: ( rule__EvoGroupVariable__Group__1__Impl )
            // InternalEvoOperationDsl.g:1055:2: rule__EvoGroupVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group__1__Impl();

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
    // InternalEvoOperationDsl.g:1061:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1065:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1066:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1066:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1067:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1068:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1068:3: rule__EvoGroupVariable__NameAssignment_1
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


    // $ANTLR start "rule__EvoSetVariable__Group__0"
    // InternalEvoOperationDsl.g:1077:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1081:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoOperationDsl.g:1082:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
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
    // InternalEvoOperationDsl.g:1089:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1093:1: ( ( 'set' ) )
            // InternalEvoOperationDsl.g:1094:1: ( 'set' )
            {
            // InternalEvoOperationDsl.g:1094:1: ( 'set' )
            // InternalEvoOperationDsl.g:1095:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1104:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1108:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoOperationDsl.g:1109:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
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
    // InternalEvoOperationDsl.g:1116:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1120:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1121:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1121:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1122:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1123:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1123:3: rule__EvoSetVariable__NameAssignment_1
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
    // InternalEvoOperationDsl.g:1131:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1135:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1136:2: rule__EvoSetVariable__Group__2__Impl
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
    // InternalEvoOperationDsl.g:1142:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1146:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1147:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1147:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1148:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1149:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvoOperationDsl.g:1149:3: rule__EvoSetVariable__Group_2__0
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
    // InternalEvoOperationDsl.g:1158:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1162:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1163:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
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
    // InternalEvoOperationDsl.g:1170:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1174:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1175:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1175:1: ( '(' )
            // InternalEvoOperationDsl.g:1176:2: '('
            {
             before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1185:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1189:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1190:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
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
    // InternalEvoOperationDsl.g:1197:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1201:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1202:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1202:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1203:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1204:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoOperationDsl.g:1204:3: rule__EvoSetVariable__ElementsAssignment_2_1
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
    // InternalEvoOperationDsl.g:1212:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1216:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoOperationDsl.g:1217:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
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
    // InternalEvoOperationDsl.g:1224:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1228:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoOperationDsl.g:1229:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoOperationDsl.g:1229:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoOperationDsl.g:1230:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoOperationDsl.g:1231:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoOperationDsl.g:1231:3: rule__EvoSetVariable__Group_2_2__0
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
    // InternalEvoOperationDsl.g:1239:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1243:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoOperationDsl.g:1244:2: rule__EvoSetVariable__Group_2__3__Impl
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
    // InternalEvoOperationDsl.g:1250:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1254:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1255:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1255:1: ( ')' )
            // InternalEvoOperationDsl.g:1256:2: ')'
            {
             before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1266:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1270:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoOperationDsl.g:1271:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
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
    // InternalEvoOperationDsl.g:1278:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1282:1: ( ( ',' ) )
            // InternalEvoOperationDsl.g:1283:1: ( ',' )
            {
            // InternalEvoOperationDsl.g:1283:1: ( ',' )
            // InternalEvoOperationDsl.g:1284:2: ','
            {
             before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1293:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1297:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoOperationDsl.g:1298:2: rule__EvoSetVariable__Group_2_2__1__Impl
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
    // InternalEvoOperationDsl.g:1304:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1308:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoOperationDsl.g:1309:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1309:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoOperationDsl.g:1310:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoOperationDsl.g:1311:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoOperationDsl.g:1311:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
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
    // InternalEvoOperationDsl.g:1320:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1324:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoOperationDsl.g:1325:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
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
    // InternalEvoOperationDsl.g:1332:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1336:1: ( ( 'mapping' ) )
            // InternalEvoOperationDsl.g:1337:1: ( 'mapping' )
            {
            // InternalEvoOperationDsl.g:1337:1: ( 'mapping' )
            // InternalEvoOperationDsl.g:1338:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1347:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1351:1: ( rule__EvoMappingVariable__Group__1__Impl )
            // InternalEvoOperationDsl.g:1352:2: rule__EvoMappingVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group__1__Impl();

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
    // InternalEvoOperationDsl.g:1358:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1362:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1363:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1363:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1364:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1365:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1365:3: rule__EvoMappingVariable__NameAssignment_1
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


    // $ANTLR start "rule__GrammarEntry__ContainerAssignment"
    // InternalEvoOperationDsl.g:1374:1: rule__GrammarEntry__ContainerAssignment : ( ruleEvoOperationContainer ) ;
    public final void rule__GrammarEntry__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1378:1: ( ( ruleEvoOperationContainer ) )
            // InternalEvoOperationDsl.g:1379:2: ( ruleEvoOperationContainer )
            {
            // InternalEvoOperationDsl.g:1379:2: ( ruleEvoOperationContainer )
            // InternalEvoOperationDsl.g:1380:3: ruleEvoOperationContainer
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
    // InternalEvoOperationDsl.g:1389:1: rule__EvoOperationContainer__OperationsAssignment_0 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1393:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:1394:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:1394:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:1395:3: ruleEvoOperation
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
    // InternalEvoOperationDsl.g:1404:1: rule__EvoOperationContainer__OperationsAssignment_1 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1408:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:1409:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:1409:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:1410:3: ruleEvoOperation
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
    // InternalEvoOperationDsl.g:1419:1: rule__EvoOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1423:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1424:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1424:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1425:3: RULE_ID
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


    // $ANTLR start "rule__EvoOperation__VariablesAssignment_6"
    // InternalEvoOperationDsl.g:1434:1: rule__EvoOperation__VariablesAssignment_6 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1438:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:1439:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:1439:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:1440:3: ruleEvoVariable
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOperation__VariablesAssignment_6"


    // $ANTLR start "rule__EvoOperation__VariablesAssignment_7"
    // InternalEvoOperationDsl.g:1449:1: rule__EvoOperation__VariablesAssignment_7 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1453:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:1454:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:1454:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:1455:3: ruleEvoVariable
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOperation__VariablesAssignment_7"


    // $ANTLR start "rule__EvoOperation__DateAssignment_11"
    // InternalEvoOperationDsl.g:1464:1: rule__EvoOperation__DateAssignment_11 : ( RULE_DATE ) ;
    public final void rule__EvoOperation__DateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1468:1: ( ( RULE_DATE ) )
            // InternalEvoOperationDsl.g:1469:2: ( RULE_DATE )
            {
            // InternalEvoOperationDsl.g:1469:2: ( RULE_DATE )
            // InternalEvoOperationDsl.g:1470:3: RULE_DATE
            {
             before(grammarAccess.getEvoOperationAccess().getDateDATETerminalRuleCall_11_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getDateDATETerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOperation__DateAssignment_11"


    // $ANTLR start "rule__EvoGenericVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:1479:1: rule__EvoGenericVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGenericVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1483:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1484:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1484:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1485:3: RULE_ID
            {
             before(grammarAccess.getEvoGenericVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoGenericVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGenericVariable__NameAssignment_1"


    // $ANTLR start "rule__EvoGenericVariable__VariableTypeAssignment_2"
    // InternalEvoOperationDsl.g:1494:1: rule__EvoGenericVariable__VariableTypeAssignment_2 : ( ruleEvoVariableType ) ;
    public final void rule__EvoGenericVariable__VariableTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1498:1: ( ( ruleEvoVariableType ) )
            // InternalEvoOperationDsl.g:1499:2: ( ruleEvoVariableType )
            {
            // InternalEvoOperationDsl.g:1499:2: ( ruleEvoVariableType )
            // InternalEvoOperationDsl.g:1500:3: ruleEvoVariableType
            {
             before(grammarAccess.getEvoGenericVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariableType();

            state._fsp--;

             after(grammarAccess.getEvoGenericVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGenericVariable__VariableTypeAssignment_2"


    // $ANTLR start "rule__EvoFeatureVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:1509:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1513:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1514:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1514:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1515:3: RULE_ID
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


    // $ANTLR start "rule__EvoFeatureVariable__FeatureTypeAssignment_2_1"
    // InternalEvoOperationDsl.g:1524:1: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 : ( ruleEvoFeatureVariableType ) ;
    public final void rule__EvoFeatureVariable__FeatureTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1528:1: ( ( ruleEvoFeatureVariableType ) )
            // InternalEvoOperationDsl.g:1529:2: ( ruleEvoFeatureVariableType )
            {
            // InternalEvoOperationDsl.g:1529:2: ( ruleEvoFeatureVariableType )
            // InternalEvoOperationDsl.g:1530:3: ruleEvoFeatureVariableType
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoFeatureVariableType();

            state._fsp--;

             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__FeatureTypeAssignment_2_1"


    // $ANTLR start "rule__EvoGroupVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:1539:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1543:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1544:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1544:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1545:3: RULE_ID
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


    // $ANTLR start "rule__EvoSetVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:1554:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1558:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1559:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1559:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1560:3: RULE_ID
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
    // InternalEvoOperationDsl.g:1569:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1573:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:1574:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:1574:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1575:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoOperationDsl.g:1576:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:1577:4: RULE_ID
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
    // InternalEvoOperationDsl.g:1588:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1592:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:1593:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:1593:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1594:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoOperationDsl.g:1595:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:1596:4: RULE_ID
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
    // InternalEvoOperationDsl.g:1607:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1611:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1612:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1612:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1613:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000011B000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000011B400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000011B000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});

}