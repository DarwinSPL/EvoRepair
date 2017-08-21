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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parentOf'", "'siblingOf'", "'childOf'", "'feature'", "'group'", "'value'", "'='", "'set'", "'('", "')'", "','", "'mapping'", "'configuration'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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



    // $ANTLR start "entryRuleEvoVariableModel"
    // InternalEvoVariableDsl.g:53:1: entryRuleEvoVariableModel : ruleEvoVariableModel EOF ;
    public final void entryRuleEvoVariableModel() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:54:1: ( ruleEvoVariableModel EOF )
            // InternalEvoVariableDsl.g:55:1: ruleEvoVariableModel EOF
            {
             before(grammarAccess.getEvoVariableModelRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoVariableModel();

            state._fsp--;

             after(grammarAccess.getEvoVariableModelRule()); 
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
    // $ANTLR end "entryRuleEvoVariableModel"


    // $ANTLR start "ruleEvoVariableModel"
    // InternalEvoVariableDsl.g:62:1: ruleEvoVariableModel : ( ( rule__EvoVariableModel__VariablesAssignment )* ) ;
    public final void ruleEvoVariableModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:66:2: ( ( ( rule__EvoVariableModel__VariablesAssignment )* ) )
            // InternalEvoVariableDsl.g:67:2: ( ( rule__EvoVariableModel__VariablesAssignment )* )
            {
            // InternalEvoVariableDsl.g:67:2: ( ( rule__EvoVariableModel__VariablesAssignment )* )
            // InternalEvoVariableDsl.g:68:3: ( rule__EvoVariableModel__VariablesAssignment )*
            {
             before(grammarAccess.getEvoVariableModelAccess().getVariablesAssignment()); 
            // InternalEvoVariableDsl.g:69:3: ( rule__EvoVariableModel__VariablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==18||(LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:69:4: rule__EvoVariableModel__VariablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EvoVariableModel__VariablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEvoVariableModelAccess().getVariablesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoVariableModel"


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
            case 23:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 22:
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
    // InternalEvoVariableDsl.g:282:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:286:1: ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) )
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
                    // InternalEvoVariableDsl.g:287:2: ( ( 'parentOf' ) )
                    {
                    // InternalEvoVariableDsl.g:287:2: ( ( 'parentOf' ) )
                    // InternalEvoVariableDsl.g:288:3: ( 'parentOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:289:3: ( 'parentOf' )
                    // InternalEvoVariableDsl.g:289:4: 'parentOf'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:293:2: ( ( 'siblingOf' ) )
                    {
                    // InternalEvoVariableDsl.g:293:2: ( ( 'siblingOf' ) )
                    // InternalEvoVariableDsl.g:294:3: ( 'siblingOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:295:3: ( 'siblingOf' )
                    // InternalEvoVariableDsl.g:295:4: 'siblingOf'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:299:2: ( ( 'childOf' ) )
                    {
                    // InternalEvoVariableDsl.g:299:2: ( ( 'childOf' ) )
                    // InternalEvoVariableDsl.g:300:3: ( 'childOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:301:3: ( 'childOf' )
                    // InternalEvoVariableDsl.g:301:4: 'childOf'
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
    // InternalEvoVariableDsl.g:336:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:340:1: ( rule__EvoFeatureVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:341:2: rule__EvoFeatureVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:347:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:351:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:352:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:352:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:353:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:354:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:354:3: rule__EvoFeatureVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:363:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:367:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoVariableDsl.g:368:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
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
    // InternalEvoVariableDsl.g:375:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:379:1: ( ( 'group' ) )
            // InternalEvoVariableDsl.g:380:1: ( 'group' )
            {
            // InternalEvoVariableDsl.g:380:1: ( 'group' )
            // InternalEvoVariableDsl.g:381:2: 'group'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:390:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:394:1: ( rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 )
            // InternalEvoVariableDsl.g:395:2: rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalEvoVariableDsl.g:402:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:406:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:407:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:407:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:408:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:409:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:409:3: rule__EvoGroupVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:417:1: rule__EvoGroupVariable__Group__2 : rule__EvoGroupVariable__Group__2__Impl ;
    public final void rule__EvoGroupVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:421:1: ( rule__EvoGroupVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:422:2: rule__EvoGroupVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:428:1: rule__EvoGroupVariable__Group__2__Impl : ( ( rule__EvoGroupVariable__Group_2__0 )? ) ;
    public final void rule__EvoGroupVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:432:1: ( ( ( rule__EvoGroupVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:433:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:433:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:434:2: ( rule__EvoGroupVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:435:2: ( rule__EvoGroupVariable__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:435:3: rule__EvoGroupVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:444:1: rule__EvoGroupVariable__Group_2__0 : rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 ;
    public final void rule__EvoGroupVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:448:1: ( rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:449:2: rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalEvoVariableDsl.g:456:1: rule__EvoGroupVariable__Group_2__0__Impl : ( 'value' ) ;
    public final void rule__EvoGroupVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:460:1: ( ( 'value' ) )
            // InternalEvoVariableDsl.g:461:1: ( 'value' )
            {
            // InternalEvoVariableDsl.g:461:1: ( 'value' )
            // InternalEvoVariableDsl.g:462:2: 'value'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:471:1: rule__EvoGroupVariable__Group_2__1 : rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 ;
    public final void rule__EvoGroupVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:475:1: ( rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:476:2: rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalEvoVariableDsl.g:483:1: rule__EvoGroupVariable__Group_2__1__Impl : ( '=' ) ;
    public final void rule__EvoGroupVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:487:1: ( ( '=' ) )
            // InternalEvoVariableDsl.g:488:1: ( '=' )
            {
            // InternalEvoVariableDsl.g:488:1: ( '=' )
            // InternalEvoVariableDsl.g:489:2: '='
            {
             before(grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:498:1: rule__EvoGroupVariable__Group_2__2 : rule__EvoGroupVariable__Group_2__2__Impl ;
    public final void rule__EvoGroupVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:502:1: ( rule__EvoGroupVariable__Group_2__2__Impl )
            // InternalEvoVariableDsl.g:503:2: rule__EvoGroupVariable__Group_2__2__Impl
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
    // InternalEvoVariableDsl.g:509:1: rule__EvoGroupVariable__Group_2__2__Impl : ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) ;
    public final void rule__EvoGroupVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:513:1: ( ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) )
            // InternalEvoVariableDsl.g:514:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            {
            // InternalEvoVariableDsl.g:514:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            // InternalEvoVariableDsl.g:515:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupAssignment_2_2()); 
            // InternalEvoVariableDsl.g:516:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            // InternalEvoVariableDsl.g:516:3: rule__EvoGroupVariable__GroupAssignment_2_2
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
    // InternalEvoVariableDsl.g:525:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:529:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoVariableDsl.g:530:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
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
    // InternalEvoVariableDsl.g:537:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:541:1: ( ( 'set' ) )
            // InternalEvoVariableDsl.g:542:1: ( 'set' )
            {
            // InternalEvoVariableDsl.g:542:1: ( 'set' )
            // InternalEvoVariableDsl.g:543:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:552:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:556:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoVariableDsl.g:557:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
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
    // InternalEvoVariableDsl.g:564:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:568:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:569:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:569:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:570:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:571:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:571:3: rule__EvoSetVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:579:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:583:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:584:2: rule__EvoSetVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:590:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:594:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:595:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:595:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:596:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:597:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:597:3: rule__EvoSetVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:606:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:610:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:611:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
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
    // InternalEvoVariableDsl.g:618:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:622:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:623:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:623:1: ( '(' )
            // InternalEvoVariableDsl.g:624:2: '('
            {
             before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:633:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:637:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:638:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
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
    // InternalEvoVariableDsl.g:645:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:649:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:650:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:650:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:651:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoVariableDsl.g:652:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoVariableDsl.g:652:3: rule__EvoSetVariable__ElementsAssignment_2_1
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
    // InternalEvoVariableDsl.g:660:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:664:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoVariableDsl.g:665:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
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
    // InternalEvoVariableDsl.g:672:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:676:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoVariableDsl.g:677:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoVariableDsl.g:677:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoVariableDsl.g:678:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoVariableDsl.g:679:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoVariableDsl.g:679:3: rule__EvoSetVariable__Group_2_2__0
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
    // InternalEvoVariableDsl.g:687:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:691:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoVariableDsl.g:692:2: rule__EvoSetVariable__Group_2__3__Impl
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
    // InternalEvoVariableDsl.g:698:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:702:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:703:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:703:1: ( ')' )
            // InternalEvoVariableDsl.g:704:2: ')'
            {
             before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:714:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:718:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoVariableDsl.g:719:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
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
    // InternalEvoVariableDsl.g:726:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:730:1: ( ( ',' ) )
            // InternalEvoVariableDsl.g:731:1: ( ',' )
            {
            // InternalEvoVariableDsl.g:731:1: ( ',' )
            // InternalEvoVariableDsl.g:732:2: ','
            {
             before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:741:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:745:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoVariableDsl.g:746:2: rule__EvoSetVariable__Group_2_2__1__Impl
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
    // InternalEvoVariableDsl.g:752:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:756:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoVariableDsl.g:757:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoVariableDsl.g:757:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoVariableDsl.g:758:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoVariableDsl.g:759:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoVariableDsl.g:759:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
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
    // InternalEvoVariableDsl.g:768:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:772:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoVariableDsl.g:773:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
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
    // InternalEvoVariableDsl.g:780:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:784:1: ( ( 'mapping' ) )
            // InternalEvoVariableDsl.g:785:1: ( 'mapping' )
            {
            // InternalEvoVariableDsl.g:785:1: ( 'mapping' )
            // InternalEvoVariableDsl.g:786:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:795:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2 ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:799:1: ( rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2 )
            // InternalEvoVariableDsl.g:800:2: rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalEvoVariableDsl.g:807:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:811:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:812:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:812:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:813:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:814:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:814:3: rule__EvoMappingVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:822:1: rule__EvoMappingVariable__Group__2 : rule__EvoMappingVariable__Group__2__Impl ;
    public final void rule__EvoMappingVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:826:1: ( rule__EvoMappingVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:827:2: rule__EvoMappingVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:833:1: rule__EvoMappingVariable__Group__2__Impl : ( ( rule__EvoMappingVariable__Group_2__0 )? ) ;
    public final void rule__EvoMappingVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:837:1: ( ( ( rule__EvoMappingVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:838:1: ( ( rule__EvoMappingVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:838:1: ( ( rule__EvoMappingVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:839:2: ( rule__EvoMappingVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoMappingVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:840:2: ( rule__EvoMappingVariable__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoVariableDsl.g:840:3: rule__EvoMappingVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:849:1: rule__EvoMappingVariable__Group_2__0 : rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1 ;
    public final void rule__EvoMappingVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:853:1: ( rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:854:2: rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalEvoVariableDsl.g:861:1: rule__EvoMappingVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoMappingVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:865:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:866:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:866:1: ( '(' )
            // InternalEvoVariableDsl.g:867:2: '('
            {
             before(grammarAccess.getEvoMappingVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:876:1: rule__EvoMappingVariable__Group_2__1 : rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2 ;
    public final void rule__EvoMappingVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:880:1: ( rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:881:2: rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalEvoVariableDsl.g:888:1: rule__EvoMappingVariable__Group_2__1__Impl : ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) ) ;
    public final void rule__EvoMappingVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:892:1: ( ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:893:1: ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:893:1: ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:894:2: ( rule__EvoMappingVariable__MappingAssignment_2_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingAssignment_2_1()); 
            // InternalEvoVariableDsl.g:895:2: ( rule__EvoMappingVariable__MappingAssignment_2_1 )
            // InternalEvoVariableDsl.g:895:3: rule__EvoMappingVariable__MappingAssignment_2_1
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
    // InternalEvoVariableDsl.g:903:1: rule__EvoMappingVariable__Group_2__2 : rule__EvoMappingVariable__Group_2__2__Impl ;
    public final void rule__EvoMappingVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:907:1: ( rule__EvoMappingVariable__Group_2__2__Impl )
            // InternalEvoVariableDsl.g:908:2: rule__EvoMappingVariable__Group_2__2__Impl
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
    // InternalEvoVariableDsl.g:914:1: rule__EvoMappingVariable__Group_2__2__Impl : ( ')' ) ;
    public final void rule__EvoMappingVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:918:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:919:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:919:1: ( ')' )
            // InternalEvoVariableDsl.g:920:2: ')'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getRightParenthesisKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:930:1: rule__EvoConfigurationVariable__Group__0 : rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 ;
    public final void rule__EvoConfigurationVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:934:1: ( rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 )
            // InternalEvoVariableDsl.g:935:2: rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1
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
    // InternalEvoVariableDsl.g:942:1: rule__EvoConfigurationVariable__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__EvoConfigurationVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:946:1: ( ( 'configuration' ) )
            // InternalEvoVariableDsl.g:947:1: ( 'configuration' )
            {
            // InternalEvoVariableDsl.g:947:1: ( 'configuration' )
            // InternalEvoVariableDsl.g:948:2: 'configuration'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:957:1: rule__EvoConfigurationVariable__Group__1 : rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2 ;
    public final void rule__EvoConfigurationVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:961:1: ( rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2 )
            // InternalEvoVariableDsl.g:962:2: rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalEvoVariableDsl.g:969:1: rule__EvoConfigurationVariable__Group__1__Impl : ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:973:1: ( ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:974:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:974:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:975:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:976:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:976:3: rule__EvoConfigurationVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:984:1: rule__EvoConfigurationVariable__Group__2 : rule__EvoConfigurationVariable__Group__2__Impl ;
    public final void rule__EvoConfigurationVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:988:1: ( rule__EvoConfigurationVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:989:2: rule__EvoConfigurationVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:995:1: rule__EvoConfigurationVariable__Group__2__Impl : ( ( rule__EvoConfigurationVariable__Group_2__0 )? ) ;
    public final void rule__EvoConfigurationVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:999:1: ( ( ( rule__EvoConfigurationVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:1000:1: ( ( rule__EvoConfigurationVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:1000:1: ( ( rule__EvoConfigurationVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:1001:2: ( rule__EvoConfigurationVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:1002:2: ( rule__EvoConfigurationVariable__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvoVariableDsl.g:1002:3: rule__EvoConfigurationVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:1011:1: rule__EvoConfigurationVariable__Group_2__0 : rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1 ;
    public final void rule__EvoConfigurationVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1015:1: ( rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:1016:2: rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalEvoVariableDsl.g:1023:1: rule__EvoConfigurationVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoConfigurationVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1027:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:1028:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:1028:1: ( '(' )
            // InternalEvoVariableDsl.g:1029:2: '('
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:1038:1: rule__EvoConfigurationVariable__Group_2__1 : rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2 ;
    public final void rule__EvoConfigurationVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1042:1: ( rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:1043:2: rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalEvoVariableDsl.g:1050:1: rule__EvoConfigurationVariable__Group_2__1__Impl : ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1054:1: ( ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:1055:1: ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:1055:1: ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:1056:2: ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationAssignment_2_1()); 
            // InternalEvoVariableDsl.g:1057:2: ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 )
            // InternalEvoVariableDsl.g:1057:3: rule__EvoConfigurationVariable__ConfigurationAssignment_2_1
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
    // InternalEvoVariableDsl.g:1065:1: rule__EvoConfigurationVariable__Group_2__2 : rule__EvoConfigurationVariable__Group_2__2__Impl ;
    public final void rule__EvoConfigurationVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1069:1: ( rule__EvoConfigurationVariable__Group_2__2__Impl )
            // InternalEvoVariableDsl.g:1070:2: rule__EvoConfigurationVariable__Group_2__2__Impl
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
    // InternalEvoVariableDsl.g:1076:1: rule__EvoConfigurationVariable__Group_2__2__Impl : ( ')' ) ;
    public final void rule__EvoConfigurationVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1080:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:1081:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:1081:1: ( ')' )
            // InternalEvoVariableDsl.g:1082:2: ')'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getRightParenthesisKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__EvoVariableModel__VariablesAssignment"
    // InternalEvoVariableDsl.g:1092:1: rule__EvoVariableModel__VariablesAssignment : ( ruleEvoVariable ) ;
    public final void rule__EvoVariableModel__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1096:1: ( ( ruleEvoVariable ) )
            // InternalEvoVariableDsl.g:1097:2: ( ruleEvoVariable )
            {
            // InternalEvoVariableDsl.g:1097:2: ( ruleEvoVariable )
            // InternalEvoVariableDsl.g:1098:3: ruleEvoVariable
            {
             before(grammarAccess.getEvoVariableModelAccess().getVariablesEvoVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoVariableModelAccess().getVariablesEvoVariableParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoVariableModel__VariablesAssignment"


    // $ANTLR start "rule__EvoFeatureVariable__NameAssignment_1"
    // InternalEvoVariableDsl.g:1107:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1111:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1112:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1112:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1113:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1122:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1126:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1127:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1127:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1128:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1137:1: rule__EvoGroupVariable__GroupAssignment_2_2 : ( ( RULE_STRING ) ) ;
    public final void rule__EvoGroupVariable__GroupAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1141:1: ( ( ( RULE_STRING ) ) )
            // InternalEvoVariableDsl.g:1142:2: ( ( RULE_STRING ) )
            {
            // InternalEvoVariableDsl.g:1142:2: ( ( RULE_STRING ) )
            // InternalEvoVariableDsl.g:1143:3: ( RULE_STRING )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0()); 
            // InternalEvoVariableDsl.g:1144:3: ( RULE_STRING )
            // InternalEvoVariableDsl.g:1145:4: RULE_STRING
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
    // InternalEvoVariableDsl.g:1156:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1160:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1161:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1161:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1162:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1171:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1175:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1176:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1176:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1177:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoVariableDsl.g:1178:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1179:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1190:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1194:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1195:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1195:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1196:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoVariableDsl.g:1197:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1198:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1209:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1213:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1214:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1214:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1215:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1224:1: rule__EvoMappingVariable__MappingAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EvoMappingVariable__MappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1228:1: ( ( RULE_STRING ) )
            // InternalEvoVariableDsl.g:1229:2: ( RULE_STRING )
            {
            // InternalEvoVariableDsl.g:1229:2: ( RULE_STRING )
            // InternalEvoVariableDsl.g:1230:3: RULE_STRING
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
    // InternalEvoVariableDsl.g:1239:1: rule__EvoConfigurationVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoConfigurationVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1243:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1244:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1244:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1245:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1254:1: rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EvoConfigurationVariable__ConfigurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1258:1: ( ( RULE_STRING ) )
            // InternalEvoVariableDsl.g:1259:2: ( RULE_STRING )
            {
            // InternalEvoVariableDsl.g:1259:2: ( RULE_STRING )
            // InternalEvoVariableDsl.g:1260:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C4C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});

}