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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parentOf'", "'siblingOf'", "'childOf'", "'feature'", "'('", "')'", "','", "'group'", "'set'", "'mapping'", "'configuration'"
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

                if ( (LA1_0==14||(LA1_0>=18 && LA1_0<=21)) ) {
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


    // $ANTLR start "entryRuleEvoFeatureRelation"
    // InternalEvoVariableDsl.g:128:1: entryRuleEvoFeatureRelation : ruleEvoFeatureRelation EOF ;
    public final void entryRuleEvoFeatureRelation() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:129:1: ( ruleEvoFeatureRelation EOF )
            // InternalEvoVariableDsl.g:130:1: ruleEvoFeatureRelation EOF
            {
             before(grammarAccess.getEvoFeatureRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoFeatureRelation();

            state._fsp--;

             after(grammarAccess.getEvoFeatureRelationRule()); 
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
    // $ANTLR end "entryRuleEvoFeatureRelation"


    // $ANTLR start "ruleEvoFeatureRelation"
    // InternalEvoVariableDsl.g:137:1: ruleEvoFeatureRelation : ( ( rule__EvoFeatureRelation__Group__0 ) ) ;
    public final void ruleEvoFeatureRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:141:2: ( ( ( rule__EvoFeatureRelation__Group__0 ) ) )
            // InternalEvoVariableDsl.g:142:2: ( ( rule__EvoFeatureRelation__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:142:2: ( ( rule__EvoFeatureRelation__Group__0 ) )
            // InternalEvoVariableDsl.g:143:3: ( rule__EvoFeatureRelation__Group__0 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getGroup()); 
            // InternalEvoVariableDsl.g:144:3: ( rule__EvoFeatureRelation__Group__0 )
            // InternalEvoVariableDsl.g:144:4: rule__EvoFeatureRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvoFeatureRelation"


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


    // $ANTLR start "entryRuleEvoConfigurationVariable"
    // InternalEvoVariableDsl.g:228:1: entryRuleEvoConfigurationVariable : ruleEvoConfigurationVariable EOF ;
    public final void entryRuleEvoConfigurationVariable() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:229:1: ( ruleEvoConfigurationVariable EOF )
            // InternalEvoVariableDsl.g:230:1: ruleEvoConfigurationVariable EOF
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
    // InternalEvoVariableDsl.g:237:1: ruleEvoConfigurationVariable : ( ( rule__EvoConfigurationVariable__Group__0 ) ) ;
    public final void ruleEvoConfigurationVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:241:2: ( ( ( rule__EvoConfigurationVariable__Group__0 ) ) )
            // InternalEvoVariableDsl.g:242:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:242:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            // InternalEvoVariableDsl.g:243:3: ( rule__EvoConfigurationVariable__Group__0 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getGroup()); 
            // InternalEvoVariableDsl.g:244:3: ( rule__EvoConfigurationVariable__Group__0 )
            // InternalEvoVariableDsl.g:244:4: rule__EvoConfigurationVariable__Group__0
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
    // InternalEvoVariableDsl.g:253:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:257:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:258:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:258:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:259:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:260:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoVariableDsl.g:260:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:268:1: rule__EvoVariable__Alternatives : ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:272:1: ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
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
                    // InternalEvoVariableDsl.g:273:2: ( ruleEvoConfigurationVariable )
                    {
                    // InternalEvoVariableDsl.g:273:2: ( ruleEvoConfigurationVariable )
                    // InternalEvoVariableDsl.g:274:3: ruleEvoConfigurationVariable
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
                    // InternalEvoVariableDsl.g:279:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoVariableDsl.g:279:2: ( ruleEvoFeatureVariable )
                    // InternalEvoVariableDsl.g:280:3: ruleEvoFeatureVariable
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
                    // InternalEvoVariableDsl.g:285:2: ( ruleEvoGroupVariable )
                    {
                    // InternalEvoVariableDsl.g:285:2: ( ruleEvoGroupVariable )
                    // InternalEvoVariableDsl.g:286:3: ruleEvoGroupVariable
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
                    // InternalEvoVariableDsl.g:291:2: ( ruleEvoSetVariable )
                    {
                    // InternalEvoVariableDsl.g:291:2: ( ruleEvoSetVariable )
                    // InternalEvoVariableDsl.g:292:3: ruleEvoSetVariable
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
                    // InternalEvoVariableDsl.g:297:2: ( ruleEvoMappingVariable )
                    {
                    // InternalEvoVariableDsl.g:297:2: ( ruleEvoMappingVariable )
                    // InternalEvoVariableDsl.g:298:3: ruleEvoMappingVariable
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
    // InternalEvoVariableDsl.g:307:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:311:1: ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) )
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
                    // InternalEvoVariableDsl.g:312:2: ( ( 'parentOf' ) )
                    {
                    // InternalEvoVariableDsl.g:312:2: ( ( 'parentOf' ) )
                    // InternalEvoVariableDsl.g:313:3: ( 'parentOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:314:3: ( 'parentOf' )
                    // InternalEvoVariableDsl.g:314:4: 'parentOf'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:318:2: ( ( 'siblingOf' ) )
                    {
                    // InternalEvoVariableDsl.g:318:2: ( ( 'siblingOf' ) )
                    // InternalEvoVariableDsl.g:319:3: ( 'siblingOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:320:3: ( 'siblingOf' )
                    // InternalEvoVariableDsl.g:320:4: 'siblingOf'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:324:2: ( ( 'childOf' ) )
                    {
                    // InternalEvoVariableDsl.g:324:2: ( ( 'childOf' ) )
                    // InternalEvoVariableDsl.g:325:3: ( 'childOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:326:3: ( 'childOf' )
                    // InternalEvoVariableDsl.g:326:4: 'childOf'
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
    // InternalEvoVariableDsl.g:334:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:338:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoVariableDsl.g:339:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
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
    // InternalEvoVariableDsl.g:346:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:350:1: ( ( 'feature' ) )
            // InternalEvoVariableDsl.g:351:1: ( 'feature' )
            {
            // InternalEvoVariableDsl.g:351:1: ( 'feature' )
            // InternalEvoVariableDsl.g:352:2: 'feature'
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
    // InternalEvoVariableDsl.g:361:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:365:1: ( rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 )
            // InternalEvoVariableDsl.g:366:2: rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2
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
    // InternalEvoVariableDsl.g:373:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:377:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:378:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:378:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:379:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:380:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:380:3: rule__EvoFeatureVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:388:1: rule__EvoFeatureVariable__Group__2 : rule__EvoFeatureVariable__Group__2__Impl ;
    public final void rule__EvoFeatureVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:392:1: ( rule__EvoFeatureVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:393:2: rule__EvoFeatureVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:399:1: rule__EvoFeatureVariable__Group__2__Impl : ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? ) ;
    public final void rule__EvoFeatureVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:403:1: ( ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? ) )
            // InternalEvoVariableDsl.g:404:1: ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? )
            {
            // InternalEvoVariableDsl.g:404:1: ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? )
            // InternalEvoVariableDsl.g:405:2: ( rule__EvoFeatureVariable__RelationAssignment_2 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getRelationAssignment_2()); 
            // InternalEvoVariableDsl.g:406:2: ( rule__EvoFeatureVariable__RelationAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:406:3: rule__EvoFeatureVariable__RelationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFeatureVariable__RelationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFeatureVariableAccess().getRelationAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvoFeatureRelation__Group__0"
    // InternalEvoVariableDsl.g:415:1: rule__EvoFeatureRelation__Group__0 : rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1 ;
    public final void rule__EvoFeatureRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:419:1: ( rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1 )
            // InternalEvoVariableDsl.g:420:2: rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EvoFeatureRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__0"


    // $ANTLR start "rule__EvoFeatureRelation__Group__0__Impl"
    // InternalEvoVariableDsl.g:427:1: rule__EvoFeatureRelation__Group__0__Impl : ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) ) ;
    public final void rule__EvoFeatureRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:431:1: ( ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) ) )
            // InternalEvoVariableDsl.g:432:1: ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) )
            {
            // InternalEvoVariableDsl.g:432:1: ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) )
            // InternalEvoVariableDsl.g:433:2: ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeAssignment_0()); 
            // InternalEvoVariableDsl.g:434:2: ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 )
            // InternalEvoVariableDsl.g:434:3: rule__EvoFeatureRelation__FeatureTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__FeatureTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__0__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__1"
    // InternalEvoVariableDsl.g:442:1: rule__EvoFeatureRelation__Group__1 : rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2 ;
    public final void rule__EvoFeatureRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:446:1: ( rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2 )
            // InternalEvoVariableDsl.g:447:2: rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EvoFeatureRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__1"


    // $ANTLR start "rule__EvoFeatureRelation__Group__1__Impl"
    // InternalEvoVariableDsl.g:454:1: rule__EvoFeatureRelation__Group__1__Impl : ( '(' ) ;
    public final void rule__EvoFeatureRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:458:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:459:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:459:1: ( '(' )
            // InternalEvoVariableDsl.g:460:2: '('
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__1__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__2"
    // InternalEvoVariableDsl.g:469:1: rule__EvoFeatureRelation__Group__2 : rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3 ;
    public final void rule__EvoFeatureRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:473:1: ( rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3 )
            // InternalEvoVariableDsl.g:474:2: rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__EvoFeatureRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__2"


    // $ANTLR start "rule__EvoFeatureRelation__Group__2__Impl"
    // InternalEvoVariableDsl.g:481:1: rule__EvoFeatureRelation__Group__2__Impl : ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) ) ;
    public final void rule__EvoFeatureRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:485:1: ( ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) ) )
            // InternalEvoVariableDsl.g:486:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) )
            {
            // InternalEvoVariableDsl.g:486:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) )
            // InternalEvoVariableDsl.g:487:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_2()); 
            // InternalEvoVariableDsl.g:488:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 )
            // InternalEvoVariableDsl.g:488:3: rule__EvoFeatureRelation__RelatedFeaturesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__RelatedFeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__2__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__3"
    // InternalEvoVariableDsl.g:496:1: rule__EvoFeatureRelation__Group__3 : rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4 ;
    public final void rule__EvoFeatureRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:500:1: ( rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4 )
            // InternalEvoVariableDsl.g:501:2: rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__EvoFeatureRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__3"


    // $ANTLR start "rule__EvoFeatureRelation__Group__3__Impl"
    // InternalEvoVariableDsl.g:508:1: rule__EvoFeatureRelation__Group__3__Impl : ( ( rule__EvoFeatureRelation__Group_3__0 )? ) ;
    public final void rule__EvoFeatureRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:512:1: ( ( ( rule__EvoFeatureRelation__Group_3__0 )? ) )
            // InternalEvoVariableDsl.g:513:1: ( ( rule__EvoFeatureRelation__Group_3__0 )? )
            {
            // InternalEvoVariableDsl.g:513:1: ( ( rule__EvoFeatureRelation__Group_3__0 )? )
            // InternalEvoVariableDsl.g:514:2: ( rule__EvoFeatureRelation__Group_3__0 )?
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getGroup_3()); 
            // InternalEvoVariableDsl.g:515:2: ( rule__EvoFeatureRelation__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:515:3: rule__EvoFeatureRelation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFeatureRelation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFeatureRelationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__3__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__4"
    // InternalEvoVariableDsl.g:523:1: rule__EvoFeatureRelation__Group__4 : rule__EvoFeatureRelation__Group__4__Impl ;
    public final void rule__EvoFeatureRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:527:1: ( rule__EvoFeatureRelation__Group__4__Impl )
            // InternalEvoVariableDsl.g:528:2: rule__EvoFeatureRelation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__4"


    // $ANTLR start "rule__EvoFeatureRelation__Group__4__Impl"
    // InternalEvoVariableDsl.g:534:1: rule__EvoFeatureRelation__Group__4__Impl : ( ')' ) ;
    public final void rule__EvoFeatureRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:538:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:539:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:539:1: ( ')' )
            // InternalEvoVariableDsl.g:540:2: ')'
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group__4__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__0"
    // InternalEvoVariableDsl.g:550:1: rule__EvoFeatureRelation__Group_3__0 : rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1 ;
    public final void rule__EvoFeatureRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:554:1: ( rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1 )
            // InternalEvoVariableDsl.g:555:2: rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__EvoFeatureRelation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__0"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__0__Impl"
    // InternalEvoVariableDsl.g:562:1: rule__EvoFeatureRelation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EvoFeatureRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:566:1: ( ( ',' ) )
            // InternalEvoVariableDsl.g:567:1: ( ',' )
            {
            // InternalEvoVariableDsl.g:567:1: ( ',' )
            // InternalEvoVariableDsl.g:568:2: ','
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__0__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__1"
    // InternalEvoVariableDsl.g:577:1: rule__EvoFeatureRelation__Group_3__1 : rule__EvoFeatureRelation__Group_3__1__Impl ;
    public final void rule__EvoFeatureRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:581:1: ( rule__EvoFeatureRelation__Group_3__1__Impl )
            // InternalEvoVariableDsl.g:582:2: rule__EvoFeatureRelation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__1"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__1__Impl"
    // InternalEvoVariableDsl.g:588:1: rule__EvoFeatureRelation__Group_3__1__Impl : ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) ) ;
    public final void rule__EvoFeatureRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:592:1: ( ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) ) )
            // InternalEvoVariableDsl.g:593:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) )
            {
            // InternalEvoVariableDsl.g:593:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) )
            // InternalEvoVariableDsl.g:594:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_3_1()); 
            // InternalEvoVariableDsl.g:595:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 )
            // InternalEvoVariableDsl.g:595:3: rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__1__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group__0"
    // InternalEvoVariableDsl.g:604:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:608:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoVariableDsl.g:609:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
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
    // InternalEvoVariableDsl.g:616:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:620:1: ( ( 'group' ) )
            // InternalEvoVariableDsl.g:621:1: ( 'group' )
            {
            // InternalEvoVariableDsl.g:621:1: ( 'group' )
            // InternalEvoVariableDsl.g:622:2: 'group'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:631:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:635:1: ( rule__EvoGroupVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:636:2: rule__EvoGroupVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:642:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:646:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:647:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:647:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:648:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:649:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:649:3: rule__EvoGroupVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:658:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:662:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoVariableDsl.g:663:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
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
    // InternalEvoVariableDsl.g:670:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:674:1: ( ( 'set' ) )
            // InternalEvoVariableDsl.g:675:1: ( 'set' )
            {
            // InternalEvoVariableDsl.g:675:1: ( 'set' )
            // InternalEvoVariableDsl.g:676:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:685:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:689:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoVariableDsl.g:690:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalEvoVariableDsl.g:697:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:701:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:702:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:702:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:703:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:704:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:704:3: rule__EvoSetVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:712:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:716:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:717:2: rule__EvoSetVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:723:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:727:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:728:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:728:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:729:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:730:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoVariableDsl.g:730:3: rule__EvoSetVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:739:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:743:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:744:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
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
    // InternalEvoVariableDsl.g:751:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:755:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:756:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:756:1: ( '(' )
            // InternalEvoVariableDsl.g:757:2: '('
            {
             before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:766:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:770:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:771:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
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
    // InternalEvoVariableDsl.g:778:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:782:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:783:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:783:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:784:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoVariableDsl.g:785:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoVariableDsl.g:785:3: rule__EvoSetVariable__ElementsAssignment_2_1
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
    // InternalEvoVariableDsl.g:793:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:797:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoVariableDsl.g:798:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
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
    // InternalEvoVariableDsl.g:805:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:809:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoVariableDsl.g:810:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoVariableDsl.g:810:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoVariableDsl.g:811:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoVariableDsl.g:812:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoVariableDsl.g:812:3: rule__EvoSetVariable__Group_2_2__0
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
    // InternalEvoVariableDsl.g:820:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:824:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoVariableDsl.g:825:2: rule__EvoSetVariable__Group_2__3__Impl
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
    // InternalEvoVariableDsl.g:831:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:835:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:836:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:836:1: ( ')' )
            // InternalEvoVariableDsl.g:837:2: ')'
            {
             before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:847:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:851:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoVariableDsl.g:852:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
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
    // InternalEvoVariableDsl.g:859:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:863:1: ( ( ',' ) )
            // InternalEvoVariableDsl.g:864:1: ( ',' )
            {
            // InternalEvoVariableDsl.g:864:1: ( ',' )
            // InternalEvoVariableDsl.g:865:2: ','
            {
             before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:874:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:878:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoVariableDsl.g:879:2: rule__EvoSetVariable__Group_2_2__1__Impl
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
    // InternalEvoVariableDsl.g:885:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:889:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoVariableDsl.g:890:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoVariableDsl.g:890:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoVariableDsl.g:891:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoVariableDsl.g:892:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoVariableDsl.g:892:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
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
    // InternalEvoVariableDsl.g:901:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:905:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoVariableDsl.g:906:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
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
    // InternalEvoVariableDsl.g:913:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:917:1: ( ( 'mapping' ) )
            // InternalEvoVariableDsl.g:918:1: ( 'mapping' )
            {
            // InternalEvoVariableDsl.g:918:1: ( 'mapping' )
            // InternalEvoVariableDsl.g:919:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:928:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:932:1: ( rule__EvoMappingVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:933:2: rule__EvoMappingVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:939:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:943:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:944:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:944:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:945:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:946:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:946:3: rule__EvoMappingVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:955:1: rule__EvoConfigurationVariable__Group__0 : rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 ;
    public final void rule__EvoConfigurationVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:959:1: ( rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 )
            // InternalEvoVariableDsl.g:960:2: rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1
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
    // InternalEvoVariableDsl.g:967:1: rule__EvoConfigurationVariable__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__EvoConfigurationVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:971:1: ( ( 'configuration' ) )
            // InternalEvoVariableDsl.g:972:1: ( 'configuration' )
            {
            // InternalEvoVariableDsl.g:972:1: ( 'configuration' )
            // InternalEvoVariableDsl.g:973:2: 'configuration'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:982:1: rule__EvoConfigurationVariable__Group__1 : rule__EvoConfigurationVariable__Group__1__Impl ;
    public final void rule__EvoConfigurationVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:986:1: ( rule__EvoConfigurationVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:987:2: rule__EvoConfigurationVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:993:1: rule__EvoConfigurationVariable__Group__1__Impl : ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:997:1: ( ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:998:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:998:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:999:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:1000:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:1000:3: rule__EvoConfigurationVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:1009:1: rule__Model__VariablesAssignment : ( ruleEvoVariable ) ;
    public final void rule__Model__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1013:1: ( ( ruleEvoVariable ) )
            // InternalEvoVariableDsl.g:1014:2: ( ruleEvoVariable )
            {
            // InternalEvoVariableDsl.g:1014:2: ( ruleEvoVariable )
            // InternalEvoVariableDsl.g:1015:3: ruleEvoVariable
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
    // InternalEvoVariableDsl.g:1024:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1028:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1029:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1029:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1030:3: RULE_ID
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


    // $ANTLR start "rule__EvoFeatureVariable__RelationAssignment_2"
    // InternalEvoVariableDsl.g:1039:1: rule__EvoFeatureVariable__RelationAssignment_2 : ( ruleEvoFeatureRelation ) ;
    public final void rule__EvoFeatureVariable__RelationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1043:1: ( ( ruleEvoFeatureRelation ) )
            // InternalEvoVariableDsl.g:1044:2: ( ruleEvoFeatureRelation )
            {
            // InternalEvoVariableDsl.g:1044:2: ( ruleEvoFeatureRelation )
            // InternalEvoVariableDsl.g:1045:3: ruleEvoFeatureRelation
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getRelationEvoFeatureRelationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoFeatureRelation();

            state._fsp--;

             after(grammarAccess.getEvoFeatureVariableAccess().getRelationEvoFeatureRelationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__RelationAssignment_2"


    // $ANTLR start "rule__EvoFeatureRelation__FeatureTypeAssignment_0"
    // InternalEvoVariableDsl.g:1054:1: rule__EvoFeatureRelation__FeatureTypeAssignment_0 : ( ruleEvoFeatureVariableType ) ;
    public final void rule__EvoFeatureRelation__FeatureTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1058:1: ( ( ruleEvoFeatureVariableType ) )
            // InternalEvoVariableDsl.g:1059:2: ( ruleEvoFeatureVariableType )
            {
            // InternalEvoVariableDsl.g:1059:2: ( ruleEvoFeatureVariableType )
            // InternalEvoVariableDsl.g:1060:3: ruleEvoFeatureVariableType
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoFeatureVariableType();

            state._fsp--;

             after(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__FeatureTypeAssignment_0"


    // $ANTLR start "rule__EvoFeatureRelation__RelatedFeaturesAssignment_2"
    // InternalEvoVariableDsl.g:1069:1: rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EvoFeatureRelation__RelatedFeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1073:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1074:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1074:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1075:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0()); 
            // InternalEvoVariableDsl.g:1076:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1077:4: RULE_ID
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__RelatedFeaturesAssignment_2"


    // $ANTLR start "rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1"
    // InternalEvoVariableDsl.g:1088:1: rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1092:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1093:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1093:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1094:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0()); 
            // InternalEvoVariableDsl.g:1095:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1096:4: RULE_ID
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1"


    // $ANTLR start "rule__EvoGroupVariable__NameAssignment_1"
    // InternalEvoVariableDsl.g:1107:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1111:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1112:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1112:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1113:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1122:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1126:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1127:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1127:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1128:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1137:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1141:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1142:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1142:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1143:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoVariableDsl.g:1144:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1145:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1156:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1160:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1161:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1161:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1162:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoVariableDsl.g:1163:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1164:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1175:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1179:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1180:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1180:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1181:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1190:1: rule__EvoConfigurationVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoConfigurationVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1194:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1195:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1195:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1196:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003C4002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}