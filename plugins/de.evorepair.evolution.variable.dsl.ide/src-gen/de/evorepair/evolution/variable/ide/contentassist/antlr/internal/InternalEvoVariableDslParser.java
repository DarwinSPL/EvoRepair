package de.evorepair.evolution.variable.ide.contentassist.antlr.internal;

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
import de.evorepair.evolution.variable.services.EvoVariableDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoVariableDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'", "'var'", "'feature'", "'.'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalEvoVariableDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoVariableDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoVariableDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoVariableDsl.g"; }


    	private EvoVariableDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EvoVariableDslGrammarAccess grammarAccess) {
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
    // InternalEvoVariableDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:54:1: ( ruleModel EOF )
            // InternalEvoVariableDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEvoVariableDsl.g:62:1: ruleModel : ( ( rule__Model__VariablesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:66:2: ( ( ( rule__Model__VariablesAssignment )* ) )
            // InternalEvoVariableDsl.g:67:2: ( ( rule__Model__VariablesAssignment )* )
            {
            // InternalEvoVariableDsl.g:67:2: ( ( rule__Model__VariablesAssignment )* )
            // InternalEvoVariableDsl.g:68:3: ( rule__Model__VariablesAssignment )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment()); 
            // InternalEvoVariableDsl.g:69:3: ( rule__Model__VariablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:69:4: rule__Model__VariablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__VariablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoVariableDsl.g:78:1: entryRuleEvoVariable : ruleEvoVariable EOF ;
    public final void entryRuleEvoVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:79:1: ( ruleEvoVariable EOF )
            // InternalEvoVariableDsl.g:80:1: ruleEvoVariable EOF
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
    // InternalEvoVariableDsl.g:87:1: ruleEvoVariable : ( ( rule__EvoVariable__Alternatives ) ) ;
    public final void ruleEvoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:91:2: ( ( ( rule__EvoVariable__Alternatives ) ) )
            // InternalEvoVariableDsl.g:92:2: ( ( rule__EvoVariable__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:92:2: ( ( rule__EvoVariable__Alternatives ) )
            // InternalEvoVariableDsl.g:93:3: ( rule__EvoVariable__Alternatives )
            {
             before(grammarAccess.getEvoVariableAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:94:3: ( rule__EvoVariable__Alternatives )
            // InternalEvoVariableDsl.g:94:4: rule__EvoVariable__Alternatives
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
    // InternalEvoVariableDsl.g:103:1: entryRuleEvoGenericVariable : ruleEvoGenericVariable EOF ;
    public final void entryRuleEvoGenericVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:104:1: ( ruleEvoGenericVariable EOF )
            // InternalEvoVariableDsl.g:105:1: ruleEvoGenericVariable EOF
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
    // InternalEvoVariableDsl.g:112:1: ruleEvoGenericVariable : ( ( rule__EvoGenericVariable__Group__0 ) ) ;
    public final void ruleEvoGenericVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:116:2: ( ( ( rule__EvoGenericVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:117:2: ( ( rule__EvoGenericVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:117:2: ( ( rule__EvoGenericVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:118:3: ( rule__EvoGenericVariable__Group__0 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:119:3: ( rule__EvoGenericVariable__Group__0 )
            // InternalEvoVariableDsl.g:119:4: rule__EvoGenericVariable__Group__0
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
    // InternalEvoVariableDsl.g:128:1: entryRuleEvoFeatureVariable : ruleEvoFeatureVariable EOF ;
    public final void entryRuleEvoFeatureVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:129:1: ( ruleEvoFeatureVariable EOF )
            // InternalEvoVariableDsl.g:130:1: ruleEvoFeatureVariable EOF
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
    // InternalEvoVariableDsl.g:137:1: ruleEvoFeatureVariable : ( ( rule__EvoFeatureVariable__Group__0 ) ) ;
    public final void ruleEvoFeatureVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:141:2: ( ( ( rule__EvoFeatureVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:142:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:142:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:143:3: ( rule__EvoFeatureVariable__Group__0 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:144:3: ( rule__EvoFeatureVariable__Group__0 )
            // InternalEvoVariableDsl.g:144:4: rule__EvoFeatureVariable__Group__0
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


    // $ANTLR start "ruleEvoVariableType"
    // InternalEvoVariableDsl.g:153:1: ruleEvoVariableType : ( ( rule__EvoVariableType__Alternatives ) ) ;
    public final void ruleEvoVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:157:1: ( ( ( rule__EvoVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:158:2: ( ( rule__EvoVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:158:2: ( ( rule__EvoVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:159:3: ( rule__EvoVariableType__Alternatives )
            {
             before(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:160:3: ( rule__EvoVariableType__Alternatives )
            // InternalEvoVariableDsl.g:160:4: rule__EvoVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:169:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:173:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:174:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:174:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:175:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:176:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoVariableDsl.g:176:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:184:1: rule__EvoVariable__Alternatives : ( ( ruleEvoGenericVariable ) | ( ruleEvoFeatureVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:188:1: ( ( ruleEvoGenericVariable ) | ( ruleEvoFeatureVariable ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvoVariableDsl.g:189:2: ( ruleEvoGenericVariable )
                    {
                    // InternalEvoVariableDsl.g:189:2: ( ruleEvoGenericVariable )
                    // InternalEvoVariableDsl.g:190:3: ruleEvoGenericVariable
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
                    // InternalEvoVariableDsl.g:195:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoVariableDsl.g:195:2: ( ruleEvoFeatureVariable )
                    // InternalEvoVariableDsl.g:196:3: ruleEvoFeatureVariable
                    {
                     before(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoFeatureVariable();

                    state._fsp--;

                     after(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); 

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
    // InternalEvoVariableDsl.g:205:1: rule__EvoVariableType__Alternatives : ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) );
    public final void rule__EvoVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:209:1: ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
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
                    // InternalEvoVariableDsl.g:210:2: ( ( '@ident' ) )
                    {
                    // InternalEvoVariableDsl.g:210:2: ( ( '@ident' ) )
                    // InternalEvoVariableDsl.g:211:3: ( '@ident' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:212:3: ( '@ident' )
                    // InternalEvoVariableDsl.g:212:4: '@ident'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:216:2: ( ( '@pre' ) )
                    {
                    // InternalEvoVariableDsl.g:216:2: ( ( '@pre' ) )
                    // InternalEvoVariableDsl.g:217:3: ( '@pre' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:218:3: ( '@pre' )
                    // InternalEvoVariableDsl.g:218:4: '@pre'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:222:2: ( ( '@post' ) )
                    {
                    // InternalEvoVariableDsl.g:222:2: ( ( '@post' ) )
                    // InternalEvoVariableDsl.g:223:3: ( '@post' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:224:3: ( '@post' )
                    // InternalEvoVariableDsl.g:224:4: '@post'
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
    // InternalEvoVariableDsl.g:232:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:236:1: ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:237:2: ( ( 'parent' ) )
                    {
                    // InternalEvoVariableDsl.g:237:2: ( ( 'parent' ) )
                    // InternalEvoVariableDsl.g:238:3: ( 'parent' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:239:3: ( 'parent' )
                    // InternalEvoVariableDsl.g:239:4: 'parent'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:243:2: ( ( 'source' ) )
                    {
                    // InternalEvoVariableDsl.g:243:2: ( ( 'source' ) )
                    // InternalEvoVariableDsl.g:244:3: ( 'source' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:245:3: ( 'source' )
                    // InternalEvoVariableDsl.g:245:4: 'source'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:249:2: ( ( 'child' ) )
                    {
                    // InternalEvoVariableDsl.g:249:2: ( ( 'child' ) )
                    // InternalEvoVariableDsl.g:250:3: ( 'child' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:251:3: ( 'child' )
                    // InternalEvoVariableDsl.g:251:4: 'child'
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


    // $ANTLR start "rule__EvoGenericVariable__Group__0"
    // InternalEvoVariableDsl.g:259:1: rule__EvoGenericVariable__Group__0 : rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1 ;
    public final void rule__EvoGenericVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:263:1: ( rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1 )
            // InternalEvoVariableDsl.g:264:2: rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:271:1: rule__EvoGenericVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__EvoGenericVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:275:1: ( ( 'var' ) )
            // InternalEvoVariableDsl.g:276:1: ( 'var' )
            {
            // InternalEvoVariableDsl.g:276:1: ( 'var' )
            // InternalEvoVariableDsl.g:277:2: 'var'
            {
             before(grammarAccess.getEvoGenericVariableAccess().getVarKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:286:1: rule__EvoGenericVariable__Group__1 : rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2 ;
    public final void rule__EvoGenericVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:290:1: ( rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2 )
            // InternalEvoVariableDsl.g:291:2: rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalEvoVariableDsl.g:298:1: rule__EvoGenericVariable__Group__1__Impl : ( ( rule__EvoGenericVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGenericVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:302:1: ( ( ( rule__EvoGenericVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:303:1: ( ( rule__EvoGenericVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:303:1: ( ( rule__EvoGenericVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:304:2: ( rule__EvoGenericVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:305:2: ( rule__EvoGenericVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:305:3: rule__EvoGenericVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:313:1: rule__EvoGenericVariable__Group__2 : rule__EvoGenericVariable__Group__2__Impl ;
    public final void rule__EvoGenericVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:317:1: ( rule__EvoGenericVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:318:2: rule__EvoGenericVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:324:1: rule__EvoGenericVariable__Group__2__Impl : ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) ) ;
    public final void rule__EvoGenericVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:328:1: ( ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) ) )
            // InternalEvoVariableDsl.g:329:1: ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) )
            {
            // InternalEvoVariableDsl.g:329:1: ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) )
            // InternalEvoVariableDsl.g:330:2: ( rule__EvoGenericVariable__VariableTypeAssignment_2 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getVariableTypeAssignment_2()); 
            // InternalEvoVariableDsl.g:331:2: ( rule__EvoGenericVariable__VariableTypeAssignment_2 )
            // InternalEvoVariableDsl.g:331:3: rule__EvoGenericVariable__VariableTypeAssignment_2
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
    // InternalEvoVariableDsl.g:340:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:344:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoVariableDsl.g:345:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:352:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:356:1: ( ( 'feature' ) )
            // InternalEvoVariableDsl.g:357:1: ( 'feature' )
            {
            // InternalEvoVariableDsl.g:357:1: ( 'feature' )
            // InternalEvoVariableDsl.g:358:2: 'feature'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:367:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:371:1: ( rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 )
            // InternalEvoVariableDsl.g:372:2: rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalEvoVariableDsl.g:379:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:383:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:384:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:384:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:385:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:386:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:386:3: rule__EvoFeatureVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:394:1: rule__EvoFeatureVariable__Group__2 : rule__EvoFeatureVariable__Group__2__Impl ;
    public final void rule__EvoFeatureVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:398:1: ( rule__EvoFeatureVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:399:2: rule__EvoFeatureVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:405:1: rule__EvoFeatureVariable__Group__2__Impl : ( ( rule__EvoFeatureVariable__Group_2__0 )? ) ;
    public final void rule__EvoFeatureVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:409:1: ( ( ( rule__EvoFeatureVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:410:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:410:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:411:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:412:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:412:3: rule__EvoFeatureVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:421:1: rule__EvoFeatureVariable__Group_2__0 : rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 ;
    public final void rule__EvoFeatureVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:425:1: ( rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:426:2: rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalEvoVariableDsl.g:433:1: rule__EvoFeatureVariable__Group_2__0__Impl : ( '.' ) ;
    public final void rule__EvoFeatureVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:437:1: ( ( '.' ) )
            // InternalEvoVariableDsl.g:438:1: ( '.' )
            {
            // InternalEvoVariableDsl.g:438:1: ( '.' )
            // InternalEvoVariableDsl.g:439:2: '.'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:448:1: rule__EvoFeatureVariable__Group_2__1 : rule__EvoFeatureVariable__Group_2__1__Impl ;
    public final void rule__EvoFeatureVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:452:1: ( rule__EvoFeatureVariable__Group_2__1__Impl )
            // InternalEvoVariableDsl.g:453:2: rule__EvoFeatureVariable__Group_2__1__Impl
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
    // InternalEvoVariableDsl.g:459:1: rule__EvoFeatureVariable__Group_2__1__Impl : ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:463:1: ( ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:464:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:464:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:465:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1()); 
            // InternalEvoVariableDsl.g:466:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            // InternalEvoVariableDsl.g:466:3: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1
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


    // $ANTLR start "rule__Model__VariablesAssignment"
    // InternalEvoVariableDsl.g:475:1: rule__Model__VariablesAssignment : ( ruleEvoVariable ) ;
    public final void rule__Model__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:479:1: ( ( ruleEvoVariable ) )
            // InternalEvoVariableDsl.g:480:2: ( ruleEvoVariable )
            {
            // InternalEvoVariableDsl.g:480:2: ( ruleEvoVariable )
            // InternalEvoVariableDsl.g:481:3: ruleEvoVariable
            {
             before(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VariablesAssignment"


    // $ANTLR start "rule__EvoGenericVariable__NameAssignment_1"
    // InternalEvoVariableDsl.g:490:1: rule__EvoGenericVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGenericVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:494:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:495:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:495:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:496:3: RULE_ID
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
    // InternalEvoVariableDsl.g:505:1: rule__EvoGenericVariable__VariableTypeAssignment_2 : ( ruleEvoVariableType ) ;
    public final void rule__EvoGenericVariable__VariableTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:509:1: ( ( ruleEvoVariableType ) )
            // InternalEvoVariableDsl.g:510:2: ( ruleEvoVariableType )
            {
            // InternalEvoVariableDsl.g:510:2: ( ruleEvoVariableType )
            // InternalEvoVariableDsl.g:511:3: ruleEvoVariableType
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
    // InternalEvoVariableDsl.g:520:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:524:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:525:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:525:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:526:3: RULE_ID
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
    // InternalEvoVariableDsl.g:535:1: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 : ( ruleEvoFeatureVariableType ) ;
    public final void rule__EvoFeatureVariable__FeatureTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:539:1: ( ( ruleEvoFeatureVariableType ) )
            // InternalEvoVariableDsl.g:540:2: ( ruleEvoFeatureVariableType )
            {
            // InternalEvoVariableDsl.g:540:2: ( ruleEvoFeatureVariableType )
            // InternalEvoVariableDsl.g:541:3: ruleEvoFeatureVariableType
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});

}