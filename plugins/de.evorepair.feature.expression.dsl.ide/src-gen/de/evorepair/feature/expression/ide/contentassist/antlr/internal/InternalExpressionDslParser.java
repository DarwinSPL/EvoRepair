package de.evorepair.feature.expression.ide.contentassist.antlr.internal;

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
import de.evorepair.feature.expression.services.ExpressionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'<'", "'<='", "'='", "'>='", "'>'", "'@ident'", "'@pre'", "'@post'", "'optional'", "'mandatory'", "'and'", "'or'", "'alternative'", "'elementOf'", "'.'", "'('", "')'", "'->'", "'['", "']'", "'-'", "'EnumLiteral('", "','", "'eternity'", "'||'", "'&&'", "'=='", "'!='", "'<=>'", "'inclusion'", "'intersection'", "'union'", "'difference'", "'symmetric_difference'", "'x'", "'feature'", "'not'", "'AC'", "'{'", "'}'", "'true'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalExpressionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressionDsl.g"; }


    	private ExpressionDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ExpressionDslGrammarAccess grammarAccess) {
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
    // InternalExpressionDsl.g:53:1: entryRuleGrammarEntry : ruleGrammarEntry EOF ;
    public final void entryRuleGrammarEntry() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:54:1: ( ruleGrammarEntry EOF )
            // InternalExpressionDsl.g:55:1: ruleGrammarEntry EOF
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
    // InternalExpressionDsl.g:62:1: ruleGrammarEntry : ( ( rule__GrammarEntry__ExpressionAssignment ) ) ;
    public final void ruleGrammarEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:66:2: ( ( ( rule__GrammarEntry__ExpressionAssignment ) ) )
            // InternalExpressionDsl.g:67:2: ( ( rule__GrammarEntry__ExpressionAssignment ) )
            {
            // InternalExpressionDsl.g:67:2: ( ( rule__GrammarEntry__ExpressionAssignment ) )
            // InternalExpressionDsl.g:68:3: ( rule__GrammarEntry__ExpressionAssignment )
            {
             before(grammarAccess.getGrammarEntryAccess().getExpressionAssignment()); 
            // InternalExpressionDsl.g:69:3: ( rule__GrammarEntry__ExpressionAssignment )
            // InternalExpressionDsl.g:69:4: rule__GrammarEntry__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GrammarEntry__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGrammarEntryAccess().getExpressionAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEvoExpression"
    // InternalExpressionDsl.g:78:1: entryRuleEvoExpression : ruleEvoExpression EOF ;
    public final void entryRuleEvoExpression() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:79:1: ( ruleEvoExpression EOF )
            // InternalExpressionDsl.g:80:1: ruleEvoExpression EOF
            {
             before(grammarAccess.getEvoExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoExpression();

            state._fsp--;

             after(grammarAccess.getEvoExpressionRule()); 
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
    // $ANTLR end "entryRuleEvoExpression"


    // $ANTLR start "ruleEvoExpression"
    // InternalExpressionDsl.g:87:1: ruleEvoExpression : ( ruleEvoOr ) ;
    public final void ruleEvoExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:91:2: ( ( ruleEvoOr ) )
            // InternalExpressionDsl.g:92:2: ( ruleEvoOr )
            {
            // InternalExpressionDsl.g:92:2: ( ruleEvoOr )
            // InternalExpressionDsl.g:93:3: ruleEvoOr
            {
             before(grammarAccess.getEvoExpressionAccess().getEvoOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEvoOr();

            state._fsp--;

             after(grammarAccess.getEvoExpressionAccess().getEvoOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoExpression"


    // $ANTLR start "entryRuleEvoElementOf"
    // InternalExpressionDsl.g:103:1: entryRuleEvoElementOf : ruleEvoElementOf EOF ;
    public final void entryRuleEvoElementOf() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:104:1: ( ruleEvoElementOf EOF )
            // InternalExpressionDsl.g:105:1: ruleEvoElementOf EOF
            {
             before(grammarAccess.getEvoElementOfRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoElementOf();

            state._fsp--;

             after(grammarAccess.getEvoElementOfRule()); 
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
    // $ANTLR end "entryRuleEvoElementOf"


    // $ANTLR start "ruleEvoElementOf"
    // InternalExpressionDsl.g:112:1: ruleEvoElementOf : ( ( rule__EvoElementOf__Group__0 ) ) ;
    public final void ruleEvoElementOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:116:2: ( ( ( rule__EvoElementOf__Group__0 ) ) )
            // InternalExpressionDsl.g:117:2: ( ( rule__EvoElementOf__Group__0 ) )
            {
            // InternalExpressionDsl.g:117:2: ( ( rule__EvoElementOf__Group__0 ) )
            // InternalExpressionDsl.g:118:3: ( rule__EvoElementOf__Group__0 )
            {
             before(grammarAccess.getEvoElementOfAccess().getGroup()); 
            // InternalExpressionDsl.g:119:3: ( rule__EvoElementOf__Group__0 )
            // InternalExpressionDsl.g:119:4: rule__EvoElementOf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoElementOf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoElementOfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoElementOf"


    // $ANTLR start "entryRuleEvoTerminal"
    // InternalExpressionDsl.g:128:1: entryRuleEvoTerminal : ruleEvoTerminal EOF ;
    public final void entryRuleEvoTerminal() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:129:1: ( ruleEvoTerminal EOF )
            // InternalExpressionDsl.g:130:1: ruleEvoTerminal EOF
            {
             before(grammarAccess.getEvoTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoTerminal();

            state._fsp--;

             after(grammarAccess.getEvoTerminalRule()); 
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
    // $ANTLR end "entryRuleEvoTerminal"


    // $ANTLR start "ruleEvoTerminal"
    // InternalExpressionDsl.g:137:1: ruleEvoTerminal : ( ( rule__EvoTerminal__Alternatives ) ) ;
    public final void ruleEvoTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:141:2: ( ( ( rule__EvoTerminal__Alternatives ) ) )
            // InternalExpressionDsl.g:142:2: ( ( rule__EvoTerminal__Alternatives ) )
            {
            // InternalExpressionDsl.g:142:2: ( ( rule__EvoTerminal__Alternatives ) )
            // InternalExpressionDsl.g:143:3: ( rule__EvoTerminal__Alternatives )
            {
             before(grammarAccess.getEvoTerminalAccess().getAlternatives()); 
            // InternalExpressionDsl.g:144:3: ( rule__EvoTerminal__Alternatives )
            // InternalExpressionDsl.g:144:4: rule__EvoTerminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoTerminal"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalExpressionDsl.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:154:1: ( ruleQualifiedName EOF )
            // InternalExpressionDsl.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalExpressionDsl.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalExpressionDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalExpressionDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalExpressionDsl.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalExpressionDsl.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalExpressionDsl.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEvoNestedExpression"
    // InternalExpressionDsl.g:178:1: entryRuleEvoNestedExpression : ruleEvoNestedExpression EOF ;
    public final void entryRuleEvoNestedExpression() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:179:1: ( ruleEvoNestedExpression EOF )
            // InternalExpressionDsl.g:180:1: ruleEvoNestedExpression EOF
            {
             before(grammarAccess.getEvoNestedExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoNestedExpression();

            state._fsp--;

             after(grammarAccess.getEvoNestedExpressionRule()); 
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
    // $ANTLR end "entryRuleEvoNestedExpression"


    // $ANTLR start "ruleEvoNestedExpression"
    // InternalExpressionDsl.g:187:1: ruleEvoNestedExpression : ( ( rule__EvoNestedExpression__Group__0 ) ) ;
    public final void ruleEvoNestedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:191:2: ( ( ( rule__EvoNestedExpression__Group__0 ) ) )
            // InternalExpressionDsl.g:192:2: ( ( rule__EvoNestedExpression__Group__0 ) )
            {
            // InternalExpressionDsl.g:192:2: ( ( rule__EvoNestedExpression__Group__0 ) )
            // InternalExpressionDsl.g:193:3: ( rule__EvoNestedExpression__Group__0 )
            {
             before(grammarAccess.getEvoNestedExpressionAccess().getGroup()); 
            // InternalExpressionDsl.g:194:3: ( rule__EvoNestedExpression__Group__0 )
            // InternalExpressionDsl.g:194:4: rule__EvoNestedExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoNestedExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoNestedExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoNestedExpression"


    // $ANTLR start "entryRuleEvoImplication"
    // InternalExpressionDsl.g:203:1: entryRuleEvoImplication : ruleEvoImplication EOF ;
    public final void entryRuleEvoImplication() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:204:1: ( ruleEvoImplication EOF )
            // InternalExpressionDsl.g:205:1: ruleEvoImplication EOF
            {
             before(grammarAccess.getEvoImplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoImplication();

            state._fsp--;

             after(grammarAccess.getEvoImplicationRule()); 
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
    // $ANTLR end "entryRuleEvoImplication"


    // $ANTLR start "ruleEvoImplication"
    // InternalExpressionDsl.g:212:1: ruleEvoImplication : ( ( rule__EvoImplication__Group__0 ) ) ;
    public final void ruleEvoImplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:216:2: ( ( ( rule__EvoImplication__Group__0 ) ) )
            // InternalExpressionDsl.g:217:2: ( ( rule__EvoImplication__Group__0 ) )
            {
            // InternalExpressionDsl.g:217:2: ( ( rule__EvoImplication__Group__0 ) )
            // InternalExpressionDsl.g:218:3: ( rule__EvoImplication__Group__0 )
            {
             before(grammarAccess.getEvoImplicationAccess().getGroup()); 
            // InternalExpressionDsl.g:219:3: ( rule__EvoImplication__Group__0 )
            // InternalExpressionDsl.g:219:4: rule__EvoImplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoImplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoImplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoImplication"


    // $ANTLR start "entryRuleEvoFeatureReferenceExpression"
    // InternalExpressionDsl.g:228:1: entryRuleEvoFeatureReferenceExpression : ruleEvoFeatureReferenceExpression EOF ;
    public final void entryRuleEvoFeatureReferenceExpression() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:229:1: ( ruleEvoFeatureReferenceExpression EOF )
            // InternalExpressionDsl.g:230:1: ruleEvoFeatureReferenceExpression EOF
            {
             before(grammarAccess.getEvoFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoFeatureReferenceExpression();

            state._fsp--;

             after(grammarAccess.getEvoFeatureReferenceExpressionRule()); 
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
    // $ANTLR end "entryRuleEvoFeatureReferenceExpression"


    // $ANTLR start "ruleEvoFeatureReferenceExpression"
    // InternalExpressionDsl.g:237:1: ruleEvoFeatureReferenceExpression : ( ( rule__EvoFeatureReferenceExpression__FeatureAssignment ) ) ;
    public final void ruleEvoFeatureReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:241:2: ( ( ( rule__EvoFeatureReferenceExpression__FeatureAssignment ) ) )
            // InternalExpressionDsl.g:242:2: ( ( rule__EvoFeatureReferenceExpression__FeatureAssignment ) )
            {
            // InternalExpressionDsl.g:242:2: ( ( rule__EvoFeatureReferenceExpression__FeatureAssignment ) )
            // InternalExpressionDsl.g:243:3: ( rule__EvoFeatureReferenceExpression__FeatureAssignment )
            {
             before(grammarAccess.getEvoFeatureReferenceExpressionAccess().getFeatureAssignment()); 
            // InternalExpressionDsl.g:244:3: ( rule__EvoFeatureReferenceExpression__FeatureAssignment )
            // InternalExpressionDsl.g:244:4: rule__EvoFeatureReferenceExpression__FeatureAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureReferenceExpression__FeatureAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureReferenceExpressionAccess().getFeatureAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoFeatureReferenceExpression"


    // $ANTLR start "entryRuleEvoVersionRestriction"
    // InternalExpressionDsl.g:253:1: entryRuleEvoVersionRestriction : ruleEvoVersionRestriction EOF ;
    public final void entryRuleEvoVersionRestriction() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:254:1: ( ruleEvoVersionRestriction EOF )
            // InternalExpressionDsl.g:255:1: ruleEvoVersionRestriction EOF
            {
             before(grammarAccess.getEvoVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoVersionRestriction();

            state._fsp--;

             after(grammarAccess.getEvoVersionRestrictionRule()); 
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
    // $ANTLR end "entryRuleEvoVersionRestriction"


    // $ANTLR start "ruleEvoVersionRestriction"
    // InternalExpressionDsl.g:262:1: ruleEvoVersionRestriction : ( ( rule__EvoVersionRestriction__Alternatives ) ) ;
    public final void ruleEvoVersionRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:266:2: ( ( ( rule__EvoVersionRestriction__Alternatives ) ) )
            // InternalExpressionDsl.g:267:2: ( ( rule__EvoVersionRestriction__Alternatives ) )
            {
            // InternalExpressionDsl.g:267:2: ( ( rule__EvoVersionRestriction__Alternatives ) )
            // InternalExpressionDsl.g:268:3: ( rule__EvoVersionRestriction__Alternatives )
            {
             before(grammarAccess.getEvoVersionRestrictionAccess().getAlternatives()); 
            // InternalExpressionDsl.g:269:3: ( rule__EvoVersionRestriction__Alternatives )
            // InternalExpressionDsl.g:269:4: rule__EvoVersionRestriction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRestriction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoVersionRestrictionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoVersionRestriction"


    // $ANTLR start "entryRuleEvoRelativeVersionRestriction"
    // InternalExpressionDsl.g:278:1: entryRuleEvoRelativeVersionRestriction : ruleEvoRelativeVersionRestriction EOF ;
    public final void entryRuleEvoRelativeVersionRestriction() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:279:1: ( ruleEvoRelativeVersionRestriction EOF )
            // InternalExpressionDsl.g:280:1: ruleEvoRelativeVersionRestriction EOF
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoRelativeVersionRestriction();

            state._fsp--;

             after(grammarAccess.getEvoRelativeVersionRestrictionRule()); 
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
    // $ANTLR end "entryRuleEvoRelativeVersionRestriction"


    // $ANTLR start "ruleEvoRelativeVersionRestriction"
    // InternalExpressionDsl.g:287:1: ruleEvoRelativeVersionRestriction : ( ( rule__EvoRelativeVersionRestriction__Group__0 ) ) ;
    public final void ruleEvoRelativeVersionRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:291:2: ( ( ( rule__EvoRelativeVersionRestriction__Group__0 ) ) )
            // InternalExpressionDsl.g:292:2: ( ( rule__EvoRelativeVersionRestriction__Group__0 ) )
            {
            // InternalExpressionDsl.g:292:2: ( ( rule__EvoRelativeVersionRestriction__Group__0 ) )
            // InternalExpressionDsl.g:293:3: ( rule__EvoRelativeVersionRestriction__Group__0 )
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getGroup()); 
            // InternalExpressionDsl.g:294:3: ( rule__EvoRelativeVersionRestriction__Group__0 )
            // InternalExpressionDsl.g:294:4: rule__EvoRelativeVersionRestriction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestriction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoRelativeVersionRestriction"


    // $ANTLR start "entryRuleEvoVersionRangeRestriction"
    // InternalExpressionDsl.g:303:1: entryRuleEvoVersionRangeRestriction : ruleEvoVersionRangeRestriction EOF ;
    public final void entryRuleEvoVersionRangeRestriction() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:304:1: ( ruleEvoVersionRangeRestriction EOF )
            // InternalExpressionDsl.g:305:1: ruleEvoVersionRangeRestriction EOF
            {
             before(grammarAccess.getEvoVersionRangeRestrictionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoVersionRangeRestriction();

            state._fsp--;

             after(grammarAccess.getEvoVersionRangeRestrictionRule()); 
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
    // $ANTLR end "entryRuleEvoVersionRangeRestriction"


    // $ANTLR start "ruleEvoVersionRangeRestriction"
    // InternalExpressionDsl.g:312:1: ruleEvoVersionRangeRestriction : ( ( rule__EvoVersionRangeRestriction__Alternatives ) ) ;
    public final void ruleEvoVersionRangeRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:316:2: ( ( ( rule__EvoVersionRangeRestriction__Alternatives ) ) )
            // InternalExpressionDsl.g:317:2: ( ( rule__EvoVersionRangeRestriction__Alternatives ) )
            {
            // InternalExpressionDsl.g:317:2: ( ( rule__EvoVersionRangeRestriction__Alternatives ) )
            // InternalExpressionDsl.g:318:3: ( rule__EvoVersionRangeRestriction__Alternatives )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getAlternatives()); 
            // InternalExpressionDsl.g:319:3: ( rule__EvoVersionRangeRestriction__Alternatives )
            // InternalExpressionDsl.g:319:4: rule__EvoVersionRangeRestriction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoVersionRangeRestriction"


    // $ANTLR start "entryRuleEvoValue"
    // InternalExpressionDsl.g:328:1: entryRuleEvoValue : ruleEvoValue EOF ;
    public final void entryRuleEvoValue() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:329:1: ( ruleEvoValue EOF )
            // InternalExpressionDsl.g:330:1: ruleEvoValue EOF
            {
             before(grammarAccess.getEvoValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoValue();

            state._fsp--;

             after(grammarAccess.getEvoValueRule()); 
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
    // $ANTLR end "entryRuleEvoValue"


    // $ANTLR start "ruleEvoValue"
    // InternalExpressionDsl.g:337:1: ruleEvoValue : ( ( rule__EvoValue__Alternatives ) ) ;
    public final void ruleEvoValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:341:2: ( ( ( rule__EvoValue__Alternatives ) ) )
            // InternalExpressionDsl.g:342:2: ( ( rule__EvoValue__Alternatives ) )
            {
            // InternalExpressionDsl.g:342:2: ( ( rule__EvoValue__Alternatives ) )
            // InternalExpressionDsl.g:343:3: ( rule__EvoValue__Alternatives )
            {
             before(grammarAccess.getEvoValueAccess().getAlternatives()); 
            // InternalExpressionDsl.g:344:3: ( rule__EvoValue__Alternatives )
            // InternalExpressionDsl.g:344:4: rule__EvoValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoValue"


    // $ANTLR start "entryRuleEvoNumberValue"
    // InternalExpressionDsl.g:353:1: entryRuleEvoNumberValue : ruleEvoNumberValue EOF ;
    public final void entryRuleEvoNumberValue() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:354:1: ( ruleEvoNumberValue EOF )
            // InternalExpressionDsl.g:355:1: ruleEvoNumberValue EOF
            {
             before(grammarAccess.getEvoNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoNumberValue();

            state._fsp--;

             after(grammarAccess.getEvoNumberValueRule()); 
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
    // $ANTLR end "entryRuleEvoNumberValue"


    // $ANTLR start "ruleEvoNumberValue"
    // InternalExpressionDsl.g:362:1: ruleEvoNumberValue : ( ( rule__EvoNumberValue__ValueAssignment ) ) ;
    public final void ruleEvoNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:366:2: ( ( ( rule__EvoNumberValue__ValueAssignment ) ) )
            // InternalExpressionDsl.g:367:2: ( ( rule__EvoNumberValue__ValueAssignment ) )
            {
            // InternalExpressionDsl.g:367:2: ( ( rule__EvoNumberValue__ValueAssignment ) )
            // InternalExpressionDsl.g:368:3: ( rule__EvoNumberValue__ValueAssignment )
            {
             before(grammarAccess.getEvoNumberValueAccess().getValueAssignment()); 
            // InternalExpressionDsl.g:369:3: ( rule__EvoNumberValue__ValueAssignment )
            // InternalExpressionDsl.g:369:4: rule__EvoNumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EvoNumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEvoNumberValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoNumberValue"


    // $ANTLR start "entryRuleEvoBooleanValue"
    // InternalExpressionDsl.g:378:1: entryRuleEvoBooleanValue : ruleEvoBooleanValue EOF ;
    public final void entryRuleEvoBooleanValue() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:379:1: ( ruleEvoBooleanValue EOF )
            // InternalExpressionDsl.g:380:1: ruleEvoBooleanValue EOF
            {
             before(grammarAccess.getEvoBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoBooleanValue();

            state._fsp--;

             after(grammarAccess.getEvoBooleanValueRule()); 
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
    // $ANTLR end "entryRuleEvoBooleanValue"


    // $ANTLR start "ruleEvoBooleanValue"
    // InternalExpressionDsl.g:387:1: ruleEvoBooleanValue : ( ( rule__EvoBooleanValue__Group__0 ) ) ;
    public final void ruleEvoBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:391:2: ( ( ( rule__EvoBooleanValue__Group__0 ) ) )
            // InternalExpressionDsl.g:392:2: ( ( rule__EvoBooleanValue__Group__0 ) )
            {
            // InternalExpressionDsl.g:392:2: ( ( rule__EvoBooleanValue__Group__0 ) )
            // InternalExpressionDsl.g:393:3: ( rule__EvoBooleanValue__Group__0 )
            {
             before(grammarAccess.getEvoBooleanValueAccess().getGroup()); 
            // InternalExpressionDsl.g:394:3: ( rule__EvoBooleanValue__Group__0 )
            // InternalExpressionDsl.g:394:4: rule__EvoBooleanValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoBooleanValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoBooleanValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoBooleanValue"


    // $ANTLR start "entryRuleEvoEnumLiteral"
    // InternalExpressionDsl.g:403:1: entryRuleEvoEnumLiteral : ruleEvoEnumLiteral EOF ;
    public final void entryRuleEvoEnumLiteral() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:404:1: ( ruleEvoEnumLiteral EOF )
            // InternalExpressionDsl.g:405:1: ruleEvoEnumLiteral EOF
            {
             before(grammarAccess.getEvoEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEvoEnumLiteralRule()); 
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
    // $ANTLR end "entryRuleEvoEnumLiteral"


    // $ANTLR start "ruleEvoEnumLiteral"
    // InternalExpressionDsl.g:412:1: ruleEvoEnumLiteral : ( ( rule__EvoEnumLiteral__Group__0 ) ) ;
    public final void ruleEvoEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:416:2: ( ( ( rule__EvoEnumLiteral__Group__0 ) ) )
            // InternalExpressionDsl.g:417:2: ( ( rule__EvoEnumLiteral__Group__0 ) )
            {
            // InternalExpressionDsl.g:417:2: ( ( rule__EvoEnumLiteral__Group__0 ) )
            // InternalExpressionDsl.g:418:3: ( rule__EvoEnumLiteral__Group__0 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getGroup()); 
            // InternalExpressionDsl.g:419:3: ( rule__EvoEnumLiteral__Group__0 )
            // InternalExpressionDsl.g:419:4: rule__EvoEnumLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoEnumLiteral"


    // $ANTLR start "entryRuleEvoOr"
    // InternalExpressionDsl.g:428:1: entryRuleEvoOr : ruleEvoOr EOF ;
    public final void entryRuleEvoOr() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:429:1: ( ruleEvoOr EOF )
            // InternalExpressionDsl.g:430:1: ruleEvoOr EOF
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
    // InternalExpressionDsl.g:437:1: ruleEvoOr : ( ( rule__EvoOr__Group__0 ) ) ;
    public final void ruleEvoOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:441:2: ( ( ( rule__EvoOr__Group__0 ) ) )
            // InternalExpressionDsl.g:442:2: ( ( rule__EvoOr__Group__0 ) )
            {
            // InternalExpressionDsl.g:442:2: ( ( rule__EvoOr__Group__0 ) )
            // InternalExpressionDsl.g:443:3: ( rule__EvoOr__Group__0 )
            {
             before(grammarAccess.getEvoOrAccess().getGroup()); 
            // InternalExpressionDsl.g:444:3: ( rule__EvoOr__Group__0 )
            // InternalExpressionDsl.g:444:4: rule__EvoOr__Group__0
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
    // InternalExpressionDsl.g:453:1: entryRuleEvoAnd : ruleEvoAnd EOF ;
    public final void entryRuleEvoAnd() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:454:1: ( ruleEvoAnd EOF )
            // InternalExpressionDsl.g:455:1: ruleEvoAnd EOF
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
    // InternalExpressionDsl.g:462:1: ruleEvoAnd : ( ( rule__EvoAnd__Group__0 ) ) ;
    public final void ruleEvoAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:466:2: ( ( ( rule__EvoAnd__Group__0 ) ) )
            // InternalExpressionDsl.g:467:2: ( ( rule__EvoAnd__Group__0 ) )
            {
            // InternalExpressionDsl.g:467:2: ( ( rule__EvoAnd__Group__0 ) )
            // InternalExpressionDsl.g:468:3: ( rule__EvoAnd__Group__0 )
            {
             before(grammarAccess.getEvoAndAccess().getGroup()); 
            // InternalExpressionDsl.g:469:3: ( rule__EvoAnd__Group__0 )
            // InternalExpressionDsl.g:469:4: rule__EvoAnd__Group__0
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


    // $ANTLR start "entryRuleEvoEqual"
    // InternalExpressionDsl.g:478:1: entryRuleEvoEqual : ruleEvoEqual EOF ;
    public final void entryRuleEvoEqual() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:479:1: ( ruleEvoEqual EOF )
            // InternalExpressionDsl.g:480:1: ruleEvoEqual EOF
            {
             before(grammarAccess.getEvoEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoEqual();

            state._fsp--;

             after(grammarAccess.getEvoEqualRule()); 
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
    // $ANTLR end "entryRuleEvoEqual"


    // $ANTLR start "ruleEvoEqual"
    // InternalExpressionDsl.g:487:1: ruleEvoEqual : ( ( rule__EvoEqual__Group__0 ) ) ;
    public final void ruleEvoEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:491:2: ( ( ( rule__EvoEqual__Group__0 ) ) )
            // InternalExpressionDsl.g:492:2: ( ( rule__EvoEqual__Group__0 ) )
            {
            // InternalExpressionDsl.g:492:2: ( ( rule__EvoEqual__Group__0 ) )
            // InternalExpressionDsl.g:493:3: ( rule__EvoEqual__Group__0 )
            {
             before(grammarAccess.getEvoEqualAccess().getGroup()); 
            // InternalExpressionDsl.g:494:3: ( rule__EvoEqual__Group__0 )
            // InternalExpressionDsl.g:494:4: rule__EvoEqual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoEqual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoEqualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoEqual"


    // $ANTLR start "entryRuleEvoUnequalSize"
    // InternalExpressionDsl.g:503:1: entryRuleEvoUnequalSize : ruleEvoUnequalSize EOF ;
    public final void entryRuleEvoUnequalSize() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:504:1: ( ruleEvoUnequalSize EOF )
            // InternalExpressionDsl.g:505:1: ruleEvoUnequalSize EOF
            {
             before(grammarAccess.getEvoUnequalSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoUnequalSize();

            state._fsp--;

             after(grammarAccess.getEvoUnequalSizeRule()); 
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
    // $ANTLR end "entryRuleEvoUnequalSize"


    // $ANTLR start "ruleEvoUnequalSize"
    // InternalExpressionDsl.g:512:1: ruleEvoUnequalSize : ( ( rule__EvoUnequalSize__Alternatives ) ) ;
    public final void ruleEvoUnequalSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:516:2: ( ( ( rule__EvoUnequalSize__Alternatives ) ) )
            // InternalExpressionDsl.g:517:2: ( ( rule__EvoUnequalSize__Alternatives ) )
            {
            // InternalExpressionDsl.g:517:2: ( ( rule__EvoUnequalSize__Alternatives ) )
            // InternalExpressionDsl.g:518:3: ( rule__EvoUnequalSize__Alternatives )
            {
             before(grammarAccess.getEvoUnequalSizeAccess().getAlternatives()); 
            // InternalExpressionDsl.g:519:3: ( rule__EvoUnequalSize__Alternatives )
            // InternalExpressionDsl.g:519:4: rule__EvoUnequalSize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoUnequalSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoUnequalSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoUnequalSize"


    // $ANTLR start "entryRuleEvoUnequal"
    // InternalExpressionDsl.g:528:1: entryRuleEvoUnequal : ruleEvoUnequal EOF ;
    public final void entryRuleEvoUnequal() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:529:1: ( ruleEvoUnequal EOF )
            // InternalExpressionDsl.g:530:1: ruleEvoUnequal EOF
            {
             before(grammarAccess.getEvoUnequalRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoUnequal();

            state._fsp--;

             after(grammarAccess.getEvoUnequalRule()); 
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
    // $ANTLR end "entryRuleEvoUnequal"


    // $ANTLR start "ruleEvoUnequal"
    // InternalExpressionDsl.g:537:1: ruleEvoUnequal : ( ( rule__EvoUnequal__Group__0 ) ) ;
    public final void ruleEvoUnequal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:541:2: ( ( ( rule__EvoUnequal__Group__0 ) ) )
            // InternalExpressionDsl.g:542:2: ( ( rule__EvoUnequal__Group__0 ) )
            {
            // InternalExpressionDsl.g:542:2: ( ( rule__EvoUnequal__Group__0 ) )
            // InternalExpressionDsl.g:543:3: ( rule__EvoUnequal__Group__0 )
            {
             before(grammarAccess.getEvoUnequalAccess().getGroup()); 
            // InternalExpressionDsl.g:544:3: ( rule__EvoUnequal__Group__0 )
            // InternalExpressionDsl.g:544:4: rule__EvoUnequal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoUnequal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoUnequalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoUnequal"


    // $ANTLR start "entryRuleEvoImplicationSize"
    // InternalExpressionDsl.g:553:1: entryRuleEvoImplicationSize : ruleEvoImplicationSize EOF ;
    public final void entryRuleEvoImplicationSize() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:554:1: ( ruleEvoImplicationSize EOF )
            // InternalExpressionDsl.g:555:1: ruleEvoImplicationSize EOF
            {
             before(grammarAccess.getEvoImplicationSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoImplicationSize();

            state._fsp--;

             after(grammarAccess.getEvoImplicationSizeRule()); 
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
    // $ANTLR end "entryRuleEvoImplicationSize"


    // $ANTLR start "ruleEvoImplicationSize"
    // InternalExpressionDsl.g:562:1: ruleEvoImplicationSize : ( ( rule__EvoImplicationSize__Alternatives ) ) ;
    public final void ruleEvoImplicationSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:566:2: ( ( ( rule__EvoImplicationSize__Alternatives ) ) )
            // InternalExpressionDsl.g:567:2: ( ( rule__EvoImplicationSize__Alternatives ) )
            {
            // InternalExpressionDsl.g:567:2: ( ( rule__EvoImplicationSize__Alternatives ) )
            // InternalExpressionDsl.g:568:3: ( rule__EvoImplicationSize__Alternatives )
            {
             before(grammarAccess.getEvoImplicationSizeAccess().getAlternatives()); 
            // InternalExpressionDsl.g:569:3: ( rule__EvoImplicationSize__Alternatives )
            // InternalExpressionDsl.g:569:4: rule__EvoImplicationSize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoImplicationSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoImplicationSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoImplicationSize"


    // $ANTLR start "entryRuleEvoBiconditionalSize"
    // InternalExpressionDsl.g:578:1: entryRuleEvoBiconditionalSize : ruleEvoBiconditionalSize EOF ;
    public final void entryRuleEvoBiconditionalSize() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:579:1: ( ruleEvoBiconditionalSize EOF )
            // InternalExpressionDsl.g:580:1: ruleEvoBiconditionalSize EOF
            {
             before(grammarAccess.getEvoBiconditionalSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoBiconditionalSize();

            state._fsp--;

             after(grammarAccess.getEvoBiconditionalSizeRule()); 
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
    // $ANTLR end "entryRuleEvoBiconditionalSize"


    // $ANTLR start "ruleEvoBiconditionalSize"
    // InternalExpressionDsl.g:587:1: ruleEvoBiconditionalSize : ( ( rule__EvoBiconditionalSize__Alternatives ) ) ;
    public final void ruleEvoBiconditionalSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:591:2: ( ( ( rule__EvoBiconditionalSize__Alternatives ) ) )
            // InternalExpressionDsl.g:592:2: ( ( rule__EvoBiconditionalSize__Alternatives ) )
            {
            // InternalExpressionDsl.g:592:2: ( ( rule__EvoBiconditionalSize__Alternatives ) )
            // InternalExpressionDsl.g:593:3: ( rule__EvoBiconditionalSize__Alternatives )
            {
             before(grammarAccess.getEvoBiconditionalSizeAccess().getAlternatives()); 
            // InternalExpressionDsl.g:594:3: ( rule__EvoBiconditionalSize__Alternatives )
            // InternalExpressionDsl.g:594:4: rule__EvoBiconditionalSize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoBiconditionalSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoBiconditionalSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoBiconditionalSize"


    // $ANTLR start "entryRuleEvoBiconditional"
    // InternalExpressionDsl.g:603:1: entryRuleEvoBiconditional : ruleEvoBiconditional EOF ;
    public final void entryRuleEvoBiconditional() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:604:1: ( ruleEvoBiconditional EOF )
            // InternalExpressionDsl.g:605:1: ruleEvoBiconditional EOF
            {
             before(grammarAccess.getEvoBiconditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoBiconditional();

            state._fsp--;

             after(grammarAccess.getEvoBiconditionalRule()); 
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
    // $ANTLR end "entryRuleEvoBiconditional"


    // $ANTLR start "ruleEvoBiconditional"
    // InternalExpressionDsl.g:612:1: ruleEvoBiconditional : ( ( rule__EvoBiconditional__Group__0 ) ) ;
    public final void ruleEvoBiconditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:616:2: ( ( ( rule__EvoBiconditional__Group__0 ) ) )
            // InternalExpressionDsl.g:617:2: ( ( rule__EvoBiconditional__Group__0 ) )
            {
            // InternalExpressionDsl.g:617:2: ( ( rule__EvoBiconditional__Group__0 ) )
            // InternalExpressionDsl.g:618:3: ( rule__EvoBiconditional__Group__0 )
            {
             before(grammarAccess.getEvoBiconditionalAccess().getGroup()); 
            // InternalExpressionDsl.g:619:3: ( rule__EvoBiconditional__Group__0 )
            // InternalExpressionDsl.g:619:4: rule__EvoBiconditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoBiconditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoBiconditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoBiconditional"


    // $ANTLR start "entryRuleEvoSetInclusionSize"
    // InternalExpressionDsl.g:628:1: entryRuleEvoSetInclusionSize : ruleEvoSetInclusionSize EOF ;
    public final void entryRuleEvoSetInclusionSize() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:629:1: ( ruleEvoSetInclusionSize EOF )
            // InternalExpressionDsl.g:630:1: ruleEvoSetInclusionSize EOF
            {
             before(grammarAccess.getEvoSetInclusionSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetInclusionSize();

            state._fsp--;

             after(grammarAccess.getEvoSetInclusionSizeRule()); 
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
    // $ANTLR end "entryRuleEvoSetInclusionSize"


    // $ANTLR start "ruleEvoSetInclusionSize"
    // InternalExpressionDsl.g:637:1: ruleEvoSetInclusionSize : ( ( rule__EvoSetInclusionSize__Alternatives ) ) ;
    public final void ruleEvoSetInclusionSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:641:2: ( ( ( rule__EvoSetInclusionSize__Alternatives ) ) )
            // InternalExpressionDsl.g:642:2: ( ( rule__EvoSetInclusionSize__Alternatives ) )
            {
            // InternalExpressionDsl.g:642:2: ( ( rule__EvoSetInclusionSize__Alternatives ) )
            // InternalExpressionDsl.g:643:3: ( rule__EvoSetInclusionSize__Alternatives )
            {
             before(grammarAccess.getEvoSetInclusionSizeAccess().getAlternatives()); 
            // InternalExpressionDsl.g:644:3: ( rule__EvoSetInclusionSize__Alternatives )
            // InternalExpressionDsl.g:644:4: rule__EvoSetInclusionSize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetInclusionSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetInclusionSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetInclusionSize"


    // $ANTLR start "entryRuleEvoSetInclusion"
    // InternalExpressionDsl.g:653:1: entryRuleEvoSetInclusion : ruleEvoSetInclusion EOF ;
    public final void entryRuleEvoSetInclusion() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:654:1: ( ruleEvoSetInclusion EOF )
            // InternalExpressionDsl.g:655:1: ruleEvoSetInclusion EOF
            {
             before(grammarAccess.getEvoSetInclusionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetInclusion();

            state._fsp--;

             after(grammarAccess.getEvoSetInclusionRule()); 
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
    // $ANTLR end "entryRuleEvoSetInclusion"


    // $ANTLR start "ruleEvoSetInclusion"
    // InternalExpressionDsl.g:662:1: ruleEvoSetInclusion : ( ( rule__EvoSetInclusion__Group__0 ) ) ;
    public final void ruleEvoSetInclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:666:2: ( ( ( rule__EvoSetInclusion__Group__0 ) ) )
            // InternalExpressionDsl.g:667:2: ( ( rule__EvoSetInclusion__Group__0 ) )
            {
            // InternalExpressionDsl.g:667:2: ( ( rule__EvoSetInclusion__Group__0 ) )
            // InternalExpressionDsl.g:668:3: ( rule__EvoSetInclusion__Group__0 )
            {
             before(grammarAccess.getEvoSetInclusionAccess().getGroup()); 
            // InternalExpressionDsl.g:669:3: ( rule__EvoSetInclusion__Group__0 )
            // InternalExpressionDsl.g:669:4: rule__EvoSetInclusion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetInclusion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetInclusionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetInclusion"


    // $ANTLR start "entryRuleEvoSetIntersection"
    // InternalExpressionDsl.g:678:1: entryRuleEvoSetIntersection : ruleEvoSetIntersection EOF ;
    public final void entryRuleEvoSetIntersection() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:679:1: ( ruleEvoSetIntersection EOF )
            // InternalExpressionDsl.g:680:1: ruleEvoSetIntersection EOF
            {
             before(grammarAccess.getEvoSetIntersectionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetIntersection();

            state._fsp--;

             after(grammarAccess.getEvoSetIntersectionRule()); 
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
    // $ANTLR end "entryRuleEvoSetIntersection"


    // $ANTLR start "ruleEvoSetIntersection"
    // InternalExpressionDsl.g:687:1: ruleEvoSetIntersection : ( ( rule__EvoSetIntersection__Group__0 ) ) ;
    public final void ruleEvoSetIntersection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:691:2: ( ( ( rule__EvoSetIntersection__Group__0 ) ) )
            // InternalExpressionDsl.g:692:2: ( ( rule__EvoSetIntersection__Group__0 ) )
            {
            // InternalExpressionDsl.g:692:2: ( ( rule__EvoSetIntersection__Group__0 ) )
            // InternalExpressionDsl.g:693:3: ( rule__EvoSetIntersection__Group__0 )
            {
             before(grammarAccess.getEvoSetIntersectionAccess().getGroup()); 
            // InternalExpressionDsl.g:694:3: ( rule__EvoSetIntersection__Group__0 )
            // InternalExpressionDsl.g:694:4: rule__EvoSetIntersection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetIntersection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetIntersectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetIntersection"


    // $ANTLR start "entryRuleEvoSetUnion"
    // InternalExpressionDsl.g:703:1: entryRuleEvoSetUnion : ruleEvoSetUnion EOF ;
    public final void entryRuleEvoSetUnion() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:704:1: ( ruleEvoSetUnion EOF )
            // InternalExpressionDsl.g:705:1: ruleEvoSetUnion EOF
            {
             before(grammarAccess.getEvoSetUnionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetUnion();

            state._fsp--;

             after(grammarAccess.getEvoSetUnionRule()); 
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
    // $ANTLR end "entryRuleEvoSetUnion"


    // $ANTLR start "ruleEvoSetUnion"
    // InternalExpressionDsl.g:712:1: ruleEvoSetUnion : ( ( rule__EvoSetUnion__Group__0 ) ) ;
    public final void ruleEvoSetUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:716:2: ( ( ( rule__EvoSetUnion__Group__0 ) ) )
            // InternalExpressionDsl.g:717:2: ( ( rule__EvoSetUnion__Group__0 ) )
            {
            // InternalExpressionDsl.g:717:2: ( ( rule__EvoSetUnion__Group__0 ) )
            // InternalExpressionDsl.g:718:3: ( rule__EvoSetUnion__Group__0 )
            {
             before(grammarAccess.getEvoSetUnionAccess().getGroup()); 
            // InternalExpressionDsl.g:719:3: ( rule__EvoSetUnion__Group__0 )
            // InternalExpressionDsl.g:719:4: rule__EvoSetUnion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetUnion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetUnionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetUnion"


    // $ANTLR start "entryRuleEvoSetDifference"
    // InternalExpressionDsl.g:728:1: entryRuleEvoSetDifference : ruleEvoSetDifference EOF ;
    public final void entryRuleEvoSetDifference() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:729:1: ( ruleEvoSetDifference EOF )
            // InternalExpressionDsl.g:730:1: ruleEvoSetDifference EOF
            {
             before(grammarAccess.getEvoSetDifferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetDifference();

            state._fsp--;

             after(grammarAccess.getEvoSetDifferenceRule()); 
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
    // $ANTLR end "entryRuleEvoSetDifference"


    // $ANTLR start "ruleEvoSetDifference"
    // InternalExpressionDsl.g:737:1: ruleEvoSetDifference : ( ( rule__EvoSetDifference__Group__0 ) ) ;
    public final void ruleEvoSetDifference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:741:2: ( ( ( rule__EvoSetDifference__Group__0 ) ) )
            // InternalExpressionDsl.g:742:2: ( ( rule__EvoSetDifference__Group__0 ) )
            {
            // InternalExpressionDsl.g:742:2: ( ( rule__EvoSetDifference__Group__0 ) )
            // InternalExpressionDsl.g:743:3: ( rule__EvoSetDifference__Group__0 )
            {
             before(grammarAccess.getEvoSetDifferenceAccess().getGroup()); 
            // InternalExpressionDsl.g:744:3: ( rule__EvoSetDifference__Group__0 )
            // InternalExpressionDsl.g:744:4: rule__EvoSetDifference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetDifference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetDifferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetDifference"


    // $ANTLR start "entryRuleEvoSetSymmetricDifference"
    // InternalExpressionDsl.g:753:1: entryRuleEvoSetSymmetricDifference : ruleEvoSetSymmetricDifference EOF ;
    public final void entryRuleEvoSetSymmetricDifference() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:754:1: ( ruleEvoSetSymmetricDifference EOF )
            // InternalExpressionDsl.g:755:1: ruleEvoSetSymmetricDifference EOF
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetSymmetricDifference();

            state._fsp--;

             after(grammarAccess.getEvoSetSymmetricDifferenceRule()); 
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
    // $ANTLR end "entryRuleEvoSetSymmetricDifference"


    // $ANTLR start "ruleEvoSetSymmetricDifference"
    // InternalExpressionDsl.g:762:1: ruleEvoSetSymmetricDifference : ( ( rule__EvoSetSymmetricDifference__Group__0 ) ) ;
    public final void ruleEvoSetSymmetricDifference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:766:2: ( ( ( rule__EvoSetSymmetricDifference__Group__0 ) ) )
            // InternalExpressionDsl.g:767:2: ( ( rule__EvoSetSymmetricDifference__Group__0 ) )
            {
            // InternalExpressionDsl.g:767:2: ( ( rule__EvoSetSymmetricDifference__Group__0 ) )
            // InternalExpressionDsl.g:768:3: ( rule__EvoSetSymmetricDifference__Group__0 )
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceAccess().getGroup()); 
            // InternalExpressionDsl.g:769:3: ( rule__EvoSetSymmetricDifference__Group__0 )
            // InternalExpressionDsl.g:769:4: rule__EvoSetSymmetricDifference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetSymmetricDifference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetSymmetricDifferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetSymmetricDifference"


    // $ANTLR start "entryRuleEvoSetCartesianProduct"
    // InternalExpressionDsl.g:778:1: entryRuleEvoSetCartesianProduct : ruleEvoSetCartesianProduct EOF ;
    public final void entryRuleEvoSetCartesianProduct() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:779:1: ( ruleEvoSetCartesianProduct EOF )
            // InternalExpressionDsl.g:780:1: ruleEvoSetCartesianProduct EOF
            {
             before(grammarAccess.getEvoSetCartesianProductRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetCartesianProduct();

            state._fsp--;

             after(grammarAccess.getEvoSetCartesianProductRule()); 
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
    // $ANTLR end "entryRuleEvoSetCartesianProduct"


    // $ANTLR start "ruleEvoSetCartesianProduct"
    // InternalExpressionDsl.g:787:1: ruleEvoSetCartesianProduct : ( ( rule__EvoSetCartesianProduct__Group__0 ) ) ;
    public final void ruleEvoSetCartesianProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:791:2: ( ( ( rule__EvoSetCartesianProduct__Group__0 ) ) )
            // InternalExpressionDsl.g:792:2: ( ( rule__EvoSetCartesianProduct__Group__0 ) )
            {
            // InternalExpressionDsl.g:792:2: ( ( rule__EvoSetCartesianProduct__Group__0 ) )
            // InternalExpressionDsl.g:793:3: ( rule__EvoSetCartesianProduct__Group__0 )
            {
             before(grammarAccess.getEvoSetCartesianProductAccess().getGroup()); 
            // InternalExpressionDsl.g:794:3: ( rule__EvoSetCartesianProduct__Group__0 )
            // InternalExpressionDsl.g:794:4: rule__EvoSetCartesianProduct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetCartesianProduct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetCartesianProductAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetCartesianProduct"


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalExpressionDsl.g:803:1: entryRuleEvoFeatureVariable : ruleEvoFeatureVariable EOF ;
    public final void entryRuleEvoFeatureVariable() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:804:1: ( ruleEvoFeatureVariable EOF )
            // InternalExpressionDsl.g:805:1: ruleEvoFeatureVariable EOF
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
    // InternalExpressionDsl.g:812:1: ruleEvoFeatureVariable : ( ( rule__EvoFeatureVariable__Group__0 ) ) ;
    public final void ruleEvoFeatureVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:816:2: ( ( ( rule__EvoFeatureVariable__Group__0 ) ) )
            // InternalExpressionDsl.g:817:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            {
            // InternalExpressionDsl.g:817:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            // InternalExpressionDsl.g:818:3: ( rule__EvoFeatureVariable__Group__0 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup()); 
            // InternalExpressionDsl.g:819:3: ( rule__EvoFeatureVariable__Group__0 )
            // InternalExpressionDsl.g:819:4: rule__EvoFeatureVariable__Group__0
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


    // $ANTLR start "entryRuleEvoNot"
    // InternalExpressionDsl.g:828:1: entryRuleEvoNot : ruleEvoNot EOF ;
    public final void entryRuleEvoNot() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:829:1: ( ruleEvoNot EOF )
            // InternalExpressionDsl.g:830:1: ruleEvoNot EOF
            {
             before(grammarAccess.getEvoNotRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoNot();

            state._fsp--;

             after(grammarAccess.getEvoNotRule()); 
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
    // $ANTLR end "entryRuleEvoNot"


    // $ANTLR start "ruleEvoNot"
    // InternalExpressionDsl.g:837:1: ruleEvoNot : ( ( rule__EvoNot__Group__0 ) ) ;
    public final void ruleEvoNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:841:2: ( ( ( rule__EvoNot__Group__0 ) ) )
            // InternalExpressionDsl.g:842:2: ( ( rule__EvoNot__Group__0 ) )
            {
            // InternalExpressionDsl.g:842:2: ( ( rule__EvoNot__Group__0 ) )
            // InternalExpressionDsl.g:843:3: ( rule__EvoNot__Group__0 )
            {
             before(grammarAccess.getEvoNotAccess().getGroup()); 
            // InternalExpressionDsl.g:844:3: ( rule__EvoNot__Group__0 )
            // InternalExpressionDsl.g:844:4: rule__EvoNot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoNot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoNotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoNot"


    // $ANTLR start "entryRuleEvoSize"
    // InternalExpressionDsl.g:853:1: entryRuleEvoSize : ruleEvoSize EOF ;
    public final void entryRuleEvoSize() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:854:1: ( ruleEvoSize EOF )
            // InternalExpressionDsl.g:855:1: ruleEvoSize EOF
            {
             before(grammarAccess.getEvoSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSize();

            state._fsp--;

             after(grammarAccess.getEvoSizeRule()); 
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
    // $ANTLR end "entryRuleEvoSize"


    // $ANTLR start "ruleEvoSize"
    // InternalExpressionDsl.g:862:1: ruleEvoSize : ( ( rule__EvoSize__Group__0 ) ) ;
    public final void ruleEvoSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:866:2: ( ( ( rule__EvoSize__Group__0 ) ) )
            // InternalExpressionDsl.g:867:2: ( ( rule__EvoSize__Group__0 ) )
            {
            // InternalExpressionDsl.g:867:2: ( ( rule__EvoSize__Group__0 ) )
            // InternalExpressionDsl.g:868:3: ( rule__EvoSize__Group__0 )
            {
             before(grammarAccess.getEvoSizeAccess().getGroup()); 
            // InternalExpressionDsl.g:869:3: ( rule__EvoSize__Group__0 )
            // InternalExpressionDsl.g:869:4: rule__EvoSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSize"


    // $ANTLR start "entryRuleEvoVariableTerm"
    // InternalExpressionDsl.g:878:1: entryRuleEvoVariableTerm : ruleEvoVariableTerm EOF ;
    public final void entryRuleEvoVariableTerm() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:879:1: ( ruleEvoVariableTerm EOF )
            // InternalExpressionDsl.g:880:1: ruleEvoVariableTerm EOF
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
    // InternalExpressionDsl.g:887:1: ruleEvoVariableTerm : ( ( rule__EvoVariableTerm__Group__0 ) ) ;
    public final void ruleEvoVariableTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:891:2: ( ( ( rule__EvoVariableTerm__Group__0 ) ) )
            // InternalExpressionDsl.g:892:2: ( ( rule__EvoVariableTerm__Group__0 ) )
            {
            // InternalExpressionDsl.g:892:2: ( ( rule__EvoVariableTerm__Group__0 ) )
            // InternalExpressionDsl.g:893:3: ( rule__EvoVariableTerm__Group__0 )
            {
             before(grammarAccess.getEvoVariableTermAccess().getGroup()); 
            // InternalExpressionDsl.g:894:3: ( rule__EvoVariableTerm__Group__0 )
            // InternalExpressionDsl.g:894:4: rule__EvoVariableTerm__Group__0
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


    // $ANTLR start "entryRuleEvoApplicationConstraintTerm"
    // InternalExpressionDsl.g:903:1: entryRuleEvoApplicationConstraintTerm : ruleEvoApplicationConstraintTerm EOF ;
    public final void entryRuleEvoApplicationConstraintTerm() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:904:1: ( ruleEvoApplicationConstraintTerm EOF )
            // InternalExpressionDsl.g:905:1: ruleEvoApplicationConstraintTerm EOF
            {
             before(grammarAccess.getEvoApplicationConstraintTermRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoApplicationConstraintTerm();

            state._fsp--;

             after(grammarAccess.getEvoApplicationConstraintTermRule()); 
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
    // $ANTLR end "entryRuleEvoApplicationConstraintTerm"


    // $ANTLR start "ruleEvoApplicationConstraintTerm"
    // InternalExpressionDsl.g:912:1: ruleEvoApplicationConstraintTerm : ( ( rule__EvoApplicationConstraintTerm__Group__0 ) ) ;
    public final void ruleEvoApplicationConstraintTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:916:2: ( ( ( rule__EvoApplicationConstraintTerm__Group__0 ) ) )
            // InternalExpressionDsl.g:917:2: ( ( rule__EvoApplicationConstraintTerm__Group__0 ) )
            {
            // InternalExpressionDsl.g:917:2: ( ( rule__EvoApplicationConstraintTerm__Group__0 ) )
            // InternalExpressionDsl.g:918:3: ( rule__EvoApplicationConstraintTerm__Group__0 )
            {
             before(grammarAccess.getEvoApplicationConstraintTermAccess().getGroup()); 
            // InternalExpressionDsl.g:919:3: ( rule__EvoApplicationConstraintTerm__Group__0 )
            // InternalExpressionDsl.g:919:4: rule__EvoApplicationConstraintTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoApplicationConstraintTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoApplicationConstraintTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoApplicationConstraintTerm"


    // $ANTLR start "entryRuleEvoGroupTerm"
    // InternalExpressionDsl.g:928:1: entryRuleEvoGroupTerm : ruleEvoGroupTerm EOF ;
    public final void entryRuleEvoGroupTerm() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:929:1: ( ruleEvoGroupTerm EOF )
            // InternalExpressionDsl.g:930:1: ruleEvoGroupTerm EOF
            {
             before(grammarAccess.getEvoGroupTermRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoGroupTerm();

            state._fsp--;

             after(grammarAccess.getEvoGroupTermRule()); 
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
    // $ANTLR end "entryRuleEvoGroupTerm"


    // $ANTLR start "ruleEvoGroupTerm"
    // InternalExpressionDsl.g:937:1: ruleEvoGroupTerm : ( ( rule__EvoGroupTerm__Group__0 ) ) ;
    public final void ruleEvoGroupTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:941:2: ( ( ( rule__EvoGroupTerm__Group__0 ) ) )
            // InternalExpressionDsl.g:942:2: ( ( rule__EvoGroupTerm__Group__0 ) )
            {
            // InternalExpressionDsl.g:942:2: ( ( rule__EvoGroupTerm__Group__0 ) )
            // InternalExpressionDsl.g:943:3: ( rule__EvoGroupTerm__Group__0 )
            {
             before(grammarAccess.getEvoGroupTermAccess().getGroup()); 
            // InternalExpressionDsl.g:944:3: ( rule__EvoGroupTerm__Group__0 )
            // InternalExpressionDsl.g:944:4: rule__EvoGroupTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoGroupTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoGroupTerm"


    // $ANTLR start "entryRuleEvoSetTerm"
    // InternalExpressionDsl.g:953:1: entryRuleEvoSetTerm : ruleEvoSetTerm EOF ;
    public final void entryRuleEvoSetTerm() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:954:1: ( ruleEvoSetTerm EOF )
            // InternalExpressionDsl.g:955:1: ruleEvoSetTerm EOF
            {
             before(grammarAccess.getEvoSetTermRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetTerm();

            state._fsp--;

             after(grammarAccess.getEvoSetTermRule()); 
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
    // $ANTLR end "entryRuleEvoSetTerm"


    // $ANTLR start "ruleEvoSetTerm"
    // InternalExpressionDsl.g:962:1: ruleEvoSetTerm : ( ( rule__EvoSetTerm__Group__0 ) ) ;
    public final void ruleEvoSetTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:966:2: ( ( ( rule__EvoSetTerm__Group__0 ) ) )
            // InternalExpressionDsl.g:967:2: ( ( rule__EvoSetTerm__Group__0 ) )
            {
            // InternalExpressionDsl.g:967:2: ( ( rule__EvoSetTerm__Group__0 ) )
            // InternalExpressionDsl.g:968:3: ( rule__EvoSetTerm__Group__0 )
            {
             before(grammarAccess.getEvoSetTermAccess().getGroup()); 
            // InternalExpressionDsl.g:969:3: ( rule__EvoSetTerm__Group__0 )
            // InternalExpressionDsl.g:969:4: rule__EvoSetTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoSetTerm"


    // $ANTLR start "entryRuleEvoSetVariable"
    // InternalExpressionDsl.g:978:1: entryRuleEvoSetVariable : ruleEvoSetVariable EOF ;
    public final void entryRuleEvoSetVariable() throws RecognitionException {
        try {
            // InternalExpressionDsl.g:979:1: ( ruleEvoSetVariable EOF )
            // InternalExpressionDsl.g:980:1: ruleEvoSetVariable EOF
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
    // InternalExpressionDsl.g:987:1: ruleEvoSetVariable : ( ( rule__EvoSetVariable__Alternatives ) ) ;
    public final void ruleEvoSetVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:991:2: ( ( ( rule__EvoSetVariable__Alternatives ) ) )
            // InternalExpressionDsl.g:992:2: ( ( rule__EvoSetVariable__Alternatives ) )
            {
            // InternalExpressionDsl.g:992:2: ( ( rule__EvoSetVariable__Alternatives ) )
            // InternalExpressionDsl.g:993:3: ( rule__EvoSetVariable__Alternatives )
            {
             before(grammarAccess.getEvoSetVariableAccess().getAlternatives()); 
            // InternalExpressionDsl.g:994:3: ( rule__EvoSetVariable__Alternatives )
            // InternalExpressionDsl.g:994:4: rule__EvoSetVariable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetVariableAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleEvoRelativeVersionRestrictionOperator"
    // InternalExpressionDsl.g:1003:1: ruleEvoRelativeVersionRestrictionOperator : ( ( rule__EvoRelativeVersionRestrictionOperator__Alternatives ) ) ;
    public final void ruleEvoRelativeVersionRestrictionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1007:1: ( ( ( rule__EvoRelativeVersionRestrictionOperator__Alternatives ) ) )
            // InternalExpressionDsl.g:1008:2: ( ( rule__EvoRelativeVersionRestrictionOperator__Alternatives ) )
            {
            // InternalExpressionDsl.g:1008:2: ( ( rule__EvoRelativeVersionRestrictionOperator__Alternatives ) )
            // InternalExpressionDsl.g:1009:3: ( rule__EvoRelativeVersionRestrictionOperator__Alternatives )
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getAlternatives()); 
            // InternalExpressionDsl.g:1010:3: ( rule__EvoRelativeVersionRestrictionOperator__Alternatives )
            // InternalExpressionDsl.g:1010:4: rule__EvoRelativeVersionRestrictionOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestrictionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoRelativeVersionRestrictionOperator"


    // $ANTLR start "ruleEvoVariableType"
    // InternalExpressionDsl.g:1019:1: ruleEvoVariableType : ( ( rule__EvoVariableType__Alternatives ) ) ;
    public final void ruleEvoVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1023:1: ( ( ( rule__EvoVariableType__Alternatives ) ) )
            // InternalExpressionDsl.g:1024:2: ( ( rule__EvoVariableType__Alternatives ) )
            {
            // InternalExpressionDsl.g:1024:2: ( ( rule__EvoVariableType__Alternatives ) )
            // InternalExpressionDsl.g:1025:3: ( rule__EvoVariableType__Alternatives )
            {
             before(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); 
            // InternalExpressionDsl.g:1026:3: ( rule__EvoVariableType__Alternatives )
            // InternalExpressionDsl.g:1026:4: rule__EvoVariableType__Alternatives
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


    // $ANTLR start "ruleHyFeatureTypeEnum"
    // InternalExpressionDsl.g:1035:1: ruleHyFeatureTypeEnum : ( ( rule__HyFeatureTypeEnum__Alternatives ) ) ;
    public final void ruleHyFeatureTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1039:1: ( ( ( rule__HyFeatureTypeEnum__Alternatives ) ) )
            // InternalExpressionDsl.g:1040:2: ( ( rule__HyFeatureTypeEnum__Alternatives ) )
            {
            // InternalExpressionDsl.g:1040:2: ( ( rule__HyFeatureTypeEnum__Alternatives ) )
            // InternalExpressionDsl.g:1041:3: ( rule__HyFeatureTypeEnum__Alternatives )
            {
             before(grammarAccess.getHyFeatureTypeEnumAccess().getAlternatives()); 
            // InternalExpressionDsl.g:1042:3: ( rule__HyFeatureTypeEnum__Alternatives )
            // InternalExpressionDsl.g:1042:4: rule__HyFeatureTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HyFeatureTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHyFeatureTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHyFeatureTypeEnum"


    // $ANTLR start "ruleHyGroupTypeEnum"
    // InternalExpressionDsl.g:1051:1: ruleHyGroupTypeEnum : ( ( rule__HyGroupTypeEnum__Alternatives ) ) ;
    public final void ruleHyGroupTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1055:1: ( ( ( rule__HyGroupTypeEnum__Alternatives ) ) )
            // InternalExpressionDsl.g:1056:2: ( ( rule__HyGroupTypeEnum__Alternatives ) )
            {
            // InternalExpressionDsl.g:1056:2: ( ( rule__HyGroupTypeEnum__Alternatives ) )
            // InternalExpressionDsl.g:1057:3: ( rule__HyGroupTypeEnum__Alternatives )
            {
             before(grammarAccess.getHyGroupTypeEnumAccess().getAlternatives()); 
            // InternalExpressionDsl.g:1058:3: ( rule__HyGroupTypeEnum__Alternatives )
            // InternalExpressionDsl.g:1058:4: rule__HyGroupTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HyGroupTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHyGroupTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHyGroupTypeEnum"


    // $ANTLR start "rule__EvoTerminal__Alternatives"
    // InternalExpressionDsl.g:1066:1: rule__EvoTerminal__Alternatives : ( ( ruleEvoFeatureReferenceExpression ) | ( ruleEvoNestedExpression ) );
    public final void rule__EvoTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1070:1: ( ( ruleEvoFeatureReferenceExpression ) | ( ruleEvoNestedExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==28) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalExpressionDsl.g:1071:2: ( ruleEvoFeatureReferenceExpression )
                    {
                    // InternalExpressionDsl.g:1071:2: ( ruleEvoFeatureReferenceExpression )
                    // InternalExpressionDsl.g:1072:3: ruleEvoFeatureReferenceExpression
                    {
                     before(grammarAccess.getEvoTerminalAccess().getEvoFeatureReferenceExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoFeatureReferenceExpression();

                    state._fsp--;

                     after(grammarAccess.getEvoTerminalAccess().getEvoFeatureReferenceExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1077:2: ( ruleEvoNestedExpression )
                    {
                    // InternalExpressionDsl.g:1077:2: ( ruleEvoNestedExpression )
                    // InternalExpressionDsl.g:1078:3: ruleEvoNestedExpression
                    {
                     before(grammarAccess.getEvoTerminalAccess().getEvoNestedExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoNestedExpression();

                    state._fsp--;

                     after(grammarAccess.getEvoTerminalAccess().getEvoNestedExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvoTerminal__Alternatives"


    // $ANTLR start "rule__EvoVersionRestriction__Alternatives"
    // InternalExpressionDsl.g:1087:1: rule__EvoVersionRestriction__Alternatives : ( ( ruleEvoRelativeVersionRestriction ) | ( ruleEvoVersionRangeRestriction ) );
    public final void rule__EvoVersionRestriction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1091:1: ( ( ruleEvoRelativeVersionRestriction ) | ( ruleEvoVersionRangeRestriction ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=13 && LA2_1<=17)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==53) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressionDsl.g:1092:2: ( ruleEvoRelativeVersionRestriction )
                    {
                    // InternalExpressionDsl.g:1092:2: ( ruleEvoRelativeVersionRestriction )
                    // InternalExpressionDsl.g:1093:3: ruleEvoRelativeVersionRestriction
                    {
                     before(grammarAccess.getEvoVersionRestrictionAccess().getEvoRelativeVersionRestrictionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoRelativeVersionRestriction();

                    state._fsp--;

                     after(grammarAccess.getEvoVersionRestrictionAccess().getEvoRelativeVersionRestrictionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1098:2: ( ruleEvoVersionRangeRestriction )
                    {
                    // InternalExpressionDsl.g:1098:2: ( ruleEvoVersionRangeRestriction )
                    // InternalExpressionDsl.g:1099:3: ruleEvoVersionRangeRestriction
                    {
                     before(grammarAccess.getEvoVersionRestrictionAccess().getEvoVersionRangeRestrictionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoVersionRangeRestriction();

                    state._fsp--;

                     after(grammarAccess.getEvoVersionRestrictionAccess().getEvoVersionRangeRestrictionParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvoVersionRestriction__Alternatives"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Alternatives"
    // InternalExpressionDsl.g:1108:1: rule__EvoVersionRangeRestriction__Alternatives : ( ( ( rule__EvoVersionRangeRestriction__Group_0__0 ) ) | ( ( rule__EvoVersionRangeRestriction__Group_1__0 ) ) | ( ( rule__EvoVersionRangeRestriction__Group_2__0 ) ) );
    public final void rule__EvoVersionRangeRestriction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1112:1: ( ( ( rule__EvoVersionRangeRestriction__Group_0__0 ) ) | ( ( rule__EvoVersionRangeRestriction__Group_1__0 ) ) | ( ( rule__EvoVersionRangeRestriction__Group_2__0 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalExpressionDsl.g:1113:2: ( ( rule__EvoVersionRangeRestriction__Group_0__0 ) )
                    {
                    // InternalExpressionDsl.g:1113:2: ( ( rule__EvoVersionRangeRestriction__Group_0__0 ) )
                    // InternalExpressionDsl.g:1114:3: ( rule__EvoVersionRangeRestriction__Group_0__0 )
                    {
                     before(grammarAccess.getEvoVersionRangeRestrictionAccess().getGroup_0()); 
                    // InternalExpressionDsl.g:1115:3: ( rule__EvoVersionRangeRestriction__Group_0__0 )
                    // InternalExpressionDsl.g:1115:4: rule__EvoVersionRangeRestriction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoVersionRangeRestriction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoVersionRangeRestrictionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1119:2: ( ( rule__EvoVersionRangeRestriction__Group_1__0 ) )
                    {
                    // InternalExpressionDsl.g:1119:2: ( ( rule__EvoVersionRangeRestriction__Group_1__0 ) )
                    // InternalExpressionDsl.g:1120:3: ( rule__EvoVersionRangeRestriction__Group_1__0 )
                    {
                     before(grammarAccess.getEvoVersionRangeRestrictionAccess().getGroup_1()); 
                    // InternalExpressionDsl.g:1121:3: ( rule__EvoVersionRangeRestriction__Group_1__0 )
                    // InternalExpressionDsl.g:1121:4: rule__EvoVersionRangeRestriction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoVersionRangeRestriction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoVersionRangeRestrictionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:1125:2: ( ( rule__EvoVersionRangeRestriction__Group_2__0 ) )
                    {
                    // InternalExpressionDsl.g:1125:2: ( ( rule__EvoVersionRangeRestriction__Group_2__0 ) )
                    // InternalExpressionDsl.g:1126:3: ( rule__EvoVersionRangeRestriction__Group_2__0 )
                    {
                     before(grammarAccess.getEvoVersionRangeRestrictionAccess().getGroup_2()); 
                    // InternalExpressionDsl.g:1127:3: ( rule__EvoVersionRangeRestriction__Group_2__0 )
                    // InternalExpressionDsl.g:1127:4: rule__EvoVersionRangeRestriction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoVersionRangeRestriction__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoVersionRangeRestrictionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EvoVersionRangeRestriction__Alternatives"


    // $ANTLR start "rule__EvoValue__Alternatives"
    // InternalExpressionDsl.g:1135:1: rule__EvoValue__Alternatives : ( ( ruleEvoNumberValue ) | ( ruleEvoBooleanValue ) );
    public final void rule__EvoValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1139:1: ( ( ruleEvoNumberValue ) | ( ruleEvoBooleanValue ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==12||LA4_0==53) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpressionDsl.g:1140:2: ( ruleEvoNumberValue )
                    {
                    // InternalExpressionDsl.g:1140:2: ( ruleEvoNumberValue )
                    // InternalExpressionDsl.g:1141:3: ruleEvoNumberValue
                    {
                     before(grammarAccess.getEvoValueAccess().getEvoNumberValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoNumberValue();

                    state._fsp--;

                     after(grammarAccess.getEvoValueAccess().getEvoNumberValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1146:2: ( ruleEvoBooleanValue )
                    {
                    // InternalExpressionDsl.g:1146:2: ( ruleEvoBooleanValue )
                    // InternalExpressionDsl.g:1147:3: ruleEvoBooleanValue
                    {
                     before(grammarAccess.getEvoValueAccess().getEvoBooleanValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getEvoValueAccess().getEvoBooleanValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvoValue__Alternatives"


    // $ANTLR start "rule__EvoBooleanValue__Alternatives_1"
    // InternalExpressionDsl.g:1156:1: rule__EvoBooleanValue__Alternatives_1 : ( ( ( rule__EvoBooleanValue__ValueAssignment_1_0 ) ) | ( 'false' ) );
    public final void rule__EvoBooleanValue__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1160:1: ( ( ( rule__EvoBooleanValue__ValueAssignment_1_0 ) ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==53) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpressionDsl.g:1161:2: ( ( rule__EvoBooleanValue__ValueAssignment_1_0 ) )
                    {
                    // InternalExpressionDsl.g:1161:2: ( ( rule__EvoBooleanValue__ValueAssignment_1_0 ) )
                    // InternalExpressionDsl.g:1162:3: ( rule__EvoBooleanValue__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getEvoBooleanValueAccess().getValueAssignment_1_0()); 
                    // InternalExpressionDsl.g:1163:3: ( rule__EvoBooleanValue__ValueAssignment_1_0 )
                    // InternalExpressionDsl.g:1163:4: rule__EvoBooleanValue__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoBooleanValue__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoBooleanValueAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1167:2: ( 'false' )
                    {
                    // InternalExpressionDsl.g:1167:2: ( 'false' )
                    // InternalExpressionDsl.g:1168:3: 'false'
                    {
                     before(grammarAccess.getEvoBooleanValueAccess().getFalseKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEvoBooleanValueAccess().getFalseKeyword_1_1()); 

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
    // $ANTLR end "rule__EvoBooleanValue__Alternatives_1"


    // $ANTLR start "rule__EvoEnumLiteral__Alternatives_5_1"
    // InternalExpressionDsl.g:1177:1: rule__EvoEnumLiteral__Alternatives_5_1 : ( ( ( rule__EvoEnumLiteral__Group_5_1_0__0 ) ) | ( ( rule__EvoEnumLiteral__Group_5_1_1__0 ) ) | ( ( rule__EvoEnumLiteral__Group_5_1_2__0 ) ) );
    public final void rule__EvoEnumLiteral__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1181:1: ( ( ( rule__EvoEnumLiteral__Group_5_1_0__0 ) ) | ( ( rule__EvoEnumLiteral__Group_5_1_1__0 ) ) | ( ( rule__EvoEnumLiteral__Group_5_1_2__0 ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DATE) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==33) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==RULE_DATE) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==32) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==36) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExpressionDsl.g:1182:2: ( ( rule__EvoEnumLiteral__Group_5_1_0__0 ) )
                    {
                    // InternalExpressionDsl.g:1182:2: ( ( rule__EvoEnumLiteral__Group_5_1_0__0 ) )
                    // InternalExpressionDsl.g:1183:3: ( rule__EvoEnumLiteral__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getEvoEnumLiteralAccess().getGroup_5_1_0()); 
                    // InternalExpressionDsl.g:1184:3: ( rule__EvoEnumLiteral__Group_5_1_0__0 )
                    // InternalExpressionDsl.g:1184:4: rule__EvoEnumLiteral__Group_5_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoEnumLiteral__Group_5_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoEnumLiteralAccess().getGroup_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1188:2: ( ( rule__EvoEnumLiteral__Group_5_1_1__0 ) )
                    {
                    // InternalExpressionDsl.g:1188:2: ( ( rule__EvoEnumLiteral__Group_5_1_1__0 ) )
                    // InternalExpressionDsl.g:1189:3: ( rule__EvoEnumLiteral__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getEvoEnumLiteralAccess().getGroup_5_1_1()); 
                    // InternalExpressionDsl.g:1190:3: ( rule__EvoEnumLiteral__Group_5_1_1__0 )
                    // InternalExpressionDsl.g:1190:4: rule__EvoEnumLiteral__Group_5_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoEnumLiteral__Group_5_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoEnumLiteralAccess().getGroup_5_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:1194:2: ( ( rule__EvoEnumLiteral__Group_5_1_2__0 ) )
                    {
                    // InternalExpressionDsl.g:1194:2: ( ( rule__EvoEnumLiteral__Group_5_1_2__0 ) )
                    // InternalExpressionDsl.g:1195:3: ( rule__EvoEnumLiteral__Group_5_1_2__0 )
                    {
                     before(grammarAccess.getEvoEnumLiteralAccess().getGroup_5_1_2()); 
                    // InternalExpressionDsl.g:1196:3: ( rule__EvoEnumLiteral__Group_5_1_2__0 )
                    // InternalExpressionDsl.g:1196:4: rule__EvoEnumLiteral__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoEnumLiteral__Group_5_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvoEnumLiteralAccess().getGroup_5_1_2()); 

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
    // $ANTLR end "rule__EvoEnumLiteral__Alternatives_5_1"


    // $ANTLR start "rule__EvoUnequalSize__Alternatives"
    // InternalExpressionDsl.g:1204:1: rule__EvoUnequalSize__Alternatives : ( ( ruleEvoUnequal ) | ( ruleEvoSize ) );
    public final void rule__EvoUnequalSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1208:1: ( ( ruleEvoUnequal ) | ( ruleEvoSize ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpressionDsl.g:1209:2: ( ruleEvoUnequal )
                    {
                    // InternalExpressionDsl.g:1209:2: ( ruleEvoUnequal )
                    // InternalExpressionDsl.g:1210:3: ruleEvoUnequal
                    {
                     before(grammarAccess.getEvoUnequalSizeAccess().getEvoUnequalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoUnequal();

                    state._fsp--;

                     after(grammarAccess.getEvoUnequalSizeAccess().getEvoUnequalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1215:2: ( ruleEvoSize )
                    {
                    // InternalExpressionDsl.g:1215:2: ( ruleEvoSize )
                    // InternalExpressionDsl.g:1216:3: ruleEvoSize
                    {
                     before(grammarAccess.getEvoUnequalSizeAccess().getEvoSizeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoSize();

                    state._fsp--;

                     after(grammarAccess.getEvoUnequalSizeAccess().getEvoSizeParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvoUnequalSize__Alternatives"


    // $ANTLR start "rule__EvoImplicationSize__Alternatives"
    // InternalExpressionDsl.g:1225:1: rule__EvoImplicationSize__Alternatives : ( ( ruleEvoImplication ) | ( ruleEvoSize ) );
    public final void rule__EvoImplicationSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1229:1: ( ( ruleEvoImplication ) | ( ruleEvoSize ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING||LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalExpressionDsl.g:1230:2: ( ruleEvoImplication )
                    {
                    // InternalExpressionDsl.g:1230:2: ( ruleEvoImplication )
                    // InternalExpressionDsl.g:1231:3: ruleEvoImplication
                    {
                     before(grammarAccess.getEvoImplicationSizeAccess().getEvoImplicationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoImplication();

                    state._fsp--;

                     after(grammarAccess.getEvoImplicationSizeAccess().getEvoImplicationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1236:2: ( ruleEvoSize )
                    {
                    // InternalExpressionDsl.g:1236:2: ( ruleEvoSize )
                    // InternalExpressionDsl.g:1237:3: ruleEvoSize
                    {
                     before(grammarAccess.getEvoImplicationSizeAccess().getEvoSizeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoSize();

                    state._fsp--;

                     after(grammarAccess.getEvoImplicationSizeAccess().getEvoSizeParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvoImplicationSize__Alternatives"


    // $ANTLR start "rule__EvoBiconditionalSize__Alternatives"
    // InternalExpressionDsl.g:1246:1: rule__EvoBiconditionalSize__Alternatives : ( ( ruleEvoBiconditional ) | ( ruleEvoSize ) );
    public final void rule__EvoBiconditionalSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1250:1: ( ( ruleEvoBiconditional ) | ( ruleEvoSize ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpressionDsl.g:1251:2: ( ruleEvoBiconditional )
                    {
                    // InternalExpressionDsl.g:1251:2: ( ruleEvoBiconditional )
                    // InternalExpressionDsl.g:1252:3: ruleEvoBiconditional
                    {
                     before(grammarAccess.getEvoBiconditionalSizeAccess().getEvoBiconditionalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoBiconditional();

                    state._fsp--;

                     after(grammarAccess.getEvoBiconditionalSizeAccess().getEvoBiconditionalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1257:2: ( ruleEvoSize )
                    {
                    // InternalExpressionDsl.g:1257:2: ( ruleEvoSize )
                    // InternalExpressionDsl.g:1258:3: ruleEvoSize
                    {
                     before(grammarAccess.getEvoBiconditionalSizeAccess().getEvoSizeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoSize();

                    state._fsp--;

                     after(grammarAccess.getEvoBiconditionalSizeAccess().getEvoSizeParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvoBiconditionalSize__Alternatives"


    // $ANTLR start "rule__EvoSetInclusionSize__Alternatives"
    // InternalExpressionDsl.g:1267:1: rule__EvoSetInclusionSize__Alternatives : ( ( ruleEvoSetInclusion ) | ( ruleEvoSize ) );
    public final void rule__EvoSetInclusionSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1271:1: ( ( ruleEvoSetInclusion ) | ( ruleEvoSize ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpressionDsl.g:1272:2: ( ruleEvoSetInclusion )
                    {
                    // InternalExpressionDsl.g:1272:2: ( ruleEvoSetInclusion )
                    // InternalExpressionDsl.g:1273:3: ruleEvoSetInclusion
                    {
                     before(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSetInclusionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoSetInclusion();

                    state._fsp--;

                     after(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSetInclusionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1278:2: ( ruleEvoSize )
                    {
                    // InternalExpressionDsl.g:1278:2: ( ruleEvoSize )
                    // InternalExpressionDsl.g:1279:3: ruleEvoSize
                    {
                     before(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSizeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoSize();

                    state._fsp--;

                     after(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSizeParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvoSetInclusionSize__Alternatives"


    // $ANTLR start "rule__EvoSetVariable__Alternatives"
    // InternalExpressionDsl.g:1288:1: rule__EvoSetVariable__Alternatives : ( ( ruleEvoVariableTerm ) | ( ruleEvoSetTerm ) | ( ruleEvoNot ) );
    public final void rule__EvoSetVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1292:1: ( ( ruleEvoVariableTerm ) | ( ruleEvoSetTerm ) | ( ruleEvoNot ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 51:
                {
                alt11=2;
                }
                break;
            case 49:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalExpressionDsl.g:1293:2: ( ruleEvoVariableTerm )
                    {
                    // InternalExpressionDsl.g:1293:2: ( ruleEvoVariableTerm )
                    // InternalExpressionDsl.g:1294:3: ruleEvoVariableTerm
                    {
                     before(grammarAccess.getEvoSetVariableAccess().getEvoVariableTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoVariableTerm();

                    state._fsp--;

                     after(grammarAccess.getEvoSetVariableAccess().getEvoVariableTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1299:2: ( ruleEvoSetTerm )
                    {
                    // InternalExpressionDsl.g:1299:2: ( ruleEvoSetTerm )
                    // InternalExpressionDsl.g:1300:3: ruleEvoSetTerm
                    {
                     before(grammarAccess.getEvoSetVariableAccess().getEvoSetTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoSetTerm();

                    state._fsp--;

                     after(grammarAccess.getEvoSetVariableAccess().getEvoSetTermParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:1305:2: ( ruleEvoNot )
                    {
                    // InternalExpressionDsl.g:1305:2: ( ruleEvoNot )
                    // InternalExpressionDsl.g:1306:3: ruleEvoNot
                    {
                     before(grammarAccess.getEvoSetVariableAccess().getEvoNotParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoNot();

                    state._fsp--;

                     after(grammarAccess.getEvoSetVariableAccess().getEvoNotParserRuleCall_2()); 

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
    // $ANTLR end "rule__EvoSetVariable__Alternatives"


    // $ANTLR start "rule__EvoRelativeVersionRestrictionOperator__Alternatives"
    // InternalExpressionDsl.g:1315:1: rule__EvoRelativeVersionRestrictionOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__EvoRelativeVersionRestrictionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1319:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 15:
                {
                alt12=3;
                }
                break;
            case 16:
                {
                alt12=4;
                }
                break;
            case 17:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalExpressionDsl.g:1320:2: ( ( '<' ) )
                    {
                    // InternalExpressionDsl.g:1320:2: ( ( '<' ) )
                    // InternalExpressionDsl.g:1321:3: ( '<' )
                    {
                     before(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 
                    // InternalExpressionDsl.g:1322:3: ( '<' )
                    // InternalExpressionDsl.g:1322:4: '<'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1326:2: ( ( '<=' ) )
                    {
                    // InternalExpressionDsl.g:1326:2: ( ( '<=' ) )
                    // InternalExpressionDsl.g:1327:3: ( '<=' )
                    {
                     before(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1()); 
                    // InternalExpressionDsl.g:1328:3: ( '<=' )
                    // InternalExpressionDsl.g:1328:4: '<='
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:1332:2: ( ( '=' ) )
                    {
                    // InternalExpressionDsl.g:1332:2: ( ( '=' ) )
                    // InternalExpressionDsl.g:1333:3: ( '=' )
                    {
                     before(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalExpressionDsl.g:1334:3: ( '=' )
                    // InternalExpressionDsl.g:1334:4: '='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressionDsl.g:1338:2: ( ( '>=' ) )
                    {
                    // InternalExpressionDsl.g:1338:2: ( ( '>=' ) )
                    // InternalExpressionDsl.g:1339:3: ( '>=' )
                    {
                     before(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3()); 
                    // InternalExpressionDsl.g:1340:3: ( '>=' )
                    // InternalExpressionDsl.g:1340:4: '>='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressionDsl.g:1344:2: ( ( '>' ) )
                    {
                    // InternalExpressionDsl.g:1344:2: ( ( '>' ) )
                    // InternalExpressionDsl.g:1345:3: ( '>' )
                    {
                     before(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4()); 
                    // InternalExpressionDsl.g:1346:3: ( '>' )
                    // InternalExpressionDsl.g:1346:4: '>'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__EvoRelativeVersionRestrictionOperator__Alternatives"


    // $ANTLR start "rule__EvoVariableType__Alternatives"
    // InternalExpressionDsl.g:1354:1: rule__EvoVariableType__Alternatives : ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) );
    public final void rule__EvoVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1358:1: ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt13=1;
                }
                break;
            case 19:
                {
                alt13=2;
                }
                break;
            case 20:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalExpressionDsl.g:1359:2: ( ( '@ident' ) )
                    {
                    // InternalExpressionDsl.g:1359:2: ( ( '@ident' ) )
                    // InternalExpressionDsl.g:1360:3: ( '@ident' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 
                    // InternalExpressionDsl.g:1361:3: ( '@ident' )
                    // InternalExpressionDsl.g:1361:4: '@ident'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1365:2: ( ( '@pre' ) )
                    {
                    // InternalExpressionDsl.g:1365:2: ( ( '@pre' ) )
                    // InternalExpressionDsl.g:1366:3: ( '@pre' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 
                    // InternalExpressionDsl.g:1367:3: ( '@pre' )
                    // InternalExpressionDsl.g:1367:4: '@pre'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:1371:2: ( ( '@post' ) )
                    {
                    // InternalExpressionDsl.g:1371:2: ( ( '@post' ) )
                    // InternalExpressionDsl.g:1372:3: ( '@post' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); 
                    // InternalExpressionDsl.g:1373:3: ( '@post' )
                    // InternalExpressionDsl.g:1373:4: '@post'
                    {
                    match(input,20,FOLLOW_2); 

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


    // $ANTLR start "rule__HyFeatureTypeEnum__Alternatives"
    // InternalExpressionDsl.g:1381:1: rule__HyFeatureTypeEnum__Alternatives : ( ( ( 'optional' ) ) | ( ( 'mandatory' ) ) );
    public final void rule__HyFeatureTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1385:1: ( ( ( 'optional' ) ) | ( ( 'mandatory' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( (LA14_0==22) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalExpressionDsl.g:1386:2: ( ( 'optional' ) )
                    {
                    // InternalExpressionDsl.g:1386:2: ( ( 'optional' ) )
                    // InternalExpressionDsl.g:1387:3: ( 'optional' )
                    {
                     before(grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0()); 
                    // InternalExpressionDsl.g:1388:3: ( 'optional' )
                    // InternalExpressionDsl.g:1388:4: 'optional'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1392:2: ( ( 'mandatory' ) )
                    {
                    // InternalExpressionDsl.g:1392:2: ( ( 'mandatory' ) )
                    // InternalExpressionDsl.g:1393:3: ( 'mandatory' )
                    {
                     before(grammarAccess.getHyFeatureTypeEnumAccess().getMANDATORYEnumLiteralDeclaration_1()); 
                    // InternalExpressionDsl.g:1394:3: ( 'mandatory' )
                    // InternalExpressionDsl.g:1394:4: 'mandatory'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getHyFeatureTypeEnumAccess().getMANDATORYEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__HyFeatureTypeEnum__Alternatives"


    // $ANTLR start "rule__HyGroupTypeEnum__Alternatives"
    // InternalExpressionDsl.g:1402:1: rule__HyGroupTypeEnum__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'alternative' ) ) );
    public final void rule__HyGroupTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1406:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'alternative' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt15=1;
                }
                break;
            case 24:
                {
                alt15=2;
                }
                break;
            case 25:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalExpressionDsl.g:1407:2: ( ( 'and' ) )
                    {
                    // InternalExpressionDsl.g:1407:2: ( ( 'and' ) )
                    // InternalExpressionDsl.g:1408:3: ( 'and' )
                    {
                     before(grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalExpressionDsl.g:1409:3: ( 'and' )
                    // InternalExpressionDsl.g:1409:4: 'and'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:1413:2: ( ( 'or' ) )
                    {
                    // InternalExpressionDsl.g:1413:2: ( ( 'or' ) )
                    // InternalExpressionDsl.g:1414:3: ( 'or' )
                    {
                     before(grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalExpressionDsl.g:1415:3: ( 'or' )
                    // InternalExpressionDsl.g:1415:4: 'or'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:1419:2: ( ( 'alternative' ) )
                    {
                    // InternalExpressionDsl.g:1419:2: ( ( 'alternative' ) )
                    // InternalExpressionDsl.g:1420:3: ( 'alternative' )
                    {
                     before(grammarAccess.getHyGroupTypeEnumAccess().getALTERNATIVEEnumLiteralDeclaration_2()); 
                    // InternalExpressionDsl.g:1421:3: ( 'alternative' )
                    // InternalExpressionDsl.g:1421:4: 'alternative'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getHyGroupTypeEnumAccess().getALTERNATIVEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__HyGroupTypeEnum__Alternatives"


    // $ANTLR start "rule__EvoElementOf__Group__0"
    // InternalExpressionDsl.g:1429:1: rule__EvoElementOf__Group__0 : rule__EvoElementOf__Group__0__Impl rule__EvoElementOf__Group__1 ;
    public final void rule__EvoElementOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1433:1: ( rule__EvoElementOf__Group__0__Impl rule__EvoElementOf__Group__1 )
            // InternalExpressionDsl.g:1434:2: rule__EvoElementOf__Group__0__Impl rule__EvoElementOf__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EvoElementOf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoElementOf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group__0"


    // $ANTLR start "rule__EvoElementOf__Group__0__Impl"
    // InternalExpressionDsl.g:1441:1: rule__EvoElementOf__Group__0__Impl : ( ruleEvoTerminal ) ;
    public final void rule__EvoElementOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1445:1: ( ( ruleEvoTerminal ) )
            // InternalExpressionDsl.g:1446:1: ( ruleEvoTerminal )
            {
            // InternalExpressionDsl.g:1446:1: ( ruleEvoTerminal )
            // InternalExpressionDsl.g:1447:2: ruleEvoTerminal
            {
             before(grammarAccess.getEvoElementOfAccess().getEvoTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoTerminal();

            state._fsp--;

             after(grammarAccess.getEvoElementOfAccess().getEvoTerminalParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group__0__Impl"


    // $ANTLR start "rule__EvoElementOf__Group__1"
    // InternalExpressionDsl.g:1456:1: rule__EvoElementOf__Group__1 : rule__EvoElementOf__Group__1__Impl ;
    public final void rule__EvoElementOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1460:1: ( rule__EvoElementOf__Group__1__Impl )
            // InternalExpressionDsl.g:1461:2: rule__EvoElementOf__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoElementOf__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group__1"


    // $ANTLR start "rule__EvoElementOf__Group__1__Impl"
    // InternalExpressionDsl.g:1467:1: rule__EvoElementOf__Group__1__Impl : ( ( rule__EvoElementOf__Group_1__0 )* ) ;
    public final void rule__EvoElementOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1471:1: ( ( ( rule__EvoElementOf__Group_1__0 )* ) )
            // InternalExpressionDsl.g:1472:1: ( ( rule__EvoElementOf__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:1472:1: ( ( rule__EvoElementOf__Group_1__0 )* )
            // InternalExpressionDsl.g:1473:2: ( rule__EvoElementOf__Group_1__0 )*
            {
             before(grammarAccess.getEvoElementOfAccess().getGroup_1()); 
            // InternalExpressionDsl.g:1474:2: ( rule__EvoElementOf__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpressionDsl.g:1474:3: rule__EvoElementOf__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EvoElementOf__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEvoElementOfAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group__1__Impl"


    // $ANTLR start "rule__EvoElementOf__Group_1__0"
    // InternalExpressionDsl.g:1483:1: rule__EvoElementOf__Group_1__0 : rule__EvoElementOf__Group_1__0__Impl rule__EvoElementOf__Group_1__1 ;
    public final void rule__EvoElementOf__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1487:1: ( rule__EvoElementOf__Group_1__0__Impl rule__EvoElementOf__Group_1__1 )
            // InternalExpressionDsl.g:1488:2: rule__EvoElementOf__Group_1__0__Impl rule__EvoElementOf__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__EvoElementOf__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoElementOf__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group_1__0"


    // $ANTLR start "rule__EvoElementOf__Group_1__0__Impl"
    // InternalExpressionDsl.g:1495:1: rule__EvoElementOf__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoElementOf__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1499:1: ( ( () ) )
            // InternalExpressionDsl.g:1500:1: ( () )
            {
            // InternalExpressionDsl.g:1500:1: ( () )
            // InternalExpressionDsl.g:1501:2: ()
            {
             before(grammarAccess.getEvoElementOfAccess().getEvoSetElementOfOperand1Action_1_0()); 
            // InternalExpressionDsl.g:1502:2: ()
            // InternalExpressionDsl.g:1502:3: 
            {
            }

             after(grammarAccess.getEvoElementOfAccess().getEvoSetElementOfOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group_1__0__Impl"


    // $ANTLR start "rule__EvoElementOf__Group_1__1"
    // InternalExpressionDsl.g:1510:1: rule__EvoElementOf__Group_1__1 : rule__EvoElementOf__Group_1__1__Impl rule__EvoElementOf__Group_1__2 ;
    public final void rule__EvoElementOf__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1514:1: ( rule__EvoElementOf__Group_1__1__Impl rule__EvoElementOf__Group_1__2 )
            // InternalExpressionDsl.g:1515:2: rule__EvoElementOf__Group_1__1__Impl rule__EvoElementOf__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoElementOf__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoElementOf__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group_1__1"


    // $ANTLR start "rule__EvoElementOf__Group_1__1__Impl"
    // InternalExpressionDsl.g:1522:1: rule__EvoElementOf__Group_1__1__Impl : ( 'elementOf' ) ;
    public final void rule__EvoElementOf__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1526:1: ( ( 'elementOf' ) )
            // InternalExpressionDsl.g:1527:1: ( 'elementOf' )
            {
            // InternalExpressionDsl.g:1527:1: ( 'elementOf' )
            // InternalExpressionDsl.g:1528:2: 'elementOf'
            {
             before(grammarAccess.getEvoElementOfAccess().getElementOfKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEvoElementOfAccess().getElementOfKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group_1__1__Impl"


    // $ANTLR start "rule__EvoElementOf__Group_1__2"
    // InternalExpressionDsl.g:1537:1: rule__EvoElementOf__Group_1__2 : rule__EvoElementOf__Group_1__2__Impl ;
    public final void rule__EvoElementOf__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1541:1: ( rule__EvoElementOf__Group_1__2__Impl )
            // InternalExpressionDsl.g:1542:2: rule__EvoElementOf__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoElementOf__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group_1__2"


    // $ANTLR start "rule__EvoElementOf__Group_1__2__Impl"
    // InternalExpressionDsl.g:1548:1: rule__EvoElementOf__Group_1__2__Impl : ( ( rule__EvoElementOf__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoElementOf__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1552:1: ( ( ( rule__EvoElementOf__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:1553:1: ( ( rule__EvoElementOf__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:1553:1: ( ( rule__EvoElementOf__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:1554:2: ( rule__EvoElementOf__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoElementOfAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:1555:2: ( rule__EvoElementOf__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:1555:3: rule__EvoElementOf__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoElementOf__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoElementOfAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Group_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalExpressionDsl.g:1564:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1568:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalExpressionDsl.g:1569:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalExpressionDsl.g:1576:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1580:1: ( ( RULE_ID ) )
            // InternalExpressionDsl.g:1581:1: ( RULE_ID )
            {
            // InternalExpressionDsl.g:1581:1: ( RULE_ID )
            // InternalExpressionDsl.g:1582:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalExpressionDsl.g:1591:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1595:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalExpressionDsl.g:1596:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalExpressionDsl.g:1602:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1606:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalExpressionDsl.g:1607:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:1607:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalExpressionDsl.g:1608:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalExpressionDsl.g:1609:2: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpressionDsl.g:1609:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalExpressionDsl.g:1618:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1622:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalExpressionDsl.g:1623:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalExpressionDsl.g:1630:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1634:1: ( ( '.' ) )
            // InternalExpressionDsl.g:1635:1: ( '.' )
            {
            // InternalExpressionDsl.g:1635:1: ( '.' )
            // InternalExpressionDsl.g:1636:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalExpressionDsl.g:1645:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1649:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalExpressionDsl.g:1650:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalExpressionDsl.g:1656:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1660:1: ( ( RULE_ID ) )
            // InternalExpressionDsl.g:1661:1: ( RULE_ID )
            {
            // InternalExpressionDsl.g:1661:1: ( RULE_ID )
            // InternalExpressionDsl.g:1662:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EvoNestedExpression__Group__0"
    // InternalExpressionDsl.g:1672:1: rule__EvoNestedExpression__Group__0 : rule__EvoNestedExpression__Group__0__Impl rule__EvoNestedExpression__Group__1 ;
    public final void rule__EvoNestedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1676:1: ( rule__EvoNestedExpression__Group__0__Impl rule__EvoNestedExpression__Group__1 )
            // InternalExpressionDsl.g:1677:2: rule__EvoNestedExpression__Group__0__Impl rule__EvoNestedExpression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoNestedExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoNestedExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNestedExpression__Group__0"


    // $ANTLR start "rule__EvoNestedExpression__Group__0__Impl"
    // InternalExpressionDsl.g:1684:1: rule__EvoNestedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__EvoNestedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1688:1: ( ( '(' ) )
            // InternalExpressionDsl.g:1689:1: ( '(' )
            {
            // InternalExpressionDsl.g:1689:1: ( '(' )
            // InternalExpressionDsl.g:1690:2: '('
            {
             before(grammarAccess.getEvoNestedExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEvoNestedExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNestedExpression__Group__0__Impl"


    // $ANTLR start "rule__EvoNestedExpression__Group__1"
    // InternalExpressionDsl.g:1699:1: rule__EvoNestedExpression__Group__1 : rule__EvoNestedExpression__Group__1__Impl rule__EvoNestedExpression__Group__2 ;
    public final void rule__EvoNestedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1703:1: ( rule__EvoNestedExpression__Group__1__Impl rule__EvoNestedExpression__Group__2 )
            // InternalExpressionDsl.g:1704:2: rule__EvoNestedExpression__Group__1__Impl rule__EvoNestedExpression__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EvoNestedExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoNestedExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNestedExpression__Group__1"


    // $ANTLR start "rule__EvoNestedExpression__Group__1__Impl"
    // InternalExpressionDsl.g:1711:1: rule__EvoNestedExpression__Group__1__Impl : ( ( rule__EvoNestedExpression__OperandAssignment_1 ) ) ;
    public final void rule__EvoNestedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1715:1: ( ( ( rule__EvoNestedExpression__OperandAssignment_1 ) ) )
            // InternalExpressionDsl.g:1716:1: ( ( rule__EvoNestedExpression__OperandAssignment_1 ) )
            {
            // InternalExpressionDsl.g:1716:1: ( ( rule__EvoNestedExpression__OperandAssignment_1 ) )
            // InternalExpressionDsl.g:1717:2: ( rule__EvoNestedExpression__OperandAssignment_1 )
            {
             before(grammarAccess.getEvoNestedExpressionAccess().getOperandAssignment_1()); 
            // InternalExpressionDsl.g:1718:2: ( rule__EvoNestedExpression__OperandAssignment_1 )
            // InternalExpressionDsl.g:1718:3: rule__EvoNestedExpression__OperandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoNestedExpression__OperandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoNestedExpressionAccess().getOperandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNestedExpression__Group__1__Impl"


    // $ANTLR start "rule__EvoNestedExpression__Group__2"
    // InternalExpressionDsl.g:1726:1: rule__EvoNestedExpression__Group__2 : rule__EvoNestedExpression__Group__2__Impl ;
    public final void rule__EvoNestedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1730:1: ( rule__EvoNestedExpression__Group__2__Impl )
            // InternalExpressionDsl.g:1731:2: rule__EvoNestedExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoNestedExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNestedExpression__Group__2"


    // $ANTLR start "rule__EvoNestedExpression__Group__2__Impl"
    // InternalExpressionDsl.g:1737:1: rule__EvoNestedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__EvoNestedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1741:1: ( ( ')' ) )
            // InternalExpressionDsl.g:1742:1: ( ')' )
            {
            // InternalExpressionDsl.g:1742:1: ( ')' )
            // InternalExpressionDsl.g:1743:2: ')'
            {
             before(grammarAccess.getEvoNestedExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEvoNestedExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNestedExpression__Group__2__Impl"


    // $ANTLR start "rule__EvoImplication__Group__0"
    // InternalExpressionDsl.g:1753:1: rule__EvoImplication__Group__0 : rule__EvoImplication__Group__0__Impl rule__EvoImplication__Group__1 ;
    public final void rule__EvoImplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1757:1: ( rule__EvoImplication__Group__0__Impl rule__EvoImplication__Group__1 )
            // InternalExpressionDsl.g:1758:2: rule__EvoImplication__Group__0__Impl rule__EvoImplication__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EvoImplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoImplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group__0"


    // $ANTLR start "rule__EvoImplication__Group__0__Impl"
    // InternalExpressionDsl.g:1765:1: rule__EvoImplication__Group__0__Impl : ( ruleEvoBiconditional ) ;
    public final void rule__EvoImplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1769:1: ( ( ruleEvoBiconditional ) )
            // InternalExpressionDsl.g:1770:1: ( ruleEvoBiconditional )
            {
            // InternalExpressionDsl.g:1770:1: ( ruleEvoBiconditional )
            // InternalExpressionDsl.g:1771:2: ruleEvoBiconditional
            {
             before(grammarAccess.getEvoImplicationAccess().getEvoBiconditionalParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoBiconditional();

            state._fsp--;

             after(grammarAccess.getEvoImplicationAccess().getEvoBiconditionalParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group__0__Impl"


    // $ANTLR start "rule__EvoImplication__Group__1"
    // InternalExpressionDsl.g:1780:1: rule__EvoImplication__Group__1 : rule__EvoImplication__Group__1__Impl ;
    public final void rule__EvoImplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1784:1: ( rule__EvoImplication__Group__1__Impl )
            // InternalExpressionDsl.g:1785:2: rule__EvoImplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoImplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group__1"


    // $ANTLR start "rule__EvoImplication__Group__1__Impl"
    // InternalExpressionDsl.g:1791:1: rule__EvoImplication__Group__1__Impl : ( ( rule__EvoImplication__Group_1__0 )* ) ;
    public final void rule__EvoImplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1795:1: ( ( ( rule__EvoImplication__Group_1__0 )* ) )
            // InternalExpressionDsl.g:1796:1: ( ( rule__EvoImplication__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:1796:1: ( ( rule__EvoImplication__Group_1__0 )* )
            // InternalExpressionDsl.g:1797:2: ( rule__EvoImplication__Group_1__0 )*
            {
             before(grammarAccess.getEvoImplicationAccess().getGroup_1()); 
            // InternalExpressionDsl.g:1798:2: ( rule__EvoImplication__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExpressionDsl.g:1798:3: rule__EvoImplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EvoImplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEvoImplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group__1__Impl"


    // $ANTLR start "rule__EvoImplication__Group_1__0"
    // InternalExpressionDsl.g:1807:1: rule__EvoImplication__Group_1__0 : rule__EvoImplication__Group_1__0__Impl rule__EvoImplication__Group_1__1 ;
    public final void rule__EvoImplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1811:1: ( rule__EvoImplication__Group_1__0__Impl rule__EvoImplication__Group_1__1 )
            // InternalExpressionDsl.g:1812:2: rule__EvoImplication__Group_1__0__Impl rule__EvoImplication__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__EvoImplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoImplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group_1__0"


    // $ANTLR start "rule__EvoImplication__Group_1__0__Impl"
    // InternalExpressionDsl.g:1819:1: rule__EvoImplication__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoImplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1823:1: ( ( () ) )
            // InternalExpressionDsl.g:1824:1: ( () )
            {
            // InternalExpressionDsl.g:1824:1: ( () )
            // InternalExpressionDsl.g:1825:2: ()
            {
             before(grammarAccess.getEvoImplicationAccess().getEvoImplicationOperand1Action_1_0()); 
            // InternalExpressionDsl.g:1826:2: ()
            // InternalExpressionDsl.g:1826:3: 
            {
            }

             after(grammarAccess.getEvoImplicationAccess().getEvoImplicationOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group_1__0__Impl"


    // $ANTLR start "rule__EvoImplication__Group_1__1"
    // InternalExpressionDsl.g:1834:1: rule__EvoImplication__Group_1__1 : rule__EvoImplication__Group_1__1__Impl rule__EvoImplication__Group_1__2 ;
    public final void rule__EvoImplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1838:1: ( rule__EvoImplication__Group_1__1__Impl rule__EvoImplication__Group_1__2 )
            // InternalExpressionDsl.g:1839:2: rule__EvoImplication__Group_1__1__Impl rule__EvoImplication__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__EvoImplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoImplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group_1__1"


    // $ANTLR start "rule__EvoImplication__Group_1__1__Impl"
    // InternalExpressionDsl.g:1846:1: rule__EvoImplication__Group_1__1__Impl : ( '->' ) ;
    public final void rule__EvoImplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1850:1: ( ( '->' ) )
            // InternalExpressionDsl.g:1851:1: ( '->' )
            {
            // InternalExpressionDsl.g:1851:1: ( '->' )
            // InternalExpressionDsl.g:1852:2: '->'
            {
             before(grammarAccess.getEvoImplicationAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEvoImplicationAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group_1__1__Impl"


    // $ANTLR start "rule__EvoImplication__Group_1__2"
    // InternalExpressionDsl.g:1861:1: rule__EvoImplication__Group_1__2 : rule__EvoImplication__Group_1__2__Impl ;
    public final void rule__EvoImplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1865:1: ( rule__EvoImplication__Group_1__2__Impl )
            // InternalExpressionDsl.g:1866:2: rule__EvoImplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoImplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group_1__2"


    // $ANTLR start "rule__EvoImplication__Group_1__2__Impl"
    // InternalExpressionDsl.g:1872:1: rule__EvoImplication__Group_1__2__Impl : ( ( rule__EvoImplication__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoImplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1876:1: ( ( ( rule__EvoImplication__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:1877:1: ( ( rule__EvoImplication__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:1877:1: ( ( rule__EvoImplication__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:1878:2: ( rule__EvoImplication__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoImplicationAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:1879:2: ( rule__EvoImplication__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:1879:3: rule__EvoImplication__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoImplication__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoImplicationAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Group_1__2__Impl"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__0"
    // InternalExpressionDsl.g:1888:1: rule__EvoRelativeVersionRestriction__Group__0 : rule__EvoRelativeVersionRestriction__Group__0__Impl rule__EvoRelativeVersionRestriction__Group__1 ;
    public final void rule__EvoRelativeVersionRestriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1892:1: ( rule__EvoRelativeVersionRestriction__Group__0__Impl rule__EvoRelativeVersionRestriction__Group__1 )
            // InternalExpressionDsl.g:1893:2: rule__EvoRelativeVersionRestriction__Group__0__Impl rule__EvoRelativeVersionRestriction__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EvoRelativeVersionRestriction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestriction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__0"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__0__Impl"
    // InternalExpressionDsl.g:1900:1: rule__EvoRelativeVersionRestriction__Group__0__Impl : ( '[' ) ;
    public final void rule__EvoRelativeVersionRestriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1904:1: ( ( '[' ) )
            // InternalExpressionDsl.g:1905:1: ( '[' )
            {
            // InternalExpressionDsl.g:1905:1: ( '[' )
            // InternalExpressionDsl.g:1906:2: '['
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__0__Impl"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__1"
    // InternalExpressionDsl.g:1915:1: rule__EvoRelativeVersionRestriction__Group__1 : rule__EvoRelativeVersionRestriction__Group__1__Impl rule__EvoRelativeVersionRestriction__Group__2 ;
    public final void rule__EvoRelativeVersionRestriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1919:1: ( rule__EvoRelativeVersionRestriction__Group__1__Impl rule__EvoRelativeVersionRestriction__Group__2 )
            // InternalExpressionDsl.g:1920:2: rule__EvoRelativeVersionRestriction__Group__1__Impl rule__EvoRelativeVersionRestriction__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EvoRelativeVersionRestriction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestriction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__1"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__1__Impl"
    // InternalExpressionDsl.g:1927:1: rule__EvoRelativeVersionRestriction__Group__1__Impl : ( ( rule__EvoRelativeVersionRestriction__OperatorAssignment_1 ) ) ;
    public final void rule__EvoRelativeVersionRestriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1931:1: ( ( ( rule__EvoRelativeVersionRestriction__OperatorAssignment_1 ) ) )
            // InternalExpressionDsl.g:1932:1: ( ( rule__EvoRelativeVersionRestriction__OperatorAssignment_1 ) )
            {
            // InternalExpressionDsl.g:1932:1: ( ( rule__EvoRelativeVersionRestriction__OperatorAssignment_1 ) )
            // InternalExpressionDsl.g:1933:2: ( rule__EvoRelativeVersionRestriction__OperatorAssignment_1 )
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getOperatorAssignment_1()); 
            // InternalExpressionDsl.g:1934:2: ( rule__EvoRelativeVersionRestriction__OperatorAssignment_1 )
            // InternalExpressionDsl.g:1934:3: rule__EvoRelativeVersionRestriction__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestriction__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__1__Impl"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__2"
    // InternalExpressionDsl.g:1942:1: rule__EvoRelativeVersionRestriction__Group__2 : rule__EvoRelativeVersionRestriction__Group__2__Impl rule__EvoRelativeVersionRestriction__Group__3 ;
    public final void rule__EvoRelativeVersionRestriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1946:1: ( rule__EvoRelativeVersionRestriction__Group__2__Impl rule__EvoRelativeVersionRestriction__Group__3 )
            // InternalExpressionDsl.g:1947:2: rule__EvoRelativeVersionRestriction__Group__2__Impl rule__EvoRelativeVersionRestriction__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__EvoRelativeVersionRestriction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestriction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__2"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__2__Impl"
    // InternalExpressionDsl.g:1954:1: rule__EvoRelativeVersionRestriction__Group__2__Impl : ( ( rule__EvoRelativeVersionRestriction__VersionAssignment_2 ) ) ;
    public final void rule__EvoRelativeVersionRestriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1958:1: ( ( ( rule__EvoRelativeVersionRestriction__VersionAssignment_2 ) ) )
            // InternalExpressionDsl.g:1959:1: ( ( rule__EvoRelativeVersionRestriction__VersionAssignment_2 ) )
            {
            // InternalExpressionDsl.g:1959:1: ( ( rule__EvoRelativeVersionRestriction__VersionAssignment_2 ) )
            // InternalExpressionDsl.g:1960:2: ( rule__EvoRelativeVersionRestriction__VersionAssignment_2 )
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getVersionAssignment_2()); 
            // InternalExpressionDsl.g:1961:2: ( rule__EvoRelativeVersionRestriction__VersionAssignment_2 )
            // InternalExpressionDsl.g:1961:3: rule__EvoRelativeVersionRestriction__VersionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestriction__VersionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getVersionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__2__Impl"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__3"
    // InternalExpressionDsl.g:1969:1: rule__EvoRelativeVersionRestriction__Group__3 : rule__EvoRelativeVersionRestriction__Group__3__Impl ;
    public final void rule__EvoRelativeVersionRestriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1973:1: ( rule__EvoRelativeVersionRestriction__Group__3__Impl )
            // InternalExpressionDsl.g:1974:2: rule__EvoRelativeVersionRestriction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoRelativeVersionRestriction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__3"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__Group__3__Impl"
    // InternalExpressionDsl.g:1980:1: rule__EvoRelativeVersionRestriction__Group__3__Impl : ( ']' ) ;
    public final void rule__EvoRelativeVersionRestriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:1984:1: ( ( ']' ) )
            // InternalExpressionDsl.g:1985:1: ( ']' )
            {
            // InternalExpressionDsl.g:1985:1: ( ']' )
            // InternalExpressionDsl.g:1986:2: ']'
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getRightSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__Group__3__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_0__0"
    // InternalExpressionDsl.g:1996:1: rule__EvoVersionRangeRestriction__Group_0__0 : rule__EvoVersionRangeRestriction__Group_0__0__Impl rule__EvoVersionRangeRestriction__Group_0__1 ;
    public final void rule__EvoVersionRangeRestriction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2000:1: ( rule__EvoVersionRangeRestriction__Group_0__0__Impl rule__EvoVersionRangeRestriction__Group_0__1 )
            // InternalExpressionDsl.g:2001:2: rule__EvoVersionRangeRestriction__Group_0__0__Impl rule__EvoVersionRangeRestriction__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__EvoVersionRangeRestriction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_0__0"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_0__0__Impl"
    // InternalExpressionDsl.g:2008:1: rule__EvoVersionRangeRestriction__Group_0__0__Impl : ( '[' ) ;
    public final void rule__EvoVersionRangeRestriction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2012:1: ( ( '[' ) )
            // InternalExpressionDsl.g:2013:1: ( '[' )
            {
            // InternalExpressionDsl.g:2013:1: ( '[' )
            // InternalExpressionDsl.g:2014:2: '['
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_0__0__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_0__1"
    // InternalExpressionDsl.g:2023:1: rule__EvoVersionRangeRestriction__Group_0__1 : rule__EvoVersionRangeRestriction__Group_0__1__Impl ;
    public final void rule__EvoVersionRangeRestriction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2027:1: ( rule__EvoVersionRangeRestriction__Group_0__1__Impl )
            // InternalExpressionDsl.g:2028:2: rule__EvoVersionRangeRestriction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_0__1"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_0__1__Impl"
    // InternalExpressionDsl.g:2034:1: rule__EvoVersionRangeRestriction__Group_0__1__Impl : ( ( rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1 ) ) ;
    public final void rule__EvoVersionRangeRestriction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2038:1: ( ( ( rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1 ) ) )
            // InternalExpressionDsl.g:2039:1: ( ( rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1 ) )
            {
            // InternalExpressionDsl.g:2039:1: ( ( rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1 ) )
            // InternalExpressionDsl.g:2040:2: ( rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1 )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerIncludedAssignment_0_1()); 
            // InternalExpressionDsl.g:2041:2: ( rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1 )
            // InternalExpressionDsl.g:2041:3: rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerIncludedAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_0__1__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__0"
    // InternalExpressionDsl.g:2050:1: rule__EvoVersionRangeRestriction__Group_1__0 : rule__EvoVersionRangeRestriction__Group_1__0__Impl rule__EvoVersionRangeRestriction__Group_1__1 ;
    public final void rule__EvoVersionRangeRestriction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2054:1: ( rule__EvoVersionRangeRestriction__Group_1__0__Impl rule__EvoVersionRangeRestriction__Group_1__1 )
            // InternalExpressionDsl.g:2055:2: rule__EvoVersionRangeRestriction__Group_1__0__Impl rule__EvoVersionRangeRestriction__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__EvoVersionRangeRestriction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__0"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__0__Impl"
    // InternalExpressionDsl.g:2062:1: rule__EvoVersionRangeRestriction__Group_1__0__Impl : ( 'false' ) ;
    public final void rule__EvoVersionRangeRestriction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2066:1: ( ( 'false' ) )
            // InternalExpressionDsl.g:2067:1: ( 'false' )
            {
            // InternalExpressionDsl.g:2067:1: ( 'false' )
            // InternalExpressionDsl.g:2068:2: 'false'
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getFalseKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__0__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__1"
    // InternalExpressionDsl.g:2077:1: rule__EvoVersionRangeRestriction__Group_1__1 : rule__EvoVersionRangeRestriction__Group_1__1__Impl rule__EvoVersionRangeRestriction__Group_1__2 ;
    public final void rule__EvoVersionRangeRestriction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2081:1: ( rule__EvoVersionRangeRestriction__Group_1__1__Impl rule__EvoVersionRangeRestriction__Group_1__2 )
            // InternalExpressionDsl.g:2082:2: rule__EvoVersionRangeRestriction__Group_1__1__Impl rule__EvoVersionRangeRestriction__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__EvoVersionRangeRestriction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__1"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__1__Impl"
    // InternalExpressionDsl.g:2089:1: rule__EvoVersionRangeRestriction__Group_1__1__Impl : ( ( rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1 ) ) ;
    public final void rule__EvoVersionRangeRestriction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2093:1: ( ( ( rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1 ) ) )
            // InternalExpressionDsl.g:2094:1: ( ( rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1 ) )
            {
            // InternalExpressionDsl.g:2094:1: ( ( rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1 ) )
            // InternalExpressionDsl.g:2095:2: ( rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1 )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerVersionAssignment_1_1()); 
            // InternalExpressionDsl.g:2096:2: ( rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1 )
            // InternalExpressionDsl.g:2096:3: rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerVersionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__1__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__2"
    // InternalExpressionDsl.g:2104:1: rule__EvoVersionRangeRestriction__Group_1__2 : rule__EvoVersionRangeRestriction__Group_1__2__Impl rule__EvoVersionRangeRestriction__Group_1__3 ;
    public final void rule__EvoVersionRangeRestriction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2108:1: ( rule__EvoVersionRangeRestriction__Group_1__2__Impl rule__EvoVersionRangeRestriction__Group_1__3 )
            // InternalExpressionDsl.g:2109:2: rule__EvoVersionRangeRestriction__Group_1__2__Impl rule__EvoVersionRangeRestriction__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__EvoVersionRangeRestriction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__2"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__2__Impl"
    // InternalExpressionDsl.g:2116:1: rule__EvoVersionRangeRestriction__Group_1__2__Impl : ( '-' ) ;
    public final void rule__EvoVersionRangeRestriction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2120:1: ( ( '-' ) )
            // InternalExpressionDsl.g:2121:1: ( '-' )
            {
            // InternalExpressionDsl.g:2121:1: ( '-' )
            // InternalExpressionDsl.g:2122:2: '-'
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getHyphenMinusKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getHyphenMinusKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__2__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__3"
    // InternalExpressionDsl.g:2131:1: rule__EvoVersionRangeRestriction__Group_1__3 : rule__EvoVersionRangeRestriction__Group_1__3__Impl ;
    public final void rule__EvoVersionRangeRestriction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2135:1: ( rule__EvoVersionRangeRestriction__Group_1__3__Impl )
            // InternalExpressionDsl.g:2136:2: rule__EvoVersionRangeRestriction__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__3"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_1__3__Impl"
    // InternalExpressionDsl.g:2142:1: rule__EvoVersionRangeRestriction__Group_1__3__Impl : ( ( rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3 ) ) ;
    public final void rule__EvoVersionRangeRestriction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2146:1: ( ( ( rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3 ) ) )
            // InternalExpressionDsl.g:2147:1: ( ( rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3 ) )
            {
            // InternalExpressionDsl.g:2147:1: ( ( rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3 ) )
            // InternalExpressionDsl.g:2148:2: ( rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3 )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperIncludedAssignment_1_3()); 
            // InternalExpressionDsl.g:2149:2: ( rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3 )
            // InternalExpressionDsl.g:2149:3: rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperIncludedAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_1__3__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_2__0"
    // InternalExpressionDsl.g:2158:1: rule__EvoVersionRangeRestriction__Group_2__0 : rule__EvoVersionRangeRestriction__Group_2__0__Impl rule__EvoVersionRangeRestriction__Group_2__1 ;
    public final void rule__EvoVersionRangeRestriction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2162:1: ( rule__EvoVersionRangeRestriction__Group_2__0__Impl rule__EvoVersionRangeRestriction__Group_2__1 )
            // InternalExpressionDsl.g:2163:2: rule__EvoVersionRangeRestriction__Group_2__0__Impl rule__EvoVersionRangeRestriction__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__EvoVersionRangeRestriction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_2__0"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_2__0__Impl"
    // InternalExpressionDsl.g:2170:1: rule__EvoVersionRangeRestriction__Group_2__0__Impl : ( 'false' ) ;
    public final void rule__EvoVersionRangeRestriction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2174:1: ( ( 'false' ) )
            // InternalExpressionDsl.g:2175:1: ( 'false' )
            {
            // InternalExpressionDsl.g:2175:1: ( 'false' )
            // InternalExpressionDsl.g:2176:2: 'false'
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getFalseKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getFalseKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_2__0__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_2__1"
    // InternalExpressionDsl.g:2185:1: rule__EvoVersionRangeRestriction__Group_2__1 : rule__EvoVersionRangeRestriction__Group_2__1__Impl rule__EvoVersionRangeRestriction__Group_2__2 ;
    public final void rule__EvoVersionRangeRestriction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2189:1: ( rule__EvoVersionRangeRestriction__Group_2__1__Impl rule__EvoVersionRangeRestriction__Group_2__2 )
            // InternalExpressionDsl.g:2190:2: rule__EvoVersionRangeRestriction__Group_2__1__Impl rule__EvoVersionRangeRestriction__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__EvoVersionRangeRestriction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_2__1"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_2__1__Impl"
    // InternalExpressionDsl.g:2197:1: rule__EvoVersionRangeRestriction__Group_2__1__Impl : ( ( rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1 ) ) ;
    public final void rule__EvoVersionRangeRestriction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2201:1: ( ( ( rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1 ) ) )
            // InternalExpressionDsl.g:2202:1: ( ( rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1 ) )
            {
            // InternalExpressionDsl.g:2202:1: ( ( rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1 ) )
            // InternalExpressionDsl.g:2203:2: ( rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1 )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperVersionAssignment_2_1()); 
            // InternalExpressionDsl.g:2204:2: ( rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1 )
            // InternalExpressionDsl.g:2204:3: rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperVersionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_2__1__Impl"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_2__2"
    // InternalExpressionDsl.g:2212:1: rule__EvoVersionRangeRestriction__Group_2__2 : rule__EvoVersionRangeRestriction__Group_2__2__Impl ;
    public final void rule__EvoVersionRangeRestriction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2216:1: ( rule__EvoVersionRangeRestriction__Group_2__2__Impl )
            // InternalExpressionDsl.g:2217:2: rule__EvoVersionRangeRestriction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoVersionRangeRestriction__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_2__2"


    // $ANTLR start "rule__EvoVersionRangeRestriction__Group_2__2__Impl"
    // InternalExpressionDsl.g:2223:1: rule__EvoVersionRangeRestriction__Group_2__2__Impl : ( ']' ) ;
    public final void rule__EvoVersionRangeRestriction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2227:1: ( ( ']' ) )
            // InternalExpressionDsl.g:2228:1: ( ']' )
            {
            // InternalExpressionDsl.g:2228:1: ( ']' )
            // InternalExpressionDsl.g:2229:2: ']'
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__Group_2__2__Impl"


    // $ANTLR start "rule__EvoBooleanValue__Group__0"
    // InternalExpressionDsl.g:2239:1: rule__EvoBooleanValue__Group__0 : rule__EvoBooleanValue__Group__0__Impl rule__EvoBooleanValue__Group__1 ;
    public final void rule__EvoBooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2243:1: ( rule__EvoBooleanValue__Group__0__Impl rule__EvoBooleanValue__Group__1 )
            // InternalExpressionDsl.g:2244:2: rule__EvoBooleanValue__Group__0__Impl rule__EvoBooleanValue__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EvoBooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoBooleanValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBooleanValue__Group__0"


    // $ANTLR start "rule__EvoBooleanValue__Group__0__Impl"
    // InternalExpressionDsl.g:2251:1: rule__EvoBooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__EvoBooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2255:1: ( ( () ) )
            // InternalExpressionDsl.g:2256:1: ( () )
            {
            // InternalExpressionDsl.g:2256:1: ( () )
            // InternalExpressionDsl.g:2257:2: ()
            {
             before(grammarAccess.getEvoBooleanValueAccess().getHyBooleanValueAction_0()); 
            // InternalExpressionDsl.g:2258:2: ()
            // InternalExpressionDsl.g:2258:3: 
            {
            }

             after(grammarAccess.getEvoBooleanValueAccess().getHyBooleanValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBooleanValue__Group__0__Impl"


    // $ANTLR start "rule__EvoBooleanValue__Group__1"
    // InternalExpressionDsl.g:2266:1: rule__EvoBooleanValue__Group__1 : rule__EvoBooleanValue__Group__1__Impl ;
    public final void rule__EvoBooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2270:1: ( rule__EvoBooleanValue__Group__1__Impl )
            // InternalExpressionDsl.g:2271:2: rule__EvoBooleanValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoBooleanValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBooleanValue__Group__1"


    // $ANTLR start "rule__EvoBooleanValue__Group__1__Impl"
    // InternalExpressionDsl.g:2277:1: rule__EvoBooleanValue__Group__1__Impl : ( ( rule__EvoBooleanValue__Alternatives_1 ) ) ;
    public final void rule__EvoBooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2281:1: ( ( ( rule__EvoBooleanValue__Alternatives_1 ) ) )
            // InternalExpressionDsl.g:2282:1: ( ( rule__EvoBooleanValue__Alternatives_1 ) )
            {
            // InternalExpressionDsl.g:2282:1: ( ( rule__EvoBooleanValue__Alternatives_1 ) )
            // InternalExpressionDsl.g:2283:2: ( rule__EvoBooleanValue__Alternatives_1 )
            {
             before(grammarAccess.getEvoBooleanValueAccess().getAlternatives_1()); 
            // InternalExpressionDsl.g:2284:2: ( rule__EvoBooleanValue__Alternatives_1 )
            // InternalExpressionDsl.g:2284:3: rule__EvoBooleanValue__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoBooleanValue__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoBooleanValueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBooleanValue__Group__1__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group__0"
    // InternalExpressionDsl.g:2293:1: rule__EvoEnumLiteral__Group__0 : rule__EvoEnumLiteral__Group__0__Impl rule__EvoEnumLiteral__Group__1 ;
    public final void rule__EvoEnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2297:1: ( rule__EvoEnumLiteral__Group__0__Impl rule__EvoEnumLiteral__Group__1 )
            // InternalExpressionDsl.g:2298:2: rule__EvoEnumLiteral__Group__0__Impl rule__EvoEnumLiteral__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EvoEnumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__0"


    // $ANTLR start "rule__EvoEnumLiteral__Group__0__Impl"
    // InternalExpressionDsl.g:2305:1: rule__EvoEnumLiteral__Group__0__Impl : ( 'EnumLiteral(' ) ;
    public final void rule__EvoEnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2309:1: ( ( 'EnumLiteral(' ) )
            // InternalExpressionDsl.g:2310:1: ( 'EnumLiteral(' )
            {
            // InternalExpressionDsl.g:2310:1: ( 'EnumLiteral(' )
            // InternalExpressionDsl.g:2311:2: 'EnumLiteral('
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getEnumLiteralKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getEnumLiteralKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group__1"
    // InternalExpressionDsl.g:2320:1: rule__EvoEnumLiteral__Group__1 : rule__EvoEnumLiteral__Group__1__Impl rule__EvoEnumLiteral__Group__2 ;
    public final void rule__EvoEnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2324:1: ( rule__EvoEnumLiteral__Group__1__Impl rule__EvoEnumLiteral__Group__2 )
            // InternalExpressionDsl.g:2325:2: rule__EvoEnumLiteral__Group__1__Impl rule__EvoEnumLiteral__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__EvoEnumLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__1"


    // $ANTLR start "rule__EvoEnumLiteral__Group__1__Impl"
    // InternalExpressionDsl.g:2332:1: rule__EvoEnumLiteral__Group__1__Impl : ( ( rule__EvoEnumLiteral__NameAssignment_1 ) ) ;
    public final void rule__EvoEnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2336:1: ( ( ( rule__EvoEnumLiteral__NameAssignment_1 ) ) )
            // InternalExpressionDsl.g:2337:1: ( ( rule__EvoEnumLiteral__NameAssignment_1 ) )
            {
            // InternalExpressionDsl.g:2337:1: ( ( rule__EvoEnumLiteral__NameAssignment_1 ) )
            // InternalExpressionDsl.g:2338:2: ( rule__EvoEnumLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getNameAssignment_1()); 
            // InternalExpressionDsl.g:2339:2: ( rule__EvoEnumLiteral__NameAssignment_1 )
            // InternalExpressionDsl.g:2339:3: rule__EvoEnumLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group__2"
    // InternalExpressionDsl.g:2347:1: rule__EvoEnumLiteral__Group__2 : rule__EvoEnumLiteral__Group__2__Impl rule__EvoEnumLiteral__Group__3 ;
    public final void rule__EvoEnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2351:1: ( rule__EvoEnumLiteral__Group__2__Impl rule__EvoEnumLiteral__Group__3 )
            // InternalExpressionDsl.g:2352:2: rule__EvoEnumLiteral__Group__2__Impl rule__EvoEnumLiteral__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__EvoEnumLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__2"


    // $ANTLR start "rule__EvoEnumLiteral__Group__2__Impl"
    // InternalExpressionDsl.g:2359:1: rule__EvoEnumLiteral__Group__2__Impl : ( ',' ) ;
    public final void rule__EvoEnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2363:1: ( ( ',' ) )
            // InternalExpressionDsl.g:2364:1: ( ',' )
            {
            // InternalExpressionDsl.g:2364:1: ( ',' )
            // InternalExpressionDsl.g:2365:2: ','
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getCommaKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__2__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group__3"
    // InternalExpressionDsl.g:2374:1: rule__EvoEnumLiteral__Group__3 : rule__EvoEnumLiteral__Group__3__Impl rule__EvoEnumLiteral__Group__4 ;
    public final void rule__EvoEnumLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2378:1: ( rule__EvoEnumLiteral__Group__3__Impl rule__EvoEnumLiteral__Group__4 )
            // InternalExpressionDsl.g:2379:2: rule__EvoEnumLiteral__Group__3__Impl rule__EvoEnumLiteral__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__EvoEnumLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__3"


    // $ANTLR start "rule__EvoEnumLiteral__Group__3__Impl"
    // InternalExpressionDsl.g:2386:1: rule__EvoEnumLiteral__Group__3__Impl : ( ( rule__EvoEnumLiteral__ValueAssignment_3 ) ) ;
    public final void rule__EvoEnumLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2390:1: ( ( ( rule__EvoEnumLiteral__ValueAssignment_3 ) ) )
            // InternalExpressionDsl.g:2391:1: ( ( rule__EvoEnumLiteral__ValueAssignment_3 ) )
            {
            // InternalExpressionDsl.g:2391:1: ( ( rule__EvoEnumLiteral__ValueAssignment_3 ) )
            // InternalExpressionDsl.g:2392:2: ( rule__EvoEnumLiteral__ValueAssignment_3 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValueAssignment_3()); 
            // InternalExpressionDsl.g:2393:2: ( rule__EvoEnumLiteral__ValueAssignment_3 )
            // InternalExpressionDsl.g:2393:3: rule__EvoEnumLiteral__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__3__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group__4"
    // InternalExpressionDsl.g:2401:1: rule__EvoEnumLiteral__Group__4 : rule__EvoEnumLiteral__Group__4__Impl rule__EvoEnumLiteral__Group__5 ;
    public final void rule__EvoEnumLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2405:1: ( rule__EvoEnumLiteral__Group__4__Impl rule__EvoEnumLiteral__Group__5 )
            // InternalExpressionDsl.g:2406:2: rule__EvoEnumLiteral__Group__4__Impl rule__EvoEnumLiteral__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__EvoEnumLiteral__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__4"


    // $ANTLR start "rule__EvoEnumLiteral__Group__4__Impl"
    // InternalExpressionDsl.g:2413:1: rule__EvoEnumLiteral__Group__4__Impl : ( ')' ) ;
    public final void rule__EvoEnumLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2417:1: ( ( ')' ) )
            // InternalExpressionDsl.g:2418:1: ( ')' )
            {
            // InternalExpressionDsl.g:2418:1: ( ')' )
            // InternalExpressionDsl.g:2419:2: ')'
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__4__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group__5"
    // InternalExpressionDsl.g:2428:1: rule__EvoEnumLiteral__Group__5 : rule__EvoEnumLiteral__Group__5__Impl ;
    public final void rule__EvoEnumLiteral__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2432:1: ( rule__EvoEnumLiteral__Group__5__Impl )
            // InternalExpressionDsl.g:2433:2: rule__EvoEnumLiteral__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__5"


    // $ANTLR start "rule__EvoEnumLiteral__Group__5__Impl"
    // InternalExpressionDsl.g:2439:1: rule__EvoEnumLiteral__Group__5__Impl : ( ( rule__EvoEnumLiteral__Group_5__0 )? ) ;
    public final void rule__EvoEnumLiteral__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2443:1: ( ( ( rule__EvoEnumLiteral__Group_5__0 )? ) )
            // InternalExpressionDsl.g:2444:1: ( ( rule__EvoEnumLiteral__Group_5__0 )? )
            {
            // InternalExpressionDsl.g:2444:1: ( ( rule__EvoEnumLiteral__Group_5__0 )? )
            // InternalExpressionDsl.g:2445:2: ( rule__EvoEnumLiteral__Group_5__0 )?
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getGroup_5()); 
            // InternalExpressionDsl.g:2446:2: ( rule__EvoEnumLiteral__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalExpressionDsl.g:2446:3: rule__EvoEnumLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoEnumLiteral__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoEnumLiteralAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group__5__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5__0"
    // InternalExpressionDsl.g:2455:1: rule__EvoEnumLiteral__Group_5__0 : rule__EvoEnumLiteral__Group_5__0__Impl rule__EvoEnumLiteral__Group_5__1 ;
    public final void rule__EvoEnumLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2459:1: ( rule__EvoEnumLiteral__Group_5__0__Impl rule__EvoEnumLiteral__Group_5__1 )
            // InternalExpressionDsl.g:2460:2: rule__EvoEnumLiteral__Group_5__0__Impl rule__EvoEnumLiteral__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__EvoEnumLiteral__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5__0"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5__0__Impl"
    // InternalExpressionDsl.g:2467:1: rule__EvoEnumLiteral__Group_5__0__Impl : ( '[' ) ;
    public final void rule__EvoEnumLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2471:1: ( ( '[' ) )
            // InternalExpressionDsl.g:2472:1: ( '[' )
            {
            // InternalExpressionDsl.g:2472:1: ( '[' )
            // InternalExpressionDsl.g:2473:2: '['
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5__0__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5__1"
    // InternalExpressionDsl.g:2482:1: rule__EvoEnumLiteral__Group_5__1 : rule__EvoEnumLiteral__Group_5__1__Impl rule__EvoEnumLiteral__Group_5__2 ;
    public final void rule__EvoEnumLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2486:1: ( rule__EvoEnumLiteral__Group_5__1__Impl rule__EvoEnumLiteral__Group_5__2 )
            // InternalExpressionDsl.g:2487:2: rule__EvoEnumLiteral__Group_5__1__Impl rule__EvoEnumLiteral__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__EvoEnumLiteral__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5__1"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5__1__Impl"
    // InternalExpressionDsl.g:2494:1: rule__EvoEnumLiteral__Group_5__1__Impl : ( ( rule__EvoEnumLiteral__Alternatives_5_1 ) ) ;
    public final void rule__EvoEnumLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2498:1: ( ( ( rule__EvoEnumLiteral__Alternatives_5_1 ) ) )
            // InternalExpressionDsl.g:2499:1: ( ( rule__EvoEnumLiteral__Alternatives_5_1 ) )
            {
            // InternalExpressionDsl.g:2499:1: ( ( rule__EvoEnumLiteral__Alternatives_5_1 ) )
            // InternalExpressionDsl.g:2500:2: ( rule__EvoEnumLiteral__Alternatives_5_1 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getAlternatives_5_1()); 
            // InternalExpressionDsl.g:2501:2: ( rule__EvoEnumLiteral__Alternatives_5_1 )
            // InternalExpressionDsl.g:2501:3: rule__EvoEnumLiteral__Alternatives_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Alternatives_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getAlternatives_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5__1__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5__2"
    // InternalExpressionDsl.g:2509:1: rule__EvoEnumLiteral__Group_5__2 : rule__EvoEnumLiteral__Group_5__2__Impl ;
    public final void rule__EvoEnumLiteral__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2513:1: ( rule__EvoEnumLiteral__Group_5__2__Impl )
            // InternalExpressionDsl.g:2514:2: rule__EvoEnumLiteral__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5__2"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5__2__Impl"
    // InternalExpressionDsl.g:2520:1: rule__EvoEnumLiteral__Group_5__2__Impl : ( ']' ) ;
    public final void rule__EvoEnumLiteral__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2524:1: ( ( ']' ) )
            // InternalExpressionDsl.g:2525:1: ( ']' )
            {
            // InternalExpressionDsl.g:2525:1: ( ']' )
            // InternalExpressionDsl.g:2526:2: ']'
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5__2__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_0__0"
    // InternalExpressionDsl.g:2536:1: rule__EvoEnumLiteral__Group_5_1_0__0 : rule__EvoEnumLiteral__Group_5_1_0__0__Impl rule__EvoEnumLiteral__Group_5_1_0__1 ;
    public final void rule__EvoEnumLiteral__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2540:1: ( rule__EvoEnumLiteral__Group_5_1_0__0__Impl rule__EvoEnumLiteral__Group_5_1_0__1 )
            // InternalExpressionDsl.g:2541:2: rule__EvoEnumLiteral__Group_5_1_0__0__Impl rule__EvoEnumLiteral__Group_5_1_0__1
            {
            pushFollow(FOLLOW_16);
            rule__EvoEnumLiteral__Group_5_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_0__0"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_0__0__Impl"
    // InternalExpressionDsl.g:2548:1: rule__EvoEnumLiteral__Group_5_1_0__0__Impl : ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0 ) ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2552:1: ( ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0 ) ) )
            // InternalExpressionDsl.g:2553:1: ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0 ) )
            {
            // InternalExpressionDsl.g:2553:1: ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0 ) )
            // InternalExpressionDsl.g:2554:2: ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidSinceAssignment_5_1_0_0()); 
            // InternalExpressionDsl.g:2555:2: ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0 )
            // InternalExpressionDsl.g:2555:3: rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getValidSinceAssignment_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_0__0__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_0__1"
    // InternalExpressionDsl.g:2563:1: rule__EvoEnumLiteral__Group_5_1_0__1 : rule__EvoEnumLiteral__Group_5_1_0__1__Impl rule__EvoEnumLiteral__Group_5_1_0__2 ;
    public final void rule__EvoEnumLiteral__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2567:1: ( rule__EvoEnumLiteral__Group_5_1_0__1__Impl rule__EvoEnumLiteral__Group_5_1_0__2 )
            // InternalExpressionDsl.g:2568:2: rule__EvoEnumLiteral__Group_5_1_0__1__Impl rule__EvoEnumLiteral__Group_5_1_0__2
            {
            pushFollow(FOLLOW_22);
            rule__EvoEnumLiteral__Group_5_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_0__1"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_0__1__Impl"
    // InternalExpressionDsl.g:2575:1: rule__EvoEnumLiteral__Group_5_1_0__1__Impl : ( '-' ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2579:1: ( ( '-' ) )
            // InternalExpressionDsl.g:2580:1: ( '-' )
            {
            // InternalExpressionDsl.g:2580:1: ( '-' )
            // InternalExpressionDsl.g:2581:2: '-'
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_0__1__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_0__2"
    // InternalExpressionDsl.g:2590:1: rule__EvoEnumLiteral__Group_5_1_0__2 : rule__EvoEnumLiteral__Group_5_1_0__2__Impl ;
    public final void rule__EvoEnumLiteral__Group_5_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2594:1: ( rule__EvoEnumLiteral__Group_5_1_0__2__Impl )
            // InternalExpressionDsl.g:2595:2: rule__EvoEnumLiteral__Group_5_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_0__2"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_0__2__Impl"
    // InternalExpressionDsl.g:2601:1: rule__EvoEnumLiteral__Group_5_1_0__2__Impl : ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2 ) ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2605:1: ( ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2 ) ) )
            // InternalExpressionDsl.g:2606:1: ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2 ) )
            {
            // InternalExpressionDsl.g:2606:1: ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2 ) )
            // InternalExpressionDsl.g:2607:2: ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidUntilAssignment_5_1_0_2()); 
            // InternalExpressionDsl.g:2608:2: ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2 )
            // InternalExpressionDsl.g:2608:3: rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getValidUntilAssignment_5_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_0__2__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_1__0"
    // InternalExpressionDsl.g:2617:1: rule__EvoEnumLiteral__Group_5_1_1__0 : rule__EvoEnumLiteral__Group_5_1_1__0__Impl rule__EvoEnumLiteral__Group_5_1_1__1 ;
    public final void rule__EvoEnumLiteral__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2621:1: ( rule__EvoEnumLiteral__Group_5_1_1__0__Impl rule__EvoEnumLiteral__Group_5_1_1__1 )
            // InternalExpressionDsl.g:2622:2: rule__EvoEnumLiteral__Group_5_1_1__0__Impl rule__EvoEnumLiteral__Group_5_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__EvoEnumLiteral__Group_5_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_1__0"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_1__0__Impl"
    // InternalExpressionDsl.g:2629:1: rule__EvoEnumLiteral__Group_5_1_1__0__Impl : ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0 ) ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2633:1: ( ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0 ) ) )
            // InternalExpressionDsl.g:2634:1: ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0 ) )
            {
            // InternalExpressionDsl.g:2634:1: ( ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0 ) )
            // InternalExpressionDsl.g:2635:2: ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidSinceAssignment_5_1_1_0()); 
            // InternalExpressionDsl.g:2636:2: ( rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0 )
            // InternalExpressionDsl.g:2636:3: rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getValidSinceAssignment_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_1__1"
    // InternalExpressionDsl.g:2644:1: rule__EvoEnumLiteral__Group_5_1_1__1 : rule__EvoEnumLiteral__Group_5_1_1__1__Impl ;
    public final void rule__EvoEnumLiteral__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2648:1: ( rule__EvoEnumLiteral__Group_5_1_1__1__Impl )
            // InternalExpressionDsl.g:2649:2: rule__EvoEnumLiteral__Group_5_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_1__1"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_1__1__Impl"
    // InternalExpressionDsl.g:2655:1: rule__EvoEnumLiteral__Group_5_1_1__1__Impl : ( '-' ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2659:1: ( ( '-' ) )
            // InternalExpressionDsl.g:2660:1: ( '-' )
            {
            // InternalExpressionDsl.g:2660:1: ( '-' )
            // InternalExpressionDsl.g:2661:2: '-'
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_2__0"
    // InternalExpressionDsl.g:2671:1: rule__EvoEnumLiteral__Group_5_1_2__0 : rule__EvoEnumLiteral__Group_5_1_2__0__Impl rule__EvoEnumLiteral__Group_5_1_2__1 ;
    public final void rule__EvoEnumLiteral__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2675:1: ( rule__EvoEnumLiteral__Group_5_1_2__0__Impl rule__EvoEnumLiteral__Group_5_1_2__1 )
            // InternalExpressionDsl.g:2676:2: rule__EvoEnumLiteral__Group_5_1_2__0__Impl rule__EvoEnumLiteral__Group_5_1_2__1
            {
            pushFollow(FOLLOW_16);
            rule__EvoEnumLiteral__Group_5_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_2__0"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_2__0__Impl"
    // InternalExpressionDsl.g:2683:1: rule__EvoEnumLiteral__Group_5_1_2__0__Impl : ( 'eternity' ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2687:1: ( ( 'eternity' ) )
            // InternalExpressionDsl.g:2688:1: ( 'eternity' )
            {
            // InternalExpressionDsl.g:2688:1: ( 'eternity' )
            // InternalExpressionDsl.g:2689:2: 'eternity'
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getEternityKeyword_5_1_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getEternityKeyword_5_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_2__0__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_2__1"
    // InternalExpressionDsl.g:2698:1: rule__EvoEnumLiteral__Group_5_1_2__1 : rule__EvoEnumLiteral__Group_5_1_2__1__Impl rule__EvoEnumLiteral__Group_5_1_2__2 ;
    public final void rule__EvoEnumLiteral__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2702:1: ( rule__EvoEnumLiteral__Group_5_1_2__1__Impl rule__EvoEnumLiteral__Group_5_1_2__2 )
            // InternalExpressionDsl.g:2703:2: rule__EvoEnumLiteral__Group_5_1_2__1__Impl rule__EvoEnumLiteral__Group_5_1_2__2
            {
            pushFollow(FOLLOW_22);
            rule__EvoEnumLiteral__Group_5_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_2__1"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_2__1__Impl"
    // InternalExpressionDsl.g:2710:1: rule__EvoEnumLiteral__Group_5_1_2__1__Impl : ( '-' ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2714:1: ( ( '-' ) )
            // InternalExpressionDsl.g:2715:1: ( '-' )
            {
            // InternalExpressionDsl.g:2715:1: ( '-' )
            // InternalExpressionDsl.g:2716:2: '-'
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_2__1__Impl"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_2__2"
    // InternalExpressionDsl.g:2725:1: rule__EvoEnumLiteral__Group_5_1_2__2 : rule__EvoEnumLiteral__Group_5_1_2__2__Impl ;
    public final void rule__EvoEnumLiteral__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2729:1: ( rule__EvoEnumLiteral__Group_5_1_2__2__Impl )
            // InternalExpressionDsl.g:2730:2: rule__EvoEnumLiteral__Group_5_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__Group_5_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_2__2"


    // $ANTLR start "rule__EvoEnumLiteral__Group_5_1_2__2__Impl"
    // InternalExpressionDsl.g:2736:1: rule__EvoEnumLiteral__Group_5_1_2__2__Impl : ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2 ) ) ;
    public final void rule__EvoEnumLiteral__Group_5_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2740:1: ( ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2 ) ) )
            // InternalExpressionDsl.g:2741:1: ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2 ) )
            {
            // InternalExpressionDsl.g:2741:1: ( ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2 ) )
            // InternalExpressionDsl.g:2742:2: ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2 )
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidUntilAssignment_5_1_2_2()); 
            // InternalExpressionDsl.g:2743:2: ( rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2 )
            // InternalExpressionDsl.g:2743:3: rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoEnumLiteralAccess().getValidUntilAssignment_5_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__Group_5_1_2__2__Impl"


    // $ANTLR start "rule__EvoOr__Group__0"
    // InternalExpressionDsl.g:2752:1: rule__EvoOr__Group__0 : rule__EvoOr__Group__0__Impl rule__EvoOr__Group__1 ;
    public final void rule__EvoOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2756:1: ( rule__EvoOr__Group__0__Impl rule__EvoOr__Group__1 )
            // InternalExpressionDsl.g:2757:2: rule__EvoOr__Group__0__Impl rule__EvoOr__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalExpressionDsl.g:2764:1: rule__EvoOr__Group__0__Impl : ( ruleEvoAnd ) ;
    public final void rule__EvoOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2768:1: ( ( ruleEvoAnd ) )
            // InternalExpressionDsl.g:2769:1: ( ruleEvoAnd )
            {
            // InternalExpressionDsl.g:2769:1: ( ruleEvoAnd )
            // InternalExpressionDsl.g:2770:2: ruleEvoAnd
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
    // InternalExpressionDsl.g:2779:1: rule__EvoOr__Group__1 : rule__EvoOr__Group__1__Impl ;
    public final void rule__EvoOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2783:1: ( rule__EvoOr__Group__1__Impl )
            // InternalExpressionDsl.g:2784:2: rule__EvoOr__Group__1__Impl
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
    // InternalExpressionDsl.g:2790:1: rule__EvoOr__Group__1__Impl : ( ( rule__EvoOr__Group_1__0 )* ) ;
    public final void rule__EvoOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2794:1: ( ( ( rule__EvoOr__Group_1__0 )* ) )
            // InternalExpressionDsl.g:2795:1: ( ( rule__EvoOr__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:2795:1: ( ( rule__EvoOr__Group_1__0 )* )
            // InternalExpressionDsl.g:2796:2: ( rule__EvoOr__Group_1__0 )*
            {
             before(grammarAccess.getEvoOrAccess().getGroup_1()); 
            // InternalExpressionDsl.g:2797:2: ( rule__EvoOr__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalExpressionDsl.g:2797:3: rule__EvoOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__EvoOr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalExpressionDsl.g:2806:1: rule__EvoOr__Group_1__0 : rule__EvoOr__Group_1__0__Impl rule__EvoOr__Group_1__1 ;
    public final void rule__EvoOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2810:1: ( rule__EvoOr__Group_1__0__Impl rule__EvoOr__Group_1__1 )
            // InternalExpressionDsl.g:2811:2: rule__EvoOr__Group_1__0__Impl rule__EvoOr__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalExpressionDsl.g:2818:1: rule__EvoOr__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2822:1: ( ( () ) )
            // InternalExpressionDsl.g:2823:1: ( () )
            {
            // InternalExpressionDsl.g:2823:1: ( () )
            // InternalExpressionDsl.g:2824:2: ()
            {
             before(grammarAccess.getEvoOrAccess().getEvoOrOperand1Action_1_0()); 
            // InternalExpressionDsl.g:2825:2: ()
            // InternalExpressionDsl.g:2825:3: 
            {
            }

             after(grammarAccess.getEvoOrAccess().getEvoOrOperand1Action_1_0()); 

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
    // InternalExpressionDsl.g:2833:1: rule__EvoOr__Group_1__1 : rule__EvoOr__Group_1__1__Impl rule__EvoOr__Group_1__2 ;
    public final void rule__EvoOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2837:1: ( rule__EvoOr__Group_1__1__Impl rule__EvoOr__Group_1__2 )
            // InternalExpressionDsl.g:2838:2: rule__EvoOr__Group_1__1__Impl rule__EvoOr__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalExpressionDsl.g:2845:1: rule__EvoOr__Group_1__1__Impl : ( '||' ) ;
    public final void rule__EvoOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2849:1: ( ( '||' ) )
            // InternalExpressionDsl.g:2850:1: ( '||' )
            {
            // InternalExpressionDsl.g:2850:1: ( '||' )
            // InternalExpressionDsl.g:2851:2: '||'
            {
             before(grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
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
    // InternalExpressionDsl.g:2860:1: rule__EvoOr__Group_1__2 : rule__EvoOr__Group_1__2__Impl ;
    public final void rule__EvoOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2864:1: ( rule__EvoOr__Group_1__2__Impl )
            // InternalExpressionDsl.g:2865:2: rule__EvoOr__Group_1__2__Impl
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
    // InternalExpressionDsl.g:2871:1: rule__EvoOr__Group_1__2__Impl : ( ( rule__EvoOr__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2875:1: ( ( ( rule__EvoOr__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:2876:1: ( ( rule__EvoOr__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:2876:1: ( ( rule__EvoOr__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:2877:2: ( rule__EvoOr__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoOrAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:2878:2: ( rule__EvoOr__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:2878:3: rule__EvoOr__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoOr__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoOrAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
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
    // InternalExpressionDsl.g:2887:1: rule__EvoAnd__Group__0 : rule__EvoAnd__Group__0__Impl rule__EvoAnd__Group__1 ;
    public final void rule__EvoAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2891:1: ( rule__EvoAnd__Group__0__Impl rule__EvoAnd__Group__1 )
            // InternalExpressionDsl.g:2892:2: rule__EvoAnd__Group__0__Impl rule__EvoAnd__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalExpressionDsl.g:2899:1: rule__EvoAnd__Group__0__Impl : ( ruleEvoEqual ) ;
    public final void rule__EvoAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2903:1: ( ( ruleEvoEqual ) )
            // InternalExpressionDsl.g:2904:1: ( ruleEvoEqual )
            {
            // InternalExpressionDsl.g:2904:1: ( ruleEvoEqual )
            // InternalExpressionDsl.g:2905:2: ruleEvoEqual
            {
             before(grammarAccess.getEvoAndAccess().getEvoEqualParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoEqual();

            state._fsp--;

             after(grammarAccess.getEvoAndAccess().getEvoEqualParserRuleCall_0()); 

            }


            }

        }
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
    // InternalExpressionDsl.g:2914:1: rule__EvoAnd__Group__1 : rule__EvoAnd__Group__1__Impl ;
    public final void rule__EvoAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2918:1: ( rule__EvoAnd__Group__1__Impl )
            // InternalExpressionDsl.g:2919:2: rule__EvoAnd__Group__1__Impl
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
    // InternalExpressionDsl.g:2925:1: rule__EvoAnd__Group__1__Impl : ( ( rule__EvoAnd__Group_1__0 )* ) ;
    public final void rule__EvoAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2929:1: ( ( ( rule__EvoAnd__Group_1__0 )* ) )
            // InternalExpressionDsl.g:2930:1: ( ( rule__EvoAnd__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:2930:1: ( ( rule__EvoAnd__Group_1__0 )* )
            // InternalExpressionDsl.g:2931:2: ( rule__EvoAnd__Group_1__0 )*
            {
             before(grammarAccess.getEvoAndAccess().getGroup_1()); 
            // InternalExpressionDsl.g:2932:2: ( rule__EvoAnd__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalExpressionDsl.g:2932:3: rule__EvoAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__EvoAnd__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalExpressionDsl.g:2941:1: rule__EvoAnd__Group_1__0 : rule__EvoAnd__Group_1__0__Impl rule__EvoAnd__Group_1__1 ;
    public final void rule__EvoAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2945:1: ( rule__EvoAnd__Group_1__0__Impl rule__EvoAnd__Group_1__1 )
            // InternalExpressionDsl.g:2946:2: rule__EvoAnd__Group_1__0__Impl rule__EvoAnd__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalExpressionDsl.g:2953:1: rule__EvoAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2957:1: ( ( () ) )
            // InternalExpressionDsl.g:2958:1: ( () )
            {
            // InternalExpressionDsl.g:2958:1: ( () )
            // InternalExpressionDsl.g:2959:2: ()
            {
             before(grammarAccess.getEvoAndAccess().getEvoAndOperand1Action_1_0()); 
            // InternalExpressionDsl.g:2960:2: ()
            // InternalExpressionDsl.g:2960:3: 
            {
            }

             after(grammarAccess.getEvoAndAccess().getEvoAndOperand1Action_1_0()); 

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
    // InternalExpressionDsl.g:2968:1: rule__EvoAnd__Group_1__1 : rule__EvoAnd__Group_1__1__Impl rule__EvoAnd__Group_1__2 ;
    public final void rule__EvoAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2972:1: ( rule__EvoAnd__Group_1__1__Impl rule__EvoAnd__Group_1__2 )
            // InternalExpressionDsl.g:2973:2: rule__EvoAnd__Group_1__1__Impl rule__EvoAnd__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalExpressionDsl.g:2980:1: rule__EvoAnd__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__EvoAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2984:1: ( ( '&&' ) )
            // InternalExpressionDsl.g:2985:1: ( '&&' )
            {
            // InternalExpressionDsl.g:2985:1: ( '&&' )
            // InternalExpressionDsl.g:2986:2: '&&'
            {
             before(grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
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
    // InternalExpressionDsl.g:2995:1: rule__EvoAnd__Group_1__2 : rule__EvoAnd__Group_1__2__Impl ;
    public final void rule__EvoAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:2999:1: ( rule__EvoAnd__Group_1__2__Impl )
            // InternalExpressionDsl.g:3000:2: rule__EvoAnd__Group_1__2__Impl
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
    // InternalExpressionDsl.g:3006:1: rule__EvoAnd__Group_1__2__Impl : ( ( rule__EvoAnd__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3010:1: ( ( ( rule__EvoAnd__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3011:1: ( ( rule__EvoAnd__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3011:1: ( ( rule__EvoAnd__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3012:2: ( rule__EvoAnd__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoAndAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3013:2: ( rule__EvoAnd__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3013:3: rule__EvoAnd__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoAnd__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoAndAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvoEqual__Group__0"
    // InternalExpressionDsl.g:3022:1: rule__EvoEqual__Group__0 : rule__EvoEqual__Group__0__Impl rule__EvoEqual__Group__1 ;
    public final void rule__EvoEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3026:1: ( rule__EvoEqual__Group__0__Impl rule__EvoEqual__Group__1 )
            // InternalExpressionDsl.g:3027:2: rule__EvoEqual__Group__0__Impl rule__EvoEqual__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EvoEqual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEqual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group__0"


    // $ANTLR start "rule__EvoEqual__Group__0__Impl"
    // InternalExpressionDsl.g:3034:1: rule__EvoEqual__Group__0__Impl : ( ruleEvoUnequal ) ;
    public final void rule__EvoEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3038:1: ( ( ruleEvoUnequal ) )
            // InternalExpressionDsl.g:3039:1: ( ruleEvoUnequal )
            {
            // InternalExpressionDsl.g:3039:1: ( ruleEvoUnequal )
            // InternalExpressionDsl.g:3040:2: ruleEvoUnequal
            {
             before(grammarAccess.getEvoEqualAccess().getEvoUnequalParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoUnequal();

            state._fsp--;

             after(grammarAccess.getEvoEqualAccess().getEvoUnequalParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group__0__Impl"


    // $ANTLR start "rule__EvoEqual__Group__1"
    // InternalExpressionDsl.g:3049:1: rule__EvoEqual__Group__1 : rule__EvoEqual__Group__1__Impl ;
    public final void rule__EvoEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3053:1: ( rule__EvoEqual__Group__1__Impl )
            // InternalExpressionDsl.g:3054:2: rule__EvoEqual__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoEqual__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group__1"


    // $ANTLR start "rule__EvoEqual__Group__1__Impl"
    // InternalExpressionDsl.g:3060:1: rule__EvoEqual__Group__1__Impl : ( ( rule__EvoEqual__Group_1__0 )* ) ;
    public final void rule__EvoEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3064:1: ( ( ( rule__EvoEqual__Group_1__0 )* ) )
            // InternalExpressionDsl.g:3065:1: ( ( rule__EvoEqual__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:3065:1: ( ( rule__EvoEqual__Group_1__0 )* )
            // InternalExpressionDsl.g:3066:2: ( rule__EvoEqual__Group_1__0 )*
            {
             before(grammarAccess.getEvoEqualAccess().getGroup_1()); 
            // InternalExpressionDsl.g:3067:2: ( rule__EvoEqual__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalExpressionDsl.g:3067:3: rule__EvoEqual__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__EvoEqual__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEvoEqualAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group__1__Impl"


    // $ANTLR start "rule__EvoEqual__Group_1__0"
    // InternalExpressionDsl.g:3076:1: rule__EvoEqual__Group_1__0 : rule__EvoEqual__Group_1__0__Impl rule__EvoEqual__Group_1__1 ;
    public final void rule__EvoEqual__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3080:1: ( rule__EvoEqual__Group_1__0__Impl rule__EvoEqual__Group_1__1 )
            // InternalExpressionDsl.g:3081:2: rule__EvoEqual__Group_1__0__Impl rule__EvoEqual__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__EvoEqual__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEqual__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group_1__0"


    // $ANTLR start "rule__EvoEqual__Group_1__0__Impl"
    // InternalExpressionDsl.g:3088:1: rule__EvoEqual__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoEqual__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3092:1: ( ( () ) )
            // InternalExpressionDsl.g:3093:1: ( () )
            {
            // InternalExpressionDsl.g:3093:1: ( () )
            // InternalExpressionDsl.g:3094:2: ()
            {
             before(grammarAccess.getEvoEqualAccess().getEvoEqualOperand1Action_1_0()); 
            // InternalExpressionDsl.g:3095:2: ()
            // InternalExpressionDsl.g:3095:3: 
            {
            }

             after(grammarAccess.getEvoEqualAccess().getEvoEqualOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group_1__0__Impl"


    // $ANTLR start "rule__EvoEqual__Group_1__1"
    // InternalExpressionDsl.g:3103:1: rule__EvoEqual__Group_1__1 : rule__EvoEqual__Group_1__1__Impl rule__EvoEqual__Group_1__2 ;
    public final void rule__EvoEqual__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3107:1: ( rule__EvoEqual__Group_1__1__Impl rule__EvoEqual__Group_1__2 )
            // InternalExpressionDsl.g:3108:2: rule__EvoEqual__Group_1__1__Impl rule__EvoEqual__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__EvoEqual__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoEqual__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group_1__1"


    // $ANTLR start "rule__EvoEqual__Group_1__1__Impl"
    // InternalExpressionDsl.g:3115:1: rule__EvoEqual__Group_1__1__Impl : ( '==' ) ;
    public final void rule__EvoEqual__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3119:1: ( ( '==' ) )
            // InternalExpressionDsl.g:3120:1: ( '==' )
            {
            // InternalExpressionDsl.g:3120:1: ( '==' )
            // InternalExpressionDsl.g:3121:2: '=='
            {
             before(grammarAccess.getEvoEqualAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEvoEqualAccess().getEqualsSignEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group_1__1__Impl"


    // $ANTLR start "rule__EvoEqual__Group_1__2"
    // InternalExpressionDsl.g:3130:1: rule__EvoEqual__Group_1__2 : rule__EvoEqual__Group_1__2__Impl ;
    public final void rule__EvoEqual__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3134:1: ( rule__EvoEqual__Group_1__2__Impl )
            // InternalExpressionDsl.g:3135:2: rule__EvoEqual__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoEqual__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group_1__2"


    // $ANTLR start "rule__EvoEqual__Group_1__2__Impl"
    // InternalExpressionDsl.g:3141:1: rule__EvoEqual__Group_1__2__Impl : ( ( rule__EvoEqual__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoEqual__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3145:1: ( ( ( rule__EvoEqual__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3146:1: ( ( rule__EvoEqual__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3146:1: ( ( rule__EvoEqual__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3147:2: ( rule__EvoEqual__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoEqualAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3148:2: ( rule__EvoEqual__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3148:3: rule__EvoEqual__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoEqual__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoEqualAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Group_1__2__Impl"


    // $ANTLR start "rule__EvoUnequal__Group__0"
    // InternalExpressionDsl.g:3157:1: rule__EvoUnequal__Group__0 : rule__EvoUnequal__Group__0__Impl rule__EvoUnequal__Group__1 ;
    public final void rule__EvoUnequal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3161:1: ( rule__EvoUnequal__Group__0__Impl rule__EvoUnequal__Group__1 )
            // InternalExpressionDsl.g:3162:2: rule__EvoUnequal__Group__0__Impl rule__EvoUnequal__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EvoUnequal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoUnequal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group__0"


    // $ANTLR start "rule__EvoUnequal__Group__0__Impl"
    // InternalExpressionDsl.g:3169:1: rule__EvoUnequal__Group__0__Impl : ( ruleEvoImplication ) ;
    public final void rule__EvoUnequal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3173:1: ( ( ruleEvoImplication ) )
            // InternalExpressionDsl.g:3174:1: ( ruleEvoImplication )
            {
            // InternalExpressionDsl.g:3174:1: ( ruleEvoImplication )
            // InternalExpressionDsl.g:3175:2: ruleEvoImplication
            {
             before(grammarAccess.getEvoUnequalAccess().getEvoImplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoImplication();

            state._fsp--;

             after(grammarAccess.getEvoUnequalAccess().getEvoImplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group__0__Impl"


    // $ANTLR start "rule__EvoUnequal__Group__1"
    // InternalExpressionDsl.g:3184:1: rule__EvoUnequal__Group__1 : rule__EvoUnequal__Group__1__Impl ;
    public final void rule__EvoUnequal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3188:1: ( rule__EvoUnequal__Group__1__Impl )
            // InternalExpressionDsl.g:3189:2: rule__EvoUnequal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoUnequal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group__1"


    // $ANTLR start "rule__EvoUnequal__Group__1__Impl"
    // InternalExpressionDsl.g:3195:1: rule__EvoUnequal__Group__1__Impl : ( ( rule__EvoUnequal__Group_1__0 )* ) ;
    public final void rule__EvoUnequal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3199:1: ( ( ( rule__EvoUnequal__Group_1__0 )* ) )
            // InternalExpressionDsl.g:3200:1: ( ( rule__EvoUnequal__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:3200:1: ( ( rule__EvoUnequal__Group_1__0 )* )
            // InternalExpressionDsl.g:3201:2: ( rule__EvoUnequal__Group_1__0 )*
            {
             before(grammarAccess.getEvoUnequalAccess().getGroup_1()); 
            // InternalExpressionDsl.g:3202:2: ( rule__EvoUnequal__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalExpressionDsl.g:3202:3: rule__EvoUnequal__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__EvoUnequal__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEvoUnequalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group__1__Impl"


    // $ANTLR start "rule__EvoUnequal__Group_1__0"
    // InternalExpressionDsl.g:3211:1: rule__EvoUnequal__Group_1__0 : rule__EvoUnequal__Group_1__0__Impl rule__EvoUnequal__Group_1__1 ;
    public final void rule__EvoUnequal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3215:1: ( rule__EvoUnequal__Group_1__0__Impl rule__EvoUnequal__Group_1__1 )
            // InternalExpressionDsl.g:3216:2: rule__EvoUnequal__Group_1__0__Impl rule__EvoUnequal__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__EvoUnequal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoUnequal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group_1__0"


    // $ANTLR start "rule__EvoUnequal__Group_1__0__Impl"
    // InternalExpressionDsl.g:3223:1: rule__EvoUnequal__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoUnequal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3227:1: ( ( () ) )
            // InternalExpressionDsl.g:3228:1: ( () )
            {
            // InternalExpressionDsl.g:3228:1: ( () )
            // InternalExpressionDsl.g:3229:2: ()
            {
             before(grammarAccess.getEvoUnequalAccess().getEvoUnequalOperand1Action_1_0()); 
            // InternalExpressionDsl.g:3230:2: ()
            // InternalExpressionDsl.g:3230:3: 
            {
            }

             after(grammarAccess.getEvoUnequalAccess().getEvoUnequalOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group_1__0__Impl"


    // $ANTLR start "rule__EvoUnequal__Group_1__1"
    // InternalExpressionDsl.g:3238:1: rule__EvoUnequal__Group_1__1 : rule__EvoUnequal__Group_1__1__Impl rule__EvoUnequal__Group_1__2 ;
    public final void rule__EvoUnequal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3242:1: ( rule__EvoUnequal__Group_1__1__Impl rule__EvoUnequal__Group_1__2 )
            // InternalExpressionDsl.g:3243:2: rule__EvoUnequal__Group_1__1__Impl rule__EvoUnequal__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__EvoUnequal__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoUnequal__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group_1__1"


    // $ANTLR start "rule__EvoUnequal__Group_1__1__Impl"
    // InternalExpressionDsl.g:3250:1: rule__EvoUnequal__Group_1__1__Impl : ( '!=' ) ;
    public final void rule__EvoUnequal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3254:1: ( ( '!=' ) )
            // InternalExpressionDsl.g:3255:1: ( '!=' )
            {
            // InternalExpressionDsl.g:3255:1: ( '!=' )
            // InternalExpressionDsl.g:3256:2: '!='
            {
             before(grammarAccess.getEvoUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEvoUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group_1__1__Impl"


    // $ANTLR start "rule__EvoUnequal__Group_1__2"
    // InternalExpressionDsl.g:3265:1: rule__EvoUnequal__Group_1__2 : rule__EvoUnequal__Group_1__2__Impl ;
    public final void rule__EvoUnequal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3269:1: ( rule__EvoUnequal__Group_1__2__Impl )
            // InternalExpressionDsl.g:3270:2: rule__EvoUnequal__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoUnequal__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group_1__2"


    // $ANTLR start "rule__EvoUnequal__Group_1__2__Impl"
    // InternalExpressionDsl.g:3276:1: rule__EvoUnequal__Group_1__2__Impl : ( ( rule__EvoUnequal__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoUnequal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3280:1: ( ( ( rule__EvoUnequal__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3281:1: ( ( rule__EvoUnequal__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3281:1: ( ( rule__EvoUnequal__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3282:2: ( rule__EvoUnequal__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoUnequalAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3283:2: ( rule__EvoUnequal__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3283:3: rule__EvoUnequal__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoUnequal__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoUnequalAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Group_1__2__Impl"


    // $ANTLR start "rule__EvoBiconditional__Group__0"
    // InternalExpressionDsl.g:3292:1: rule__EvoBiconditional__Group__0 : rule__EvoBiconditional__Group__0__Impl rule__EvoBiconditional__Group__1 ;
    public final void rule__EvoBiconditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3296:1: ( rule__EvoBiconditional__Group__0__Impl rule__EvoBiconditional__Group__1 )
            // InternalExpressionDsl.g:3297:2: rule__EvoBiconditional__Group__0__Impl rule__EvoBiconditional__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EvoBiconditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoBiconditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group__0"


    // $ANTLR start "rule__EvoBiconditional__Group__0__Impl"
    // InternalExpressionDsl.g:3304:1: rule__EvoBiconditional__Group__0__Impl : ( ruleEvoSetInclusion ) ;
    public final void rule__EvoBiconditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3308:1: ( ( ruleEvoSetInclusion ) )
            // InternalExpressionDsl.g:3309:1: ( ruleEvoSetInclusion )
            {
            // InternalExpressionDsl.g:3309:1: ( ruleEvoSetInclusion )
            // InternalExpressionDsl.g:3310:2: ruleEvoSetInclusion
            {
             before(grammarAccess.getEvoBiconditionalAccess().getEvoSetInclusionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetInclusion();

            state._fsp--;

             after(grammarAccess.getEvoBiconditionalAccess().getEvoSetInclusionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group__0__Impl"


    // $ANTLR start "rule__EvoBiconditional__Group__1"
    // InternalExpressionDsl.g:3319:1: rule__EvoBiconditional__Group__1 : rule__EvoBiconditional__Group__1__Impl ;
    public final void rule__EvoBiconditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3323:1: ( rule__EvoBiconditional__Group__1__Impl )
            // InternalExpressionDsl.g:3324:2: rule__EvoBiconditional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoBiconditional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group__1"


    // $ANTLR start "rule__EvoBiconditional__Group__1__Impl"
    // InternalExpressionDsl.g:3330:1: rule__EvoBiconditional__Group__1__Impl : ( ( rule__EvoBiconditional__Group_1__0 )* ) ;
    public final void rule__EvoBiconditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3334:1: ( ( ( rule__EvoBiconditional__Group_1__0 )* ) )
            // InternalExpressionDsl.g:3335:1: ( ( rule__EvoBiconditional__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:3335:1: ( ( rule__EvoBiconditional__Group_1__0 )* )
            // InternalExpressionDsl.g:3336:2: ( rule__EvoBiconditional__Group_1__0 )*
            {
             before(grammarAccess.getEvoBiconditionalAccess().getGroup_1()); 
            // InternalExpressionDsl.g:3337:2: ( rule__EvoBiconditional__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalExpressionDsl.g:3337:3: rule__EvoBiconditional__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__EvoBiconditional__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEvoBiconditionalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group__1__Impl"


    // $ANTLR start "rule__EvoBiconditional__Group_1__0"
    // InternalExpressionDsl.g:3346:1: rule__EvoBiconditional__Group_1__0 : rule__EvoBiconditional__Group_1__0__Impl rule__EvoBiconditional__Group_1__1 ;
    public final void rule__EvoBiconditional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3350:1: ( rule__EvoBiconditional__Group_1__0__Impl rule__EvoBiconditional__Group_1__1 )
            // InternalExpressionDsl.g:3351:2: rule__EvoBiconditional__Group_1__0__Impl rule__EvoBiconditional__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__EvoBiconditional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoBiconditional__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group_1__0"


    // $ANTLR start "rule__EvoBiconditional__Group_1__0__Impl"
    // InternalExpressionDsl.g:3358:1: rule__EvoBiconditional__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoBiconditional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3362:1: ( ( () ) )
            // InternalExpressionDsl.g:3363:1: ( () )
            {
            // InternalExpressionDsl.g:3363:1: ( () )
            // InternalExpressionDsl.g:3364:2: ()
            {
             before(grammarAccess.getEvoBiconditionalAccess().getEvoBiconditionalOperand1Action_1_0()); 
            // InternalExpressionDsl.g:3365:2: ()
            // InternalExpressionDsl.g:3365:3: 
            {
            }

             after(grammarAccess.getEvoBiconditionalAccess().getEvoBiconditionalOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group_1__0__Impl"


    // $ANTLR start "rule__EvoBiconditional__Group_1__1"
    // InternalExpressionDsl.g:3373:1: rule__EvoBiconditional__Group_1__1 : rule__EvoBiconditional__Group_1__1__Impl rule__EvoBiconditional__Group_1__2 ;
    public final void rule__EvoBiconditional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3377:1: ( rule__EvoBiconditional__Group_1__1__Impl rule__EvoBiconditional__Group_1__2 )
            // InternalExpressionDsl.g:3378:2: rule__EvoBiconditional__Group_1__1__Impl rule__EvoBiconditional__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__EvoBiconditional__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoBiconditional__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group_1__1"


    // $ANTLR start "rule__EvoBiconditional__Group_1__1__Impl"
    // InternalExpressionDsl.g:3385:1: rule__EvoBiconditional__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__EvoBiconditional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3389:1: ( ( '<=>' ) )
            // InternalExpressionDsl.g:3390:1: ( '<=>' )
            {
            // InternalExpressionDsl.g:3390:1: ( '<=>' )
            // InternalExpressionDsl.g:3391:2: '<=>'
            {
             before(grammarAccess.getEvoBiconditionalAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEvoBiconditionalAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group_1__1__Impl"


    // $ANTLR start "rule__EvoBiconditional__Group_1__2"
    // InternalExpressionDsl.g:3400:1: rule__EvoBiconditional__Group_1__2 : rule__EvoBiconditional__Group_1__2__Impl ;
    public final void rule__EvoBiconditional__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3404:1: ( rule__EvoBiconditional__Group_1__2__Impl )
            // InternalExpressionDsl.g:3405:2: rule__EvoBiconditional__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoBiconditional__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group_1__2"


    // $ANTLR start "rule__EvoBiconditional__Group_1__2__Impl"
    // InternalExpressionDsl.g:3411:1: rule__EvoBiconditional__Group_1__2__Impl : ( ( rule__EvoBiconditional__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoBiconditional__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3415:1: ( ( ( rule__EvoBiconditional__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3416:1: ( ( rule__EvoBiconditional__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3416:1: ( ( rule__EvoBiconditional__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3417:2: ( rule__EvoBiconditional__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoBiconditionalAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3418:2: ( rule__EvoBiconditional__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3418:3: rule__EvoBiconditional__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoBiconditional__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoBiconditionalAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Group_1__2__Impl"


    // $ANTLR start "rule__EvoSetInclusion__Group__0"
    // InternalExpressionDsl.g:3427:1: rule__EvoSetInclusion__Group__0 : rule__EvoSetInclusion__Group__0__Impl rule__EvoSetInclusion__Group__1 ;
    public final void rule__EvoSetInclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3431:1: ( rule__EvoSetInclusion__Group__0__Impl rule__EvoSetInclusion__Group__1 )
            // InternalExpressionDsl.g:3432:2: rule__EvoSetInclusion__Group__0__Impl rule__EvoSetInclusion__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EvoSetInclusion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetInclusion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group__0"


    // $ANTLR start "rule__EvoSetInclusion__Group__0__Impl"
    // InternalExpressionDsl.g:3439:1: rule__EvoSetInclusion__Group__0__Impl : ( ruleEvoSetIntersection ) ;
    public final void rule__EvoSetInclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3443:1: ( ( ruleEvoSetIntersection ) )
            // InternalExpressionDsl.g:3444:1: ( ruleEvoSetIntersection )
            {
            // InternalExpressionDsl.g:3444:1: ( ruleEvoSetIntersection )
            // InternalExpressionDsl.g:3445:2: ruleEvoSetIntersection
            {
             before(grammarAccess.getEvoSetInclusionAccess().getEvoSetIntersectionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetIntersection();

            state._fsp--;

             after(grammarAccess.getEvoSetInclusionAccess().getEvoSetIntersectionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group__0__Impl"


    // $ANTLR start "rule__EvoSetInclusion__Group__1"
    // InternalExpressionDsl.g:3454:1: rule__EvoSetInclusion__Group__1 : rule__EvoSetInclusion__Group__1__Impl ;
    public final void rule__EvoSetInclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3458:1: ( rule__EvoSetInclusion__Group__1__Impl )
            // InternalExpressionDsl.g:3459:2: rule__EvoSetInclusion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetInclusion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group__1"


    // $ANTLR start "rule__EvoSetInclusion__Group__1__Impl"
    // InternalExpressionDsl.g:3465:1: rule__EvoSetInclusion__Group__1__Impl : ( ( rule__EvoSetInclusion__Group_1__0 )* ) ;
    public final void rule__EvoSetInclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3469:1: ( ( ( rule__EvoSetInclusion__Group_1__0 )* ) )
            // InternalExpressionDsl.g:3470:1: ( ( rule__EvoSetInclusion__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:3470:1: ( ( rule__EvoSetInclusion__Group_1__0 )* )
            // InternalExpressionDsl.g:3471:2: ( rule__EvoSetInclusion__Group_1__0 )*
            {
             before(grammarAccess.getEvoSetInclusionAccess().getGroup_1()); 
            // InternalExpressionDsl.g:3472:2: ( rule__EvoSetInclusion__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalExpressionDsl.g:3472:3: rule__EvoSetInclusion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__EvoSetInclusion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEvoSetInclusionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group__1__Impl"


    // $ANTLR start "rule__EvoSetInclusion__Group_1__0"
    // InternalExpressionDsl.g:3481:1: rule__EvoSetInclusion__Group_1__0 : rule__EvoSetInclusion__Group_1__0__Impl rule__EvoSetInclusion__Group_1__1 ;
    public final void rule__EvoSetInclusion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3485:1: ( rule__EvoSetInclusion__Group_1__0__Impl rule__EvoSetInclusion__Group_1__1 )
            // InternalExpressionDsl.g:3486:2: rule__EvoSetInclusion__Group_1__0__Impl rule__EvoSetInclusion__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__EvoSetInclusion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetInclusion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group_1__0"


    // $ANTLR start "rule__EvoSetInclusion__Group_1__0__Impl"
    // InternalExpressionDsl.g:3493:1: rule__EvoSetInclusion__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoSetInclusion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3497:1: ( ( () ) )
            // InternalExpressionDsl.g:3498:1: ( () )
            {
            // InternalExpressionDsl.g:3498:1: ( () )
            // InternalExpressionDsl.g:3499:2: ()
            {
             before(grammarAccess.getEvoSetInclusionAccess().getEvoSetInclusionOperand1Action_1_0()); 
            // InternalExpressionDsl.g:3500:2: ()
            // InternalExpressionDsl.g:3500:3: 
            {
            }

             after(grammarAccess.getEvoSetInclusionAccess().getEvoSetInclusionOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group_1__0__Impl"


    // $ANTLR start "rule__EvoSetInclusion__Group_1__1"
    // InternalExpressionDsl.g:3508:1: rule__EvoSetInclusion__Group_1__1 : rule__EvoSetInclusion__Group_1__1__Impl rule__EvoSetInclusion__Group_1__2 ;
    public final void rule__EvoSetInclusion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3512:1: ( rule__EvoSetInclusion__Group_1__1__Impl rule__EvoSetInclusion__Group_1__2 )
            // InternalExpressionDsl.g:3513:2: rule__EvoSetInclusion__Group_1__1__Impl rule__EvoSetInclusion__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetInclusion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetInclusion__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group_1__1"


    // $ANTLR start "rule__EvoSetInclusion__Group_1__1__Impl"
    // InternalExpressionDsl.g:3520:1: rule__EvoSetInclusion__Group_1__1__Impl : ( 'inclusion' ) ;
    public final void rule__EvoSetInclusion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3524:1: ( ( 'inclusion' ) )
            // InternalExpressionDsl.g:3525:1: ( 'inclusion' )
            {
            // InternalExpressionDsl.g:3525:1: ( 'inclusion' )
            // InternalExpressionDsl.g:3526:2: 'inclusion'
            {
             before(grammarAccess.getEvoSetInclusionAccess().getInclusionKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEvoSetInclusionAccess().getInclusionKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group_1__1__Impl"


    // $ANTLR start "rule__EvoSetInclusion__Group_1__2"
    // InternalExpressionDsl.g:3535:1: rule__EvoSetInclusion__Group_1__2 : rule__EvoSetInclusion__Group_1__2__Impl ;
    public final void rule__EvoSetInclusion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3539:1: ( rule__EvoSetInclusion__Group_1__2__Impl )
            // InternalExpressionDsl.g:3540:2: rule__EvoSetInclusion__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetInclusion__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group_1__2"


    // $ANTLR start "rule__EvoSetInclusion__Group_1__2__Impl"
    // InternalExpressionDsl.g:3546:1: rule__EvoSetInclusion__Group_1__2__Impl : ( ( rule__EvoSetInclusion__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoSetInclusion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3550:1: ( ( ( rule__EvoSetInclusion__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3551:1: ( ( rule__EvoSetInclusion__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3551:1: ( ( rule__EvoSetInclusion__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3552:2: ( rule__EvoSetInclusion__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoSetInclusionAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3553:2: ( rule__EvoSetInclusion__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3553:3: rule__EvoSetInclusion__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetInclusion__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetInclusionAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Group_1__2__Impl"


    // $ANTLR start "rule__EvoSetIntersection__Group__0"
    // InternalExpressionDsl.g:3562:1: rule__EvoSetIntersection__Group__0 : rule__EvoSetIntersection__Group__0__Impl rule__EvoSetIntersection__Group__1 ;
    public final void rule__EvoSetIntersection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3566:1: ( rule__EvoSetIntersection__Group__0__Impl rule__EvoSetIntersection__Group__1 )
            // InternalExpressionDsl.g:3567:2: rule__EvoSetIntersection__Group__0__Impl rule__EvoSetIntersection__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__EvoSetIntersection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetIntersection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group__0"


    // $ANTLR start "rule__EvoSetIntersection__Group__0__Impl"
    // InternalExpressionDsl.g:3574:1: rule__EvoSetIntersection__Group__0__Impl : ( ruleEvoSetUnion ) ;
    public final void rule__EvoSetIntersection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3578:1: ( ( ruleEvoSetUnion ) )
            // InternalExpressionDsl.g:3579:1: ( ruleEvoSetUnion )
            {
            // InternalExpressionDsl.g:3579:1: ( ruleEvoSetUnion )
            // InternalExpressionDsl.g:3580:2: ruleEvoSetUnion
            {
             before(grammarAccess.getEvoSetIntersectionAccess().getEvoSetUnionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetUnion();

            state._fsp--;

             after(grammarAccess.getEvoSetIntersectionAccess().getEvoSetUnionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group__0__Impl"


    // $ANTLR start "rule__EvoSetIntersection__Group__1"
    // InternalExpressionDsl.g:3589:1: rule__EvoSetIntersection__Group__1 : rule__EvoSetIntersection__Group__1__Impl ;
    public final void rule__EvoSetIntersection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3593:1: ( rule__EvoSetIntersection__Group__1__Impl )
            // InternalExpressionDsl.g:3594:2: rule__EvoSetIntersection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetIntersection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group__1"


    // $ANTLR start "rule__EvoSetIntersection__Group__1__Impl"
    // InternalExpressionDsl.g:3600:1: rule__EvoSetIntersection__Group__1__Impl : ( ( rule__EvoSetIntersection__Group_1__0 )* ) ;
    public final void rule__EvoSetIntersection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3604:1: ( ( ( rule__EvoSetIntersection__Group_1__0 )* ) )
            // InternalExpressionDsl.g:3605:1: ( ( rule__EvoSetIntersection__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:3605:1: ( ( rule__EvoSetIntersection__Group_1__0 )* )
            // InternalExpressionDsl.g:3606:2: ( rule__EvoSetIntersection__Group_1__0 )*
            {
             before(grammarAccess.getEvoSetIntersectionAccess().getGroup_1()); 
            // InternalExpressionDsl.g:3607:2: ( rule__EvoSetIntersection__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalExpressionDsl.g:3607:3: rule__EvoSetIntersection__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__EvoSetIntersection__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEvoSetIntersectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group__1__Impl"


    // $ANTLR start "rule__EvoSetIntersection__Group_1__0"
    // InternalExpressionDsl.g:3616:1: rule__EvoSetIntersection__Group_1__0 : rule__EvoSetIntersection__Group_1__0__Impl rule__EvoSetIntersection__Group_1__1 ;
    public final void rule__EvoSetIntersection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3620:1: ( rule__EvoSetIntersection__Group_1__0__Impl rule__EvoSetIntersection__Group_1__1 )
            // InternalExpressionDsl.g:3621:2: rule__EvoSetIntersection__Group_1__0__Impl rule__EvoSetIntersection__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__EvoSetIntersection__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetIntersection__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group_1__0"


    // $ANTLR start "rule__EvoSetIntersection__Group_1__0__Impl"
    // InternalExpressionDsl.g:3628:1: rule__EvoSetIntersection__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoSetIntersection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3632:1: ( ( () ) )
            // InternalExpressionDsl.g:3633:1: ( () )
            {
            // InternalExpressionDsl.g:3633:1: ( () )
            // InternalExpressionDsl.g:3634:2: ()
            {
             before(grammarAccess.getEvoSetIntersectionAccess().getEvoSetIntersectionOperand1Action_1_0()); 
            // InternalExpressionDsl.g:3635:2: ()
            // InternalExpressionDsl.g:3635:3: 
            {
            }

             after(grammarAccess.getEvoSetIntersectionAccess().getEvoSetIntersectionOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group_1__0__Impl"


    // $ANTLR start "rule__EvoSetIntersection__Group_1__1"
    // InternalExpressionDsl.g:3643:1: rule__EvoSetIntersection__Group_1__1 : rule__EvoSetIntersection__Group_1__1__Impl rule__EvoSetIntersection__Group_1__2 ;
    public final void rule__EvoSetIntersection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3647:1: ( rule__EvoSetIntersection__Group_1__1__Impl rule__EvoSetIntersection__Group_1__2 )
            // InternalExpressionDsl.g:3648:2: rule__EvoSetIntersection__Group_1__1__Impl rule__EvoSetIntersection__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetIntersection__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetIntersection__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group_1__1"


    // $ANTLR start "rule__EvoSetIntersection__Group_1__1__Impl"
    // InternalExpressionDsl.g:3655:1: rule__EvoSetIntersection__Group_1__1__Impl : ( 'intersection' ) ;
    public final void rule__EvoSetIntersection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3659:1: ( ( 'intersection' ) )
            // InternalExpressionDsl.g:3660:1: ( 'intersection' )
            {
            // InternalExpressionDsl.g:3660:1: ( 'intersection' )
            // InternalExpressionDsl.g:3661:2: 'intersection'
            {
             before(grammarAccess.getEvoSetIntersectionAccess().getIntersectionKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEvoSetIntersectionAccess().getIntersectionKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group_1__1__Impl"


    // $ANTLR start "rule__EvoSetIntersection__Group_1__2"
    // InternalExpressionDsl.g:3670:1: rule__EvoSetIntersection__Group_1__2 : rule__EvoSetIntersection__Group_1__2__Impl ;
    public final void rule__EvoSetIntersection__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3674:1: ( rule__EvoSetIntersection__Group_1__2__Impl )
            // InternalExpressionDsl.g:3675:2: rule__EvoSetIntersection__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetIntersection__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group_1__2"


    // $ANTLR start "rule__EvoSetIntersection__Group_1__2__Impl"
    // InternalExpressionDsl.g:3681:1: rule__EvoSetIntersection__Group_1__2__Impl : ( ( rule__EvoSetIntersection__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoSetIntersection__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3685:1: ( ( ( rule__EvoSetIntersection__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3686:1: ( ( rule__EvoSetIntersection__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3686:1: ( ( rule__EvoSetIntersection__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3687:2: ( rule__EvoSetIntersection__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoSetIntersectionAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3688:2: ( rule__EvoSetIntersection__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3688:3: rule__EvoSetIntersection__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetIntersection__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetIntersectionAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Group_1__2__Impl"


    // $ANTLR start "rule__EvoSetUnion__Group__0"
    // InternalExpressionDsl.g:3697:1: rule__EvoSetUnion__Group__0 : rule__EvoSetUnion__Group__0__Impl rule__EvoSetUnion__Group__1 ;
    public final void rule__EvoSetUnion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3701:1: ( rule__EvoSetUnion__Group__0__Impl rule__EvoSetUnion__Group__1 )
            // InternalExpressionDsl.g:3702:2: rule__EvoSetUnion__Group__0__Impl rule__EvoSetUnion__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__EvoSetUnion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetUnion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group__0"


    // $ANTLR start "rule__EvoSetUnion__Group__0__Impl"
    // InternalExpressionDsl.g:3709:1: rule__EvoSetUnion__Group__0__Impl : ( ruleEvoSetDifference ) ;
    public final void rule__EvoSetUnion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3713:1: ( ( ruleEvoSetDifference ) )
            // InternalExpressionDsl.g:3714:1: ( ruleEvoSetDifference )
            {
            // InternalExpressionDsl.g:3714:1: ( ruleEvoSetDifference )
            // InternalExpressionDsl.g:3715:2: ruleEvoSetDifference
            {
             before(grammarAccess.getEvoSetUnionAccess().getEvoSetDifferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetDifference();

            state._fsp--;

             after(grammarAccess.getEvoSetUnionAccess().getEvoSetDifferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group__0__Impl"


    // $ANTLR start "rule__EvoSetUnion__Group__1"
    // InternalExpressionDsl.g:3724:1: rule__EvoSetUnion__Group__1 : rule__EvoSetUnion__Group__1__Impl ;
    public final void rule__EvoSetUnion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3728:1: ( rule__EvoSetUnion__Group__1__Impl )
            // InternalExpressionDsl.g:3729:2: rule__EvoSetUnion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetUnion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group__1"


    // $ANTLR start "rule__EvoSetUnion__Group__1__Impl"
    // InternalExpressionDsl.g:3735:1: rule__EvoSetUnion__Group__1__Impl : ( ( rule__EvoSetUnion__Group_1__0 )* ) ;
    public final void rule__EvoSetUnion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3739:1: ( ( ( rule__EvoSetUnion__Group_1__0 )* ) )
            // InternalExpressionDsl.g:3740:1: ( ( rule__EvoSetUnion__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:3740:1: ( ( rule__EvoSetUnion__Group_1__0 )* )
            // InternalExpressionDsl.g:3741:2: ( rule__EvoSetUnion__Group_1__0 )*
            {
             before(grammarAccess.getEvoSetUnionAccess().getGroup_1()); 
            // InternalExpressionDsl.g:3742:2: ( rule__EvoSetUnion__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==44) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalExpressionDsl.g:3742:3: rule__EvoSetUnion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__EvoSetUnion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEvoSetUnionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group__1__Impl"


    // $ANTLR start "rule__EvoSetUnion__Group_1__0"
    // InternalExpressionDsl.g:3751:1: rule__EvoSetUnion__Group_1__0 : rule__EvoSetUnion__Group_1__0__Impl rule__EvoSetUnion__Group_1__1 ;
    public final void rule__EvoSetUnion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3755:1: ( rule__EvoSetUnion__Group_1__0__Impl rule__EvoSetUnion__Group_1__1 )
            // InternalExpressionDsl.g:3756:2: rule__EvoSetUnion__Group_1__0__Impl rule__EvoSetUnion__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__EvoSetUnion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetUnion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group_1__0"


    // $ANTLR start "rule__EvoSetUnion__Group_1__0__Impl"
    // InternalExpressionDsl.g:3763:1: rule__EvoSetUnion__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoSetUnion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3767:1: ( ( () ) )
            // InternalExpressionDsl.g:3768:1: ( () )
            {
            // InternalExpressionDsl.g:3768:1: ( () )
            // InternalExpressionDsl.g:3769:2: ()
            {
             before(grammarAccess.getEvoSetUnionAccess().getEvoSetUnionOperand1Action_1_0()); 
            // InternalExpressionDsl.g:3770:2: ()
            // InternalExpressionDsl.g:3770:3: 
            {
            }

             after(grammarAccess.getEvoSetUnionAccess().getEvoSetUnionOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group_1__0__Impl"


    // $ANTLR start "rule__EvoSetUnion__Group_1__1"
    // InternalExpressionDsl.g:3778:1: rule__EvoSetUnion__Group_1__1 : rule__EvoSetUnion__Group_1__1__Impl rule__EvoSetUnion__Group_1__2 ;
    public final void rule__EvoSetUnion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3782:1: ( rule__EvoSetUnion__Group_1__1__Impl rule__EvoSetUnion__Group_1__2 )
            // InternalExpressionDsl.g:3783:2: rule__EvoSetUnion__Group_1__1__Impl rule__EvoSetUnion__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetUnion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetUnion__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group_1__1"


    // $ANTLR start "rule__EvoSetUnion__Group_1__1__Impl"
    // InternalExpressionDsl.g:3790:1: rule__EvoSetUnion__Group_1__1__Impl : ( 'union' ) ;
    public final void rule__EvoSetUnion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3794:1: ( ( 'union' ) )
            // InternalExpressionDsl.g:3795:1: ( 'union' )
            {
            // InternalExpressionDsl.g:3795:1: ( 'union' )
            // InternalExpressionDsl.g:3796:2: 'union'
            {
             before(grammarAccess.getEvoSetUnionAccess().getUnionKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEvoSetUnionAccess().getUnionKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group_1__1__Impl"


    // $ANTLR start "rule__EvoSetUnion__Group_1__2"
    // InternalExpressionDsl.g:3805:1: rule__EvoSetUnion__Group_1__2 : rule__EvoSetUnion__Group_1__2__Impl ;
    public final void rule__EvoSetUnion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3809:1: ( rule__EvoSetUnion__Group_1__2__Impl )
            // InternalExpressionDsl.g:3810:2: rule__EvoSetUnion__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetUnion__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group_1__2"


    // $ANTLR start "rule__EvoSetUnion__Group_1__2__Impl"
    // InternalExpressionDsl.g:3816:1: rule__EvoSetUnion__Group_1__2__Impl : ( ( rule__EvoSetUnion__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoSetUnion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3820:1: ( ( ( rule__EvoSetUnion__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3821:1: ( ( rule__EvoSetUnion__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3821:1: ( ( rule__EvoSetUnion__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3822:2: ( rule__EvoSetUnion__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoSetUnionAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3823:2: ( rule__EvoSetUnion__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3823:3: rule__EvoSetUnion__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetUnion__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetUnionAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Group_1__2__Impl"


    // $ANTLR start "rule__EvoSetDifference__Group__0"
    // InternalExpressionDsl.g:3832:1: rule__EvoSetDifference__Group__0 : rule__EvoSetDifference__Group__0__Impl rule__EvoSetDifference__Group__1 ;
    public final void rule__EvoSetDifference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3836:1: ( rule__EvoSetDifference__Group__0__Impl rule__EvoSetDifference__Group__1 )
            // InternalExpressionDsl.g:3837:2: rule__EvoSetDifference__Group__0__Impl rule__EvoSetDifference__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__EvoSetDifference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetDifference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group__0"


    // $ANTLR start "rule__EvoSetDifference__Group__0__Impl"
    // InternalExpressionDsl.g:3844:1: rule__EvoSetDifference__Group__0__Impl : ( ruleEvoSetSymmetricDifference ) ;
    public final void rule__EvoSetDifference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3848:1: ( ( ruleEvoSetSymmetricDifference ) )
            // InternalExpressionDsl.g:3849:1: ( ruleEvoSetSymmetricDifference )
            {
            // InternalExpressionDsl.g:3849:1: ( ruleEvoSetSymmetricDifference )
            // InternalExpressionDsl.g:3850:2: ruleEvoSetSymmetricDifference
            {
             before(grammarAccess.getEvoSetDifferenceAccess().getEvoSetSymmetricDifferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetSymmetricDifference();

            state._fsp--;

             after(grammarAccess.getEvoSetDifferenceAccess().getEvoSetSymmetricDifferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group__0__Impl"


    // $ANTLR start "rule__EvoSetDifference__Group__1"
    // InternalExpressionDsl.g:3859:1: rule__EvoSetDifference__Group__1 : rule__EvoSetDifference__Group__1__Impl ;
    public final void rule__EvoSetDifference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3863:1: ( rule__EvoSetDifference__Group__1__Impl )
            // InternalExpressionDsl.g:3864:2: rule__EvoSetDifference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetDifference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group__1"


    // $ANTLR start "rule__EvoSetDifference__Group__1__Impl"
    // InternalExpressionDsl.g:3870:1: rule__EvoSetDifference__Group__1__Impl : ( ( rule__EvoSetDifference__Group_1__0 )* ) ;
    public final void rule__EvoSetDifference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3874:1: ( ( ( rule__EvoSetDifference__Group_1__0 )* ) )
            // InternalExpressionDsl.g:3875:1: ( ( rule__EvoSetDifference__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:3875:1: ( ( rule__EvoSetDifference__Group_1__0 )* )
            // InternalExpressionDsl.g:3876:2: ( rule__EvoSetDifference__Group_1__0 )*
            {
             before(grammarAccess.getEvoSetDifferenceAccess().getGroup_1()); 
            // InternalExpressionDsl.g:3877:2: ( rule__EvoSetDifference__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalExpressionDsl.g:3877:3: rule__EvoSetDifference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__EvoSetDifference__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getEvoSetDifferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group__1__Impl"


    // $ANTLR start "rule__EvoSetDifference__Group_1__0"
    // InternalExpressionDsl.g:3886:1: rule__EvoSetDifference__Group_1__0 : rule__EvoSetDifference__Group_1__0__Impl rule__EvoSetDifference__Group_1__1 ;
    public final void rule__EvoSetDifference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3890:1: ( rule__EvoSetDifference__Group_1__0__Impl rule__EvoSetDifference__Group_1__1 )
            // InternalExpressionDsl.g:3891:2: rule__EvoSetDifference__Group_1__0__Impl rule__EvoSetDifference__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__EvoSetDifference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetDifference__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group_1__0"


    // $ANTLR start "rule__EvoSetDifference__Group_1__0__Impl"
    // InternalExpressionDsl.g:3898:1: rule__EvoSetDifference__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoSetDifference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3902:1: ( ( () ) )
            // InternalExpressionDsl.g:3903:1: ( () )
            {
            // InternalExpressionDsl.g:3903:1: ( () )
            // InternalExpressionDsl.g:3904:2: ()
            {
             before(grammarAccess.getEvoSetDifferenceAccess().getEvoSetDifferenceOperand1Action_1_0()); 
            // InternalExpressionDsl.g:3905:2: ()
            // InternalExpressionDsl.g:3905:3: 
            {
            }

             after(grammarAccess.getEvoSetDifferenceAccess().getEvoSetDifferenceOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group_1__0__Impl"


    // $ANTLR start "rule__EvoSetDifference__Group_1__1"
    // InternalExpressionDsl.g:3913:1: rule__EvoSetDifference__Group_1__1 : rule__EvoSetDifference__Group_1__1__Impl rule__EvoSetDifference__Group_1__2 ;
    public final void rule__EvoSetDifference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3917:1: ( rule__EvoSetDifference__Group_1__1__Impl rule__EvoSetDifference__Group_1__2 )
            // InternalExpressionDsl.g:3918:2: rule__EvoSetDifference__Group_1__1__Impl rule__EvoSetDifference__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetDifference__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetDifference__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group_1__1"


    // $ANTLR start "rule__EvoSetDifference__Group_1__1__Impl"
    // InternalExpressionDsl.g:3925:1: rule__EvoSetDifference__Group_1__1__Impl : ( 'difference' ) ;
    public final void rule__EvoSetDifference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3929:1: ( ( 'difference' ) )
            // InternalExpressionDsl.g:3930:1: ( 'difference' )
            {
            // InternalExpressionDsl.g:3930:1: ( 'difference' )
            // InternalExpressionDsl.g:3931:2: 'difference'
            {
             before(grammarAccess.getEvoSetDifferenceAccess().getDifferenceKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEvoSetDifferenceAccess().getDifferenceKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group_1__1__Impl"


    // $ANTLR start "rule__EvoSetDifference__Group_1__2"
    // InternalExpressionDsl.g:3940:1: rule__EvoSetDifference__Group_1__2 : rule__EvoSetDifference__Group_1__2__Impl ;
    public final void rule__EvoSetDifference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3944:1: ( rule__EvoSetDifference__Group_1__2__Impl )
            // InternalExpressionDsl.g:3945:2: rule__EvoSetDifference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetDifference__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group_1__2"


    // $ANTLR start "rule__EvoSetDifference__Group_1__2__Impl"
    // InternalExpressionDsl.g:3951:1: rule__EvoSetDifference__Group_1__2__Impl : ( ( rule__EvoSetDifference__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoSetDifference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3955:1: ( ( ( rule__EvoSetDifference__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:3956:1: ( ( rule__EvoSetDifference__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:3956:1: ( ( rule__EvoSetDifference__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:3957:2: ( rule__EvoSetDifference__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoSetDifferenceAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:3958:2: ( rule__EvoSetDifference__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:3958:3: rule__EvoSetDifference__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetDifference__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetDifferenceAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Group_1__2__Impl"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group__0"
    // InternalExpressionDsl.g:3967:1: rule__EvoSetSymmetricDifference__Group__0 : rule__EvoSetSymmetricDifference__Group__0__Impl rule__EvoSetSymmetricDifference__Group__1 ;
    public final void rule__EvoSetSymmetricDifference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3971:1: ( rule__EvoSetSymmetricDifference__Group__0__Impl rule__EvoSetSymmetricDifference__Group__1 )
            // InternalExpressionDsl.g:3972:2: rule__EvoSetSymmetricDifference__Group__0__Impl rule__EvoSetSymmetricDifference__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__EvoSetSymmetricDifference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetSymmetricDifference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group__0"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group__0__Impl"
    // InternalExpressionDsl.g:3979:1: rule__EvoSetSymmetricDifference__Group__0__Impl : ( ruleEvoSetCartesianProduct ) ;
    public final void rule__EvoSetSymmetricDifference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3983:1: ( ( ruleEvoSetCartesianProduct ) )
            // InternalExpressionDsl.g:3984:1: ( ruleEvoSetCartesianProduct )
            {
            // InternalExpressionDsl.g:3984:1: ( ruleEvoSetCartesianProduct )
            // InternalExpressionDsl.g:3985:2: ruleEvoSetCartesianProduct
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetCartesianProductParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetCartesianProduct();

            state._fsp--;

             after(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetCartesianProductParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group__0__Impl"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group__1"
    // InternalExpressionDsl.g:3994:1: rule__EvoSetSymmetricDifference__Group__1 : rule__EvoSetSymmetricDifference__Group__1__Impl ;
    public final void rule__EvoSetSymmetricDifference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:3998:1: ( rule__EvoSetSymmetricDifference__Group__1__Impl )
            // InternalExpressionDsl.g:3999:2: rule__EvoSetSymmetricDifference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetSymmetricDifference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group__1"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group__1__Impl"
    // InternalExpressionDsl.g:4005:1: rule__EvoSetSymmetricDifference__Group__1__Impl : ( ( rule__EvoSetSymmetricDifference__Group_1__0 )* ) ;
    public final void rule__EvoSetSymmetricDifference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4009:1: ( ( ( rule__EvoSetSymmetricDifference__Group_1__0 )* ) )
            // InternalExpressionDsl.g:4010:1: ( ( rule__EvoSetSymmetricDifference__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:4010:1: ( ( rule__EvoSetSymmetricDifference__Group_1__0 )* )
            // InternalExpressionDsl.g:4011:2: ( rule__EvoSetSymmetricDifference__Group_1__0 )*
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceAccess().getGroup_1()); 
            // InternalExpressionDsl.g:4012:2: ( rule__EvoSetSymmetricDifference__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==46) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalExpressionDsl.g:4012:3: rule__EvoSetSymmetricDifference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__EvoSetSymmetricDifference__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getEvoSetSymmetricDifferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group__1__Impl"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group_1__0"
    // InternalExpressionDsl.g:4021:1: rule__EvoSetSymmetricDifference__Group_1__0 : rule__EvoSetSymmetricDifference__Group_1__0__Impl rule__EvoSetSymmetricDifference__Group_1__1 ;
    public final void rule__EvoSetSymmetricDifference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4025:1: ( rule__EvoSetSymmetricDifference__Group_1__0__Impl rule__EvoSetSymmetricDifference__Group_1__1 )
            // InternalExpressionDsl.g:4026:2: rule__EvoSetSymmetricDifference__Group_1__0__Impl rule__EvoSetSymmetricDifference__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__EvoSetSymmetricDifference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetSymmetricDifference__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group_1__0"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group_1__0__Impl"
    // InternalExpressionDsl.g:4033:1: rule__EvoSetSymmetricDifference__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoSetSymmetricDifference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4037:1: ( ( () ) )
            // InternalExpressionDsl.g:4038:1: ( () )
            {
            // InternalExpressionDsl.g:4038:1: ( () )
            // InternalExpressionDsl.g:4039:2: ()
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetSymmetricDifferenceOperand1Action_1_0()); 
            // InternalExpressionDsl.g:4040:2: ()
            // InternalExpressionDsl.g:4040:3: 
            {
            }

             after(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetSymmetricDifferenceOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group_1__0__Impl"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group_1__1"
    // InternalExpressionDsl.g:4048:1: rule__EvoSetSymmetricDifference__Group_1__1 : rule__EvoSetSymmetricDifference__Group_1__1__Impl rule__EvoSetSymmetricDifference__Group_1__2 ;
    public final void rule__EvoSetSymmetricDifference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4052:1: ( rule__EvoSetSymmetricDifference__Group_1__1__Impl rule__EvoSetSymmetricDifference__Group_1__2 )
            // InternalExpressionDsl.g:4053:2: rule__EvoSetSymmetricDifference__Group_1__1__Impl rule__EvoSetSymmetricDifference__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetSymmetricDifference__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetSymmetricDifference__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group_1__1"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group_1__1__Impl"
    // InternalExpressionDsl.g:4060:1: rule__EvoSetSymmetricDifference__Group_1__1__Impl : ( 'symmetric_difference' ) ;
    public final void rule__EvoSetSymmetricDifference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4064:1: ( ( 'symmetric_difference' ) )
            // InternalExpressionDsl.g:4065:1: ( 'symmetric_difference' )
            {
            // InternalExpressionDsl.g:4065:1: ( 'symmetric_difference' )
            // InternalExpressionDsl.g:4066:2: 'symmetric_difference'
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceAccess().getSymmetric_differenceKeyword_1_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEvoSetSymmetricDifferenceAccess().getSymmetric_differenceKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group_1__1__Impl"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group_1__2"
    // InternalExpressionDsl.g:4075:1: rule__EvoSetSymmetricDifference__Group_1__2 : rule__EvoSetSymmetricDifference__Group_1__2__Impl ;
    public final void rule__EvoSetSymmetricDifference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4079:1: ( rule__EvoSetSymmetricDifference__Group_1__2__Impl )
            // InternalExpressionDsl.g:4080:2: rule__EvoSetSymmetricDifference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetSymmetricDifference__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group_1__2"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Group_1__2__Impl"
    // InternalExpressionDsl.g:4086:1: rule__EvoSetSymmetricDifference__Group_1__2__Impl : ( ( rule__EvoSetSymmetricDifference__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoSetSymmetricDifference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4090:1: ( ( ( rule__EvoSetSymmetricDifference__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:4091:1: ( ( rule__EvoSetSymmetricDifference__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:4091:1: ( ( rule__EvoSetSymmetricDifference__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:4092:2: ( rule__EvoSetSymmetricDifference__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:4093:2: ( rule__EvoSetSymmetricDifference__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:4093:3: rule__EvoSetSymmetricDifference__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetSymmetricDifference__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Group_1__2__Impl"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group__0"
    // InternalExpressionDsl.g:4102:1: rule__EvoSetCartesianProduct__Group__0 : rule__EvoSetCartesianProduct__Group__0__Impl rule__EvoSetCartesianProduct__Group__1 ;
    public final void rule__EvoSetCartesianProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4106:1: ( rule__EvoSetCartesianProduct__Group__0__Impl rule__EvoSetCartesianProduct__Group__1 )
            // InternalExpressionDsl.g:4107:2: rule__EvoSetCartesianProduct__Group__0__Impl rule__EvoSetCartesianProduct__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__EvoSetCartesianProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetCartesianProduct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group__0"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group__0__Impl"
    // InternalExpressionDsl.g:4114:1: rule__EvoSetCartesianProduct__Group__0__Impl : ( ruleEvoElementOf ) ;
    public final void rule__EvoSetCartesianProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4118:1: ( ( ruleEvoElementOf ) )
            // InternalExpressionDsl.g:4119:1: ( ruleEvoElementOf )
            {
            // InternalExpressionDsl.g:4119:1: ( ruleEvoElementOf )
            // InternalExpressionDsl.g:4120:2: ruleEvoElementOf
            {
             before(grammarAccess.getEvoSetCartesianProductAccess().getEvoElementOfParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoElementOf();

            state._fsp--;

             after(grammarAccess.getEvoSetCartesianProductAccess().getEvoElementOfParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group__0__Impl"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group__1"
    // InternalExpressionDsl.g:4129:1: rule__EvoSetCartesianProduct__Group__1 : rule__EvoSetCartesianProduct__Group__1__Impl ;
    public final void rule__EvoSetCartesianProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4133:1: ( rule__EvoSetCartesianProduct__Group__1__Impl )
            // InternalExpressionDsl.g:4134:2: rule__EvoSetCartesianProduct__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetCartesianProduct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group__1"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group__1__Impl"
    // InternalExpressionDsl.g:4140:1: rule__EvoSetCartesianProduct__Group__1__Impl : ( ( rule__EvoSetCartesianProduct__Group_1__0 )* ) ;
    public final void rule__EvoSetCartesianProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4144:1: ( ( ( rule__EvoSetCartesianProduct__Group_1__0 )* ) )
            // InternalExpressionDsl.g:4145:1: ( ( rule__EvoSetCartesianProduct__Group_1__0 )* )
            {
            // InternalExpressionDsl.g:4145:1: ( ( rule__EvoSetCartesianProduct__Group_1__0 )* )
            // InternalExpressionDsl.g:4146:2: ( rule__EvoSetCartesianProduct__Group_1__0 )*
            {
             before(grammarAccess.getEvoSetCartesianProductAccess().getGroup_1()); 
            // InternalExpressionDsl.g:4147:2: ( rule__EvoSetCartesianProduct__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalExpressionDsl.g:4147:3: rule__EvoSetCartesianProduct__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__EvoSetCartesianProduct__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEvoSetCartesianProductAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group__1__Impl"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group_1__0"
    // InternalExpressionDsl.g:4156:1: rule__EvoSetCartesianProduct__Group_1__0 : rule__EvoSetCartesianProduct__Group_1__0__Impl rule__EvoSetCartesianProduct__Group_1__1 ;
    public final void rule__EvoSetCartesianProduct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4160:1: ( rule__EvoSetCartesianProduct__Group_1__0__Impl rule__EvoSetCartesianProduct__Group_1__1 )
            // InternalExpressionDsl.g:4161:2: rule__EvoSetCartesianProduct__Group_1__0__Impl rule__EvoSetCartesianProduct__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__EvoSetCartesianProduct__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetCartesianProduct__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group_1__0"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group_1__0__Impl"
    // InternalExpressionDsl.g:4168:1: rule__EvoSetCartesianProduct__Group_1__0__Impl : ( () ) ;
    public final void rule__EvoSetCartesianProduct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4172:1: ( ( () ) )
            // InternalExpressionDsl.g:4173:1: ( () )
            {
            // InternalExpressionDsl.g:4173:1: ( () )
            // InternalExpressionDsl.g:4174:2: ()
            {
             before(grammarAccess.getEvoSetCartesianProductAccess().getEvoSetCartesianProductOperand1Action_1_0()); 
            // InternalExpressionDsl.g:4175:2: ()
            // InternalExpressionDsl.g:4175:3: 
            {
            }

             after(grammarAccess.getEvoSetCartesianProductAccess().getEvoSetCartesianProductOperand1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group_1__0__Impl"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group_1__1"
    // InternalExpressionDsl.g:4183:1: rule__EvoSetCartesianProduct__Group_1__1 : rule__EvoSetCartesianProduct__Group_1__1__Impl rule__EvoSetCartesianProduct__Group_1__2 ;
    public final void rule__EvoSetCartesianProduct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4187:1: ( rule__EvoSetCartesianProduct__Group_1__1__Impl rule__EvoSetCartesianProduct__Group_1__2 )
            // InternalExpressionDsl.g:4188:2: rule__EvoSetCartesianProduct__Group_1__1__Impl rule__EvoSetCartesianProduct__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetCartesianProduct__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetCartesianProduct__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group_1__1"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group_1__1__Impl"
    // InternalExpressionDsl.g:4195:1: rule__EvoSetCartesianProduct__Group_1__1__Impl : ( 'x' ) ;
    public final void rule__EvoSetCartesianProduct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4199:1: ( ( 'x' ) )
            // InternalExpressionDsl.g:4200:1: ( 'x' )
            {
            // InternalExpressionDsl.g:4200:1: ( 'x' )
            // InternalExpressionDsl.g:4201:2: 'x'
            {
             before(grammarAccess.getEvoSetCartesianProductAccess().getXKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEvoSetCartesianProductAccess().getXKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group_1__1__Impl"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group_1__2"
    // InternalExpressionDsl.g:4210:1: rule__EvoSetCartesianProduct__Group_1__2 : rule__EvoSetCartesianProduct__Group_1__2__Impl ;
    public final void rule__EvoSetCartesianProduct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4214:1: ( rule__EvoSetCartesianProduct__Group_1__2__Impl )
            // InternalExpressionDsl.g:4215:2: rule__EvoSetCartesianProduct__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetCartesianProduct__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group_1__2"


    // $ANTLR start "rule__EvoSetCartesianProduct__Group_1__2__Impl"
    // InternalExpressionDsl.g:4221:1: rule__EvoSetCartesianProduct__Group_1__2__Impl : ( ( rule__EvoSetCartesianProduct__Operand2Assignment_1_2 ) ) ;
    public final void rule__EvoSetCartesianProduct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4225:1: ( ( ( rule__EvoSetCartesianProduct__Operand2Assignment_1_2 ) ) )
            // InternalExpressionDsl.g:4226:1: ( ( rule__EvoSetCartesianProduct__Operand2Assignment_1_2 ) )
            {
            // InternalExpressionDsl.g:4226:1: ( ( rule__EvoSetCartesianProduct__Operand2Assignment_1_2 ) )
            // InternalExpressionDsl.g:4227:2: ( rule__EvoSetCartesianProduct__Operand2Assignment_1_2 )
            {
             before(grammarAccess.getEvoSetCartesianProductAccess().getOperand2Assignment_1_2()); 
            // InternalExpressionDsl.g:4228:2: ( rule__EvoSetCartesianProduct__Operand2Assignment_1_2 )
            // InternalExpressionDsl.g:4228:3: rule__EvoSetCartesianProduct__Operand2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetCartesianProduct__Operand2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetCartesianProductAccess().getOperand2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Group_1__2__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group__0"
    // InternalExpressionDsl.g:4237:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4241:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalExpressionDsl.g:4242:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalExpressionDsl.g:4249:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4253:1: ( ( 'feature' ) )
            // InternalExpressionDsl.g:4254:1: ( 'feature' )
            {
            // InternalExpressionDsl.g:4254:1: ( 'feature' )
            // InternalExpressionDsl.g:4255:2: 'feature'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalExpressionDsl.g:4264:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4268:1: ( rule__EvoFeatureVariable__Group__1__Impl )
            // InternalExpressionDsl.g:4269:2: rule__EvoFeatureVariable__Group__1__Impl
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
    // InternalExpressionDsl.g:4275:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4279:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalExpressionDsl.g:4280:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalExpressionDsl.g:4280:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalExpressionDsl.g:4281:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalExpressionDsl.g:4282:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalExpressionDsl.g:4282:3: rule__EvoFeatureVariable__NameAssignment_1
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


    // $ANTLR start "rule__EvoNot__Group__0"
    // InternalExpressionDsl.g:4291:1: rule__EvoNot__Group__0 : rule__EvoNot__Group__0__Impl rule__EvoNot__Group__1 ;
    public final void rule__EvoNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4295:1: ( rule__EvoNot__Group__0__Impl rule__EvoNot__Group__1 )
            // InternalExpressionDsl.g:4296:2: rule__EvoNot__Group__0__Impl rule__EvoNot__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__EvoNot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoNot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__0"


    // $ANTLR start "rule__EvoNot__Group__0__Impl"
    // InternalExpressionDsl.g:4303:1: rule__EvoNot__Group__0__Impl : ( 'not' ) ;
    public final void rule__EvoNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4307:1: ( ( 'not' ) )
            // InternalExpressionDsl.g:4308:1: ( 'not' )
            {
            // InternalExpressionDsl.g:4308:1: ( 'not' )
            // InternalExpressionDsl.g:4309:2: 'not'
            {
             before(grammarAccess.getEvoNotAccess().getNotKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEvoNotAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__0__Impl"


    // $ANTLR start "rule__EvoNot__Group__1"
    // InternalExpressionDsl.g:4318:1: rule__EvoNot__Group__1 : rule__EvoNot__Group__1__Impl rule__EvoNot__Group__2 ;
    public final void rule__EvoNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4322:1: ( rule__EvoNot__Group__1__Impl rule__EvoNot__Group__2 )
            // InternalExpressionDsl.g:4323:2: rule__EvoNot__Group__1__Impl rule__EvoNot__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoNot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoNot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__1"


    // $ANTLR start "rule__EvoNot__Group__1__Impl"
    // InternalExpressionDsl.g:4330:1: rule__EvoNot__Group__1__Impl : ( '(' ) ;
    public final void rule__EvoNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4334:1: ( ( '(' ) )
            // InternalExpressionDsl.g:4335:1: ( '(' )
            {
            // InternalExpressionDsl.g:4335:1: ( '(' )
            // InternalExpressionDsl.g:4336:2: '('
            {
             before(grammarAccess.getEvoNotAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEvoNotAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__1__Impl"


    // $ANTLR start "rule__EvoNot__Group__2"
    // InternalExpressionDsl.g:4345:1: rule__EvoNot__Group__2 : rule__EvoNot__Group__2__Impl rule__EvoNot__Group__3 ;
    public final void rule__EvoNot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4349:1: ( rule__EvoNot__Group__2__Impl rule__EvoNot__Group__3 )
            // InternalExpressionDsl.g:4350:2: rule__EvoNot__Group__2__Impl rule__EvoNot__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__EvoNot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoNot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__2"


    // $ANTLR start "rule__EvoNot__Group__2__Impl"
    // InternalExpressionDsl.g:4357:1: rule__EvoNot__Group__2__Impl : ( ( rule__EvoNot__OperandAssignment_2 ) ) ;
    public final void rule__EvoNot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4361:1: ( ( ( rule__EvoNot__OperandAssignment_2 ) ) )
            // InternalExpressionDsl.g:4362:1: ( ( rule__EvoNot__OperandAssignment_2 ) )
            {
            // InternalExpressionDsl.g:4362:1: ( ( rule__EvoNot__OperandAssignment_2 ) )
            // InternalExpressionDsl.g:4363:2: ( rule__EvoNot__OperandAssignment_2 )
            {
             before(grammarAccess.getEvoNotAccess().getOperandAssignment_2()); 
            // InternalExpressionDsl.g:4364:2: ( rule__EvoNot__OperandAssignment_2 )
            // InternalExpressionDsl.g:4364:3: rule__EvoNot__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoNot__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoNotAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__2__Impl"


    // $ANTLR start "rule__EvoNot__Group__3"
    // InternalExpressionDsl.g:4372:1: rule__EvoNot__Group__3 : rule__EvoNot__Group__3__Impl ;
    public final void rule__EvoNot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4376:1: ( rule__EvoNot__Group__3__Impl )
            // InternalExpressionDsl.g:4377:2: rule__EvoNot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoNot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__3"


    // $ANTLR start "rule__EvoNot__Group__3__Impl"
    // InternalExpressionDsl.g:4383:1: rule__EvoNot__Group__3__Impl : ( ')' ) ;
    public final void rule__EvoNot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4387:1: ( ( ')' ) )
            // InternalExpressionDsl.g:4388:1: ( ')' )
            {
            // InternalExpressionDsl.g:4388:1: ( ')' )
            // InternalExpressionDsl.g:4389:2: ')'
            {
             before(grammarAccess.getEvoNotAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEvoNotAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__Group__3__Impl"


    // $ANTLR start "rule__EvoSize__Group__0"
    // InternalExpressionDsl.g:4399:1: rule__EvoSize__Group__0 : rule__EvoSize__Group__0__Impl rule__EvoSize__Group__1 ;
    public final void rule__EvoSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4403:1: ( rule__EvoSize__Group__0__Impl rule__EvoSize__Group__1 )
            // InternalExpressionDsl.g:4404:2: rule__EvoSize__Group__0__Impl rule__EvoSize__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EvoSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSize__Group__0"


    // $ANTLR start "rule__EvoSize__Group__0__Impl"
    // InternalExpressionDsl.g:4411:1: rule__EvoSize__Group__0__Impl : ( () ) ;
    public final void rule__EvoSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4415:1: ( ( () ) )
            // InternalExpressionDsl.g:4416:1: ( () )
            {
            // InternalExpressionDsl.g:4416:1: ( () )
            // InternalExpressionDsl.g:4417:2: ()
            {
             before(grammarAccess.getEvoSizeAccess().getEvoSizeAction_0()); 
            // InternalExpressionDsl.g:4418:2: ()
            // InternalExpressionDsl.g:4418:3: 
            {
            }

             after(grammarAccess.getEvoSizeAccess().getEvoSizeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSize__Group__0__Impl"


    // $ANTLR start "rule__EvoSize__Group__1"
    // InternalExpressionDsl.g:4426:1: rule__EvoSize__Group__1 : rule__EvoSize__Group__1__Impl ;
    public final void rule__EvoSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4430:1: ( rule__EvoSize__Group__1__Impl )
            // InternalExpressionDsl.g:4431:2: rule__EvoSize__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSize__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSize__Group__1"


    // $ANTLR start "rule__EvoSize__Group__1__Impl"
    // InternalExpressionDsl.g:4437:1: rule__EvoSize__Group__1__Impl : ( ( rule__EvoSize__SizeAssignment_1 ) ) ;
    public final void rule__EvoSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4441:1: ( ( ( rule__EvoSize__SizeAssignment_1 ) ) )
            // InternalExpressionDsl.g:4442:1: ( ( rule__EvoSize__SizeAssignment_1 ) )
            {
            // InternalExpressionDsl.g:4442:1: ( ( rule__EvoSize__SizeAssignment_1 ) )
            // InternalExpressionDsl.g:4443:2: ( rule__EvoSize__SizeAssignment_1 )
            {
             before(grammarAccess.getEvoSizeAccess().getSizeAssignment_1()); 
            // InternalExpressionDsl.g:4444:2: ( rule__EvoSize__SizeAssignment_1 )
            // InternalExpressionDsl.g:4444:3: rule__EvoSize__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoSize__SizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoSizeAccess().getSizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSize__Group__1__Impl"


    // $ANTLR start "rule__EvoVariableTerm__Group__0"
    // InternalExpressionDsl.g:4453:1: rule__EvoVariableTerm__Group__0 : rule__EvoVariableTerm__Group__0__Impl rule__EvoVariableTerm__Group__1 ;
    public final void rule__EvoVariableTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4457:1: ( rule__EvoVariableTerm__Group__0__Impl rule__EvoVariableTerm__Group__1 )
            // InternalExpressionDsl.g:4458:2: rule__EvoVariableTerm__Group__0__Impl rule__EvoVariableTerm__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalExpressionDsl.g:4465:1: rule__EvoVariableTerm__Group__0__Impl : ( ( rule__EvoVariableTerm__VariableAssignment_0 ) ) ;
    public final void rule__EvoVariableTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4469:1: ( ( ( rule__EvoVariableTerm__VariableAssignment_0 ) ) )
            // InternalExpressionDsl.g:4470:1: ( ( rule__EvoVariableTerm__VariableAssignment_0 ) )
            {
            // InternalExpressionDsl.g:4470:1: ( ( rule__EvoVariableTerm__VariableAssignment_0 ) )
            // InternalExpressionDsl.g:4471:2: ( rule__EvoVariableTerm__VariableAssignment_0 )
            {
             before(grammarAccess.getEvoVariableTermAccess().getVariableAssignment_0()); 
            // InternalExpressionDsl.g:4472:2: ( rule__EvoVariableTerm__VariableAssignment_0 )
            // InternalExpressionDsl.g:4472:3: rule__EvoVariableTerm__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableTermAccess().getVariableAssignment_0()); 

            }


            }

        }
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
    // InternalExpressionDsl.g:4480:1: rule__EvoVariableTerm__Group__1 : rule__EvoVariableTerm__Group__1__Impl ;
    public final void rule__EvoVariableTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4484:1: ( rule__EvoVariableTerm__Group__1__Impl )
            // InternalExpressionDsl.g:4485:2: rule__EvoVariableTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariableTerm__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalExpressionDsl.g:4491:1: rule__EvoVariableTerm__Group__1__Impl : ( ( rule__EvoVariableTerm__TypeAssignment_1 )? ) ;
    public final void rule__EvoVariableTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4495:1: ( ( ( rule__EvoVariableTerm__TypeAssignment_1 )? ) )
            // InternalExpressionDsl.g:4496:1: ( ( rule__EvoVariableTerm__TypeAssignment_1 )? )
            {
            // InternalExpressionDsl.g:4496:1: ( ( rule__EvoVariableTerm__TypeAssignment_1 )? )
            // InternalExpressionDsl.g:4497:2: ( rule__EvoVariableTerm__TypeAssignment_1 )?
            {
             before(grammarAccess.getEvoVariableTermAccess().getTypeAssignment_1()); 
            // InternalExpressionDsl.g:4498:2: ( rule__EvoVariableTerm__TypeAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=18 && LA31_0<=20)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalExpressionDsl.g:4498:3: rule__EvoVariableTerm__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoVariableTerm__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoVariableTermAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__0"
    // InternalExpressionDsl.g:4507:1: rule__EvoApplicationConstraintTerm__Group__0 : rule__EvoApplicationConstraintTerm__Group__0__Impl rule__EvoApplicationConstraintTerm__Group__1 ;
    public final void rule__EvoApplicationConstraintTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4511:1: ( rule__EvoApplicationConstraintTerm__Group__0__Impl rule__EvoApplicationConstraintTerm__Group__1 )
            // InternalExpressionDsl.g:4512:2: rule__EvoApplicationConstraintTerm__Group__0__Impl rule__EvoApplicationConstraintTerm__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__EvoApplicationConstraintTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoApplicationConstraintTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__0"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__0__Impl"
    // InternalExpressionDsl.g:4519:1: rule__EvoApplicationConstraintTerm__Group__0__Impl : ( 'AC' ) ;
    public final void rule__EvoApplicationConstraintTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4523:1: ( ( 'AC' ) )
            // InternalExpressionDsl.g:4524:1: ( 'AC' )
            {
            // InternalExpressionDsl.g:4524:1: ( 'AC' )
            // InternalExpressionDsl.g:4525:2: 'AC'
            {
             before(grammarAccess.getEvoApplicationConstraintTermAccess().getACKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEvoApplicationConstraintTermAccess().getACKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__0__Impl"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__1"
    // InternalExpressionDsl.g:4534:1: rule__EvoApplicationConstraintTerm__Group__1 : rule__EvoApplicationConstraintTerm__Group__1__Impl rule__EvoApplicationConstraintTerm__Group__2 ;
    public final void rule__EvoApplicationConstraintTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4538:1: ( rule__EvoApplicationConstraintTerm__Group__1__Impl rule__EvoApplicationConstraintTerm__Group__2 )
            // InternalExpressionDsl.g:4539:2: rule__EvoApplicationConstraintTerm__Group__1__Impl rule__EvoApplicationConstraintTerm__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EvoApplicationConstraintTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoApplicationConstraintTerm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__1"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__1__Impl"
    // InternalExpressionDsl.g:4546:1: rule__EvoApplicationConstraintTerm__Group__1__Impl : ( '(' ) ;
    public final void rule__EvoApplicationConstraintTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4550:1: ( ( '(' ) )
            // InternalExpressionDsl.g:4551:1: ( '(' )
            {
            // InternalExpressionDsl.g:4551:1: ( '(' )
            // InternalExpressionDsl.g:4552:2: '('
            {
             before(grammarAccess.getEvoApplicationConstraintTermAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEvoApplicationConstraintTermAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__1__Impl"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__2"
    // InternalExpressionDsl.g:4561:1: rule__EvoApplicationConstraintTerm__Group__2 : rule__EvoApplicationConstraintTerm__Group__2__Impl rule__EvoApplicationConstraintTerm__Group__3 ;
    public final void rule__EvoApplicationConstraintTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4565:1: ( rule__EvoApplicationConstraintTerm__Group__2__Impl rule__EvoApplicationConstraintTerm__Group__3 )
            // InternalExpressionDsl.g:4566:2: rule__EvoApplicationConstraintTerm__Group__2__Impl rule__EvoApplicationConstraintTerm__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__EvoApplicationConstraintTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoApplicationConstraintTerm__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__2"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__2__Impl"
    // InternalExpressionDsl.g:4573:1: rule__EvoApplicationConstraintTerm__Group__2__Impl : ( ( rule__EvoApplicationConstraintTerm__VariableAssignment_2 ) ) ;
    public final void rule__EvoApplicationConstraintTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4577:1: ( ( ( rule__EvoApplicationConstraintTerm__VariableAssignment_2 ) ) )
            // InternalExpressionDsl.g:4578:1: ( ( rule__EvoApplicationConstraintTerm__VariableAssignment_2 ) )
            {
            // InternalExpressionDsl.g:4578:1: ( ( rule__EvoApplicationConstraintTerm__VariableAssignment_2 ) )
            // InternalExpressionDsl.g:4579:2: ( rule__EvoApplicationConstraintTerm__VariableAssignment_2 )
            {
             before(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableAssignment_2()); 
            // InternalExpressionDsl.g:4580:2: ( rule__EvoApplicationConstraintTerm__VariableAssignment_2 )
            // InternalExpressionDsl.g:4580:3: rule__EvoApplicationConstraintTerm__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoApplicationConstraintTerm__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__2__Impl"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__3"
    // InternalExpressionDsl.g:4588:1: rule__EvoApplicationConstraintTerm__Group__3 : rule__EvoApplicationConstraintTerm__Group__3__Impl ;
    public final void rule__EvoApplicationConstraintTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4592:1: ( rule__EvoApplicationConstraintTerm__Group__3__Impl )
            // InternalExpressionDsl.g:4593:2: rule__EvoApplicationConstraintTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoApplicationConstraintTerm__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__3"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__Group__3__Impl"
    // InternalExpressionDsl.g:4599:1: rule__EvoApplicationConstraintTerm__Group__3__Impl : ( ')' ) ;
    public final void rule__EvoApplicationConstraintTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4603:1: ( ( ')' ) )
            // InternalExpressionDsl.g:4604:1: ( ')' )
            {
            // InternalExpressionDsl.g:4604:1: ( ')' )
            // InternalExpressionDsl.g:4605:2: ')'
            {
             before(grammarAccess.getEvoApplicationConstraintTermAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEvoApplicationConstraintTermAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__Group__3__Impl"


    // $ANTLR start "rule__EvoGroupTerm__Group__0"
    // InternalExpressionDsl.g:4615:1: rule__EvoGroupTerm__Group__0 : rule__EvoGroupTerm__Group__0__Impl rule__EvoGroupTerm__Group__1 ;
    public final void rule__EvoGroupTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4619:1: ( rule__EvoGroupTerm__Group__0__Impl rule__EvoGroupTerm__Group__1 )
            // InternalExpressionDsl.g:4620:2: rule__EvoGroupTerm__Group__0__Impl rule__EvoGroupTerm__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__EvoGroupTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoGroupTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGroupTerm__Group__0"


    // $ANTLR start "rule__EvoGroupTerm__Group__0__Impl"
    // InternalExpressionDsl.g:4627:1: rule__EvoGroupTerm__Group__0__Impl : ( ( rule__EvoGroupTerm__VariableAssignment_0 ) ) ;
    public final void rule__EvoGroupTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4631:1: ( ( ( rule__EvoGroupTerm__VariableAssignment_0 ) ) )
            // InternalExpressionDsl.g:4632:1: ( ( rule__EvoGroupTerm__VariableAssignment_0 ) )
            {
            // InternalExpressionDsl.g:4632:1: ( ( rule__EvoGroupTerm__VariableAssignment_0 ) )
            // InternalExpressionDsl.g:4633:2: ( rule__EvoGroupTerm__VariableAssignment_0 )
            {
             before(grammarAccess.getEvoGroupTermAccess().getVariableAssignment_0()); 
            // InternalExpressionDsl.g:4634:2: ( rule__EvoGroupTerm__VariableAssignment_0 )
            // InternalExpressionDsl.g:4634:3: rule__EvoGroupTerm__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupTerm__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvoGroupTermAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGroupTerm__Group__0__Impl"


    // $ANTLR start "rule__EvoGroupTerm__Group__1"
    // InternalExpressionDsl.g:4642:1: rule__EvoGroupTerm__Group__1 : rule__EvoGroupTerm__Group__1__Impl ;
    public final void rule__EvoGroupTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4646:1: ( rule__EvoGroupTerm__Group__1__Impl )
            // InternalExpressionDsl.g:4647:2: rule__EvoGroupTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGroupTerm__Group__1"


    // $ANTLR start "rule__EvoGroupTerm__Group__1__Impl"
    // InternalExpressionDsl.g:4653:1: rule__EvoGroupTerm__Group__1__Impl : ( ( rule__EvoGroupTerm__TypeAssignment_1 )? ) ;
    public final void rule__EvoGroupTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4657:1: ( ( ( rule__EvoGroupTerm__TypeAssignment_1 )? ) )
            // InternalExpressionDsl.g:4658:1: ( ( rule__EvoGroupTerm__TypeAssignment_1 )? )
            {
            // InternalExpressionDsl.g:4658:1: ( ( rule__EvoGroupTerm__TypeAssignment_1 )? )
            // InternalExpressionDsl.g:4659:2: ( rule__EvoGroupTerm__TypeAssignment_1 )?
            {
             before(grammarAccess.getEvoGroupTermAccess().getTypeAssignment_1()); 
            // InternalExpressionDsl.g:4660:2: ( rule__EvoGroupTerm__TypeAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=18 && LA32_0<=20)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalExpressionDsl.g:4660:3: rule__EvoGroupTerm__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoGroupTerm__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoGroupTermAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGroupTerm__Group__1__Impl"


    // $ANTLR start "rule__EvoSetTerm__Group__0"
    // InternalExpressionDsl.g:4669:1: rule__EvoSetTerm__Group__0 : rule__EvoSetTerm__Group__0__Impl rule__EvoSetTerm__Group__1 ;
    public final void rule__EvoSetTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4673:1: ( rule__EvoSetTerm__Group__0__Impl rule__EvoSetTerm__Group__1 )
            // InternalExpressionDsl.g:4674:2: rule__EvoSetTerm__Group__0__Impl rule__EvoSetTerm__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__EvoSetTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__0"


    // $ANTLR start "rule__EvoSetTerm__Group__0__Impl"
    // InternalExpressionDsl.g:4681:1: rule__EvoSetTerm__Group__0__Impl : ( '{' ) ;
    public final void rule__EvoSetTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4685:1: ( ( '{' ) )
            // InternalExpressionDsl.g:4686:1: ( '{' )
            {
            // InternalExpressionDsl.g:4686:1: ( '{' )
            // InternalExpressionDsl.g:4687:2: '{'
            {
             before(grammarAccess.getEvoSetTermAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEvoSetTermAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__0__Impl"


    // $ANTLR start "rule__EvoSetTerm__Group__1"
    // InternalExpressionDsl.g:4696:1: rule__EvoSetTerm__Group__1 : rule__EvoSetTerm__Group__1__Impl rule__EvoSetTerm__Group__2 ;
    public final void rule__EvoSetTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4700:1: ( rule__EvoSetTerm__Group__1__Impl rule__EvoSetTerm__Group__2 )
            // InternalExpressionDsl.g:4701:2: rule__EvoSetTerm__Group__1__Impl rule__EvoSetTerm__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__EvoSetTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__1"


    // $ANTLR start "rule__EvoSetTerm__Group__1__Impl"
    // InternalExpressionDsl.g:4708:1: rule__EvoSetTerm__Group__1__Impl : ( ( rule__EvoSetTerm__VariablesAssignment_1 ) ) ;
    public final void rule__EvoSetTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4712:1: ( ( ( rule__EvoSetTerm__VariablesAssignment_1 ) ) )
            // InternalExpressionDsl.g:4713:1: ( ( rule__EvoSetTerm__VariablesAssignment_1 ) )
            {
            // InternalExpressionDsl.g:4713:1: ( ( rule__EvoSetTerm__VariablesAssignment_1 ) )
            // InternalExpressionDsl.g:4714:2: ( rule__EvoSetTerm__VariablesAssignment_1 )
            {
             before(grammarAccess.getEvoSetTermAccess().getVariablesAssignment_1()); 
            // InternalExpressionDsl.g:4715:2: ( rule__EvoSetTerm__VariablesAssignment_1 )
            // InternalExpressionDsl.g:4715:3: rule__EvoSetTerm__VariablesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__VariablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetTermAccess().getVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__1__Impl"


    // $ANTLR start "rule__EvoSetTerm__Group__2"
    // InternalExpressionDsl.g:4723:1: rule__EvoSetTerm__Group__2 : rule__EvoSetTerm__Group__2__Impl rule__EvoSetTerm__Group__3 ;
    public final void rule__EvoSetTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4727:1: ( rule__EvoSetTerm__Group__2__Impl rule__EvoSetTerm__Group__3 )
            // InternalExpressionDsl.g:4728:2: rule__EvoSetTerm__Group__2__Impl rule__EvoSetTerm__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__EvoSetTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__2"


    // $ANTLR start "rule__EvoSetTerm__Group__2__Impl"
    // InternalExpressionDsl.g:4735:1: rule__EvoSetTerm__Group__2__Impl : ( ( rule__EvoSetTerm__Group_2__0 )* ) ;
    public final void rule__EvoSetTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4739:1: ( ( ( rule__EvoSetTerm__Group_2__0 )* ) )
            // InternalExpressionDsl.g:4740:1: ( ( rule__EvoSetTerm__Group_2__0 )* )
            {
            // InternalExpressionDsl.g:4740:1: ( ( rule__EvoSetTerm__Group_2__0 )* )
            // InternalExpressionDsl.g:4741:2: ( rule__EvoSetTerm__Group_2__0 )*
            {
             before(grammarAccess.getEvoSetTermAccess().getGroup_2()); 
            // InternalExpressionDsl.g:4742:2: ( rule__EvoSetTerm__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==35) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalExpressionDsl.g:4742:3: rule__EvoSetTerm__Group_2__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__EvoSetTerm__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEvoSetTermAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__2__Impl"


    // $ANTLR start "rule__EvoSetTerm__Group__3"
    // InternalExpressionDsl.g:4750:1: rule__EvoSetTerm__Group__3 : rule__EvoSetTerm__Group__3__Impl ;
    public final void rule__EvoSetTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4754:1: ( rule__EvoSetTerm__Group__3__Impl )
            // InternalExpressionDsl.g:4755:2: rule__EvoSetTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__3"


    // $ANTLR start "rule__EvoSetTerm__Group__3__Impl"
    // InternalExpressionDsl.g:4761:1: rule__EvoSetTerm__Group__3__Impl : ( '}' ) ;
    public final void rule__EvoSetTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4765:1: ( ( '}' ) )
            // InternalExpressionDsl.g:4766:1: ( '}' )
            {
            // InternalExpressionDsl.g:4766:1: ( '}' )
            // InternalExpressionDsl.g:4767:2: '}'
            {
             before(grammarAccess.getEvoSetTermAccess().getRightCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getEvoSetTermAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group__3__Impl"


    // $ANTLR start "rule__EvoSetTerm__Group_2__0"
    // InternalExpressionDsl.g:4777:1: rule__EvoSetTerm__Group_2__0 : rule__EvoSetTerm__Group_2__0__Impl rule__EvoSetTerm__Group_2__1 ;
    public final void rule__EvoSetTerm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4781:1: ( rule__EvoSetTerm__Group_2__0__Impl rule__EvoSetTerm__Group_2__1 )
            // InternalExpressionDsl.g:4782:2: rule__EvoSetTerm__Group_2__0__Impl rule__EvoSetTerm__Group_2__1
            {
            pushFollow(FOLLOW_47);
            rule__EvoSetTerm__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group_2__0"


    // $ANTLR start "rule__EvoSetTerm__Group_2__0__Impl"
    // InternalExpressionDsl.g:4789:1: rule__EvoSetTerm__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetTerm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4793:1: ( ( ',' ) )
            // InternalExpressionDsl.g:4794:1: ( ',' )
            {
            // InternalExpressionDsl.g:4794:1: ( ',' )
            // InternalExpressionDsl.g:4795:2: ','
            {
             before(grammarAccess.getEvoSetTermAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEvoSetTermAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group_2__0__Impl"


    // $ANTLR start "rule__EvoSetTerm__Group_2__1"
    // InternalExpressionDsl.g:4804:1: rule__EvoSetTerm__Group_2__1 : rule__EvoSetTerm__Group_2__1__Impl ;
    public final void rule__EvoSetTerm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4808:1: ( rule__EvoSetTerm__Group_2__1__Impl )
            // InternalExpressionDsl.g:4809:2: rule__EvoSetTerm__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group_2__1"


    // $ANTLR start "rule__EvoSetTerm__Group_2__1__Impl"
    // InternalExpressionDsl.g:4815:1: rule__EvoSetTerm__Group_2__1__Impl : ( ( rule__EvoSetTerm__VariablesAssignment_2_1 ) ) ;
    public final void rule__EvoSetTerm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4819:1: ( ( ( rule__EvoSetTerm__VariablesAssignment_2_1 ) ) )
            // InternalExpressionDsl.g:4820:1: ( ( rule__EvoSetTerm__VariablesAssignment_2_1 ) )
            {
            // InternalExpressionDsl.g:4820:1: ( ( rule__EvoSetTerm__VariablesAssignment_2_1 ) )
            // InternalExpressionDsl.g:4821:2: ( rule__EvoSetTerm__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetTermAccess().getVariablesAssignment_2_1()); 
            // InternalExpressionDsl.g:4822:2: ( rule__EvoSetTerm__VariablesAssignment_2_1 )
            // InternalExpressionDsl.g:4822:3: rule__EvoSetTerm__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetTerm__VariablesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetTermAccess().getVariablesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__Group_2__1__Impl"


    // $ANTLR start "rule__GrammarEntry__ExpressionAssignment"
    // InternalExpressionDsl.g:4831:1: rule__GrammarEntry__ExpressionAssignment : ( ruleEvoExpression ) ;
    public final void rule__GrammarEntry__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4835:1: ( ( ruleEvoExpression ) )
            // InternalExpressionDsl.g:4836:2: ( ruleEvoExpression )
            {
            // InternalExpressionDsl.g:4836:2: ( ruleEvoExpression )
            // InternalExpressionDsl.g:4837:3: ruleEvoExpression
            {
             before(grammarAccess.getGrammarEntryAccess().getExpressionEvoExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoExpression();

            state._fsp--;

             after(grammarAccess.getGrammarEntryAccess().getExpressionEvoExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarEntry__ExpressionAssignment"


    // $ANTLR start "rule__EvoElementOf__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:4846:1: rule__EvoElementOf__Operand2Assignment_1_2 : ( ruleEvoTerminal ) ;
    public final void rule__EvoElementOf__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4850:1: ( ( ruleEvoTerminal ) )
            // InternalExpressionDsl.g:4851:2: ( ruleEvoTerminal )
            {
            // InternalExpressionDsl.g:4851:2: ( ruleEvoTerminal )
            // InternalExpressionDsl.g:4852:3: ruleEvoTerminal
            {
             before(grammarAccess.getEvoElementOfAccess().getOperand2EvoTerminalParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoTerminal();

            state._fsp--;

             after(grammarAccess.getEvoElementOfAccess().getOperand2EvoTerminalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoElementOf__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoNestedExpression__OperandAssignment_1"
    // InternalExpressionDsl.g:4861:1: rule__EvoNestedExpression__OperandAssignment_1 : ( ruleEvoExpression ) ;
    public final void rule__EvoNestedExpression__OperandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4865:1: ( ( ruleEvoExpression ) )
            // InternalExpressionDsl.g:4866:2: ( ruleEvoExpression )
            {
            // InternalExpressionDsl.g:4866:2: ( ruleEvoExpression )
            // InternalExpressionDsl.g:4867:3: ruleEvoExpression
            {
             before(grammarAccess.getEvoNestedExpressionAccess().getOperandEvoExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoExpression();

            state._fsp--;

             after(grammarAccess.getEvoNestedExpressionAccess().getOperandEvoExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNestedExpression__OperandAssignment_1"


    // $ANTLR start "rule__EvoImplication__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:4876:1: rule__EvoImplication__Operand2Assignment_1_2 : ( ruleEvoBiconditionalSize ) ;
    public final void rule__EvoImplication__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4880:1: ( ( ruleEvoBiconditionalSize ) )
            // InternalExpressionDsl.g:4881:2: ( ruleEvoBiconditionalSize )
            {
            // InternalExpressionDsl.g:4881:2: ( ruleEvoBiconditionalSize )
            // InternalExpressionDsl.g:4882:3: ruleEvoBiconditionalSize
            {
             before(grammarAccess.getEvoImplicationAccess().getOperand2EvoBiconditionalSizeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoBiconditionalSize();

            state._fsp--;

             after(grammarAccess.getEvoImplicationAccess().getOperand2EvoBiconditionalSizeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoImplication__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoFeatureReferenceExpression__FeatureAssignment"
    // InternalExpressionDsl.g:4891:1: rule__EvoFeatureReferenceExpression__FeatureAssignment : ( ( RULE_STRING ) ) ;
    public final void rule__EvoFeatureReferenceExpression__FeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4895:1: ( ( ( RULE_STRING ) ) )
            // InternalExpressionDsl.g:4896:2: ( ( RULE_STRING ) )
            {
            // InternalExpressionDsl.g:4896:2: ( ( RULE_STRING ) )
            // InternalExpressionDsl.g:4897:3: ( RULE_STRING )
            {
             before(grammarAccess.getEvoFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0()); 
            // InternalExpressionDsl.g:4898:3: ( RULE_STRING )
            // InternalExpressionDsl.g:4899:4: RULE_STRING
            {
             before(grammarAccess.getEvoFeatureReferenceExpressionAccess().getFeatureHyFeatureSTRINGTerminalRuleCall_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureReferenceExpressionAccess().getFeatureHyFeatureSTRINGTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEvoFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureReferenceExpression__FeatureAssignment"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__OperatorAssignment_1"
    // InternalExpressionDsl.g:4910:1: rule__EvoRelativeVersionRestriction__OperatorAssignment_1 : ( ruleEvoRelativeVersionRestrictionOperator ) ;
    public final void rule__EvoRelativeVersionRestriction__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4914:1: ( ( ruleEvoRelativeVersionRestrictionOperator ) )
            // InternalExpressionDsl.g:4915:2: ( ruleEvoRelativeVersionRestrictionOperator )
            {
            // InternalExpressionDsl.g:4915:2: ( ruleEvoRelativeVersionRestrictionOperator )
            // InternalExpressionDsl.g:4916:3: ruleEvoRelativeVersionRestrictionOperator
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getOperatorEvoRelativeVersionRestrictionOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoRelativeVersionRestrictionOperator();

            state._fsp--;

             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getOperatorEvoRelativeVersionRestrictionOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__OperatorAssignment_1"


    // $ANTLR start "rule__EvoRelativeVersionRestriction__VersionAssignment_2"
    // InternalExpressionDsl.g:4925:1: rule__EvoRelativeVersionRestriction__VersionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EvoRelativeVersionRestriction__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4929:1: ( ( ( RULE_ID ) ) )
            // InternalExpressionDsl.g:4930:2: ( ( RULE_ID ) )
            {
            // InternalExpressionDsl.g:4930:2: ( ( RULE_ID ) )
            // InternalExpressionDsl.g:4931:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getVersionHyVersionCrossReference_2_0()); 
            // InternalExpressionDsl.g:4932:3: ( RULE_ID )
            // InternalExpressionDsl.g:4933:4: RULE_ID
            {
             before(grammarAccess.getEvoRelativeVersionRestrictionAccess().getVersionHyVersionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getVersionHyVersionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEvoRelativeVersionRestrictionAccess().getVersionHyVersionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoRelativeVersionRestriction__VersionAssignment_2"


    // $ANTLR start "rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1"
    // InternalExpressionDsl.g:4944:1: rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1 : ( ( 'true' ) ) ;
    public final void rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4948:1: ( ( ( 'true' ) ) )
            // InternalExpressionDsl.g:4949:2: ( ( 'true' ) )
            {
            // InternalExpressionDsl.g:4949:2: ( ( 'true' ) )
            // InternalExpressionDsl.g:4950:3: ( 'true' )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerIncludedTrueKeyword_0_1_0()); 
            // InternalExpressionDsl.g:4951:3: ( 'true' )
            // InternalExpressionDsl.g:4952:4: 'true'
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerIncludedTrueKeyword_0_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerIncludedTrueKeyword_0_1_0()); 

            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerIncludedTrueKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__LowerIncludedAssignment_0_1"


    // $ANTLR start "rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1"
    // InternalExpressionDsl.g:4963:1: rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4967:1: ( ( ( ruleQualifiedName ) ) )
            // InternalExpressionDsl.g:4968:2: ( ( ruleQualifiedName ) )
            {
            // InternalExpressionDsl.g:4968:2: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:4969:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerVersionHyVersionCrossReference_1_1_0()); 
            // InternalExpressionDsl.g:4970:3: ( ruleQualifiedName )
            // InternalExpressionDsl.g:4971:4: ruleQualifiedName
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerVersionHyVersionQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerVersionHyVersionQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerVersionHyVersionCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__LowerVersionAssignment_1_1"


    // $ANTLR start "rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3"
    // InternalExpressionDsl.g:4982:1: rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3 : ( ( 'true' ) ) ;
    public final void rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:4986:1: ( ( ( 'true' ) ) )
            // InternalExpressionDsl.g:4987:2: ( ( 'true' ) )
            {
            // InternalExpressionDsl.g:4987:2: ( ( 'true' ) )
            // InternalExpressionDsl.g:4988:3: ( 'true' )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperIncludedTrueKeyword_1_3_0()); 
            // InternalExpressionDsl.g:4989:3: ( 'true' )
            // InternalExpressionDsl.g:4990:4: 'true'
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperIncludedTrueKeyword_1_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperIncludedTrueKeyword_1_3_0()); 

            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperIncludedTrueKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__UpperIncludedAssignment_1_3"


    // $ANTLR start "rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1"
    // InternalExpressionDsl.g:5001:1: rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5005:1: ( ( ( ruleQualifiedName ) ) )
            // InternalExpressionDsl.g:5006:2: ( ( ruleQualifiedName ) )
            {
            // InternalExpressionDsl.g:5006:2: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:5007:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperVersionHyVersionCrossReference_2_1_0()); 
            // InternalExpressionDsl.g:5008:3: ( ruleQualifiedName )
            // InternalExpressionDsl.g:5009:4: ruleQualifiedName
            {
             before(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperVersionHyVersionQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperVersionHyVersionQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperVersionHyVersionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVersionRangeRestriction__UpperVersionAssignment_2_1"


    // $ANTLR start "rule__EvoNumberValue__ValueAssignment"
    // InternalExpressionDsl.g:5020:1: rule__EvoNumberValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__EvoNumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5024:1: ( ( RULE_INT ) )
            // InternalExpressionDsl.g:5025:2: ( RULE_INT )
            {
            // InternalExpressionDsl.g:5025:2: ( RULE_INT )
            // InternalExpressionDsl.g:5026:3: RULE_INT
            {
             before(grammarAccess.getEvoNumberValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvoNumberValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNumberValue__ValueAssignment"


    // $ANTLR start "rule__EvoBooleanValue__ValueAssignment_1_0"
    // InternalExpressionDsl.g:5035:1: rule__EvoBooleanValue__ValueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__EvoBooleanValue__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5039:1: ( ( ( 'true' ) ) )
            // InternalExpressionDsl.g:5040:2: ( ( 'true' ) )
            {
            // InternalExpressionDsl.g:5040:2: ( ( 'true' ) )
            // InternalExpressionDsl.g:5041:3: ( 'true' )
            {
             before(grammarAccess.getEvoBooleanValueAccess().getValueTrueKeyword_1_0_0()); 
            // InternalExpressionDsl.g:5042:3: ( 'true' )
            // InternalExpressionDsl.g:5043:4: 'true'
            {
             before(grammarAccess.getEvoBooleanValueAccess().getValueTrueKeyword_1_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEvoBooleanValueAccess().getValueTrueKeyword_1_0_0()); 

            }

             after(grammarAccess.getEvoBooleanValueAccess().getValueTrueKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBooleanValue__ValueAssignment_1_0"


    // $ANTLR start "rule__EvoEnumLiteral__NameAssignment_1"
    // InternalExpressionDsl.g:5054:1: rule__EvoEnumLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoEnumLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5058:1: ( ( RULE_ID ) )
            // InternalExpressionDsl.g:5059:2: ( RULE_ID )
            {
            // InternalExpressionDsl.g:5059:2: ( RULE_ID )
            // InternalExpressionDsl.g:5060:3: RULE_ID
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__NameAssignment_1"


    // $ANTLR start "rule__EvoEnumLiteral__ValueAssignment_3"
    // InternalExpressionDsl.g:5069:1: rule__EvoEnumLiteral__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__EvoEnumLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5073:1: ( ( RULE_INT ) )
            // InternalExpressionDsl.g:5074:2: ( RULE_INT )
            {
            // InternalExpressionDsl.g:5074:2: ( RULE_INT )
            // InternalExpressionDsl.g:5075:3: RULE_INT
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__ValueAssignment_3"


    // $ANTLR start "rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0"
    // InternalExpressionDsl.g:5084:1: rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0 : ( RULE_DATE ) ;
    public final void rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5088:1: ( ( RULE_DATE ) )
            // InternalExpressionDsl.g:5089:2: ( RULE_DATE )
            {
            // InternalExpressionDsl.g:5089:2: ( RULE_DATE )
            // InternalExpressionDsl.g:5090:3: RULE_DATE
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_0_0_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__ValidSinceAssignment_5_1_0_0"


    // $ANTLR start "rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2"
    // InternalExpressionDsl.g:5099:1: rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2 : ( RULE_DATE ) ;
    public final void rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5103:1: ( ( RULE_DATE ) )
            // InternalExpressionDsl.g:5104:2: ( RULE_DATE )
            {
            // InternalExpressionDsl.g:5104:2: ( RULE_DATE )
            // InternalExpressionDsl.g:5105:3: RULE_DATE
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_0_2_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__ValidUntilAssignment_5_1_0_2"


    // $ANTLR start "rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0"
    // InternalExpressionDsl.g:5114:1: rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0 : ( RULE_DATE ) ;
    public final void rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5118:1: ( ( RULE_DATE ) )
            // InternalExpressionDsl.g:5119:2: ( RULE_DATE )
            {
            // InternalExpressionDsl.g:5119:2: ( RULE_DATE )
            // InternalExpressionDsl.g:5120:3: RULE_DATE
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_1_0_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__ValidSinceAssignment_5_1_1_0"


    // $ANTLR start "rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2"
    // InternalExpressionDsl.g:5129:1: rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2 : ( RULE_DATE ) ;
    public final void rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5133:1: ( ( RULE_DATE ) )
            // InternalExpressionDsl.g:5134:2: ( RULE_DATE )
            {
            // InternalExpressionDsl.g:5134:2: ( RULE_DATE )
            // InternalExpressionDsl.g:5135:3: RULE_DATE
            {
             before(grammarAccess.getEvoEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_2_2_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEvoEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEnumLiteral__ValidUntilAssignment_5_1_2_2"


    // $ANTLR start "rule__EvoOr__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5144:1: rule__EvoOr__Operand2Assignment_1_2 : ( ruleEvoAnd ) ;
    public final void rule__EvoOr__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5148:1: ( ( ruleEvoAnd ) )
            // InternalExpressionDsl.g:5149:2: ( ruleEvoAnd )
            {
            // InternalExpressionDsl.g:5149:2: ( ruleEvoAnd )
            // InternalExpressionDsl.g:5150:3: ruleEvoAnd
            {
             before(grammarAccess.getEvoOrAccess().getOperand2EvoAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoAnd();

            state._fsp--;

             after(grammarAccess.getEvoOrAccess().getOperand2EvoAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoOr__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoAnd__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5159:1: rule__EvoAnd__Operand2Assignment_1_2 : ( ruleEvoEqual ) ;
    public final void rule__EvoAnd__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5163:1: ( ( ruleEvoEqual ) )
            // InternalExpressionDsl.g:5164:2: ( ruleEvoEqual )
            {
            // InternalExpressionDsl.g:5164:2: ( ruleEvoEqual )
            // InternalExpressionDsl.g:5165:3: ruleEvoEqual
            {
             before(grammarAccess.getEvoAndAccess().getOperand2EvoEqualParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoEqual();

            state._fsp--;

             after(grammarAccess.getEvoAndAccess().getOperand2EvoEqualParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoAnd__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoEqual__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5174:1: rule__EvoEqual__Operand2Assignment_1_2 : ( ruleEvoUnequalSize ) ;
    public final void rule__EvoEqual__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5178:1: ( ( ruleEvoUnequalSize ) )
            // InternalExpressionDsl.g:5179:2: ( ruleEvoUnequalSize )
            {
            // InternalExpressionDsl.g:5179:2: ( ruleEvoUnequalSize )
            // InternalExpressionDsl.g:5180:3: ruleEvoUnequalSize
            {
             before(grammarAccess.getEvoEqualAccess().getOperand2EvoUnequalSizeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoUnequalSize();

            state._fsp--;

             after(grammarAccess.getEvoEqualAccess().getOperand2EvoUnequalSizeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoEqual__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoUnequal__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5189:1: rule__EvoUnequal__Operand2Assignment_1_2 : ( ruleEvoImplicationSize ) ;
    public final void rule__EvoUnequal__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5193:1: ( ( ruleEvoImplicationSize ) )
            // InternalExpressionDsl.g:5194:2: ( ruleEvoImplicationSize )
            {
            // InternalExpressionDsl.g:5194:2: ( ruleEvoImplicationSize )
            // InternalExpressionDsl.g:5195:3: ruleEvoImplicationSize
            {
             before(grammarAccess.getEvoUnequalAccess().getOperand2EvoImplicationSizeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoImplicationSize();

            state._fsp--;

             after(grammarAccess.getEvoUnequalAccess().getOperand2EvoImplicationSizeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoUnequal__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoBiconditional__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5204:1: rule__EvoBiconditional__Operand2Assignment_1_2 : ( ruleEvoSetInclusionSize ) ;
    public final void rule__EvoBiconditional__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5208:1: ( ( ruleEvoSetInclusionSize ) )
            // InternalExpressionDsl.g:5209:2: ( ruleEvoSetInclusionSize )
            {
            // InternalExpressionDsl.g:5209:2: ( ruleEvoSetInclusionSize )
            // InternalExpressionDsl.g:5210:3: ruleEvoSetInclusionSize
            {
             before(grammarAccess.getEvoBiconditionalAccess().getOperand2EvoSetInclusionSizeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetInclusionSize();

            state._fsp--;

             after(grammarAccess.getEvoBiconditionalAccess().getOperand2EvoSetInclusionSizeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoBiconditional__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoSetInclusion__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5219:1: rule__EvoSetInclusion__Operand2Assignment_1_2 : ( ruleEvoSetIntersection ) ;
    public final void rule__EvoSetInclusion__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5223:1: ( ( ruleEvoSetIntersection ) )
            // InternalExpressionDsl.g:5224:2: ( ruleEvoSetIntersection )
            {
            // InternalExpressionDsl.g:5224:2: ( ruleEvoSetIntersection )
            // InternalExpressionDsl.g:5225:3: ruleEvoSetIntersection
            {
             before(grammarAccess.getEvoSetInclusionAccess().getOperand2EvoSetIntersectionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetIntersection();

            state._fsp--;

             after(grammarAccess.getEvoSetInclusionAccess().getOperand2EvoSetIntersectionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetInclusion__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoSetIntersection__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5234:1: rule__EvoSetIntersection__Operand2Assignment_1_2 : ( ruleEvoSetUnion ) ;
    public final void rule__EvoSetIntersection__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5238:1: ( ( ruleEvoSetUnion ) )
            // InternalExpressionDsl.g:5239:2: ( ruleEvoSetUnion )
            {
            // InternalExpressionDsl.g:5239:2: ( ruleEvoSetUnion )
            // InternalExpressionDsl.g:5240:3: ruleEvoSetUnion
            {
             before(grammarAccess.getEvoSetIntersectionAccess().getOperand2EvoSetUnionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetUnion();

            state._fsp--;

             after(grammarAccess.getEvoSetIntersectionAccess().getOperand2EvoSetUnionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetIntersection__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoSetUnion__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5249:1: rule__EvoSetUnion__Operand2Assignment_1_2 : ( ruleEvoSetDifference ) ;
    public final void rule__EvoSetUnion__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5253:1: ( ( ruleEvoSetDifference ) )
            // InternalExpressionDsl.g:5254:2: ( ruleEvoSetDifference )
            {
            // InternalExpressionDsl.g:5254:2: ( ruleEvoSetDifference )
            // InternalExpressionDsl.g:5255:3: ruleEvoSetDifference
            {
             before(grammarAccess.getEvoSetUnionAccess().getOperand2EvoSetDifferenceParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetDifference();

            state._fsp--;

             after(grammarAccess.getEvoSetUnionAccess().getOperand2EvoSetDifferenceParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetUnion__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoSetDifference__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5264:1: rule__EvoSetDifference__Operand2Assignment_1_2 : ( ruleEvoSetSymmetricDifference ) ;
    public final void rule__EvoSetDifference__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5268:1: ( ( ruleEvoSetSymmetricDifference ) )
            // InternalExpressionDsl.g:5269:2: ( ruleEvoSetSymmetricDifference )
            {
            // InternalExpressionDsl.g:5269:2: ( ruleEvoSetSymmetricDifference )
            // InternalExpressionDsl.g:5270:3: ruleEvoSetSymmetricDifference
            {
             before(grammarAccess.getEvoSetDifferenceAccess().getOperand2EvoSetSymmetricDifferenceParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetSymmetricDifference();

            state._fsp--;

             after(grammarAccess.getEvoSetDifferenceAccess().getOperand2EvoSetSymmetricDifferenceParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetDifference__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoSetSymmetricDifference__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5279:1: rule__EvoSetSymmetricDifference__Operand2Assignment_1_2 : ( ruleEvoSetCartesianProduct ) ;
    public final void rule__EvoSetSymmetricDifference__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5283:1: ( ( ruleEvoSetCartesianProduct ) )
            // InternalExpressionDsl.g:5284:2: ( ruleEvoSetCartesianProduct )
            {
            // InternalExpressionDsl.g:5284:2: ( ruleEvoSetCartesianProduct )
            // InternalExpressionDsl.g:5285:3: ruleEvoSetCartesianProduct
            {
             before(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2EvoSetCartesianProductParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetCartesianProduct();

            state._fsp--;

             after(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2EvoSetCartesianProductParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetSymmetricDifference__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoSetCartesianProduct__Operand2Assignment_1_2"
    // InternalExpressionDsl.g:5294:1: rule__EvoSetCartesianProduct__Operand2Assignment_1_2 : ( ruleEvoElementOf ) ;
    public final void rule__EvoSetCartesianProduct__Operand2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5298:1: ( ( ruleEvoElementOf ) )
            // InternalExpressionDsl.g:5299:2: ( ruleEvoElementOf )
            {
            // InternalExpressionDsl.g:5299:2: ( ruleEvoElementOf )
            // InternalExpressionDsl.g:5300:3: ruleEvoElementOf
            {
             before(grammarAccess.getEvoSetCartesianProductAccess().getOperand2EvoElementOfParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoElementOf();

            state._fsp--;

             after(grammarAccess.getEvoSetCartesianProductAccess().getOperand2EvoElementOfParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetCartesianProduct__Operand2Assignment_1_2"


    // $ANTLR start "rule__EvoFeatureVariable__NameAssignment_1"
    // InternalExpressionDsl.g:5309:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5313:1: ( ( RULE_ID ) )
            // InternalExpressionDsl.g:5314:2: ( RULE_ID )
            {
            // InternalExpressionDsl.g:5314:2: ( RULE_ID )
            // InternalExpressionDsl.g:5315:3: RULE_ID
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


    // $ANTLR start "rule__EvoNot__OperandAssignment_2"
    // InternalExpressionDsl.g:5324:1: rule__EvoNot__OperandAssignment_2 : ( ruleEvoExpression ) ;
    public final void rule__EvoNot__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5328:1: ( ( ruleEvoExpression ) )
            // InternalExpressionDsl.g:5329:2: ( ruleEvoExpression )
            {
            // InternalExpressionDsl.g:5329:2: ( ruleEvoExpression )
            // InternalExpressionDsl.g:5330:3: ruleEvoExpression
            {
             before(grammarAccess.getEvoNotAccess().getOperandEvoExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoExpression();

            state._fsp--;

             after(grammarAccess.getEvoNotAccess().getOperandEvoExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoNot__OperandAssignment_2"


    // $ANTLR start "rule__EvoSize__SizeAssignment_1"
    // InternalExpressionDsl.g:5339:1: rule__EvoSize__SizeAssignment_1 : ( RULE_INT ) ;
    public final void rule__EvoSize__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5343:1: ( ( RULE_INT ) )
            // InternalExpressionDsl.g:5344:2: ( RULE_INT )
            {
            // InternalExpressionDsl.g:5344:2: ( RULE_INT )
            // InternalExpressionDsl.g:5345:3: RULE_INT
            {
             before(grammarAccess.getEvoSizeAccess().getSizeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvoSizeAccess().getSizeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSize__SizeAssignment_1"


    // $ANTLR start "rule__EvoVariableTerm__VariableAssignment_0"
    // InternalExpressionDsl.g:5354:1: rule__EvoVariableTerm__VariableAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EvoVariableTerm__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5358:1: ( ( ( ruleQualifiedName ) ) )
            // InternalExpressionDsl.g:5359:2: ( ( ruleQualifiedName ) )
            {
            // InternalExpressionDsl.g:5359:2: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:5360:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_0_0()); 
            // InternalExpressionDsl.g:5361:3: ( ruleQualifiedName )
            // InternalExpressionDsl.g:5362:4: ruleQualifiedName
            {
             before(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__VariableAssignment_0"


    // $ANTLR start "rule__EvoVariableTerm__TypeAssignment_1"
    // InternalExpressionDsl.g:5373:1: rule__EvoVariableTerm__TypeAssignment_1 : ( ruleEvoVariableType ) ;
    public final void rule__EvoVariableTerm__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5377:1: ( ( ruleEvoVariableType ) )
            // InternalExpressionDsl.g:5378:2: ( ruleEvoVariableType )
            {
            // InternalExpressionDsl.g:5378:2: ( ruleEvoVariableType )
            // InternalExpressionDsl.g:5379:3: ruleEvoVariableType
            {
             before(grammarAccess.getEvoVariableTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariableType();

            state._fsp--;

             after(grammarAccess.getEvoVariableTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableTerm__TypeAssignment_1"


    // $ANTLR start "rule__EvoApplicationConstraintTerm__VariableAssignment_2"
    // InternalExpressionDsl.g:5388:1: rule__EvoApplicationConstraintTerm__VariableAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EvoApplicationConstraintTerm__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5392:1: ( ( ( ruleQualifiedName ) ) )
            // InternalExpressionDsl.g:5393:2: ( ( ruleQualifiedName ) )
            {
            // InternalExpressionDsl.g:5393:2: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:5394:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableCrossReference_2_0()); 
            // InternalExpressionDsl.g:5395:3: ( ruleQualifiedName )
            // InternalExpressionDsl.g:5396:4: ruleQualifiedName
            {
             before(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoApplicationConstraintTerm__VariableAssignment_2"


    // $ANTLR start "rule__EvoGroupTerm__VariableAssignment_0"
    // InternalExpressionDsl.g:5407:1: rule__EvoGroupTerm__VariableAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EvoGroupTerm__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5411:1: ( ( ( ruleQualifiedName ) ) )
            // InternalExpressionDsl.g:5412:2: ( ( ruleQualifiedName ) )
            {
            // InternalExpressionDsl.g:5412:2: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:5413:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableCrossReference_0_0()); 
            // InternalExpressionDsl.g:5414:3: ( ruleQualifiedName )
            // InternalExpressionDsl.g:5415:4: ruleQualifiedName
            {
             before(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGroupTerm__VariableAssignment_0"


    // $ANTLR start "rule__EvoGroupTerm__TypeAssignment_1"
    // InternalExpressionDsl.g:5426:1: rule__EvoGroupTerm__TypeAssignment_1 : ( ruleEvoVariableType ) ;
    public final void rule__EvoGroupTerm__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5430:1: ( ( ruleEvoVariableType ) )
            // InternalExpressionDsl.g:5431:2: ( ruleEvoVariableType )
            {
            // InternalExpressionDsl.g:5431:2: ( ruleEvoVariableType )
            // InternalExpressionDsl.g:5432:3: ruleEvoVariableType
            {
             before(grammarAccess.getEvoGroupTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariableType();

            state._fsp--;

             after(grammarAccess.getEvoGroupTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoGroupTerm__TypeAssignment_1"


    // $ANTLR start "rule__EvoSetTerm__VariablesAssignment_1"
    // InternalExpressionDsl.g:5441:1: rule__EvoSetTerm__VariablesAssignment_1 : ( ruleEvoSetVariable ) ;
    public final void rule__EvoSetTerm__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5445:1: ( ( ruleEvoSetVariable ) )
            // InternalExpressionDsl.g:5446:2: ( ruleEvoSetVariable )
            {
            // InternalExpressionDsl.g:5446:2: ( ruleEvoSetVariable )
            // InternalExpressionDsl.g:5447:3: ruleEvoSetVariable
            {
             before(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetVariable();

            state._fsp--;

             after(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__VariablesAssignment_1"


    // $ANTLR start "rule__EvoSetTerm__VariablesAssignment_2_1"
    // InternalExpressionDsl.g:5456:1: rule__EvoSetTerm__VariablesAssignment_2_1 : ( ruleEvoSetVariable ) ;
    public final void rule__EvoSetTerm__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressionDsl.g:5460:1: ( ( ruleEvoSetVariable ) )
            // InternalExpressionDsl.g:5461:2: ( ruleEvoSetVariable )
            {
            // InternalExpressionDsl.g:5461:2: ( ruleEvoSetVariable )
            // InternalExpressionDsl.g:5462:3: ruleEvoSetVariable
            {
             before(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoSetVariable();

            state._fsp--;

             after(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoSetTerm__VariablesAssignment_2_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\14\1\uffff\1\4\1\33\1\4\2\uffff\1\33";
    static final String dfa_3s = "\1\37\1\uffff\1\4\1\41\1\4\2\uffff\1\41";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\22\uffff\1\1",
            "",
            "\1\3",
            "\1\4\4\uffff\1\6\1\5",
            "\1\7",
            "",
            "",
            "\1\4\4\uffff\1\6\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1108:1: rule__EvoVersionRangeRestriction__Alternatives : ( ( ( rule__EvoVersionRangeRestriction__Group_0__0 ) ) | ( ( rule__EvoVersionRangeRestriction__Group_1__0 ) ) | ( ( rule__EvoVersionRangeRestriction__Group_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000A000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000800000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000800000002L});

}