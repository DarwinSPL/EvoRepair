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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'", "'var'", "'feature'", "'.'", "'group'", "'set'", "'('", "')'", "','", "'mapping'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( ((LA1_0>=17 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=21)||LA1_0==25) ) {
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


    // $ANTLR start "entryRuleEvoGroupVariable"
    // InternalEvoVariableDsl.g:153:1: entryRuleEvoGroupVariable : ruleEvoGroupVariable EOF ;
    public final void entryRuleEvoGroupVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:154:1: ( ruleEvoGroupVariable EOF )
            // InternalEvoVariableDsl.g:155:1: ruleEvoGroupVariable EOF
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
    // InternalEvoVariableDsl.g:162:1: ruleEvoGroupVariable : ( ( rule__EvoGroupVariable__Group__0 ) ) ;
    public final void ruleEvoGroupVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:166:2: ( ( ( rule__EvoGroupVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:167:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:167:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:168:3: ( rule__EvoGroupVariable__Group__0 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:169:3: ( rule__EvoGroupVariable__Group__0 )
            // InternalEvoVariableDsl.g:169:4: rule__EvoGroupVariable__Group__0
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
    // InternalEvoVariableDsl.g:178:1: entryRuleEvoSetVariable : ruleEvoSetVariable EOF ;
    public final void entryRuleEvoSetVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:179:1: ( ruleEvoSetVariable EOF )
            // InternalEvoVariableDsl.g:180:1: ruleEvoSetVariable EOF
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
    // InternalEvoVariableDsl.g:187:1: ruleEvoSetVariable : ( ( rule__EvoSetVariable__Group__0 ) ) ;
    public final void ruleEvoSetVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:191:2: ( ( ( rule__EvoSetVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:192:2: ( ( rule__EvoSetVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:192:2: ( ( rule__EvoSetVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:193:3: ( rule__EvoSetVariable__Group__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:194:3: ( rule__EvoSetVariable__Group__0 )
            // InternalEvoVariableDsl.g:194:4: rule__EvoSetVariable__Group__0
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
    // InternalEvoVariableDsl.g:203:1: entryRuleEvoMappingVariable : ruleEvoMappingVariable EOF ;
    public final void entryRuleEvoMappingVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:204:1: ( ruleEvoMappingVariable EOF )
            // InternalEvoVariableDsl.g:205:1: ruleEvoMappingVariable EOF
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
    // InternalEvoVariableDsl.g:212:1: ruleEvoMappingVariable : ( ( rule__EvoMappingVariable__Group__0 ) ) ;
    public final void ruleEvoMappingVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:216:2: ( ( ( rule__EvoMappingVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:217:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:217:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:218:3: ( rule__EvoMappingVariable__Group__0 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:219:3: ( rule__EvoMappingVariable__Group__0 )
            // InternalEvoVariableDsl.g:219:4: rule__EvoMappingVariable__Group__0
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
    // InternalEvoVariableDsl.g:228:1: ruleEvoVariableType : ( ( rule__EvoVariableType__Alternatives ) ) ;
    public final void ruleEvoVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:232:1: ( ( ( rule__EvoVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:233:2: ( ( rule__EvoVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:233:2: ( ( rule__EvoVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:234:3: ( rule__EvoVariableType__Alternatives )
            {
             before(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:235:3: ( rule__EvoVariableType__Alternatives )
            // InternalEvoVariableDsl.g:235:4: rule__EvoVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:244:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:248:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:249:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:249:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:250:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:251:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoVariableDsl.g:251:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:259:1: rule__EvoVariable__Alternatives : ( ( ruleEvoGenericVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:263:1: ( ( ruleEvoGenericVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEvoVariableDsl.g:264:2: ( ruleEvoGenericVariable )
                    {
                    // InternalEvoVariableDsl.g:264:2: ( ruleEvoGenericVariable )
                    // InternalEvoVariableDsl.g:265:3: ruleEvoGenericVariable
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
                    // InternalEvoVariableDsl.g:270:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoVariableDsl.g:270:2: ( ruleEvoFeatureVariable )
                    // InternalEvoVariableDsl.g:271:3: ruleEvoFeatureVariable
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
                    // InternalEvoVariableDsl.g:276:2: ( ruleEvoGroupVariable )
                    {
                    // InternalEvoVariableDsl.g:276:2: ( ruleEvoGroupVariable )
                    // InternalEvoVariableDsl.g:277:3: ruleEvoGroupVariable
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
                    // InternalEvoVariableDsl.g:282:2: ( ruleEvoSetVariable )
                    {
                    // InternalEvoVariableDsl.g:282:2: ( ruleEvoSetVariable )
                    // InternalEvoVariableDsl.g:283:3: ruleEvoSetVariable
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
                    // InternalEvoVariableDsl.g:288:2: ( ruleEvoMappingVariable )
                    {
                    // InternalEvoVariableDsl.g:288:2: ( ruleEvoMappingVariable )
                    // InternalEvoVariableDsl.g:289:3: ruleEvoMappingVariable
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
    // InternalEvoVariableDsl.g:298:1: rule__EvoVariableType__Alternatives : ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) );
    public final void rule__EvoVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:302:1: ( ( ( '@ident' ) ) | ( ( '@pre' ) ) | ( ( '@post' ) ) )
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
                    // InternalEvoVariableDsl.g:303:2: ( ( '@ident' ) )
                    {
                    // InternalEvoVariableDsl.g:303:2: ( ( '@ident' ) )
                    // InternalEvoVariableDsl.g:304:3: ( '@ident' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:305:3: ( '@ident' )
                    // InternalEvoVariableDsl.g:305:4: '@ident'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:309:2: ( ( '@pre' ) )
                    {
                    // InternalEvoVariableDsl.g:309:2: ( ( '@pre' ) )
                    // InternalEvoVariableDsl.g:310:3: ( '@pre' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:311:3: ( '@pre' )
                    // InternalEvoVariableDsl.g:311:4: '@pre'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:315:2: ( ( '@post' ) )
                    {
                    // InternalEvoVariableDsl.g:315:2: ( ( '@post' ) )
                    // InternalEvoVariableDsl.g:316:3: ( '@post' )
                    {
                     before(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:317:3: ( '@post' )
                    // InternalEvoVariableDsl.g:317:4: '@post'
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
    // InternalEvoVariableDsl.g:325:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:329:1: ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) )
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
                    // InternalEvoVariableDsl.g:330:2: ( ( 'parent' ) )
                    {
                    // InternalEvoVariableDsl.g:330:2: ( ( 'parent' ) )
                    // InternalEvoVariableDsl.g:331:3: ( 'parent' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:332:3: ( 'parent' )
                    // InternalEvoVariableDsl.g:332:4: 'parent'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:336:2: ( ( 'source' ) )
                    {
                    // InternalEvoVariableDsl.g:336:2: ( ( 'source' ) )
                    // InternalEvoVariableDsl.g:337:3: ( 'source' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:338:3: ( 'source' )
                    // InternalEvoVariableDsl.g:338:4: 'source'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:342:2: ( ( 'child' ) )
                    {
                    // InternalEvoVariableDsl.g:342:2: ( ( 'child' ) )
                    // InternalEvoVariableDsl.g:343:3: ( 'child' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:344:3: ( 'child' )
                    // InternalEvoVariableDsl.g:344:4: 'child'
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
    // InternalEvoVariableDsl.g:352:1: rule__EvoGenericVariable__Group__0 : rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1 ;
    public final void rule__EvoGenericVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:356:1: ( rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1 )
            // InternalEvoVariableDsl.g:357:2: rule__EvoGenericVariable__Group__0__Impl rule__EvoGenericVariable__Group__1
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
    // InternalEvoVariableDsl.g:364:1: rule__EvoGenericVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__EvoGenericVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:368:1: ( ( 'var' ) )
            // InternalEvoVariableDsl.g:369:1: ( 'var' )
            {
            // InternalEvoVariableDsl.g:369:1: ( 'var' )
            // InternalEvoVariableDsl.g:370:2: 'var'
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
    // InternalEvoVariableDsl.g:379:1: rule__EvoGenericVariable__Group__1 : rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2 ;
    public final void rule__EvoGenericVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:383:1: ( rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2 )
            // InternalEvoVariableDsl.g:384:2: rule__EvoGenericVariable__Group__1__Impl rule__EvoGenericVariable__Group__2
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
    // InternalEvoVariableDsl.g:391:1: rule__EvoGenericVariable__Group__1__Impl : ( ( rule__EvoGenericVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGenericVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:395:1: ( ( ( rule__EvoGenericVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:396:1: ( ( rule__EvoGenericVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:396:1: ( ( rule__EvoGenericVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:397:2: ( rule__EvoGenericVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:398:2: ( rule__EvoGenericVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:398:3: rule__EvoGenericVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:406:1: rule__EvoGenericVariable__Group__2 : rule__EvoGenericVariable__Group__2__Impl ;
    public final void rule__EvoGenericVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:410:1: ( rule__EvoGenericVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:411:2: rule__EvoGenericVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:417:1: rule__EvoGenericVariable__Group__2__Impl : ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) ) ;
    public final void rule__EvoGenericVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:421:1: ( ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) ) )
            // InternalEvoVariableDsl.g:422:1: ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) )
            {
            // InternalEvoVariableDsl.g:422:1: ( ( rule__EvoGenericVariable__VariableTypeAssignment_2 ) )
            // InternalEvoVariableDsl.g:423:2: ( rule__EvoGenericVariable__VariableTypeAssignment_2 )
            {
             before(grammarAccess.getEvoGenericVariableAccess().getVariableTypeAssignment_2()); 
            // InternalEvoVariableDsl.g:424:2: ( rule__EvoGenericVariable__VariableTypeAssignment_2 )
            // InternalEvoVariableDsl.g:424:3: rule__EvoGenericVariable__VariableTypeAssignment_2
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
    // InternalEvoVariableDsl.g:433:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:437:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoVariableDsl.g:438:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
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
    // InternalEvoVariableDsl.g:445:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:449:1: ( ( 'feature' ) )
            // InternalEvoVariableDsl.g:450:1: ( 'feature' )
            {
            // InternalEvoVariableDsl.g:450:1: ( 'feature' )
            // InternalEvoVariableDsl.g:451:2: 'feature'
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
    // InternalEvoVariableDsl.g:460:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:464:1: ( rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 )
            // InternalEvoVariableDsl.g:465:2: rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2
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
    // InternalEvoVariableDsl.g:472:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:476:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:477:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:477:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:478:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:479:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:479:3: rule__EvoFeatureVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:487:1: rule__EvoFeatureVariable__Group__2 : rule__EvoFeatureVariable__Group__2__Impl ;
    public final void rule__EvoFeatureVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:491:1: ( rule__EvoFeatureVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:492:2: rule__EvoFeatureVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:498:1: rule__EvoFeatureVariable__Group__2__Impl : ( ( rule__EvoFeatureVariable__Group_2__0 )? ) ;
    public final void rule__EvoFeatureVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:502:1: ( ( ( rule__EvoFeatureVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:503:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:503:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:504:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:505:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:505:3: rule__EvoFeatureVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:514:1: rule__EvoFeatureVariable__Group_2__0 : rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 ;
    public final void rule__EvoFeatureVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:518:1: ( rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:519:2: rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1
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
    // InternalEvoVariableDsl.g:526:1: rule__EvoFeatureVariable__Group_2__0__Impl : ( '.' ) ;
    public final void rule__EvoFeatureVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:530:1: ( ( '.' ) )
            // InternalEvoVariableDsl.g:531:1: ( '.' )
            {
            // InternalEvoVariableDsl.g:531:1: ( '.' )
            // InternalEvoVariableDsl.g:532:2: '.'
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
    // InternalEvoVariableDsl.g:541:1: rule__EvoFeatureVariable__Group_2__1 : rule__EvoFeatureVariable__Group_2__1__Impl ;
    public final void rule__EvoFeatureVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:545:1: ( rule__EvoFeatureVariable__Group_2__1__Impl )
            // InternalEvoVariableDsl.g:546:2: rule__EvoFeatureVariable__Group_2__1__Impl
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
    // InternalEvoVariableDsl.g:552:1: rule__EvoFeatureVariable__Group_2__1__Impl : ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:556:1: ( ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:557:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:557:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:558:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1()); 
            // InternalEvoVariableDsl.g:559:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            // InternalEvoVariableDsl.g:559:3: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1
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
    // InternalEvoVariableDsl.g:568:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:572:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoVariableDsl.g:573:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:580:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:584:1: ( ( 'group' ) )
            // InternalEvoVariableDsl.g:585:1: ( 'group' )
            {
            // InternalEvoVariableDsl.g:585:1: ( 'group' )
            // InternalEvoVariableDsl.g:586:2: 'group'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:595:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:599:1: ( rule__EvoGroupVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:600:2: rule__EvoGroupVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:606:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:610:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:611:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:611:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:612:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:613:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:613:3: rule__EvoGroupVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:622:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:626:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoVariableDsl.g:627:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:634:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:638:1: ( ( 'set' ) )
            // InternalEvoVariableDsl.g:639:1: ( 'set' )
            {
            // InternalEvoVariableDsl.g:639:1: ( 'set' )
            // InternalEvoVariableDsl.g:640:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:649:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:653:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoVariableDsl.g:654:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalEvoVariableDsl.g:661:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:665:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:666:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:666:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:667:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:668:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:668:3: rule__EvoSetVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:676:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:680:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:681:2: rule__EvoSetVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:687:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:691:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:692:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:692:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:693:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:694:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoVariableDsl.g:694:3: rule__EvoSetVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:703:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:707:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:708:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:715:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:719:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:720:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:720:1: ( '(' )
            // InternalEvoVariableDsl.g:721:2: '('
            {
             before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:730:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:734:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:735:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalEvoVariableDsl.g:742:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:746:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:747:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:747:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:748:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoVariableDsl.g:749:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoVariableDsl.g:749:3: rule__EvoSetVariable__ElementsAssignment_2_1
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
    // InternalEvoVariableDsl.g:757:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:761:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoVariableDsl.g:762:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalEvoVariableDsl.g:769:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:773:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoVariableDsl.g:774:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoVariableDsl.g:774:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoVariableDsl.g:775:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoVariableDsl.g:776:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoVariableDsl.g:776:3: rule__EvoSetVariable__Group_2_2__0
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
    // InternalEvoVariableDsl.g:784:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:788:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoVariableDsl.g:789:2: rule__EvoSetVariable__Group_2__3__Impl
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
    // InternalEvoVariableDsl.g:795:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:799:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:800:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:800:1: ( ')' )
            // InternalEvoVariableDsl.g:801:2: ')'
            {
             before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:811:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:815:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoVariableDsl.g:816:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:823:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:827:1: ( ( ',' ) )
            // InternalEvoVariableDsl.g:828:1: ( ',' )
            {
            // InternalEvoVariableDsl.g:828:1: ( ',' )
            // InternalEvoVariableDsl.g:829:2: ','
            {
             before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:838:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:842:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoVariableDsl.g:843:2: rule__EvoSetVariable__Group_2_2__1__Impl
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
    // InternalEvoVariableDsl.g:849:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:853:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoVariableDsl.g:854:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoVariableDsl.g:854:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoVariableDsl.g:855:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoVariableDsl.g:856:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoVariableDsl.g:856:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
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
    // InternalEvoVariableDsl.g:865:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:869:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoVariableDsl.g:870:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:877:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:881:1: ( ( 'mapping' ) )
            // InternalEvoVariableDsl.g:882:1: ( 'mapping' )
            {
            // InternalEvoVariableDsl.g:882:1: ( 'mapping' )
            // InternalEvoVariableDsl.g:883:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:892:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:896:1: ( rule__EvoMappingVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:897:2: rule__EvoMappingVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:903:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:907:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:908:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:908:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:909:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:910:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:910:3: rule__EvoMappingVariable__NameAssignment_1
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


    // $ANTLR start "rule__Model__VariablesAssignment"
    // InternalEvoVariableDsl.g:919:1: rule__Model__VariablesAssignment : ( ruleEvoVariable ) ;
    public final void rule__Model__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:923:1: ( ( ruleEvoVariable ) )
            // InternalEvoVariableDsl.g:924:2: ( ruleEvoVariable )
            {
            // InternalEvoVariableDsl.g:924:2: ( ruleEvoVariable )
            // InternalEvoVariableDsl.g:925:3: ruleEvoVariable
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
    // InternalEvoVariableDsl.g:934:1: rule__EvoGenericVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGenericVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:938:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:939:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:939:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:940:3: RULE_ID
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
    // InternalEvoVariableDsl.g:949:1: rule__EvoGenericVariable__VariableTypeAssignment_2 : ( ruleEvoVariableType ) ;
    public final void rule__EvoGenericVariable__VariableTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:953:1: ( ( ruleEvoVariableType ) )
            // InternalEvoVariableDsl.g:954:2: ( ruleEvoVariableType )
            {
            // InternalEvoVariableDsl.g:954:2: ( ruleEvoVariableType )
            // InternalEvoVariableDsl.g:955:3: ruleEvoVariableType
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
    // InternalEvoVariableDsl.g:964:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:968:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:969:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:969:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:970:3: RULE_ID
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
    // InternalEvoVariableDsl.g:979:1: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 : ( ruleEvoFeatureVariableType ) ;
    public final void rule__EvoFeatureVariable__FeatureTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:983:1: ( ( ruleEvoFeatureVariableType ) )
            // InternalEvoVariableDsl.g:984:2: ( ruleEvoFeatureVariableType )
            {
            // InternalEvoVariableDsl.g:984:2: ( ruleEvoFeatureVariableType )
            // InternalEvoVariableDsl.g:985:3: ruleEvoFeatureVariableType
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
    // InternalEvoVariableDsl.g:994:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:998:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:999:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:999:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1000:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1009:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1013:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1014:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1014:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1015:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1024:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1028:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1029:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1029:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1030:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoVariableDsl.g:1031:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1032:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1043:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1047:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1048:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1048:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1049:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoVariableDsl.g:1050:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1051:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1062:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1066:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1067:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1067:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1068:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002360002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});

}