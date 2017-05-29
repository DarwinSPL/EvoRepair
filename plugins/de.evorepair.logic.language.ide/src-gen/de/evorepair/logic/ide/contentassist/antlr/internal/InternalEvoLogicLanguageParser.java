package de.evorepair.logic.ide.contentassist.antlr.internal;

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
import de.evorepair.logic.services.EvoLogicLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoLogicLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'||'", "'and'", "'&&'", "'import'", "'formula'", "'{'", "'term'", "'}'", "'variables'", "','", "'EvoVariableTerm'", "'variable'", "'afeature'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEvoLogicLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoLogicLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoLogicLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoLogicLanguage.g"; }


    	private EvoLogicLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(EvoLogicLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCommandDocument"
    // InternalEvoLogicLanguage.g:53:1: entryRuleCommandDocument : ruleCommandDocument EOF ;
    public final void entryRuleCommandDocument() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:54:1: ( ruleCommandDocument EOF )
            // InternalEvoLogicLanguage.g:55:1: ruleCommandDocument EOF
            {
             before(grammarAccess.getCommandDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandDocument();

            state._fsp--;

             after(grammarAccess.getCommandDocumentRule()); 
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
    // $ANTLR end "entryRuleCommandDocument"


    // $ANTLR start "ruleCommandDocument"
    // InternalEvoLogicLanguage.g:62:1: ruleCommandDocument : ( ( rule__CommandDocument__Group__0 ) ) ;
    public final void ruleCommandDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:66:2: ( ( ( rule__CommandDocument__Group__0 ) ) )
            // InternalEvoLogicLanguage.g:67:2: ( ( rule__CommandDocument__Group__0 ) )
            {
            // InternalEvoLogicLanguage.g:67:2: ( ( rule__CommandDocument__Group__0 ) )
            // InternalEvoLogicLanguage.g:68:3: ( rule__CommandDocument__Group__0 )
            {
             before(grammarAccess.getCommandDocumentAccess().getGroup()); 
            // InternalEvoLogicLanguage.g:69:3: ( rule__CommandDocument__Group__0 )
            // InternalEvoLogicLanguage.g:69:4: rule__CommandDocument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandDocument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandDocument"


    // $ANTLR start "entryRuleImport"
    // InternalEvoLogicLanguage.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:79:1: ( ruleImport EOF )
            // InternalEvoLogicLanguage.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEvoLogicLanguage.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalEvoLogicLanguage.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalEvoLogicLanguage.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalEvoLogicLanguage.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalEvoLogicLanguage.g:94:3: ( rule__Import__Group__0 )
            // InternalEvoLogicLanguage.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEvoFormula"
    // InternalEvoLogicLanguage.g:103:1: entryRuleEvoFormula : ruleEvoFormula EOF ;
    public final void entryRuleEvoFormula() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:104:1: ( ruleEvoFormula EOF )
            // InternalEvoLogicLanguage.g:105:1: ruleEvoFormula EOF
            {
             before(grammarAccess.getEvoFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoFormula();

            state._fsp--;

             after(grammarAccess.getEvoFormulaRule()); 
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
    // $ANTLR end "entryRuleEvoFormula"


    // $ANTLR start "ruleEvoFormula"
    // InternalEvoLogicLanguage.g:112:1: ruleEvoFormula : ( ( rule__EvoFormula__Group__0 ) ) ;
    public final void ruleEvoFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:116:2: ( ( ( rule__EvoFormula__Group__0 ) ) )
            // InternalEvoLogicLanguage.g:117:2: ( ( rule__EvoFormula__Group__0 ) )
            {
            // InternalEvoLogicLanguage.g:117:2: ( ( rule__EvoFormula__Group__0 ) )
            // InternalEvoLogicLanguage.g:118:3: ( rule__EvoFormula__Group__0 )
            {
             before(grammarAccess.getEvoFormulaAccess().getGroup()); 
            // InternalEvoLogicLanguage.g:119:3: ( rule__EvoFormula__Group__0 )
            // InternalEvoLogicLanguage.g:119:4: rule__EvoFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoFormula"


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoLogicLanguage.g:128:1: entryRuleEvoVariable : ruleEvoVariable EOF ;
    public final void entryRuleEvoVariable() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:129:1: ( ruleEvoVariable EOF )
            // InternalEvoLogicLanguage.g:130:1: ruleEvoVariable EOF
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
    // InternalEvoLogicLanguage.g:137:1: ruleEvoVariable : ( ruleEvoArbitratyFeatureVariable ) ;
    public final void ruleEvoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:141:2: ( ( ruleEvoArbitratyFeatureVariable ) )
            // InternalEvoLogicLanguage.g:142:2: ( ruleEvoArbitratyFeatureVariable )
            {
            // InternalEvoLogicLanguage.g:142:2: ( ruleEvoArbitratyFeatureVariable )
            // InternalEvoLogicLanguage.g:143:3: ruleEvoArbitratyFeatureVariable
            {
             before(grammarAccess.getEvoVariableAccess().getEvoArbitratyFeatureVariableParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEvoArbitratyFeatureVariable();

            state._fsp--;

             after(grammarAccess.getEvoVariableAccess().getEvoArbitratyFeatureVariableParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEvoVariableTerm"
    // InternalEvoLogicLanguage.g:153:1: entryRuleEvoVariableTerm : ruleEvoVariableTerm EOF ;
    public final void entryRuleEvoVariableTerm() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:154:1: ( ruleEvoVariableTerm EOF )
            // InternalEvoLogicLanguage.g:155:1: ruleEvoVariableTerm EOF
            {
             before(grammarAccess.getEvoVariableTermRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoVariableTerm();

            state._fsp--;

             after(grammarAccess.getEvoVariableTermRule()); 
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
    // $ANTLR end "entryRuleEvoVariableTerm"


    // $ANTLR start "ruleEvoVariableTerm"
    // InternalEvoLogicLanguage.g:162:1: ruleEvoVariableTerm : ( ( rule__EvoVariableTerm__Group__0 ) ) ;
    public final void ruleEvoVariableTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:166:2: ( ( ( rule__EvoVariableTerm__Group__0 ) ) )
            // InternalEvoLogicLanguage.g:167:2: ( ( rule__EvoVariableTerm__Group__0 ) )
            {
            // InternalEvoLogicLanguage.g:167:2: ( ( rule__EvoVariableTerm__Group__0 ) )
            // InternalEvoLogicLanguage.g:168:3: ( rule__EvoVariableTerm__Group__0 )
            {
             before(grammarAccess.getEvoVariableTermAccess().getGroup()); 
            // InternalEvoLogicLanguage.g:169:3: ( rule__EvoVariableTerm__Group__0 )
            // InternalEvoLogicLanguage.g:169:4: rule__EvoVariableTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoVariableTerm"


    // $ANTLR start "entryRuleEvoArbitratyFeatureVariable"
    // InternalEvoLogicLanguage.g:178:1: entryRuleEvoArbitratyFeatureVariable : ruleEvoArbitratyFeatureVariable EOF ;
    public final void entryRuleEvoArbitratyFeatureVariable() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:179:1: ( ruleEvoArbitratyFeatureVariable EOF )
            // InternalEvoLogicLanguage.g:180:1: ruleEvoArbitratyFeatureVariable EOF
            {
             before(grammarAccess.getEvoArbitratyFeatureVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoArbitratyFeatureVariable();

            state._fsp--;

             after(grammarAccess.getEvoArbitratyFeatureVariableRule()); 
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
    // $ANTLR end "entryRuleEvoArbitratyFeatureVariable"


    // $ANTLR start "ruleEvoArbitratyFeatureVariable"
    // InternalEvoLogicLanguage.g:187:1: ruleEvoArbitratyFeatureVariable : ( ( rule__EvoArbitratyFeatureVariable__Group__0 ) ) ;
    public final void ruleEvoArbitratyFeatureVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:191:2: ( ( ( rule__EvoArbitratyFeatureVariable__Group__0 ) ) )
            // InternalEvoLogicLanguage.g:192:2: ( ( rule__EvoArbitratyFeatureVariable__Group__0 ) )
            {
            // InternalEvoLogicLanguage.g:192:2: ( ( rule__EvoArbitratyFeatureVariable__Group__0 ) )
            // InternalEvoLogicLanguage.g:193:3: ( rule__EvoArbitratyFeatureVariable__Group__0 )
            {
             before(grammarAccess.getEvoArbitratyFeatureVariableAccess().getGroup()); 
            // InternalEvoLogicLanguage.g:194:3: ( rule__EvoArbitratyFeatureVariable__Group__0 )
            // InternalEvoLogicLanguage.g:194:4: rule__EvoArbitratyFeatureVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoArbitratyFeatureVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoArbitratyFeatureVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoArbitratyFeatureVariable"


    // $ANTLR start "entryRuleEvoAbstractTerm"
    // InternalEvoLogicLanguage.g:203:1: entryRuleEvoAbstractTerm : ruleEvoAbstractTerm EOF ;
    public final void entryRuleEvoAbstractTerm() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:204:1: ( ruleEvoAbstractTerm EOF )
            // InternalEvoLogicLanguage.g:205:1: ruleEvoAbstractTerm EOF
            {
             before(grammarAccess.getEvoAbstractTermRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoAbstractTerm();

            state._fsp--;

             after(grammarAccess.getEvoAbstractTermRule()); 
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
    // $ANTLR end "entryRuleEvoAbstractTerm"


    // $ANTLR start "ruleEvoAbstractTerm"
    // InternalEvoLogicLanguage.g:212:1: ruleEvoAbstractTerm : ( ruleEvoOr ) ;
    public final void ruleEvoAbstractTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:216:2: ( ( ruleEvoOr ) )
            // InternalEvoLogicLanguage.g:217:2: ( ruleEvoOr )
            {
            // InternalEvoLogicLanguage.g:217:2: ( ruleEvoOr )
            // InternalEvoLogicLanguage.g:218:3: ruleEvoOr
            {
             before(grammarAccess.getEvoAbstractTermAccess().getEvoOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEvoOr();

            state._fsp--;

             after(grammarAccess.getEvoAbstractTermAccess().getEvoOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoAbstractTerm"


    // $ANTLR start "entryRuleEvoOr"
    // InternalEvoLogicLanguage.g:228:1: entryRuleEvoOr : ruleEvoOr EOF ;
    public final void entryRuleEvoOr() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:229:1: ( ruleEvoOr EOF )
            // InternalEvoLogicLanguage.g:230:1: ruleEvoOr EOF
            {
             before(grammarAccess.getEvoOrRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoOr();

            state._fsp--;

             after(grammarAccess.getEvoOrRule()); 
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
    // $ANTLR end "entryRuleEvoOr"


    // $ANTLR start "ruleEvoOr"
    // InternalEvoLogicLanguage.g:237:1: ruleEvoOr : ( ( rule__EvoOr__Group__0 ) ) ;
    public final void ruleEvoOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:241:2: ( ( ( rule__EvoOr__Group__0 ) ) )
            // InternalEvoLogicLanguage.g:242:2: ( ( rule__EvoOr__Group__0 ) )
            {
            // InternalEvoLogicLanguage.g:242:2: ( ( rule__EvoOr__Group__0 ) )
            // InternalEvoLogicLanguage.g:243:3: ( rule__EvoOr__Group__0 )
            {
             before(grammarAccess.getEvoOrAccess().getGroup()); 
            // InternalEvoLogicLanguage.g:244:3: ( rule__EvoOr__Group__0 )
            // InternalEvoLogicLanguage.g:244:4: rule__EvoOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoOr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoOr"


    // $ANTLR start "entryRuleEvoAnd"
    // InternalEvoLogicLanguage.g:253:1: entryRuleEvoAnd : ruleEvoAnd EOF ;
    public final void entryRuleEvoAnd() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:254:1: ( ruleEvoAnd EOF )
            // InternalEvoLogicLanguage.g:255:1: ruleEvoAnd EOF
            {
             before(grammarAccess.getEvoAndRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoAnd();

            state._fsp--;

             after(grammarAccess.getEvoAndRule()); 
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
    // $ANTLR end "entryRuleEvoAnd"


    // $ANTLR start "ruleEvoAnd"
    // InternalEvoLogicLanguage.g:262:1: ruleEvoAnd : ( ( rule__EvoAnd__Group__0 ) ) ;
    public final void ruleEvoAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:266:2: ( ( ( rule__EvoAnd__Group__0 ) ) )
            // InternalEvoLogicLanguage.g:267:2: ( ( rule__EvoAnd__Group__0 ) )
            {
            // InternalEvoLogicLanguage.g:267:2: ( ( rule__EvoAnd__Group__0 ) )
            // InternalEvoLogicLanguage.g:268:3: ( rule__EvoAnd__Group__0 )
            {
             before(grammarAccess.getEvoAndAccess().getGroup()); 
            // InternalEvoLogicLanguage.g:269:3: ( rule__EvoAnd__Group__0 )
            // InternalEvoLogicLanguage.g:269:4: rule__EvoAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoAnd"


    // $ANTLR start "entryRuleEvoAbstractOneParameterTerm"
    // InternalEvoLogicLanguage.g:278:1: entryRuleEvoAbstractOneParameterTerm : ruleEvoAbstractOneParameterTerm EOF ;
    public final void entryRuleEvoAbstractOneParameterTerm() throws RecognitionException {
        try {
            // InternalEvoLogicLanguage.g:279:1: ( ruleEvoAbstractOneParameterTerm EOF )
            // InternalEvoLogicLanguage.g:280:1: ruleEvoAbstractOneParameterTerm EOF
            {
             before(grammarAccess.getEvoAbstractOneParameterTermRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoAbstractOneParameterTerm();

            state._fsp--;

             after(grammarAccess.getEvoAbstractOneParameterTermRule()); 
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
    // $ANTLR end "entryRuleEvoAbstractOneParameterTerm"


    // $ANTLR start "ruleEvoAbstractOneParameterTerm"
    // InternalEvoLogicLanguage.g:287:1: ruleEvoAbstractOneParameterTerm : ( ( rule__EvoAbstractOneParameterTerm__Alternatives ) ) ;
    public final void ruleEvoAbstractOneParameterTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:291:2: ( ( ( rule__EvoAbstractOneParameterTerm__Alternatives ) ) )
            // InternalEvoLogicLanguage.g:292:2: ( ( rule__EvoAbstractOneParameterTerm__Alternatives ) )
            {
            // InternalEvoLogicLanguage.g:292:2: ( ( rule__EvoAbstractOneParameterTerm__Alternatives ) )
            // InternalEvoLogicLanguage.g:293:3: ( rule__EvoAbstractOneParameterTerm__Alternatives )
            {
             before(grammarAccess.getEvoAbstractOneParameterTermAccess().getAlternatives()); 
            // InternalEvoLogicLanguage.g:294:3: ( rule__EvoAbstractOneParameterTerm__Alternatives )
            // InternalEvoLogicLanguage.g:294:4: rule__EvoAbstractOneParameterTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoAbstractOneParameterTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoAbstractOneParameterTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoAbstractOneParameterTerm"


    // $ANTLR start "rule__EvoOr__Alternatives_1_1"
    // InternalEvoLogicLanguage.g:302:1: rule__EvoOr__Alternatives_1_1 : ( ( 'or' ) | ( '||' ) );
    public final void rule__EvoOr__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:306:1: ( ( 'or' ) | ( '||' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEvoLogicLanguage.g:307:2: ( 'or' )
                    {
                    // InternalEvoLogicLanguage.g:307:2: ( 'or' )
                    // InternalEvoLogicLanguage.g:308:3: 'or'
                    {
                     before(grammarAccess.getEvoOrAccess().getOrKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEvoOrAccess().getOrKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoLogicLanguage.g:313:2: ( '||' )
                    {
                    // InternalEvoLogicLanguage.g:313:2: ( '||' )
                    // InternalEvoLogicLanguage.g:314:3: '||'
                    {
                     before(grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1_1()); 

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
    // $ANTLR end "rule__EvoOr__Alternatives_1_1"


    // $ANTLR start "rule__EvoAnd__Alternatives_1_1"
    // InternalEvoLogicLanguage.g:323:1: rule__EvoAnd__Alternatives_1_1 : ( ( 'and' ) | ( '&&' ) );
    public final void rule__EvoAnd__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:327:1: ( ( 'and' ) | ( '&&' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvoLogicLanguage.g:328:2: ( 'and' )
                    {
                    // InternalEvoLogicLanguage.g:328:2: ( 'and' )
                    // InternalEvoLogicLanguage.g:329:3: 'and'
                    {
                     before(grammarAccess.getEvoAndAccess().getAndKeyword_1_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEvoAndAccess().getAndKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoLogicLanguage.g:334:2: ( '&&' )
                    {
                    // InternalEvoLogicLanguage.g:334:2: ( '&&' )
                    // InternalEvoLogicLanguage.g:335:3: '&&'
                    {
                     before(grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1_1()); 

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
    // $ANTLR end "rule__EvoAnd__Alternatives_1_1"


    // $ANTLR start "rule__EvoAbstractOneParameterTerm__Alternatives"
    // InternalEvoLogicLanguage.g:344:1: rule__EvoAbstractOneParameterTerm__Alternatives : ( ( ruleEvoVariableTerm ) | ( ( rule__EvoAbstractOneParameterTerm__Group_1__0 ) ) );
    public final void rule__EvoAbstractOneParameterTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:348:1: ( ( ruleEvoVariableTerm ) | ( ( rule__EvoAbstractOneParameterTerm__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvoLogicLanguage.g:349:2: ( ruleEvoVariableTerm )
                    {
                    // InternalEvoLogicLanguage.g:349:2: ( ruleEvoVariableTerm )
                    // InternalEvoLogicLanguage.g:350:3: ruleEvoVariableTerm
                    {
                     before(grammarAccess.getEvoAbstractOneParameterTermAccess().getEvoVariableTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoVariableTerm();

                    state._fsp--;

                     after(grammarAccess.getEvoAbstractOneParameterTermAccess().getEvoVariableTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoLogicLanguage.g:355:2: ( ( rule__EvoAbstractOneParameterTerm__Group_1__0 ) )
                    {
                    // InternalEvoLogicLanguage.g:355:2: ( ( rule__EvoAbstractOneParameterTerm__Group_1__0 ) )
                    // InternalEvoLogicLanguage.g:356:3: ( rule__EvoAbstractOneParameterTerm__Group_1__0 )
                    {
                     before(grammarAccess.getEvoAbstractOneParameterTermAccess().getGroup_1()); 
                    // InternalEvoLogicLanguage.g:357:3: ( rule__EvoAbstractOneParameterTerm__Group_1__0 )
                    // InternalEvoLogicLanguage.g:357:4: rule__EvoAbstractOneParameterTerm__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoAbstractOneParameterTerm__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoAbstractOneParameterTermAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EvoAbstractOneParameterTerm__Alternatives"


    // $ANTLR start "rule__CommandDocument__Group__0"
    // InternalEvoLogicLanguage.g:365:1: rule__CommandDocument__Group__0 : rule__CommandDocument__Group__0__Impl rule__CommandDocument__Group__1 ;
    public final void rule__CommandDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:369:1: ( rule__CommandDocument__Group__0__Impl rule__CommandDocument__Group__1 )
            // InternalEvoLogicLanguage.g:370:2: rule__CommandDocument__Group__0__Impl rule__CommandDocument__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CommandDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandDocument__Group__1();

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
    // $ANTLR end "rule__CommandDocument__Group__0"


    // $ANTLR start "rule__CommandDocument__Group__0__Impl"
    // InternalEvoLogicLanguage.g:377:1: rule__CommandDocument__Group__0__Impl : ( ( rule__CommandDocument__ImportsAssignment_0 ) ) ;
    public final void rule__CommandDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:381:1: ( ( ( rule__CommandDocument__ImportsAssignment_0 ) ) )
            // InternalEvoLogicLanguage.g:382:1: ( ( rule__CommandDocument__ImportsAssignment_0 ) )
            {
            // InternalEvoLogicLanguage.g:382:1: ( ( rule__CommandDocument__ImportsAssignment_0 ) )
            // InternalEvoLogicLanguage.g:383:2: ( rule__CommandDocument__ImportsAssignment_0 )
            {
             before(grammarAccess.getCommandDocumentAccess().getImportsAssignment_0()); 
            // InternalEvoLogicLanguage.g:384:2: ( rule__CommandDocument__ImportsAssignment_0 )
            // InternalEvoLogicLanguage.g:384:3: rule__CommandDocument__ImportsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandDocument__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandDocumentAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDocument__Group__0__Impl"


    // $ANTLR start "rule__CommandDocument__Group__1"
    // InternalEvoLogicLanguage.g:392:1: rule__CommandDocument__Group__1 : rule__CommandDocument__Group__1__Impl ;
    public final void rule__CommandDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:396:1: ( rule__CommandDocument__Group__1__Impl )
            // InternalEvoLogicLanguage.g:397:2: rule__CommandDocument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandDocument__Group__1__Impl();

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
    // $ANTLR end "rule__CommandDocument__Group__1"


    // $ANTLR start "rule__CommandDocument__Group__1__Impl"
    // InternalEvoLogicLanguage.g:403:1: rule__CommandDocument__Group__1__Impl : ( ( rule__CommandDocument__FormulaAssignment_1 ) ) ;
    public final void rule__CommandDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:407:1: ( ( ( rule__CommandDocument__FormulaAssignment_1 ) ) )
            // InternalEvoLogicLanguage.g:408:1: ( ( rule__CommandDocument__FormulaAssignment_1 ) )
            {
            // InternalEvoLogicLanguage.g:408:1: ( ( rule__CommandDocument__FormulaAssignment_1 ) )
            // InternalEvoLogicLanguage.g:409:2: ( rule__CommandDocument__FormulaAssignment_1 )
            {
             before(grammarAccess.getCommandDocumentAccess().getFormulaAssignment_1()); 
            // InternalEvoLogicLanguage.g:410:2: ( rule__CommandDocument__FormulaAssignment_1 )
            // InternalEvoLogicLanguage.g:410:3: rule__CommandDocument__FormulaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandDocument__FormulaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandDocumentAccess().getFormulaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDocument__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalEvoLogicLanguage.g:419:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:423:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalEvoLogicLanguage.g:424:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalEvoLogicLanguage.g:431:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:435:1: ( ( 'import' ) )
            // InternalEvoLogicLanguage.g:436:1: ( 'import' )
            {
            // InternalEvoLogicLanguage.g:436:1: ( 'import' )
            // InternalEvoLogicLanguage.g:437:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalEvoLogicLanguage.g:446:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:450:1: ( rule__Import__Group__1__Impl )
            // InternalEvoLogicLanguage.g:451:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalEvoLogicLanguage.g:457:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:461:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalEvoLogicLanguage.g:462:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalEvoLogicLanguage.g:462:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalEvoLogicLanguage.g:463:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalEvoLogicLanguage.g:464:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalEvoLogicLanguage.g:464:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__EvoFormula__Group__0"
    // InternalEvoLogicLanguage.g:473:1: rule__EvoFormula__Group__0 : rule__EvoFormula__Group__0__Impl rule__EvoFormula__Group__1 ;
    public final void rule__EvoFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:477:1: ( rule__EvoFormula__Group__0__Impl rule__EvoFormula__Group__1 )
            // InternalEvoLogicLanguage.g:478:2: rule__EvoFormula__Group__0__Impl rule__EvoFormula__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group__1();

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
    // $ANTLR end "rule__EvoFormula__Group__0"


    // $ANTLR start "rule__EvoFormula__Group__0__Impl"
    // InternalEvoLogicLanguage.g:485:1: rule__EvoFormula__Group__0__Impl : ( 'formula' ) ;
    public final void rule__EvoFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:489:1: ( ( 'formula' ) )
            // InternalEvoLogicLanguage.g:490:1: ( 'formula' )
            {
            // InternalEvoLogicLanguage.g:490:1: ( 'formula' )
            // InternalEvoLogicLanguage.g:491:2: 'formula'
            {
             before(grammarAccess.getEvoFormulaAccess().getFormulaKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getFormulaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group__0__Impl"


    // $ANTLR start "rule__EvoFormula__Group__1"
    // InternalEvoLogicLanguage.g:500:1: rule__EvoFormula__Group__1 : rule__EvoFormula__Group__1__Impl rule__EvoFormula__Group__2 ;
    public final void rule__EvoFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:504:1: ( rule__EvoFormula__Group__1__Impl rule__EvoFormula__Group__2 )
            // InternalEvoLogicLanguage.g:505:2: rule__EvoFormula__Group__1__Impl rule__EvoFormula__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EvoFormula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group__2();

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
    // $ANTLR end "rule__EvoFormula__Group__1"


    // $ANTLR start "rule__EvoFormula__Group__1__Impl"
    // InternalEvoLogicLanguage.g:512:1: rule__EvoFormula__Group__1__Impl : ( '{' ) ;
    public final void rule__EvoFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:516:1: ( ( '{' ) )
            // InternalEvoLogicLanguage.g:517:1: ( '{' )
            {
            // InternalEvoLogicLanguage.g:517:1: ( '{' )
            // InternalEvoLogicLanguage.g:518:2: '{'
            {
             before(grammarAccess.getEvoFormulaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group__1__Impl"


    // $ANTLR start "rule__EvoFormula__Group__2"
    // InternalEvoLogicLanguage.g:527:1: rule__EvoFormula__Group__2 : rule__EvoFormula__Group__2__Impl rule__EvoFormula__Group__3 ;
    public final void rule__EvoFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:531:1: ( rule__EvoFormula__Group__2__Impl rule__EvoFormula__Group__3 )
            // InternalEvoLogicLanguage.g:532:2: rule__EvoFormula__Group__2__Impl rule__EvoFormula__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__EvoFormula__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group__3();

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
    // $ANTLR end "rule__EvoFormula__Group__2"


    // $ANTLR start "rule__EvoFormula__Group__2__Impl"
    // InternalEvoLogicLanguage.g:539:1: rule__EvoFormula__Group__2__Impl : ( ( rule__EvoFormula__Group_2__0 )? ) ;
    public final void rule__EvoFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:543:1: ( ( ( rule__EvoFormula__Group_2__0 )? ) )
            // InternalEvoLogicLanguage.g:544:1: ( ( rule__EvoFormula__Group_2__0 )? )
            {
            // InternalEvoLogicLanguage.g:544:1: ( ( rule__EvoFormula__Group_2__0 )? )
            // InternalEvoLogicLanguage.g:545:2: ( rule__EvoFormula__Group_2__0 )?
            {
             before(grammarAccess.getEvoFormulaAccess().getGroup_2()); 
            // InternalEvoLogicLanguage.g:546:2: ( rule__EvoFormula__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoLogicLanguage.g:546:3: rule__EvoFormula__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFormula__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFormulaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group__2__Impl"


    // $ANTLR start "rule__EvoFormula__Group__3"
    // InternalEvoLogicLanguage.g:554:1: rule__EvoFormula__Group__3 : rule__EvoFormula__Group__3__Impl rule__EvoFormula__Group__4 ;
    public final void rule__EvoFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:558:1: ( rule__EvoFormula__Group__3__Impl rule__EvoFormula__Group__4 )
            // InternalEvoLogicLanguage.g:559:2: rule__EvoFormula__Group__3__Impl rule__EvoFormula__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__EvoFormula__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group__4();

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
    // $ANTLR end "rule__EvoFormula__Group__3"


    // $ANTLR start "rule__EvoFormula__Group__3__Impl"
    // InternalEvoLogicLanguage.g:566:1: rule__EvoFormula__Group__3__Impl : ( 'term' ) ;
    public final void rule__EvoFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:570:1: ( ( 'term' ) )
            // InternalEvoLogicLanguage.g:571:1: ( 'term' )
            {
            // InternalEvoLogicLanguage.g:571:1: ( 'term' )
            // InternalEvoLogicLanguage.g:572:2: 'term'
            {
             before(grammarAccess.getEvoFormulaAccess().getTermKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getTermKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group__3__Impl"


    // $ANTLR start "rule__EvoFormula__Group__4"
    // InternalEvoLogicLanguage.g:581:1: rule__EvoFormula__Group__4 : rule__EvoFormula__Group__4__Impl rule__EvoFormula__Group__5 ;
    public final void rule__EvoFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:585:1: ( rule__EvoFormula__Group__4__Impl rule__EvoFormula__Group__5 )
            // InternalEvoLogicLanguage.g:586:2: rule__EvoFormula__Group__4__Impl rule__EvoFormula__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__EvoFormula__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group__5();

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
    // $ANTLR end "rule__EvoFormula__Group__4"


    // $ANTLR start "rule__EvoFormula__Group__4__Impl"
    // InternalEvoLogicLanguage.g:593:1: rule__EvoFormula__Group__4__Impl : ( ( rule__EvoFormula__TermAssignment_4 ) ) ;
    public final void rule__EvoFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:597:1: ( ( ( rule__EvoFormula__TermAssignment_4 ) ) )
            // InternalEvoLogicLanguage.g:598:1: ( ( rule__EvoFormula__TermAssignment_4 ) )
            {
            // InternalEvoLogicLanguage.g:598:1: ( ( rule__EvoFormula__TermAssignment_4 ) )
            // InternalEvoLogicLanguage.g:599:2: ( rule__EvoFormula__TermAssignment_4 )
            {
             before(grammarAccess.getEvoFormulaAccess().getTermAssignment_4()); 
            // InternalEvoLogicLanguage.g:600:2: ( rule__EvoFormula__TermAssignment_4 )
            // InternalEvoLogicLanguage.g:600:3: rule__EvoFormula__TermAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EvoFormula__TermAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEvoFormulaAccess().getTermAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group__4__Impl"


    // $ANTLR start "rule__EvoFormula__Group__5"
    // InternalEvoLogicLanguage.g:608:1: rule__EvoFormula__Group__5 : rule__EvoFormula__Group__5__Impl ;
    public final void rule__EvoFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:612:1: ( rule__EvoFormula__Group__5__Impl )
            // InternalEvoLogicLanguage.g:613:2: rule__EvoFormula__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group__5__Impl();

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
    // $ANTLR end "rule__EvoFormula__Group__5"


    // $ANTLR start "rule__EvoFormula__Group__5__Impl"
    // InternalEvoLogicLanguage.g:619:1: rule__EvoFormula__Group__5__Impl : ( '}' ) ;
    public final void rule__EvoFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:623:1: ( ( '}' ) )
            // InternalEvoLogicLanguage.g:624:1: ( '}' )
            {
            // InternalEvoLogicLanguage.g:624:1: ( '}' )
            // InternalEvoLogicLanguage.g:625:2: '}'
            {
             before(grammarAccess.getEvoFormulaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group__5__Impl"


    // $ANTLR start "rule__EvoFormula__Group_2__0"
    // InternalEvoLogicLanguage.g:635:1: rule__EvoFormula__Group_2__0 : rule__EvoFormula__Group_2__0__Impl rule__EvoFormula__Group_2__1 ;
    public final void rule__EvoFormula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:639:1: ( rule__EvoFormula__Group_2__0__Impl rule__EvoFormula__Group_2__1 )
            // InternalEvoLogicLanguage.g:640:2: rule__EvoFormula__Group_2__0__Impl rule__EvoFormula__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoFormula__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group_2__1();

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
    // $ANTLR end "rule__EvoFormula__Group_2__0"


    // $ANTLR start "rule__EvoFormula__Group_2__0__Impl"
    // InternalEvoLogicLanguage.g:647:1: rule__EvoFormula__Group_2__0__Impl : ( 'variables' ) ;
    public final void rule__EvoFormula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:651:1: ( ( 'variables' ) )
            // InternalEvoLogicLanguage.g:652:1: ( 'variables' )
            {
            // InternalEvoLogicLanguage.g:652:1: ( 'variables' )
            // InternalEvoLogicLanguage.g:653:2: 'variables'
            {
             before(grammarAccess.getEvoFormulaAccess().getVariablesKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getVariablesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group_2__0__Impl"


    // $ANTLR start "rule__EvoFormula__Group_2__1"
    // InternalEvoLogicLanguage.g:662:1: rule__EvoFormula__Group_2__1 : rule__EvoFormula__Group_2__1__Impl rule__EvoFormula__Group_2__2 ;
    public final void rule__EvoFormula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:666:1: ( rule__EvoFormula__Group_2__1__Impl rule__EvoFormula__Group_2__2 )
            // InternalEvoLogicLanguage.g:667:2: rule__EvoFormula__Group_2__1__Impl rule__EvoFormula__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__EvoFormula__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group_2__2();

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
    // $ANTLR end "rule__EvoFormula__Group_2__1"


    // $ANTLR start "rule__EvoFormula__Group_2__1__Impl"
    // InternalEvoLogicLanguage.g:674:1: rule__EvoFormula__Group_2__1__Impl : ( '{' ) ;
    public final void rule__EvoFormula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:678:1: ( ( '{' ) )
            // InternalEvoLogicLanguage.g:679:1: ( '{' )
            {
            // InternalEvoLogicLanguage.g:679:1: ( '{' )
            // InternalEvoLogicLanguage.g:680:2: '{'
            {
             before(grammarAccess.getEvoFormulaAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group_2__1__Impl"


    // $ANTLR start "rule__EvoFormula__Group_2__2"
    // InternalEvoLogicLanguage.g:689:1: rule__EvoFormula__Group_2__2 : rule__EvoFormula__Group_2__2__Impl rule__EvoFormula__Group_2__3 ;
    public final void rule__EvoFormula__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:693:1: ( rule__EvoFormula__Group_2__2__Impl rule__EvoFormula__Group_2__3 )
            // InternalEvoLogicLanguage.g:694:2: rule__EvoFormula__Group_2__2__Impl rule__EvoFormula__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__EvoFormula__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group_2__3();

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
    // $ANTLR end "rule__EvoFormula__Group_2__2"


    // $ANTLR start "rule__EvoFormula__Group_2__2__Impl"
    // InternalEvoLogicLanguage.g:701:1: rule__EvoFormula__Group_2__2__Impl : ( ( rule__EvoFormula__VariablesAssignment_2_2 ) ) ;
    public final void rule__EvoFormula__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:705:1: ( ( ( rule__EvoFormula__VariablesAssignment_2_2 ) ) )
            // InternalEvoLogicLanguage.g:706:1: ( ( rule__EvoFormula__VariablesAssignment_2_2 ) )
            {
            // InternalEvoLogicLanguage.g:706:1: ( ( rule__EvoFormula__VariablesAssignment_2_2 ) )
            // InternalEvoLogicLanguage.g:707:2: ( rule__EvoFormula__VariablesAssignment_2_2 )
            {
             before(grammarAccess.getEvoFormulaAccess().getVariablesAssignment_2_2()); 
            // InternalEvoLogicLanguage.g:708:2: ( rule__EvoFormula__VariablesAssignment_2_2 )
            // InternalEvoLogicLanguage.g:708:3: rule__EvoFormula__VariablesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoFormula__VariablesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoFormulaAccess().getVariablesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group_2__2__Impl"


    // $ANTLR start "rule__EvoFormula__Group_2__3"
    // InternalEvoLogicLanguage.g:716:1: rule__EvoFormula__Group_2__3 : rule__EvoFormula__Group_2__3__Impl rule__EvoFormula__Group_2__4 ;
    public final void rule__EvoFormula__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:720:1: ( rule__EvoFormula__Group_2__3__Impl rule__EvoFormula__Group_2__4 )
            // InternalEvoLogicLanguage.g:721:2: rule__EvoFormula__Group_2__3__Impl rule__EvoFormula__Group_2__4
            {
            pushFollow(FOLLOW_10);
            rule__EvoFormula__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group_2__4();

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
    // $ANTLR end "rule__EvoFormula__Group_2__3"


    // $ANTLR start "rule__EvoFormula__Group_2__3__Impl"
    // InternalEvoLogicLanguage.g:728:1: rule__EvoFormula__Group_2__3__Impl : ( ( rule__EvoFormula__Group_2_3__0 )* ) ;
    public final void rule__EvoFormula__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:732:1: ( ( ( rule__EvoFormula__Group_2_3__0 )* ) )
            // InternalEvoLogicLanguage.g:733:1: ( ( rule__EvoFormula__Group_2_3__0 )* )
            {
            // InternalEvoLogicLanguage.g:733:1: ( ( rule__EvoFormula__Group_2_3__0 )* )
            // InternalEvoLogicLanguage.g:734:2: ( rule__EvoFormula__Group_2_3__0 )*
            {
             before(grammarAccess.getEvoFormulaAccess().getGroup_2_3()); 
            // InternalEvoLogicLanguage.g:735:2: ( rule__EvoFormula__Group_2_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvoLogicLanguage.g:735:3: rule__EvoFormula__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EvoFormula__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEvoFormulaAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group_2__3__Impl"


    // $ANTLR start "rule__EvoFormula__Group_2__4"
    // InternalEvoLogicLanguage.g:743:1: rule__EvoFormula__Group_2__4 : rule__EvoFormula__Group_2__4__Impl ;
    public final void rule__EvoFormula__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:747:1: ( rule__EvoFormula__Group_2__4__Impl )
            // InternalEvoLogicLanguage.g:748:2: rule__EvoFormula__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group_2__4__Impl();

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
    // $ANTLR end "rule__EvoFormula__Group_2__4"


    // $ANTLR start "rule__EvoFormula__Group_2__4__Impl"
    // InternalEvoLogicLanguage.g:754:1: rule__EvoFormula__Group_2__4__Impl : ( '}' ) ;
    public final void rule__EvoFormula__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:758:1: ( ( '}' ) )
            // InternalEvoLogicLanguage.g:759:1: ( '}' )
            {
            // InternalEvoLogicLanguage.g:759:1: ( '}' )
            // InternalEvoLogicLanguage.g:760:2: '}'
            {
             before(grammarAccess.getEvoFormulaAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group_2__4__Impl"


    // $ANTLR start "rule__EvoFormula__Group_2_3__0"
    // InternalEvoLogicLanguage.g:770:1: rule__EvoFormula__Group_2_3__0 : rule__EvoFormula__Group_2_3__0__Impl rule__EvoFormula__Group_2_3__1 ;
    public final void rule__EvoFormula__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:774:1: ( rule__EvoFormula__Group_2_3__0__Impl rule__EvoFormula__Group_2_3__1 )
            // InternalEvoLogicLanguage.g:775:2: rule__EvoFormula__Group_2_3__0__Impl rule__EvoFormula__Group_2_3__1
            {
            pushFollow(FOLLOW_9);
            rule__EvoFormula__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group_2_3__1();

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
    // $ANTLR end "rule__EvoFormula__Group_2_3__0"


    // $ANTLR start "rule__EvoFormula__Group_2_3__0__Impl"
    // InternalEvoLogicLanguage.g:782:1: rule__EvoFormula__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__EvoFormula__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:786:1: ( ( ',' ) )
            // InternalEvoLogicLanguage.g:787:1: ( ',' )
            {
            // InternalEvoLogicLanguage.g:787:1: ( ',' )
            // InternalEvoLogicLanguage.g:788:2: ','
            {
             before(grammarAccess.getEvoFormulaAccess().getCommaKeyword_2_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvoFormulaAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group_2_3__0__Impl"


    // $ANTLR start "rule__EvoFormula__Group_2_3__1"
    // InternalEvoLogicLanguage.g:797:1: rule__EvoFormula__Group_2_3__1 : rule__EvoFormula__Group_2_3__1__Impl ;
    public final void rule__EvoFormula__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:801:1: ( rule__EvoFormula__Group_2_3__1__Impl )
            // InternalEvoLogicLanguage.g:802:2: rule__EvoFormula__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFormula__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__EvoFormula__Group_2_3__1"


    // $ANTLR start "rule__EvoFormula__Group_2_3__1__Impl"
    // InternalEvoLogicLanguage.g:808:1: rule__EvoFormula__Group_2_3__1__Impl : ( ( rule__EvoFormula__VariablesAssignment_2_3_1 ) ) ;
    public final void rule__EvoFormula__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:812:1: ( ( ( rule__EvoFormula__VariablesAssignment_2_3_1 ) ) )
            // InternalEvoLogicLanguage.g:813:1: ( ( rule__EvoFormula__VariablesAssignment_2_3_1 ) )
            {
            // InternalEvoLogicLanguage.g:813:1: ( ( rule__EvoFormula__VariablesAssignment_2_3_1 ) )
            // InternalEvoLogicLanguage.g:814:2: ( rule__EvoFormula__VariablesAssignment_2_3_1 )
            {
             before(grammarAccess.getEvoFormulaAccess().getVariablesAssignment_2_3_1()); 
            // InternalEvoLogicLanguage.g:815:2: ( rule__EvoFormula__VariablesAssignment_2_3_1 )
            // InternalEvoLogicLanguage.g:815:3: rule__EvoFormula__VariablesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoFormula__VariablesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoFormulaAccess().getVariablesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__Group_2_3__1__Impl"


    // $ANTLR start "rule__EvoVariableTerm__Group__0"
    // InternalEvoLogicLanguage.g:824:1: rule__EvoVariableTerm__Group__0 : rule__EvoVariableTerm__Group__0__Impl rule__EvoVariableTerm__Group__1 ;
    public final void rule__EvoVariableTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:828:1: ( rule__EvoVariableTerm__Group__0__Impl rule__EvoVariableTerm__Group__1 )
            // InternalEvoLogicLanguage.g:829:2: rule__EvoVariableTerm__Group__0__Impl rule__EvoVariableTerm__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoVariableTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__Group__1();

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
    // $ANTLR end "rule__EvoVariableTerm__Group__0"


    // $ANTLR start "rule__EvoVariableTerm__Group__0__Impl"
    // InternalEvoLogicLanguage.g:836:1: rule__EvoVariableTerm__Group__0__Impl : ( 'EvoVariableTerm' ) ;
    public final void rule__EvoVariableTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:840:1: ( ( 'EvoVariableTerm' ) )
            // InternalEvoLogicLanguage.g:841:1: ( 'EvoVariableTerm' )
            {
            // InternalEvoLogicLanguage.g:841:1: ( 'EvoVariableTerm' )
            // InternalEvoLogicLanguage.g:842:2: 'EvoVariableTerm'
            {
             before(grammarAccess.getEvoVariableTermAccess().getEvoVariableTermKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEvoVariableTermAccess().getEvoVariableTermKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__Group__0__Impl"


    // $ANTLR start "rule__EvoVariableTerm__Group__1"
    // InternalEvoLogicLanguage.g:851:1: rule__EvoVariableTerm__Group__1 : rule__EvoVariableTerm__Group__1__Impl rule__EvoVariableTerm__Group__2 ;
    public final void rule__EvoVariableTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:855:1: ( rule__EvoVariableTerm__Group__1__Impl rule__EvoVariableTerm__Group__2 )
            // InternalEvoLogicLanguage.g:856:2: rule__EvoVariableTerm__Group__1__Impl rule__EvoVariableTerm__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EvoVariableTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__Group__2();

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
    // $ANTLR end "rule__EvoVariableTerm__Group__1"


    // $ANTLR start "rule__EvoVariableTerm__Group__1__Impl"
    // InternalEvoLogicLanguage.g:863:1: rule__EvoVariableTerm__Group__1__Impl : ( '{' ) ;
    public final void rule__EvoVariableTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:867:1: ( ( '{' ) )
            // InternalEvoLogicLanguage.g:868:1: ( '{' )
            {
            // InternalEvoLogicLanguage.g:868:1: ( '{' )
            // InternalEvoLogicLanguage.g:869:2: '{'
            {
             before(grammarAccess.getEvoVariableTermAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvoVariableTermAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__Group__1__Impl"


    // $ANTLR start "rule__EvoVariableTerm__Group__2"
    // InternalEvoLogicLanguage.g:878:1: rule__EvoVariableTerm__Group__2 : rule__EvoVariableTerm__Group__2__Impl rule__EvoVariableTerm__Group__3 ;
    public final void rule__EvoVariableTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:882:1: ( rule__EvoVariableTerm__Group__2__Impl rule__EvoVariableTerm__Group__3 )
            // InternalEvoLogicLanguage.g:883:2: rule__EvoVariableTerm__Group__2__Impl rule__EvoVariableTerm__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EvoVariableTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__Group__3();

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
    // $ANTLR end "rule__EvoVariableTerm__Group__2"


    // $ANTLR start "rule__EvoVariableTerm__Group__2__Impl"
    // InternalEvoLogicLanguage.g:890:1: rule__EvoVariableTerm__Group__2__Impl : ( 'variable' ) ;
    public final void rule__EvoVariableTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:894:1: ( ( 'variable' ) )
            // InternalEvoLogicLanguage.g:895:1: ( 'variable' )
            {
            // InternalEvoLogicLanguage.g:895:1: ( 'variable' )
            // InternalEvoLogicLanguage.g:896:2: 'variable'
            {
             before(grammarAccess.getEvoVariableTermAccess().getVariableKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvoVariableTermAccess().getVariableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__Group__2__Impl"


    // $ANTLR start "rule__EvoVariableTerm__Group__3"
    // InternalEvoLogicLanguage.g:905:1: rule__EvoVariableTerm__Group__3 : rule__EvoVariableTerm__Group__3__Impl rule__EvoVariableTerm__Group__4 ;
    public final void rule__EvoVariableTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:909:1: ( rule__EvoVariableTerm__Group__3__Impl rule__EvoVariableTerm__Group__4 )
            // InternalEvoLogicLanguage.g:910:2: rule__EvoVariableTerm__Group__3__Impl rule__EvoVariableTerm__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__EvoVariableTerm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__Group__4();

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
    // $ANTLR end "rule__EvoVariableTerm__Group__3"


    // $ANTLR start "rule__EvoVariableTerm__Group__3__Impl"
    // InternalEvoLogicLanguage.g:917:1: rule__EvoVariableTerm__Group__3__Impl : ( ( rule__EvoVariableTerm__VariableAssignment_3 ) ) ;
    public final void rule__EvoVariableTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:921:1: ( ( ( rule__EvoVariableTerm__VariableAssignment_3 ) ) )
            // InternalEvoLogicLanguage.g:922:1: ( ( rule__EvoVariableTerm__VariableAssignment_3 ) )
            {
            // InternalEvoLogicLanguage.g:922:1: ( ( rule__EvoVariableTerm__VariableAssignment_3 ) )
            // InternalEvoLogicLanguage.g:923:2: ( rule__EvoVariableTerm__VariableAssignment_3 )
            {
             before(grammarAccess.getEvoVariableTermAccess().getVariableAssignment_3()); 
            // InternalEvoLogicLanguage.g:924:2: ( rule__EvoVariableTerm__VariableAssignment_3 )
            // InternalEvoLogicLanguage.g:924:3: rule__EvoVariableTerm__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableTermAccess().getVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__Group__3__Impl"


    // $ANTLR start "rule__EvoVariableTerm__Group__4"
    // InternalEvoLogicLanguage.g:932:1: rule__EvoVariableTerm__Group__4 : rule__EvoVariableTerm__Group__4__Impl ;
    public final void rule__EvoVariableTerm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:936:1: ( rule__EvoVariableTerm__Group__4__Impl )
            // InternalEvoLogicLanguage.g:937:2: rule__EvoVariableTerm__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__Group__4__Impl();

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
    // $ANTLR end "rule__EvoVariableTerm__Group__4"


    // $ANTLR start "rule__EvoVariableTerm__Group__4__Impl"
    // InternalEvoLogicLanguage.g:943:1: rule__EvoVariableTerm__Group__4__Impl : ( '}' ) ;
    public final void rule__EvoVariableTerm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:947:1: ( ( '}' ) )
            // InternalEvoLogicLanguage.g:948:1: ( '}' )
            {
            // InternalEvoLogicLanguage.g:948:1: ( '}' )
            // InternalEvoLogicLanguage.g:949:2: '}'
            {
             before(grammarAccess.getEvoVariableTermAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvoVariableTermAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__Group__4__Impl"


    // $ANTLR start "rule__EvoArbitratyFeatureVariable__Group__0"
    // InternalEvoLogicLanguage.g:959:1: rule__EvoArbitratyFeatureVariable__Group__0 : rule__EvoArbitratyFeatureVariable__Group__0__Impl rule__EvoArbitratyFeatureVariable__Group__1 ;
    public final void rule__EvoArbitratyFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:963:1: ( rule__EvoArbitratyFeatureVariable__Group__0__Impl rule__EvoArbitratyFeatureVariable__Group__1 )
            // InternalEvoLogicLanguage.g:964:2: rule__EvoArbitratyFeatureVariable__Group__0__Impl rule__EvoArbitratyFeatureVariable__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EvoArbitratyFeatureVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoArbitratyFeatureVariable__Group__1();

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
    // $ANTLR end "rule__EvoArbitratyFeatureVariable__Group__0"


    // $ANTLR start "rule__EvoArbitratyFeatureVariable__Group__0__Impl"
    // InternalEvoLogicLanguage.g:971:1: rule__EvoArbitratyFeatureVariable__Group__0__Impl : ( 'afeature' ) ;
    public final void rule__EvoArbitratyFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:975:1: ( ( 'afeature' ) )
            // InternalEvoLogicLanguage.g:976:1: ( 'afeature' )
            {
            // InternalEvoLogicLanguage.g:976:1: ( 'afeature' )
            // InternalEvoLogicLanguage.g:977:2: 'afeature'
            {
             before(grammarAccess.getEvoArbitratyFeatureVariableAccess().getAfeatureKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvoArbitratyFeatureVariableAccess().getAfeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoArbitratyFeatureVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoArbitratyFeatureVariable__Group__1"
    // InternalEvoLogicLanguage.g:986:1: rule__EvoArbitratyFeatureVariable__Group__1 : rule__EvoArbitratyFeatureVariable__Group__1__Impl ;
    public final void rule__EvoArbitratyFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:990:1: ( rule__EvoArbitratyFeatureVariable__Group__1__Impl )
            // InternalEvoLogicLanguage.g:991:2: rule__EvoArbitratyFeatureVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoArbitratyFeatureVariable__Group__1__Impl();

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
    // $ANTLR end "rule__EvoArbitratyFeatureVariable__Group__1"


    // $ANTLR start "rule__EvoArbitratyFeatureVariable__Group__1__Impl"
    // InternalEvoLogicLanguage.g:997:1: rule__EvoArbitratyFeatureVariable__Group__1__Impl : ( ( rule__EvoArbitratyFeatureVariable__FeatureAssignment_1 ) ) ;
    public final void rule__EvoArbitratyFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1001:1: ( ( ( rule__EvoArbitratyFeatureVariable__FeatureAssignment_1 ) ) )
            // InternalEvoLogicLanguage.g:1002:1: ( ( rule__EvoArbitratyFeatureVariable__FeatureAssignment_1 ) )
            {
            // InternalEvoLogicLanguage.g:1002:1: ( ( rule__EvoArbitratyFeatureVariable__FeatureAssignment_1 ) )
            // InternalEvoLogicLanguage.g:1003:2: ( rule__EvoArbitratyFeatureVariable__FeatureAssignment_1 )
            {
             before(grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureAssignment_1()); 
            // InternalEvoLogicLanguage.g:1004:2: ( rule__EvoArbitratyFeatureVariable__FeatureAssignment_1 )
            // InternalEvoLogicLanguage.g:1004:3: rule__EvoArbitratyFeatureVariable__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoArbitratyFeatureVariable__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoArbitratyFeatureVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoOr__Group__0"
    // InternalEvoLogicLanguage.g:1013:1: rule__EvoOr__Group__0 : rule__EvoOr__Group__0__Impl rule__EvoOr__Group__1 ;
    public final void rule__EvoOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1017:1: ( rule__EvoOr__Group__0__Impl rule__EvoOr__Group__1 )
            // InternalEvoLogicLanguage.g:1018:2: rule__EvoOr__Group__0__Impl rule__EvoOr__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EvoOr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOr__Group__1();

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
    // $ANTLR end "rule__EvoOr__Group__0"


    // $ANTLR start "rule__EvoOr__Group__0__Impl"
    // InternalEvoLogicLanguage.g:1025:1: rule__EvoOr__Group__0__Impl : ( ruleEvoAnd ) ;
    public final void rule__EvoOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1029:1: ( ( ruleEvoAnd ) )
            // InternalEvoLogicLanguage.g:1030:1: ( ruleEvoAnd )
            {
            // InternalEvoLogicLanguage.g:1030:1: ( ruleEvoAnd )
            // InternalEvoLogicLanguage.g:1031:2: ruleEvoAnd
            {
             before(grammarAccess.getEvoOrAccess().getEvoAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoAnd();

            state._fsp--;

             after(grammarAccess.getEvoOrAccess().getEvoAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOr__Group__0__Impl"


    // $ANTLR start "rule__EvoOr__Group__1"
    // InternalEvoLogicLanguage.g:1040:1: rule__EvoOr__Group__1 : rule__EvoOr__Group__1__Impl ;
    public final void rule__EvoOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1044:1: ( rule__EvoOr__Group__1__Impl )
            // InternalEvoLogicLanguage.g:1045:2: rule__EvoOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoOr__Group__1__Impl();

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
    // $ANTLR end "rule__EvoOr__Group__1"


    // $ANTLR start "rule__EvoOr__Group__1__Impl"
    // InternalEvoLogicLanguage.g:1051:1: rule__EvoOr__Group__1__Impl : ( ( rule__EvoOr__Group_1__0 )* ) ;
    public final void rule__EvoOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1055:1: ( ( ( rule__EvoOr__Group_1__0 )* ) )
            // InternalEvoLogicLanguage.g:1056:1: ( ( rule__EvoOr__Group_1__0 )* )
            {
            // InternalEvoLogicLanguage.g:1056:1: ( ( rule__EvoOr__Group_1__0 )* )
            // InternalEvoLogicLanguage.g:1057:2: ( rule__EvoOr__Group_1__0 )*
            {
             before(grammarAccess.getEvoOrAccess().getGroup_1()); 
            // InternalEvoLogicLanguage.g:1058:2: ( rule__EvoOr__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEvoLogicLanguage.g:1058:3: rule__EvoOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EvoOr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEvoOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOr__Group__1__Impl"


    // $ANTLR start "rule__EvoOr__Group_1__0"
    // InternalEvoLogicLanguage.g:1067:1: rule__EvoOr__Group_1__0 : rule__EvoOr__Group_1__0__Impl rule__EvoOr__Group_1__1 ;
    public final void rule__EvoOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1071:1: ( rule__EvoOr__Group_1__0__Impl rule__EvoOr__Group_1__1 )
            // InternalEvoLogicLanguage.g:1072:2: rule__EvoOr__Group_1__0__Impl rule__EvoOr__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__EvoOr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOr__Group_1__1();

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
    // $ANTLR end "rule__EvoOr__Group_1__0"


    // $ANTLR start "rule__EvoOr__Group_1__0__Impl"
    // InternalEvoLogicLanguage.g:1079:1: rule__EvoOr__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1083:1: ( ( () ) )
            // InternalEvoLogicLanguage.g:1084:1: ( () )
            {
            // InternalEvoLogicLanguage.g:1084:1: ( () )
            // InternalEvoLogicLanguage.g:1085:2: ()
            {
             before(grammarAccess.getEvoOrAccess().getEvoOrLeftElementAction_1_0()); 
            // InternalEvoLogicLanguage.g:1086:2: ()
            // InternalEvoLogicLanguage.g:1086:3: 
            {
            }

             after(grammarAccess.getEvoOrAccess().getEvoOrLeftElementAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOr__Group_1__0__Impl"


    // $ANTLR start "rule__EvoOr__Group_1__1"
    // InternalEvoLogicLanguage.g:1094:1: rule__EvoOr__Group_1__1 : rule__EvoOr__Group_1__1__Impl rule__EvoOr__Group_1__2 ;
    public final void rule__EvoOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1098:1: ( rule__EvoOr__Group_1__1__Impl rule__EvoOr__Group_1__2 )
            // InternalEvoLogicLanguage.g:1099:2: rule__EvoOr__Group_1__1__Impl rule__EvoOr__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__EvoOr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOr__Group_1__2();

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
    // $ANTLR end "rule__EvoOr__Group_1__1"


    // $ANTLR start "rule__EvoOr__Group_1__1__Impl"
    // InternalEvoLogicLanguage.g:1106:1: rule__EvoOr__Group_1__1__Impl : ( ( rule__EvoOr__Alternatives_1_1 ) ) ;
    public final void rule__EvoOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1110:1: ( ( ( rule__EvoOr__Alternatives_1_1 ) ) )
            // InternalEvoLogicLanguage.g:1111:1: ( ( rule__EvoOr__Alternatives_1_1 ) )
            {
            // InternalEvoLogicLanguage.g:1111:1: ( ( rule__EvoOr__Alternatives_1_1 ) )
            // InternalEvoLogicLanguage.g:1112:2: ( rule__EvoOr__Alternatives_1_1 )
            {
             before(grammarAccess.getEvoOrAccess().getAlternatives_1_1()); 
            // InternalEvoLogicLanguage.g:1113:2: ( rule__EvoOr__Alternatives_1_1 )
            // InternalEvoLogicLanguage.g:1113:3: rule__EvoOr__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoOr__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoOrAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOr__Group_1__1__Impl"


    // $ANTLR start "rule__EvoOr__Group_1__2"
    // InternalEvoLogicLanguage.g:1121:1: rule__EvoOr__Group_1__2 : rule__EvoOr__Group_1__2__Impl ;
    public final void rule__EvoOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1125:1: ( rule__EvoOr__Group_1__2__Impl )
            // InternalEvoLogicLanguage.g:1126:2: rule__EvoOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoOr__Group_1__2__Impl();

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
    // $ANTLR end "rule__EvoOr__Group_1__2"


    // $ANTLR start "rule__EvoOr__Group_1__2__Impl"
    // InternalEvoLogicLanguage.g:1132:1: rule__EvoOr__Group_1__2__Impl : ( ( rule__EvoOr__RightElementAssignment_1_2 ) ) ;
    public final void rule__EvoOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1136:1: ( ( ( rule__EvoOr__RightElementAssignment_1_2 ) ) )
            // InternalEvoLogicLanguage.g:1137:1: ( ( rule__EvoOr__RightElementAssignment_1_2 ) )
            {
            // InternalEvoLogicLanguage.g:1137:1: ( ( rule__EvoOr__RightElementAssignment_1_2 ) )
            // InternalEvoLogicLanguage.g:1138:2: ( rule__EvoOr__RightElementAssignment_1_2 )
            {
             before(grammarAccess.getEvoOrAccess().getRightElementAssignment_1_2()); 
            // InternalEvoLogicLanguage.g:1139:2: ( rule__EvoOr__RightElementAssignment_1_2 )
            // InternalEvoLogicLanguage.g:1139:3: rule__EvoOr__RightElementAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoOr__RightElementAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoOrAccess().getRightElementAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOr__Group_1__2__Impl"


    // $ANTLR start "rule__EvoAnd__Group__0"
    // InternalEvoLogicLanguage.g:1148:1: rule__EvoAnd__Group__0 : rule__EvoAnd__Group__0__Impl rule__EvoAnd__Group__1 ;
    public final void rule__EvoAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1152:1: ( rule__EvoAnd__Group__0__Impl rule__EvoAnd__Group__1 )
            // InternalEvoLogicLanguage.g:1153:2: rule__EvoAnd__Group__0__Impl rule__EvoAnd__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EvoAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoAnd__Group__1();

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
    // $ANTLR end "rule__EvoAnd__Group__0"


    // $ANTLR start "rule__EvoAnd__Group__0__Impl"
    // InternalEvoLogicLanguage.g:1160:1: rule__EvoAnd__Group__0__Impl : ( ruleEvoAbstractOneParameterTerm ) ;
    public final void rule__EvoAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1164:1: ( ( ruleEvoAbstractOneParameterTerm ) )
            // InternalEvoLogicLanguage.g:1165:1: ( ruleEvoAbstractOneParameterTerm )
            {
            // InternalEvoLogicLanguage.g:1165:1: ( ruleEvoAbstractOneParameterTerm )
            // InternalEvoLogicLanguage.g:1166:2: ruleEvoAbstractOneParameterTerm
            {
             before(grammarAccess.getEvoAndAccess().getEvoAbstractOneParameterTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoAbstractOneParameterTerm();

            state._fsp--;

             after(grammarAccess.getEvoAndAccess().getEvoAbstractOneParameterTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAnd__Group__0__Impl"


    // $ANTLR start "rule__EvoAnd__Group__1"
    // InternalEvoLogicLanguage.g:1175:1: rule__EvoAnd__Group__1 : rule__EvoAnd__Group__1__Impl ;
    public final void rule__EvoAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1179:1: ( rule__EvoAnd__Group__1__Impl )
            // InternalEvoLogicLanguage.g:1180:2: rule__EvoAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoAnd__Group__1__Impl();

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
    // $ANTLR end "rule__EvoAnd__Group__1"


    // $ANTLR start "rule__EvoAnd__Group__1__Impl"
    // InternalEvoLogicLanguage.g:1186:1: rule__EvoAnd__Group__1__Impl : ( ( rule__EvoAnd__Group_1__0 )* ) ;
    public final void rule__EvoAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1190:1: ( ( ( rule__EvoAnd__Group_1__0 )* ) )
            // InternalEvoLogicLanguage.g:1191:1: ( ( rule__EvoAnd__Group_1__0 )* )
            {
            // InternalEvoLogicLanguage.g:1191:1: ( ( rule__EvoAnd__Group_1__0 )* )
            // InternalEvoLogicLanguage.g:1192:2: ( rule__EvoAnd__Group_1__0 )*
            {
             before(grammarAccess.getEvoAndAccess().getGroup_1()); 
            // InternalEvoLogicLanguage.g:1193:2: ( rule__EvoAnd__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEvoLogicLanguage.g:1193:3: rule__EvoAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__EvoAnd__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEvoAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAnd__Group__1__Impl"


    // $ANTLR start "rule__EvoAnd__Group_1__0"
    // InternalEvoLogicLanguage.g:1202:1: rule__EvoAnd__Group_1__0 : rule__EvoAnd__Group_1__0__Impl rule__EvoAnd__Group_1__1 ;
    public final void rule__EvoAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1206:1: ( rule__EvoAnd__Group_1__0__Impl rule__EvoAnd__Group_1__1 )
            // InternalEvoLogicLanguage.g:1207:2: rule__EvoAnd__Group_1__0__Impl rule__EvoAnd__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__EvoAnd__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoAnd__Group_1__1();

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
    // $ANTLR end "rule__EvoAnd__Group_1__0"


    // $ANTLR start "rule__EvoAnd__Group_1__0__Impl"
    // InternalEvoLogicLanguage.g:1214:1: rule__EvoAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1218:1: ( ( () ) )
            // InternalEvoLogicLanguage.g:1219:1: ( () )
            {
            // InternalEvoLogicLanguage.g:1219:1: ( () )
            // InternalEvoLogicLanguage.g:1220:2: ()
            {
             before(grammarAccess.getEvoAndAccess().getEvoAndLeftElementAction_1_0()); 
            // InternalEvoLogicLanguage.g:1221:2: ()
            // InternalEvoLogicLanguage.g:1221:3: 
            {
            }

             after(grammarAccess.getEvoAndAccess().getEvoAndLeftElementAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAnd__Group_1__0__Impl"


    // $ANTLR start "rule__EvoAnd__Group_1__1"
    // InternalEvoLogicLanguage.g:1229:1: rule__EvoAnd__Group_1__1 : rule__EvoAnd__Group_1__1__Impl rule__EvoAnd__Group_1__2 ;
    public final void rule__EvoAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1233:1: ( rule__EvoAnd__Group_1__1__Impl rule__EvoAnd__Group_1__2 )
            // InternalEvoLogicLanguage.g:1234:2: rule__EvoAnd__Group_1__1__Impl rule__EvoAnd__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__EvoAnd__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoAnd__Group_1__2();

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
    // $ANTLR end "rule__EvoAnd__Group_1__1"


    // $ANTLR start "rule__EvoAnd__Group_1__1__Impl"
    // InternalEvoLogicLanguage.g:1241:1: rule__EvoAnd__Group_1__1__Impl : ( ( rule__EvoAnd__Alternatives_1_1 ) ) ;
    public final void rule__EvoAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1245:1: ( ( ( rule__EvoAnd__Alternatives_1_1 ) ) )
            // InternalEvoLogicLanguage.g:1246:1: ( ( rule__EvoAnd__Alternatives_1_1 ) )
            {
            // InternalEvoLogicLanguage.g:1246:1: ( ( rule__EvoAnd__Alternatives_1_1 ) )
            // InternalEvoLogicLanguage.g:1247:2: ( rule__EvoAnd__Alternatives_1_1 )
            {
             before(grammarAccess.getEvoAndAccess().getAlternatives_1_1()); 
            // InternalEvoLogicLanguage.g:1248:2: ( rule__EvoAnd__Alternatives_1_1 )
            // InternalEvoLogicLanguage.g:1248:3: rule__EvoAnd__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoAnd__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoAndAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAnd__Group_1__1__Impl"


    // $ANTLR start "rule__EvoAnd__Group_1__2"
    // InternalEvoLogicLanguage.g:1256:1: rule__EvoAnd__Group_1__2 : rule__EvoAnd__Group_1__2__Impl ;
    public final void rule__EvoAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1260:1: ( rule__EvoAnd__Group_1__2__Impl )
            // InternalEvoLogicLanguage.g:1261:2: rule__EvoAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoAnd__Group_1__2__Impl();

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
    // $ANTLR end "rule__EvoAnd__Group_1__2"


    // $ANTLR start "rule__EvoAnd__Group_1__2__Impl"
    // InternalEvoLogicLanguage.g:1267:1: rule__EvoAnd__Group_1__2__Impl : ( ( rule__EvoAnd__RightElementAssignment_1_2 ) ) ;
    public final void rule__EvoAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1271:1: ( ( ( rule__EvoAnd__RightElementAssignment_1_2 ) ) )
            // InternalEvoLogicLanguage.g:1272:1: ( ( rule__EvoAnd__RightElementAssignment_1_2 ) )
            {
            // InternalEvoLogicLanguage.g:1272:1: ( ( rule__EvoAnd__RightElementAssignment_1_2 ) )
            // InternalEvoLogicLanguage.g:1273:2: ( rule__EvoAnd__RightElementAssignment_1_2 )
            {
             before(grammarAccess.getEvoAndAccess().getRightElementAssignment_1_2()); 
            // InternalEvoLogicLanguage.g:1274:2: ( rule__EvoAnd__RightElementAssignment_1_2 )
            // InternalEvoLogicLanguage.g:1274:3: rule__EvoAnd__RightElementAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoAnd__RightElementAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoAndAccess().getRightElementAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAnd__Group_1__2__Impl"


    // $ANTLR start "rule__EvoAbstractOneParameterTerm__Group_1__0"
    // InternalEvoLogicLanguage.g:1283:1: rule__EvoAbstractOneParameterTerm__Group_1__0 : rule__EvoAbstractOneParameterTerm__Group_1__0__Impl rule__EvoAbstractOneParameterTerm__Group_1__1 ;
    public final void rule__EvoAbstractOneParameterTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1287:1: ( rule__EvoAbstractOneParameterTerm__Group_1__0__Impl rule__EvoAbstractOneParameterTerm__Group_1__1 )
            // InternalEvoLogicLanguage.g:1288:2: rule__EvoAbstractOneParameterTerm__Group_1__0__Impl rule__EvoAbstractOneParameterTerm__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__EvoAbstractOneParameterTerm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoAbstractOneParameterTerm__Group_1__1();

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
    // $ANTLR end "rule__EvoAbstractOneParameterTerm__Group_1__0"


    // $ANTLR start "rule__EvoAbstractOneParameterTerm__Group_1__0__Impl"
    // InternalEvoLogicLanguage.g:1295:1: rule__EvoAbstractOneParameterTerm__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EvoAbstractOneParameterTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1299:1: ( ( '(' ) )
            // InternalEvoLogicLanguage.g:1300:1: ( '(' )
            {
            // InternalEvoLogicLanguage.g:1300:1: ( '(' )
            // InternalEvoLogicLanguage.g:1301:2: '('
            {
             before(grammarAccess.getEvoAbstractOneParameterTermAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvoAbstractOneParameterTermAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAbstractOneParameterTerm__Group_1__0__Impl"


    // $ANTLR start "rule__EvoAbstractOneParameterTerm__Group_1__1"
    // InternalEvoLogicLanguage.g:1310:1: rule__EvoAbstractOneParameterTerm__Group_1__1 : rule__EvoAbstractOneParameterTerm__Group_1__1__Impl rule__EvoAbstractOneParameterTerm__Group_1__2 ;
    public final void rule__EvoAbstractOneParameterTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1314:1: ( rule__EvoAbstractOneParameterTerm__Group_1__1__Impl rule__EvoAbstractOneParameterTerm__Group_1__2 )
            // InternalEvoLogicLanguage.g:1315:2: rule__EvoAbstractOneParameterTerm__Group_1__1__Impl rule__EvoAbstractOneParameterTerm__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__EvoAbstractOneParameterTerm__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoAbstractOneParameterTerm__Group_1__2();

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
    // $ANTLR end "rule__EvoAbstractOneParameterTerm__Group_1__1"


    // $ANTLR start "rule__EvoAbstractOneParameterTerm__Group_1__1__Impl"
    // InternalEvoLogicLanguage.g:1322:1: rule__EvoAbstractOneParameterTerm__Group_1__1__Impl : ( ruleEvoOr ) ;
    public final void rule__EvoAbstractOneParameterTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1326:1: ( ( ruleEvoOr ) )
            // InternalEvoLogicLanguage.g:1327:1: ( ruleEvoOr )
            {
            // InternalEvoLogicLanguage.g:1327:1: ( ruleEvoOr )
            // InternalEvoLogicLanguage.g:1328:2: ruleEvoOr
            {
             before(grammarAccess.getEvoAbstractOneParameterTermAccess().getEvoOrParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleEvoOr();

            state._fsp--;

             after(grammarAccess.getEvoAbstractOneParameterTermAccess().getEvoOrParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAbstractOneParameterTerm__Group_1__1__Impl"


    // $ANTLR start "rule__EvoAbstractOneParameterTerm__Group_1__2"
    // InternalEvoLogicLanguage.g:1337:1: rule__EvoAbstractOneParameterTerm__Group_1__2 : rule__EvoAbstractOneParameterTerm__Group_1__2__Impl ;
    public final void rule__EvoAbstractOneParameterTerm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1341:1: ( rule__EvoAbstractOneParameterTerm__Group_1__2__Impl )
            // InternalEvoLogicLanguage.g:1342:2: rule__EvoAbstractOneParameterTerm__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoAbstractOneParameterTerm__Group_1__2__Impl();

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
    // $ANTLR end "rule__EvoAbstractOneParameterTerm__Group_1__2"


    // $ANTLR start "rule__EvoAbstractOneParameterTerm__Group_1__2__Impl"
    // InternalEvoLogicLanguage.g:1348:1: rule__EvoAbstractOneParameterTerm__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EvoAbstractOneParameterTerm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1352:1: ( ( ')' ) )
            // InternalEvoLogicLanguage.g:1353:1: ( ')' )
            {
            // InternalEvoLogicLanguage.g:1353:1: ( ')' )
            // InternalEvoLogicLanguage.g:1354:2: ')'
            {
             before(grammarAccess.getEvoAbstractOneParameterTermAccess().getRightParenthesisKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEvoAbstractOneParameterTermAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAbstractOneParameterTerm__Group_1__2__Impl"


    // $ANTLR start "rule__CommandDocument__ImportsAssignment_0"
    // InternalEvoLogicLanguage.g:1364:1: rule__CommandDocument__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__CommandDocument__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1368:1: ( ( ruleImport ) )
            // InternalEvoLogicLanguage.g:1369:2: ( ruleImport )
            {
            // InternalEvoLogicLanguage.g:1369:2: ( ruleImport )
            // InternalEvoLogicLanguage.g:1370:3: ruleImport
            {
             before(grammarAccess.getCommandDocumentAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getCommandDocumentAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDocument__ImportsAssignment_0"


    // $ANTLR start "rule__CommandDocument__FormulaAssignment_1"
    // InternalEvoLogicLanguage.g:1379:1: rule__CommandDocument__FormulaAssignment_1 : ( ruleEvoFormula ) ;
    public final void rule__CommandDocument__FormulaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1383:1: ( ( ruleEvoFormula ) )
            // InternalEvoLogicLanguage.g:1384:2: ( ruleEvoFormula )
            {
            // InternalEvoLogicLanguage.g:1384:2: ( ruleEvoFormula )
            // InternalEvoLogicLanguage.g:1385:3: ruleEvoFormula
            {
             before(grammarAccess.getCommandDocumentAccess().getFormulaEvoFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoFormula();

            state._fsp--;

             after(grammarAccess.getCommandDocumentAccess().getFormulaEvoFormulaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandDocument__FormulaAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalEvoLogicLanguage.g:1394:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1398:1: ( ( RULE_STRING ) )
            // InternalEvoLogicLanguage.g:1399:2: ( RULE_STRING )
            {
            // InternalEvoLogicLanguage.g:1399:2: ( RULE_STRING )
            // InternalEvoLogicLanguage.g:1400:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__EvoFormula__VariablesAssignment_2_2"
    // InternalEvoLogicLanguage.g:1409:1: rule__EvoFormula__VariablesAssignment_2_2 : ( ruleEvoVariable ) ;
    public final void rule__EvoFormula__VariablesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1413:1: ( ( ruleEvoVariable ) )
            // InternalEvoLogicLanguage.g:1414:2: ( ruleEvoVariable )
            {
            // InternalEvoLogicLanguage.g:1414:2: ( ruleEvoVariable )
            // InternalEvoLogicLanguage.g:1415:3: ruleEvoVariable
            {
             before(grammarAccess.getEvoFormulaAccess().getVariablesEvoVariableParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoFormulaAccess().getVariablesEvoVariableParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__VariablesAssignment_2_2"


    // $ANTLR start "rule__EvoFormula__VariablesAssignment_2_3_1"
    // InternalEvoLogicLanguage.g:1424:1: rule__EvoFormula__VariablesAssignment_2_3_1 : ( ruleEvoVariable ) ;
    public final void rule__EvoFormula__VariablesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1428:1: ( ( ruleEvoVariable ) )
            // InternalEvoLogicLanguage.g:1429:2: ( ruleEvoVariable )
            {
            // InternalEvoLogicLanguage.g:1429:2: ( ruleEvoVariable )
            // InternalEvoLogicLanguage.g:1430:3: ruleEvoVariable
            {
             before(grammarAccess.getEvoFormulaAccess().getVariablesEvoVariableParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoFormulaAccess().getVariablesEvoVariableParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__VariablesAssignment_2_3_1"


    // $ANTLR start "rule__EvoFormula__TermAssignment_4"
    // InternalEvoLogicLanguage.g:1439:1: rule__EvoFormula__TermAssignment_4 : ( ruleEvoAbstractTerm ) ;
    public final void rule__EvoFormula__TermAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1443:1: ( ( ruleEvoAbstractTerm ) )
            // InternalEvoLogicLanguage.g:1444:2: ( ruleEvoAbstractTerm )
            {
            // InternalEvoLogicLanguage.g:1444:2: ( ruleEvoAbstractTerm )
            // InternalEvoLogicLanguage.g:1445:3: ruleEvoAbstractTerm
            {
             before(grammarAccess.getEvoFormulaAccess().getTermEvoAbstractTermParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoAbstractTerm();

            state._fsp--;

             after(grammarAccess.getEvoFormulaAccess().getTermEvoAbstractTermParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFormula__TermAssignment_4"


    // $ANTLR start "rule__EvoVariableTerm__VariableAssignment_3"
    // InternalEvoLogicLanguage.g:1454:1: rule__EvoVariableTerm__VariableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__EvoVariableTerm__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1458:1: ( ( ( RULE_ID ) ) )
            // InternalEvoLogicLanguage.g:1459:2: ( ( RULE_ID ) )
            {
            // InternalEvoLogicLanguage.g:1459:2: ( ( RULE_ID ) )
            // InternalEvoLogicLanguage.g:1460:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_3_0()); 
            // InternalEvoLogicLanguage.g:1461:3: ( RULE_ID )
            // InternalEvoLogicLanguage.g:1462:4: RULE_ID
            {
             before(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__VariableAssignment_3"


    // $ANTLR start "rule__EvoArbitratyFeatureVariable__FeatureAssignment_1"
    // InternalEvoLogicLanguage.g:1473:1: rule__EvoArbitratyFeatureVariable__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoArbitratyFeatureVariable__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1477:1: ( ( ( RULE_ID ) ) )
            // InternalEvoLogicLanguage.g:1478:2: ( ( RULE_ID ) )
            {
            // InternalEvoLogicLanguage.g:1478:2: ( ( RULE_ID ) )
            // InternalEvoLogicLanguage.g:1479:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureHyFeatureCrossReference_1_0()); 
            // InternalEvoLogicLanguage.g:1480:3: ( RULE_ID )
            // InternalEvoLogicLanguage.g:1481:4: RULE_ID
            {
             before(grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureHyFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureHyFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureHyFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoArbitratyFeatureVariable__FeatureAssignment_1"


    // $ANTLR start "rule__EvoOr__RightElementAssignment_1_2"
    // InternalEvoLogicLanguage.g:1492:1: rule__EvoOr__RightElementAssignment_1_2 : ( ruleEvoAnd ) ;
    public final void rule__EvoOr__RightElementAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1496:1: ( ( ruleEvoAnd ) )
            // InternalEvoLogicLanguage.g:1497:2: ( ruleEvoAnd )
            {
            // InternalEvoLogicLanguage.g:1497:2: ( ruleEvoAnd )
            // InternalEvoLogicLanguage.g:1498:3: ruleEvoAnd
            {
             before(grammarAccess.getEvoOrAccess().getRightElementEvoAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoAnd();

            state._fsp--;

             after(grammarAccess.getEvoOrAccess().getRightElementEvoAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOr__RightElementAssignment_1_2"


    // $ANTLR start "rule__EvoAnd__RightElementAssignment_1_2"
    // InternalEvoLogicLanguage.g:1507:1: rule__EvoAnd__RightElementAssignment_1_2 : ( ruleEvoAbstractOneParameterTerm ) ;
    public final void rule__EvoAnd__RightElementAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoLogicLanguage.g:1511:1: ( ( ruleEvoAbstractOneParameterTerm ) )
            // InternalEvoLogicLanguage.g:1512:2: ( ruleEvoAbstractOneParameterTerm )
            {
            // InternalEvoLogicLanguage.g:1512:2: ( ruleEvoAbstractOneParameterTerm )
            // InternalEvoLogicLanguage.g:1513:3: ruleEvoAbstractOneParameterTerm
            {
             before(grammarAccess.getEvoAndAccess().getRightElementEvoAbstractOneParameterTermParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoAbstractOneParameterTerm();

            state._fsp--;

             after(grammarAccess.getEvoAndAccess().getRightElementEvoAbstractOneParameterTermParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAnd__RightElementAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});

}