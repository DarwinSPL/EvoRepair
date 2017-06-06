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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'", "'var'", "'_'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( (LA1_0==17) ) {
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
    // InternalEvoVariableDsl.g:87:1: ruleEvoVariable : ( ( rule__EvoVariable__Group__0 ) ) ;
    public final void ruleEvoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:91:2: ( ( ( rule__EvoVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:92:2: ( ( rule__EvoVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:92:2: ( ( rule__EvoVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:93:3: ( rule__EvoVariable__Group__0 )
            {
             before(grammarAccess.getEvoVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:94:3: ( rule__EvoVariable__Group__0 )
            // InternalEvoVariableDsl.g:94:4: rule__EvoVariable__Group__0
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
    // InternalEvoVariableDsl.g:103:1: ruleEvoVariableType : ( ( rule__EvoVariableType__Alternatives ) ) ;
    public final void ruleEvoVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:107:1: ( ( ( rule__EvoVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:108:2: ( ( rule__EvoVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:108:2: ( ( rule__EvoVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:109:3: ( rule__EvoVariableType__Alternatives )
            {
             before(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:110:3: ( rule__EvoVariableType__Alternatives )
            // InternalEvoVariableDsl.g:110:4: rule__EvoVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:119:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:123:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:124:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:124:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:125:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:126:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoVariableDsl.g:126:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:134:1: rule__EvoVariableType__Alternatives : ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) );
    public final void rule__EvoVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:138:1: ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // InternalEvoVariableDsl.g:139:2: ( ( '@ident' ) )
                    {
                    // InternalEvoVariableDsl.g:139:2: ( ( '@ident' ) )
                    // InternalEvoVariableDsl.g:140:3: ( '@ident' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:141:3: ( '@ident' )
                    // InternalEvoVariableDsl.g:141:4: '@ident'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:145:2: ( ( '@pre' ) )
                    {
                    // InternalEvoVariableDsl.g:145:2: ( ( '@pre' ) )
                    // InternalEvoVariableDsl.g:146:3: ( '@pre' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:147:3: ( '@pre' )
                    // InternalEvoVariableDsl.g:147:4: '@pre'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:151:2: ( ( '@post' ) )
                    {
                    // InternalEvoVariableDsl.g:151:2: ( ( '@post' ) )
                    // InternalEvoVariableDsl.g:152:3: ( '@post' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:153:3: ( '@post' )
                    // InternalEvoVariableDsl.g:153:4: '@post'
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
    // InternalEvoVariableDsl.g:161:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:165:1: ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
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
                    // InternalEvoVariableDsl.g:166:2: ( ( 'parent' ) )
                    {
                    // InternalEvoVariableDsl.g:166:2: ( ( 'parent' ) )
                    // InternalEvoVariableDsl.g:167:3: ( 'parent' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:168:3: ( 'parent' )
                    // InternalEvoVariableDsl.g:168:4: 'parent'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:172:2: ( ( 'source' ) )
                    {
                    // InternalEvoVariableDsl.g:172:2: ( ( 'source' ) )
                    // InternalEvoVariableDsl.g:173:3: ( 'source' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:174:3: ( 'source' )
                    // InternalEvoVariableDsl.g:174:4: 'source'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:178:2: ( ( 'child' ) )
                    {
                    // InternalEvoVariableDsl.g:178:2: ( ( 'child' ) )
                    // InternalEvoVariableDsl.g:179:3: ( 'child' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:180:3: ( 'child' )
                    // InternalEvoVariableDsl.g:180:4: 'child'
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


    // $ANTLR start "rule__EvoVariable__Group__0"
    // InternalEvoVariableDsl.g:188:1: rule__EvoVariable__Group__0 : rule__EvoVariable__Group__0__Impl rule__EvoVariable__Group__1 ;
    public final void rule__EvoVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:192:1: ( rule__EvoVariable__Group__0__Impl rule__EvoVariable__Group__1 )
            // InternalEvoVariableDsl.g:193:2: rule__EvoVariable__Group__0__Impl rule__EvoVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:200:1: rule__EvoVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__EvoVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:204:1: ( ( 'var' ) )
            // InternalEvoVariableDsl.g:205:1: ( 'var' )
            {
            // InternalEvoVariableDsl.g:205:1: ( 'var' )
            // InternalEvoVariableDsl.g:206:2: 'var'
            {
             before(grammarAccess.getEvoVariableAccess().getVarKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:215:1: rule__EvoVariable__Group__1 : rule__EvoVariable__Group__1__Impl rule__EvoVariable__Group__2 ;
    public final void rule__EvoVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:219:1: ( rule__EvoVariable__Group__1__Impl rule__EvoVariable__Group__2 )
            // InternalEvoVariableDsl.g:220:2: rule__EvoVariable__Group__1__Impl rule__EvoVariable__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalEvoVariableDsl.g:227:1: rule__EvoVariable__Group__1__Impl : ( ( rule__EvoVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:231:1: ( ( ( rule__EvoVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:232:1: ( ( rule__EvoVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:232:1: ( ( rule__EvoVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:233:2: ( rule__EvoVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:234:2: ( rule__EvoVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:234:3: rule__EvoVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:242:1: rule__EvoVariable__Group__2 : rule__EvoVariable__Group__2__Impl rule__EvoVariable__Group__3 ;
    public final void rule__EvoVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:246:1: ( rule__EvoVariable__Group__2__Impl rule__EvoVariable__Group__3 )
            // InternalEvoVariableDsl.g:247:2: rule__EvoVariable__Group__2__Impl rule__EvoVariable__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalEvoVariableDsl.g:254:1: rule__EvoVariable__Group__2__Impl : ( ( rule__EvoVariable__Group_2__0 ) ) ;
    public final void rule__EvoVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:258:1: ( ( ( rule__EvoVariable__Group_2__0 ) ) )
            // InternalEvoVariableDsl.g:259:1: ( ( rule__EvoVariable__Group_2__0 ) )
            {
            // InternalEvoVariableDsl.g:259:1: ( ( rule__EvoVariable__Group_2__0 ) )
            // InternalEvoVariableDsl.g:260:2: ( rule__EvoVariable__Group_2__0 )
            {
             before(grammarAccess.getEvoVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:261:2: ( rule__EvoVariable__Group_2__0 )
            // InternalEvoVariableDsl.g:261:3: rule__EvoVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:269:1: rule__EvoVariable__Group__3 : rule__EvoVariable__Group__3__Impl ;
    public final void rule__EvoVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:273:1: ( rule__EvoVariable__Group__3__Impl )
            // InternalEvoVariableDsl.g:274:2: rule__EvoVariable__Group__3__Impl
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
    // InternalEvoVariableDsl.g:280:1: rule__EvoVariable__Group__3__Impl : ( ( rule__EvoVariable__VariableTypeAssignment_3 ) ) ;
    public final void rule__EvoVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:284:1: ( ( ( rule__EvoVariable__VariableTypeAssignment_3 ) ) )
            // InternalEvoVariableDsl.g:285:1: ( ( rule__EvoVariable__VariableTypeAssignment_3 ) )
            {
            // InternalEvoVariableDsl.g:285:1: ( ( rule__EvoVariable__VariableTypeAssignment_3 ) )
            // InternalEvoVariableDsl.g:286:2: ( rule__EvoVariable__VariableTypeAssignment_3 )
            {
             before(grammarAccess.getEvoVariableAccess().getVariableTypeAssignment_3()); 
            // InternalEvoVariableDsl.g:287:2: ( rule__EvoVariable__VariableTypeAssignment_3 )
            // InternalEvoVariableDsl.g:287:3: rule__EvoVariable__VariableTypeAssignment_3
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
    // InternalEvoVariableDsl.g:296:1: rule__EvoVariable__Group_2__0 : rule__EvoVariable__Group_2__0__Impl rule__EvoVariable__Group_2__1 ;
    public final void rule__EvoVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:300:1: ( rule__EvoVariable__Group_2__0__Impl rule__EvoVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:301:2: rule__EvoVariable__Group_2__0__Impl rule__EvoVariable__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalEvoVariableDsl.g:308:1: rule__EvoVariable__Group_2__0__Impl : ( '_' ) ;
    public final void rule__EvoVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:312:1: ( ( '_' ) )
            // InternalEvoVariableDsl.g:313:1: ( '_' )
            {
            // InternalEvoVariableDsl.g:313:1: ( '_' )
            // InternalEvoVariableDsl.g:314:2: '_'
            {
             before(grammarAccess.getEvoVariableAccess().get_Keyword_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:323:1: rule__EvoVariable__Group_2__1 : rule__EvoVariable__Group_2__1__Impl ;
    public final void rule__EvoVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:327:1: ( rule__EvoVariable__Group_2__1__Impl )
            // InternalEvoVariableDsl.g:328:2: rule__EvoVariable__Group_2__1__Impl
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
    // InternalEvoVariableDsl.g:334:1: rule__EvoVariable__Group_2__1__Impl : ( ( rule__EvoVariable__IndexAssignment_2_1 ) ) ;
    public final void rule__EvoVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:338:1: ( ( ( rule__EvoVariable__IndexAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:339:1: ( ( rule__EvoVariable__IndexAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:339:1: ( ( rule__EvoVariable__IndexAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:340:2: ( rule__EvoVariable__IndexAssignment_2_1 )
            {
             before(grammarAccess.getEvoVariableAccess().getIndexAssignment_2_1()); 
            // InternalEvoVariableDsl.g:341:2: ( rule__EvoVariable__IndexAssignment_2_1 )
            // InternalEvoVariableDsl.g:341:3: rule__EvoVariable__IndexAssignment_2_1
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


    // $ANTLR start "rule__Model__VariablesAssignment"
    // InternalEvoVariableDsl.g:350:1: rule__Model__VariablesAssignment : ( ruleEvoVariable ) ;
    public final void rule__Model__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:354:1: ( ( ruleEvoVariable ) )
            // InternalEvoVariableDsl.g:355:2: ( ruleEvoVariable )
            {
            // InternalEvoVariableDsl.g:355:2: ( ruleEvoVariable )
            // InternalEvoVariableDsl.g:356:3: ruleEvoVariable
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


    // $ANTLR start "rule__EvoVariable__NameAssignment_1"
    // InternalEvoVariableDsl.g:365:1: rule__EvoVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:369:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:370:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:370:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:371:3: RULE_ID
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
    // InternalEvoVariableDsl.g:380:1: rule__EvoVariable__IndexAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__EvoVariable__IndexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:384:1: ( ( RULE_INT ) )
            // InternalEvoVariableDsl.g:385:2: ( RULE_INT )
            {
            // InternalEvoVariableDsl.g:385:2: ( RULE_INT )
            // InternalEvoVariableDsl.g:386:3: RULE_INT
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
    // InternalEvoVariableDsl.g:395:1: rule__EvoVariable__VariableTypeAssignment_3 : ( ruleEvoVariableType ) ;
    public final void rule__EvoVariable__VariableTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:399:1: ( ( ruleEvoVariableType ) )
            // InternalEvoVariableDsl.g:400:2: ( ruleEvoVariableType )
            {
            // InternalEvoVariableDsl.g:400:2: ( ruleEvoVariableType )
            // InternalEvoVariableDsl.g:401:3: ruleEvoVariableType
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}