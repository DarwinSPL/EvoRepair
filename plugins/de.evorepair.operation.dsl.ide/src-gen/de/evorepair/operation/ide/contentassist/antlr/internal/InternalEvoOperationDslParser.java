package de.evorepair.operation.ide.contentassist.antlr.internal;

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
import de.evorepair.operation.services.EvoOperationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoOperationDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'", "'operation'", "'{'", "'variables'", "':'", "'}'", "'timestamp'", "'var'", "'_'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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


    // $ANTLR start "entryRuleDate"
    // InternalEvoOperationDsl.g:128:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:129:1: ( ruleDate EOF )
            // InternalEvoOperationDsl.g:130:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalEvoOperationDsl.g:137:1: ruleDate : ( RULE_STRING ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:141:2: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:142:2: ( RULE_STRING )
            {
            // InternalEvoOperationDsl.g:142:2: ( RULE_STRING )
            // InternalEvoOperationDsl.g:143:3: RULE_STRING
            {
             before(grammarAccess.getDateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoOperationDsl.g:153:1: entryRuleEvoVariable : ruleEvoVariable EOF ;
    public final void entryRuleEvoVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:154:1: ( ruleEvoVariable EOF )
            // InternalEvoOperationDsl.g:155:1: ruleEvoVariable EOF
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
    // InternalEvoOperationDsl.g:162:1: ruleEvoVariable : ( ( rule__EvoVariable__Group__0 ) ) ;
    public final void ruleEvoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:166:2: ( ( ( rule__EvoVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:167:2: ( ( rule__EvoVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:167:2: ( ( rule__EvoVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:168:3: ( rule__EvoVariable__Group__0 )
            {
             before(grammarAccess.getEvoVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:169:3: ( rule__EvoVariable__Group__0 )
            // InternalEvoOperationDsl.g:169:4: rule__EvoVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "ruleEvoVariableType"
    // InternalEvoOperationDsl.g:178:1: ruleEvoVariableType : ( ( rule__EvoVariableType__Alternatives ) ) ;
    public final void ruleEvoVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:182:1: ( ( ( rule__EvoVariableType__Alternatives ) ) )
            // InternalEvoOperationDsl.g:183:2: ( ( rule__EvoVariableType__Alternatives ) )
            {
            // InternalEvoOperationDsl.g:183:2: ( ( rule__EvoVariableType__Alternatives ) )
            // InternalEvoOperationDsl.g:184:3: ( rule__EvoVariableType__Alternatives )
            {
             before(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); 
            // InternalEvoOperationDsl.g:185:3: ( rule__EvoVariableType__Alternatives )
            // InternalEvoOperationDsl.g:185:4: rule__EvoVariableType__Alternatives
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
    // InternalEvoOperationDsl.g:194:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:198:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoOperationDsl.g:199:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoOperationDsl.g:199:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoOperationDsl.g:200:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoOperationDsl.g:201:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoOperationDsl.g:201:4: rule__EvoFeatureVariableType__Alternatives
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


    // $ANTLR start "rule__EvoVariableType__Alternatives"
    // InternalEvoOperationDsl.g:209:1: rule__EvoVariableType__Alternatives : ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) );
    public final void rule__EvoVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:213:1: ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEvoOperationDsl.g:214:2: ( ( '@ident' ) )
                    {
                    // InternalEvoOperationDsl.g:214:2: ( ( '@ident' ) )
                    // InternalEvoOperationDsl.g:215:3: ( '@ident' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 
                    // InternalEvoOperationDsl.g:216:3: ( '@ident' )
                    // InternalEvoOperationDsl.g:216:4: '@ident'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:220:2: ( ( '@pre' ) )
                    {
                    // InternalEvoOperationDsl.g:220:2: ( ( '@pre' ) )
                    // InternalEvoOperationDsl.g:221:3: ( '@pre' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 
                    // InternalEvoOperationDsl.g:222:3: ( '@pre' )
                    // InternalEvoOperationDsl.g:222:4: '@pre'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:226:2: ( ( '@post' ) )
                    {
                    // InternalEvoOperationDsl.g:226:2: ( ( '@post' ) )
                    // InternalEvoOperationDsl.g:227:3: ( '@post' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); 
                    // InternalEvoOperationDsl.g:228:3: ( '@post' )
                    // InternalEvoOperationDsl.g:228:4: '@post'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalEvoOperationDsl.g:236:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:240:1: ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
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
                    // InternalEvoOperationDsl.g:241:2: ( ( 'parent' ) )
                    {
                    // InternalEvoOperationDsl.g:241:2: ( ( 'parent' ) )
                    // InternalEvoOperationDsl.g:242:3: ( 'parent' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoOperationDsl.g:243:3: ( 'parent' )
                    // InternalEvoOperationDsl.g:243:4: 'parent'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:247:2: ( ( 'source' ) )
                    {
                    // InternalEvoOperationDsl.g:247:2: ( ( 'source' ) )
                    // InternalEvoOperationDsl.g:248:3: ( 'source' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoOperationDsl.g:249:3: ( 'source' )
                    // InternalEvoOperationDsl.g:249:4: 'source'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:253:2: ( ( 'child' ) )
                    {
                    // InternalEvoOperationDsl.g:253:2: ( ( 'child' ) )
                    // InternalEvoOperationDsl.g:254:3: ( 'child' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoOperationDsl.g:255:3: ( 'child' )
                    // InternalEvoOperationDsl.g:255:4: 'child'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalEvoOperationDsl.g:263:1: rule__EvoOperationContainer__Group__0 : rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 ;
    public final void rule__EvoOperationContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:267:1: ( rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 )
            // InternalEvoOperationDsl.g:268:2: rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1
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
    // InternalEvoOperationDsl.g:275:1: rule__EvoOperationContainer__Group__0__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) ;
    public final void rule__EvoOperationContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:279:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) )
            // InternalEvoOperationDsl.g:280:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            {
            // InternalEvoOperationDsl.g:280:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            // InternalEvoOperationDsl.g:281:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_0()); 
            // InternalEvoOperationDsl.g:282:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            // InternalEvoOperationDsl.g:282:3: rule__EvoOperationContainer__OperationsAssignment_0
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
    // InternalEvoOperationDsl.g:290:1: rule__EvoOperationContainer__Group__1 : rule__EvoOperationContainer__Group__1__Impl ;
    public final void rule__EvoOperationContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:294:1: ( rule__EvoOperationContainer__Group__1__Impl )
            // InternalEvoOperationDsl.g:295:2: rule__EvoOperationContainer__Group__1__Impl
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
    // InternalEvoOperationDsl.g:301:1: rule__EvoOperationContainer__Group__1__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) ;
    public final void rule__EvoOperationContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:305:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) )
            // InternalEvoOperationDsl.g:306:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            {
            // InternalEvoOperationDsl.g:306:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            // InternalEvoOperationDsl.g:307:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_1()); 
            // InternalEvoOperationDsl.g:308:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:308:3: rule__EvoOperationContainer__OperationsAssignment_1
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
    // InternalEvoOperationDsl.g:317:1: rule__EvoOperation__Group__0 : rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 ;
    public final void rule__EvoOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:321:1: ( rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 )
            // InternalEvoOperationDsl.g:322:2: rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1
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
    // InternalEvoOperationDsl.g:329:1: rule__EvoOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__EvoOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:333:1: ( ( 'operation' ) )
            // InternalEvoOperationDsl.g:334:1: ( 'operation' )
            {
            // InternalEvoOperationDsl.g:334:1: ( 'operation' )
            // InternalEvoOperationDsl.g:335:2: 'operation'
            {
             before(grammarAccess.getEvoOperationAccess().getOperationKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:344:1: rule__EvoOperation__Group__1 : rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 ;
    public final void rule__EvoOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:348:1: ( rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 )
            // InternalEvoOperationDsl.g:349:2: rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2
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
    // InternalEvoOperationDsl.g:356:1: rule__EvoOperation__Group__1__Impl : ( ( rule__EvoOperation__NameAssignment_1 ) ) ;
    public final void rule__EvoOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:360:1: ( ( ( rule__EvoOperation__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:361:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:361:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:362:2: ( rule__EvoOperation__NameAssignment_1 )
            {
             before(grammarAccess.getEvoOperationAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:363:2: ( rule__EvoOperation__NameAssignment_1 )
            // InternalEvoOperationDsl.g:363:3: rule__EvoOperation__NameAssignment_1
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
    // InternalEvoOperationDsl.g:371:1: rule__EvoOperation__Group__2 : rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 ;
    public final void rule__EvoOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:375:1: ( rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 )
            // InternalEvoOperationDsl.g:376:2: rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3
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
    // InternalEvoOperationDsl.g:383:1: rule__EvoOperation__Group__2__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:387:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:388:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:388:1: ( '{' )
            // InternalEvoOperationDsl.g:389:2: '{'
            {
             before(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:398:1: rule__EvoOperation__Group__3 : rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 ;
    public final void rule__EvoOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:402:1: ( rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 )
            // InternalEvoOperationDsl.g:403:2: rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4
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
    // InternalEvoOperationDsl.g:410:1: rule__EvoOperation__Group__3__Impl : ( 'variables' ) ;
    public final void rule__EvoOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:414:1: ( ( 'variables' ) )
            // InternalEvoOperationDsl.g:415:1: ( 'variables' )
            {
            // InternalEvoOperationDsl.g:415:1: ( 'variables' )
            // InternalEvoOperationDsl.g:416:2: 'variables'
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:425:1: rule__EvoOperation__Group__4 : rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 ;
    public final void rule__EvoOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:429:1: ( rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 )
            // InternalEvoOperationDsl.g:430:2: rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5
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
    // InternalEvoOperationDsl.g:437:1: rule__EvoOperation__Group__4__Impl : ( ':' ) ;
    public final void rule__EvoOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:441:1: ( ( ':' ) )
            // InternalEvoOperationDsl.g:442:1: ( ':' )
            {
            // InternalEvoOperationDsl.g:442:1: ( ':' )
            // InternalEvoOperationDsl.g:443:2: ':'
            {
             before(grammarAccess.getEvoOperationAccess().getColonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // InternalEvoOperationDsl.g:452:1: rule__EvoOperation__Group__5 : rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 ;
    public final void rule__EvoOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:456:1: ( rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 )
            // InternalEvoOperationDsl.g:457:2: rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6
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
    // InternalEvoOperationDsl.g:464:1: rule__EvoOperation__Group__5__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:468:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:469:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:469:1: ( '{' )
            // InternalEvoOperationDsl.g:470:2: '{'
            {
             before(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:479:1: rule__EvoOperation__Group__6 : rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 ;
    public final void rule__EvoOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:483:1: ( rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 )
            // InternalEvoOperationDsl.g:484:2: rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7
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
    // InternalEvoOperationDsl.g:491:1: rule__EvoOperation__Group__6__Impl : ( ( rule__EvoOperation__VariablesAssignment_6 ) ) ;
    public final void rule__EvoOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:495:1: ( ( ( rule__EvoOperation__VariablesAssignment_6 ) ) )
            // InternalEvoOperationDsl.g:496:1: ( ( rule__EvoOperation__VariablesAssignment_6 ) )
            {
            // InternalEvoOperationDsl.g:496:1: ( ( rule__EvoOperation__VariablesAssignment_6 ) )
            // InternalEvoOperationDsl.g:497:2: ( rule__EvoOperation__VariablesAssignment_6 )
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_6()); 
            // InternalEvoOperationDsl.g:498:2: ( rule__EvoOperation__VariablesAssignment_6 )
            // InternalEvoOperationDsl.g:498:3: rule__EvoOperation__VariablesAssignment_6
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
    // InternalEvoOperationDsl.g:506:1: rule__EvoOperation__Group__7 : rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 ;
    public final void rule__EvoOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:510:1: ( rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 )
            // InternalEvoOperationDsl.g:511:2: rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8
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
    // InternalEvoOperationDsl.g:518:1: rule__EvoOperation__Group__7__Impl : ( ( rule__EvoOperation__VariablesAssignment_7 )* ) ;
    public final void rule__EvoOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:522:1: ( ( ( rule__EvoOperation__VariablesAssignment_7 )* ) )
            // InternalEvoOperationDsl.g:523:1: ( ( rule__EvoOperation__VariablesAssignment_7 )* )
            {
            // InternalEvoOperationDsl.g:523:1: ( ( rule__EvoOperation__VariablesAssignment_7 )* )
            // InternalEvoOperationDsl.g:524:2: ( rule__EvoOperation__VariablesAssignment_7 )*
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_7()); 
            // InternalEvoOperationDsl.g:525:2: ( rule__EvoOperation__VariablesAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:525:3: rule__EvoOperation__VariablesAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EvoOperation__VariablesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalEvoOperationDsl.g:533:1: rule__EvoOperation__Group__8 : rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 ;
    public final void rule__EvoOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:537:1: ( rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 )
            // InternalEvoOperationDsl.g:538:2: rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9
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
    // InternalEvoOperationDsl.g:545:1: rule__EvoOperation__Group__8__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:549:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:550:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:550:1: ( '}' )
            // InternalEvoOperationDsl.g:551:2: '}'
            {
             before(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:560:1: rule__EvoOperation__Group__9 : rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 ;
    public final void rule__EvoOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:564:1: ( rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 )
            // InternalEvoOperationDsl.g:565:2: rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10
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
    // InternalEvoOperationDsl.g:572:1: rule__EvoOperation__Group__9__Impl : ( 'timestamp' ) ;
    public final void rule__EvoOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:576:1: ( ( 'timestamp' ) )
            // InternalEvoOperationDsl.g:577:1: ( 'timestamp' )
            {
            // InternalEvoOperationDsl.g:577:1: ( 'timestamp' )
            // InternalEvoOperationDsl.g:578:2: 'timestamp'
            {
             before(grammarAccess.getEvoOperationAccess().getTimestampKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:587:1: rule__EvoOperation__Group__10 : rule__EvoOperation__Group__10__Impl rule__EvoOperation__Group__11 ;
    public final void rule__EvoOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:591:1: ( rule__EvoOperation__Group__10__Impl rule__EvoOperation__Group__11 )
            // InternalEvoOperationDsl.g:592:2: rule__EvoOperation__Group__10__Impl rule__EvoOperation__Group__11
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
    // InternalEvoOperationDsl.g:599:1: rule__EvoOperation__Group__10__Impl : ( ':' ) ;
    public final void rule__EvoOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:603:1: ( ( ':' ) )
            // InternalEvoOperationDsl.g:604:1: ( ':' )
            {
            // InternalEvoOperationDsl.g:604:1: ( ':' )
            // InternalEvoOperationDsl.g:605:2: ':'
            {
             before(grammarAccess.getEvoOperationAccess().getColonKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getColonKeyword_10()); 

            }


            }

        }
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
    // InternalEvoOperationDsl.g:614:1: rule__EvoOperation__Group__11 : rule__EvoOperation__Group__11__Impl rule__EvoOperation__Group__12 ;
    public final void rule__EvoOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:618:1: ( rule__EvoOperation__Group__11__Impl rule__EvoOperation__Group__12 )
            // InternalEvoOperationDsl.g:619:2: rule__EvoOperation__Group__11__Impl rule__EvoOperation__Group__12
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
    // InternalEvoOperationDsl.g:626:1: rule__EvoOperation__Group__11__Impl : ( ( rule__EvoOperation__DateAssignment_11 ) ) ;
    public final void rule__EvoOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:630:1: ( ( ( rule__EvoOperation__DateAssignment_11 ) ) )
            // InternalEvoOperationDsl.g:631:1: ( ( rule__EvoOperation__DateAssignment_11 ) )
            {
            // InternalEvoOperationDsl.g:631:1: ( ( rule__EvoOperation__DateAssignment_11 ) )
            // InternalEvoOperationDsl.g:632:2: ( rule__EvoOperation__DateAssignment_11 )
            {
             before(grammarAccess.getEvoOperationAccess().getDateAssignment_11()); 
            // InternalEvoOperationDsl.g:633:2: ( rule__EvoOperation__DateAssignment_11 )
            // InternalEvoOperationDsl.g:633:3: rule__EvoOperation__DateAssignment_11
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
    // InternalEvoOperationDsl.g:641:1: rule__EvoOperation__Group__12 : rule__EvoOperation__Group__12__Impl ;
    public final void rule__EvoOperation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:645:1: ( rule__EvoOperation__Group__12__Impl )
            // InternalEvoOperationDsl.g:646:2: rule__EvoOperation__Group__12__Impl
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
    // InternalEvoOperationDsl.g:652:1: rule__EvoOperation__Group__12__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:656:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:657:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:657:1: ( '}' )
            // InternalEvoOperationDsl.g:658:2: '}'
            {
             before(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__EvoVariable__Group__0"
    // InternalEvoOperationDsl.g:668:1: rule__EvoVariable__Group__0 : rule__EvoVariable__Group__0__Impl rule__EvoVariable__Group__1 ;
    public final void rule__EvoVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:672:1: ( rule__EvoVariable__Group__0__Impl rule__EvoVariable__Group__1 )
            // InternalEvoOperationDsl.g:673:2: rule__EvoVariable__Group__0__Impl rule__EvoVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__0"


    // $ANTLR start "rule__EvoVariable__Group__0__Impl"
    // InternalEvoOperationDsl.g:680:1: rule__EvoVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__EvoVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:684:1: ( ( 'var' ) )
            // InternalEvoOperationDsl.g:685:1: ( 'var' )
            {
            // InternalEvoOperationDsl.g:685:1: ( 'var' )
            // InternalEvoOperationDsl.g:686:2: 'var'
            {
             before(grammarAccess.getEvoVariableAccess().getVarKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvoVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoVariable__Group__1"
    // InternalEvoOperationDsl.g:695:1: rule__EvoVariable__Group__1 : rule__EvoVariable__Group__1__Impl rule__EvoVariable__Group__2 ;
    public final void rule__EvoVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:699:1: ( rule__EvoVariable__Group__1__Impl rule__EvoVariable__Group__2 )
            // InternalEvoOperationDsl.g:700:2: rule__EvoVariable__Group__1__Impl rule__EvoVariable__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EvoVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__1"


    // $ANTLR start "rule__EvoVariable__Group__1__Impl"
    // InternalEvoOperationDsl.g:707:1: rule__EvoVariable__Group__1__Impl : ( ( rule__EvoVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:711:1: ( ( ( rule__EvoVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:712:1: ( ( rule__EvoVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:712:1: ( ( rule__EvoVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:713:2: ( rule__EvoVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:714:2: ( rule__EvoVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:714:3: rule__EvoVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoVariable__Group__2"
    // InternalEvoOperationDsl.g:722:1: rule__EvoVariable__Group__2 : rule__EvoVariable__Group__2__Impl rule__EvoVariable__Group__3 ;
    public final void rule__EvoVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:726:1: ( rule__EvoVariable__Group__2__Impl rule__EvoVariable__Group__3 )
            // InternalEvoOperationDsl.g:727:2: rule__EvoVariable__Group__2__Impl rule__EvoVariable__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__EvoVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__2"


    // $ANTLR start "rule__EvoVariable__Group__2__Impl"
    // InternalEvoOperationDsl.g:734:1: rule__EvoVariable__Group__2__Impl : ( ( rule__EvoVariable__Group_2__0 ) ) ;
    public final void rule__EvoVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:738:1: ( ( ( rule__EvoVariable__Group_2__0 ) ) )
            // InternalEvoOperationDsl.g:739:1: ( ( rule__EvoVariable__Group_2__0 ) )
            {
            // InternalEvoOperationDsl.g:739:1: ( ( rule__EvoVariable__Group_2__0 ) )
            // InternalEvoOperationDsl.g:740:2: ( rule__EvoVariable__Group_2__0 )
            {
             before(grammarAccess.getEvoVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:741:2: ( rule__EvoVariable__Group_2__0 )
            // InternalEvoOperationDsl.g:741:3: rule__EvoVariable__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__2__Impl"


    // $ANTLR start "rule__EvoVariable__Group__3"
    // InternalEvoOperationDsl.g:749:1: rule__EvoVariable__Group__3 : rule__EvoVariable__Group__3__Impl ;
    public final void rule__EvoVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:753:1: ( rule__EvoVariable__Group__3__Impl )
            // InternalEvoOperationDsl.g:754:2: rule__EvoVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__3"


    // $ANTLR start "rule__EvoVariable__Group__3__Impl"
    // InternalEvoOperationDsl.g:760:1: rule__EvoVariable__Group__3__Impl : ( ( rule__EvoVariable__VariableTypeAssignment_3 ) ) ;
    public final void rule__EvoVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:764:1: ( ( ( rule__EvoVariable__VariableTypeAssignment_3 ) ) )
            // InternalEvoOperationDsl.g:765:1: ( ( rule__EvoVariable__VariableTypeAssignment_3 ) )
            {
            // InternalEvoOperationDsl.g:765:1: ( ( rule__EvoVariable__VariableTypeAssignment_3 ) )
            // InternalEvoOperationDsl.g:766:2: ( rule__EvoVariable__VariableTypeAssignment_3 )
            {
             before(grammarAccess.getEvoVariableAccess().getVariableTypeAssignment_3()); 
            // InternalEvoOperationDsl.g:767:2: ( rule__EvoVariable__VariableTypeAssignment_3 )
            // InternalEvoOperationDsl.g:767:3: rule__EvoVariable__VariableTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__VariableTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableAccess().getVariableTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group__3__Impl"


    // $ANTLR start "rule__EvoVariable__Group_2__0"
    // InternalEvoOperationDsl.g:776:1: rule__EvoVariable__Group_2__0 : rule__EvoVariable__Group_2__0__Impl rule__EvoVariable__Group_2__1 ;
    public final void rule__EvoVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:780:1: ( rule__EvoVariable__Group_2__0__Impl rule__EvoVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:781:2: rule__EvoVariable__Group_2__0__Impl rule__EvoVariable__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__EvoVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group_2__0"


    // $ANTLR start "rule__EvoVariable__Group_2__0__Impl"
    // InternalEvoOperationDsl.g:788:1: rule__EvoVariable__Group_2__0__Impl : ( '_' ) ;
    public final void rule__EvoVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:792:1: ( ( '_' ) )
            // InternalEvoOperationDsl.g:793:1: ( '_' )
            {
            // InternalEvoOperationDsl.g:793:1: ( '_' )
            // InternalEvoOperationDsl.g:794:2: '_'
            {
             before(grammarAccess.getEvoVariableAccess().get_Keyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvoVariableAccess().get_Keyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group_2__0__Impl"


    // $ANTLR start "rule__EvoVariable__Group_2__1"
    // InternalEvoOperationDsl.g:803:1: rule__EvoVariable__Group_2__1 : rule__EvoVariable__Group_2__1__Impl ;
    public final void rule__EvoVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:807:1: ( rule__EvoVariable__Group_2__1__Impl )
            // InternalEvoOperationDsl.g:808:2: rule__EvoVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group_2__1"


    // $ANTLR start "rule__EvoVariable__Group_2__1__Impl"
    // InternalEvoOperationDsl.g:814:1: rule__EvoVariable__Group_2__1__Impl : ( ( rule__EvoVariable__IndexAssignment_2_1 ) ) ;
    public final void rule__EvoVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:818:1: ( ( ( rule__EvoVariable__IndexAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:819:1: ( ( rule__EvoVariable__IndexAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:819:1: ( ( rule__EvoVariable__IndexAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:820:2: ( rule__EvoVariable__IndexAssignment_2_1 )
            {
             before(grammarAccess.getEvoVariableAccess().getIndexAssignment_2_1()); 
            // InternalEvoOperationDsl.g:821:2: ( rule__EvoVariable__IndexAssignment_2_1 )
            // InternalEvoOperationDsl.g:821:3: rule__EvoVariable__IndexAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__IndexAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableAccess().getIndexAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__Group_2__1__Impl"


    // $ANTLR start "rule__GrammarEntry__ContainerAssignment"
    // InternalEvoOperationDsl.g:830:1: rule__GrammarEntry__ContainerAssignment : ( ruleEvoOperationContainer ) ;
    public final void rule__GrammarEntry__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:834:1: ( ( ruleEvoOperationContainer ) )
            // InternalEvoOperationDsl.g:835:2: ( ruleEvoOperationContainer )
            {
            // InternalEvoOperationDsl.g:835:2: ( ruleEvoOperationContainer )
            // InternalEvoOperationDsl.g:836:3: ruleEvoOperationContainer
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
    // InternalEvoOperationDsl.g:845:1: rule__EvoOperationContainer__OperationsAssignment_0 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:849:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:850:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:850:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:851:3: ruleEvoOperation
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
    // InternalEvoOperationDsl.g:860:1: rule__EvoOperationContainer__OperationsAssignment_1 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:864:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:865:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:865:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:866:3: ruleEvoOperation
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
    // InternalEvoOperationDsl.g:875:1: rule__EvoOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:879:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:880:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:880:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:881:3: RULE_ID
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
    // InternalEvoOperationDsl.g:890:1: rule__EvoOperation__VariablesAssignment_6 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:894:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:895:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:895:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:896:3: ruleEvoVariable
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
    // InternalEvoOperationDsl.g:905:1: rule__EvoOperation__VariablesAssignment_7 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:909:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:910:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:910:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:911:3: ruleEvoVariable
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
    // InternalEvoOperationDsl.g:920:1: rule__EvoOperation__DateAssignment_11 : ( ruleDate ) ;
    public final void rule__EvoOperation__DateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:924:1: ( ( ruleDate ) )
            // InternalEvoOperationDsl.g:925:2: ( ruleDate )
            {
            // InternalEvoOperationDsl.g:925:2: ( ruleDate )
            // InternalEvoOperationDsl.g:926:3: ruleDate
            {
             before(grammarAccess.getEvoOperationAccess().getDateDateParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getEvoOperationAccess().getDateDateParserRuleCall_11_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvoVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:935:1: rule__EvoVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:939:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:940:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:940:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:941:3: RULE_ID
            {
             before(grammarAccess.getEvoVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__NameAssignment_1"


    // $ANTLR start "rule__EvoVariable__IndexAssignment_2_1"
    // InternalEvoOperationDsl.g:950:1: rule__EvoVariable__IndexAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__EvoVariable__IndexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:954:1: ( ( RULE_INT ) )
            // InternalEvoOperationDsl.g:955:2: ( RULE_INT )
            {
            // InternalEvoOperationDsl.g:955:2: ( RULE_INT )
            // InternalEvoOperationDsl.g:956:3: RULE_INT
            {
             before(grammarAccess.getEvoVariableAccess().getIndexINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvoVariableAccess().getIndexINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__IndexAssignment_2_1"


    // $ANTLR start "rule__EvoVariable__VariableTypeAssignment_3"
    // InternalEvoOperationDsl.g:965:1: rule__EvoVariable__VariableTypeAssignment_3 : ( ruleEvoVariableType ) ;
    public final void rule__EvoVariable__VariableTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:969:1: ( ( ruleEvoVariableType ) )
            // InternalEvoOperationDsl.g:970:2: ( ruleEvoVariableType )
            {
            // InternalEvoOperationDsl.g:970:2: ( ruleEvoVariableType )
            // InternalEvoOperationDsl.g:971:3: ruleEvoVariableType
            {
             before(grammarAccess.getEvoVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariableType();

            state._fsp--;

             after(grammarAccess.getEvoVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariable__VariableTypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}