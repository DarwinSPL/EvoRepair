package de.evorepair.feature.mapping.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.evorepair.feature.mapping.services.DwMappingDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDwMappingDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "':'", "'['", "'-'", "'eternity'", "']'", "'||'", "'&&'", "'=='", "'!='", "'->'", "'<->'", "'ifPossible('", "','", "')'", "'<='", "'>='", "'+'", "'%'", "'*'", "'/'", "'--'", "'('", "'!'", "'?'", "'true'", "'false'", "'context:'", "'.'", "'EnumLiteral('", "'min('", "'max('", "'xor'", "'=>'", "'<=>'", "'inclusion'", "'intersection'", "'union'", "'difference'", "'symmetric_difference'", "'x'", "'|'", "'size'", "'elementOf'", "'forAll'", "'exists'", "'not'", "'satisfiable'", "'All_Mappings'", "'All_Configurations'", "'AC'", "'featureType'", "'groupType'", "'{'", "'}'", "'parentOf'", "'sibilingsOf'", "'childrenOf'", "'='", "'@ident'", "'@pre'", "'@post'", "'optional'", "'mandatory'", "'and'", "'or'", "'alternative'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DATE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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


        public InternalDwMappingDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDwMappingDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDwMappingDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDwMappingDsl.g"; }



     	private DwMappingDslGrammarAccess grammarAccess;

        public InternalDwMappingDslParser(TokenStream input, DwMappingDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "HyMappingModel";
       	}

       	@Override
       	protected DwMappingDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHyMappingModel"
    // InternalDwMappingDsl.g:65:1: entryRuleHyMappingModel returns [EObject current=null] : iv_ruleHyMappingModel= ruleHyMappingModel EOF ;
    public final EObject entryRuleHyMappingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyMappingModel = null;


        try {
            // InternalDwMappingDsl.g:65:55: (iv_ruleHyMappingModel= ruleHyMappingModel EOF )
            // InternalDwMappingDsl.g:66:2: iv_ruleHyMappingModel= ruleHyMappingModel EOF
            {
             newCompositeNode(grammarAccess.getHyMappingModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHyMappingModel=ruleHyMappingModel();

            state._fsp--;

             current =iv_ruleHyMappingModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHyMappingModel"


    // $ANTLR start "ruleHyMappingModel"
    // InternalDwMappingDsl.g:72:1: ruleHyMappingModel returns [EObject current=null] : ( ( (lv_mappings_0_0= ruleHyMapping ) ) ( (lv_mappings_1_0= ruleHyMapping ) )? ) ;
    public final EObject ruleHyMappingModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mappings_0_0 = null;

        EObject lv_mappings_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:78:2: ( ( ( (lv_mappings_0_0= ruleHyMapping ) ) ( (lv_mappings_1_0= ruleHyMapping ) )? ) )
            // InternalDwMappingDsl.g:79:2: ( ( (lv_mappings_0_0= ruleHyMapping ) ) ( (lv_mappings_1_0= ruleHyMapping ) )? )
            {
            // InternalDwMappingDsl.g:79:2: ( ( (lv_mappings_0_0= ruleHyMapping ) ) ( (lv_mappings_1_0= ruleHyMapping ) )? )
            // InternalDwMappingDsl.g:80:3: ( (lv_mappings_0_0= ruleHyMapping ) ) ( (lv_mappings_1_0= ruleHyMapping ) )?
            {
            // InternalDwMappingDsl.g:80:3: ( (lv_mappings_0_0= ruleHyMapping ) )
            // InternalDwMappingDsl.g:81:4: (lv_mappings_0_0= ruleHyMapping )
            {
            // InternalDwMappingDsl.g:81:4: (lv_mappings_0_0= ruleHyMapping )
            // InternalDwMappingDsl.g:82:5: lv_mappings_0_0= ruleHyMapping
            {

            					newCompositeNode(grammarAccess.getHyMappingModelAccess().getMappingsHyMappingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_mappings_0_0=ruleHyMapping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHyMappingModelRule());
            					}
            					add(
            						current,
            						"mappings",
            						lv_mappings_0_0,
            						"de.evorepair.feature.mapping.DwMappingDsl.HyMapping");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:99:3: ( (lv_mappings_1_0= ruleHyMapping ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||(LA1_0>=RULE_STRING && LA1_0<=RULE_INT)||(LA1_0>=34 && LA1_0<=40)||(LA1_0>=43 && LA1_0<=44)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDwMappingDsl.g:100:4: (lv_mappings_1_0= ruleHyMapping )
                    {
                    // InternalDwMappingDsl.g:100:4: (lv_mappings_1_0= ruleHyMapping )
                    // InternalDwMappingDsl.g:101:5: lv_mappings_1_0= ruleHyMapping
                    {

                    					newCompositeNode(grammarAccess.getHyMappingModelAccess().getMappingsHyMappingParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mappings_1_0=ruleHyMapping();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHyMappingModelRule());
                    					}
                    					add(
                    						current,
                    						"mappings",
                    						lv_mappings_1_0,
                    						"de.evorepair.feature.mapping.DwMappingDsl.HyMapping");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyMappingModel"


    // $ANTLR start "entryRuleDEDeltaInvokation"
    // InternalDwMappingDsl.g:122:1: entryRuleDEDeltaInvokation returns [EObject current=null] : iv_ruleDEDeltaInvokation= ruleDEDeltaInvokation EOF ;
    public final EObject entryRuleDEDeltaInvokation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEDeltaInvokation = null;


        try {
            // InternalDwMappingDsl.g:122:58: (iv_ruleDEDeltaInvokation= ruleDEDeltaInvokation EOF )
            // InternalDwMappingDsl.g:123:2: iv_ruleDEDeltaInvokation= ruleDEDeltaInvokation EOF
            {
             newCompositeNode(grammarAccess.getDEDeltaInvokationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDEDeltaInvokation=ruleDEDeltaInvokation();

            state._fsp--;

             current =iv_ruleDEDeltaInvokation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDEDeltaInvokation"


    // $ANTLR start "ruleDEDeltaInvokation"
    // InternalDwMappingDsl.g:129:1: ruleDEDeltaInvokation returns [EObject current=null] : (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ) ;
    public final EObject ruleDEDeltaInvokation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:135:2: ( (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ) )
            // InternalDwMappingDsl.g:136:2: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' )
            {
            // InternalDwMappingDsl.g:136:2: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' )
            // InternalDwMappingDsl.g:137:3: otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDEDeltaInvokationAccess().getLessThanSignKeyword_0());
            		
            // InternalDwMappingDsl.g:141:3: ( (otherlv_1= RULE_ID ) )
            // InternalDwMappingDsl.g:142:4: (otherlv_1= RULE_ID )
            {
            // InternalDwMappingDsl.g:142:4: (otherlv_1= RULE_ID )
            // InternalDwMappingDsl.g:143:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDEDeltaInvokationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getDEDeltaInvokationAccess().getDeltaDEDeltaCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDEDeltaInvokationAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEDeltaInvokation"


    // $ANTLR start "entryRuleHyMapping"
    // InternalDwMappingDsl.g:162:1: entryRuleHyMapping returns [EObject current=null] : iv_ruleHyMapping= ruleHyMapping EOF ;
    public final EObject entryRuleHyMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyMapping = null;


        try {
            // InternalDwMappingDsl.g:162:50: (iv_ruleHyMapping= ruleHyMapping EOF )
            // InternalDwMappingDsl.g:163:2: iv_ruleHyMapping= ruleHyMapping EOF
            {
             newCompositeNode(grammarAccess.getHyMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHyMapping=ruleHyMapping();

            state._fsp--;

             current =iv_ruleHyMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHyMapping"


    // $ANTLR start "ruleHyMapping"
    // InternalDwMappingDsl.g:169:1: ruleHyMapping returns [EObject current=null] : ( ( (lv_expression_0_0= ruleEvoMappingExpression ) ) otherlv_1= ':' ( (lv_deltaInvokations_2_0= ruleDEDeltaInvokation ) ) (otherlv_3= '[' ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) ) otherlv_12= ']' )? ) ;
    public final EObject ruleHyMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_validSince_4_0=null;
        Token otherlv_5=null;
        Token lv_validUntil_6_0=null;
        Token lv_validSince_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_validUntil_11_0=null;
        Token otherlv_12=null;
        EObject lv_expression_0_0 = null;

        EObject lv_deltaInvokations_2_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:175:2: ( ( ( (lv_expression_0_0= ruleEvoMappingExpression ) ) otherlv_1= ':' ( (lv_deltaInvokations_2_0= ruleDEDeltaInvokation ) ) (otherlv_3= '[' ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) ) otherlv_12= ']' )? ) )
            // InternalDwMappingDsl.g:176:2: ( ( (lv_expression_0_0= ruleEvoMappingExpression ) ) otherlv_1= ':' ( (lv_deltaInvokations_2_0= ruleDEDeltaInvokation ) ) (otherlv_3= '[' ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) ) otherlv_12= ']' )? )
            {
            // InternalDwMappingDsl.g:176:2: ( ( (lv_expression_0_0= ruleEvoMappingExpression ) ) otherlv_1= ':' ( (lv_deltaInvokations_2_0= ruleDEDeltaInvokation ) ) (otherlv_3= '[' ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) ) otherlv_12= ']' )? )
            // InternalDwMappingDsl.g:177:3: ( (lv_expression_0_0= ruleEvoMappingExpression ) ) otherlv_1= ':' ( (lv_deltaInvokations_2_0= ruleDEDeltaInvokation ) ) (otherlv_3= '[' ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) ) otherlv_12= ']' )?
            {
            // InternalDwMappingDsl.g:177:3: ( (lv_expression_0_0= ruleEvoMappingExpression ) )
            // InternalDwMappingDsl.g:178:4: (lv_expression_0_0= ruleEvoMappingExpression )
            {
            // InternalDwMappingDsl.g:178:4: (lv_expression_0_0= ruleEvoMappingExpression )
            // InternalDwMappingDsl.g:179:5: lv_expression_0_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getHyMappingAccess().getExpressionEvoMappingExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression_0_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHyMappingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getHyMappingAccess().getColonKeyword_1());
            		
            // InternalDwMappingDsl.g:200:3: ( (lv_deltaInvokations_2_0= ruleDEDeltaInvokation ) )
            // InternalDwMappingDsl.g:201:4: (lv_deltaInvokations_2_0= ruleDEDeltaInvokation )
            {
            // InternalDwMappingDsl.g:201:4: (lv_deltaInvokations_2_0= ruleDEDeltaInvokation )
            // InternalDwMappingDsl.g:202:5: lv_deltaInvokations_2_0= ruleDEDeltaInvokation
            {

            					newCompositeNode(grammarAccess.getHyMappingAccess().getDeltaInvokationsDEDeltaInvokationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_deltaInvokations_2_0=ruleDEDeltaInvokation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHyMappingRule());
            					}
            					add(
            						current,
            						"deltaInvokations",
            						lv_deltaInvokations_2_0,
            						"de.evorepair.feature.mapping.DwMappingDsl.DEDeltaInvokation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:219:3: (otherlv_3= '[' ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) ) otherlv_12= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDwMappingDsl.g:220:4: otherlv_3= '[' ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) ) otherlv_12= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getHyMappingAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDwMappingDsl.g:224:4: ( ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) ) | ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' ) | (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) ) )
                    int alt2=3;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_DATE) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==16) ) {
                            int LA2_3 = input.LA(3);

                            if ( (LA2_3==18) ) {
                                alt2=2;
                            }
                            else if ( (LA2_3==RULE_DATE) ) {
                                alt2=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_0==17) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDwMappingDsl.g:225:5: ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) )
                            {
                            // InternalDwMappingDsl.g:225:5: ( ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) ) )
                            // InternalDwMappingDsl.g:226:6: ( (lv_validSince_4_0= RULE_DATE ) ) otherlv_5= '-' ( (lv_validUntil_6_0= RULE_DATE ) )
                            {
                            // InternalDwMappingDsl.g:226:6: ( (lv_validSince_4_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:227:7: (lv_validSince_4_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:227:7: (lv_validSince_4_0= RULE_DATE )
                            // InternalDwMappingDsl.g:228:8: lv_validSince_4_0= RULE_DATE
                            {
                            lv_validSince_4_0=(Token)match(input,RULE_DATE,FOLLOW_10); 

                            								newLeafNode(lv_validSince_4_0, grammarAccess.getHyMappingAccess().getValidSinceDATETerminalRuleCall_3_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getHyMappingRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_4_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,16,FOLLOW_11); 

                            						newLeafNode(otherlv_5, grammarAccess.getHyMappingAccess().getHyphenMinusKeyword_3_1_0_1());
                            					
                            // InternalDwMappingDsl.g:248:6: ( (lv_validUntil_6_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:249:7: (lv_validUntil_6_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:249:7: (lv_validUntil_6_0= RULE_DATE )
                            // InternalDwMappingDsl.g:250:8: lv_validUntil_6_0= RULE_DATE
                            {
                            lv_validUntil_6_0=(Token)match(input,RULE_DATE,FOLLOW_12); 

                            								newLeafNode(lv_validUntil_6_0, grammarAccess.getHyMappingAccess().getValidUntilDATETerminalRuleCall_3_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getHyMappingRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_6_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDwMappingDsl.g:268:5: ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' )
                            {
                            // InternalDwMappingDsl.g:268:5: ( ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-' )
                            // InternalDwMappingDsl.g:269:6: ( (lv_validSince_7_0= RULE_DATE ) ) otherlv_8= '-'
                            {
                            // InternalDwMappingDsl.g:269:6: ( (lv_validSince_7_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:270:7: (lv_validSince_7_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:270:7: (lv_validSince_7_0= RULE_DATE )
                            // InternalDwMappingDsl.g:271:8: lv_validSince_7_0= RULE_DATE
                            {
                            lv_validSince_7_0=(Token)match(input,RULE_DATE,FOLLOW_10); 

                            								newLeafNode(lv_validSince_7_0, grammarAccess.getHyMappingAccess().getValidSinceDATETerminalRuleCall_3_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getHyMappingRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_7_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_8=(Token)match(input,16,FOLLOW_12); 

                            						newLeafNode(otherlv_8, grammarAccess.getHyMappingAccess().getHyphenMinusKeyword_3_1_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalDwMappingDsl.g:293:5: (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) )
                            {
                            // InternalDwMappingDsl.g:293:5: (otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) ) )
                            // InternalDwMappingDsl.g:294:6: otherlv_9= 'eternity' otherlv_10= '-' ( (lv_validUntil_11_0= RULE_DATE ) )
                            {
                            otherlv_9=(Token)match(input,17,FOLLOW_10); 

                            						newLeafNode(otherlv_9, grammarAccess.getHyMappingAccess().getEternityKeyword_3_1_2_0());
                            					
                            otherlv_10=(Token)match(input,16,FOLLOW_11); 

                            						newLeafNode(otherlv_10, grammarAccess.getHyMappingAccess().getHyphenMinusKeyword_3_1_2_1());
                            					
                            // InternalDwMappingDsl.g:302:6: ( (lv_validUntil_11_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:303:7: (lv_validUntil_11_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:303:7: (lv_validUntil_11_0= RULE_DATE )
                            // InternalDwMappingDsl.g:304:8: lv_validUntil_11_0= RULE_DATE
                            {
                            lv_validUntil_11_0=(Token)match(input,RULE_DATE,FOLLOW_12); 

                            								newLeafNode(lv_validUntil_11_0, grammarAccess.getHyMappingAccess().getValidUntilDATETerminalRuleCall_3_1_2_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getHyMappingRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_11_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getHyMappingAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyMapping"


    // $ANTLR start "entryRuleEvoMappingExpression"
    // InternalDwMappingDsl.g:331:1: entryRuleEvoMappingExpression returns [EObject current=null] : iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF ;
    public final EObject entryRuleEvoMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingExpression = null;


        try {
            // InternalDwMappingDsl.g:331:61: (iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF )
            // InternalDwMappingDsl.g:332:2: iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingExpression=ruleEvoMappingExpression();

            state._fsp--;

             current =iv_ruleEvoMappingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingExpression"


    // $ANTLR start "ruleEvoMappingExpression"
    // InternalDwMappingDsl.g:338:1: ruleEvoMappingExpression returns [EObject current=null] : this_EvoMappingOr_0= ruleEvoMappingOr ;
    public final EObject ruleEvoMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingOr_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:344:2: (this_EvoMappingOr_0= ruleEvoMappingOr )
            // InternalDwMappingDsl.g:345:2: this_EvoMappingOr_0= ruleEvoMappingOr
            {

            		newCompositeNode(grammarAccess.getEvoMappingExpressionAccess().getEvoMappingOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EvoMappingOr_0=ruleEvoMappingOr();

            state._fsp--;


            		current = this_EvoMappingOr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingExpression"


    // $ANTLR start "entryRuleEvoMappingOr"
    // InternalDwMappingDsl.g:356:1: entryRuleEvoMappingOr returns [EObject current=null] : iv_ruleEvoMappingOr= ruleEvoMappingOr EOF ;
    public final EObject entryRuleEvoMappingOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingOr = null;


        try {
            // InternalDwMappingDsl.g:356:53: (iv_ruleEvoMappingOr= ruleEvoMappingOr EOF )
            // InternalDwMappingDsl.g:357:2: iv_ruleEvoMappingOr= ruleEvoMappingOr EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingOr=ruleEvoMappingOr();

            state._fsp--;

             current =iv_ruleEvoMappingOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingOr"


    // $ANTLR start "ruleEvoMappingOr"
    // InternalDwMappingDsl.g:363:1: ruleEvoMappingOr returns [EObject current=null] : (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* ) ;
    public final EObject ruleEvoMappingOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingAnd_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:369:2: ( (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* ) )
            // InternalDwMappingDsl.g:370:2: (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* )
            {
            // InternalDwMappingDsl.g:370:2: (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* )
            // InternalDwMappingDsl.g:371:3: this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingOrAccess().getEvoMappingAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EvoMappingAnd_0=ruleEvoMappingAnd();

            state._fsp--;


            			current = this_EvoMappingAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:379:3: ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDwMappingDsl.g:380:4: () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) )
            	    {
            	    // InternalDwMappingDsl.g:380:4: ()
            	    // InternalDwMappingDsl.g:381:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingOrAccess().getHyOrExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:391:4: ( (lv_operand2_3_0= ruleEvoMappingAnd ) )
            	    // InternalDwMappingDsl.g:392:5: (lv_operand2_3_0= ruleEvoMappingAnd )
            	    {
            	    // InternalDwMappingDsl.g:392:5: (lv_operand2_3_0= ruleEvoMappingAnd )
            	    // InternalDwMappingDsl.g:393:6: lv_operand2_3_0= ruleEvoMappingAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingOrAccess().getOperand2EvoMappingAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_operand2_3_0=ruleEvoMappingAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingOr"


    // $ANTLR start "entryRuleEvoMappingAnd"
    // InternalDwMappingDsl.g:415:1: entryRuleEvoMappingAnd returns [EObject current=null] : iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF ;
    public final EObject entryRuleEvoMappingAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAnd = null;


        try {
            // InternalDwMappingDsl.g:415:54: (iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF )
            // InternalDwMappingDsl.g:416:2: iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingAnd=ruleEvoMappingAnd();

            state._fsp--;

             current =iv_ruleEvoMappingAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingAnd"


    // $ANTLR start "ruleEvoMappingAnd"
    // InternalDwMappingDsl.g:422:1: ruleEvoMappingAnd returns [EObject current=null] : (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* ) ;
    public final EObject ruleEvoMappingAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingEqual_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:428:2: ( (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* ) )
            // InternalDwMappingDsl.g:429:2: (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* )
            {
            // InternalDwMappingDsl.g:429:2: (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* )
            // InternalDwMappingDsl.g:430:3: this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingAndAccess().getEvoMappingEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_EvoMappingEqual_0=ruleEvoMappingEqual();

            state._fsp--;


            			current = this_EvoMappingEqual_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:438:3: ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDwMappingDsl.g:439:4: () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) )
            	    {
            	    // InternalDwMappingDsl.g:439:4: ()
            	    // InternalDwMappingDsl.g:440:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingAndAccess().getHyAndExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:450:4: ( (lv_operand2_3_0= ruleEvoMappingEqual ) )
            	    // InternalDwMappingDsl.g:451:5: (lv_operand2_3_0= ruleEvoMappingEqual )
            	    {
            	    // InternalDwMappingDsl.g:451:5: (lv_operand2_3_0= ruleEvoMappingEqual )
            	    // InternalDwMappingDsl.g:452:6: lv_operand2_3_0= ruleEvoMappingEqual
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingAndAccess().getOperand2EvoMappingEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operand2_3_0=ruleEvoMappingEqual();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingEqual");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingAnd"


    // $ANTLR start "entryRuleEvoMappingEqual"
    // InternalDwMappingDsl.g:474:1: entryRuleEvoMappingEqual returns [EObject current=null] : iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF ;
    public final EObject entryRuleEvoMappingEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEqual = null;


        try {
            // InternalDwMappingDsl.g:474:56: (iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF )
            // InternalDwMappingDsl.g:475:2: iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingEqual=ruleEvoMappingEqual();

            state._fsp--;

             current =iv_ruleEvoMappingEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingEqual"


    // $ANTLR start "ruleEvoMappingEqual"
    // InternalDwMappingDsl.g:481:1: ruleEvoMappingEqual returns [EObject current=null] : (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* ) ;
    public final EObject ruleEvoMappingEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingUnequal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:487:2: ( (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* ) )
            // InternalDwMappingDsl.g:488:2: (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* )
            {
            // InternalDwMappingDsl.g:488:2: (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* )
            // InternalDwMappingDsl.g:489:3: this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingEqualAccess().getEvoMappingUnequalParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EvoMappingUnequal_0=ruleEvoMappingUnequal();

            state._fsp--;


            			current = this_EvoMappingUnequal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:497:3: ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDwMappingDsl.g:498:4: () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) )
            	    {
            	    // InternalDwMappingDsl.g:498:4: ()
            	    // InternalDwMappingDsl.g:499:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingEqualAccess().getHyEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingEqualAccess().getEqualsSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:509:4: ( (lv_operand2_3_0= ruleEvoMappingUnequal ) )
            	    // InternalDwMappingDsl.g:510:5: (lv_operand2_3_0= ruleEvoMappingUnequal )
            	    {
            	    // InternalDwMappingDsl.g:510:5: (lv_operand2_3_0= ruleEvoMappingUnequal )
            	    // InternalDwMappingDsl.g:511:6: lv_operand2_3_0= ruleEvoMappingUnequal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingEqualAccess().getOperand2EvoMappingUnequalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_operand2_3_0=ruleEvoMappingUnequal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingEqualRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingUnequal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingEqual"


    // $ANTLR start "entryRuleEvoMappingUnequal"
    // InternalDwMappingDsl.g:533:1: entryRuleEvoMappingUnequal returns [EObject current=null] : iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF ;
    public final EObject entryRuleEvoMappingUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingUnequal = null;


        try {
            // InternalDwMappingDsl.g:533:58: (iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF )
            // InternalDwMappingDsl.g:534:2: iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingUnequalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingUnequal=ruleEvoMappingUnequal();

            state._fsp--;

             current =iv_ruleEvoMappingUnequal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingUnequal"


    // $ANTLR start "ruleEvoMappingUnequal"
    // InternalDwMappingDsl.g:540:1: ruleEvoMappingUnequal returns [EObject current=null] : (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* ) ;
    public final EObject ruleEvoMappingUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingImplication_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:546:2: ( (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* ) )
            // InternalDwMappingDsl.g:547:2: (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* )
            {
            // InternalDwMappingDsl.g:547:2: (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* )
            // InternalDwMappingDsl.g:548:3: this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingUnequalAccess().getEvoMappingImplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_EvoMappingImplication_0=ruleEvoMappingImplication();

            state._fsp--;


            			current = this_EvoMappingImplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:556:3: ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDwMappingDsl.g:557:4: () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) )
            	    {
            	    // InternalDwMappingDsl.g:557:4: ()
            	    // InternalDwMappingDsl.g:558:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingUnequalAccess().getHyNotEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:568:4: ( (lv_operand2_3_0= ruleEvoMappingImplication ) )
            	    // InternalDwMappingDsl.g:569:5: (lv_operand2_3_0= ruleEvoMappingImplication )
            	    {
            	    // InternalDwMappingDsl.g:569:5: (lv_operand2_3_0= ruleEvoMappingImplication )
            	    // InternalDwMappingDsl.g:570:6: lv_operand2_3_0= ruleEvoMappingImplication
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingUnequalAccess().getOperand2EvoMappingImplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operand2_3_0=ruleEvoMappingImplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingUnequalRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingImplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingUnequal"


    // $ANTLR start "entryRuleEvoMappingImplication"
    // InternalDwMappingDsl.g:592:1: entryRuleEvoMappingImplication returns [EObject current=null] : iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF ;
    public final EObject entryRuleEvoMappingImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingImplication = null;


        try {
            // InternalDwMappingDsl.g:592:62: (iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF )
            // InternalDwMappingDsl.g:593:2: iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingImplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingImplication=ruleEvoMappingImplication();

            state._fsp--;

             current =iv_ruleEvoMappingImplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingImplication"


    // $ANTLR start "ruleEvoMappingImplication"
    // InternalDwMappingDsl.g:599:1: ruleEvoMappingImplication returns [EObject current=null] : (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* ) ;
    public final EObject ruleEvoMappingImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingEquivalence_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:605:2: ( (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* ) )
            // InternalDwMappingDsl.g:606:2: (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* )
            {
            // InternalDwMappingDsl.g:606:2: (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* )
            // InternalDwMappingDsl.g:607:3: this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingImplicationAccess().getEvoMappingEquivalenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_EvoMappingEquivalence_0=ruleEvoMappingEquivalence();

            state._fsp--;


            			current = this_EvoMappingEquivalence_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:615:3: ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDwMappingDsl.g:616:4: () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) )
            	    {
            	    // InternalDwMappingDsl.g:616:4: ()
            	    // InternalDwMappingDsl.g:617:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingImplicationAccess().getHyImpliesExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingImplicationAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:627:4: ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) )
            	    // InternalDwMappingDsl.g:628:5: (lv_operand2_3_0= ruleEvoMappingEquivalence )
            	    {
            	    // InternalDwMappingDsl.g:628:5: (lv_operand2_3_0= ruleEvoMappingEquivalence )
            	    // InternalDwMappingDsl.g:629:6: lv_operand2_3_0= ruleEvoMappingEquivalence
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingImplicationAccess().getOperand2EvoMappingEquivalenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_operand2_3_0=ruleEvoMappingEquivalence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingImplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingEquivalence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingImplication"


    // $ANTLR start "entryRuleEvoMappingEquivalence"
    // InternalDwMappingDsl.g:651:1: entryRuleEvoMappingEquivalence returns [EObject current=null] : iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF ;
    public final EObject entryRuleEvoMappingEquivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEquivalence = null;


        try {
            // InternalDwMappingDsl.g:651:62: (iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF )
            // InternalDwMappingDsl.g:652:2: iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingEquivalenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingEquivalence=ruleEvoMappingEquivalence();

            state._fsp--;

             current =iv_ruleEvoMappingEquivalence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingEquivalence"


    // $ANTLR start "ruleEvoMappingEquivalence"
    // InternalDwMappingDsl.g:658:1: ruleEvoMappingEquivalence returns [EObject current=null] : (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* ) ;
    public final EObject ruleEvoMappingEquivalence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingLessExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:664:2: ( (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* ) )
            // InternalDwMappingDsl.g:665:2: (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:665:2: (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* )
            // InternalDwMappingDsl.g:666:3: this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingEquivalenceAccess().getEvoMappingLessExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_EvoMappingLessExpression_0=ruleEvoMappingLessExpression();

            state._fsp--;


            			current = this_EvoMappingLessExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:674:3: ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDwMappingDsl.g:675:4: () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:675:4: ()
            	    // InternalDwMappingDsl.g:676:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingEquivalenceAccess().getHyEquivalenceExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingEquivalenceAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:686:4: ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) )
            	    // InternalDwMappingDsl.g:687:5: (lv_operand2_3_0= ruleEvoMappingLessExpression )
            	    {
            	    // InternalDwMappingDsl.g:687:5: (lv_operand2_3_0= ruleEvoMappingLessExpression )
            	    // InternalDwMappingDsl.g:688:6: lv_operand2_3_0= ruleEvoMappingLessExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingEquivalenceAccess().getOperand2EvoMappingLessExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_operand2_3_0=ruleEvoMappingLessExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingEquivalenceRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingLessExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingEquivalence"


    // $ANTLR start "entryRuleEvoMappingLessExpression"
    // InternalDwMappingDsl.g:710:1: entryRuleEvoMappingLessExpression returns [EObject current=null] : iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF ;
    public final EObject entryRuleEvoMappingLessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingLessExpression = null;


        try {
            // InternalDwMappingDsl.g:710:65: (iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF )
            // InternalDwMappingDsl.g:711:2: iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingLessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingLessExpression=ruleEvoMappingLessExpression();

            state._fsp--;

             current =iv_ruleEvoMappingLessExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingLessExpression"


    // $ANTLR start "ruleEvoMappingLessExpression"
    // InternalDwMappingDsl.g:717:1: ruleEvoMappingLessExpression returns [EObject current=null] : (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* ) ;
    public final EObject ruleEvoMappingLessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingIfPossibleExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:723:2: ( (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* ) )
            // InternalDwMappingDsl.g:724:2: (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:724:2: (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* )
            // InternalDwMappingDsl.g:725:3: this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingLessExpressionAccess().getEvoMappingIfPossibleExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_EvoMappingIfPossibleExpression_0=ruleEvoMappingIfPossibleExpression();

            state._fsp--;


            			current = this_EvoMappingIfPossibleExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:733:3: ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDwMappingDsl.g:734:4: () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:734:4: ()
            	    // InternalDwMappingDsl.g:735:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingLessExpressionAccess().getHyLessExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingLessExpressionAccess().getLessThanSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:745:4: ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) )
            	    // InternalDwMappingDsl.g:746:5: (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression )
            	    {
            	    // InternalDwMappingDsl.g:746:5: (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression )
            	    // InternalDwMappingDsl.g:747:6: lv_operand2_3_0= ruleEvoMappingIfPossibleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingLessExpressionAccess().getOperand2EvoMappingIfPossibleExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operand2_3_0=ruleEvoMappingIfPossibleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingLessExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingIfPossibleExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingLessExpression"


    // $ANTLR start "entryRuleEvoMappingIfPossibleExpression"
    // InternalDwMappingDsl.g:769:1: entryRuleEvoMappingIfPossibleExpression returns [EObject current=null] : iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF ;
    public final EObject entryRuleEvoMappingIfPossibleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingIfPossibleExpression = null;


        try {
            // InternalDwMappingDsl.g:769:71: (iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF )
            // InternalDwMappingDsl.g:770:2: iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingIfPossibleExpression=ruleEvoMappingIfPossibleExpression();

            state._fsp--;

             current =iv_ruleEvoMappingIfPossibleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingIfPossibleExpression"


    // $ANTLR start "ruleEvoMappingIfPossibleExpression"
    // InternalDwMappingDsl.g:776:1: ruleEvoMappingIfPossibleExpression returns [EObject current=null] : (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* ) ;
    public final EObject ruleEvoMappingIfPossibleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_EvoMappingLessOrEqualExpression_0 = null;

        EObject lv_operands_4_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:782:2: ( (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* ) )
            // InternalDwMappingDsl.g:783:2: (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* )
            {
            // InternalDwMappingDsl.g:783:2: (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* )
            // InternalDwMappingDsl.g:784:3: this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getEvoMappingLessOrEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_EvoMappingLessOrEqualExpression_0=ruleEvoMappingLessOrEqualExpression();

            state._fsp--;


            			current = this_EvoMappingLessOrEqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:792:3: (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDwMappingDsl.g:793:4: otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')'
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getIfPossibleKeyword_1_0());
            	    			
            	    // InternalDwMappingDsl.g:797:4: ()
            	    // InternalDwMappingDsl.g:798:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEvoMappingIfPossibleExpressionAccess().getHyIfPossibleExpressionOperandsAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalDwMappingDsl.g:804:4: (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==26) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalDwMappingDsl.g:805:5: otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,26,FOLLOW_14); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getCommaKeyword_1_2_0());
            	    	    				
            	    	    // InternalDwMappingDsl.g:809:5: ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) )
            	    	    // InternalDwMappingDsl.g:810:6: (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression )
            	    	    {
            	    	    // InternalDwMappingDsl.g:810:6: (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression )
            	    	    // InternalDwMappingDsl.g:811:7: lv_operands_4_0= ruleEvoMappingLessOrEqualExpression
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getOperandsEvoMappingLessOrEqualExpressionParserRuleCall_1_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_22);
            	    	    lv_operands_4_0=ruleEvoMappingLessOrEqualExpression();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getEvoMappingIfPossibleExpressionRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"operands",
            	    	    								lv_operands_4_0,
            	    	    								"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingLessOrEqualExpression");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,27,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getRightParenthesisKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingIfPossibleExpression"


    // $ANTLR start "entryRuleEvoMappingLessOrEqualExpression"
    // InternalDwMappingDsl.g:838:1: entryRuleEvoMappingLessOrEqualExpression returns [EObject current=null] : iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF ;
    public final EObject entryRuleEvoMappingLessOrEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingLessOrEqualExpression = null;


        try {
            // InternalDwMappingDsl.g:838:72: (iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF )
            // InternalDwMappingDsl.g:839:2: iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingLessOrEqualExpression=ruleEvoMappingLessOrEqualExpression();

            state._fsp--;

             current =iv_ruleEvoMappingLessOrEqualExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingLessOrEqualExpression"


    // $ANTLR start "ruleEvoMappingLessOrEqualExpression"
    // InternalDwMappingDsl.g:845:1: ruleEvoMappingLessOrEqualExpression returns [EObject current=null] : (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* ) ;
    public final EObject ruleEvoMappingLessOrEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingGreaterExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:851:2: ( (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* ) )
            // InternalDwMappingDsl.g:852:2: (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:852:2: (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* )
            // InternalDwMappingDsl.g:853:3: this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getEvoMappingGreaterExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_EvoMappingGreaterExpression_0=ruleEvoMappingGreaterExpression();

            state._fsp--;


            			current = this_EvoMappingGreaterExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:861:3: ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDwMappingDsl.g:862:4: () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:862:4: ()
            	    // InternalDwMappingDsl.g:863:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getHyLessOrEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getLessThanSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:873:4: ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) )
            	    // InternalDwMappingDsl.g:874:5: (lv_operand2_3_0= ruleEvoMappingGreaterExpression )
            	    {
            	    // InternalDwMappingDsl.g:874:5: (lv_operand2_3_0= ruleEvoMappingGreaterExpression )
            	    // InternalDwMappingDsl.g:875:6: lv_operand2_3_0= ruleEvoMappingGreaterExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getOperand2EvoMappingGreaterExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_operand2_3_0=ruleEvoMappingGreaterExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingLessOrEqualExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingGreaterExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingLessOrEqualExpression"


    // $ANTLR start "entryRuleEvoMappingGreaterExpression"
    // InternalDwMappingDsl.g:897:1: entryRuleEvoMappingGreaterExpression returns [EObject current=null] : iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF ;
    public final EObject entryRuleEvoMappingGreaterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingGreaterExpression = null;


        try {
            // InternalDwMappingDsl.g:897:68: (iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF )
            // InternalDwMappingDsl.g:898:2: iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingGreaterExpression=ruleEvoMappingGreaterExpression();

            state._fsp--;

             current =iv_ruleEvoMappingGreaterExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingGreaterExpression"


    // $ANTLR start "ruleEvoMappingGreaterExpression"
    // InternalDwMappingDsl.g:904:1: ruleEvoMappingGreaterExpression returns [EObject current=null] : (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* ) ;
    public final EObject ruleEvoMappingGreaterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingGreaterOrEqualExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:910:2: ( (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* ) )
            // InternalDwMappingDsl.g:911:2: (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:911:2: (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* )
            // InternalDwMappingDsl.g:912:3: this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionAccess().getEvoMappingGreaterOrEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_EvoMappingGreaterOrEqualExpression_0=ruleEvoMappingGreaterOrEqualExpression();

            state._fsp--;


            			current = this_EvoMappingGreaterOrEqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:920:3: ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDwMappingDsl.g:921:4: () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:921:4: ()
            	    // InternalDwMappingDsl.g:922:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingGreaterExpressionAccess().getHyGreaterExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingGreaterExpressionAccess().getGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:932:4: ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) )
            	    // InternalDwMappingDsl.g:933:5: (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression )
            	    {
            	    // InternalDwMappingDsl.g:933:5: (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression )
            	    // InternalDwMappingDsl.g:934:6: lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionAccess().getOperand2EvoMappingGreaterOrEqualExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_operand2_3_0=ruleEvoMappingGreaterOrEqualExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingGreaterExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingGreaterOrEqualExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingGreaterExpression"


    // $ANTLR start "entryRuleEvoMappingGreaterOrEqualExpression"
    // InternalDwMappingDsl.g:956:1: entryRuleEvoMappingGreaterOrEqualExpression returns [EObject current=null] : iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF ;
    public final EObject entryRuleEvoMappingGreaterOrEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingGreaterOrEqualExpression = null;


        try {
            // InternalDwMappingDsl.g:956:75: (iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF )
            // InternalDwMappingDsl.g:957:2: iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingGreaterOrEqualExpression=ruleEvoMappingGreaterOrEqualExpression();

            state._fsp--;

             current =iv_ruleEvoMappingGreaterOrEqualExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingGreaterOrEqualExpression"


    // $ANTLR start "ruleEvoMappingGreaterOrEqualExpression"
    // InternalDwMappingDsl.g:963:1: ruleEvoMappingGreaterOrEqualExpression returns [EObject current=null] : (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingGreaterOrEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingSubtractionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:969:2: ( (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* ) )
            // InternalDwMappingDsl.g:970:2: (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:970:2: (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* )
            // InternalDwMappingDsl.g:971:3: this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getEvoMappingSubtractionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_EvoMappingSubtractionExpression_0=ruleEvoMappingSubtractionExpression();

            state._fsp--;


            			current = this_EvoMappingSubtractionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:979:3: ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDwMappingDsl.g:980:4: () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:980:4: ()
            	    // InternalDwMappingDsl.g:981:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getHyGreaterOrEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:991:4: ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) )
            	    // InternalDwMappingDsl.g:992:5: (lv_operand2_3_0= ruleEvoMappingSubtractionExpression )
            	    {
            	    // InternalDwMappingDsl.g:992:5: (lv_operand2_3_0= ruleEvoMappingSubtractionExpression )
            	    // InternalDwMappingDsl.g:993:6: lv_operand2_3_0= ruleEvoMappingSubtractionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getOperand2EvoMappingSubtractionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_operand2_3_0=ruleEvoMappingSubtractionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingGreaterOrEqualExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingSubtractionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingGreaterOrEqualExpression"


    // $ANTLR start "entryRuleEvoMappingSubtractionExpression"
    // InternalDwMappingDsl.g:1015:1: entryRuleEvoMappingSubtractionExpression returns [EObject current=null] : iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF ;
    public final EObject entryRuleEvoMappingSubtractionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingSubtractionExpression = null;


        try {
            // InternalDwMappingDsl.g:1015:72: (iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF )
            // InternalDwMappingDsl.g:1016:2: iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingSubtractionExpression=ruleEvoMappingSubtractionExpression();

            state._fsp--;

             current =iv_ruleEvoMappingSubtractionExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingSubtractionExpression"


    // $ANTLR start "ruleEvoMappingSubtractionExpression"
    // InternalDwMappingDsl.g:1022:1: ruleEvoMappingSubtractionExpression returns [EObject current=null] : (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingSubtractionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingAdditionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1028:2: ( (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* ) )
            // InternalDwMappingDsl.g:1029:2: (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:1029:2: (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* )
            // InternalDwMappingDsl.g:1030:3: this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionAccess().getEvoMappingAdditionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_EvoMappingAdditionExpression_0=ruleEvoMappingAdditionExpression();

            state._fsp--;


            			current = this_EvoMappingAdditionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:1038:3: ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDwMappingDsl.g:1039:4: () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:1039:4: ()
            	    // InternalDwMappingDsl.g:1040:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingSubtractionExpressionAccess().getHySubtractionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingSubtractionExpressionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:1050:4: ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) )
            	    // InternalDwMappingDsl.g:1051:5: (lv_operand2_3_0= ruleEvoMappingAdditionExpression )
            	    {
            	    // InternalDwMappingDsl.g:1051:5: (lv_operand2_3_0= ruleEvoMappingAdditionExpression )
            	    // InternalDwMappingDsl.g:1052:6: lv_operand2_3_0= ruleEvoMappingAdditionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionAccess().getOperand2EvoMappingAdditionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_operand2_3_0=ruleEvoMappingAdditionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingSubtractionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingAdditionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingSubtractionExpression"


    // $ANTLR start "entryRuleEvoMappingAdditionExpression"
    // InternalDwMappingDsl.g:1074:1: entryRuleEvoMappingAdditionExpression returns [EObject current=null] : iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF ;
    public final EObject entryRuleEvoMappingAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAdditionExpression = null;


        try {
            // InternalDwMappingDsl.g:1074:69: (iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF )
            // InternalDwMappingDsl.g:1075:2: iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingAdditionExpression=ruleEvoMappingAdditionExpression();

            state._fsp--;

             current =iv_ruleEvoMappingAdditionExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingAdditionExpression"


    // $ANTLR start "ruleEvoMappingAdditionExpression"
    // InternalDwMappingDsl.g:1081:1: ruleEvoMappingAdditionExpression returns [EObject current=null] : (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* ) ;
    public final EObject ruleEvoMappingAdditionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingModuloExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1087:2: ( (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* ) )
            // InternalDwMappingDsl.g:1088:2: (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:1088:2: (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* )
            // InternalDwMappingDsl.g:1089:3: this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionAccess().getEvoMappingModuloExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_EvoMappingModuloExpression_0=ruleEvoMappingModuloExpression();

            state._fsp--;


            			current = this_EvoMappingModuloExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:1097:3: ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDwMappingDsl.g:1098:4: () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:1098:4: ()
            	    // InternalDwMappingDsl.g:1099:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingAdditionExpressionAccess().getHyAdditionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingAdditionExpressionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:1109:4: ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) )
            	    // InternalDwMappingDsl.g:1110:5: (lv_operand2_3_0= ruleEvoMappingModuloExpression )
            	    {
            	    // InternalDwMappingDsl.g:1110:5: (lv_operand2_3_0= ruleEvoMappingModuloExpression )
            	    // InternalDwMappingDsl.g:1111:6: lv_operand2_3_0= ruleEvoMappingModuloExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionAccess().getOperand2EvoMappingModuloExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_operand2_3_0=ruleEvoMappingModuloExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingAdditionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingModuloExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingAdditionExpression"


    // $ANTLR start "entryRuleEvoMappingModuloExpression"
    // InternalDwMappingDsl.g:1133:1: entryRuleEvoMappingModuloExpression returns [EObject current=null] : iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF ;
    public final EObject entryRuleEvoMappingModuloExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingModuloExpression = null;


        try {
            // InternalDwMappingDsl.g:1133:67: (iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF )
            // InternalDwMappingDsl.g:1134:2: iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingModuloExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingModuloExpression=ruleEvoMappingModuloExpression();

            state._fsp--;

             current =iv_ruleEvoMappingModuloExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingModuloExpression"


    // $ANTLR start "ruleEvoMappingModuloExpression"
    // InternalDwMappingDsl.g:1140:1: ruleEvoMappingModuloExpression returns [EObject current=null] : (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* ) ;
    public final EObject ruleEvoMappingModuloExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingMultiplicationExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1146:2: ( (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* ) )
            // InternalDwMappingDsl.g:1147:2: (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:1147:2: (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* )
            // InternalDwMappingDsl.g:1148:3: this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingModuloExpressionAccess().getEvoMappingMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_EvoMappingMultiplicationExpression_0=ruleEvoMappingMultiplicationExpression();

            state._fsp--;


            			current = this_EvoMappingMultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:1156:3: ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDwMappingDsl.g:1157:4: () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:1157:4: ()
            	    // InternalDwMappingDsl.g:1158:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingModuloExpressionAccess().getHyModuloExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingModuloExpressionAccess().getPercentSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:1168:4: ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) )
            	    // InternalDwMappingDsl.g:1169:5: (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression )
            	    {
            	    // InternalDwMappingDsl.g:1169:5: (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression )
            	    // InternalDwMappingDsl.g:1170:6: lv_operand2_3_0= ruleEvoMappingMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingModuloExpressionAccess().getOperand2EvoMappingMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_operand2_3_0=ruleEvoMappingMultiplicationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingModuloExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingMultiplicationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingModuloExpression"


    // $ANTLR start "entryRuleEvoMappingMultiplicationExpression"
    // InternalDwMappingDsl.g:1192:1: entryRuleEvoMappingMultiplicationExpression returns [EObject current=null] : iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF ;
    public final EObject entryRuleEvoMappingMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMultiplicationExpression = null;


        try {
            // InternalDwMappingDsl.g:1192:75: (iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF )
            // InternalDwMappingDsl.g:1193:2: iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingMultiplicationExpression=ruleEvoMappingMultiplicationExpression();

            state._fsp--;

             current =iv_ruleEvoMappingMultiplicationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingMultiplicationExpression"


    // $ANTLR start "ruleEvoMappingMultiplicationExpression"
    // InternalDwMappingDsl.g:1199:1: ruleEvoMappingMultiplicationExpression returns [EObject current=null] : (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingDivisionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1205:2: ( (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* ) )
            // InternalDwMappingDsl.g:1206:2: (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* )
            {
            // InternalDwMappingDsl.g:1206:2: (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* )
            // InternalDwMappingDsl.g:1207:3: this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getEvoMappingDivisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_EvoMappingDivisionExpression_0=ruleEvoMappingDivisionExpression();

            state._fsp--;


            			current = this_EvoMappingDivisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:1215:3: ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDwMappingDsl.g:1216:4: () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) )
            	    {
            	    // InternalDwMappingDsl.g:1216:4: ()
            	    // InternalDwMappingDsl.g:1217:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingMultiplicationExpressionAccess().getHyMultiplicationExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingMultiplicationExpressionAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:1227:4: ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) )
            	    // InternalDwMappingDsl.g:1228:5: (lv_operand2_3_0= ruleEvoMappingDivisionExpression )
            	    {
            	    // InternalDwMappingDsl.g:1228:5: (lv_operand2_3_0= ruleEvoMappingDivisionExpression )
            	    // InternalDwMappingDsl.g:1229:6: lv_operand2_3_0= ruleEvoMappingDivisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getOperand2EvoMappingDivisionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_operand2_3_0=ruleEvoMappingDivisionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingMultiplicationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingDivisionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingMultiplicationExpression"


    // $ANTLR start "entryRuleEvoMappingDivisionExpression"
    // InternalDwMappingDsl.g:1251:1: entryRuleEvoMappingDivisionExpression returns [EObject current=null] : iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF ;
    public final EObject entryRuleEvoMappingDivisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingDivisionExpression = null;


        try {
            // InternalDwMappingDsl.g:1251:69: (iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF )
            // InternalDwMappingDsl.g:1252:2: iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingDivisionExpression=ruleEvoMappingDivisionExpression();

            state._fsp--;

             current =iv_ruleEvoMappingDivisionExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingDivisionExpression"


    // $ANTLR start "ruleEvoMappingDivisionExpression"
    // InternalDwMappingDsl.g:1258:1: ruleEvoMappingDivisionExpression returns [EObject current=null] : (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* ) ;
    public final EObject ruleEvoMappingDivisionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingTerminal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1264:2: ( (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* ) )
            // InternalDwMappingDsl.g:1265:2: (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* )
            {
            // InternalDwMappingDsl.g:1265:2: (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* )
            // InternalDwMappingDsl.g:1266:3: this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionAccess().getEvoMappingTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_EvoMappingTerminal_0=ruleEvoMappingTerminal();

            state._fsp--;


            			current = this_EvoMappingTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:1274:3: ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDwMappingDsl.g:1275:4: () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) )
            	    {
            	    // InternalDwMappingDsl.g:1275:4: ()
            	    // InternalDwMappingDsl.g:1276:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingDivisionExpressionAccess().getHyDivisionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingDivisionExpressionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:1286:4: ( (lv_operand2_3_0= ruleEvoMappingTerminal ) )
            	    // InternalDwMappingDsl.g:1287:5: (lv_operand2_3_0= ruleEvoMappingTerminal )
            	    {
            	    // InternalDwMappingDsl.g:1287:5: (lv_operand2_3_0= ruleEvoMappingTerminal )
            	    // InternalDwMappingDsl.g:1288:6: lv_operand2_3_0= ruleEvoMappingTerminal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionAccess().getOperand2EvoMappingTerminalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_operand2_3_0=ruleEvoMappingTerminal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingDivisionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingTerminal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingDivisionExpression"


    // $ANTLR start "entryRuleEvoMappingNegation"
    // InternalDwMappingDsl.g:1310:1: entryRuleEvoMappingNegation returns [EObject current=null] : iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF ;
    public final EObject entryRuleEvoMappingNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNegation = null;


        try {
            // InternalDwMappingDsl.g:1310:59: (iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF )
            // InternalDwMappingDsl.g:1311:2: iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNegation=ruleEvoMappingNegation();

            state._fsp--;

             current =iv_ruleEvoMappingNegation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingNegation"


    // $ANTLR start "ruleEvoMappingNegation"
    // InternalDwMappingDsl.g:1317:1: ruleEvoMappingNegation returns [EObject current=null] : (otherlv_0= '--' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) ;
    public final EObject ruleEvoMappingNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1323:2: ( (otherlv_0= '--' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) )
            // InternalDwMappingDsl.g:1324:2: (otherlv_0= '--' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            {
            // InternalDwMappingDsl.g:1324:2: (otherlv_0= '--' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            // InternalDwMappingDsl.g:1325:3: otherlv_0= '--' ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNegationAccess().getHyphenMinusHyphenMinusKeyword_0());
            		
            // InternalDwMappingDsl.g:1329:3: ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            // InternalDwMappingDsl.g:1330:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            {
            // InternalDwMappingDsl.g:1330:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            // InternalDwMappingDsl.g:1331:5: lv_operand_1_0= ruleEvoMappingTerminal
            {

            					newCompositeNode(grammarAccess.getEvoMappingNegationAccess().getOperandEvoMappingTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_1_0=ruleEvoMappingTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNegationRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingNegation"


    // $ANTLR start "entryRuleEvoMappingTerminal"
    // InternalDwMappingDsl.g:1352:1: entryRuleEvoMappingTerminal returns [EObject current=null] : iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF ;
    public final EObject entryRuleEvoMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingTerminal = null;


        try {
            // InternalDwMappingDsl.g:1352:59: (iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF )
            // InternalDwMappingDsl.g:1353:2: iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingTerminal=ruleEvoMappingTerminal();

            state._fsp--;

             current =iv_ruleEvoMappingTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingTerminal"


    // $ANTLR start "ruleEvoMappingTerminal"
    // InternalDwMappingDsl.g:1359:1: ruleEvoMappingTerminal returns [EObject current=null] : (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoVariableTerm_1= ruleEvoVariableTerm | this_EvoMappingNestedExpression_2= ruleEvoMappingNestedExpression | this_EvoMappingNegation_3= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_4= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_5= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_6= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_7= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_8= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_9= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_10= ruleEvoMappingMaximumExpression | this_EvoMappingNot_11= ruleEvoMappingNot ) ;
    public final EObject ruleEvoMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingFeatureReferenceExpression_0 = null;

        EObject this_EvoVariableTerm_1 = null;

        EObject this_EvoMappingNestedExpression_2 = null;

        EObject this_EvoMappingNegation_3 = null;

        EObject this_EvoMappingConditionalFeatureReferenceExpression_4 = null;

        EObject this_EvoMappingContextInformationReferenceExpression_5 = null;

        EObject this_EvoMappingAttributeReferenceExpression_6 = null;

        EObject this_EvoMappingValueExpression_7 = null;

        EObject this_EvoMappingBooleanValueExpression_8 = null;

        EObject this_EvoMappingMimumumExpression_9 = null;

        EObject this_EvoMappingMaximumExpression_10 = null;

        EObject this_EvoMappingNot_11 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1365:2: ( (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoVariableTerm_1= ruleEvoVariableTerm | this_EvoMappingNestedExpression_2= ruleEvoMappingNestedExpression | this_EvoMappingNegation_3= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_4= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_5= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_6= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_7= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_8= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_9= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_10= ruleEvoMappingMaximumExpression | this_EvoMappingNot_11= ruleEvoMappingNot ) )
            // InternalDwMappingDsl.g:1366:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoVariableTerm_1= ruleEvoVariableTerm | this_EvoMappingNestedExpression_2= ruleEvoMappingNestedExpression | this_EvoMappingNegation_3= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_4= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_5= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_6= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_7= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_8= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_9= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_10= ruleEvoMappingMaximumExpression | this_EvoMappingNot_11= ruleEvoMappingNot )
            {
            // InternalDwMappingDsl.g:1366:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoVariableTerm_1= ruleEvoVariableTerm | this_EvoMappingNestedExpression_2= ruleEvoMappingNestedExpression | this_EvoMappingNegation_3= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_4= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_5= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_6= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_7= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_8= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_9= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_10= ruleEvoMappingMaximumExpression | this_EvoMappingNot_11= ruleEvoMappingNot )
            int alt21=12;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalDwMappingDsl.g:1367:3: this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingFeatureReferenceExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingFeatureReferenceExpression_0=ruleEvoMappingFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingFeatureReferenceExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:1376:3: this_EvoVariableTerm_1= ruleEvoVariableTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoVariableTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoVariableTerm_1=ruleEvoVariableTerm();

                    state._fsp--;


                    			current = this_EvoVariableTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDwMappingDsl.g:1385:3: this_EvoMappingNestedExpression_2= ruleEvoMappingNestedExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNestedExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNestedExpression_2=ruleEvoMappingNestedExpression();

                    state._fsp--;


                    			current = this_EvoMappingNestedExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDwMappingDsl.g:1394:3: this_EvoMappingNegation_3= ruleEvoMappingNegation
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNegationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNegation_3=ruleEvoMappingNegation();

                    state._fsp--;


                    			current = this_EvoMappingNegation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDwMappingDsl.g:1403:3: this_EvoMappingConditionalFeatureReferenceExpression_4= ruleEvoMappingConditionalFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingConditionalFeatureReferenceExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingConditionalFeatureReferenceExpression_4=ruleEvoMappingConditionalFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingConditionalFeatureReferenceExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDwMappingDsl.g:1412:3: this_EvoMappingContextInformationReferenceExpression_5= ruleEvoMappingContextInformationReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingContextInformationReferenceExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingContextInformationReferenceExpression_5=ruleEvoMappingContextInformationReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingContextInformationReferenceExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDwMappingDsl.g:1421:3: this_EvoMappingAttributeReferenceExpression_6= ruleEvoMappingAttributeReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingAttributeReferenceExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingAttributeReferenceExpression_6=ruleEvoMappingAttributeReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingAttributeReferenceExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDwMappingDsl.g:1430:3: this_EvoMappingValueExpression_7= ruleEvoMappingValueExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingValueExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingValueExpression_7=ruleEvoMappingValueExpression();

                    state._fsp--;


                    			current = this_EvoMappingValueExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDwMappingDsl.g:1439:3: this_EvoMappingBooleanValueExpression_8= ruleEvoMappingBooleanValueExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingBooleanValueExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingBooleanValueExpression_8=ruleEvoMappingBooleanValueExpression();

                    state._fsp--;


                    			current = this_EvoMappingBooleanValueExpression_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDwMappingDsl.g:1448:3: this_EvoMappingMimumumExpression_9= ruleEvoMappingMimumumExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingMimumumExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingMimumumExpression_9=ruleEvoMappingMimumumExpression();

                    state._fsp--;


                    			current = this_EvoMappingMimumumExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDwMappingDsl.g:1457:3: this_EvoMappingMaximumExpression_10= ruleEvoMappingMaximumExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingMaximumExpressionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingMaximumExpression_10=ruleEvoMappingMaximumExpression();

                    state._fsp--;


                    			current = this_EvoMappingMaximumExpression_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDwMappingDsl.g:1466:3: this_EvoMappingNot_11= ruleEvoMappingNot
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNotParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNot_11=ruleEvoMappingNot();

                    state._fsp--;


                    			current = this_EvoMappingNot_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingTerminal"


    // $ANTLR start "entryRuleEvoMappingNestedExpression"
    // InternalDwMappingDsl.g:1478:1: entryRuleEvoMappingNestedExpression returns [EObject current=null] : iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF ;
    public final EObject entryRuleEvoMappingNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNestedExpression = null;


        try {
            // InternalDwMappingDsl.g:1478:67: (iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF )
            // InternalDwMappingDsl.g:1479:2: iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNestedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNestedExpression=ruleEvoMappingNestedExpression();

            state._fsp--;

             current =iv_ruleEvoMappingNestedExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingNestedExpression"


    // $ANTLR start "ruleEvoMappingNestedExpression"
    // InternalDwMappingDsl.g:1485:1: ruleEvoMappingNestedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingNestedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1491:2: ( (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalDwMappingDsl.g:1492:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalDwMappingDsl.g:1492:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalDwMappingDsl.g:1493:3: otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNestedExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDwMappingDsl.g:1497:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalDwMappingDsl.g:1498:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalDwMappingDsl.g:1498:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalDwMappingDsl.g:1499:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingNestedExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNestedExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingNestedExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingNestedExpression"


    // $ANTLR start "entryRuleEvoMappingNot"
    // InternalDwMappingDsl.g:1524:1: entryRuleEvoMappingNot returns [EObject current=null] : iv_ruleEvoMappingNot= ruleEvoMappingNot EOF ;
    public final EObject entryRuleEvoMappingNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNot = null;


        try {
            // InternalDwMappingDsl.g:1524:54: (iv_ruleEvoMappingNot= ruleEvoMappingNot EOF )
            // InternalDwMappingDsl.g:1525:2: iv_ruleEvoMappingNot= ruleEvoMappingNot EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNot=ruleEvoMappingNot();

            state._fsp--;

             current =iv_ruleEvoMappingNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingNot"


    // $ANTLR start "ruleEvoMappingNot"
    // InternalDwMappingDsl.g:1531:1: ruleEvoMappingNot returns [EObject current=null] : (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) ;
    public final EObject ruleEvoMappingNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1537:2: ( (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) )
            // InternalDwMappingDsl.g:1538:2: (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            {
            // InternalDwMappingDsl.g:1538:2: (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            // InternalDwMappingDsl.g:1539:3: otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNotAccess().getExclamationMarkKeyword_0());
            		
            // InternalDwMappingDsl.g:1543:3: ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            // InternalDwMappingDsl.g:1544:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            {
            // InternalDwMappingDsl.g:1544:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            // InternalDwMappingDsl.g:1545:5: lv_operand_1_0= ruleEvoMappingTerminal
            {

            					newCompositeNode(grammarAccess.getEvoMappingNotAccess().getOperandEvoMappingTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_1_0=ruleEvoMappingTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNotRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingNot"


    // $ANTLR start "entryRuleEvoMappingFeatureReferenceExpression"
    // InternalDwMappingDsl.g:1566:1: entryRuleEvoMappingFeatureReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingFeatureReferenceExpression = null;


        try {
            // InternalDwMappingDsl.g:1566:77: (iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF )
            // InternalDwMappingDsl.g:1567:2: iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingFeatureReferenceExpression=ruleEvoMappingFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingFeatureReferenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingFeatureReferenceExpression"


    // $ANTLR start "ruleEvoMappingFeatureReferenceExpression"
    // InternalDwMappingDsl.g:1573:1: ruleEvoMappingFeatureReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleEvoMappingFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:1579:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalDwMappingDsl.g:1580:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalDwMappingDsl.g:1580:2: ( (otherlv_0= RULE_STRING ) )
            // InternalDwMappingDsl.g:1581:3: (otherlv_0= RULE_STRING )
            {
            // InternalDwMappingDsl.g:1581:3: (otherlv_0= RULE_STRING )
            // InternalDwMappingDsl.g:1582:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEvoMappingFeatureReferenceExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEvoMappingFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingFeatureReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingConditionalFeatureReferenceExpression"
    // InternalDwMappingDsl.g:1596:1: entryRuleEvoMappingConditionalFeatureReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingConditionalFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingConditionalFeatureReferenceExpression = null;


        try {
            // InternalDwMappingDsl.g:1596:88: (iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF )
            // InternalDwMappingDsl.g:1597:2: iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingConditionalFeatureReferenceExpression=ruleEvoMappingConditionalFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingConditionalFeatureReferenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingConditionalFeatureReferenceExpression"


    // $ANTLR start "ruleEvoMappingConditionalFeatureReferenceExpression"
    // InternalDwMappingDsl.g:1603:1: ruleEvoMappingConditionalFeatureReferenceExpression returns [EObject current=null] : (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? ) ;
    public final EObject ruleEvoMappingConditionalFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_versionRestriction_2_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1609:2: ( (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? ) )
            // InternalDwMappingDsl.g:1610:2: (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? )
            {
            // InternalDwMappingDsl.g:1610:2: (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? )
            // InternalDwMappingDsl.g:1611:3: otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getQuestionMarkKeyword_0());
            		
            // InternalDwMappingDsl.g:1615:3: ( ( ruleQualifiedName ) )
            // InternalDwMappingDsl.g:1616:4: ( ruleQualifiedName )
            {
            // InternalDwMappingDsl.g:1616:4: ( ruleQualifiedName )
            // InternalDwMappingDsl.g:1617:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:1631:3: ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15||LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDwMappingDsl.g:1632:4: (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction )
                    {
                    // InternalDwMappingDsl.g:1632:4: (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction )
                    // InternalDwMappingDsl.g:1633:5: lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction
                    {

                    					newCompositeNode(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getVersionRestrictionEvoMappingVersionRestrictionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_versionRestriction_2_0=ruleEvoMappingVersionRestriction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionRule());
                    					}
                    					set(
                    						current,
                    						"versionRestriction",
                    						lv_versionRestriction_2_0,
                    						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingVersionRestriction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingConditionalFeatureReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingVersionRestriction"
    // InternalDwMappingDsl.g:1654:1: entryRuleEvoMappingVersionRestriction returns [EObject current=null] : iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF ;
    public final EObject entryRuleEvoMappingVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVersionRestriction = null;


        try {
            // InternalDwMappingDsl.g:1654:69: (iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF )
            // InternalDwMappingDsl.g:1655:2: iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingVersionRestriction=ruleEvoMappingVersionRestriction();

            state._fsp--;

             current =iv_ruleEvoMappingVersionRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingVersionRestriction"


    // $ANTLR start "ruleEvoMappingVersionRestriction"
    // InternalDwMappingDsl.g:1661:1: ruleEvoMappingVersionRestriction returns [EObject current=null] : (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction ) ;
    public final EObject ruleEvoMappingVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingRelativeVersionRestriction_0 = null;

        EObject this_EvoMappingVersionRangeRestriction_1 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1667:2: ( (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction ) )
            // InternalDwMappingDsl.g:1668:2: (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction )
            {
            // InternalDwMappingDsl.g:1668:2: (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==38) ) {
                    alt23=2;
                }
                else if ( ((LA23_1>=12 && LA23_1<=13)||(LA23_1>=28 && LA23_1<=29)||LA23_1==71) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==39) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDwMappingDsl.g:1669:3: this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingVersionRestrictionAccess().getEvoMappingRelativeVersionRestrictionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingRelativeVersionRestriction_0=ruleEvoMappingRelativeVersionRestriction();

                    state._fsp--;


                    			current = this_EvoMappingRelativeVersionRestriction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:1678:3: this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingVersionRestrictionAccess().getEvoMappingVersionRangeRestrictionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingVersionRangeRestriction_1=ruleEvoMappingVersionRangeRestriction();

                    state._fsp--;


                    			current = this_EvoMappingVersionRangeRestriction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingVersionRestriction"


    // $ANTLR start "entryRuleEvoMappingRelativeVersionRestriction"
    // InternalDwMappingDsl.g:1690:1: entryRuleEvoMappingRelativeVersionRestriction returns [EObject current=null] : iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF ;
    public final EObject entryRuleEvoMappingRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingRelativeVersionRestriction = null;


        try {
            // InternalDwMappingDsl.g:1690:77: (iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF )
            // InternalDwMappingDsl.g:1691:2: iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingRelativeVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingRelativeVersionRestriction=ruleEvoMappingRelativeVersionRestriction();

            state._fsp--;

             current =iv_ruleEvoMappingRelativeVersionRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingRelativeVersionRestriction"


    // $ANTLR start "ruleEvoMappingRelativeVersionRestriction"
    // InternalDwMappingDsl.g:1697:1: ruleEvoMappingRelativeVersionRestriction returns [EObject current=null] : (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleEvoMappingRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1703:2: ( (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) )
            // InternalDwMappingDsl.g:1704:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            {
            // InternalDwMappingDsl.g:1704:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            // InternalDwMappingDsl.g:1705:3: otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDwMappingDsl.g:1709:3: ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) )
            // InternalDwMappingDsl.g:1710:4: (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator )
            {
            // InternalDwMappingDsl.g:1710:4: (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator )
            // InternalDwMappingDsl.g:1711:5: lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator
            {

            					newCompositeNode(grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getOperatorEvoMappingRelativeVersionRestrictionOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_operator_1_0=ruleEvoMappingRelativeVersionRestrictionOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingRelativeVersionRestrictionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingRelativeVersionRestrictionOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:1728:3: ( (otherlv_2= RULE_ID ) )
            // InternalDwMappingDsl.g:1729:4: (otherlv_2= RULE_ID )
            {
            // InternalDwMappingDsl.g:1729:4: (otherlv_2= RULE_ID )
            // InternalDwMappingDsl.g:1730:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingRelativeVersionRestrictionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getVersionHyVersionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingRelativeVersionRestriction"


    // $ANTLR start "entryRuleEvoMappingVersionRangeRestriction"
    // InternalDwMappingDsl.g:1749:1: entryRuleEvoMappingVersionRangeRestriction returns [EObject current=null] : iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF ;
    public final EObject entryRuleEvoMappingVersionRangeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVersionRangeRestriction = null;


        try {
            // InternalDwMappingDsl.g:1749:74: (iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF )
            // InternalDwMappingDsl.g:1750:2: iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingVersionRangeRestriction=ruleEvoMappingVersionRangeRestriction();

            state._fsp--;

             current =iv_ruleEvoMappingVersionRangeRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingVersionRangeRestriction"


    // $ANTLR start "ruleEvoMappingVersionRangeRestriction"
    // InternalDwMappingDsl.g:1756:1: ruleEvoMappingVersionRangeRestriction returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) ;
    public final EObject ruleEvoMappingVersionRangeRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerIncluded_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_upperIncluded_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:1762:2: ( ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) )
            // InternalDwMappingDsl.g:1763:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            {
            // InternalDwMappingDsl.g:1763:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalDwMappingDsl.g:1764:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    {
                    // InternalDwMappingDsl.g:1764:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    // InternalDwMappingDsl.g:1765:4: otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_0, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalDwMappingDsl.g:1769:4: ( (lv_lowerIncluded_1_0= 'true' ) )
                    // InternalDwMappingDsl.g:1770:5: (lv_lowerIncluded_1_0= 'true' )
                    {
                    // InternalDwMappingDsl.g:1770:5: (lv_lowerIncluded_1_0= 'true' )
                    // InternalDwMappingDsl.g:1771:6: lv_lowerIncluded_1_0= 'true'
                    {
                    lv_lowerIncluded_1_0=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_lowerIncluded_1_0, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLowerIncludedTrueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    						setWithLastConsumed(current, "lowerIncluded", true, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:1785:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    {
                    // InternalDwMappingDsl.g:1785:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    // InternalDwMappingDsl.g:1786:4: otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getFalseKeyword_1_0());
                    			
                    // InternalDwMappingDsl.g:1790:4: ( ( ruleQualifiedName ) )
                    // InternalDwMappingDsl.g:1791:5: ( ruleQualifiedName )
                    {
                    // InternalDwMappingDsl.g:1791:5: ( ruleQualifiedName )
                    // InternalDwMappingDsl.g:1792:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLowerVersionHyVersionCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getHyphenMinusKeyword_1_2());
                    			
                    // InternalDwMappingDsl.g:1810:4: ( (lv_upperIncluded_5_0= 'true' ) )
                    // InternalDwMappingDsl.g:1811:5: (lv_upperIncluded_5_0= 'true' )
                    {
                    // InternalDwMappingDsl.g:1811:5: (lv_upperIncluded_5_0= 'true' )
                    // InternalDwMappingDsl.g:1812:6: lv_upperIncluded_5_0= 'true'
                    {
                    lv_upperIncluded_5_0=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_upperIncluded_5_0, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getUpperIncludedTrueKeyword_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    						setWithLastConsumed(current, "upperIncluded", true, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDwMappingDsl.g:1826:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    {
                    // InternalDwMappingDsl.g:1826:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    // InternalDwMappingDsl.g:1827:4: otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getFalseKeyword_2_0());
                    			
                    // InternalDwMappingDsl.g:1831:4: ( ( ruleQualifiedName ) )
                    // InternalDwMappingDsl.g:1832:5: ( ruleQualifiedName )
                    {
                    // InternalDwMappingDsl.g:1832:5: ( ruleQualifiedName )
                    // InternalDwMappingDsl.g:1833:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getUpperVersionHyVersionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingVersionRangeRestriction"


    // $ANTLR start "entryRuleEvoMappingContextInformationReferenceExpression"
    // InternalDwMappingDsl.g:1856:1: entryRuleEvoMappingContextInformationReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingContextInformationReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingContextInformationReferenceExpression = null;


        try {
            // InternalDwMappingDsl.g:1856:88: (iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF )
            // InternalDwMappingDsl.g:1857:2: iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingContextInformationReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingContextInformationReferenceExpression=ruleEvoMappingContextInformationReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingContextInformationReferenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingContextInformationReferenceExpression"


    // $ANTLR start "ruleEvoMappingContextInformationReferenceExpression"
    // InternalDwMappingDsl.g:1863:1: ruleEvoMappingContextInformationReferenceExpression returns [EObject current=null] : (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEvoMappingContextInformationReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:1869:2: ( (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) ) )
            // InternalDwMappingDsl.g:1870:2: (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) )
            {
            // InternalDwMappingDsl.g:1870:2: (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) )
            // InternalDwMappingDsl.g:1871:3: otherlv_0= 'context:' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingContextInformationReferenceExpressionAccess().getContextKeyword_0());
            		
            // InternalDwMappingDsl.g:1875:3: ( ( ruleQualifiedName ) )
            // InternalDwMappingDsl.g:1876:4: ( ruleQualifiedName )
            {
            // InternalDwMappingDsl.g:1876:4: ( ruleQualifiedName )
            // InternalDwMappingDsl.g:1877:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingContextInformationReferenceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoMappingContextInformationReferenceExpressionAccess().getContextInformationHyContextualInformationCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingContextInformationReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingAttributeReferenceExpression"
    // InternalDwMappingDsl.g:1895:1: entryRuleEvoMappingAttributeReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingAttributeReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAttributeReferenceExpression = null;


        try {
            // InternalDwMappingDsl.g:1895:79: (iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF )
            // InternalDwMappingDsl.g:1896:2: iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingAttributeReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingAttributeReferenceExpression=ruleEvoMappingAttributeReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingAttributeReferenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingAttributeReferenceExpression"


    // $ANTLR start "ruleEvoMappingAttributeReferenceExpression"
    // InternalDwMappingDsl.g:1902:1: ruleEvoMappingAttributeReferenceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEvoMappingAttributeReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:1908:2: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalDwMappingDsl.g:1909:2: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalDwMappingDsl.g:1909:2: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalDwMappingDsl.g:1910:3: ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalDwMappingDsl.g:1910:3: ( (otherlv_0= RULE_STRING ) )
            // InternalDwMappingDsl.g:1911:4: (otherlv_0= RULE_STRING )
            {
            // InternalDwMappingDsl.g:1911:4: (otherlv_0= RULE_STRING )
            // InternalDwMappingDsl.g:1912:5: otherlv_0= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingAttributeReferenceExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getFullStopKeyword_1());
            		
            // InternalDwMappingDsl.g:1927:3: ( ( ruleQualifiedName ) )
            // InternalDwMappingDsl.g:1928:4: ( ruleQualifiedName )
            {
            // InternalDwMappingDsl.g:1928:4: ( ruleQualifiedName )
            // InternalDwMappingDsl.g:1929:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingAttributeReferenceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getAttributeHyFeatureAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingAttributeReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingValueExpression"
    // InternalDwMappingDsl.g:1947:1: entryRuleEvoMappingValueExpression returns [EObject current=null] : iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF ;
    public final EObject entryRuleEvoMappingValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingValueExpression = null;


        try {
            // InternalDwMappingDsl.g:1947:66: (iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF )
            // InternalDwMappingDsl.g:1948:2: iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingValueExpression=ruleEvoMappingValueExpression();

            state._fsp--;

             current =iv_ruleEvoMappingValueExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingValueExpression"


    // $ANTLR start "ruleEvoMappingValueExpression"
    // InternalDwMappingDsl.g:1954:1: ruleEvoMappingValueExpression returns [EObject current=null] : ( (lv_value_0_0= ruleEvoMappingNumberValue ) ) ;
    public final EObject ruleEvoMappingValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:1960:2: ( ( (lv_value_0_0= ruleEvoMappingNumberValue ) ) )
            // InternalDwMappingDsl.g:1961:2: ( (lv_value_0_0= ruleEvoMappingNumberValue ) )
            {
            // InternalDwMappingDsl.g:1961:2: ( (lv_value_0_0= ruleEvoMappingNumberValue ) )
            // InternalDwMappingDsl.g:1962:3: (lv_value_0_0= ruleEvoMappingNumberValue )
            {
            // InternalDwMappingDsl.g:1962:3: (lv_value_0_0= ruleEvoMappingNumberValue )
            // InternalDwMappingDsl.g:1963:4: lv_value_0_0= ruleEvoMappingNumberValue
            {

            				newCompositeNode(grammarAccess.getEvoMappingValueExpressionAccess().getValueEvoMappingNumberValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEvoMappingNumberValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEvoMappingValueExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingNumberValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingValueExpression"


    // $ANTLR start "entryRuleEvoMappingBooleanValueExpression"
    // InternalDwMappingDsl.g:1983:1: entryRuleEvoMappingBooleanValueExpression returns [EObject current=null] : iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF ;
    public final EObject entryRuleEvoMappingBooleanValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingBooleanValueExpression = null;


        try {
            // InternalDwMappingDsl.g:1983:73: (iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF )
            // InternalDwMappingDsl.g:1984:2: iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingBooleanValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingBooleanValueExpression=ruleEvoMappingBooleanValueExpression();

            state._fsp--;

             current =iv_ruleEvoMappingBooleanValueExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingBooleanValueExpression"


    // $ANTLR start "ruleEvoMappingBooleanValueExpression"
    // InternalDwMappingDsl.g:1990:1: ruleEvoMappingBooleanValueExpression returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleEvoMappingBooleanValueExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:1996:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalDwMappingDsl.g:1997:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalDwMappingDsl.g:1997:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalDwMappingDsl.g:1998:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalDwMappingDsl.g:1998:3: ()
            // InternalDwMappingDsl.g:1999:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoMappingBooleanValueExpressionAccess().getHyBooleanValueExpressionAction_0(),
            					current);
            			

            }

            // InternalDwMappingDsl.g:2005:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDwMappingDsl.g:2006:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalDwMappingDsl.g:2006:4: ( (lv_value_1_0= 'true' ) )
                    // InternalDwMappingDsl.g:2007:5: (lv_value_1_0= 'true' )
                    {
                    // InternalDwMappingDsl.g:2007:5: (lv_value_1_0= 'true' )
                    // InternalDwMappingDsl.g:2008:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getEvoMappingBooleanValueExpressionAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingBooleanValueExpressionRule());
                    						}
                    						setWithLastConsumed(current, "value", true, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:2021:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingBooleanValueExpressionAccess().getFalseKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingBooleanValueExpression"


    // $ANTLR start "entryRuleEvoMappingNumberValue"
    // InternalDwMappingDsl.g:2030:1: entryRuleEvoMappingNumberValue returns [EObject current=null] : iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF ;
    public final EObject entryRuleEvoMappingNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNumberValue = null;


        try {
            // InternalDwMappingDsl.g:2030:62: (iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF )
            // InternalDwMappingDsl.g:2031:2: iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNumberValue=ruleEvoMappingNumberValue();

            state._fsp--;

             current =iv_ruleEvoMappingNumberValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingNumberValue"


    // $ANTLR start "ruleEvoMappingNumberValue"
    // InternalDwMappingDsl.g:2037:1: ruleEvoMappingNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleEvoMappingNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:2043:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalDwMappingDsl.g:2044:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalDwMappingDsl.g:2044:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalDwMappingDsl.g:2045:3: (lv_value_0_0= RULE_INT )
            {
            // InternalDwMappingDsl.g:2045:3: (lv_value_0_0= RULE_INT )
            // InternalDwMappingDsl.g:2046:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getEvoMappingNumberValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEvoMappingNumberValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingNumberValue"


    // $ANTLR start "entryRuleEvoMappingEnumLiteral"
    // InternalDwMappingDsl.g:2065:1: entryRuleEvoMappingEnumLiteral returns [EObject current=null] : iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF ;
    public final EObject entryRuleEvoMappingEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEnumLiteral = null;


        try {
            // InternalDwMappingDsl.g:2065:62: (iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF )
            // InternalDwMappingDsl.g:2066:2: iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingEnumLiteral=ruleEvoMappingEnumLiteral();

            state._fsp--;

             current =iv_ruleEvoMappingEnumLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingEnumLiteral"


    // $ANTLR start "ruleEvoMappingEnumLiteral"
    // InternalDwMappingDsl.g:2072:1: ruleEvoMappingEnumLiteral returns [EObject current=null] : (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) ;
    public final EObject ruleEvoMappingEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_validSince_6_0=null;
        Token otherlv_7=null;
        Token lv_validUntil_8_0=null;
        Token lv_validSince_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_validUntil_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:2078:2: ( (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) )
            // InternalDwMappingDsl.g:2079:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            {
            // InternalDwMappingDsl.g:2079:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            // InternalDwMappingDsl.g:2080:3: otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingEnumLiteralAccess().getEnumLiteralKeyword_0());
            		
            // InternalDwMappingDsl.g:2084:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDwMappingDsl.g:2085:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDwMappingDsl.g:2085:4: (lv_name_1_0= RULE_ID )
            // InternalDwMappingDsl.g:2086:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoMappingEnumLiteralAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingEnumLiteralAccess().getCommaKeyword_2());
            		
            // InternalDwMappingDsl.g:2106:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalDwMappingDsl.g:2107:4: (lv_value_3_0= RULE_INT )
            {
            // InternalDwMappingDsl.g:2107:4: (lv_value_3_0= RULE_INT )
            // InternalDwMappingDsl.g:2108:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            					newLeafNode(lv_value_3_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoMappingEnumLiteralAccess().getRightParenthesisKeyword_4());
            		
            // InternalDwMappingDsl.g:2128:3: (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDwMappingDsl.g:2129:4: otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvoMappingEnumLiteralAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalDwMappingDsl.g:2133:4: ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) )
                    int alt26=3;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_DATE) ) {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1==16) ) {
                            int LA26_3 = input.LA(3);

                            if ( (LA26_3==RULE_DATE) ) {
                                alt26=1;
                            }
                            else if ( (LA26_3==18) ) {
                                alt26=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA26_0==17) ) {
                        alt26=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalDwMappingDsl.g:2134:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            {
                            // InternalDwMappingDsl.g:2134:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            // InternalDwMappingDsl.g:2135:6: ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) )
                            {
                            // InternalDwMappingDsl.g:2135:6: ( (lv_validSince_6_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:2136:7: (lv_validSince_6_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:2136:7: (lv_validSince_6_0= RULE_DATE )
                            // InternalDwMappingDsl.g:2137:8: lv_validSince_6_0= RULE_DATE
                            {
                            lv_validSince_6_0=(Token)match(input,RULE_DATE,FOLLOW_10); 

                            								newLeafNode(lv_validSince_6_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_6_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_7=(Token)match(input,16,FOLLOW_11); 

                            						newLeafNode(otherlv_7, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_0_1());
                            					
                            // InternalDwMappingDsl.g:2157:6: ( (lv_validUntil_8_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:2158:7: (lv_validUntil_8_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:2158:7: (lv_validUntil_8_0= RULE_DATE )
                            // InternalDwMappingDsl.g:2159:8: lv_validUntil_8_0= RULE_DATE
                            {
                            lv_validUntil_8_0=(Token)match(input,RULE_DATE,FOLLOW_12); 

                            								newLeafNode(lv_validUntil_8_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_8_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDwMappingDsl.g:2177:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            {
                            // InternalDwMappingDsl.g:2177:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            // InternalDwMappingDsl.g:2178:6: ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-'
                            {
                            // InternalDwMappingDsl.g:2178:6: ( (lv_validSince_9_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:2179:7: (lv_validSince_9_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:2179:7: (lv_validSince_9_0= RULE_DATE )
                            // InternalDwMappingDsl.g:2180:8: lv_validSince_9_0= RULE_DATE
                            {
                            lv_validSince_9_0=(Token)match(input,RULE_DATE,FOLLOW_10); 

                            								newLeafNode(lv_validSince_9_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_9_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_10=(Token)match(input,16,FOLLOW_12); 

                            						newLeafNode(otherlv_10, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalDwMappingDsl.g:2202:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            {
                            // InternalDwMappingDsl.g:2202:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            // InternalDwMappingDsl.g:2203:6: otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) )
                            {
                            otherlv_11=(Token)match(input,17,FOLLOW_10); 

                            						newLeafNode(otherlv_11, grammarAccess.getEvoMappingEnumLiteralAccess().getEternityKeyword_5_1_2_0());
                            					
                            otherlv_12=(Token)match(input,16,FOLLOW_11); 

                            						newLeafNode(otherlv_12, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_2_1());
                            					
                            // InternalDwMappingDsl.g:2211:6: ( (lv_validUntil_13_0= RULE_DATE ) )
                            // InternalDwMappingDsl.g:2212:7: (lv_validUntil_13_0= RULE_DATE )
                            {
                            // InternalDwMappingDsl.g:2212:7: (lv_validUntil_13_0= RULE_DATE )
                            // InternalDwMappingDsl.g:2213:8: lv_validUntil_13_0= RULE_DATE
                            {
                            lv_validUntil_13_0=(Token)match(input,RULE_DATE,FOLLOW_12); 

                            								newLeafNode(lv_validUntil_13_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_2_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_13_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEvoMappingEnumLiteralAccess().getRightSquareBracketKeyword_5_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingEnumLiteral"


    // $ANTLR start "entryRuleEvoMappingMimumumExpression"
    // InternalDwMappingDsl.g:2240:1: entryRuleEvoMappingMimumumExpression returns [EObject current=null] : iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF ;
    public final EObject entryRuleEvoMappingMimumumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMimumumExpression = null;


        try {
            // InternalDwMappingDsl.g:2240:68: (iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF )
            // InternalDwMappingDsl.g:2241:2: iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingMimumumExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingMimumumExpression=ruleEvoMappingMimumumExpression();

            state._fsp--;

             current =iv_ruleEvoMappingMimumumExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingMimumumExpression"


    // $ANTLR start "ruleEvoMappingMimumumExpression"
    // InternalDwMappingDsl.g:2247:1: ruleEvoMappingMimumumExpression returns [EObject current=null] : (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingMimumumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2253:2: ( (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalDwMappingDsl.g:2254:2: (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalDwMappingDsl.g:2254:2: (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalDwMappingDsl.g:2255:3: otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingMimumumExpressionAccess().getMinKeyword_0());
            		
            // InternalDwMappingDsl.g:2259:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalDwMappingDsl.g:2260:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalDwMappingDsl.g:2260:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalDwMappingDsl.g:2261:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingMimumumExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingMimumumExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingMimumumExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingMimumumExpression"


    // $ANTLR start "entryRuleEvoMappingMaximumExpression"
    // InternalDwMappingDsl.g:2286:1: entryRuleEvoMappingMaximumExpression returns [EObject current=null] : iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF ;
    public final EObject entryRuleEvoMappingMaximumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMaximumExpression = null;


        try {
            // InternalDwMappingDsl.g:2286:68: (iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF )
            // InternalDwMappingDsl.g:2287:2: iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingMaximumExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingMaximumExpression=ruleEvoMappingMaximumExpression();

            state._fsp--;

             current =iv_ruleEvoMappingMaximumExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoMappingMaximumExpression"


    // $ANTLR start "ruleEvoMappingMaximumExpression"
    // InternalDwMappingDsl.g:2293:1: ruleEvoMappingMaximumExpression returns [EObject current=null] : (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingMaximumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2299:2: ( (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalDwMappingDsl.g:2300:2: (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalDwMappingDsl.g:2300:2: (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalDwMappingDsl.g:2301:3: otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingMaximumExpressionAccess().getMaxKeyword_0());
            		
            // InternalDwMappingDsl.g:2305:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalDwMappingDsl.g:2306:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalDwMappingDsl.g:2306:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalDwMappingDsl.g:2307:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingMaximumExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingMaximumExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingMaximumExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingMaximumExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDwMappingDsl.g:2332:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDwMappingDsl.g:2332:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDwMappingDsl.g:2333:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDwMappingDsl.g:2339:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:2345:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDwMappingDsl.g:2346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDwMappingDsl.g:2346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDwMappingDsl.g:2347:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDwMappingDsl.g:2354:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==41) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2355:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEvoExpression"
    // InternalDwMappingDsl.g:2372:1: entryRuleEvoExpression returns [EObject current=null] : iv_ruleEvoExpression= ruleEvoExpression EOF ;
    public final EObject entryRuleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoExpression = null;


        try {
            // InternalDwMappingDsl.g:2372:54: (iv_ruleEvoExpression= ruleEvoExpression EOF )
            // InternalDwMappingDsl.g:2373:2: iv_ruleEvoExpression= ruleEvoExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoExpression=ruleEvoExpression();

            state._fsp--;

             current =iv_ruleEvoExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoExpression"


    // $ANTLR start "ruleEvoExpression"
    // InternalDwMappingDsl.g:2379:1: ruleEvoExpression returns [EObject current=null] : this_EvoXOr_0= ruleEvoXOr ;
    public final EObject ruleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoXOr_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2385:2: (this_EvoXOr_0= ruleEvoXOr )
            // InternalDwMappingDsl.g:2386:2: this_EvoXOr_0= ruleEvoXOr
            {

            		newCompositeNode(grammarAccess.getEvoExpressionAccess().getEvoXOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EvoXOr_0=ruleEvoXOr();

            state._fsp--;


            		current = this_EvoXOr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoExpression"


    // $ANTLR start "entryRuleEvoXOr"
    // InternalDwMappingDsl.g:2397:1: entryRuleEvoXOr returns [EObject current=null] : iv_ruleEvoXOr= ruleEvoXOr EOF ;
    public final EObject entryRuleEvoXOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoXOr = null;


        try {
            // InternalDwMappingDsl.g:2397:47: (iv_ruleEvoXOr= ruleEvoXOr EOF )
            // InternalDwMappingDsl.g:2398:2: iv_ruleEvoXOr= ruleEvoXOr EOF
            {
             newCompositeNode(grammarAccess.getEvoXOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoXOr=ruleEvoXOr();

            state._fsp--;

             current =iv_ruleEvoXOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoXOr"


    // $ANTLR start "ruleEvoXOr"
    // InternalDwMappingDsl.g:2404:1: ruleEvoXOr returns [EObject current=null] : (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* ) ;
    public final EObject ruleEvoXOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoOr_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2410:2: ( (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* ) )
            // InternalDwMappingDsl.g:2411:2: (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* )
            {
            // InternalDwMappingDsl.g:2411:2: (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* )
            // InternalDwMappingDsl.g:2412:3: this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoXOrAccess().getEvoOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_EvoOr_0=ruleEvoOr();

            state._fsp--;


            			current = this_EvoOr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2420:3: ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==45) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2421:4: () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) )
            	    {
            	    // InternalDwMappingDsl.g:2421:4: ()
            	    // InternalDwMappingDsl.g:2422:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoXOrAccess().getEvoXOrOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoXOrAccess().getXorKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2432:4: ( (lv_operand2_3_0= ruleEvoOr ) )
            	    // InternalDwMappingDsl.g:2433:5: (lv_operand2_3_0= ruleEvoOr )
            	    {
            	    // InternalDwMappingDsl.g:2433:5: (lv_operand2_3_0= ruleEvoOr )
            	    // InternalDwMappingDsl.g:2434:6: lv_operand2_3_0= ruleEvoOr
            	    {

            	    						newCompositeNode(grammarAccess.getEvoXOrAccess().getOperand2EvoOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_operand2_3_0=ruleEvoOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoXOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoOr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoXOr"


    // $ANTLR start "entryRuleEvoOr"
    // InternalDwMappingDsl.g:2456:1: entryRuleEvoOr returns [EObject current=null] : iv_ruleEvoOr= ruleEvoOr EOF ;
    public final EObject entryRuleEvoOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoOr = null;


        try {
            // InternalDwMappingDsl.g:2456:46: (iv_ruleEvoOr= ruleEvoOr EOF )
            // InternalDwMappingDsl.g:2457:2: iv_ruleEvoOr= ruleEvoOr EOF
            {
             newCompositeNode(grammarAccess.getEvoOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoOr=ruleEvoOr();

            state._fsp--;

             current =iv_ruleEvoOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoOr"


    // $ANTLR start "ruleEvoOr"
    // InternalDwMappingDsl.g:2463:1: ruleEvoOr returns [EObject current=null] : (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) ;
    public final EObject ruleEvoOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoAnd_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2469:2: ( (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) )
            // InternalDwMappingDsl.g:2470:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            {
            // InternalDwMappingDsl.g:2470:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            // InternalDwMappingDsl.g:2471:3: this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoOrAccess().getEvoAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EvoAnd_0=ruleEvoAnd();

            state._fsp--;


            			current = this_EvoAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2479:3: ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2480:4: () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    {
            	    // InternalDwMappingDsl.g:2480:4: ()
            	    // InternalDwMappingDsl.g:2481:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoOrAccess().getHyOrExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2491:4: ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    // InternalDwMappingDsl.g:2492:5: (lv_operand2_3_0= ruleEvoAnd )
            	    {
            	    // InternalDwMappingDsl.g:2492:5: (lv_operand2_3_0= ruleEvoAnd )
            	    // InternalDwMappingDsl.g:2493:6: lv_operand2_3_0= ruleEvoAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoOrAccess().getOperand2EvoAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_operand2_3_0=ruleEvoAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoOr"


    // $ANTLR start "entryRuleEvoAnd"
    // InternalDwMappingDsl.g:2515:1: entryRuleEvoAnd returns [EObject current=null] : iv_ruleEvoAnd= ruleEvoAnd EOF ;
    public final EObject entryRuleEvoAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAnd = null;


        try {
            // InternalDwMappingDsl.g:2515:47: (iv_ruleEvoAnd= ruleEvoAnd EOF )
            // InternalDwMappingDsl.g:2516:2: iv_ruleEvoAnd= ruleEvoAnd EOF
            {
             newCompositeNode(grammarAccess.getEvoAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAnd=ruleEvoAnd();

            state._fsp--;

             current =iv_ruleEvoAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoAnd"


    // $ANTLR start "ruleEvoAnd"
    // InternalDwMappingDsl.g:2522:1: ruleEvoAnd returns [EObject current=null] : (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) ;
    public final EObject ruleEvoAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoEqual_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2528:2: ( (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) )
            // InternalDwMappingDsl.g:2529:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            {
            // InternalDwMappingDsl.g:2529:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            // InternalDwMappingDsl.g:2530:3: this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoAndAccess().getEvoEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_EvoEqual_0=ruleEvoEqual();

            state._fsp--;


            			current = this_EvoEqual_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2538:3: ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2539:4: () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    {
            	    // InternalDwMappingDsl.g:2539:4: ()
            	    // InternalDwMappingDsl.g:2540:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoAndAccess().getHyAndExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2550:4: ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    // InternalDwMappingDsl.g:2551:5: (lv_operand2_3_0= ruleEvoEqual )
            	    {
            	    // InternalDwMappingDsl.g:2551:5: (lv_operand2_3_0= ruleEvoEqual )
            	    // InternalDwMappingDsl.g:2552:6: lv_operand2_3_0= ruleEvoEqual
            	    {

            	    						newCompositeNode(grammarAccess.getEvoAndAccess().getOperand2EvoEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operand2_3_0=ruleEvoEqual();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoEqual");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoAnd"


    // $ANTLR start "entryRuleEvoEqual"
    // InternalDwMappingDsl.g:2574:1: entryRuleEvoEqual returns [EObject current=null] : iv_ruleEvoEqual= ruleEvoEqual EOF ;
    public final EObject entryRuleEvoEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoEqual = null;


        try {
            // InternalDwMappingDsl.g:2574:49: (iv_ruleEvoEqual= ruleEvoEqual EOF )
            // InternalDwMappingDsl.g:2575:2: iv_ruleEvoEqual= ruleEvoEqual EOF
            {
             newCompositeNode(grammarAccess.getEvoEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoEqual=ruleEvoEqual();

            state._fsp--;

             current =iv_ruleEvoEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoEqual"


    // $ANTLR start "ruleEvoEqual"
    // InternalDwMappingDsl.g:2581:1: ruleEvoEqual returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) ;
    public final EObject ruleEvoEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoUnequal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2587:2: ( (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) )
            // InternalDwMappingDsl.g:2588:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            {
            // InternalDwMappingDsl.g:2588:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            // InternalDwMappingDsl.g:2589:3: this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoEqualAccess().getEvoUnequalParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EvoUnequal_0=ruleEvoUnequal();

            state._fsp--;


            			current = this_EvoUnequal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2597:3: ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2598:4: () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    {
            	    // InternalDwMappingDsl.g:2598:4: ()
            	    // InternalDwMappingDsl.g:2599:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoEqualAccess().getHyEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_41); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoEqualAccess().getEqualsSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2609:4: ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    // InternalDwMappingDsl.g:2610:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    {
            	    // InternalDwMappingDsl.g:2610:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    // InternalDwMappingDsl.g:2611:6: lv_operand2_3_0= ruleEvoUnequalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoEqualAccess().getOperand2EvoUnequalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_operand2_3_0=ruleEvoUnequalSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoEqualRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoUnequalSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoEqual"


    // $ANTLR start "entryRuleEvoUnequalSize"
    // InternalDwMappingDsl.g:2633:1: entryRuleEvoUnequalSize returns [EObject current=null] : iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF ;
    public final EObject entryRuleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequalSize = null;


        try {
            // InternalDwMappingDsl.g:2633:55: (iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF )
            // InternalDwMappingDsl.g:2634:2: iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF
            {
             newCompositeNode(grammarAccess.getEvoUnequalSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoUnequalSize=ruleEvoUnequalSize();

            state._fsp--;

             current =iv_ruleEvoUnequalSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoUnequalSize"


    // $ANTLR start "ruleEvoUnequalSize"
    // InternalDwMappingDsl.g:2640:1: ruleEvoUnequalSize returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoUnequal_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2646:2: ( (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) )
            // InternalDwMappingDsl.g:2647:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            {
            // InternalDwMappingDsl.g:2647:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||(LA33_0>=35 && LA33_0<=36)||(LA33_0>=54 && LA33_0<=55)||(LA33_0>=57 && LA33_0<=60)||(LA33_0>=63 && LA33_0<=66)||(LA33_0>=68 && LA33_0<=70)) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_INT) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDwMappingDsl.g:2648:3: this_EvoUnequal_0= ruleEvoUnequal
                    {

                    			newCompositeNode(grammarAccess.getEvoUnequalSizeAccess().getEvoUnequalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoUnequal_0=ruleEvoUnequal();

                    state._fsp--;


                    			current = this_EvoUnequal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:2657:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoUnequalSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoUnequalSize"


    // $ANTLR start "entryRuleEvoUnequal"
    // InternalDwMappingDsl.g:2669:1: entryRuleEvoUnequal returns [EObject current=null] : iv_ruleEvoUnequal= ruleEvoUnequal EOF ;
    public final EObject entryRuleEvoUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequal = null;


        try {
            // InternalDwMappingDsl.g:2669:51: (iv_ruleEvoUnequal= ruleEvoUnequal EOF )
            // InternalDwMappingDsl.g:2670:2: iv_ruleEvoUnequal= ruleEvoUnequal EOF
            {
             newCompositeNode(grammarAccess.getEvoUnequalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoUnequal=ruleEvoUnequal();

            state._fsp--;

             current =iv_ruleEvoUnequal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoUnequal"


    // $ANTLR start "ruleEvoUnequal"
    // InternalDwMappingDsl.g:2676:1: ruleEvoUnequal returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) ;
    public final EObject ruleEvoUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoImplication_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2682:2: ( (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) )
            // InternalDwMappingDsl.g:2683:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            {
            // InternalDwMappingDsl.g:2683:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            // InternalDwMappingDsl.g:2684:3: this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoUnequalAccess().getEvoImplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_EvoImplication_0=ruleEvoImplication();

            state._fsp--;


            			current = this_EvoImplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2692:3: ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==22) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2693:4: () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    {
            	    // InternalDwMappingDsl.g:2693:4: ()
            	    // InternalDwMappingDsl.g:2694:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoUnequalAccess().getHyNotEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_41); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2704:4: ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    // InternalDwMappingDsl.g:2705:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    {
            	    // InternalDwMappingDsl.g:2705:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    // InternalDwMappingDsl.g:2706:6: lv_operand2_3_0= ruleEvoImplicationSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoUnequalAccess().getOperand2EvoImplicationSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operand2_3_0=ruleEvoImplicationSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoUnequalRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoImplicationSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoUnequal"


    // $ANTLR start "entryRuleEvoImplicationSize"
    // InternalDwMappingDsl.g:2728:1: entryRuleEvoImplicationSize returns [EObject current=null] : iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF ;
    public final EObject entryRuleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplicationSize = null;


        try {
            // InternalDwMappingDsl.g:2728:59: (iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF )
            // InternalDwMappingDsl.g:2729:2: iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF
            {
             newCompositeNode(grammarAccess.getEvoImplicationSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoImplicationSize=ruleEvoImplicationSize();

            state._fsp--;

             current =iv_ruleEvoImplicationSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoImplicationSize"


    // $ANTLR start "ruleEvoImplicationSize"
    // InternalDwMappingDsl.g:2735:1: ruleEvoImplicationSize returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoImplication_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2741:2: ( (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) )
            // InternalDwMappingDsl.g:2742:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            {
            // InternalDwMappingDsl.g:2742:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||(LA35_0>=35 && LA35_0<=36)||(LA35_0>=54 && LA35_0<=55)||(LA35_0>=57 && LA35_0<=60)||(LA35_0>=63 && LA35_0<=66)||(LA35_0>=68 && LA35_0<=70)) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_INT) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDwMappingDsl.g:2743:3: this_EvoImplication_0= ruleEvoImplication
                    {

                    			newCompositeNode(grammarAccess.getEvoImplicationSizeAccess().getEvoImplicationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoImplication_0=ruleEvoImplication();

                    state._fsp--;


                    			current = this_EvoImplication_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:2752:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoImplicationSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoImplicationSize"


    // $ANTLR start "entryRuleEvoImplication"
    // InternalDwMappingDsl.g:2764:1: entryRuleEvoImplication returns [EObject current=null] : iv_ruleEvoImplication= ruleEvoImplication EOF ;
    public final EObject entryRuleEvoImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplication = null;


        try {
            // InternalDwMappingDsl.g:2764:55: (iv_ruleEvoImplication= ruleEvoImplication EOF )
            // InternalDwMappingDsl.g:2765:2: iv_ruleEvoImplication= ruleEvoImplication EOF
            {
             newCompositeNode(grammarAccess.getEvoImplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoImplication=ruleEvoImplication();

            state._fsp--;

             current =iv_ruleEvoImplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoImplication"


    // $ANTLR start "ruleEvoImplication"
    // InternalDwMappingDsl.g:2771:1: ruleEvoImplication returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) ;
    public final EObject ruleEvoImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoBiconditional_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2777:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) )
            // InternalDwMappingDsl.g:2778:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            {
            // InternalDwMappingDsl.g:2778:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            // InternalDwMappingDsl.g:2779:3: this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoImplicationAccess().getEvoBiconditionalParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_EvoBiconditional_0=ruleEvoBiconditional();

            state._fsp--;


            			current = this_EvoBiconditional_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2787:3: ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==46) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2788:4: () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    {
            	    // InternalDwMappingDsl.g:2788:4: ()
            	    // InternalDwMappingDsl.g:2789:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoImplicationAccess().getHyImpliesExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_41); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoImplicationAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2799:4: ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    // InternalDwMappingDsl.g:2800:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    {
            	    // InternalDwMappingDsl.g:2800:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    // InternalDwMappingDsl.g:2801:6: lv_operand2_3_0= ruleEvoBiconditionalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoImplicationAccess().getOperand2EvoBiconditionalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_operand2_3_0=ruleEvoBiconditionalSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoImplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoBiconditionalSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoImplication"


    // $ANTLR start "entryRuleEvoBiconditionalSize"
    // InternalDwMappingDsl.g:2823:1: entryRuleEvoBiconditionalSize returns [EObject current=null] : iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF ;
    public final EObject entryRuleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditionalSize = null;


        try {
            // InternalDwMappingDsl.g:2823:61: (iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF )
            // InternalDwMappingDsl.g:2824:2: iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF
            {
             newCompositeNode(grammarAccess.getEvoBiconditionalSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoBiconditionalSize=ruleEvoBiconditionalSize();

            state._fsp--;

             current =iv_ruleEvoBiconditionalSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoBiconditionalSize"


    // $ANTLR start "ruleEvoBiconditionalSize"
    // InternalDwMappingDsl.g:2830:1: ruleEvoBiconditionalSize returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoBiconditional_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2836:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) )
            // InternalDwMappingDsl.g:2837:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            {
            // InternalDwMappingDsl.g:2837:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=35 && LA37_0<=36)||(LA37_0>=54 && LA37_0<=55)||(LA37_0>=57 && LA37_0<=60)||(LA37_0>=63 && LA37_0<=66)||(LA37_0>=68 && LA37_0<=70)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_INT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDwMappingDsl.g:2838:3: this_EvoBiconditional_0= ruleEvoBiconditional
                    {

                    			newCompositeNode(grammarAccess.getEvoBiconditionalSizeAccess().getEvoBiconditionalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoBiconditional_0=ruleEvoBiconditional();

                    state._fsp--;


                    			current = this_EvoBiconditional_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:2847:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoBiconditionalSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoBiconditionalSize"


    // $ANTLR start "entryRuleEvoBiconditional"
    // InternalDwMappingDsl.g:2859:1: entryRuleEvoBiconditional returns [EObject current=null] : iv_ruleEvoBiconditional= ruleEvoBiconditional EOF ;
    public final EObject entryRuleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditional = null;


        try {
            // InternalDwMappingDsl.g:2859:57: (iv_ruleEvoBiconditional= ruleEvoBiconditional EOF )
            // InternalDwMappingDsl.g:2860:2: iv_ruleEvoBiconditional= ruleEvoBiconditional EOF
            {
             newCompositeNode(grammarAccess.getEvoBiconditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoBiconditional=ruleEvoBiconditional();

            state._fsp--;

             current =iv_ruleEvoBiconditional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoBiconditional"


    // $ANTLR start "ruleEvoBiconditional"
    // InternalDwMappingDsl.g:2866:1: ruleEvoBiconditional returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) ;
    public final EObject ruleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetInclusion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2872:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) )
            // InternalDwMappingDsl.g:2873:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            {
            // InternalDwMappingDsl.g:2873:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            // InternalDwMappingDsl.g:2874:3: this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getEvoSetInclusionParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_EvoSetInclusion_0=ruleEvoSetInclusion();

            state._fsp--;


            			current = this_EvoSetInclusion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2882:3: ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2883:4: () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    {
            	    // InternalDwMappingDsl.g:2883:4: ()
            	    // InternalDwMappingDsl.g:2884:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoBiconditionalAccess().getEvoBinaryExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_41); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoBiconditionalAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2894:4: ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    // InternalDwMappingDsl.g:2895:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    {
            	    // InternalDwMappingDsl.g:2895:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    // InternalDwMappingDsl.g:2896:6: lv_operand2_3_0= ruleEvoSetInclusionSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getOperand2EvoSetInclusionSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_operand2_3_0=ruleEvoSetInclusionSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoBiconditionalRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetInclusionSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoBiconditional"


    // $ANTLR start "entryRuleEvoSetInclusionSize"
    // InternalDwMappingDsl.g:2918:1: entryRuleEvoSetInclusionSize returns [EObject current=null] : iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF ;
    public final EObject entryRuleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusionSize = null;


        try {
            // InternalDwMappingDsl.g:2918:60: (iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF )
            // InternalDwMappingDsl.g:2919:2: iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF
            {
             newCompositeNode(grammarAccess.getEvoSetInclusionSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetInclusionSize=ruleEvoSetInclusionSize();

            state._fsp--;

             current =iv_ruleEvoSetInclusionSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetInclusionSize"


    // $ANTLR start "ruleEvoSetInclusionSize"
    // InternalDwMappingDsl.g:2925:1: ruleEvoSetInclusionSize returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoSetInclusion_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2931:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) )
            // InternalDwMappingDsl.g:2932:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            {
            // InternalDwMappingDsl.g:2932:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||(LA39_0>=35 && LA39_0<=36)||(LA39_0>=54 && LA39_0<=55)||(LA39_0>=57 && LA39_0<=60)||(LA39_0>=63 && LA39_0<=66)||(LA39_0>=68 && LA39_0<=70)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_INT) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDwMappingDsl.g:2933:3: this_EvoSetInclusion_0= ruleEvoSetInclusion
                    {

                    			newCompositeNode(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSetInclusionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetInclusion_0=ruleEvoSetInclusion();

                    state._fsp--;


                    			current = this_EvoSetInclusion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:2942:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetInclusionSize"


    // $ANTLR start "entryRuleEvoSetInclusion"
    // InternalDwMappingDsl.g:2954:1: entryRuleEvoSetInclusion returns [EObject current=null] : iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF ;
    public final EObject entryRuleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusion = null;


        try {
            // InternalDwMappingDsl.g:2954:56: (iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF )
            // InternalDwMappingDsl.g:2955:2: iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF
            {
             newCompositeNode(grammarAccess.getEvoSetInclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetInclusion=ruleEvoSetInclusion();

            state._fsp--;

             current =iv_ruleEvoSetInclusion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetInclusion"


    // $ANTLR start "ruleEvoSetInclusion"
    // InternalDwMappingDsl.g:2961:1: ruleEvoSetInclusion returns [EObject current=null] : (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) ;
    public final EObject ruleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetIntersection_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:2967:2: ( (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) )
            // InternalDwMappingDsl.g:2968:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            {
            // InternalDwMappingDsl.g:2968:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            // InternalDwMappingDsl.g:2969:3: this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getEvoSetIntersectionParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_EvoSetIntersection_0=ruleEvoSetIntersection();

            state._fsp--;


            			current = this_EvoSetIntersection_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:2977:3: ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==48) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDwMappingDsl.g:2978:4: () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    {
            	    // InternalDwMappingDsl.g:2978:4: ()
            	    // InternalDwMappingDsl.g:2979:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetInclusionAccess().getEvoSetInclusionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetInclusionAccess().getInclusionKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:2989:4: ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    // InternalDwMappingDsl.g:2990:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    {
            	    // InternalDwMappingDsl.g:2990:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    // InternalDwMappingDsl.g:2991:6: lv_operand2_3_0= ruleEvoSetIntersection
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getOperand2EvoSetIntersectionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_operand2_3_0=ruleEvoSetIntersection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetInclusionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetIntersection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetInclusion"


    // $ANTLR start "entryRuleEvoSetIntersection"
    // InternalDwMappingDsl.g:3013:1: entryRuleEvoSetIntersection returns [EObject current=null] : iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF ;
    public final EObject entryRuleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetIntersection = null;


        try {
            // InternalDwMappingDsl.g:3013:59: (iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF )
            // InternalDwMappingDsl.g:3014:2: iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF
            {
             newCompositeNode(grammarAccess.getEvoSetIntersectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetIntersection=ruleEvoSetIntersection();

            state._fsp--;

             current =iv_ruleEvoSetIntersection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetIntersection"


    // $ANTLR start "ruleEvoSetIntersection"
    // InternalDwMappingDsl.g:3020:1: ruleEvoSetIntersection returns [EObject current=null] : (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) ;
    public final EObject ruleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetUnion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3026:2: ( (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) )
            // InternalDwMappingDsl.g:3027:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            {
            // InternalDwMappingDsl.g:3027:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            // InternalDwMappingDsl.g:3028:3: this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getEvoSetUnionParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_EvoSetUnion_0=ruleEvoSetUnion();

            state._fsp--;


            			current = this_EvoSetUnion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:3036:3: ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==49) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3037:4: () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    {
            	    // InternalDwMappingDsl.g:3037:4: ()
            	    // InternalDwMappingDsl.g:3038:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetIntersectionAccess().getEvoSetIntersectionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetIntersectionAccess().getIntersectionKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:3048:4: ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    // InternalDwMappingDsl.g:3049:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    {
            	    // InternalDwMappingDsl.g:3049:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    // InternalDwMappingDsl.g:3050:6: lv_operand2_3_0= ruleEvoSetUnion
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getOperand2EvoSetUnionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_operand2_3_0=ruleEvoSetUnion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetIntersectionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetUnion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetIntersection"


    // $ANTLR start "entryRuleEvoSetUnion"
    // InternalDwMappingDsl.g:3072:1: entryRuleEvoSetUnion returns [EObject current=null] : iv_ruleEvoSetUnion= ruleEvoSetUnion EOF ;
    public final EObject entryRuleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetUnion = null;


        try {
            // InternalDwMappingDsl.g:3072:52: (iv_ruleEvoSetUnion= ruleEvoSetUnion EOF )
            // InternalDwMappingDsl.g:3073:2: iv_ruleEvoSetUnion= ruleEvoSetUnion EOF
            {
             newCompositeNode(grammarAccess.getEvoSetUnionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetUnion=ruleEvoSetUnion();

            state._fsp--;

             current =iv_ruleEvoSetUnion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetUnion"


    // $ANTLR start "ruleEvoSetUnion"
    // InternalDwMappingDsl.g:3079:1: ruleEvoSetUnion returns [EObject current=null] : (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) ;
    public final EObject ruleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3085:2: ( (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) )
            // InternalDwMappingDsl.g:3086:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            {
            // InternalDwMappingDsl.g:3086:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            // InternalDwMappingDsl.g:3087:3: this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetUnionAccess().getEvoSetDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_EvoSetDifference_0=ruleEvoSetDifference();

            state._fsp--;


            			current = this_EvoSetDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:3095:3: ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==50) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3096:4: () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    {
            	    // InternalDwMappingDsl.g:3096:4: ()
            	    // InternalDwMappingDsl.g:3097:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetUnionAccess().getEvoSetUnionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetUnionAccess().getUnionKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:3107:4: ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    // InternalDwMappingDsl.g:3108:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    {
            	    // InternalDwMappingDsl.g:3108:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    // InternalDwMappingDsl.g:3109:6: lv_operand2_3_0= ruleEvoSetDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetUnionAccess().getOperand2EvoSetDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_operand2_3_0=ruleEvoSetDifference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetUnionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetDifference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetUnion"


    // $ANTLR start "entryRuleEvoSetDifference"
    // InternalDwMappingDsl.g:3131:1: entryRuleEvoSetDifference returns [EObject current=null] : iv_ruleEvoSetDifference= ruleEvoSetDifference EOF ;
    public final EObject entryRuleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetDifference = null;


        try {
            // InternalDwMappingDsl.g:3131:57: (iv_ruleEvoSetDifference= ruleEvoSetDifference EOF )
            // InternalDwMappingDsl.g:3132:2: iv_ruleEvoSetDifference= ruleEvoSetDifference EOF
            {
             newCompositeNode(grammarAccess.getEvoSetDifferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetDifference=ruleEvoSetDifference();

            state._fsp--;

             current =iv_ruleEvoSetDifference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetDifference"


    // $ANTLR start "ruleEvoSetDifference"
    // InternalDwMappingDsl.g:3138:1: ruleEvoSetDifference returns [EObject current=null] : (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) ;
    public final EObject ruleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetSymmetricDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3144:2: ( (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) )
            // InternalDwMappingDsl.g:3145:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            {
            // InternalDwMappingDsl.g:3145:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            // InternalDwMappingDsl.g:3146:3: this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getEvoSetSymmetricDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_EvoSetSymmetricDifference_0=ruleEvoSetSymmetricDifference();

            state._fsp--;


            			current = this_EvoSetSymmetricDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:3154:3: ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==51) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3155:4: () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    {
            	    // InternalDwMappingDsl.g:3155:4: ()
            	    // InternalDwMappingDsl.g:3156:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetDifferenceAccess().getEvoSetDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetDifferenceAccess().getDifferenceKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:3166:4: ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    // InternalDwMappingDsl.g:3167:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    {
            	    // InternalDwMappingDsl.g:3167:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    // InternalDwMappingDsl.g:3168:6: lv_operand2_3_0= ruleEvoSetSymmetricDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getOperand2EvoSetSymmetricDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_operand2_3_0=ruleEvoSetSymmetricDifference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetDifferenceRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetSymmetricDifference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetDifference"


    // $ANTLR start "entryRuleEvoSetSymmetricDifference"
    // InternalDwMappingDsl.g:3190:1: entryRuleEvoSetSymmetricDifference returns [EObject current=null] : iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF ;
    public final EObject entryRuleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetSymmetricDifference = null;


        try {
            // InternalDwMappingDsl.g:3190:66: (iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF )
            // InternalDwMappingDsl.g:3191:2: iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF
            {
             newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetSymmetricDifference=ruleEvoSetSymmetricDifference();

            state._fsp--;

             current =iv_ruleEvoSetSymmetricDifference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetSymmetricDifference"


    // $ANTLR start "ruleEvoSetSymmetricDifference"
    // InternalDwMappingDsl.g:3197:1: ruleEvoSetSymmetricDifference returns [EObject current=null] : (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) ;
    public final EObject ruleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetCartesianProduct_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3203:2: ( (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) )
            // InternalDwMappingDsl.g:3204:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            {
            // InternalDwMappingDsl.g:3204:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            // InternalDwMappingDsl.g:3205:3: this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetCartesianProductParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_EvoSetCartesianProduct_0=ruleEvoSetCartesianProduct();

            state._fsp--;


            			current = this_EvoSetCartesianProduct_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:3213:3: ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==52) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3214:4: () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    {
            	    // InternalDwMappingDsl.g:3214:4: ()
            	    // InternalDwMappingDsl.g:3215:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetSymmetricDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetSymmetricDifferenceAccess().getSymmetric_differenceKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:3225:4: ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    // InternalDwMappingDsl.g:3226:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    {
            	    // InternalDwMappingDsl.g:3226:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    // InternalDwMappingDsl.g:3227:6: lv_operand2_3_0= ruleEvoSetCartesianProduct
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2EvoSetCartesianProductParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_operand2_3_0=ruleEvoSetCartesianProduct();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetSymmetricDifferenceRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetCartesianProduct");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetSymmetricDifference"


    // $ANTLR start "entryRuleEvoSetCartesianProduct"
    // InternalDwMappingDsl.g:3249:1: entryRuleEvoSetCartesianProduct returns [EObject current=null] : iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF ;
    public final EObject entryRuleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetCartesianProduct = null;


        try {
            // InternalDwMappingDsl.g:3249:63: (iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF )
            // InternalDwMappingDsl.g:3250:2: iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF
            {
             newCompositeNode(grammarAccess.getEvoSetCartesianProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetCartesianProduct=ruleEvoSetCartesianProduct();

            state._fsp--;

             current =iv_ruleEvoSetCartesianProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetCartesianProduct"


    // $ANTLR start "ruleEvoSetCartesianProduct"
    // InternalDwMappingDsl.g:3256:1: ruleEvoSetCartesianProduct returns [EObject current=null] : (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) ;
    public final EObject ruleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoElementOf_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3262:2: ( (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) )
            // InternalDwMappingDsl.g:3263:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            {
            // InternalDwMappingDsl.g:3263:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            // InternalDwMappingDsl.g:3264:3: this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getEvoElementOfParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_EvoElementOf_0=ruleEvoElementOf();

            state._fsp--;


            			current = this_EvoElementOf_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:3272:3: ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==53) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3273:4: () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    {
            	    // InternalDwMappingDsl.g:3273:4: ()
            	    // InternalDwMappingDsl.g:3274:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetCartesianProductAccess().getEvoSetCartesianProductOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetCartesianProductAccess().getXKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:3284:4: ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    // InternalDwMappingDsl.g:3285:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    {
            	    // InternalDwMappingDsl.g:3285:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    // InternalDwMappingDsl.g:3286:6: lv_operand2_3_0= ruleEvoElementOf
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getOperand2EvoElementOfParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_operand2_3_0=ruleEvoElementOf();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetCartesianProductRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoElementOf");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetCartesianProduct"


    // $ANTLR start "entryRuleEvoSetCardinality"
    // InternalDwMappingDsl.g:3308:1: entryRuleEvoSetCardinality returns [EObject current=null] : iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF ;
    public final EObject entryRuleEvoSetCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetCardinality = null;


        try {
            // InternalDwMappingDsl.g:3308:58: (iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF )
            // InternalDwMappingDsl.g:3309:2: iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF
            {
             newCompositeNode(grammarAccess.getEvoSetCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetCardinality=ruleEvoSetCardinality();

            state._fsp--;

             current =iv_ruleEvoSetCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetCardinality"


    // $ANTLR start "ruleEvoSetCardinality"
    // InternalDwMappingDsl.g:3315:1: ruleEvoSetCardinality returns [EObject current=null] : ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) ) ;
    public final EObject ruleEvoSetCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_6_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3321:2: ( ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) ) )
            // InternalDwMappingDsl.g:3322:2: ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) )
            {
            // InternalDwMappingDsl.g:3322:2: ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) )
            // InternalDwMappingDsl.g:3323:3: () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            {
            // InternalDwMappingDsl.g:3323:3: ()
            // InternalDwMappingDsl.g:3324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSetCardinalityAccess().getEvoSetCardinalityAction_0(),
            					current);
            			

            }

            // InternalDwMappingDsl.g:3330:3: ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            else if ( (LA46_0==55) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDwMappingDsl.g:3331:4: (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' )
                    {
                    // InternalDwMappingDsl.g:3331:4: (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' )
                    // InternalDwMappingDsl.g:3332:5: otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_40); 

                    					newLeafNode(otherlv_1, grammarAccess.getEvoSetCardinalityAccess().getVerticalLineKeyword_1_0_0());
                    				
                    // InternalDwMappingDsl.g:3336:5: ( (lv_operand_2_0= ruleEvoExpression ) )
                    // InternalDwMappingDsl.g:3337:6: (lv_operand_2_0= ruleEvoExpression )
                    {
                    // InternalDwMappingDsl.g:3337:6: (lv_operand_2_0= ruleEvoExpression )
                    // InternalDwMappingDsl.g:3338:7: lv_operand_2_0= ruleEvoExpression
                    {

                    							newCompositeNode(grammarAccess.getEvoSetCardinalityAccess().getOperandEvoExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_50);
                    lv_operand_2_0=ruleEvoExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEvoSetCardinalityRule());
                    							}
                    							set(
                    								current,
                    								"operand",
                    								lv_operand_2_0,
                    								"de.evorepair.logic.EvoLogicDsl.EvoExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getEvoSetCardinalityAccess().getVerticalLineKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:3361:4: (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
                    {
                    // InternalDwMappingDsl.g:3361:4: (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
                    // InternalDwMappingDsl.g:3362:5: otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_51); 

                    					newLeafNode(otherlv_4, grammarAccess.getEvoSetCardinalityAccess().getSizeKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,35,FOLLOW_40); 

                    					newLeafNode(otherlv_5, grammarAccess.getEvoSetCardinalityAccess().getLeftParenthesisKeyword_1_1_1());
                    				
                    // InternalDwMappingDsl.g:3370:5: ( (lv_operand_6_0= ruleEvoExpression ) )
                    // InternalDwMappingDsl.g:3371:6: (lv_operand_6_0= ruleEvoExpression )
                    {
                    // InternalDwMappingDsl.g:3371:6: (lv_operand_6_0= ruleEvoExpression )
                    // InternalDwMappingDsl.g:3372:7: lv_operand_6_0= ruleEvoExpression
                    {

                    							newCompositeNode(grammarAccess.getEvoSetCardinalityAccess().getOperandEvoExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_31);
                    lv_operand_6_0=ruleEvoExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEvoSetCardinalityRule());
                    							}
                    							set(
                    								current,
                    								"operand",
                    								lv_operand_6_0,
                    								"de.evorepair.logic.EvoLogicDsl.EvoExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getEvoSetCardinalityAccess().getRightParenthesisKeyword_1_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetCardinality"


    // $ANTLR start "entryRuleEvoElementOf"
    // InternalDwMappingDsl.g:3399:1: entryRuleEvoElementOf returns [EObject current=null] : iv_ruleEvoElementOf= ruleEvoElementOf EOF ;
    public final EObject entryRuleEvoElementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoElementOf = null;


        try {
            // InternalDwMappingDsl.g:3399:53: (iv_ruleEvoElementOf= ruleEvoElementOf EOF )
            // InternalDwMappingDsl.g:3400:2: iv_ruleEvoElementOf= ruleEvoElementOf EOF
            {
             newCompositeNode(grammarAccess.getEvoElementOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoElementOf=ruleEvoElementOf();

            state._fsp--;

             current =iv_ruleEvoElementOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoElementOf"


    // $ANTLR start "ruleEvoElementOf"
    // InternalDwMappingDsl.g:3406:1: ruleEvoElementOf returns [EObject current=null] : (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* ) ;
    public final EObject ruleEvoElementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoTerminal_0 = null;

        EObject lv_operand2_3_1 = null;

        EObject lv_operand2_3_2 = null;

        EObject lv_operand2_3_3 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3412:2: ( (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* ) )
            // InternalDwMappingDsl.g:3413:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* )
            {
            // InternalDwMappingDsl.g:3413:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* )
            // InternalDwMappingDsl.g:3414:3: this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoElementOfAccess().getEvoTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_EvoTerminal_0=ruleEvoTerminal();

            state._fsp--;


            			current = this_EvoTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDwMappingDsl.g:3422:3: ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==56) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3423:4: () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) )
            	    {
            	    // InternalDwMappingDsl.g:3423:4: ()
            	    // InternalDwMappingDsl.g:3424:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoElementOfAccess().getEvoElementOfOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_53); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoElementOfAccess().getElementOfKeyword_1_1());
            	    			
            	    // InternalDwMappingDsl.g:3434:4: ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) )
            	    // InternalDwMappingDsl.g:3435:5: ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) )
            	    {
            	    // InternalDwMappingDsl.g:3435:5: ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) )
            	    // InternalDwMappingDsl.g:3436:6: (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal )
            	    {
            	    // InternalDwMappingDsl.g:3436:6: (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal )
            	    int alt47=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 35:
            	    case 36:
            	    case 54:
            	    case 55:
            	    case 57:
            	    case 58:
            	    case 59:
            	    case 60:
            	    case 63:
            	    case 64:
            	    case 65:
            	    case 66:
            	    case 68:
            	    case 69:
            	    case 70:
            	        {
            	        alt47=1;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt47=2;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt47=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt47) {
            	        case 1 :
            	            // InternalDwMappingDsl.g:3437:7: lv_operand2_3_1= ruleEvoTerminal
            	            {

            	            							newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoTerminalParserRuleCall_1_2_0_0());
            	            						
            	            pushFollow(FOLLOW_52);
            	            lv_operand2_3_1=ruleEvoTerminal();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	            							}
            	            							set(
            	            								current,
            	            								"operand2",
            	            								lv_operand2_3_1,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoTerminal");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDwMappingDsl.g:3453:7: lv_operand2_3_2= ruleEvoAllMappingTerminal
            	            {

            	            							newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoAllMappingTerminalParserRuleCall_1_2_0_1());
            	            						
            	            pushFollow(FOLLOW_52);
            	            lv_operand2_3_2=ruleEvoAllMappingTerminal();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	            							}
            	            							set(
            	            								current,
            	            								"operand2",
            	            								lv_operand2_3_2,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoAllMappingTerminal");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDwMappingDsl.g:3469:7: lv_operand2_3_3= ruleEvoAllConfigurationTerminal
            	            {

            	            							newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoAllConfigurationTerminalParserRuleCall_1_2_0_2());
            	            						
            	            pushFollow(FOLLOW_52);
            	            lv_operand2_3_3=ruleEvoAllConfigurationTerminal();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	            							}
            	            							set(
            	            								current,
            	            								"operand2",
            	            								lv_operand2_3_3,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoAllConfigurationTerminal");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoElementOf"


    // $ANTLR start "entryRuleEvoForAll"
    // InternalDwMappingDsl.g:3492:1: entryRuleEvoForAll returns [EObject current=null] : iv_ruleEvoForAll= ruleEvoForAll EOF ;
    public final EObject entryRuleEvoForAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoForAll = null;


        try {
            // InternalDwMappingDsl.g:3492:50: (iv_ruleEvoForAll= ruleEvoForAll EOF )
            // InternalDwMappingDsl.g:3493:2: iv_ruleEvoForAll= ruleEvoForAll EOF
            {
             newCompositeNode(grammarAccess.getEvoForAllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoForAll=ruleEvoForAll();

            state._fsp--;

             current =iv_ruleEvoForAll; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoForAll"


    // $ANTLR start "ruleEvoForAll"
    // InternalDwMappingDsl.g:3499:1: ruleEvoForAll returns [EObject current=null] : (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleEvoForAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_boundedVariables_2_0 = null;

        EObject lv_boundedVariables_4_0 = null;

        EObject lv_operand_6_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3505:2: ( (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            // InternalDwMappingDsl.g:3506:2: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
            {
            // InternalDwMappingDsl.g:3506:2: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
            // InternalDwMappingDsl.g:3507:3: otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoForAllAccess().getForAllKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoForAllAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDwMappingDsl.g:3515:3: ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) )
            // InternalDwMappingDsl.g:3516:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            {
            // InternalDwMappingDsl.g:3516:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            // InternalDwMappingDsl.g:3517:5: lv_boundedVariables_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoForAllAccess().getBoundedVariablesEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_boundedVariables_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            					}
            					add(
            						current,
            						"boundedVariables",
            						lv_boundedVariables_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:3534:3: (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==26) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3535:4: otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEvoForAllAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDwMappingDsl.g:3539:4: ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) )
            	    // InternalDwMappingDsl.g:3540:5: (lv_boundedVariables_4_0= ruleEvoVariableTerm )
            	    {
            	    // InternalDwMappingDsl.g:3540:5: (lv_boundedVariables_4_0= ruleEvoVariableTerm )
            	    // InternalDwMappingDsl.g:3541:6: lv_boundedVariables_4_0= ruleEvoVariableTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEvoForAllAccess().getBoundedVariablesEvoVariableTermParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_boundedVariables_4_0=ruleEvoVariableTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            	    						}
            	    						add(
            	    							current,
            	    							"boundedVariables",
            	    							lv_boundedVariables_4_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoForAllAccess().getColonKeyword_4());
            		
            // InternalDwMappingDsl.g:3563:3: ( (lv_operand_6_0= ruleEvoExpression ) )
            // InternalDwMappingDsl.g:3564:4: (lv_operand_6_0= ruleEvoExpression )
            {
            // InternalDwMappingDsl.g:3564:4: (lv_operand_6_0= ruleEvoExpression )
            // InternalDwMappingDsl.g:3565:5: lv_operand_6_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoForAllAccess().getOperandEvoExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_31);
            lv_operand_6_0=ruleEvoExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_6_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoForAllAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoForAll"


    // $ANTLR start "entryRuleEvoExists"
    // InternalDwMappingDsl.g:3590:1: entryRuleEvoExists returns [EObject current=null] : iv_ruleEvoExists= ruleEvoExists EOF ;
    public final EObject entryRuleEvoExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoExists = null;


        try {
            // InternalDwMappingDsl.g:3590:50: (iv_ruleEvoExists= ruleEvoExists EOF )
            // InternalDwMappingDsl.g:3591:2: iv_ruleEvoExists= ruleEvoExists EOF
            {
             newCompositeNode(grammarAccess.getEvoExistsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoExists=ruleEvoExists();

            state._fsp--;

             current =iv_ruleEvoExists; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoExists"


    // $ANTLR start "ruleEvoExists"
    // InternalDwMappingDsl.g:3597:1: ruleEvoExists returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleEvoExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_boundedVariables_2_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3603:2: ( (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' ) )
            // InternalDwMappingDsl.g:3604:2: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' )
            {
            // InternalDwMappingDsl.g:3604:2: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' )
            // InternalDwMappingDsl.g:3605:3: otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoExistsAccess().getExistsKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoExistsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDwMappingDsl.g:3613:3: ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) )
            // InternalDwMappingDsl.g:3614:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            {
            // InternalDwMappingDsl.g:3614:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            // InternalDwMappingDsl.g:3615:5: lv_boundedVariables_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoExistsAccess().getBoundedVariablesEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_boundedVariables_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoExistsRule());
            					}
            					add(
            						current,
            						"boundedVariables",
            						lv_boundedVariables_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoExistsAccess().getColonKeyword_3());
            		
            // InternalDwMappingDsl.g:3636:3: ( (lv_operand_4_0= ruleEvoExpression ) )
            // InternalDwMappingDsl.g:3637:4: (lv_operand_4_0= ruleEvoExpression )
            {
            // InternalDwMappingDsl.g:3637:4: (lv_operand_4_0= ruleEvoExpression )
            // InternalDwMappingDsl.g:3638:5: lv_operand_4_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoExistsAccess().getOperandEvoExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_operand_4_0=ruleEvoExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoExistsRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_4_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoExistsAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoExists"


    // $ANTLR start "entryRuleEvoNot"
    // InternalDwMappingDsl.g:3663:1: entryRuleEvoNot returns [EObject current=null] : iv_ruleEvoNot= ruleEvoNot EOF ;
    public final EObject entryRuleEvoNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoNot = null;


        try {
            // InternalDwMappingDsl.g:3663:47: (iv_ruleEvoNot= ruleEvoNot EOF )
            // InternalDwMappingDsl.g:3664:2: iv_ruleEvoNot= ruleEvoNot EOF
            {
             newCompositeNode(grammarAccess.getEvoNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoNot=ruleEvoNot();

            state._fsp--;

             current =iv_ruleEvoNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoNot"


    // $ANTLR start "ruleEvoNot"
    // InternalDwMappingDsl.g:3670:1: ruleEvoNot returns [EObject current=null] : ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) ) ;
    public final EObject ruleEvoNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3676:2: ( ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) ) )
            // InternalDwMappingDsl.g:3677:2: ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) )
            {
            // InternalDwMappingDsl.g:3677:2: ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            else if ( (LA50_0==36) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalDwMappingDsl.g:3678:3: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
                    {
                    // InternalDwMappingDsl.g:3678:3: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
                    // InternalDwMappingDsl.g:3679:4: otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,59,FOLLOW_51); 

                    				newLeafNode(otherlv_0, grammarAccess.getEvoNotAccess().getNotKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,35,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getEvoNotAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDwMappingDsl.g:3687:4: ( (lv_operand_2_0= ruleEvoExpression ) )
                    // InternalDwMappingDsl.g:3688:5: (lv_operand_2_0= ruleEvoExpression )
                    {
                    // InternalDwMappingDsl.g:3688:5: (lv_operand_2_0= ruleEvoExpression )
                    // InternalDwMappingDsl.g:3689:6: lv_operand_2_0= ruleEvoExpression
                    {

                    						newCompositeNode(grammarAccess.getEvoNotAccess().getOperandEvoExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_operand_2_0=ruleEvoExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoNotRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_2_0,
                    							"de.evorepair.logic.EvoLogicDsl.EvoExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoNotAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:3712:3: (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) )
                    {
                    // InternalDwMappingDsl.g:3712:3: (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) )
                    // InternalDwMappingDsl.g:3713:4: otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoNotAccess().getExclamationMarkKeyword_1_0());
                    			
                    // InternalDwMappingDsl.g:3717:4: ( (lv_operand_5_0= ruleEvoVariableTerm ) )
                    // InternalDwMappingDsl.g:3718:5: (lv_operand_5_0= ruleEvoVariableTerm )
                    {
                    // InternalDwMappingDsl.g:3718:5: (lv_operand_5_0= ruleEvoVariableTerm )
                    // InternalDwMappingDsl.g:3719:6: lv_operand_5_0= ruleEvoVariableTerm
                    {

                    						newCompositeNode(grammarAccess.getEvoNotAccess().getOperandEvoVariableTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_5_0=ruleEvoVariableTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoNotRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_5_0,
                    							"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoNot"


    // $ANTLR start "entryRuleEvoSatisfiable"
    // InternalDwMappingDsl.g:3741:1: entryRuleEvoSatisfiable returns [EObject current=null] : iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF ;
    public final EObject entryRuleEvoSatisfiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSatisfiable = null;


        try {
            // InternalDwMappingDsl.g:3741:55: (iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF )
            // InternalDwMappingDsl.g:3742:2: iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF
            {
             newCompositeNode(grammarAccess.getEvoSatisfiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSatisfiable=ruleEvoSatisfiable();

            state._fsp--;

             current =iv_ruleEvoSatisfiable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSatisfiable"


    // $ANTLR start "ruleEvoSatisfiable"
    // InternalDwMappingDsl.g:3748:1: ruleEvoSatisfiable returns [EObject current=null] : ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEvoSatisfiable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variables_3_1 = null;

        EObject lv_variables_3_2 = null;

        EObject lv_variables_5_1 = null;

        EObject lv_variables_5_2 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3754:2: ( ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' ) )
            // InternalDwMappingDsl.g:3755:2: ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' )
            {
            // InternalDwMappingDsl.g:3755:2: ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' )
            // InternalDwMappingDsl.g:3756:3: () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')'
            {
            // InternalDwMappingDsl.g:3756:3: ()
            // InternalDwMappingDsl.g:3757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSatisfiableAccess().getEvoSatisfiableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoSatisfiableAccess().getSatisfiableKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoSatisfiableAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDwMappingDsl.g:3771:3: ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) )
            // InternalDwMappingDsl.g:3772:4: ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) )
            {
            // InternalDwMappingDsl.g:3772:4: ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) )
            // InternalDwMappingDsl.g:3773:5: (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm )
            {
            // InternalDwMappingDsl.g:3773:5: (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==36||LA51_0==59||LA51_0==66) ) {
                alt51=1;
            }
            else if ( (LA51_0==63) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDwMappingDsl.g:3774:6: lv_variables_3_1= ruleEvoSetVariable
                    {

                    						newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoSetVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_variables_3_1=ruleEvoSetVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_3_1,
                    							"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:3790:6: lv_variables_3_2= ruleEvoApplicationConstraintTerm
                    {

                    						newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoApplicationConstraintTermParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_22);
                    lv_variables_3_2=ruleEvoApplicationConstraintTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_3_2,
                    							"de.evorepair.logic.EvoLogicDsl.EvoApplicationConstraintTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalDwMappingDsl.g:3808:3: (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==26) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDwMappingDsl.g:3809:4: otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_55); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEvoSatisfiableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDwMappingDsl.g:3813:4: ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) )
            	    // InternalDwMappingDsl.g:3814:5: ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) )
            	    {
            	    // InternalDwMappingDsl.g:3814:5: ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) )
            	    // InternalDwMappingDsl.g:3815:6: (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm )
            	    {
            	    // InternalDwMappingDsl.g:3815:6: (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm )
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==RULE_ID||LA52_0==36||LA52_0==59||LA52_0==66) ) {
            	        alt52=1;
            	    }
            	    else if ( (LA52_0==63) ) {
            	        alt52=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalDwMappingDsl.g:3816:7: lv_variables_5_1= ruleEvoSetVariable
            	            {

            	            							newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoSetVariableParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_22);
            	            lv_variables_5_1=ruleEvoSetVariable();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"variables",
            	            								lv_variables_5_1,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDwMappingDsl.g:3832:7: lv_variables_5_2= ruleEvoApplicationConstraintTerm
            	            {

            	            							newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoApplicationConstraintTermParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_22);
            	            lv_variables_5_2=ruleEvoApplicationConstraintTerm();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"variables",
            	            								lv_variables_5_2,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoApplicationConstraintTerm");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEvoSatisfiableAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSatisfiable"


    // $ANTLR start "entryRuleEvoTerminal"
    // InternalDwMappingDsl.g:3859:1: entryRuleEvoTerminal returns [EObject current=null] : iv_ruleEvoTerminal= ruleEvoTerminal EOF ;
    public final EObject entryRuleEvoTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoTerminal = null;


        try {
            // InternalDwMappingDsl.g:3859:52: (iv_ruleEvoTerminal= ruleEvoTerminal EOF )
            // InternalDwMappingDsl.g:3860:2: iv_ruleEvoTerminal= ruleEvoTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoTerminal=ruleEvoTerminal();

            state._fsp--;

             current =iv_ruleEvoTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoTerminal"


    // $ANTLR start "ruleEvoTerminal"
    // InternalDwMappingDsl.g:3866:1: ruleEvoTerminal returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) ) ;
    public final EObject ruleEvoTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_EvoVariableTerm_0 = null;

        EObject this_EvoSetTerm_1 = null;

        EObject this_EvoApplicationConstraintTerm_2 = null;

        EObject this_EvoForAll_3 = null;

        EObject this_EvoExists_4 = null;

        EObject this_EvoNot_5 = null;

        EObject this_EvoFeatureType_6 = null;

        EObject this_EvoGroupType_7 = null;

        EObject this_EvoSetCardinality_8 = null;

        EObject this_EvoChildrenOf_9 = null;

        EObject this_EvoParentOf_10 = null;

        EObject this_EvoSiblingsOf_11 = null;

        EObject this_EvoSatisfiable_12 = null;

        EObject this_EvoXOr_14 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:3872:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) ) )
            // InternalDwMappingDsl.g:3873:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) )
            {
            // InternalDwMappingDsl.g:3873:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) )
            int alt54=14;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt54=1;
                }
                break;
            case 66:
                {
                alt54=2;
                }
                break;
            case 63:
                {
                alt54=3;
                }
                break;
            case 57:
                {
                alt54=4;
                }
                break;
            case 58:
                {
                alt54=5;
                }
                break;
            case 36:
            case 59:
                {
                alt54=6;
                }
                break;
            case 64:
                {
                alt54=7;
                }
                break;
            case 65:
                {
                alt54=8;
                }
                break;
            case 54:
            case 55:
                {
                alt54=9;
                }
                break;
            case 70:
                {
                alt54=10;
                }
                break;
            case 68:
                {
                alt54=11;
                }
                break;
            case 69:
                {
                alt54=12;
                }
                break;
            case 60:
                {
                alt54=13;
                }
                break;
            case 35:
                {
                alt54=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalDwMappingDsl.g:3874:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoVariableTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoVariableTerm_0=ruleEvoVariableTerm();

                    state._fsp--;


                    			current = this_EvoVariableTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:3883:3: this_EvoSetTerm_1= ruleEvoSetTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSetTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetTerm_1=ruleEvoSetTerm();

                    state._fsp--;


                    			current = this_EvoSetTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDwMappingDsl.g:3892:3: this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoApplicationConstraintTermParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoApplicationConstraintTerm_2=ruleEvoApplicationConstraintTerm();

                    state._fsp--;


                    			current = this_EvoApplicationConstraintTerm_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDwMappingDsl.g:3901:3: this_EvoForAll_3= ruleEvoForAll
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoForAllParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoForAll_3=ruleEvoForAll();

                    state._fsp--;


                    			current = this_EvoForAll_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDwMappingDsl.g:3910:3: this_EvoExists_4= ruleEvoExists
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoExistsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoExists_4=ruleEvoExists();

                    state._fsp--;


                    			current = this_EvoExists_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDwMappingDsl.g:3919:3: this_EvoNot_5= ruleEvoNot
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoNotParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoNot_5=ruleEvoNot();

                    state._fsp--;


                    			current = this_EvoNot_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDwMappingDsl.g:3928:3: this_EvoFeatureType_6= ruleEvoFeatureType
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoFeatureTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoFeatureType_6=ruleEvoFeatureType();

                    state._fsp--;


                    			current = this_EvoFeatureType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDwMappingDsl.g:3937:3: this_EvoGroupType_7= ruleEvoGroupType
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoGroupTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoGroupType_7=ruleEvoGroupType();

                    state._fsp--;


                    			current = this_EvoGroupType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDwMappingDsl.g:3946:3: this_EvoSetCardinality_8= ruleEvoSetCardinality
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSetCardinalityParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetCardinality_8=ruleEvoSetCardinality();

                    state._fsp--;


                    			current = this_EvoSetCardinality_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDwMappingDsl.g:3955:3: this_EvoChildrenOf_9= ruleEvoChildrenOf
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoChildrenOfParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoChildrenOf_9=ruleEvoChildrenOf();

                    state._fsp--;


                    			current = this_EvoChildrenOf_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDwMappingDsl.g:3964:3: this_EvoParentOf_10= ruleEvoParentOf
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoParentOfParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoParentOf_10=ruleEvoParentOf();

                    state._fsp--;


                    			current = this_EvoParentOf_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDwMappingDsl.g:3973:3: this_EvoSiblingsOf_11= ruleEvoSiblingsOf
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSiblingsOfParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSiblingsOf_11=ruleEvoSiblingsOf();

                    state._fsp--;


                    			current = this_EvoSiblingsOf_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDwMappingDsl.g:3982:3: this_EvoSatisfiable_12= ruleEvoSatisfiable
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSatisfiableParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSatisfiable_12=ruleEvoSatisfiable();

                    state._fsp--;


                    			current = this_EvoSatisfiable_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDwMappingDsl.g:3991:3: (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' )
                    {
                    // InternalDwMappingDsl.g:3991:3: (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' )
                    // InternalDwMappingDsl.g:3992:4: otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')'
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_40); 

                    				newLeafNode(otherlv_13, grammarAccess.getEvoTerminalAccess().getLeftParenthesisKeyword_13_0());
                    			

                    				newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoXOrParserRuleCall_13_1());
                    			
                    pushFollow(FOLLOW_31);
                    this_EvoXOr_14=ruleEvoXOr();

                    state._fsp--;


                    				current = this_EvoXOr_14;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_15=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getEvoTerminalAccess().getRightParenthesisKeyword_13_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoTerminal"


    // $ANTLR start "entryRuleEvoAllMappingTerminal"
    // InternalDwMappingDsl.g:4013:1: entryRuleEvoAllMappingTerminal returns [EObject current=null] : iv_ruleEvoAllMappingTerminal= ruleEvoAllMappingTerminal EOF ;
    public final EObject entryRuleEvoAllMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAllMappingTerminal = null;


        try {
            // InternalDwMappingDsl.g:4013:62: (iv_ruleEvoAllMappingTerminal= ruleEvoAllMappingTerminal EOF )
            // InternalDwMappingDsl.g:4014:2: iv_ruleEvoAllMappingTerminal= ruleEvoAllMappingTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoAllMappingTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAllMappingTerminal=ruleEvoAllMappingTerminal();

            state._fsp--;

             current =iv_ruleEvoAllMappingTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoAllMappingTerminal"


    // $ANTLR start "ruleEvoAllMappingTerminal"
    // InternalDwMappingDsl.g:4020:1: ruleEvoAllMappingTerminal returns [EObject current=null] : ( () otherlv_1= 'All_Mappings' ) ;
    public final EObject ruleEvoAllMappingTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4026:2: ( ( () otherlv_1= 'All_Mappings' ) )
            // InternalDwMappingDsl.g:4027:2: ( () otherlv_1= 'All_Mappings' )
            {
            // InternalDwMappingDsl.g:4027:2: ( () otherlv_1= 'All_Mappings' )
            // InternalDwMappingDsl.g:4028:3: () otherlv_1= 'All_Mappings'
            {
            // InternalDwMappingDsl.g:4028:3: ()
            // InternalDwMappingDsl.g:4029:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoAllMappingTerminalAccess().getEvoAllMappingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoAllMappingTerminalAccess().getAll_MappingsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoAllMappingTerminal"


    // $ANTLR start "entryRuleEvoAllConfigurationTerminal"
    // InternalDwMappingDsl.g:4043:1: entryRuleEvoAllConfigurationTerminal returns [EObject current=null] : iv_ruleEvoAllConfigurationTerminal= ruleEvoAllConfigurationTerminal EOF ;
    public final EObject entryRuleEvoAllConfigurationTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAllConfigurationTerminal = null;


        try {
            // InternalDwMappingDsl.g:4043:68: (iv_ruleEvoAllConfigurationTerminal= ruleEvoAllConfigurationTerminal EOF )
            // InternalDwMappingDsl.g:4044:2: iv_ruleEvoAllConfigurationTerminal= ruleEvoAllConfigurationTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoAllConfigurationTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAllConfigurationTerminal=ruleEvoAllConfigurationTerminal();

            state._fsp--;

             current =iv_ruleEvoAllConfigurationTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoAllConfigurationTerminal"


    // $ANTLR start "ruleEvoAllConfigurationTerminal"
    // InternalDwMappingDsl.g:4050:1: ruleEvoAllConfigurationTerminal returns [EObject current=null] : ( () otherlv_1= 'All_Configurations' ) ;
    public final EObject ruleEvoAllConfigurationTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4056:2: ( ( () otherlv_1= 'All_Configurations' ) )
            // InternalDwMappingDsl.g:4057:2: ( () otherlv_1= 'All_Configurations' )
            {
            // InternalDwMappingDsl.g:4057:2: ( () otherlv_1= 'All_Configurations' )
            // InternalDwMappingDsl.g:4058:3: () otherlv_1= 'All_Configurations'
            {
            // InternalDwMappingDsl.g:4058:3: ()
            // InternalDwMappingDsl.g:4059:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoAllConfigurationTerminalAccess().getEvoAllConfigurationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoAllConfigurationTerminalAccess().getAll_ConfigurationsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoAllConfigurationTerminal"


    // $ANTLR start "entryRuleEvoSize"
    // InternalDwMappingDsl.g:4073:1: entryRuleEvoSize returns [EObject current=null] : iv_ruleEvoSize= ruleEvoSize EOF ;
    public final EObject entryRuleEvoSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSize = null;


        try {
            // InternalDwMappingDsl.g:4073:48: (iv_ruleEvoSize= ruleEvoSize EOF )
            // InternalDwMappingDsl.g:4074:2: iv_ruleEvoSize= ruleEvoSize EOF
            {
             newCompositeNode(grammarAccess.getEvoSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSize=ruleEvoSize();

            state._fsp--;

             current =iv_ruleEvoSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSize"


    // $ANTLR start "ruleEvoSize"
    // InternalDwMappingDsl.g:4080:1: ruleEvoSize returns [EObject current=null] : ( () ( (lv_size_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEvoSize() throws RecognitionException {
        EObject current = null;

        Token lv_size_1_0=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4086:2: ( ( () ( (lv_size_1_0= RULE_INT ) ) ) )
            // InternalDwMappingDsl.g:4087:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            {
            // InternalDwMappingDsl.g:4087:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            // InternalDwMappingDsl.g:4088:3: () ( (lv_size_1_0= RULE_INT ) )
            {
            // InternalDwMappingDsl.g:4088:3: ()
            // InternalDwMappingDsl.g:4089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSizeAccess().getEvoSizeAction_0(),
            					current);
            			

            }

            // InternalDwMappingDsl.g:4095:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalDwMappingDsl.g:4096:4: (lv_size_1_0= RULE_INT )
            {
            // InternalDwMappingDsl.g:4096:4: (lv_size_1_0= RULE_INT )
            // InternalDwMappingDsl.g:4097:5: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_size_1_0, grammarAccess.getEvoSizeAccess().getSizeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSize"


    // $ANTLR start "entryRuleEvoVariableTerm"
    // InternalDwMappingDsl.g:4117:1: entryRuleEvoVariableTerm returns [EObject current=null] : iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF ;
    public final EObject entryRuleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariableTerm = null;


        try {
            // InternalDwMappingDsl.g:4117:56: (iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF )
            // InternalDwMappingDsl.g:4118:2: iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoVariableTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoVariableTerm=ruleEvoVariableTerm();

            state._fsp--;

             current =iv_ruleEvoVariableTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoVariableTerm"


    // $ANTLR start "ruleEvoVariableTerm"
    // InternalDwMappingDsl.g:4124:1: ruleEvoVariableTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4130:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalDwMappingDsl.g:4131:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalDwMappingDsl.g:4131:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalDwMappingDsl.g:4132:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalDwMappingDsl.g:4132:3: ( ( ruleQualifiedName ) )
            // InternalDwMappingDsl.g:4133:4: ( ruleQualifiedName )
            {
            // InternalDwMappingDsl.g:4133:4: ( ruleQualifiedName )
            // InternalDwMappingDsl.g:4134:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoVariableTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_56);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:4148:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=72 && LA55_0<=74)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDwMappingDsl.g:4149:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalDwMappingDsl.g:4149:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalDwMappingDsl.g:4150:5: lv_type_1_0= ruleEvoVariableType
                    {

                    					newCompositeNode(grammarAccess.getEvoVariableTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleEvoVariableType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvoVariableTermRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"de.evorepair.logic.EvoLogicDsl.EvoVariableType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoVariableTerm"


    // $ANTLR start "entryRuleEvoApplicationConstraintTerm"
    // InternalDwMappingDsl.g:4171:1: entryRuleEvoApplicationConstraintTerm returns [EObject current=null] : iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF ;
    public final EObject entryRuleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoApplicationConstraintTerm = null;


        try {
            // InternalDwMappingDsl.g:4171:69: (iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF )
            // InternalDwMappingDsl.g:4172:2: iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoApplicationConstraintTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoApplicationConstraintTerm=ruleEvoApplicationConstraintTerm();

            state._fsp--;

             current =iv_ruleEvoApplicationConstraintTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoApplicationConstraintTerm"


    // $ANTLR start "ruleEvoApplicationConstraintTerm"
    // InternalDwMappingDsl.g:4178:1: ruleEvoApplicationConstraintTerm returns [EObject current=null] : (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4184:2: ( (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // InternalDwMappingDsl.g:4185:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // InternalDwMappingDsl.g:4185:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // InternalDwMappingDsl.g:4186:3: otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoApplicationConstraintTermAccess().getACKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoApplicationConstraintTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDwMappingDsl.g:4194:3: ( ( ruleQualifiedName ) )
            // InternalDwMappingDsl.g:4195:4: ( ruleQualifiedName )
            {
            // InternalDwMappingDsl.g:4195:4: ( ruleQualifiedName )
            // InternalDwMappingDsl.g:4196:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoApplicationConstraintTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableCrossReference_2_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoApplicationConstraintTermAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoApplicationConstraintTerm"


    // $ANTLR start "entryRuleEvoFeatureType"
    // InternalDwMappingDsl.g:4218:1: entryRuleEvoFeatureType returns [EObject current=null] : iv_ruleEvoFeatureType= ruleEvoFeatureType EOF ;
    public final EObject entryRuleEvoFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureType = null;


        try {
            // InternalDwMappingDsl.g:4218:55: (iv_ruleEvoFeatureType= ruleEvoFeatureType EOF )
            // InternalDwMappingDsl.g:4219:2: iv_ruleEvoFeatureType= ruleEvoFeatureType EOF
            {
             newCompositeNode(grammarAccess.getEvoFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoFeatureType=ruleEvoFeatureType();

            state._fsp--;

             current =iv_ruleEvoFeatureType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoFeatureType"


    // $ANTLR start "ruleEvoFeatureType"
    // InternalDwMappingDsl.g:4225:1: ruleEvoFeatureType returns [EObject current=null] : ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) ) ;
    public final EObject ruleEvoFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4231:2: ( ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) ) )
            // InternalDwMappingDsl.g:4232:2: ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) )
            {
            // InternalDwMappingDsl.g:4232:2: ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) )
            // InternalDwMappingDsl.g:4233:3: () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) )
            {
            // InternalDwMappingDsl.g:4233:3: ()
            // InternalDwMappingDsl.g:4234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoFeatureTypeAccess().getEvoFeatureTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoFeatureTypeAccess().getFeatureTypeKeyword_1());
            		
            // InternalDwMappingDsl.g:4244:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' )
            // InternalDwMappingDsl.g:4245:4: otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoFeatureTypeAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalDwMappingDsl.g:4249:4: ( (lv_variables_3_0= ruleEvoVariableTerm ) )
            // InternalDwMappingDsl.g:4250:5: (lv_variables_3_0= ruleEvoVariableTerm )
            {
            // InternalDwMappingDsl.g:4250:5: (lv_variables_3_0= ruleEvoVariableTerm )
            // InternalDwMappingDsl.g:4251:6: lv_variables_3_0= ruleEvoVariableTerm
            {

            						newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getVariablesEvoVariableTermParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_22);
            lv_variables_3_0=ruleEvoVariableTerm();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEvoFeatureTypeRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalDwMappingDsl.g:4268:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==26) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDwMappingDsl.g:4269:5: otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getEvoFeatureTypeAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalDwMappingDsl.g:4273:5: ( (lv_variables_5_0= ruleEvoVariableTerm ) )
            	    // InternalDwMappingDsl.g:4274:6: (lv_variables_5_0= ruleEvoVariableTerm )
            	    {
            	    // InternalDwMappingDsl.g:4274:6: (lv_variables_5_0= ruleEvoVariableTerm )
            	    // InternalDwMappingDsl.g:4275:7: lv_variables_5_0= ruleEvoVariableTerm
            	    {

            	    							newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getVariablesEvoVariableTermParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_variables_5_0=ruleEvoVariableTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEvoFeatureTypeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_57); 

            				newLeafNode(otherlv_6, grammarAccess.getEvoFeatureTypeAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_7=(Token)match(input,21,FOLLOW_58); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoFeatureTypeAccess().getEqualsSignEqualsSignKeyword_3());
            		
            // InternalDwMappingDsl.g:4302:3: ( (lv_type_8_0= ruleHyFeatureTypeEnum ) )
            // InternalDwMappingDsl.g:4303:4: (lv_type_8_0= ruleHyFeatureTypeEnum )
            {
            // InternalDwMappingDsl.g:4303:4: (lv_type_8_0= ruleHyFeatureTypeEnum )
            // InternalDwMappingDsl.g:4304:5: lv_type_8_0= ruleHyFeatureTypeEnum
            {

            					newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getTypeHyFeatureTypeEnumEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_8_0=ruleHyFeatureTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoFeatureTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"de.evorepair.logic.EvoLogicDsl.HyFeatureTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoFeatureType"


    // $ANTLR start "entryRuleEvoGroupType"
    // InternalDwMappingDsl.g:4325:1: entryRuleEvoGroupType returns [EObject current=null] : iv_ruleEvoGroupType= ruleEvoGroupType EOF ;
    public final EObject entryRuleEvoGroupType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupType = null;


        try {
            // InternalDwMappingDsl.g:4325:53: (iv_ruleEvoGroupType= ruleEvoGroupType EOF )
            // InternalDwMappingDsl.g:4326:2: iv_ruleEvoGroupType= ruleEvoGroupType EOF
            {
             newCompositeNode(grammarAccess.getEvoGroupTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoGroupType=ruleEvoGroupType();

            state._fsp--;

             current =iv_ruleEvoGroupType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoGroupType"


    // $ANTLR start "ruleEvoGroupType"
    // InternalDwMappingDsl.g:4332:1: ruleEvoGroupType returns [EObject current=null] : ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) ) ;
    public final EObject ruleEvoGroupType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4338:2: ( ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) ) )
            // InternalDwMappingDsl.g:4339:2: ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) )
            {
            // InternalDwMappingDsl.g:4339:2: ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) )
            // InternalDwMappingDsl.g:4340:3: () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) )
            {
            // InternalDwMappingDsl.g:4340:3: ()
            // InternalDwMappingDsl.g:4341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoGroupTypeAccess().getEvoGroupTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoGroupTypeAccess().getGroupTypeKeyword_1());
            		
            // InternalDwMappingDsl.g:4351:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' )
            // InternalDwMappingDsl.g:4352:4: otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoGroupTypeAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalDwMappingDsl.g:4356:4: ( (lv_variables_3_0= ruleEvoGroupTerm ) )
            // InternalDwMappingDsl.g:4357:5: (lv_variables_3_0= ruleEvoGroupTerm )
            {
            // InternalDwMappingDsl.g:4357:5: (lv_variables_3_0= ruleEvoGroupTerm )
            // InternalDwMappingDsl.g:4358:6: lv_variables_3_0= ruleEvoGroupTerm
            {

            						newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getVariablesEvoGroupTermParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_22);
            lv_variables_3_0=ruleEvoGroupTerm();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEvoGroupTypeRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"de.evorepair.logic.EvoLogicDsl.EvoGroupTerm");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalDwMappingDsl.g:4375:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==26) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalDwMappingDsl.g:4376:5: otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getEvoGroupTypeAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalDwMappingDsl.g:4380:5: ( (lv_variables_5_0= ruleEvoGroupTerm ) )
            	    // InternalDwMappingDsl.g:4381:6: (lv_variables_5_0= ruleEvoGroupTerm )
            	    {
            	    // InternalDwMappingDsl.g:4381:6: (lv_variables_5_0= ruleEvoGroupTerm )
            	    // InternalDwMappingDsl.g:4382:7: lv_variables_5_0= ruleEvoGroupTerm
            	    {

            	    							newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getVariablesEvoGroupTermParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_variables_5_0=ruleEvoGroupTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEvoGroupTypeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"de.evorepair.logic.EvoLogicDsl.EvoGroupTerm");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_57); 

            				newLeafNode(otherlv_6, grammarAccess.getEvoGroupTypeAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_7=(Token)match(input,21,FOLLOW_59); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoGroupTypeAccess().getEqualsSignEqualsSignKeyword_3());
            		
            // InternalDwMappingDsl.g:4409:3: ( (lv_type_8_0= ruleHyGroupTypeEnum ) )
            // InternalDwMappingDsl.g:4410:4: (lv_type_8_0= ruleHyGroupTypeEnum )
            {
            // InternalDwMappingDsl.g:4410:4: (lv_type_8_0= ruleHyGroupTypeEnum )
            // InternalDwMappingDsl.g:4411:5: lv_type_8_0= ruleHyGroupTypeEnum
            {

            					newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getTypeHyGroupTypeEnumEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_8_0=ruleHyGroupTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoGroupTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"de.evorepair.logic.EvoLogicDsl.HyGroupTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoGroupType"


    // $ANTLR start "entryRuleEvoGroupTerm"
    // InternalDwMappingDsl.g:4432:1: entryRuleEvoGroupTerm returns [EObject current=null] : iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF ;
    public final EObject entryRuleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupTerm = null;


        try {
            // InternalDwMappingDsl.g:4432:53: (iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF )
            // InternalDwMappingDsl.g:4433:2: iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoGroupTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoGroupTerm=ruleEvoGroupTerm();

            state._fsp--;

             current =iv_ruleEvoGroupTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoGroupTerm"


    // $ANTLR start "ruleEvoGroupTerm"
    // InternalDwMappingDsl.g:4439:1: ruleEvoGroupTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4445:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalDwMappingDsl.g:4446:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalDwMappingDsl.g:4446:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalDwMappingDsl.g:4447:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalDwMappingDsl.g:4447:3: ( ( ruleQualifiedName ) )
            // InternalDwMappingDsl.g:4448:4: ( ruleQualifiedName )
            {
            // InternalDwMappingDsl.g:4448:4: ( ruleQualifiedName )
            // InternalDwMappingDsl.g:4449:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoGroupTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_56);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:4463:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=72 && LA58_0<=74)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDwMappingDsl.g:4464:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalDwMappingDsl.g:4464:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalDwMappingDsl.g:4465:5: lv_type_1_0= ruleEvoVariableType
                    {

                    					newCompositeNode(grammarAccess.getEvoGroupTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleEvoVariableType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvoGroupTermRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"de.evorepair.logic.EvoLogicDsl.EvoVariableType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoGroupTerm"


    // $ANTLR start "entryRuleEvoSetTerm"
    // InternalDwMappingDsl.g:4486:1: entryRuleEvoSetTerm returns [EObject current=null] : iv_ruleEvoSetTerm= ruleEvoSetTerm EOF ;
    public final EObject entryRuleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetTerm = null;


        try {
            // InternalDwMappingDsl.g:4486:51: (iv_ruleEvoSetTerm= ruleEvoSetTerm EOF )
            // InternalDwMappingDsl.g:4487:2: iv_ruleEvoSetTerm= ruleEvoSetTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoSetTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetTerm=ruleEvoSetTerm();

            state._fsp--;

             current =iv_ruleEvoSetTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetTerm"


    // $ANTLR start "ruleEvoSetTerm"
    // InternalDwMappingDsl.g:4493:1: ruleEvoSetTerm returns [EObject current=null] : (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4499:2: ( (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) )
            // InternalDwMappingDsl.g:4500:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            {
            // InternalDwMappingDsl.g:4500:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            // InternalDwMappingDsl.g:4501:3: otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSetTermAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDwMappingDsl.g:4505:3: ( (lv_variables_1_0= ruleEvoSetVariable ) )
            // InternalDwMappingDsl.g:4506:4: (lv_variables_1_0= ruleEvoSetVariable )
            {
            // InternalDwMappingDsl.g:4506:4: (lv_variables_1_0= ruleEvoSetVariable )
            // InternalDwMappingDsl.g:4507:5: lv_variables_1_0= ruleEvoSetVariable
            {

            					newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_61);
            lv_variables_1_0=ruleEvoSetVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoSetTermRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDwMappingDsl.g:4524:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==26) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalDwMappingDsl.g:4525:4: otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_60); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetTermAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDwMappingDsl.g:4529:4: ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    // InternalDwMappingDsl.g:4530:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    {
            	    // InternalDwMappingDsl.g:4530:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    // InternalDwMappingDsl.g:4531:6: lv_variables_3_0= ruleEvoSetVariable
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_61);
            	    lv_variables_3_0=ruleEvoSetVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,67,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoSetTermAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetTerm"


    // $ANTLR start "entryRuleEvoSetVariable"
    // InternalDwMappingDsl.g:4557:1: entryRuleEvoSetVariable returns [EObject current=null] : iv_ruleEvoSetVariable= ruleEvoSetVariable EOF ;
    public final EObject entryRuleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetVariable = null;


        try {
            // InternalDwMappingDsl.g:4557:55: (iv_ruleEvoSetVariable= ruleEvoSetVariable EOF )
            // InternalDwMappingDsl.g:4558:2: iv_ruleEvoSetVariable= ruleEvoSetVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoSetVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetVariable=ruleEvoSetVariable();

            state._fsp--;

             current =iv_ruleEvoSetVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSetVariable"


    // $ANTLR start "ruleEvoSetVariable"
    // InternalDwMappingDsl.g:4564:1: ruleEvoSetVariable returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) ;
    public final EObject ruleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject this_EvoVariableTerm_0 = null;

        EObject this_EvoSetTerm_1 = null;

        EObject this_EvoNot_2 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4570:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) )
            // InternalDwMappingDsl.g:4571:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            {
            // InternalDwMappingDsl.g:4571:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            int alt60=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt60=1;
                }
                break;
            case 66:
                {
                alt60=2;
                }
                break;
            case 36:
            case 59:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalDwMappingDsl.g:4572:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoSetVariableAccess().getEvoVariableTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoVariableTerm_0=ruleEvoVariableTerm();

                    state._fsp--;


                    			current = this_EvoVariableTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:4581:3: this_EvoSetTerm_1= ruleEvoSetTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoSetVariableAccess().getEvoSetTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetTerm_1=ruleEvoSetTerm();

                    state._fsp--;


                    			current = this_EvoSetTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDwMappingDsl.g:4590:3: this_EvoNot_2= ruleEvoNot
                    {

                    			newCompositeNode(grammarAccess.getEvoSetVariableAccess().getEvoNotParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoNot_2=ruleEvoNot();

                    state._fsp--;


                    			current = this_EvoNot_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSetVariable"


    // $ANTLR start "entryRuleEvoParentOf"
    // InternalDwMappingDsl.g:4602:1: entryRuleEvoParentOf returns [EObject current=null] : iv_ruleEvoParentOf= ruleEvoParentOf EOF ;
    public final EObject entryRuleEvoParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoParentOf = null;


        try {
            // InternalDwMappingDsl.g:4602:52: (iv_ruleEvoParentOf= ruleEvoParentOf EOF )
            // InternalDwMappingDsl.g:4603:2: iv_ruleEvoParentOf= ruleEvoParentOf EOF
            {
             newCompositeNode(grammarAccess.getEvoParentOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoParentOf=ruleEvoParentOf();

            state._fsp--;

             current =iv_ruleEvoParentOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoParentOf"


    // $ANTLR start "ruleEvoParentOf"
    // InternalDwMappingDsl.g:4609:1: ruleEvoParentOf returns [EObject current=null] : (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoParentOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4615:2: ( (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalDwMappingDsl.g:4616:2: (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalDwMappingDsl.g:4616:2: (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalDwMappingDsl.g:4617:3: otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoParentOfAccess().getParentOfKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoParentOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDwMappingDsl.g:4625:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalDwMappingDsl.g:4626:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalDwMappingDsl.g:4626:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalDwMappingDsl.g:4627:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoParentOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_variable_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoParentOfRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoParentOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoParentOf"


    // $ANTLR start "entryRuleEvoSiblingsOf"
    // InternalDwMappingDsl.g:4652:1: entryRuleEvoSiblingsOf returns [EObject current=null] : iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF ;
    public final EObject entryRuleEvoSiblingsOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSiblingsOf = null;


        try {
            // InternalDwMappingDsl.g:4652:54: (iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF )
            // InternalDwMappingDsl.g:4653:2: iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF
            {
             newCompositeNode(grammarAccess.getEvoSiblingsOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSiblingsOf=ruleEvoSiblingsOf();

            state._fsp--;

             current =iv_ruleEvoSiblingsOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoSiblingsOf"


    // $ANTLR start "ruleEvoSiblingsOf"
    // InternalDwMappingDsl.g:4659:1: ruleEvoSiblingsOf returns [EObject current=null] : (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoSiblingsOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4665:2: ( (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalDwMappingDsl.g:4666:2: (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalDwMappingDsl.g:4666:2: (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalDwMappingDsl.g:4667:3: otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSiblingsOfAccess().getSibilingsOfKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoSiblingsOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDwMappingDsl.g:4675:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalDwMappingDsl.g:4676:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalDwMappingDsl.g:4676:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalDwMappingDsl.g:4677:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoSiblingsOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_variable_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoSiblingsOfRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoSiblingsOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoSiblingsOf"


    // $ANTLR start "entryRuleEvoChildrenOf"
    // InternalDwMappingDsl.g:4702:1: entryRuleEvoChildrenOf returns [EObject current=null] : iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF ;
    public final EObject entryRuleEvoChildrenOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoChildrenOf = null;


        try {
            // InternalDwMappingDsl.g:4702:54: (iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF )
            // InternalDwMappingDsl.g:4703:2: iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF
            {
             newCompositeNode(grammarAccess.getEvoChildrenOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoChildrenOf=ruleEvoChildrenOf();

            state._fsp--;

             current =iv_ruleEvoChildrenOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoChildrenOf"


    // $ANTLR start "ruleEvoChildrenOf"
    // InternalDwMappingDsl.g:4709:1: ruleEvoChildrenOf returns [EObject current=null] : (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoChildrenOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalDwMappingDsl.g:4715:2: ( (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalDwMappingDsl.g:4716:2: (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalDwMappingDsl.g:4716:2: (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalDwMappingDsl.g:4717:3: otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoChildrenOfAccess().getChildrenOfKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoChildrenOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDwMappingDsl.g:4725:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalDwMappingDsl.g:4726:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalDwMappingDsl.g:4726:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalDwMappingDsl.g:4727:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoChildrenOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_variable_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoChildrenOfRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoChildrenOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoChildrenOf"


    // $ANTLR start "ruleEvoMappingRelativeVersionRestrictionOperator"
    // InternalDwMappingDsl.g:4752:1: ruleEvoMappingRelativeVersionRestrictionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleEvoMappingRelativeVersionRestrictionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4758:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // InternalDwMappingDsl.g:4759:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // InternalDwMappingDsl.g:4759:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt61=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt61=1;
                }
                break;
            case 28:
                {
                alt61=2;
                }
                break;
            case 71:
                {
                alt61=3;
                }
                break;
            case 29:
                {
                alt61=4;
                }
                break;
            case 13:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalDwMappingDsl.g:4760:3: (enumLiteral_0= '<' )
                    {
                    // InternalDwMappingDsl.g:4760:3: (enumLiteral_0= '<' )
                    // InternalDwMappingDsl.g:4761:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:4768:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDwMappingDsl.g:4768:3: (enumLiteral_1= '<=' )
                    // InternalDwMappingDsl.g:4769:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDwMappingDsl.g:4776:3: (enumLiteral_2= '=' )
                    {
                    // InternalDwMappingDsl.g:4776:3: (enumLiteral_2= '=' )
                    // InternalDwMappingDsl.g:4777:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDwMappingDsl.g:4784:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDwMappingDsl.g:4784:3: (enumLiteral_3= '>=' )
                    // InternalDwMappingDsl.g:4785:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDwMappingDsl.g:4792:3: (enumLiteral_4= '>' )
                    {
                    // InternalDwMappingDsl.g:4792:3: (enumLiteral_4= '>' )
                    // InternalDwMappingDsl.g:4793:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoMappingRelativeVersionRestrictionOperator"


    // $ANTLR start "ruleEvoVariableType"
    // InternalDwMappingDsl.g:4803:1: ruleEvoVariableType returns [Enumerator current=null] : ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) ;
    public final Enumerator ruleEvoVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4809:2: ( ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) )
            // InternalDwMappingDsl.g:4810:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            {
            // InternalDwMappingDsl.g:4810:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt62=1;
                }
                break;
            case 73:
                {
                alt62=2;
                }
                break;
            case 74:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalDwMappingDsl.g:4811:3: (enumLiteral_0= '@ident' )
                    {
                    // InternalDwMappingDsl.g:4811:3: (enumLiteral_0= '@ident' )
                    // InternalDwMappingDsl.g:4812:4: enumLiteral_0= '@ident'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:4819:3: (enumLiteral_1= '@pre' )
                    {
                    // InternalDwMappingDsl.g:4819:3: (enumLiteral_1= '@pre' )
                    // InternalDwMappingDsl.g:4820:4: enumLiteral_1= '@pre'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDwMappingDsl.g:4827:3: (enumLiteral_2= '@post' )
                    {
                    // InternalDwMappingDsl.g:4827:3: (enumLiteral_2= '@post' )
                    // InternalDwMappingDsl.g:4828:4: enumLiteral_2= '@post'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoVariableType"


    // $ANTLR start "ruleHyFeatureTypeEnum"
    // InternalDwMappingDsl.g:4838:1: ruleHyFeatureTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) ;
    public final Enumerator ruleHyFeatureTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4844:2: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) )
            // InternalDwMappingDsl.g:4845:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            {
            // InternalDwMappingDsl.g:4845:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==75) ) {
                alt63=1;
            }
            else if ( (LA63_0==76) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalDwMappingDsl.g:4846:3: (enumLiteral_0= 'optional' )
                    {
                    // InternalDwMappingDsl.g:4846:3: (enumLiteral_0= 'optional' )
                    // InternalDwMappingDsl.g:4847:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:4854:3: (enumLiteral_1= 'mandatory' )
                    {
                    // InternalDwMappingDsl.g:4854:3: (enumLiteral_1= 'mandatory' )
                    // InternalDwMappingDsl.g:4855:4: enumLiteral_1= 'mandatory'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getHyFeatureTypeEnumAccess().getMANDATORYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHyFeatureTypeEnumAccess().getMANDATORYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyFeatureTypeEnum"


    // $ANTLR start "ruleHyGroupTypeEnum"
    // InternalDwMappingDsl.g:4865:1: ruleHyGroupTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) ;
    public final Enumerator ruleHyGroupTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDwMappingDsl.g:4871:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) )
            // InternalDwMappingDsl.g:4872:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            {
            // InternalDwMappingDsl.g:4872:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt64=1;
                }
                break;
            case 78:
                {
                alt64=2;
                }
                break;
            case 79:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalDwMappingDsl.g:4873:3: (enumLiteral_0= 'and' )
                    {
                    // InternalDwMappingDsl.g:4873:3: (enumLiteral_0= 'and' )
                    // InternalDwMappingDsl.g:4874:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDwMappingDsl.g:4881:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDwMappingDsl.g:4881:3: (enumLiteral_1= 'or' )
                    // InternalDwMappingDsl.g:4882:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDwMappingDsl.g:4889:3: (enumLiteral_2= 'alternative' )
                    {
                    // InternalDwMappingDsl.g:4889:3: (enumLiteral_2= 'alternative' )
                    // InternalDwMappingDsl.g:4890:4: enumLiteral_2= 'alternative'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getALTERNATIVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHyGroupTypeEnumAccess().getALTERNATIVEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyGroupTypeEnum"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\uffff\1\14\14\uffff";
    static final String dfa_3s = "\1\4\1\14\14\uffff";
    static final String dfa_4s = "\1\54\1\51\14\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\1\1\7";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\1\1\7\32\uffff\1\4\1\3\1\13\1\5\2\10\1\6\2\uffff\1\11\1\12",
            "\3\14\1\uffff\1\14\2\uffff\17\14\7\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1366:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoVariableTerm_1= ruleEvoVariableTerm | this_EvoMappingNestedExpression_2= ruleEvoMappingNestedExpression | this_EvoMappingNegation_3= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_4= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_5= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_6= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_7= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_8= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_9= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_10= ruleEvoMappingMaximumExpression | this_EvoMappingNot_11= ruleEvoMappingNot )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\17\1\uffff\1\4\1\20\1\4\2\uffff\1\20";
    static final String dfa_10s = "\1\47\1\uffff\1\4\1\51\1\4\2\uffff\1\51";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\3\1\2\1\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\27\uffff\1\2",
            "",
            "\1\3",
            "\1\6\1\uffff\1\5\26\uffff\1\4",
            "\1\7",
            "",
            "",
            "\1\6\1\uffff\1\5\26\uffff\1\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1763:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000019FC000000D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000019FC000000D0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000008002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000030003000L,0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x9EC0001800000010L,0x0000000000000077L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x9EC0001800000090L,0x0000000000000077L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFEC0001800000010L,0x0000000000000077L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8800001000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800001000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000008L});

}