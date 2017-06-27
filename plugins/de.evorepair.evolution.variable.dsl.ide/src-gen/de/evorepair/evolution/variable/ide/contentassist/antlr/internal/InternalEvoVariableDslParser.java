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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parentOf'", "'siblingOf'", "'childOf'", "'import'", "'feature'", "'value'", "'='", "'('", "')'", "','", "'group'", "'set'", "'mapping'", "'configuration'", "'.'"
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
    // InternalEvoVariableDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalEvoVariableDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalEvoVariableDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalEvoVariableDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalEvoVariableDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEvoVariableDsl.g:253:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalEvoVariableDsl.g:254:1: ( ruleQualifiedName EOF )
            // InternalEvoVariableDsl.g:255:1: ruleQualifiedName EOF
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
    // InternalEvoVariableDsl.g:262:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:266:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalEvoVariableDsl.g:267:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalEvoVariableDsl.g:267:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalEvoVariableDsl.g:268:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalEvoVariableDsl.g:269:3: ( rule__QualifiedName__Group__0 )
            // InternalEvoVariableDsl.g:269:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleEvoFeatureVariableType"
    // InternalEvoVariableDsl.g:278:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:282:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoVariableDsl.g:283:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoVariableDsl.g:283:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoVariableDsl.g:284:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoVariableDsl.g:285:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoVariableDsl.g:285:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoVariableDsl.g:293:1: rule__EvoVariable__Alternatives : ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:297:1: ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 23:
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
                    // InternalEvoVariableDsl.g:298:2: ( ruleEvoConfigurationVariable )
                    {
                    // InternalEvoVariableDsl.g:298:2: ( ruleEvoConfigurationVariable )
                    // InternalEvoVariableDsl.g:299:3: ruleEvoConfigurationVariable
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
                    // InternalEvoVariableDsl.g:304:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoVariableDsl.g:304:2: ( ruleEvoFeatureVariable )
                    // InternalEvoVariableDsl.g:305:3: ruleEvoFeatureVariable
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
                    // InternalEvoVariableDsl.g:310:2: ( ruleEvoGroupVariable )
                    {
                    // InternalEvoVariableDsl.g:310:2: ( ruleEvoGroupVariable )
                    // InternalEvoVariableDsl.g:311:3: ruleEvoGroupVariable
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
                    // InternalEvoVariableDsl.g:316:2: ( ruleEvoSetVariable )
                    {
                    // InternalEvoVariableDsl.g:316:2: ( ruleEvoSetVariable )
                    // InternalEvoVariableDsl.g:317:3: ruleEvoSetVariable
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
                    // InternalEvoVariableDsl.g:322:2: ( ruleEvoMappingVariable )
                    {
                    // InternalEvoVariableDsl.g:322:2: ( ruleEvoMappingVariable )
                    // InternalEvoVariableDsl.g:323:3: ruleEvoMappingVariable
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
    // InternalEvoVariableDsl.g:332:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:336:1: ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) )
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
                    // InternalEvoVariableDsl.g:337:2: ( ( 'parentOf' ) )
                    {
                    // InternalEvoVariableDsl.g:337:2: ( ( 'parentOf' ) )
                    // InternalEvoVariableDsl.g:338:3: ( 'parentOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoVariableDsl.g:339:3: ( 'parentOf' )
                    // InternalEvoVariableDsl.g:339:4: 'parentOf'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:343:2: ( ( 'siblingOf' ) )
                    {
                    // InternalEvoVariableDsl.g:343:2: ( ( 'siblingOf' ) )
                    // InternalEvoVariableDsl.g:344:3: ( 'siblingOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoVariableDsl.g:345:3: ( 'siblingOf' )
                    // InternalEvoVariableDsl.g:345:4: 'siblingOf'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:349:2: ( ( 'childOf' ) )
                    {
                    // InternalEvoVariableDsl.g:349:2: ( ( 'childOf' ) )
                    // InternalEvoVariableDsl.g:350:3: ( 'childOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoVariableDsl.g:351:3: ( 'childOf' )
                    // InternalEvoVariableDsl.g:351:4: 'childOf'
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalEvoVariableDsl.g:359:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:363:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalEvoVariableDsl.g:364:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalEvoVariableDsl.g:371:1: rule__Model__Group__0__Impl : ( 'import' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:375:1: ( ( 'import' ) )
            // InternalEvoVariableDsl.g:376:1: ( 'import' )
            {
            // InternalEvoVariableDsl.g:376:1: ( 'import' )
            // InternalEvoVariableDsl.g:377:2: 'import'
            {
             before(grammarAccess.getModelAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalEvoVariableDsl.g:386:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:390:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalEvoVariableDsl.g:391:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalEvoVariableDsl.g:398:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportURIAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:402:1: ( ( ( rule__Model__ImportURIAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:403:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:403:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            // InternalEvoVariableDsl.g:404:2: ( rule__Model__ImportURIAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getImportURIAssignment_1()); 
            // InternalEvoVariableDsl.g:405:2: ( rule__Model__ImportURIAssignment_1 )
            // InternalEvoVariableDsl.g:405:3: rule__Model__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalEvoVariableDsl.g:413:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:417:1: ( rule__Model__Group__2__Impl )
            // InternalEvoVariableDsl.g:418:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalEvoVariableDsl.g:424:1: rule__Model__Group__2__Impl : ( ( rule__Model__VariablesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:428:1: ( ( ( rule__Model__VariablesAssignment_2 )* ) )
            // InternalEvoVariableDsl.g:429:1: ( ( rule__Model__VariablesAssignment_2 )* )
            {
            // InternalEvoVariableDsl.g:429:1: ( ( rule__Model__VariablesAssignment_2 )* )
            // InternalEvoVariableDsl.g:430:2: ( rule__Model__VariablesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_2()); 
            // InternalEvoVariableDsl.g:431:2: ( rule__Model__VariablesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=21 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:431:3: rule__Model__VariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group__0"
    // InternalEvoVariableDsl.g:440:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:444:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoVariableDsl.g:445:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:452:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:456:1: ( ( 'feature' ) )
            // InternalEvoVariableDsl.g:457:1: ( 'feature' )
            {
            // InternalEvoVariableDsl.g:457:1: ( 'feature' )
            // InternalEvoVariableDsl.g:458:2: 'feature'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:467:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:471:1: ( rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 )
            // InternalEvoVariableDsl.g:472:2: rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2
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
    // InternalEvoVariableDsl.g:479:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:483:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:484:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:484:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:485:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:486:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:486:3: rule__EvoFeatureVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:494:1: rule__EvoFeatureVariable__Group__2 : rule__EvoFeatureVariable__Group__2__Impl rule__EvoFeatureVariable__Group__3 ;
    public final void rule__EvoFeatureVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:498:1: ( rule__EvoFeatureVariable__Group__2__Impl rule__EvoFeatureVariable__Group__3 )
            // InternalEvoVariableDsl.g:499:2: rule__EvoFeatureVariable__Group__2__Impl rule__EvoFeatureVariable__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__EvoFeatureVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__3();

            state._fsp--;


            }

        }
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
    // InternalEvoVariableDsl.g:506:1: rule__EvoFeatureVariable__Group__2__Impl : ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? ) ;
    public final void rule__EvoFeatureVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:510:1: ( ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? ) )
            // InternalEvoVariableDsl.g:511:1: ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? )
            {
            // InternalEvoVariableDsl.g:511:1: ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? )
            // InternalEvoVariableDsl.g:512:2: ( rule__EvoFeatureVariable__RelationAssignment_2 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getRelationAssignment_2()); 
            // InternalEvoVariableDsl.g:513:2: ( rule__EvoFeatureVariable__RelationAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:513:3: rule__EvoFeatureVariable__RelationAssignment_2
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


    // $ANTLR start "rule__EvoFeatureVariable__Group__3"
    // InternalEvoVariableDsl.g:521:1: rule__EvoFeatureVariable__Group__3 : rule__EvoFeatureVariable__Group__3__Impl ;
    public final void rule__EvoFeatureVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:525:1: ( rule__EvoFeatureVariable__Group__3__Impl )
            // InternalEvoVariableDsl.g:526:2: rule__EvoFeatureVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group__3"


    // $ANTLR start "rule__EvoFeatureVariable__Group__3__Impl"
    // InternalEvoVariableDsl.g:532:1: rule__EvoFeatureVariable__Group__3__Impl : ( ( rule__EvoFeatureVariable__Group_3__0 )? ) ;
    public final void rule__EvoFeatureVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:536:1: ( ( ( rule__EvoFeatureVariable__Group_3__0 )? ) )
            // InternalEvoVariableDsl.g:537:1: ( ( rule__EvoFeatureVariable__Group_3__0 )? )
            {
            // InternalEvoVariableDsl.g:537:1: ( ( rule__EvoFeatureVariable__Group_3__0 )? )
            // InternalEvoVariableDsl.g:538:2: ( rule__EvoFeatureVariable__Group_3__0 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup_3()); 
            // InternalEvoVariableDsl.g:539:2: ( rule__EvoFeatureVariable__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:539:3: rule__EvoFeatureVariable__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFeatureVariable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFeatureVariableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group__3__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__0"
    // InternalEvoVariableDsl.g:548:1: rule__EvoFeatureVariable__Group_3__0 : rule__EvoFeatureVariable__Group_3__0__Impl rule__EvoFeatureVariable__Group_3__1 ;
    public final void rule__EvoFeatureVariable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:552:1: ( rule__EvoFeatureVariable__Group_3__0__Impl rule__EvoFeatureVariable__Group_3__1 )
            // InternalEvoVariableDsl.g:553:2: rule__EvoFeatureVariable__Group_3__0__Impl rule__EvoFeatureVariable__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__EvoFeatureVariable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__0"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__0__Impl"
    // InternalEvoVariableDsl.g:560:1: rule__EvoFeatureVariable__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__EvoFeatureVariable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:564:1: ( ( 'value' ) )
            // InternalEvoVariableDsl.g:565:1: ( 'value' )
            {
            // InternalEvoVariableDsl.g:565:1: ( 'value' )
            // InternalEvoVariableDsl.g:566:2: 'value'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getValueKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__0__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__1"
    // InternalEvoVariableDsl.g:575:1: rule__EvoFeatureVariable__Group_3__1 : rule__EvoFeatureVariable__Group_3__1__Impl rule__EvoFeatureVariable__Group_3__2 ;
    public final void rule__EvoFeatureVariable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:579:1: ( rule__EvoFeatureVariable__Group_3__1__Impl rule__EvoFeatureVariable__Group_3__2 )
            // InternalEvoVariableDsl.g:580:2: rule__EvoFeatureVariable__Group_3__1__Impl rule__EvoFeatureVariable__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__EvoFeatureVariable__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__1"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__1__Impl"
    // InternalEvoVariableDsl.g:587:1: rule__EvoFeatureVariable__Group_3__1__Impl : ( '=' ) ;
    public final void rule__EvoFeatureVariable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:591:1: ( ( '=' ) )
            // InternalEvoVariableDsl.g:592:1: ( '=' )
            {
            // InternalEvoVariableDsl.g:592:1: ( '=' )
            // InternalEvoVariableDsl.g:593:2: '='
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__1__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__2"
    // InternalEvoVariableDsl.g:602:1: rule__EvoFeatureVariable__Group_3__2 : rule__EvoFeatureVariable__Group_3__2__Impl ;
    public final void rule__EvoFeatureVariable__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:606:1: ( rule__EvoFeatureVariable__Group_3__2__Impl )
            // InternalEvoVariableDsl.g:607:2: rule__EvoFeatureVariable__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__2"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__2__Impl"
    // InternalEvoVariableDsl.g:613:1: rule__EvoFeatureVariable__Group_3__2__Impl : ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) ) ;
    public final void rule__EvoFeatureVariable__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:617:1: ( ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) ) )
            // InternalEvoVariableDsl.g:618:1: ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) )
            {
            // InternalEvoVariableDsl.g:618:1: ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) )
            // InternalEvoVariableDsl.g:619:2: ( rule__EvoFeatureVariable__FeatureAssignment_3_2 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureAssignment_3_2()); 
            // InternalEvoVariableDsl.g:620:2: ( rule__EvoFeatureVariable__FeatureAssignment_3_2 )
            // InternalEvoVariableDsl.g:620:3: rule__EvoFeatureVariable__FeatureAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__FeatureAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__2__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__0"
    // InternalEvoVariableDsl.g:629:1: rule__EvoFeatureRelation__Group__0 : rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1 ;
    public final void rule__EvoFeatureRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:633:1: ( rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1 )
            // InternalEvoVariableDsl.g:634:2: rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalEvoVariableDsl.g:641:1: rule__EvoFeatureRelation__Group__0__Impl : ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) ) ;
    public final void rule__EvoFeatureRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:645:1: ( ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) ) )
            // InternalEvoVariableDsl.g:646:1: ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) )
            {
            // InternalEvoVariableDsl.g:646:1: ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) )
            // InternalEvoVariableDsl.g:647:2: ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeAssignment_0()); 
            // InternalEvoVariableDsl.g:648:2: ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 )
            // InternalEvoVariableDsl.g:648:3: rule__EvoFeatureRelation__FeatureTypeAssignment_0
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
    // InternalEvoVariableDsl.g:656:1: rule__EvoFeatureRelation__Group__1 : rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2 ;
    public final void rule__EvoFeatureRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:660:1: ( rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2 )
            // InternalEvoVariableDsl.g:661:2: rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:668:1: rule__EvoFeatureRelation__Group__1__Impl : ( '(' ) ;
    public final void rule__EvoFeatureRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:672:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:673:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:673:1: ( '(' )
            // InternalEvoVariableDsl.g:674:2: '('
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:683:1: rule__EvoFeatureRelation__Group__2 : rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3 ;
    public final void rule__EvoFeatureRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:687:1: ( rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3 )
            // InternalEvoVariableDsl.g:688:2: rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalEvoVariableDsl.g:695:1: rule__EvoFeatureRelation__Group__2__Impl : ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) ) ;
    public final void rule__EvoFeatureRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:699:1: ( ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) ) )
            // InternalEvoVariableDsl.g:700:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) )
            {
            // InternalEvoVariableDsl.g:700:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) )
            // InternalEvoVariableDsl.g:701:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_2()); 
            // InternalEvoVariableDsl.g:702:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 )
            // InternalEvoVariableDsl.g:702:3: rule__EvoFeatureRelation__RelatedFeaturesAssignment_2
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
    // InternalEvoVariableDsl.g:710:1: rule__EvoFeatureRelation__Group__3 : rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4 ;
    public final void rule__EvoFeatureRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:714:1: ( rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4 )
            // InternalEvoVariableDsl.g:715:2: rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalEvoVariableDsl.g:722:1: rule__EvoFeatureRelation__Group__3__Impl : ( ( rule__EvoFeatureRelation__Group_3__0 )? ) ;
    public final void rule__EvoFeatureRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:726:1: ( ( ( rule__EvoFeatureRelation__Group_3__0 )? ) )
            // InternalEvoVariableDsl.g:727:1: ( ( rule__EvoFeatureRelation__Group_3__0 )? )
            {
            // InternalEvoVariableDsl.g:727:1: ( ( rule__EvoFeatureRelation__Group_3__0 )? )
            // InternalEvoVariableDsl.g:728:2: ( rule__EvoFeatureRelation__Group_3__0 )?
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getGroup_3()); 
            // InternalEvoVariableDsl.g:729:2: ( rule__EvoFeatureRelation__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoVariableDsl.g:729:3: rule__EvoFeatureRelation__Group_3__0
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
    // InternalEvoVariableDsl.g:737:1: rule__EvoFeatureRelation__Group__4 : rule__EvoFeatureRelation__Group__4__Impl ;
    public final void rule__EvoFeatureRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:741:1: ( rule__EvoFeatureRelation__Group__4__Impl )
            // InternalEvoVariableDsl.g:742:2: rule__EvoFeatureRelation__Group__4__Impl
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
    // InternalEvoVariableDsl.g:748:1: rule__EvoFeatureRelation__Group__4__Impl : ( ')' ) ;
    public final void rule__EvoFeatureRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:752:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:753:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:753:1: ( ')' )
            // InternalEvoVariableDsl.g:754:2: ')'
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:764:1: rule__EvoFeatureRelation__Group_3__0 : rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1 ;
    public final void rule__EvoFeatureRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:768:1: ( rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1 )
            // InternalEvoVariableDsl.g:769:2: rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:776:1: rule__EvoFeatureRelation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EvoFeatureRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:780:1: ( ( ',' ) )
            // InternalEvoVariableDsl.g:781:1: ( ',' )
            {
            // InternalEvoVariableDsl.g:781:1: ( ',' )
            // InternalEvoVariableDsl.g:782:2: ','
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:791:1: rule__EvoFeatureRelation__Group_3__1 : rule__EvoFeatureRelation__Group_3__1__Impl ;
    public final void rule__EvoFeatureRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:795:1: ( rule__EvoFeatureRelation__Group_3__1__Impl )
            // InternalEvoVariableDsl.g:796:2: rule__EvoFeatureRelation__Group_3__1__Impl
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
    // InternalEvoVariableDsl.g:802:1: rule__EvoFeatureRelation__Group_3__1__Impl : ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) ) ;
    public final void rule__EvoFeatureRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:806:1: ( ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) ) )
            // InternalEvoVariableDsl.g:807:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) )
            {
            // InternalEvoVariableDsl.g:807:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) )
            // InternalEvoVariableDsl.g:808:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_3_1()); 
            // InternalEvoVariableDsl.g:809:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 )
            // InternalEvoVariableDsl.g:809:3: rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1
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
    // InternalEvoVariableDsl.g:818:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:822:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoVariableDsl.g:823:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:830:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:834:1: ( ( 'group' ) )
            // InternalEvoVariableDsl.g:835:1: ( 'group' )
            {
            // InternalEvoVariableDsl.g:835:1: ( 'group' )
            // InternalEvoVariableDsl.g:836:2: 'group'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:845:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:849:1: ( rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 )
            // InternalEvoVariableDsl.g:850:2: rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalEvoVariableDsl.g:857:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:861:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:862:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:862:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:863:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:864:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:864:3: rule__EvoGroupVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:872:1: rule__EvoGroupVariable__Group__2 : rule__EvoGroupVariable__Group__2__Impl ;
    public final void rule__EvoGroupVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:876:1: ( rule__EvoGroupVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:877:2: rule__EvoGroupVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:883:1: rule__EvoGroupVariable__Group__2__Impl : ( ( rule__EvoGroupVariable__Group_2__0 )? ) ;
    public final void rule__EvoGroupVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:887:1: ( ( ( rule__EvoGroupVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:888:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:888:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:889:2: ( rule__EvoGroupVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:890:2: ( rule__EvoGroupVariable__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvoVariableDsl.g:890:3: rule__EvoGroupVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:899:1: rule__EvoGroupVariable__Group_2__0 : rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 ;
    public final void rule__EvoGroupVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:903:1: ( rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:904:2: rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalEvoVariableDsl.g:911:1: rule__EvoGroupVariable__Group_2__0__Impl : ( 'value' ) ;
    public final void rule__EvoGroupVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:915:1: ( ( 'value' ) )
            // InternalEvoVariableDsl.g:916:1: ( 'value' )
            {
            // InternalEvoVariableDsl.g:916:1: ( 'value' )
            // InternalEvoVariableDsl.g:917:2: 'value'
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
    // InternalEvoVariableDsl.g:926:1: rule__EvoGroupVariable__Group_2__1 : rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 ;
    public final void rule__EvoGroupVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:930:1: ( rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:931:2: rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:938:1: rule__EvoGroupVariable__Group_2__1__Impl : ( '=' ) ;
    public final void rule__EvoGroupVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:942:1: ( ( '=' ) )
            // InternalEvoVariableDsl.g:943:1: ( '=' )
            {
            // InternalEvoVariableDsl.g:943:1: ( '=' )
            // InternalEvoVariableDsl.g:944:2: '='
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
    // InternalEvoVariableDsl.g:953:1: rule__EvoGroupVariable__Group_2__2 : rule__EvoGroupVariable__Group_2__2__Impl ;
    public final void rule__EvoGroupVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:957:1: ( rule__EvoGroupVariable__Group_2__2__Impl )
            // InternalEvoVariableDsl.g:958:2: rule__EvoGroupVariable__Group_2__2__Impl
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
    // InternalEvoVariableDsl.g:964:1: rule__EvoGroupVariable__Group_2__2__Impl : ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) ;
    public final void rule__EvoGroupVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:968:1: ( ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) )
            // InternalEvoVariableDsl.g:969:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            {
            // InternalEvoVariableDsl.g:969:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            // InternalEvoVariableDsl.g:970:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupAssignment_2_2()); 
            // InternalEvoVariableDsl.g:971:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            // InternalEvoVariableDsl.g:971:3: rule__EvoGroupVariable__GroupAssignment_2_2
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
    // InternalEvoVariableDsl.g:980:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:984:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoVariableDsl.g:985:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:992:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:996:1: ( ( 'set' ) )
            // InternalEvoVariableDsl.g:997:1: ( 'set' )
            {
            // InternalEvoVariableDsl.g:997:1: ( 'set' )
            // InternalEvoVariableDsl.g:998:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:1007:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1011:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoVariableDsl.g:1012:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
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
    // InternalEvoVariableDsl.g:1019:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1023:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:1024:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:1024:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:1025:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:1026:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:1026:3: rule__EvoSetVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:1034:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1038:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoVariableDsl.g:1039:2: rule__EvoSetVariable__Group__2__Impl
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
    // InternalEvoVariableDsl.g:1045:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1049:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoVariableDsl.g:1050:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoVariableDsl.g:1050:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoVariableDsl.g:1051:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoVariableDsl.g:1052:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEvoVariableDsl.g:1052:3: rule__EvoSetVariable__Group_2__0
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
    // InternalEvoVariableDsl.g:1061:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1065:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoVariableDsl.g:1066:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:1073:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1077:1: ( ( '(' ) )
            // InternalEvoVariableDsl.g:1078:1: ( '(' )
            {
            // InternalEvoVariableDsl.g:1078:1: ( '(' )
            // InternalEvoVariableDsl.g:1079:2: '('
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
    // InternalEvoVariableDsl.g:1088:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1092:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoVariableDsl.g:1093:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalEvoVariableDsl.g:1100:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1104:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoVariableDsl.g:1105:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoVariableDsl.g:1105:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoVariableDsl.g:1106:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoVariableDsl.g:1107:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoVariableDsl.g:1107:3: rule__EvoSetVariable__ElementsAssignment_2_1
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
    // InternalEvoVariableDsl.g:1115:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1119:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoVariableDsl.g:1120:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalEvoVariableDsl.g:1127:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1131:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoVariableDsl.g:1132:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoVariableDsl.g:1132:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoVariableDsl.g:1133:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoVariableDsl.g:1134:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoVariableDsl.g:1134:3: rule__EvoSetVariable__Group_2_2__0
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
    // InternalEvoVariableDsl.g:1142:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1146:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoVariableDsl.g:1147:2: rule__EvoSetVariable__Group_2__3__Impl
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
    // InternalEvoVariableDsl.g:1153:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1157:1: ( ( ')' ) )
            // InternalEvoVariableDsl.g:1158:1: ( ')' )
            {
            // InternalEvoVariableDsl.g:1158:1: ( ')' )
            // InternalEvoVariableDsl.g:1159:2: ')'
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
    // InternalEvoVariableDsl.g:1169:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1173:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoVariableDsl.g:1174:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:1181:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1185:1: ( ( ',' ) )
            // InternalEvoVariableDsl.g:1186:1: ( ',' )
            {
            // InternalEvoVariableDsl.g:1186:1: ( ',' )
            // InternalEvoVariableDsl.g:1187:2: ','
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
    // InternalEvoVariableDsl.g:1196:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1200:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoVariableDsl.g:1201:2: rule__EvoSetVariable__Group_2_2__1__Impl
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
    // InternalEvoVariableDsl.g:1207:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1211:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoVariableDsl.g:1212:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoVariableDsl.g:1212:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoVariableDsl.g:1213:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoVariableDsl.g:1214:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoVariableDsl.g:1214:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
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
    // InternalEvoVariableDsl.g:1223:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1227:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoVariableDsl.g:1228:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:1235:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1239:1: ( ( 'mapping' ) )
            // InternalEvoVariableDsl.g:1240:1: ( 'mapping' )
            {
            // InternalEvoVariableDsl.g:1240:1: ( 'mapping' )
            // InternalEvoVariableDsl.g:1241:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:1250:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1254:1: ( rule__EvoMappingVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:1255:2: rule__EvoMappingVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:1261:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1265:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:1266:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:1266:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:1267:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:1268:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:1268:3: rule__EvoMappingVariable__NameAssignment_1
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
    // InternalEvoVariableDsl.g:1277:1: rule__EvoConfigurationVariable__Group__0 : rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 ;
    public final void rule__EvoConfigurationVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1281:1: ( rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 )
            // InternalEvoVariableDsl.g:1282:2: rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:1289:1: rule__EvoConfigurationVariable__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__EvoConfigurationVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1293:1: ( ( 'configuration' ) )
            // InternalEvoVariableDsl.g:1294:1: ( 'configuration' )
            {
            // InternalEvoVariableDsl.g:1294:1: ( 'configuration' )
            // InternalEvoVariableDsl.g:1295:2: 'configuration'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:1304:1: rule__EvoConfigurationVariable__Group__1 : rule__EvoConfigurationVariable__Group__1__Impl ;
    public final void rule__EvoConfigurationVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1308:1: ( rule__EvoConfigurationVariable__Group__1__Impl )
            // InternalEvoVariableDsl.g:1309:2: rule__EvoConfigurationVariable__Group__1__Impl
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
    // InternalEvoVariableDsl.g:1315:1: rule__EvoConfigurationVariable__Group__1__Impl : ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1319:1: ( ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) )
            // InternalEvoVariableDsl.g:1320:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            {
            // InternalEvoVariableDsl.g:1320:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            // InternalEvoVariableDsl.g:1321:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); 
            // InternalEvoVariableDsl.g:1322:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            // InternalEvoVariableDsl.g:1322:3: rule__EvoConfigurationVariable__NameAssignment_1
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalEvoVariableDsl.g:1331:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1335:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalEvoVariableDsl.g:1336:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalEvoVariableDsl.g:1343:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1347:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1348:1: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1348:1: ( RULE_ID )
            // InternalEvoVariableDsl.g:1349:2: RULE_ID
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
    // InternalEvoVariableDsl.g:1358:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1362:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalEvoVariableDsl.g:1363:2: rule__QualifiedName__Group__1__Impl
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
    // InternalEvoVariableDsl.g:1369:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1373:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalEvoVariableDsl.g:1374:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalEvoVariableDsl.g:1374:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalEvoVariableDsl.g:1375:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalEvoVariableDsl.g:1376:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:1376:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalEvoVariableDsl.g:1385:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1389:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalEvoVariableDsl.g:1390:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEvoVariableDsl.g:1397:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1401:1: ( ( '.' ) )
            // InternalEvoVariableDsl.g:1402:1: ( '.' )
            {
            // InternalEvoVariableDsl.g:1402:1: ( '.' )
            // InternalEvoVariableDsl.g:1403:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEvoVariableDsl.g:1412:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1416:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalEvoVariableDsl.g:1417:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalEvoVariableDsl.g:1423:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1427:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1428:1: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1428:1: ( RULE_ID )
            // InternalEvoVariableDsl.g:1429:2: RULE_ID
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


    // $ANTLR start "rule__Model__ImportURIAssignment_1"
    // InternalEvoVariableDsl.g:1439:1: rule__Model__ImportURIAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1443:1: ( ( ruleQualifiedName ) )
            // InternalEvoVariableDsl.g:1444:2: ( ruleQualifiedName )
            {
            // InternalEvoVariableDsl.g:1444:2: ( ruleQualifiedName )
            // InternalEvoVariableDsl.g:1445:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getImportURIQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportURIQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportURIAssignment_1"


    // $ANTLR start "rule__Model__VariablesAssignment_2"
    // InternalEvoVariableDsl.g:1454:1: rule__Model__VariablesAssignment_2 : ( ruleEvoVariable ) ;
    public final void rule__Model__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1458:1: ( ( ruleEvoVariable ) )
            // InternalEvoVariableDsl.g:1459:2: ( ruleEvoVariable )
            {
            // InternalEvoVariableDsl.g:1459:2: ( ruleEvoVariable )
            // InternalEvoVariableDsl.g:1460:3: ruleEvoVariable
            {
             before(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VariablesAssignment_2"


    // $ANTLR start "rule__EvoFeatureVariable__NameAssignment_1"
    // InternalEvoVariableDsl.g:1469:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1473:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1474:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1474:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1475:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1484:1: rule__EvoFeatureVariable__RelationAssignment_2 : ( ruleEvoFeatureRelation ) ;
    public final void rule__EvoFeatureVariable__RelationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1488:1: ( ( ruleEvoFeatureRelation ) )
            // InternalEvoVariableDsl.g:1489:2: ( ruleEvoFeatureRelation )
            {
            // InternalEvoVariableDsl.g:1489:2: ( ruleEvoFeatureRelation )
            // InternalEvoVariableDsl.g:1490:3: ruleEvoFeatureRelation
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


    // $ANTLR start "rule__EvoFeatureVariable__FeatureAssignment_3_2"
    // InternalEvoVariableDsl.g:1499:1: rule__EvoFeatureVariable__FeatureAssignment_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EvoFeatureVariable__FeatureAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1503:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEvoVariableDsl.g:1504:2: ( ( ruleQualifiedName ) )
            {
            // InternalEvoVariableDsl.g:1504:2: ( ( ruleQualifiedName ) )
            // InternalEvoVariableDsl.g:1505:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureCrossReference_3_2_0()); 
            // InternalEvoVariableDsl.g:1506:3: ( ruleQualifiedName )
            // InternalEvoVariableDsl.g:1507:4: ruleQualifiedName
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureQualifiedNameParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureQualifiedNameParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvoFeatureVariable__FeatureAssignment_3_2"


    // $ANTLR start "rule__EvoFeatureRelation__FeatureTypeAssignment_0"
    // InternalEvoVariableDsl.g:1518:1: rule__EvoFeatureRelation__FeatureTypeAssignment_0 : ( ruleEvoFeatureVariableType ) ;
    public final void rule__EvoFeatureRelation__FeatureTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1522:1: ( ( ruleEvoFeatureVariableType ) )
            // InternalEvoVariableDsl.g:1523:2: ( ruleEvoFeatureVariableType )
            {
            // InternalEvoVariableDsl.g:1523:2: ( ruleEvoFeatureVariableType )
            // InternalEvoVariableDsl.g:1524:3: ruleEvoFeatureVariableType
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
    // InternalEvoVariableDsl.g:1533:1: rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EvoFeatureRelation__RelatedFeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1537:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1538:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1538:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1539:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0()); 
            // InternalEvoVariableDsl.g:1540:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1541:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1552:1: rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1556:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1557:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1557:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1558:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0()); 
            // InternalEvoVariableDsl.g:1559:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1560:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1571:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1575:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1576:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1576:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1577:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1586:1: rule__EvoGroupVariable__GroupAssignment_2_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EvoGroupVariable__GroupAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1590:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEvoVariableDsl.g:1591:2: ( ( ruleQualifiedName ) )
            {
            // InternalEvoVariableDsl.g:1591:2: ( ( ruleQualifiedName ) )
            // InternalEvoVariableDsl.g:1592:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0()); 
            // InternalEvoVariableDsl.g:1593:3: ( ruleQualifiedName )
            // InternalEvoVariableDsl.g:1594:4: ruleQualifiedName
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupQualifiedNameParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupQualifiedNameParserRuleCall_2_2_0_1()); 

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
    // InternalEvoVariableDsl.g:1605:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1609:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1610:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1610:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1611:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1620:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1624:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1625:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1625:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1626:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoVariableDsl.g:1627:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1628:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1639:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1643:1: ( ( ( RULE_ID ) ) )
            // InternalEvoVariableDsl.g:1644:2: ( ( RULE_ID ) )
            {
            // InternalEvoVariableDsl.g:1644:2: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1645:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoVariableDsl.g:1646:3: ( RULE_ID )
            // InternalEvoVariableDsl.g:1647:4: RULE_ID
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
    // InternalEvoVariableDsl.g:1658:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1662:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1663:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1663:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1664:3: RULE_ID
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
    // InternalEvoVariableDsl.g:1673:1: rule__EvoConfigurationVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoConfigurationVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoVariableDsl.g:1677:1: ( ( RULE_ID ) )
            // InternalEvoVariableDsl.g:1678:2: ( RULE_ID )
            {
            // InternalEvoVariableDsl.g:1678:2: ( RULE_ID )
            // InternalEvoVariableDsl.g:1679:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001E08000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001E08002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});

}