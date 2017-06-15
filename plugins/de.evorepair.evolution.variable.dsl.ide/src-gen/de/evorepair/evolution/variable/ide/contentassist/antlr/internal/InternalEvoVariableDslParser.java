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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parent'", "'source'", "'child'", "'feature'", "'.'", "'group'", "'set'", "'('", "')'", "','", "'mapping'", "'configuration'"
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

                if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=17)||(LA1_0>=21 && LA1_0<=22)) ) {
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


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalEvoVariableDsl.g:103:1: entryRuleEvoFeatureVariable : ruleEvoFeatureVariable EOF ;
    public final void entryRuleEvoFeatureVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:104:1: ( ruleEvoFeatureVariable EOF )
            // InternalEvoVariableDsl.g:105:1: ruleEvoFeatureVariable EOF
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
    // InternalEvoVariableDsl.g:112:1: ruleEvoFeatureVariable : ( ( rule__EvoFeatureVariable__Group__0 ) ) ;
    public final void ruleEvoFeatureVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:116:2: ( ( ( rule__EvoFeatureVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:117:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:117:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:118:3: ( rule__EvoFeatureVariable__Group__0 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:119:3: ( rule__EvoFeatureVariable__Group__0 )
            // InternalEvoVariableDsl.g:119:4: rule__EvoFeatureVariable__Group__0
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
    // InternalEvoVariableDsl.g:128:1: entryRuleEvoGroupVariable : ruleEvoGroupVariable EOF ;
    public final void entryRuleEvoGroupVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:129:1: ( ruleEvoGroupVariable EOF )
            // InternalEvoVariableDsl.g:130:1: ruleEvoGroupVariable EOF
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
    // InternalEvoVariableDsl.g:137:1: ruleEvoGroupVariable : ( ( rule__EvoGroupVariable__Group__0 ) ) ;
    public final void ruleEvoGroupVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:141:2: ( ( ( rule__EvoGroupVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:142:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:142:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:143:3: ( rule__EvoGroupVariable__Group__0 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:144:3: ( rule__EvoGroupVariable__Group__0 )
            // InternalEvoVariableDsl.g:144:4: rule__EvoGroupVariable__Group__0
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
    // InternalEvoVariableDsl.g:153:1: entryRuleEvoSetVariable : ruleEvoSetVariable EOF ;
    public final void entryRuleEvoSetVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:154:1: ( ruleEvoSetVariable EOF )
            // InternalEvoVariableDsl.g:155:1: ruleEvoSetVariable EOF
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
    // InternalEvoVariableDsl.g:162:1: ruleEvoSetVariable : ( ( rule__EvoSetVariable__Group__0 ) ) ;
    public final void ruleEvoSetVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:166:2: ( ( ( rule__EvoSetVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:167:2: ( ( rule__EvoSetVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:167:2: ( ( rule__EvoSetVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:168:3: ( rule__EvoSetVariable__Group__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:169:3: ( rule__EvoSetVariable__Group__0 )
            // InternalEvoVariableDsl.g:169:4: rule__EvoSetVariable__Group__0
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
    // InternalEvoVariableDsl.g:178:1: entryRuleEvoMappingVariable : ruleEvoMappingVariable EOF ;
    public final void entryRuleEvoMappingVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:179:1: ( ruleEvoMappingVariable EOF )
            // InternalEvoVariableDsl.g:180:1: ruleEvoMappingVariable EOF
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
    // InternalEvoVariableDsl.g:187:1: ruleEvoMappingVariable : ( ( rule__EvoMappingVariable__Group__0 ) ) ;
    public final void ruleEvoMappingVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:191:2: ( ( ( rule__EvoMappingVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:192:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:192:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:193:3: ( rule__EvoMappingVariable__Group__0 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:194:3: ( rule__EvoMappingVariable__Group__0 )
            // InternalEvoVariableDsl.g:194:4: rule__EvoMappingVariable__Group__0
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
    // InternalEvoVariableDsl.g:203:1: entryRuleEvoConfigurationVariable : ruleEvoConfigurationVariable EOF ;
    public final void entryRuleEvoConfigurationVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:204:1: ( ruleEvoConfigurationVariable EOF )
            // InternalEvoVariableDsl.g:205:1: ruleEvoConfigurationVariable EOF
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
    // InternalEvoVariableDsl.g:212:1: ruleEvoConfigurationVariable : ( ( rule__EvoConfigurationVariable__Group__0 ) ) ;
    public final void ruleEvoConfigurationVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:216:2: ( ( ( rule__EvoConfigurationVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:217:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:217:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:218:3: ( rule__EvoConfigurationVariable__Group__0 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:219:3: ( rule__EvoConfigurationVariable__Group__0 )
            // InternalEvoVariableDsl.g:219:4: rule__EvoConfigurationVariable__Group__0
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
    // InternalEvoVariableDsl.g:228:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:232:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:233:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:233:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:234:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:235:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoVariableDsl.g:235:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:243:1: rule__EvoVariable__Alternatives : ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:247:1: ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 21:
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
                    // InternalEvoVariableDsl.g:248:2: ( ruleEvoConfigurationVariable )
                    {
                    // InternalEvoVariableDsl.g:248:2: ( ruleEvoConfigurationVariable )
                    // InternalEvoVariableDsl.g:249:3: ruleEvoConfigurationVariable
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
                    // InternalEvoVariableDsl.g:254:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoVariableDsl.g:254:2: ( ruleEvoFeatureVariable )
                    // InternalEvoVariableDsl.g:255:3: ruleEvoFeatureVariable
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
                    // InternalEvoVariableDsl.g:260:2: ( ruleEvoGroupVariable )
                    {
                    // InternalEvoVariableDsl.g:260:2: ( ruleEvoGroupVariable )
                    // InternalEvoVariableDsl.g:261:3: ruleEvoGroupVariable
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
                    // InternalEvoVariableDsl.g:266:2: ( ruleEvoSetVariable )
                    {
                    // InternalEvoVariableDsl.g:266:2: ( ruleEvoSetVariable )
                    // InternalEvoVariableDsl.g:267:3: ruleEvoSetVariable
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
                    // InternalEvoVariableDsl.g:272:2: ( ruleEvoMappingVariable )
                    {
                    // InternalEvoVariableDsl.g:272:2: ( ruleEvoMappingVariable )
                    // InternalEvoVariableDsl.g:273:3: ruleEvoMappingVariable
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
    // InternalEvoVariableDsl.g:282:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:286:1: ( ( ( 'parent' ) ) | ( ( 'source' ) ) | ( ( 'child' ) ) )
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
                    // InternalEvoVariableDsl.g:287:2: ( ( 'parent' ) )
                    {
                    // InternalEvoVariableDsl.g:287:2: ( ( 'parent' ) )
                    // InternalEvoVariableDsl.g:288:3: ( 'parent' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:289:3: ( 'parent' )
                    // InternalEvoVariableDsl.g:289:4: 'parent'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:293:2: ( ( 'source' ) )
                    {
                    // InternalEvoVariableDsl.g:293:2: ( ( 'source' ) )
                    // InternalEvoVariableDsl.g:294:3: ( 'source' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:295:3: ( 'source' )
                    // InternalEvoVariableDsl.g:295:4: 'source'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:299:2: ( ( 'child' ) )
                    {
                    // InternalEvoVariableDsl.g:299:2: ( ( 'child' ) )
                    // InternalEvoVariableDsl.g:300:3: ( 'child' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:301:3: ( 'child' )
                    // InternalEvoVariableDsl.g:301:4: 'child'
                    {
                    match(input,13,FOLLOW_2); 

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


    // $ANTLR start "rule__EvoFeatureVariable__Group__0"
    // InternalEvoVariableDsl.g:309:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:313:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoVariableDsl.g:314:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
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
    // InternalEvoVariableDsl.g:321:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:325:1: ( ( 'feature' ) )
            // InternalEvoVariableDsl.g:326:1: ( 'feature' )
            {
            // InternalEvoVariableDsl.g:326:1: ( 'feature' )
            // InternalEvoVariableDsl.g:327:2: 'feature'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:336:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:340:1: ( rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 )
            // InternalEvoVariableDsl.g:341:2: rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalEvoVariableDsl.g:348:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:352:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:353:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:353:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:354:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:355:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:355:3: rule__EvoFeatureVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:363:1: rule__EvoFeatureVariable__Group__2 : rule__EvoFeatureVariable__Group__2__Impl ;
    public final void rule__EvoFeatureVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:367:1: ( rule__EvoFeatureVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:368:2: rule__EvoFeatureVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:374:1: rule__EvoFeatureVariable__Group__2__Impl : ( ( rule__EvoFeatureVariable__Group_2__0 )? ) ;
    public final void rule__EvoFeatureVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:378:1: ( ( ( rule__EvoFeatureVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:379:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:379:1: ( ( rule__EvoFeatureVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:380:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:381:2: ( rule__EvoFeatureVariable__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:381:3: rule__EvoFeatureVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:390:1: rule__EvoFeatureVariable__Group_2__0 : rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 ;
    public final void rule__EvoFeatureVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:394:1: ( rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:395:2: rule__EvoFeatureVariable__Group_2__0__Impl rule__EvoFeatureVariable__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalEvoVariableDsl.g:402:1: rule__EvoFeatureVariable__Group_2__0__Impl : ( '.' ) ;
    public final void rule__EvoFeatureVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:406:1: ( ( '.' ) )
            // InternalEvoVariableDsl.g:407:1: ( '.' )
            {
            // InternalEvoVariableDsl.g:407:1: ( '.' )
            // InternalEvoVariableDsl.g:408:2: '.'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:417:1: rule__EvoFeatureVariable__Group_2__1 : rule__EvoFeatureVariable__Group_2__1__Impl ;
    public final void rule__EvoFeatureVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:421:1: ( rule__EvoFeatureVariable__Group_2__1__Impl )
            // InternalEvoVariableDsl.g:422:2: rule__EvoFeatureVariable__Group_2__1__Impl
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
    // InternalEvoVariableDsl.g:428:1: rule__EvoFeatureVariable__Group_2__1__Impl : ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:432:1: ( ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:433:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:433:1: ( ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:434:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1()); 
            // InternalEvoVariableDsl.g:435:2: ( rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 )
            // InternalEvoVariableDsl.g:435:3: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1
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
    // InternalEvoVariableDsl.g:444:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:448:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoVariableDsl.g:449:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
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
    // InternalEvoVariableDsl.g:456:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:460:1: ( ( 'group' ) )
            // InternalEvoVariableDsl.g:461:1: ( 'group' )
            {
            // InternalEvoVariableDsl.g:461:1: ( 'group' )
            // InternalEvoVariableDsl.g:462:2: 'group'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:471:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:475:1: ( rule__EvoGroupVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:476:2: rule__EvoGroupVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:482:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:486:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:487:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:487:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:488:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:489:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:489:3: rule__EvoGroupVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:498:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:502:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoVariableDsl.g:503:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
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
    // InternalEvoVariableDsl.g:510:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:514:1: ( ( 'set' ) )
            // InternalEvoVariableDsl.g:515:1: ( 'set' )
            {
            // InternalEvoVariableDsl.g:515:1: ( 'set' )
            // InternalEvoVariableDsl.g:516:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:525:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:529:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoVariableDsl.g:530:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalEvoVariableDsl.g:537:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:541:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:542:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:542:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:543:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:544:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:544:3: rule__EvoSetVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:552:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:556:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:557:2: rule__EvoSetVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:563:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:567:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:568:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:568:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:569:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:570:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:570:3: rule__EvoSetVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:579:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:583:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:584:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
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
    // InternalEvoVariableDsl.g:591:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:595:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:596:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:596:1: ( '(' )
            // InternalEvoVariableDsl.g:597:2: '('
            {
             before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:606:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:610:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:611:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalEvoVariableDsl.g:618:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:622:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:623:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:623:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:624:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoVariableDsl.g:625:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoVariableDsl.g:625:3: rule__EvoSetVariable__ElementsAssignment_2_1
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
    // InternalEvoVariableDsl.g:633:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:637:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoVariableDsl.g:638:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalEvoVariableDsl.g:645:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:649:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoVariableDsl.g:650:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoVariableDsl.g:650:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoVariableDsl.g:651:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoVariableDsl.g:652:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoVariableDsl.g:652:3: rule__EvoSetVariable__Group_2_2__0
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
    // InternalEvoVariableDsl.g:660:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:664:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoVariableDsl.g:665:2: rule__EvoSetVariable__Group_2__3__Impl
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
    // InternalEvoVariableDsl.g:671:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:675:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:676:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:676:1: ( ')' )
            // InternalEvoVariableDsl.g:677:2: ')'
            {
             before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:687:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:691:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoVariableDsl.g:692:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
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
    // InternalEvoVariableDsl.g:699:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:703:1: ( ( ',' ) )
            // InternalEvoVariableDsl.g:704:1: ( ',' )
            {
            // InternalEvoVariableDsl.g:704:1: ( ',' )
            // InternalEvoVariableDsl.g:705:2: ','
            {
             before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:714:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:718:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoVariableDsl.g:719:2: rule__EvoSetVariable__Group_2_2__1__Impl
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
    // InternalEvoVariableDsl.g:725:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:729:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoVariableDsl.g:730:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoVariableDsl.g:730:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoVariableDsl.g:731:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoVariableDsl.g:732:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoVariableDsl.g:732:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
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
    // InternalEvoVariableDsl.g:741:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:745:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoVariableDsl.g:746:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
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
    // InternalEvoVariableDsl.g:753:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:757:1: ( ( 'mapping' ) )
            // InternalEvoVariableDsl.g:758:1: ( 'mapping' )
            {
            // InternalEvoVariableDsl.g:758:1: ( 'mapping' )
            // InternalEvoVariableDsl.g:759:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:768:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:772:1: ( rule__EvoMappingVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:773:2: rule__EvoMappingVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:779:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:783:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:784:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:784:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:785:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:786:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:786:3: rule__EvoMappingVariable__NameAssignment_1
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


    // $ANTLR start "rule__EvoConfigurationVariable__Group__0"
    // InternalEvoVariableDsl.g:795:1: rule__EvoConfigurationVariable__Group__0 : rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 ;
    public final void rule__EvoConfigurationVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:799:1: ( rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 )
            // InternalEvoVariableDsl.g:800:2: rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvoVariableDsl.g:807:1: rule__EvoConfigurationVariable__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__EvoConfigurationVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:811:1: ( ( 'configuration' ) )
            // InternalEvoVariableDsl.g:812:1: ( 'configuration' )
            {
            // InternalEvoVariableDsl.g:812:1: ( 'configuration' )
            // InternalEvoVariableDsl.g:813:2: 'configuration'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:822:1: rule__EvoConfigurationVariable__Group__1 : rule__EvoConfigurationVariable__Group__1__Impl ;
    public final void rule__EvoConfigurationVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:826:1: ( rule__EvoConfigurationVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:827:2: rule__EvoConfigurationVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalEvoVariableDsl.g:833:1: rule__EvoConfigurationVariable__Group__1__Impl : ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:837:1: ( ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:838:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:838:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:839:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:840:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:840:3: rule__EvoConfigurationVariable__NameAssignment_1
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


    // $ANTLR start "rule__Model__VariablesAssignment"
    // InternalEvoVariableDsl.g:849:1: rule__Model__VariablesAssignment : ( ruleEvoVariable ) ;
    public final void rule__Model__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:853:1: ( ( ruleEvoVariable ) )
            // InternalEvoVariableDsl.g:854:2: ( ruleEvoVariable )
            {
            // InternalEvoVariableDsl.g:854:2: ( ruleEvoVariable )
            // InternalEvoVariableDsl.g:855:3: ruleEvoVariable
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


    // $ANTLR start "rule__EvoFeatureVariable__NameAssignment_1"
    // InternalEvoVariableDsl.g:864:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:868:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:869:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:869:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:870:3: RULE_ID
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
    // InternalEvoVariableDsl.g:879:1: rule__EvoFeatureVariable__FeatureTypeAssignment_2_1 : ( ruleEvoFeatureVariableType ) ;
    public final void rule__EvoFeatureVariable__FeatureTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:883:1: ( ( ruleEvoFeatureVariableType ) )
            // InternalEvoVariableDsl.g:884:2: ( ruleEvoFeatureVariableType )
            {
            // InternalEvoVariableDsl.g:884:2: ( ruleEvoFeatureVariableType )
            // InternalEvoVariableDsl.g:885:3: ruleEvoFeatureVariableType
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
    // InternalEvoVariableDsl.g:894:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:898:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:899:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:899:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:900:3: RULE_ID
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
    // InternalEvoVariableDsl.g:909:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:913:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:914:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:914:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:915:3: RULE_ID
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
    // InternalEvoVariableDsl.g:924:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:928:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:929:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:929:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:930:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoVariableDsl.g:931:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:932:4: RULE_ID
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
    // InternalEvoVariableDsl.g:943:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:947:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:948:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:948:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:949:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoVariableDsl.g:950:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:951:4: RULE_ID
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
    // InternalEvoVariableDsl.g:962:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:966:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:967:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:967:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:968:3: RULE_ID
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


    // $ANTLR start "rule__EvoConfigurationVariable__NameAssignment_1"
    // InternalEvoVariableDsl.g:977:1: rule__EvoConfigurationVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoConfigurationVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:981:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:982:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:982:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:983:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000634002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}