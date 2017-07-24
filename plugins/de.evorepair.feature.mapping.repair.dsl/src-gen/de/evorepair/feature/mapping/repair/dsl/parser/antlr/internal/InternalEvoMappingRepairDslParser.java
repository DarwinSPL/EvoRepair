package de.evorepair.feature.mapping.repair.dsl.parser.antlr.internal;

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
import de.evorepair.feature.mapping.repair.dsl.services.EvoMappingRepairDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoMappingRepairDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'keep'", "'('", "')'", "'replace'", "'with'", "'||'", "'&&'", "'=='", "'!='", "'->'", "'<->'", "'<'", "'ifPossible('", "','", "'<='", "'>'", "'>='", "'-'", "'+'", "'%'", "'*'", "'/'", "'!'", "'?'", "'['", "']'", "'true'", "'false'", "'context:'", "'.'", "'EnumLiteral('", "'eternity'", "'min('", "'max('", "'xor'", "'=>'", "'<=>'", "'inclusion'", "'intersection'", "'union'", "'difference'", "'symmetric_difference'", "'x'", "'|'", "'size'", "'elementOf'", "'feature'", "'forAll'", "':'", "'exists'", "'not'", "'satisfiable'", "'AC'", "'featureType'", "'groupType'", "'{'", "'}'", "'parentOf'", "'sibilingsOf'", "'childrenOf'", "'='", "'@ident'", "'@pre'", "'@post'", "'optional'", "'mandatory'", "'and'", "'or'", "'alternative'"
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
    public static final int RULE_ID=5;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
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
    public static final int T__80=80;
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


        public InternalEvoMappingRepairDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoMappingRepairDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoMappingRepairDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoMappingRepairDsl.g"; }



     	private EvoMappingRepairDslGrammarAccess grammarAccess;

        public InternalEvoMappingRepairDslParser(TokenStream input, EvoMappingRepairDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MappingRepairGrammarEntry";
       	}

       	@Override
       	protected EvoMappingRepairDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMappingRepairGrammarEntry"
    // InternalEvoMappingRepairDsl.g:65:1: entryRuleMappingRepairGrammarEntry returns [EObject current=null] : iv_ruleMappingRepairGrammarEntry= ruleMappingRepairGrammarEntry EOF ;
    public final EObject entryRuleMappingRepairGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRepairGrammarEntry = null;


        try {
            // InternalEvoMappingRepairDsl.g:65:66: (iv_ruleMappingRepairGrammarEntry= ruleMappingRepairGrammarEntry EOF )
            // InternalEvoMappingRepairDsl.g:66:2: iv_ruleMappingRepairGrammarEntry= ruleMappingRepairGrammarEntry EOF
            {
             newCompositeNode(grammarAccess.getMappingRepairGrammarEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingRepairGrammarEntry=ruleMappingRepairGrammarEntry();

            state._fsp--;

             current =iv_ruleMappingRepairGrammarEntry; 
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
    // $ANTLR end "entryRuleMappingRepairGrammarEntry"


    // $ANTLR start "ruleMappingRepairGrammarEntry"
    // InternalEvoMappingRepairDsl.g:72:1: ruleMappingRepairGrammarEntry returns [EObject current=null] : ( (lv_action_0_0= ruleEvoMappingRepairExpression ) ) ;
    public final EObject ruleMappingRepairGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:78:2: ( ( (lv_action_0_0= ruleEvoMappingRepairExpression ) ) )
            // InternalEvoMappingRepairDsl.g:79:2: ( (lv_action_0_0= ruleEvoMappingRepairExpression ) )
            {
            // InternalEvoMappingRepairDsl.g:79:2: ( (lv_action_0_0= ruleEvoMappingRepairExpression ) )
            // InternalEvoMappingRepairDsl.g:80:3: (lv_action_0_0= ruleEvoMappingRepairExpression )
            {
            // InternalEvoMappingRepairDsl.g:80:3: (lv_action_0_0= ruleEvoMappingRepairExpression )
            // InternalEvoMappingRepairDsl.g:81:4: lv_action_0_0= ruleEvoMappingRepairExpression
            {

            				newCompositeNode(grammarAccess.getMappingRepairGrammarEntryAccess().getActionEvoMappingRepairExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_action_0_0=ruleEvoMappingRepairExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMappingRepairGrammarEntryRule());
            				}
            				set(
            					current,
            					"action",
            					lv_action_0_0,
            					"de.evorepair.feature.mapping.repair.dsl.EvoMappingRepairDsl.EvoMappingRepairExpression");
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
    // $ANTLR end "ruleMappingRepairGrammarEntry"


    // $ANTLR start "entryRuleEvoMappingRepairExpression"
    // InternalEvoMappingRepairDsl.g:101:1: entryRuleEvoMappingRepairExpression returns [EObject current=null] : iv_ruleEvoMappingRepairExpression= ruleEvoMappingRepairExpression EOF ;
    public final EObject entryRuleEvoMappingRepairExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingRepairExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:101:67: (iv_ruleEvoMappingRepairExpression= ruleEvoMappingRepairExpression EOF )
            // InternalEvoMappingRepairDsl.g:102:2: iv_ruleEvoMappingRepairExpression= ruleEvoMappingRepairExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingRepairExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingRepairExpression=ruleEvoMappingRepairExpression();

            state._fsp--;

             current =iv_ruleEvoMappingRepairExpression; 
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
    // $ANTLR end "entryRuleEvoMappingRepairExpression"


    // $ANTLR start "ruleEvoMappingRepairExpression"
    // InternalEvoMappingRepairDsl.g:108:1: ruleEvoMappingRepairExpression returns [EObject current=null] : (this_EvoMappingKeep_0= ruleEvoMappingKeep | this_EvoMappingReplace_1= ruleEvoMappingReplace ) ;
    public final EObject ruleEvoMappingRepairExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingKeep_0 = null;

        EObject this_EvoMappingReplace_1 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:114:2: ( (this_EvoMappingKeep_0= ruleEvoMappingKeep | this_EvoMappingReplace_1= ruleEvoMappingReplace ) )
            // InternalEvoMappingRepairDsl.g:115:2: (this_EvoMappingKeep_0= ruleEvoMappingKeep | this_EvoMappingReplace_1= ruleEvoMappingReplace )
            {
            // InternalEvoMappingRepairDsl.g:115:2: (this_EvoMappingKeep_0= ruleEvoMappingKeep | this_EvoMappingReplace_1= ruleEvoMappingReplace )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:116:3: this_EvoMappingKeep_0= ruleEvoMappingKeep
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingRepairExpressionAccess().getEvoMappingKeepParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingKeep_0=ruleEvoMappingKeep();

                    state._fsp--;


                    			current = this_EvoMappingKeep_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoMappingRepairDsl.g:125:3: this_EvoMappingReplace_1= ruleEvoMappingReplace
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingRepairExpressionAccess().getEvoMappingReplaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingReplace_1=ruleEvoMappingReplace();

                    state._fsp--;


                    			current = this_EvoMappingReplace_1;
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
    // $ANTLR end "ruleEvoMappingRepairExpression"


    // $ANTLR start "entryRuleEvoMappingKeep"
    // InternalEvoMappingRepairDsl.g:137:1: entryRuleEvoMappingKeep returns [EObject current=null] : iv_ruleEvoMappingKeep= ruleEvoMappingKeep EOF ;
    public final EObject entryRuleEvoMappingKeep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingKeep = null;


        try {
            // InternalEvoMappingRepairDsl.g:137:55: (iv_ruleEvoMappingKeep= ruleEvoMappingKeep EOF )
            // InternalEvoMappingRepairDsl.g:138:2: iv_ruleEvoMappingKeep= ruleEvoMappingKeep EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingKeepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingKeep=ruleEvoMappingKeep();

            state._fsp--;

             current =iv_ruleEvoMappingKeep; 
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
    // $ANTLR end "entryRuleEvoMappingKeep"


    // $ANTLR start "ruleEvoMappingKeep"
    // InternalEvoMappingRepairDsl.g:144:1: ruleEvoMappingKeep returns [EObject current=null] : (otherlv_0= 'keep' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoMappingKeep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:150:2: ( (otherlv_0= 'keep' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' ) )
            // InternalEvoMappingRepairDsl.g:151:2: (otherlv_0= 'keep' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' )
            {
            // InternalEvoMappingRepairDsl.g:151:2: (otherlv_0= 'keep' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' )
            // InternalEvoMappingRepairDsl.g:152:3: otherlv_0= 'keep' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingKeepAccess().getKeepKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoMappingKeepAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:160:3: ( (lv_operand_2_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:161:4: (lv_operand_2_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:161:4: (lv_operand_2_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:162:5: lv_operand_2_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingKeepAccess().getOperandEvoMappingExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_operand_2_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingKeepRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_2_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoMappingKeepAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEvoMappingKeep"


    // $ANTLR start "entryRuleEvoMappingReplace"
    // InternalEvoMappingRepairDsl.g:187:1: entryRuleEvoMappingReplace returns [EObject current=null] : iv_ruleEvoMappingReplace= ruleEvoMappingReplace EOF ;
    public final EObject entryRuleEvoMappingReplace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingReplace = null;


        try {
            // InternalEvoMappingRepairDsl.g:187:58: (iv_ruleEvoMappingReplace= ruleEvoMappingReplace EOF )
            // InternalEvoMappingRepairDsl.g:188:2: iv_ruleEvoMappingReplace= ruleEvoMappingReplace EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingReplaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingReplace=ruleEvoMappingReplace();

            state._fsp--;

             current =iv_ruleEvoMappingReplace; 
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
    // $ANTLR end "entryRuleEvoMappingReplace"


    // $ANTLR start "ruleEvoMappingReplace"
    // InternalEvoMappingRepairDsl.g:194:1: ruleEvoMappingReplace returns [EObject current=null] : (otherlv_0= 'replace' otherlv_1= '(' ( (lv_operand1_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' otherlv_4= 'with' otherlv_5= '(' ( (lv_operand2_6_0= ruleEvoMappingExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleEvoMappingReplace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_operand1_2_0 = null;

        EObject lv_operand2_6_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:200:2: ( (otherlv_0= 'replace' otherlv_1= '(' ( (lv_operand1_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' otherlv_4= 'with' otherlv_5= '(' ( (lv_operand2_6_0= ruleEvoMappingExpression ) ) otherlv_7= ')' ) )
            // InternalEvoMappingRepairDsl.g:201:2: (otherlv_0= 'replace' otherlv_1= '(' ( (lv_operand1_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' otherlv_4= 'with' otherlv_5= '(' ( (lv_operand2_6_0= ruleEvoMappingExpression ) ) otherlv_7= ')' )
            {
            // InternalEvoMappingRepairDsl.g:201:2: (otherlv_0= 'replace' otherlv_1= '(' ( (lv_operand1_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' otherlv_4= 'with' otherlv_5= '(' ( (lv_operand2_6_0= ruleEvoMappingExpression ) ) otherlv_7= ')' )
            // InternalEvoMappingRepairDsl.g:202:3: otherlv_0= 'replace' otherlv_1= '(' ( (lv_operand1_2_0= ruleEvoMappingExpression ) ) otherlv_3= ')' otherlv_4= 'with' otherlv_5= '(' ( (lv_operand2_6_0= ruleEvoMappingExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingReplaceAccess().getReplaceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoMappingReplaceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:210:3: ( (lv_operand1_2_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:211:4: (lv_operand1_2_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:211:4: (lv_operand1_2_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:212:5: lv_operand1_2_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingReplaceAccess().getOperand1EvoMappingExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_operand1_2_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingReplaceRule());
            					}
            					set(
            						current,
            						"operand1",
            						lv_operand1_2_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoMappingReplaceAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoMappingReplaceAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoMappingReplaceAccess().getLeftParenthesisKeyword_5());
            		
            // InternalEvoMappingRepairDsl.g:241:3: ( (lv_operand2_6_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:242:4: (lv_operand2_6_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:242:4: (lv_operand2_6_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:243:5: lv_operand2_6_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingReplaceAccess().getOperand2EvoMappingExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_operand2_6_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingReplaceRule());
            					}
            					set(
            						current,
            						"operand2",
            						lv_operand2_6_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoMappingReplaceAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleEvoMappingReplace"


    // $ANTLR start "entryRuleEvoMappingExpression"
    // InternalEvoMappingRepairDsl.g:268:1: entryRuleEvoMappingExpression returns [EObject current=null] : iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF ;
    public final EObject entryRuleEvoMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:268:61: (iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF )
            // InternalEvoMappingRepairDsl.g:269:2: iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF
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
    // InternalEvoMappingRepairDsl.g:275:1: ruleEvoMappingExpression returns [EObject current=null] : this_EvoMappingOr_0= ruleEvoMappingOr ;
    public final EObject ruleEvoMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingOr_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:281:2: (this_EvoMappingOr_0= ruleEvoMappingOr )
            // InternalEvoMappingRepairDsl.g:282:2: this_EvoMappingOr_0= ruleEvoMappingOr
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
    // InternalEvoMappingRepairDsl.g:293:1: entryRuleEvoMappingOr returns [EObject current=null] : iv_ruleEvoMappingOr= ruleEvoMappingOr EOF ;
    public final EObject entryRuleEvoMappingOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingOr = null;


        try {
            // InternalEvoMappingRepairDsl.g:293:53: (iv_ruleEvoMappingOr= ruleEvoMappingOr EOF )
            // InternalEvoMappingRepairDsl.g:294:2: iv_ruleEvoMappingOr= ruleEvoMappingOr EOF
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
    // InternalEvoMappingRepairDsl.g:300:1: ruleEvoMappingOr returns [EObject current=null] : (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* ) ;
    public final EObject ruleEvoMappingOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingAnd_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:306:2: ( (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:307:2: (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:307:2: (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* )
            // InternalEvoMappingRepairDsl.g:308:3: this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingOrAccess().getEvoMappingAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_EvoMappingAnd_0=ruleEvoMappingAnd();

            state._fsp--;


            			current = this_EvoMappingAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:316:3: ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:317:4: () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:317:4: ()
            	    // InternalEvoMappingRepairDsl.g:318:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingOrAccess().getHyOrExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:328:4: ( (lv_operand2_3_0= ruleEvoMappingAnd ) )
            	    // InternalEvoMappingRepairDsl.g:329:5: (lv_operand2_3_0= ruleEvoMappingAnd )
            	    {
            	    // InternalEvoMappingRepairDsl.g:329:5: (lv_operand2_3_0= ruleEvoMappingAnd )
            	    // InternalEvoMappingRepairDsl.g:330:6: lv_operand2_3_0= ruleEvoMappingAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingOrAccess().getOperand2EvoMappingAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop2;
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
    // InternalEvoMappingRepairDsl.g:352:1: entryRuleEvoMappingAnd returns [EObject current=null] : iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF ;
    public final EObject entryRuleEvoMappingAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAnd = null;


        try {
            // InternalEvoMappingRepairDsl.g:352:54: (iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF )
            // InternalEvoMappingRepairDsl.g:353:2: iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF
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
    // InternalEvoMappingRepairDsl.g:359:1: ruleEvoMappingAnd returns [EObject current=null] : (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* ) ;
    public final EObject ruleEvoMappingAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingEqual_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:365:2: ( (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:366:2: (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:366:2: (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* )
            // InternalEvoMappingRepairDsl.g:367:3: this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingAndAccess().getEvoMappingEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_EvoMappingEqual_0=ruleEvoMappingEqual();

            state._fsp--;


            			current = this_EvoMappingEqual_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:375:3: ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:376:4: () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:376:4: ()
            	    // InternalEvoMappingRepairDsl.g:377:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingAndAccess().getHyAndExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:387:4: ( (lv_operand2_3_0= ruleEvoMappingEqual ) )
            	    // InternalEvoMappingRepairDsl.g:388:5: (lv_operand2_3_0= ruleEvoMappingEqual )
            	    {
            	    // InternalEvoMappingRepairDsl.g:388:5: (lv_operand2_3_0= ruleEvoMappingEqual )
            	    // InternalEvoMappingRepairDsl.g:389:6: lv_operand2_3_0= ruleEvoMappingEqual
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingAndAccess().getOperand2EvoMappingEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop3;
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
    // InternalEvoMappingRepairDsl.g:411:1: entryRuleEvoMappingEqual returns [EObject current=null] : iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF ;
    public final EObject entryRuleEvoMappingEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEqual = null;


        try {
            // InternalEvoMappingRepairDsl.g:411:56: (iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF )
            // InternalEvoMappingRepairDsl.g:412:2: iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF
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
    // InternalEvoMappingRepairDsl.g:418:1: ruleEvoMappingEqual returns [EObject current=null] : (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* ) ;
    public final EObject ruleEvoMappingEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingUnequal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:424:2: ( (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:425:2: (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:425:2: (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* )
            // InternalEvoMappingRepairDsl.g:426:3: this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingEqualAccess().getEvoMappingUnequalParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_EvoMappingUnequal_0=ruleEvoMappingUnequal();

            state._fsp--;


            			current = this_EvoMappingUnequal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:434:3: ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:435:4: () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:435:4: ()
            	    // InternalEvoMappingRepairDsl.g:436:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingEqualAccess().getHyEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingEqualAccess().getEqualsSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:446:4: ( (lv_operand2_3_0= ruleEvoMappingUnequal ) )
            	    // InternalEvoMappingRepairDsl.g:447:5: (lv_operand2_3_0= ruleEvoMappingUnequal )
            	    {
            	    // InternalEvoMappingRepairDsl.g:447:5: (lv_operand2_3_0= ruleEvoMappingUnequal )
            	    // InternalEvoMappingRepairDsl.g:448:6: lv_operand2_3_0= ruleEvoMappingUnequal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingEqualAccess().getOperand2EvoMappingUnequalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleEvoMappingEqual"


    // $ANTLR start "entryRuleEvoMappingUnequal"
    // InternalEvoMappingRepairDsl.g:470:1: entryRuleEvoMappingUnequal returns [EObject current=null] : iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF ;
    public final EObject entryRuleEvoMappingUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingUnequal = null;


        try {
            // InternalEvoMappingRepairDsl.g:470:58: (iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF )
            // InternalEvoMappingRepairDsl.g:471:2: iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF
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
    // InternalEvoMappingRepairDsl.g:477:1: ruleEvoMappingUnequal returns [EObject current=null] : (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* ) ;
    public final EObject ruleEvoMappingUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingImplication_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:483:2: ( (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:484:2: (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:484:2: (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* )
            // InternalEvoMappingRepairDsl.g:485:3: this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingUnequalAccess().getEvoMappingImplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_EvoMappingImplication_0=ruleEvoMappingImplication();

            state._fsp--;


            			current = this_EvoMappingImplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:493:3: ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:494:4: () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:494:4: ()
            	    // InternalEvoMappingRepairDsl.g:495:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingUnequalAccess().getHyNotEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:505:4: ( (lv_operand2_3_0= ruleEvoMappingImplication ) )
            	    // InternalEvoMappingRepairDsl.g:506:5: (lv_operand2_3_0= ruleEvoMappingImplication )
            	    {
            	    // InternalEvoMappingRepairDsl.g:506:5: (lv_operand2_3_0= ruleEvoMappingImplication )
            	    // InternalEvoMappingRepairDsl.g:507:6: lv_operand2_3_0= ruleEvoMappingImplication
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingUnequalAccess().getOperand2EvoMappingImplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleEvoMappingUnequal"


    // $ANTLR start "entryRuleEvoMappingImplication"
    // InternalEvoMappingRepairDsl.g:529:1: entryRuleEvoMappingImplication returns [EObject current=null] : iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF ;
    public final EObject entryRuleEvoMappingImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingImplication = null;


        try {
            // InternalEvoMappingRepairDsl.g:529:62: (iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF )
            // InternalEvoMappingRepairDsl.g:530:2: iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF
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
    // InternalEvoMappingRepairDsl.g:536:1: ruleEvoMappingImplication returns [EObject current=null] : (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* ) ;
    public final EObject ruleEvoMappingImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingEquivalence_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:542:2: ( (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:543:2: (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:543:2: (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* )
            // InternalEvoMappingRepairDsl.g:544:3: this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingImplicationAccess().getEvoMappingEquivalenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_EvoMappingEquivalence_0=ruleEvoMappingEquivalence();

            state._fsp--;


            			current = this_EvoMappingEquivalence_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:552:3: ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:553:4: () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:553:4: ()
            	    // InternalEvoMappingRepairDsl.g:554:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingImplicationAccess().getHyImpliesExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingImplicationAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:564:4: ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) )
            	    // InternalEvoMappingRepairDsl.g:565:5: (lv_operand2_3_0= ruleEvoMappingEquivalence )
            	    {
            	    // InternalEvoMappingRepairDsl.g:565:5: (lv_operand2_3_0= ruleEvoMappingEquivalence )
            	    // InternalEvoMappingRepairDsl.g:566:6: lv_operand2_3_0= ruleEvoMappingEquivalence
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingImplicationAccess().getOperand2EvoMappingEquivalenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // $ANTLR end "ruleEvoMappingImplication"


    // $ANTLR start "entryRuleEvoMappingEquivalence"
    // InternalEvoMappingRepairDsl.g:588:1: entryRuleEvoMappingEquivalence returns [EObject current=null] : iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF ;
    public final EObject entryRuleEvoMappingEquivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEquivalence = null;


        try {
            // InternalEvoMappingRepairDsl.g:588:62: (iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF )
            // InternalEvoMappingRepairDsl.g:589:2: iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF
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
    // InternalEvoMappingRepairDsl.g:595:1: ruleEvoMappingEquivalence returns [EObject current=null] : (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* ) ;
    public final EObject ruleEvoMappingEquivalence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingLessExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:601:2: ( (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:602:2: (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:602:2: (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:603:3: this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingEquivalenceAccess().getEvoMappingLessExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_EvoMappingLessExpression_0=ruleEvoMappingLessExpression();

            state._fsp--;


            			current = this_EvoMappingLessExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:611:3: ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:612:4: () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:612:4: ()
            	    // InternalEvoMappingRepairDsl.g:613:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingEquivalenceAccess().getHyEquivalenceExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingEquivalenceAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:623:4: ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) )
            	    // InternalEvoMappingRepairDsl.g:624:5: (lv_operand2_3_0= ruleEvoMappingLessExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:624:5: (lv_operand2_3_0= ruleEvoMappingLessExpression )
            	    // InternalEvoMappingRepairDsl.g:625:6: lv_operand2_3_0= ruleEvoMappingLessExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingEquivalenceAccess().getOperand2EvoMappingLessExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
    // $ANTLR end "ruleEvoMappingEquivalence"


    // $ANTLR start "entryRuleEvoMappingLessExpression"
    // InternalEvoMappingRepairDsl.g:647:1: entryRuleEvoMappingLessExpression returns [EObject current=null] : iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF ;
    public final EObject entryRuleEvoMappingLessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingLessExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:647:65: (iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF )
            // InternalEvoMappingRepairDsl.g:648:2: iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF
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
    // InternalEvoMappingRepairDsl.g:654:1: ruleEvoMappingLessExpression returns [EObject current=null] : (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* ) ;
    public final EObject ruleEvoMappingLessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingIfPossibleExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:660:2: ( (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:661:2: (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:661:2: (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:662:3: this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingLessExpressionAccess().getEvoMappingIfPossibleExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EvoMappingIfPossibleExpression_0=ruleEvoMappingIfPossibleExpression();

            state._fsp--;


            			current = this_EvoMappingIfPossibleExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:670:3: ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:671:4: () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:671:4: ()
            	    // InternalEvoMappingRepairDsl.g:672:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingLessExpressionAccess().getHyLessExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingLessExpressionAccess().getLessThanSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:682:4: ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) )
            	    // InternalEvoMappingRepairDsl.g:683:5: (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:683:5: (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression )
            	    // InternalEvoMappingRepairDsl.g:684:6: lv_operand2_3_0= ruleEvoMappingIfPossibleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingLessExpressionAccess().getOperand2EvoMappingIfPossibleExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "ruleEvoMappingLessExpression"


    // $ANTLR start "entryRuleEvoMappingIfPossibleExpression"
    // InternalEvoMappingRepairDsl.g:706:1: entryRuleEvoMappingIfPossibleExpression returns [EObject current=null] : iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF ;
    public final EObject entryRuleEvoMappingIfPossibleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingIfPossibleExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:706:71: (iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF )
            // InternalEvoMappingRepairDsl.g:707:2: iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF
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
    // InternalEvoMappingRepairDsl.g:713:1: ruleEvoMappingIfPossibleExpression returns [EObject current=null] : (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* ) ;
    public final EObject ruleEvoMappingIfPossibleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_EvoMappingLessOrEqualExpression_0 = null;

        EObject lv_operands_4_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:719:2: ( (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* ) )
            // InternalEvoMappingRepairDsl.g:720:2: (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* )
            {
            // InternalEvoMappingRepairDsl.g:720:2: (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* )
            // InternalEvoMappingRepairDsl.g:721:3: this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getEvoMappingLessOrEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_EvoMappingLessOrEqualExpression_0=ruleEvoMappingLessOrEqualExpression();

            state._fsp--;


            			current = this_EvoMappingLessOrEqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:729:3: (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:730:4: otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getIfPossibleKeyword_1_0());
            	    			
            	    // InternalEvoMappingRepairDsl.g:734:4: ()
            	    // InternalEvoMappingRepairDsl.g:735:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEvoMappingIfPossibleExpressionAccess().getHyIfPossibleExpressionOperandsAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalEvoMappingRepairDsl.g:741:4: (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==25) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalEvoMappingRepairDsl.g:742:5: otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,25,FOLLOW_4); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getCommaKeyword_1_2_0());
            	    	    				
            	    	    // InternalEvoMappingRepairDsl.g:746:5: ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) )
            	    	    // InternalEvoMappingRepairDsl.g:747:6: (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression )
            	    	    {
            	    	    // InternalEvoMappingRepairDsl.g:747:6: (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression )
            	    	    // InternalEvoMappingRepairDsl.g:748:7: lv_operands_4_0= ruleEvoMappingLessOrEqualExpression
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getOperandsEvoMappingLessOrEqualExpressionParserRuleCall_1_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_15);
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
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,14,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getRightParenthesisKeyword_1_3());
            	    			

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
    // $ANTLR end "ruleEvoMappingIfPossibleExpression"


    // $ANTLR start "entryRuleEvoMappingLessOrEqualExpression"
    // InternalEvoMappingRepairDsl.g:775:1: entryRuleEvoMappingLessOrEqualExpression returns [EObject current=null] : iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF ;
    public final EObject entryRuleEvoMappingLessOrEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingLessOrEqualExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:775:72: (iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF )
            // InternalEvoMappingRepairDsl.g:776:2: iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF
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
    // InternalEvoMappingRepairDsl.g:782:1: ruleEvoMappingLessOrEqualExpression returns [EObject current=null] : (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* ) ;
    public final EObject ruleEvoMappingLessOrEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingGreaterExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:788:2: ( (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:789:2: (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:789:2: (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:790:3: this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getEvoMappingGreaterExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EvoMappingGreaterExpression_0=ruleEvoMappingGreaterExpression();

            state._fsp--;


            			current = this_EvoMappingGreaterExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:798:3: ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:799:4: () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:799:4: ()
            	    // InternalEvoMappingRepairDsl.g:800:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getHyLessOrEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getLessThanSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:810:4: ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) )
            	    // InternalEvoMappingRepairDsl.g:811:5: (lv_operand2_3_0= ruleEvoMappingGreaterExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:811:5: (lv_operand2_3_0= ruleEvoMappingGreaterExpression )
            	    // InternalEvoMappingRepairDsl.g:812:6: lv_operand2_3_0= ruleEvoMappingGreaterExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getOperand2EvoMappingGreaterExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop11;
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
    // InternalEvoMappingRepairDsl.g:834:1: entryRuleEvoMappingGreaterExpression returns [EObject current=null] : iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF ;
    public final EObject entryRuleEvoMappingGreaterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingGreaterExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:834:68: (iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF )
            // InternalEvoMappingRepairDsl.g:835:2: iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF
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
    // InternalEvoMappingRepairDsl.g:841:1: ruleEvoMappingGreaterExpression returns [EObject current=null] : (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* ) ;
    public final EObject ruleEvoMappingGreaterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingGreaterOrEqualExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:847:2: ( (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:848:2: (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:848:2: (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:849:3: this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionAccess().getEvoMappingGreaterOrEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_EvoMappingGreaterOrEqualExpression_0=ruleEvoMappingGreaterOrEqualExpression();

            state._fsp--;


            			current = this_EvoMappingGreaterOrEqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:857:3: ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:858:4: () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:858:4: ()
            	    // InternalEvoMappingRepairDsl.g:859:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingGreaterExpressionAccess().getHyGreaterExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingGreaterExpressionAccess().getGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:869:4: ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) )
            	    // InternalEvoMappingRepairDsl.g:870:5: (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:870:5: (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression )
            	    // InternalEvoMappingRepairDsl.g:871:6: lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionAccess().getOperand2EvoMappingGreaterOrEqualExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleEvoMappingGreaterExpression"


    // $ANTLR start "entryRuleEvoMappingGreaterOrEqualExpression"
    // InternalEvoMappingRepairDsl.g:893:1: entryRuleEvoMappingGreaterOrEqualExpression returns [EObject current=null] : iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF ;
    public final EObject entryRuleEvoMappingGreaterOrEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingGreaterOrEqualExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:893:75: (iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF )
            // InternalEvoMappingRepairDsl.g:894:2: iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF
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
    // InternalEvoMappingRepairDsl.g:900:1: ruleEvoMappingGreaterOrEqualExpression returns [EObject current=null] : (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingGreaterOrEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingSubtractionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:906:2: ( (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:907:2: (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:907:2: (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:908:3: this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getEvoMappingSubtractionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_EvoMappingSubtractionExpression_0=ruleEvoMappingSubtractionExpression();

            state._fsp--;


            			current = this_EvoMappingSubtractionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:916:3: ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:917:4: () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:917:4: ()
            	    // InternalEvoMappingRepairDsl.g:918:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getHyGreaterOrEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:928:4: ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) )
            	    // InternalEvoMappingRepairDsl.g:929:5: (lv_operand2_3_0= ruleEvoMappingSubtractionExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:929:5: (lv_operand2_3_0= ruleEvoMappingSubtractionExpression )
            	    // InternalEvoMappingRepairDsl.g:930:6: lv_operand2_3_0= ruleEvoMappingSubtractionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getOperand2EvoMappingSubtractionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // $ANTLR end "ruleEvoMappingGreaterOrEqualExpression"


    // $ANTLR start "entryRuleEvoMappingSubtractionExpression"
    // InternalEvoMappingRepairDsl.g:952:1: entryRuleEvoMappingSubtractionExpression returns [EObject current=null] : iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF ;
    public final EObject entryRuleEvoMappingSubtractionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingSubtractionExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:952:72: (iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF )
            // InternalEvoMappingRepairDsl.g:953:2: iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF
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
    // InternalEvoMappingRepairDsl.g:959:1: ruleEvoMappingSubtractionExpression returns [EObject current=null] : (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingSubtractionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingAdditionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:965:2: ( (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:966:2: (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:966:2: (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:967:3: this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionAccess().getEvoMappingAdditionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_EvoMappingAdditionExpression_0=ruleEvoMappingAdditionExpression();

            state._fsp--;


            			current = this_EvoMappingAdditionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:975:3: ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:976:4: () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:976:4: ()
            	    // InternalEvoMappingRepairDsl.g:977:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingSubtractionExpressionAccess().getHySubtractionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingSubtractionExpressionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:987:4: ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) )
            	    // InternalEvoMappingRepairDsl.g:988:5: (lv_operand2_3_0= ruleEvoMappingAdditionExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:988:5: (lv_operand2_3_0= ruleEvoMappingAdditionExpression )
            	    // InternalEvoMappingRepairDsl.g:989:6: lv_operand2_3_0= ruleEvoMappingAdditionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionAccess().getOperand2EvoMappingAdditionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // $ANTLR end "ruleEvoMappingSubtractionExpression"


    // $ANTLR start "entryRuleEvoMappingAdditionExpression"
    // InternalEvoMappingRepairDsl.g:1011:1: entryRuleEvoMappingAdditionExpression returns [EObject current=null] : iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF ;
    public final EObject entryRuleEvoMappingAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAdditionExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1011:69: (iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF )
            // InternalEvoMappingRepairDsl.g:1012:2: iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1018:1: ruleEvoMappingAdditionExpression returns [EObject current=null] : (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* ) ;
    public final EObject ruleEvoMappingAdditionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingModuloExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1024:2: ( (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:1025:2: (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:1025:2: (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:1026:3: this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionAccess().getEvoMappingModuloExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_EvoMappingModuloExpression_0=ruleEvoMappingModuloExpression();

            state._fsp--;


            			current = this_EvoMappingModuloExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:1034:3: ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:1035:4: () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1035:4: ()
            	    // InternalEvoMappingRepairDsl.g:1036:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingAdditionExpressionAccess().getHyAdditionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingAdditionExpressionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:1046:4: ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) )
            	    // InternalEvoMappingRepairDsl.g:1047:5: (lv_operand2_3_0= ruleEvoMappingModuloExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1047:5: (lv_operand2_3_0= ruleEvoMappingModuloExpression )
            	    // InternalEvoMappingRepairDsl.g:1048:6: lv_operand2_3_0= ruleEvoMappingModuloExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionAccess().getOperand2EvoMappingModuloExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // $ANTLR end "ruleEvoMappingAdditionExpression"


    // $ANTLR start "entryRuleEvoMappingModuloExpression"
    // InternalEvoMappingRepairDsl.g:1070:1: entryRuleEvoMappingModuloExpression returns [EObject current=null] : iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF ;
    public final EObject entryRuleEvoMappingModuloExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingModuloExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1070:67: (iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF )
            // InternalEvoMappingRepairDsl.g:1071:2: iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1077:1: ruleEvoMappingModuloExpression returns [EObject current=null] : (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* ) ;
    public final EObject ruleEvoMappingModuloExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingMultiplicationExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1083:2: ( (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:1084:2: (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:1084:2: (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:1085:3: this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingModuloExpressionAccess().getEvoMappingMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_EvoMappingMultiplicationExpression_0=ruleEvoMappingMultiplicationExpression();

            state._fsp--;


            			current = this_EvoMappingMultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:1093:3: ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:1094:4: () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1094:4: ()
            	    // InternalEvoMappingRepairDsl.g:1095:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingModuloExpressionAccess().getHyModuloExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingModuloExpressionAccess().getPercentSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:1105:4: ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) )
            	    // InternalEvoMappingRepairDsl.g:1106:5: (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1106:5: (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression )
            	    // InternalEvoMappingRepairDsl.g:1107:6: lv_operand2_3_0= ruleEvoMappingMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingModuloExpressionAccess().getOperand2EvoMappingMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // $ANTLR end "ruleEvoMappingModuloExpression"


    // $ANTLR start "entryRuleEvoMappingMultiplicationExpression"
    // InternalEvoMappingRepairDsl.g:1129:1: entryRuleEvoMappingMultiplicationExpression returns [EObject current=null] : iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF ;
    public final EObject entryRuleEvoMappingMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMultiplicationExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1129:75: (iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF )
            // InternalEvoMappingRepairDsl.g:1130:2: iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1136:1: ruleEvoMappingMultiplicationExpression returns [EObject current=null] : (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingDivisionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1142:2: ( (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:1143:2: (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:1143:2: (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* )
            // InternalEvoMappingRepairDsl.g:1144:3: this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getEvoMappingDivisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_EvoMappingDivisionExpression_0=ruleEvoMappingDivisionExpression();

            state._fsp--;


            			current = this_EvoMappingDivisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:1152:3: ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:1153:4: () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1153:4: ()
            	    // InternalEvoMappingRepairDsl.g:1154:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingMultiplicationExpressionAccess().getHyMultiplicationExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingMultiplicationExpressionAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:1164:4: ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) )
            	    // InternalEvoMappingRepairDsl.g:1165:5: (lv_operand2_3_0= ruleEvoMappingDivisionExpression )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1165:5: (lv_operand2_3_0= ruleEvoMappingDivisionExpression )
            	    // InternalEvoMappingRepairDsl.g:1166:6: lv_operand2_3_0= ruleEvoMappingDivisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getOperand2EvoMappingDivisionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleEvoMappingMultiplicationExpression"


    // $ANTLR start "entryRuleEvoMappingDivisionExpression"
    // InternalEvoMappingRepairDsl.g:1188:1: entryRuleEvoMappingDivisionExpression returns [EObject current=null] : iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF ;
    public final EObject entryRuleEvoMappingDivisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingDivisionExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1188:69: (iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF )
            // InternalEvoMappingRepairDsl.g:1189:2: iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1195:1: ruleEvoMappingDivisionExpression returns [EObject current=null] : (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* ) ;
    public final EObject ruleEvoMappingDivisionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingTerminal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1201:2: ( (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:1202:2: (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:1202:2: (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* )
            // InternalEvoMappingRepairDsl.g:1203:3: this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionAccess().getEvoMappingTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_EvoMappingTerminal_0=ruleEvoMappingTerminal();

            state._fsp--;


            			current = this_EvoMappingTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:1211:3: ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:1212:4: () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1212:4: ()
            	    // InternalEvoMappingRepairDsl.g:1213:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingDivisionExpressionAccess().getHyDivisionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingDivisionExpressionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:1223:4: ( (lv_operand2_3_0= ruleEvoMappingTerminal ) )
            	    // InternalEvoMappingRepairDsl.g:1224:5: (lv_operand2_3_0= ruleEvoMappingTerminal )
            	    {
            	    // InternalEvoMappingRepairDsl.g:1224:5: (lv_operand2_3_0= ruleEvoMappingTerminal )
            	    // InternalEvoMappingRepairDsl.g:1225:6: lv_operand2_3_0= ruleEvoMappingTerminal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionAccess().getOperand2EvoMappingTerminalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleEvoMappingDivisionExpression"


    // $ANTLR start "entryRuleEvoMappingTerminal"
    // InternalEvoMappingRepairDsl.g:1247:1: entryRuleEvoMappingTerminal returns [EObject current=null] : iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF ;
    public final EObject entryRuleEvoMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingTerminal = null;


        try {
            // InternalEvoMappingRepairDsl.g:1247:59: (iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF )
            // InternalEvoMappingRepairDsl.g:1248:2: iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF
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
    // InternalEvoMappingRepairDsl.g:1254:1: ruleEvoMappingTerminal returns [EObject current=null] : (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot ) ;
    public final EObject ruleEvoMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingFeatureReferenceExpression_0 = null;

        EObject this_EvoMappingNestedExpression_1 = null;

        EObject this_EvoMappingNegation_2 = null;

        EObject this_EvoMappingConditionalFeatureReferenceExpression_3 = null;

        EObject this_EvoMappingContextInformationReferenceExpression_4 = null;

        EObject this_EvoMappingAttributeReferenceExpression_5 = null;

        EObject this_EvoMappingValueExpression_6 = null;

        EObject this_EvoMappingBooleanValueExpression_7 = null;

        EObject this_EvoMappingMimumumExpression_8 = null;

        EObject this_EvoMappingMaximumExpression_9 = null;

        EObject this_EvoMappingNot_10 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1260:2: ( (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot ) )
            // InternalEvoMappingRepairDsl.g:1261:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot )
            {
            // InternalEvoMappingRepairDsl.g:1261:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot )
            int alt19=11;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:1262:3: this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression
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
                    // InternalEvoMappingRepairDsl.g:1271:3: this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNestedExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNestedExpression_1=ruleEvoMappingNestedExpression();

                    state._fsp--;


                    			current = this_EvoMappingNestedExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEvoMappingRepairDsl.g:1280:3: this_EvoMappingNegation_2= ruleEvoMappingNegation
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNegationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNegation_2=ruleEvoMappingNegation();

                    state._fsp--;


                    			current = this_EvoMappingNegation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEvoMappingRepairDsl.g:1289:3: this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingConditionalFeatureReferenceExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingConditionalFeatureReferenceExpression_3=ruleEvoMappingConditionalFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingConditionalFeatureReferenceExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEvoMappingRepairDsl.g:1298:3: this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingContextInformationReferenceExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingContextInformationReferenceExpression_4=ruleEvoMappingContextInformationReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingContextInformationReferenceExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEvoMappingRepairDsl.g:1307:3: this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingAttributeReferenceExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingAttributeReferenceExpression_5=ruleEvoMappingAttributeReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingAttributeReferenceExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEvoMappingRepairDsl.g:1316:3: this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingValueExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingValueExpression_6=ruleEvoMappingValueExpression();

                    state._fsp--;


                    			current = this_EvoMappingValueExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEvoMappingRepairDsl.g:1325:3: this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingBooleanValueExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingBooleanValueExpression_7=ruleEvoMappingBooleanValueExpression();

                    state._fsp--;


                    			current = this_EvoMappingBooleanValueExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalEvoMappingRepairDsl.g:1334:3: this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingMimumumExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingMimumumExpression_8=ruleEvoMappingMimumumExpression();

                    state._fsp--;


                    			current = this_EvoMappingMimumumExpression_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalEvoMappingRepairDsl.g:1343:3: this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingMaximumExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingMaximumExpression_9=ruleEvoMappingMaximumExpression();

                    state._fsp--;


                    			current = this_EvoMappingMaximumExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalEvoMappingRepairDsl.g:1352:3: this_EvoMappingNot_10= ruleEvoMappingNot
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNotParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNot_10=ruleEvoMappingNot();

                    state._fsp--;


                    			current = this_EvoMappingNot_10;
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
    // InternalEvoMappingRepairDsl.g:1364:1: entryRuleEvoMappingNestedExpression returns [EObject current=null] : iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF ;
    public final EObject entryRuleEvoMappingNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNestedExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1364:67: (iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF )
            // InternalEvoMappingRepairDsl.g:1365:2: iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1371:1: ruleEvoMappingNestedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingNestedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1377:2: ( (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalEvoMappingRepairDsl.g:1378:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalEvoMappingRepairDsl.g:1378:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalEvoMappingRepairDsl.g:1379:3: otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNestedExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:1383:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:1384:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:1384:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:1385:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingNestedExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEvoMappingNegation"
    // InternalEvoMappingRepairDsl.g:1410:1: entryRuleEvoMappingNegation returns [EObject current=null] : iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF ;
    public final EObject entryRuleEvoMappingNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNegation = null;


        try {
            // InternalEvoMappingRepairDsl.g:1410:59: (iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF )
            // InternalEvoMappingRepairDsl.g:1411:2: iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF
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
    // InternalEvoMappingRepairDsl.g:1417:1: ruleEvoMappingNegation returns [EObject current=null] : (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) ) ;
    public final EObject ruleEvoMappingNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1423:2: ( (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) ) )
            // InternalEvoMappingRepairDsl.g:1424:2: (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) )
            {
            // InternalEvoMappingRepairDsl.g:1424:2: (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) )
            // InternalEvoMappingRepairDsl.g:1425:3: otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNegationAccess().getHyphenMinusKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:1429:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:1430:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:1430:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:1431:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingNegationAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNegationRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
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


    // $ANTLR start "entryRuleEvoMappingNot"
    // InternalEvoMappingRepairDsl.g:1452:1: entryRuleEvoMappingNot returns [EObject current=null] : iv_ruleEvoMappingNot= ruleEvoMappingNot EOF ;
    public final EObject entryRuleEvoMappingNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNot = null;


        try {
            // InternalEvoMappingRepairDsl.g:1452:54: (iv_ruleEvoMappingNot= ruleEvoMappingNot EOF )
            // InternalEvoMappingRepairDsl.g:1453:2: iv_ruleEvoMappingNot= ruleEvoMappingNot EOF
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
    // InternalEvoMappingRepairDsl.g:1459:1: ruleEvoMappingNot returns [EObject current=null] : (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) ) ;
    public final EObject ruleEvoMappingNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1465:2: ( (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) ) )
            // InternalEvoMappingRepairDsl.g:1466:2: (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) )
            {
            // InternalEvoMappingRepairDsl.g:1466:2: (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) )
            // InternalEvoMappingRepairDsl.g:1467:3: otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNotAccess().getExclamationMarkKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:1471:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:1472:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:1472:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:1473:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingNotAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNotRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
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
    // InternalEvoMappingRepairDsl.g:1494:1: entryRuleEvoMappingFeatureReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingFeatureReferenceExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1494:77: (iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF )
            // InternalEvoMappingRepairDsl.g:1495:2: iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1501:1: ruleEvoMappingFeatureReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleEvoMappingFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1507:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalEvoMappingRepairDsl.g:1508:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalEvoMappingRepairDsl.g:1508:2: ( (otherlv_0= RULE_STRING ) )
            // InternalEvoMappingRepairDsl.g:1509:3: (otherlv_0= RULE_STRING )
            {
            // InternalEvoMappingRepairDsl.g:1509:3: (otherlv_0= RULE_STRING )
            // InternalEvoMappingRepairDsl.g:1510:4: otherlv_0= RULE_STRING
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
    // InternalEvoMappingRepairDsl.g:1524:1: entryRuleEvoMappingConditionalFeatureReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingConditionalFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingConditionalFeatureReferenceExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1524:88: (iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF )
            // InternalEvoMappingRepairDsl.g:1525:2: iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1531:1: ruleEvoMappingConditionalFeatureReferenceExpression returns [EObject current=null] : (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? ) ;
    public final EObject ruleEvoMappingConditionalFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_versionRestriction_2_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1537:2: ( (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? ) )
            // InternalEvoMappingRepairDsl.g:1538:2: (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? )
            {
            // InternalEvoMappingRepairDsl.g:1538:2: (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? )
            // InternalEvoMappingRepairDsl.g:1539:3: otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getQuestionMarkKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:1543:3: ( ( ruleQualifiedName ) )
            // InternalEvoMappingRepairDsl.g:1544:4: ( ruleQualifiedName )
            {
            // InternalEvoMappingRepairDsl.g:1544:4: ( ruleQualifiedName )
            // InternalEvoMappingRepairDsl.g:1545:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoMappingRepairDsl.g:1559:3: ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36||LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:1560:4: (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction )
                    {
                    // InternalEvoMappingRepairDsl.g:1560:4: (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction )
                    // InternalEvoMappingRepairDsl.g:1561:5: lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction
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
    // InternalEvoMappingRepairDsl.g:1582:1: entryRuleEvoMappingVersionRestriction returns [EObject current=null] : iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF ;
    public final EObject entryRuleEvoMappingVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVersionRestriction = null;


        try {
            // InternalEvoMappingRepairDsl.g:1582:69: (iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF )
            // InternalEvoMappingRepairDsl.g:1583:2: iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF
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
    // InternalEvoMappingRepairDsl.g:1589:1: ruleEvoMappingVersionRestriction returns [EObject current=null] : (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction ) ;
    public final EObject ruleEvoMappingVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingRelativeVersionRestriction_0 = null;

        EObject this_EvoMappingVersionRangeRestriction_1 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1595:2: ( (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction ) )
            // InternalEvoMappingRepairDsl.g:1596:2: (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction )
            {
            // InternalEvoMappingRepairDsl.g:1596:2: (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==38) ) {
                    alt21=2;
                }
                else if ( (LA21_1==23||(LA21_1>=26 && LA21_1<=28)||LA21_1==72) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:1597:3: this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction
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
                    // InternalEvoMappingRepairDsl.g:1606:3: this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction
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
    // InternalEvoMappingRepairDsl.g:1618:1: entryRuleEvoMappingRelativeVersionRestriction returns [EObject current=null] : iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF ;
    public final EObject entryRuleEvoMappingRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingRelativeVersionRestriction = null;


        try {
            // InternalEvoMappingRepairDsl.g:1618:77: (iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF )
            // InternalEvoMappingRepairDsl.g:1619:2: iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF
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
    // InternalEvoMappingRepairDsl.g:1625:1: ruleEvoMappingRelativeVersionRestriction returns [EObject current=null] : (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleEvoMappingRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1631:2: ( (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) )
            // InternalEvoMappingRepairDsl.g:1632:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            {
            // InternalEvoMappingRepairDsl.g:1632:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            // InternalEvoMappingRepairDsl.g:1633:3: otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:1637:3: ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) )
            // InternalEvoMappingRepairDsl.g:1638:4: (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator )
            {
            // InternalEvoMappingRepairDsl.g:1638:4: (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator )
            // InternalEvoMappingRepairDsl.g:1639:5: lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator
            {

            					newCompositeNode(grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getOperatorEvoMappingRelativeVersionRestrictionOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalEvoMappingRepairDsl.g:1656:3: ( (otherlv_2= RULE_ID ) )
            // InternalEvoMappingRepairDsl.g:1657:4: (otherlv_2= RULE_ID )
            {
            // InternalEvoMappingRepairDsl.g:1657:4: (otherlv_2= RULE_ID )
            // InternalEvoMappingRepairDsl.g:1658:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingRelativeVersionRestrictionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getVersionHyVersionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:1677:1: entryRuleEvoMappingVersionRangeRestriction returns [EObject current=null] : iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF ;
    public final EObject entryRuleEvoMappingVersionRangeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVersionRangeRestriction = null;


        try {
            // InternalEvoMappingRepairDsl.g:1677:74: (iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF )
            // InternalEvoMappingRepairDsl.g:1678:2: iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF
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
    // InternalEvoMappingRepairDsl.g:1684:1: ruleEvoMappingVersionRangeRestriction returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) ;
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
            // InternalEvoMappingRepairDsl.g:1690:2: ( ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) )
            // InternalEvoMappingRepairDsl.g:1691:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            {
            // InternalEvoMappingRepairDsl.g:1691:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:1692:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    {
                    // InternalEvoMappingRepairDsl.g:1692:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    // InternalEvoMappingRepairDsl.g:1693:4: otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) )
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_0, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalEvoMappingRepairDsl.g:1697:4: ( (lv_lowerIncluded_1_0= 'true' ) )
                    // InternalEvoMappingRepairDsl.g:1698:5: (lv_lowerIncluded_1_0= 'true' )
                    {
                    // InternalEvoMappingRepairDsl.g:1698:5: (lv_lowerIncluded_1_0= 'true' )
                    // InternalEvoMappingRepairDsl.g:1699:6: lv_lowerIncluded_1_0= 'true'
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
                    // InternalEvoMappingRepairDsl.g:1713:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    {
                    // InternalEvoMappingRepairDsl.g:1713:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    // InternalEvoMappingRepairDsl.g:1714:4: otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getFalseKeyword_1_0());
                    			
                    // InternalEvoMappingRepairDsl.g:1718:4: ( ( ruleQualifiedName ) )
                    // InternalEvoMappingRepairDsl.g:1719:5: ( ruleQualifiedName )
                    {
                    // InternalEvoMappingRepairDsl.g:1719:5: ( ruleQualifiedName )
                    // InternalEvoMappingRepairDsl.g:1720:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLowerVersionHyVersionCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getHyphenMinusKeyword_1_2());
                    			
                    // InternalEvoMappingRepairDsl.g:1738:4: ( (lv_upperIncluded_5_0= 'true' ) )
                    // InternalEvoMappingRepairDsl.g:1739:5: (lv_upperIncluded_5_0= 'true' )
                    {
                    // InternalEvoMappingRepairDsl.g:1739:5: (lv_upperIncluded_5_0= 'true' )
                    // InternalEvoMappingRepairDsl.g:1740:6: lv_upperIncluded_5_0= 'true'
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
                    // InternalEvoMappingRepairDsl.g:1754:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    {
                    // InternalEvoMappingRepairDsl.g:1754:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    // InternalEvoMappingRepairDsl.g:1755:4: otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getFalseKeyword_2_0());
                    			
                    // InternalEvoMappingRepairDsl.g:1759:4: ( ( ruleQualifiedName ) )
                    // InternalEvoMappingRepairDsl.g:1760:5: ( ruleQualifiedName )
                    {
                    // InternalEvoMappingRepairDsl.g:1760:5: ( ruleQualifiedName )
                    // InternalEvoMappingRepairDsl.g:1761:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getUpperVersionHyVersionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,37,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:1784:1: entryRuleEvoMappingContextInformationReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingContextInformationReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingContextInformationReferenceExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1784:88: (iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF )
            // InternalEvoMappingRepairDsl.g:1785:2: iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1791:1: ruleEvoMappingContextInformationReferenceExpression returns [EObject current=null] : (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEvoMappingContextInformationReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1797:2: ( (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) ) )
            // InternalEvoMappingRepairDsl.g:1798:2: (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) )
            {
            // InternalEvoMappingRepairDsl.g:1798:2: (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) )
            // InternalEvoMappingRepairDsl.g:1799:3: otherlv_0= 'context:' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingContextInformationReferenceExpressionAccess().getContextKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:1803:3: ( ( ruleQualifiedName ) )
            // InternalEvoMappingRepairDsl.g:1804:4: ( ruleQualifiedName )
            {
            // InternalEvoMappingRepairDsl.g:1804:4: ( ruleQualifiedName )
            // InternalEvoMappingRepairDsl.g:1805:5: ruleQualifiedName
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
    // InternalEvoMappingRepairDsl.g:1823:1: entryRuleEvoMappingAttributeReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingAttributeReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAttributeReferenceExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1823:79: (iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF )
            // InternalEvoMappingRepairDsl.g:1824:2: iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1830:1: ruleEvoMappingAttributeReferenceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEvoMappingAttributeReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1836:2: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalEvoMappingRepairDsl.g:1837:2: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalEvoMappingRepairDsl.g:1837:2: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalEvoMappingRepairDsl.g:1838:3: ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalEvoMappingRepairDsl.g:1838:3: ( (otherlv_0= RULE_STRING ) )
            // InternalEvoMappingRepairDsl.g:1839:4: (otherlv_0= RULE_STRING )
            {
            // InternalEvoMappingRepairDsl.g:1839:4: (otherlv_0= RULE_STRING )
            // InternalEvoMappingRepairDsl.g:1840:5: otherlv_0= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingAttributeReferenceExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getFullStopKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:1855:3: ( ( ruleQualifiedName ) )
            // InternalEvoMappingRepairDsl.g:1856:4: ( ruleQualifiedName )
            {
            // InternalEvoMappingRepairDsl.g:1856:4: ( ruleQualifiedName )
            // InternalEvoMappingRepairDsl.g:1857:5: ruleQualifiedName
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
    // InternalEvoMappingRepairDsl.g:1875:1: entryRuleEvoMappingValueExpression returns [EObject current=null] : iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF ;
    public final EObject entryRuleEvoMappingValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingValueExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1875:66: (iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF )
            // InternalEvoMappingRepairDsl.g:1876:2: iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1882:1: ruleEvoMappingValueExpression returns [EObject current=null] : ( (lv_value_0_0= ruleEvoMappingNumberValue ) ) ;
    public final EObject ruleEvoMappingValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1888:2: ( ( (lv_value_0_0= ruleEvoMappingNumberValue ) ) )
            // InternalEvoMappingRepairDsl.g:1889:2: ( (lv_value_0_0= ruleEvoMappingNumberValue ) )
            {
            // InternalEvoMappingRepairDsl.g:1889:2: ( (lv_value_0_0= ruleEvoMappingNumberValue ) )
            // InternalEvoMappingRepairDsl.g:1890:3: (lv_value_0_0= ruleEvoMappingNumberValue )
            {
            // InternalEvoMappingRepairDsl.g:1890:3: (lv_value_0_0= ruleEvoMappingNumberValue )
            // InternalEvoMappingRepairDsl.g:1891:4: lv_value_0_0= ruleEvoMappingNumberValue
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
    // InternalEvoMappingRepairDsl.g:1911:1: entryRuleEvoMappingBooleanValueExpression returns [EObject current=null] : iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF ;
    public final EObject entryRuleEvoMappingBooleanValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingBooleanValueExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:1911:73: (iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF )
            // InternalEvoMappingRepairDsl.g:1912:2: iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF
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
    // InternalEvoMappingRepairDsl.g:1918:1: ruleEvoMappingBooleanValueExpression returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleEvoMappingBooleanValueExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1924:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalEvoMappingRepairDsl.g:1925:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalEvoMappingRepairDsl.g:1925:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalEvoMappingRepairDsl.g:1926:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalEvoMappingRepairDsl.g:1926:3: ()
            // InternalEvoMappingRepairDsl.g:1927:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoMappingBooleanValueExpressionAccess().getHyBooleanValueExpressionAction_0(),
            					current);
            			

            }

            // InternalEvoMappingRepairDsl.g:1933:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
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
                    // InternalEvoMappingRepairDsl.g:1934:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalEvoMappingRepairDsl.g:1934:4: ( (lv_value_1_0= 'true' ) )
                    // InternalEvoMappingRepairDsl.g:1935:5: (lv_value_1_0= 'true' )
                    {
                    // InternalEvoMappingRepairDsl.g:1935:5: (lv_value_1_0= 'true' )
                    // InternalEvoMappingRepairDsl.g:1936:6: lv_value_1_0= 'true'
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
                    // InternalEvoMappingRepairDsl.g:1949:4: otherlv_2= 'false'
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
    // InternalEvoMappingRepairDsl.g:1958:1: entryRuleEvoMappingNumberValue returns [EObject current=null] : iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF ;
    public final EObject entryRuleEvoMappingNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNumberValue = null;


        try {
            // InternalEvoMappingRepairDsl.g:1958:62: (iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF )
            // InternalEvoMappingRepairDsl.g:1959:2: iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF
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
    // InternalEvoMappingRepairDsl.g:1965:1: ruleEvoMappingNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleEvoMappingNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:1971:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalEvoMappingRepairDsl.g:1972:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalEvoMappingRepairDsl.g:1972:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalEvoMappingRepairDsl.g:1973:3: (lv_value_0_0= RULE_INT )
            {
            // InternalEvoMappingRepairDsl.g:1973:3: (lv_value_0_0= RULE_INT )
            // InternalEvoMappingRepairDsl.g:1974:4: lv_value_0_0= RULE_INT
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
    // InternalEvoMappingRepairDsl.g:1993:1: entryRuleEvoMappingEnumLiteral returns [EObject current=null] : iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF ;
    public final EObject entryRuleEvoMappingEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEnumLiteral = null;


        try {
            // InternalEvoMappingRepairDsl.g:1993:62: (iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF )
            // InternalEvoMappingRepairDsl.g:1994:2: iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF
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
    // InternalEvoMappingRepairDsl.g:2000:1: ruleEvoMappingEnumLiteral returns [EObject current=null] : (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) ;
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
            // InternalEvoMappingRepairDsl.g:2006:2: ( (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) )
            // InternalEvoMappingRepairDsl.g:2007:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            {
            // InternalEvoMappingRepairDsl.g:2007:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            // InternalEvoMappingRepairDsl.g:2008:3: otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingEnumLiteralAccess().getEnumLiteralKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:2012:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoMappingRepairDsl.g:2013:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoMappingRepairDsl.g:2013:4: (lv_name_1_0= RULE_ID )
            // InternalEvoMappingRepairDsl.g:2014:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingEnumLiteralAccess().getCommaKeyword_2());
            		
            // InternalEvoMappingRepairDsl.g:2034:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalEvoMappingRepairDsl.g:2035:4: (lv_value_3_0= RULE_INT )
            {
            // InternalEvoMappingRepairDsl.g:2035:4: (lv_value_3_0= RULE_INT )
            // InternalEvoMappingRepairDsl.g:2036:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoMappingEnumLiteralAccess().getRightParenthesisKeyword_4());
            		
            // InternalEvoMappingRepairDsl.g:2056:3: (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:2057:4: otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']'
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvoMappingEnumLiteralAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalEvoMappingRepairDsl.g:2061:4: ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) )
                    int alt24=3;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_DATE) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==29) ) {
                            int LA24_3 = input.LA(3);

                            if ( (LA24_3==RULE_DATE) ) {
                                alt24=1;
                            }
                            else if ( (LA24_3==37) ) {
                                alt24=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 24, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA24_0==43) ) {
                        alt24=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalEvoMappingRepairDsl.g:2062:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            {
                            // InternalEvoMappingRepairDsl.g:2062:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            // InternalEvoMappingRepairDsl.g:2063:6: ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) )
                            {
                            // InternalEvoMappingRepairDsl.g:2063:6: ( (lv_validSince_6_0= RULE_DATE ) )
                            // InternalEvoMappingRepairDsl.g:2064:7: (lv_validSince_6_0= RULE_DATE )
                            {
                            // InternalEvoMappingRepairDsl.g:2064:7: (lv_validSince_6_0= RULE_DATE )
                            // InternalEvoMappingRepairDsl.g:2065:8: lv_validSince_6_0= RULE_DATE
                            {
                            lv_validSince_6_0=(Token)match(input,RULE_DATE,FOLLOW_29); 

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

                            otherlv_7=(Token)match(input,29,FOLLOW_35); 

                            						newLeafNode(otherlv_7, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_0_1());
                            					
                            // InternalEvoMappingRepairDsl.g:2085:6: ( (lv_validUntil_8_0= RULE_DATE ) )
                            // InternalEvoMappingRepairDsl.g:2086:7: (lv_validUntil_8_0= RULE_DATE )
                            {
                            // InternalEvoMappingRepairDsl.g:2086:7: (lv_validUntil_8_0= RULE_DATE )
                            // InternalEvoMappingRepairDsl.g:2087:8: lv_validUntil_8_0= RULE_DATE
                            {
                            lv_validUntil_8_0=(Token)match(input,RULE_DATE,FOLLOW_27); 

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
                            // InternalEvoMappingRepairDsl.g:2105:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            {
                            // InternalEvoMappingRepairDsl.g:2105:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            // InternalEvoMappingRepairDsl.g:2106:6: ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-'
                            {
                            // InternalEvoMappingRepairDsl.g:2106:6: ( (lv_validSince_9_0= RULE_DATE ) )
                            // InternalEvoMappingRepairDsl.g:2107:7: (lv_validSince_9_0= RULE_DATE )
                            {
                            // InternalEvoMappingRepairDsl.g:2107:7: (lv_validSince_9_0= RULE_DATE )
                            // InternalEvoMappingRepairDsl.g:2108:8: lv_validSince_9_0= RULE_DATE
                            {
                            lv_validSince_9_0=(Token)match(input,RULE_DATE,FOLLOW_29); 

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

                            otherlv_10=(Token)match(input,29,FOLLOW_27); 

                            						newLeafNode(otherlv_10, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalEvoMappingRepairDsl.g:2130:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            {
                            // InternalEvoMappingRepairDsl.g:2130:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            // InternalEvoMappingRepairDsl.g:2131:6: otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) )
                            {
                            otherlv_11=(Token)match(input,43,FOLLOW_29); 

                            						newLeafNode(otherlv_11, grammarAccess.getEvoMappingEnumLiteralAccess().getEternityKeyword_5_1_2_0());
                            					
                            otherlv_12=(Token)match(input,29,FOLLOW_35); 

                            						newLeafNode(otherlv_12, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_2_1());
                            					
                            // InternalEvoMappingRepairDsl.g:2139:6: ( (lv_validUntil_13_0= RULE_DATE ) )
                            // InternalEvoMappingRepairDsl.g:2140:7: (lv_validUntil_13_0= RULE_DATE )
                            {
                            // InternalEvoMappingRepairDsl.g:2140:7: (lv_validUntil_13_0= RULE_DATE )
                            // InternalEvoMappingRepairDsl.g:2141:8: lv_validUntil_13_0= RULE_DATE
                            {
                            lv_validUntil_13_0=(Token)match(input,RULE_DATE,FOLLOW_27); 

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

                    otherlv_14=(Token)match(input,37,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:2168:1: entryRuleEvoMappingMimumumExpression returns [EObject current=null] : iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF ;
    public final EObject entryRuleEvoMappingMimumumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMimumumExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:2168:68: (iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF )
            // InternalEvoMappingRepairDsl.g:2169:2: iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF
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
    // InternalEvoMappingRepairDsl.g:2175:1: ruleEvoMappingMimumumExpression returns [EObject current=null] : (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingMimumumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2181:2: ( (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalEvoMappingRepairDsl.g:2182:2: (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalEvoMappingRepairDsl.g:2182:2: (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalEvoMappingRepairDsl.g:2183:3: otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingMimumumExpressionAccess().getMinKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:2187:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:2188:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:2188:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:2189:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingMimumumExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:2214:1: entryRuleEvoMappingMaximumExpression returns [EObject current=null] : iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF ;
    public final EObject entryRuleEvoMappingMaximumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMaximumExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:2214:68: (iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF )
            // InternalEvoMappingRepairDsl.g:2215:2: iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF
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
    // InternalEvoMappingRepairDsl.g:2221:1: ruleEvoMappingMaximumExpression returns [EObject current=null] : (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingMaximumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2227:2: ( (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalEvoMappingRepairDsl.g:2228:2: (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalEvoMappingRepairDsl.g:2228:2: (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalEvoMappingRepairDsl.g:2229:3: otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingMaximumExpressionAccess().getMaxKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:2233:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoMappingRepairDsl.g:2234:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoMappingRepairDsl.g:2234:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoMappingRepairDsl.g:2235:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingMaximumExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:2260:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEvoMappingRepairDsl.g:2260:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEvoMappingRepairDsl.g:2261:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalEvoMappingRepairDsl.g:2267:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2273:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEvoMappingRepairDsl.g:2274:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEvoMappingRepairDsl.g:2274:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEvoMappingRepairDsl.g:2275:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEvoMappingRepairDsl.g:2282:3: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2283:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_24); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalEvoMappingRepairDsl.g:2300:1: entryRuleEvoExpression returns [EObject current=null] : iv_ruleEvoExpression= ruleEvoExpression EOF ;
    public final EObject entryRuleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoExpression = null;


        try {
            // InternalEvoMappingRepairDsl.g:2300:54: (iv_ruleEvoExpression= ruleEvoExpression EOF )
            // InternalEvoMappingRepairDsl.g:2301:2: iv_ruleEvoExpression= ruleEvoExpression EOF
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
    // InternalEvoMappingRepairDsl.g:2307:1: ruleEvoExpression returns [EObject current=null] : this_EvoXOr_0= ruleEvoXOr ;
    public final EObject ruleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoXOr_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2313:2: (this_EvoXOr_0= ruleEvoXOr )
            // InternalEvoMappingRepairDsl.g:2314:2: this_EvoXOr_0= ruleEvoXOr
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
    // InternalEvoMappingRepairDsl.g:2325:1: entryRuleEvoXOr returns [EObject current=null] : iv_ruleEvoXOr= ruleEvoXOr EOF ;
    public final EObject entryRuleEvoXOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoXOr = null;


        try {
            // InternalEvoMappingRepairDsl.g:2325:47: (iv_ruleEvoXOr= ruleEvoXOr EOF )
            // InternalEvoMappingRepairDsl.g:2326:2: iv_ruleEvoXOr= ruleEvoXOr EOF
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
    // InternalEvoMappingRepairDsl.g:2332:1: ruleEvoXOr returns [EObject current=null] : (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* ) ;
    public final EObject ruleEvoXOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoOr_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2338:2: ( (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2339:2: (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2339:2: (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* )
            // InternalEvoMappingRepairDsl.g:2340:3: this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoXOrAccess().getEvoOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_EvoOr_0=ruleEvoOr();

            state._fsp--;


            			current = this_EvoOr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2348:3: ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2349:4: () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2349:4: ()
            	    // InternalEvoMappingRepairDsl.g:2350:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoXOrAccess().getEvoXOrOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoXOrAccess().getXorKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2360:4: ( (lv_operand2_3_0= ruleEvoOr ) )
            	    // InternalEvoMappingRepairDsl.g:2361:5: (lv_operand2_3_0= ruleEvoOr )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2361:5: (lv_operand2_3_0= ruleEvoOr )
            	    // InternalEvoMappingRepairDsl.g:2362:6: lv_operand2_3_0= ruleEvoOr
            	    {

            	    						newCompositeNode(grammarAccess.getEvoXOrAccess().getOperand2EvoOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop27;
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
    // InternalEvoMappingRepairDsl.g:2384:1: entryRuleEvoOr returns [EObject current=null] : iv_ruleEvoOr= ruleEvoOr EOF ;
    public final EObject entryRuleEvoOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoOr = null;


        try {
            // InternalEvoMappingRepairDsl.g:2384:46: (iv_ruleEvoOr= ruleEvoOr EOF )
            // InternalEvoMappingRepairDsl.g:2385:2: iv_ruleEvoOr= ruleEvoOr EOF
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
    // InternalEvoMappingRepairDsl.g:2391:1: ruleEvoOr returns [EObject current=null] : (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) ;
    public final EObject ruleEvoOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoAnd_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2397:2: ( (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2398:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2398:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            // InternalEvoMappingRepairDsl.g:2399:3: this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoOrAccess().getEvoAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_EvoAnd_0=ruleEvoAnd();

            state._fsp--;


            			current = this_EvoAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2407:3: ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==17) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2408:4: () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2408:4: ()
            	    // InternalEvoMappingRepairDsl.g:2409:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoOrAccess().getEvoOrOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2419:4: ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    // InternalEvoMappingRepairDsl.g:2420:5: (lv_operand2_3_0= ruleEvoAnd )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2420:5: (lv_operand2_3_0= ruleEvoAnd )
            	    // InternalEvoMappingRepairDsl.g:2421:6: lv_operand2_3_0= ruleEvoAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoOrAccess().getOperand2EvoAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
    // $ANTLR end "ruleEvoOr"


    // $ANTLR start "entryRuleEvoAnd"
    // InternalEvoMappingRepairDsl.g:2443:1: entryRuleEvoAnd returns [EObject current=null] : iv_ruleEvoAnd= ruleEvoAnd EOF ;
    public final EObject entryRuleEvoAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAnd = null;


        try {
            // InternalEvoMappingRepairDsl.g:2443:47: (iv_ruleEvoAnd= ruleEvoAnd EOF )
            // InternalEvoMappingRepairDsl.g:2444:2: iv_ruleEvoAnd= ruleEvoAnd EOF
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
    // InternalEvoMappingRepairDsl.g:2450:1: ruleEvoAnd returns [EObject current=null] : (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) ;
    public final EObject ruleEvoAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoEqual_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2456:2: ( (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2457:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2457:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            // InternalEvoMappingRepairDsl.g:2458:3: this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoAndAccess().getEvoEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_EvoEqual_0=ruleEvoEqual();

            state._fsp--;


            			current = this_EvoEqual_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2466:3: ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2467:4: () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2467:4: ()
            	    // InternalEvoMappingRepairDsl.g:2468:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoAndAccess().getEvoAndOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2478:4: ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    // InternalEvoMappingRepairDsl.g:2479:5: (lv_operand2_3_0= ruleEvoEqual )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2479:5: (lv_operand2_3_0= ruleEvoEqual )
            	    // InternalEvoMappingRepairDsl.g:2480:6: lv_operand2_3_0= ruleEvoEqual
            	    {

            	    						newCompositeNode(grammarAccess.getEvoAndAccess().getOperand2EvoEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
    // $ANTLR end "ruleEvoAnd"


    // $ANTLR start "entryRuleEvoEqual"
    // InternalEvoMappingRepairDsl.g:2502:1: entryRuleEvoEqual returns [EObject current=null] : iv_ruleEvoEqual= ruleEvoEqual EOF ;
    public final EObject entryRuleEvoEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoEqual = null;


        try {
            // InternalEvoMappingRepairDsl.g:2502:49: (iv_ruleEvoEqual= ruleEvoEqual EOF )
            // InternalEvoMappingRepairDsl.g:2503:2: iv_ruleEvoEqual= ruleEvoEqual EOF
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
    // InternalEvoMappingRepairDsl.g:2509:1: ruleEvoEqual returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) ;
    public final EObject ruleEvoEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoUnequal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2515:2: ( (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2516:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2516:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            // InternalEvoMappingRepairDsl.g:2517:3: this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoEqualAccess().getEvoUnequalParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_EvoUnequal_0=ruleEvoUnequal();

            state._fsp--;


            			current = this_EvoUnequal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2525:3: ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2526:4: () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2526:4: ()
            	    // InternalEvoMappingRepairDsl.g:2527:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoEqualAccess().getEvoEqualOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_39); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoEqualAccess().getEqualsSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2537:4: ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    // InternalEvoMappingRepairDsl.g:2538:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2538:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    // InternalEvoMappingRepairDsl.g:2539:6: lv_operand2_3_0= ruleEvoUnequalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoEqualAccess().getOperand2EvoUnequalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleEvoEqual"


    // $ANTLR start "entryRuleEvoUnequalSize"
    // InternalEvoMappingRepairDsl.g:2561:1: entryRuleEvoUnequalSize returns [EObject current=null] : iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF ;
    public final EObject entryRuleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequalSize = null;


        try {
            // InternalEvoMappingRepairDsl.g:2561:55: (iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF )
            // InternalEvoMappingRepairDsl.g:2562:2: iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF
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
    // InternalEvoMappingRepairDsl.g:2568:1: ruleEvoUnequalSize returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoUnequal_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2574:2: ( (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoMappingRepairDsl.g:2575:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoMappingRepairDsl.g:2575:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==13||(LA31_0>=55 && LA31_0<=56)||LA31_0==59||(LA31_0>=61 && LA31_0<=67)||(LA31_0>=69 && LA31_0<=71)) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_INT) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:2576:3: this_EvoUnequal_0= ruleEvoUnequal
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
                    // InternalEvoMappingRepairDsl.g:2585:3: this_EvoSize_1= ruleEvoSize
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
    // InternalEvoMappingRepairDsl.g:2597:1: entryRuleEvoUnequal returns [EObject current=null] : iv_ruleEvoUnequal= ruleEvoUnequal EOF ;
    public final EObject entryRuleEvoUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequal = null;


        try {
            // InternalEvoMappingRepairDsl.g:2597:51: (iv_ruleEvoUnequal= ruleEvoUnequal EOF )
            // InternalEvoMappingRepairDsl.g:2598:2: iv_ruleEvoUnequal= ruleEvoUnequal EOF
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
    // InternalEvoMappingRepairDsl.g:2604:1: ruleEvoUnequal returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) ;
    public final EObject ruleEvoUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoImplication_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2610:2: ( (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2611:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2611:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            // InternalEvoMappingRepairDsl.g:2612:3: this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoUnequalAccess().getEvoImplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_EvoImplication_0=ruleEvoImplication();

            state._fsp--;


            			current = this_EvoImplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2620:3: ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2621:4: () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2621:4: ()
            	    // InternalEvoMappingRepairDsl.g:2622:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoUnequalAccess().getEvoUnequalOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_39); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2632:4: ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    // InternalEvoMappingRepairDsl.g:2633:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2633:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    // InternalEvoMappingRepairDsl.g:2634:6: lv_operand2_3_0= ruleEvoImplicationSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoUnequalAccess().getOperand2EvoImplicationSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleEvoUnequal"


    // $ANTLR start "entryRuleEvoImplicationSize"
    // InternalEvoMappingRepairDsl.g:2656:1: entryRuleEvoImplicationSize returns [EObject current=null] : iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF ;
    public final EObject entryRuleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplicationSize = null;


        try {
            // InternalEvoMappingRepairDsl.g:2656:59: (iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF )
            // InternalEvoMappingRepairDsl.g:2657:2: iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF
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
    // InternalEvoMappingRepairDsl.g:2663:1: ruleEvoImplicationSize returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoImplication_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2669:2: ( (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoMappingRepairDsl.g:2670:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoMappingRepairDsl.g:2670:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==13||(LA33_0>=55 && LA33_0<=56)||LA33_0==59||(LA33_0>=61 && LA33_0<=67)||(LA33_0>=69 && LA33_0<=71)) ) {
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
                    // InternalEvoMappingRepairDsl.g:2671:3: this_EvoImplication_0= ruleEvoImplication
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
                    // InternalEvoMappingRepairDsl.g:2680:3: this_EvoSize_1= ruleEvoSize
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
    // InternalEvoMappingRepairDsl.g:2692:1: entryRuleEvoImplication returns [EObject current=null] : iv_ruleEvoImplication= ruleEvoImplication EOF ;
    public final EObject entryRuleEvoImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplication = null;


        try {
            // InternalEvoMappingRepairDsl.g:2692:55: (iv_ruleEvoImplication= ruleEvoImplication EOF )
            // InternalEvoMappingRepairDsl.g:2693:2: iv_ruleEvoImplication= ruleEvoImplication EOF
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
    // InternalEvoMappingRepairDsl.g:2699:1: ruleEvoImplication returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) ;
    public final EObject ruleEvoImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoBiconditional_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2705:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2706:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2706:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            // InternalEvoMappingRepairDsl.g:2707:3: this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoImplicationAccess().getEvoBiconditionalParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_EvoBiconditional_0=ruleEvoBiconditional();

            state._fsp--;


            			current = this_EvoBiconditional_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2715:3: ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2716:4: () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2716:4: ()
            	    // InternalEvoMappingRepairDsl.g:2717:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoImplicationAccess().getEvoImplicationOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_39); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoImplicationAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2727:4: ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    // InternalEvoMappingRepairDsl.g:2728:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2728:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    // InternalEvoMappingRepairDsl.g:2729:6: lv_operand2_3_0= ruleEvoBiconditionalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoImplicationAccess().getOperand2EvoBiconditionalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleEvoImplication"


    // $ANTLR start "entryRuleEvoBiconditionalSize"
    // InternalEvoMappingRepairDsl.g:2751:1: entryRuleEvoBiconditionalSize returns [EObject current=null] : iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF ;
    public final EObject entryRuleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditionalSize = null;


        try {
            // InternalEvoMappingRepairDsl.g:2751:61: (iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF )
            // InternalEvoMappingRepairDsl.g:2752:2: iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF
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
    // InternalEvoMappingRepairDsl.g:2758:1: ruleEvoBiconditionalSize returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoBiconditional_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2764:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoMappingRepairDsl.g:2765:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoMappingRepairDsl.g:2765:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==13||(LA35_0>=55 && LA35_0<=56)||LA35_0==59||(LA35_0>=61 && LA35_0<=67)||(LA35_0>=69 && LA35_0<=71)) ) {
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
                    // InternalEvoMappingRepairDsl.g:2766:3: this_EvoBiconditional_0= ruleEvoBiconditional
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
                    // InternalEvoMappingRepairDsl.g:2775:3: this_EvoSize_1= ruleEvoSize
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
    // InternalEvoMappingRepairDsl.g:2787:1: entryRuleEvoBiconditional returns [EObject current=null] : iv_ruleEvoBiconditional= ruleEvoBiconditional EOF ;
    public final EObject entryRuleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditional = null;


        try {
            // InternalEvoMappingRepairDsl.g:2787:57: (iv_ruleEvoBiconditional= ruleEvoBiconditional EOF )
            // InternalEvoMappingRepairDsl.g:2788:2: iv_ruleEvoBiconditional= ruleEvoBiconditional EOF
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
    // InternalEvoMappingRepairDsl.g:2794:1: ruleEvoBiconditional returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) ;
    public final EObject ruleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetInclusion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2800:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2801:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2801:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            // InternalEvoMappingRepairDsl.g:2802:3: this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getEvoSetInclusionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_EvoSetInclusion_0=ruleEvoSetInclusion();

            state._fsp--;


            			current = this_EvoSetInclusion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2810:3: ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==48) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2811:4: () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2811:4: ()
            	    // InternalEvoMappingRepairDsl.g:2812:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoBiconditionalAccess().getEvoBiconditionalOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_39); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoBiconditionalAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2822:4: ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    // InternalEvoMappingRepairDsl.g:2823:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2823:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    // InternalEvoMappingRepairDsl.g:2824:6: lv_operand2_3_0= ruleEvoSetInclusionSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getOperand2EvoSetInclusionSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleEvoBiconditional"


    // $ANTLR start "entryRuleEvoSetInclusionSize"
    // InternalEvoMappingRepairDsl.g:2846:1: entryRuleEvoSetInclusionSize returns [EObject current=null] : iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF ;
    public final EObject entryRuleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusionSize = null;


        try {
            // InternalEvoMappingRepairDsl.g:2846:60: (iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF )
            // InternalEvoMappingRepairDsl.g:2847:2: iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF
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
    // InternalEvoMappingRepairDsl.g:2853:1: ruleEvoSetInclusionSize returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoSetInclusion_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2859:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoMappingRepairDsl.g:2860:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoMappingRepairDsl.g:2860:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==13||(LA37_0>=55 && LA37_0<=56)||LA37_0==59||(LA37_0>=61 && LA37_0<=67)||(LA37_0>=69 && LA37_0<=71)) ) {
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
                    // InternalEvoMappingRepairDsl.g:2861:3: this_EvoSetInclusion_0= ruleEvoSetInclusion
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
                    // InternalEvoMappingRepairDsl.g:2870:3: this_EvoSize_1= ruleEvoSize
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
    // InternalEvoMappingRepairDsl.g:2882:1: entryRuleEvoSetInclusion returns [EObject current=null] : iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF ;
    public final EObject entryRuleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusion = null;


        try {
            // InternalEvoMappingRepairDsl.g:2882:56: (iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF )
            // InternalEvoMappingRepairDsl.g:2883:2: iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF
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
    // InternalEvoMappingRepairDsl.g:2889:1: ruleEvoSetInclusion returns [EObject current=null] : (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) ;
    public final EObject ruleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetIntersection_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2895:2: ( (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2896:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2896:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            // InternalEvoMappingRepairDsl.g:2897:3: this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getEvoSetIntersectionParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_EvoSetIntersection_0=ruleEvoSetIntersection();

            state._fsp--;


            			current = this_EvoSetIntersection_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2905:3: ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==49) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2906:4: () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2906:4: ()
            	    // InternalEvoMappingRepairDsl.g:2907:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetInclusionAccess().getEvoSetInclusionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetInclusionAccess().getInclusionKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2917:4: ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    // InternalEvoMappingRepairDsl.g:2918:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2918:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    // InternalEvoMappingRepairDsl.g:2919:6: lv_operand2_3_0= ruleEvoSetIntersection
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getOperand2EvoSetIntersectionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleEvoSetInclusion"


    // $ANTLR start "entryRuleEvoSetIntersection"
    // InternalEvoMappingRepairDsl.g:2941:1: entryRuleEvoSetIntersection returns [EObject current=null] : iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF ;
    public final EObject entryRuleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetIntersection = null;


        try {
            // InternalEvoMappingRepairDsl.g:2941:59: (iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF )
            // InternalEvoMappingRepairDsl.g:2942:2: iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF
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
    // InternalEvoMappingRepairDsl.g:2948:1: ruleEvoSetIntersection returns [EObject current=null] : (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) ;
    public final EObject ruleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetUnion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:2954:2: ( (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:2955:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:2955:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            // InternalEvoMappingRepairDsl.g:2956:3: this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getEvoSetUnionParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_EvoSetUnion_0=ruleEvoSetUnion();

            state._fsp--;


            			current = this_EvoSetUnion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:2964:3: ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==50) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:2965:4: () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2965:4: ()
            	    // InternalEvoMappingRepairDsl.g:2966:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetIntersectionAccess().getEvoSetIntersectionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetIntersectionAccess().getIntersectionKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:2976:4: ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    // InternalEvoMappingRepairDsl.g:2977:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    {
            	    // InternalEvoMappingRepairDsl.g:2977:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    // InternalEvoMappingRepairDsl.g:2978:6: lv_operand2_3_0= ruleEvoSetUnion
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getOperand2EvoSetUnionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
            	    break loop39;
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
    // InternalEvoMappingRepairDsl.g:3000:1: entryRuleEvoSetUnion returns [EObject current=null] : iv_ruleEvoSetUnion= ruleEvoSetUnion EOF ;
    public final EObject entryRuleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetUnion = null;


        try {
            // InternalEvoMappingRepairDsl.g:3000:52: (iv_ruleEvoSetUnion= ruleEvoSetUnion EOF )
            // InternalEvoMappingRepairDsl.g:3001:2: iv_ruleEvoSetUnion= ruleEvoSetUnion EOF
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
    // InternalEvoMappingRepairDsl.g:3007:1: ruleEvoSetUnion returns [EObject current=null] : (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) ;
    public final EObject ruleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3013:2: ( (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:3014:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:3014:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            // InternalEvoMappingRepairDsl.g:3015:3: this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetUnionAccess().getEvoSetDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_EvoSetDifference_0=ruleEvoSetDifference();

            state._fsp--;


            			current = this_EvoSetDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:3023:3: ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==51) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:3024:4: () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3024:4: ()
            	    // InternalEvoMappingRepairDsl.g:3025:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetUnionAccess().getEvoSetUnionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetUnionAccess().getUnionKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:3035:4: ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    // InternalEvoMappingRepairDsl.g:3036:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3036:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    // InternalEvoMappingRepairDsl.g:3037:6: lv_operand2_3_0= ruleEvoSetDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetUnionAccess().getOperand2EvoSetDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "ruleEvoSetUnion"


    // $ANTLR start "entryRuleEvoSetDifference"
    // InternalEvoMappingRepairDsl.g:3059:1: entryRuleEvoSetDifference returns [EObject current=null] : iv_ruleEvoSetDifference= ruleEvoSetDifference EOF ;
    public final EObject entryRuleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetDifference = null;


        try {
            // InternalEvoMappingRepairDsl.g:3059:57: (iv_ruleEvoSetDifference= ruleEvoSetDifference EOF )
            // InternalEvoMappingRepairDsl.g:3060:2: iv_ruleEvoSetDifference= ruleEvoSetDifference EOF
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
    // InternalEvoMappingRepairDsl.g:3066:1: ruleEvoSetDifference returns [EObject current=null] : (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) ;
    public final EObject ruleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetSymmetricDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3072:2: ( (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:3073:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:3073:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            // InternalEvoMappingRepairDsl.g:3074:3: this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getEvoSetSymmetricDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_EvoSetSymmetricDifference_0=ruleEvoSetSymmetricDifference();

            state._fsp--;


            			current = this_EvoSetSymmetricDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:3082:3: ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==52) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:3083:4: () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3083:4: ()
            	    // InternalEvoMappingRepairDsl.g:3084:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetDifferenceAccess().getEvoSetDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetDifferenceAccess().getDifferenceKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:3094:4: ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    // InternalEvoMappingRepairDsl.g:3095:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3095:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    // InternalEvoMappingRepairDsl.g:3096:6: lv_operand2_3_0= ruleEvoSetSymmetricDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getOperand2EvoSetSymmetricDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
    // $ANTLR end "ruleEvoSetDifference"


    // $ANTLR start "entryRuleEvoSetSymmetricDifference"
    // InternalEvoMappingRepairDsl.g:3118:1: entryRuleEvoSetSymmetricDifference returns [EObject current=null] : iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF ;
    public final EObject entryRuleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetSymmetricDifference = null;


        try {
            // InternalEvoMappingRepairDsl.g:3118:66: (iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF )
            // InternalEvoMappingRepairDsl.g:3119:2: iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF
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
    // InternalEvoMappingRepairDsl.g:3125:1: ruleEvoSetSymmetricDifference returns [EObject current=null] : (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) ;
    public final EObject ruleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetCartesianProduct_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3131:2: ( (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:3132:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:3132:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            // InternalEvoMappingRepairDsl.g:3133:3: this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetCartesianProductParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_EvoSetCartesianProduct_0=ruleEvoSetCartesianProduct();

            state._fsp--;


            			current = this_EvoSetCartesianProduct_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:3141:3: ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==53) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:3142:4: () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3142:4: ()
            	    // InternalEvoMappingRepairDsl.g:3143:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetSymmetricDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetSymmetricDifferenceAccess().getSymmetric_differenceKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:3153:4: ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    // InternalEvoMappingRepairDsl.g:3154:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3154:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    // InternalEvoMappingRepairDsl.g:3155:6: lv_operand2_3_0= ruleEvoSetCartesianProduct
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2EvoSetCartesianProductParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
    // $ANTLR end "ruleEvoSetSymmetricDifference"


    // $ANTLR start "entryRuleEvoSetCartesianProduct"
    // InternalEvoMappingRepairDsl.g:3177:1: entryRuleEvoSetCartesianProduct returns [EObject current=null] : iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF ;
    public final EObject entryRuleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetCartesianProduct = null;


        try {
            // InternalEvoMappingRepairDsl.g:3177:63: (iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF )
            // InternalEvoMappingRepairDsl.g:3178:2: iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF
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
    // InternalEvoMappingRepairDsl.g:3184:1: ruleEvoSetCartesianProduct returns [EObject current=null] : (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) ;
    public final EObject ruleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoElementOf_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3190:2: ( (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:3191:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:3191:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            // InternalEvoMappingRepairDsl.g:3192:3: this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getEvoElementOfParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_EvoElementOf_0=ruleEvoElementOf();

            state._fsp--;


            			current = this_EvoElementOf_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:3200:3: ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==54) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:3201:4: () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3201:4: ()
            	    // InternalEvoMappingRepairDsl.g:3202:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetCartesianProductAccess().getEvoSetCartesianProductOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetCartesianProductAccess().getXKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:3212:4: ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    // InternalEvoMappingRepairDsl.g:3213:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3213:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    // InternalEvoMappingRepairDsl.g:3214:6: lv_operand2_3_0= ruleEvoElementOf
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getOperand2EvoElementOfParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_47);
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
    // $ANTLR end "ruleEvoSetCartesianProduct"


    // $ANTLR start "entryRuleEvoSetCardinality"
    // InternalEvoMappingRepairDsl.g:3236:1: entryRuleEvoSetCardinality returns [EObject current=null] : iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF ;
    public final EObject entryRuleEvoSetCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetCardinality = null;


        try {
            // InternalEvoMappingRepairDsl.g:3236:58: (iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF )
            // InternalEvoMappingRepairDsl.g:3237:2: iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF
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
    // InternalEvoMappingRepairDsl.g:3243:1: ruleEvoSetCardinality returns [EObject current=null] : ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) ) ;
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
            // InternalEvoMappingRepairDsl.g:3249:2: ( ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) ) )
            // InternalEvoMappingRepairDsl.g:3250:2: ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) )
            {
            // InternalEvoMappingRepairDsl.g:3250:2: ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) )
            // InternalEvoMappingRepairDsl.g:3251:3: () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            {
            // InternalEvoMappingRepairDsl.g:3251:3: ()
            // InternalEvoMappingRepairDsl.g:3252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSetCardinalityAccess().getEvoSetCardinalityAction_0(),
            					current);
            			

            }

            // InternalEvoMappingRepairDsl.g:3258:3: ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            else if ( (LA44_0==56) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:3259:4: (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' )
                    {
                    // InternalEvoMappingRepairDsl.g:3259:4: (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' )
                    // InternalEvoMappingRepairDsl.g:3260:5: otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|'
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_38); 

                    					newLeafNode(otherlv_1, grammarAccess.getEvoSetCardinalityAccess().getVerticalLineKeyword_1_0_0());
                    				
                    // InternalEvoMappingRepairDsl.g:3264:5: ( (lv_operand_2_0= ruleEvoExpression ) )
                    // InternalEvoMappingRepairDsl.g:3265:6: (lv_operand_2_0= ruleEvoExpression )
                    {
                    // InternalEvoMappingRepairDsl.g:3265:6: (lv_operand_2_0= ruleEvoExpression )
                    // InternalEvoMappingRepairDsl.g:3266:7: lv_operand_2_0= ruleEvoExpression
                    {

                    							newCompositeNode(grammarAccess.getEvoSetCardinalityAccess().getOperandEvoExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_48);
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

                    otherlv_3=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getEvoSetCardinalityAccess().getVerticalLineKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoMappingRepairDsl.g:3289:4: (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
                    {
                    // InternalEvoMappingRepairDsl.g:3289:4: (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
                    // InternalEvoMappingRepairDsl.g:3290:5: otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getEvoSetCardinalityAccess().getSizeKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,13,FOLLOW_38); 

                    					newLeafNode(otherlv_5, grammarAccess.getEvoSetCardinalityAccess().getLeftParenthesisKeyword_1_1_1());
                    				
                    // InternalEvoMappingRepairDsl.g:3298:5: ( (lv_operand_6_0= ruleEvoExpression ) )
                    // InternalEvoMappingRepairDsl.g:3299:6: (lv_operand_6_0= ruleEvoExpression )
                    {
                    // InternalEvoMappingRepairDsl.g:3299:6: (lv_operand_6_0= ruleEvoExpression )
                    // InternalEvoMappingRepairDsl.g:3300:7: lv_operand_6_0= ruleEvoExpression
                    {

                    							newCompositeNode(grammarAccess.getEvoSetCardinalityAccess().getOperandEvoExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_5);
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

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:3327:1: entryRuleEvoElementOf returns [EObject current=null] : iv_ruleEvoElementOf= ruleEvoElementOf EOF ;
    public final EObject entryRuleEvoElementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoElementOf = null;


        try {
            // InternalEvoMappingRepairDsl.g:3327:53: (iv_ruleEvoElementOf= ruleEvoElementOf EOF )
            // InternalEvoMappingRepairDsl.g:3328:2: iv_ruleEvoElementOf= ruleEvoElementOf EOF
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
    // InternalEvoMappingRepairDsl.g:3334:1: ruleEvoElementOf returns [EObject current=null] : (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* ) ;
    public final EObject ruleEvoElementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoTerminal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3340:2: ( (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* ) )
            // InternalEvoMappingRepairDsl.g:3341:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* )
            {
            // InternalEvoMappingRepairDsl.g:3341:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* )
            // InternalEvoMappingRepairDsl.g:3342:3: this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoElementOfAccess().getEvoTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_EvoTerminal_0=ruleEvoTerminal();

            state._fsp--;


            			current = this_EvoTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoMappingRepairDsl.g:3350:3: ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==57) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:3351:4: () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3351:4: ()
            	    // InternalEvoMappingRepairDsl.g:3352:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoElementOfAccess().getEvoSetElementOfOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoElementOfAccess().getElementOfKeyword_1_1());
            	    			
            	    // InternalEvoMappingRepairDsl.g:3362:4: ( (lv_operand2_3_0= ruleEvoTerminal ) )
            	    // InternalEvoMappingRepairDsl.g:3363:5: (lv_operand2_3_0= ruleEvoTerminal )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3363:5: (lv_operand2_3_0= ruleEvoTerminal )
            	    // InternalEvoMappingRepairDsl.g:3364:6: lv_operand2_3_0= ruleEvoTerminal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoTerminalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_operand2_3_0=ruleEvoTerminal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoTerminal");
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
    // $ANTLR end "ruleEvoElementOf"


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalEvoMappingRepairDsl.g:3386:1: entryRuleEvoFeatureVariable returns [EObject current=null] : iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF ;
    public final EObject entryRuleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureVariable = null;


        try {
            // InternalEvoMappingRepairDsl.g:3386:59: (iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF )
            // InternalEvoMappingRepairDsl.g:3387:2: iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoFeatureVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoFeatureVariable=ruleEvoFeatureVariable();

            state._fsp--;

             current =iv_ruleEvoFeatureVariable; 
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
    // $ANTLR end "entryRuleEvoFeatureVariable"


    // $ANTLR start "ruleEvoFeatureVariable"
    // InternalEvoMappingRepairDsl.g:3393:1: ruleEvoFeatureVariable returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3399:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEvoMappingRepairDsl.g:3400:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEvoMappingRepairDsl.g:3400:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEvoMappingRepairDsl.g:3401:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:3405:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoMappingRepairDsl.g:3406:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoMappingRepairDsl.g:3406:4: (lv_name_1_0= RULE_ID )
            // InternalEvoMappingRepairDsl.g:3407:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoFeatureVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleEvoFeatureVariable"


    // $ANTLR start "entryRuleEvoForAll"
    // InternalEvoMappingRepairDsl.g:3427:1: entryRuleEvoForAll returns [EObject current=null] : iv_ruleEvoForAll= ruleEvoForAll EOF ;
    public final EObject entryRuleEvoForAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoForAll = null;


        try {
            // InternalEvoMappingRepairDsl.g:3427:50: (iv_ruleEvoForAll= ruleEvoForAll EOF )
            // InternalEvoMappingRepairDsl.g:3428:2: iv_ruleEvoForAll= ruleEvoForAll EOF
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
    // InternalEvoMappingRepairDsl.g:3434:1: ruleEvoForAll returns [EObject current=null] : (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) ) ) otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ;
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
            // InternalEvoMappingRepairDsl.g:3440:2: ( (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) ) ) otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            // InternalEvoMappingRepairDsl.g:3441:2: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) ) ) otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
            {
            // InternalEvoMappingRepairDsl.g:3441:2: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) ) ) otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
            // InternalEvoMappingRepairDsl.g:3442:3: otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) ) ) otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoForAllAccess().getForAllKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoForAllAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:3450:3: ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) )
            // InternalEvoMappingRepairDsl.g:3451:4: (lv_boundedVariables_2_0= ruleEvoFeatureVariable )
            {
            // InternalEvoMappingRepairDsl.g:3451:4: (lv_boundedVariables_2_0= ruleEvoFeatureVariable )
            // InternalEvoMappingRepairDsl.g:3452:5: lv_boundedVariables_2_0= ruleEvoFeatureVariable
            {

            					newCompositeNode(grammarAccess.getEvoForAllAccess().getBoundedVariablesEvoFeatureVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_boundedVariables_2_0=ruleEvoFeatureVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            					}
            					add(
            						current,
            						"boundedVariables",
            						lv_boundedVariables_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoFeatureVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoMappingRepairDsl.g:3469:3: (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) ) )
            // InternalEvoMappingRepairDsl.g:3470:4: otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) )
            {
            otherlv_3=(Token)match(input,25,FOLLOW_50); 

            				newLeafNode(otherlv_3, grammarAccess.getEvoForAllAccess().getCommaKeyword_3_0());
            			
            // InternalEvoMappingRepairDsl.g:3474:4: ( (lv_boundedVariables_4_0= ruleEvoFeatureVariable ) )
            // InternalEvoMappingRepairDsl.g:3475:5: (lv_boundedVariables_4_0= ruleEvoFeatureVariable )
            {
            // InternalEvoMappingRepairDsl.g:3475:5: (lv_boundedVariables_4_0= ruleEvoFeatureVariable )
            // InternalEvoMappingRepairDsl.g:3476:6: lv_boundedVariables_4_0= ruleEvoFeatureVariable
            {

            						newCompositeNode(grammarAccess.getEvoForAllAccess().getBoundedVariablesEvoFeatureVariableParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_51);
            lv_boundedVariables_4_0=ruleEvoFeatureVariable();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            						}
            						add(
            							current,
            							"boundedVariables",
            							lv_boundedVariables_4_0,
            							"de.evorepair.logic.EvoLogicDsl.EvoFeatureVariable");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,60,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoForAllAccess().getColonKeyword_4());
            		
            // InternalEvoMappingRepairDsl.g:3498:3: ( (lv_operand_6_0= ruleEvoExpression ) )
            // InternalEvoMappingRepairDsl.g:3499:4: (lv_operand_6_0= ruleEvoExpression )
            {
            // InternalEvoMappingRepairDsl.g:3499:4: (lv_operand_6_0= ruleEvoExpression )
            // InternalEvoMappingRepairDsl.g:3500:5: lv_operand_6_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoForAllAccess().getOperandEvoExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:3525:1: entryRuleEvoExists returns [EObject current=null] : iv_ruleEvoExists= ruleEvoExists EOF ;
    public final EObject entryRuleEvoExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoExists = null;


        try {
            // InternalEvoMappingRepairDsl.g:3525:50: (iv_ruleEvoExists= ruleEvoExists EOF )
            // InternalEvoMappingRepairDsl.g:3526:2: iv_ruleEvoExists= ruleEvoExists EOF
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
    // InternalEvoMappingRepairDsl.g:3532:1: ruleEvoExists returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) otherlv_3= ':' ( (lv_element_4_0= ruleEvoExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleEvoExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_boundedVariables_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3538:2: ( (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) otherlv_3= ':' ( (lv_element_4_0= ruleEvoExpression ) ) otherlv_5= ')' ) )
            // InternalEvoMappingRepairDsl.g:3539:2: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) otherlv_3= ':' ( (lv_element_4_0= ruleEvoExpression ) ) otherlv_5= ')' )
            {
            // InternalEvoMappingRepairDsl.g:3539:2: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) otherlv_3= ':' ( (lv_element_4_0= ruleEvoExpression ) ) otherlv_5= ')' )
            // InternalEvoMappingRepairDsl.g:3540:3: otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) ) otherlv_3= ':' ( (lv_element_4_0= ruleEvoExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoExistsAccess().getExistsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoExistsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:3548:3: ( (lv_boundedVariables_2_0= ruleEvoFeatureVariable ) )
            // InternalEvoMappingRepairDsl.g:3549:4: (lv_boundedVariables_2_0= ruleEvoFeatureVariable )
            {
            // InternalEvoMappingRepairDsl.g:3549:4: (lv_boundedVariables_2_0= ruleEvoFeatureVariable )
            // InternalEvoMappingRepairDsl.g:3550:5: lv_boundedVariables_2_0= ruleEvoFeatureVariable
            {

            					newCompositeNode(grammarAccess.getEvoExistsAccess().getBoundedVariablesEvoFeatureVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
            lv_boundedVariables_2_0=ruleEvoFeatureVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoExistsRule());
            					}
            					add(
            						current,
            						"boundedVariables",
            						lv_boundedVariables_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoFeatureVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,60,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoExistsAccess().getColonKeyword_3());
            		
            // InternalEvoMappingRepairDsl.g:3571:3: ( (lv_element_4_0= ruleEvoExpression ) )
            // InternalEvoMappingRepairDsl.g:3572:4: (lv_element_4_0= ruleEvoExpression )
            {
            // InternalEvoMappingRepairDsl.g:3572:4: (lv_element_4_0= ruleEvoExpression )
            // InternalEvoMappingRepairDsl.g:3573:5: lv_element_4_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoExistsAccess().getElementEvoExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_element_4_0=ruleEvoExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoExistsRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_4_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:3598:1: entryRuleEvoNot returns [EObject current=null] : iv_ruleEvoNot= ruleEvoNot EOF ;
    public final EObject entryRuleEvoNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoNot = null;


        try {
            // InternalEvoMappingRepairDsl.g:3598:47: (iv_ruleEvoNot= ruleEvoNot EOF )
            // InternalEvoMappingRepairDsl.g:3599:2: iv_ruleEvoNot= ruleEvoNot EOF
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
    // InternalEvoMappingRepairDsl.g:3605:1: ruleEvoNot returns [EObject current=null] : (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3611:2: ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) )
            // InternalEvoMappingRepairDsl.g:3612:2: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
            {
            // InternalEvoMappingRepairDsl.g:3612:2: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
            // InternalEvoMappingRepairDsl.g:3613:3: otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoNotAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:3621:3: ( (lv_operand_2_0= ruleEvoExpression ) )
            // InternalEvoMappingRepairDsl.g:3622:4: (lv_operand_2_0= ruleEvoExpression )
            {
            // InternalEvoMappingRepairDsl.g:3622:4: (lv_operand_2_0= ruleEvoExpression )
            // InternalEvoMappingRepairDsl.g:3623:5: lv_operand_2_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoNotAccess().getOperandEvoExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoNotAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalEvoMappingRepairDsl.g:3648:1: entryRuleEvoSatisfiable returns [EObject current=null] : iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF ;
    public final EObject entryRuleEvoSatisfiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSatisfiable = null;


        try {
            // InternalEvoMappingRepairDsl.g:3648:55: (iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF )
            // InternalEvoMappingRepairDsl.g:3649:2: iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF
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
    // InternalEvoMappingRepairDsl.g:3655:1: ruleEvoSatisfiable returns [EObject current=null] : ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' ) ;
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
            // InternalEvoMappingRepairDsl.g:3661:2: ( ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' ) )
            // InternalEvoMappingRepairDsl.g:3662:2: ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' )
            {
            // InternalEvoMappingRepairDsl.g:3662:2: ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' )
            // InternalEvoMappingRepairDsl.g:3663:3: () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')'
            {
            // InternalEvoMappingRepairDsl.g:3663:3: ()
            // InternalEvoMappingRepairDsl.g:3664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSatisfiableAccess().getEvoSatisfiableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoSatisfiableAccess().getSatisfiableKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoSatisfiableAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEvoMappingRepairDsl.g:3678:3: ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) )
            // InternalEvoMappingRepairDsl.g:3679:4: ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) )
            {
            // InternalEvoMappingRepairDsl.g:3679:4: ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) )
            // InternalEvoMappingRepairDsl.g:3680:5: (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm )
            {
            // InternalEvoMappingRepairDsl.g:3680:5: (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==62||LA46_0==67) ) {
                alt46=1;
            }
            else if ( (LA46_0==64) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:3681:6: lv_variables_3_1= ruleEvoSetVariable
                    {

                    						newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoSetVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
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
                    // InternalEvoMappingRepairDsl.g:3697:6: lv_variables_3_2= ruleEvoApplicationConstraintTerm
                    {

                    						newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoApplicationConstraintTermParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_15);
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

            // InternalEvoMappingRepairDsl.g:3715:3: (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==25) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:3716:4: otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_52); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEvoSatisfiableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalEvoMappingRepairDsl.g:3720:4: ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) )
            	    // InternalEvoMappingRepairDsl.g:3721:5: ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3721:5: ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) )
            	    // InternalEvoMappingRepairDsl.g:3722:6: (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm )
            	    {
            	    // InternalEvoMappingRepairDsl.g:3722:6: (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==RULE_ID||LA47_0==62||LA47_0==67) ) {
            	        alt47=1;
            	    }
            	    else if ( (LA47_0==64) ) {
            	        alt47=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalEvoMappingRepairDsl.g:3723:7: lv_variables_5_1= ruleEvoSetVariable
            	            {

            	            							newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoSetVariableParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_15);
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
            	            // InternalEvoMappingRepairDsl.g:3739:7: lv_variables_5_2= ruleEvoApplicationConstraintTerm
            	            {

            	            							newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoApplicationConstraintTermParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_15);
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
            	    break loop48;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:3766:1: entryRuleEvoTerminal returns [EObject current=null] : iv_ruleEvoTerminal= ruleEvoTerminal EOF ;
    public final EObject entryRuleEvoTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoTerminal = null;


        try {
            // InternalEvoMappingRepairDsl.g:3766:52: (iv_ruleEvoTerminal= ruleEvoTerminal EOF )
            // InternalEvoMappingRepairDsl.g:3767:2: iv_ruleEvoTerminal= ruleEvoTerminal EOF
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
    // InternalEvoMappingRepairDsl.g:3773:1: ruleEvoTerminal returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) ) ;
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
            // InternalEvoMappingRepairDsl.g:3779:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) ) )
            // InternalEvoMappingRepairDsl.g:3780:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) )
            {
            // InternalEvoMappingRepairDsl.g:3780:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) )
            int alt49=14;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt49=1;
                }
                break;
            case 67:
                {
                alt49=2;
                }
                break;
            case 64:
                {
                alt49=3;
                }
                break;
            case 59:
                {
                alt49=4;
                }
                break;
            case 61:
                {
                alt49=5;
                }
                break;
            case 62:
                {
                alt49=6;
                }
                break;
            case 65:
                {
                alt49=7;
                }
                break;
            case 66:
                {
                alt49=8;
                }
                break;
            case 55:
            case 56:
                {
                alt49=9;
                }
                break;
            case 71:
                {
                alt49=10;
                }
                break;
            case 69:
                {
                alt49=11;
                }
                break;
            case 70:
                {
                alt49=12;
                }
                break;
            case 63:
                {
                alt49=13;
                }
                break;
            case 13:
                {
                alt49=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:3781:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
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
                    // InternalEvoMappingRepairDsl.g:3790:3: this_EvoSetTerm_1= ruleEvoSetTerm
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
                    // InternalEvoMappingRepairDsl.g:3799:3: this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm
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
                    // InternalEvoMappingRepairDsl.g:3808:3: this_EvoForAll_3= ruleEvoForAll
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
                    // InternalEvoMappingRepairDsl.g:3817:3: this_EvoExists_4= ruleEvoExists
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
                    // InternalEvoMappingRepairDsl.g:3826:3: this_EvoNot_5= ruleEvoNot
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
                    // InternalEvoMappingRepairDsl.g:3835:3: this_EvoFeatureType_6= ruleEvoFeatureType
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
                    // InternalEvoMappingRepairDsl.g:3844:3: this_EvoGroupType_7= ruleEvoGroupType
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
                    // InternalEvoMappingRepairDsl.g:3853:3: this_EvoSetCardinality_8= ruleEvoSetCardinality
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
                    // InternalEvoMappingRepairDsl.g:3862:3: this_EvoChildrenOf_9= ruleEvoChildrenOf
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
                    // InternalEvoMappingRepairDsl.g:3871:3: this_EvoParentOf_10= ruleEvoParentOf
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
                    // InternalEvoMappingRepairDsl.g:3880:3: this_EvoSiblingsOf_11= ruleEvoSiblingsOf
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
                    // InternalEvoMappingRepairDsl.g:3889:3: this_EvoSatisfiable_12= ruleEvoSatisfiable
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
                    // InternalEvoMappingRepairDsl.g:3898:3: (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' )
                    {
                    // InternalEvoMappingRepairDsl.g:3898:3: (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' )
                    // InternalEvoMappingRepairDsl.g:3899:4: otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')'
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_38); 

                    				newLeafNode(otherlv_13, grammarAccess.getEvoTerminalAccess().getLeftParenthesisKeyword_13_0());
                    			

                    				newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoXOrParserRuleCall_13_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_EvoXOr_14=ruleEvoXOr();

                    state._fsp--;


                    				current = this_EvoXOr_14;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_15=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEvoSize"
    // InternalEvoMappingRepairDsl.g:3920:1: entryRuleEvoSize returns [EObject current=null] : iv_ruleEvoSize= ruleEvoSize EOF ;
    public final EObject entryRuleEvoSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSize = null;


        try {
            // InternalEvoMappingRepairDsl.g:3920:48: (iv_ruleEvoSize= ruleEvoSize EOF )
            // InternalEvoMappingRepairDsl.g:3921:2: iv_ruleEvoSize= ruleEvoSize EOF
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
    // InternalEvoMappingRepairDsl.g:3927:1: ruleEvoSize returns [EObject current=null] : ( () ( (lv_size_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEvoSize() throws RecognitionException {
        EObject current = null;

        Token lv_size_1_0=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3933:2: ( ( () ( (lv_size_1_0= RULE_INT ) ) ) )
            // InternalEvoMappingRepairDsl.g:3934:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            {
            // InternalEvoMappingRepairDsl.g:3934:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            // InternalEvoMappingRepairDsl.g:3935:3: () ( (lv_size_1_0= RULE_INT ) )
            {
            // InternalEvoMappingRepairDsl.g:3935:3: ()
            // InternalEvoMappingRepairDsl.g:3936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSizeAccess().getEvoSizeAction_0(),
            					current);
            			

            }

            // InternalEvoMappingRepairDsl.g:3942:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalEvoMappingRepairDsl.g:3943:4: (lv_size_1_0= RULE_INT )
            {
            // InternalEvoMappingRepairDsl.g:3943:4: (lv_size_1_0= RULE_INT )
            // InternalEvoMappingRepairDsl.g:3944:5: lv_size_1_0= RULE_INT
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
    // InternalEvoMappingRepairDsl.g:3964:1: entryRuleEvoVariableTerm returns [EObject current=null] : iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF ;
    public final EObject entryRuleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariableTerm = null;


        try {
            // InternalEvoMappingRepairDsl.g:3964:56: (iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF )
            // InternalEvoMappingRepairDsl.g:3965:2: iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF
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
    // InternalEvoMappingRepairDsl.g:3971:1: ruleEvoVariableTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:3977:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalEvoMappingRepairDsl.g:3978:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalEvoMappingRepairDsl.g:3978:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalEvoMappingRepairDsl.g:3979:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalEvoMappingRepairDsl.g:3979:3: ( ( ruleQualifiedName ) )
            // InternalEvoMappingRepairDsl.g:3980:4: ( ruleQualifiedName )
            {
            // InternalEvoMappingRepairDsl.g:3980:4: ( ruleQualifiedName )
            // InternalEvoMappingRepairDsl.g:3981:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoVariableTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_53);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoMappingRepairDsl.g:3995:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=73 && LA50_0<=75)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:3996:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalEvoMappingRepairDsl.g:3996:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalEvoMappingRepairDsl.g:3997:5: lv_type_1_0= ruleEvoVariableType
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
    // InternalEvoMappingRepairDsl.g:4018:1: entryRuleEvoApplicationConstraintTerm returns [EObject current=null] : iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF ;
    public final EObject entryRuleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoApplicationConstraintTerm = null;


        try {
            // InternalEvoMappingRepairDsl.g:4018:69: (iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF )
            // InternalEvoMappingRepairDsl.g:4019:2: iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF
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
    // InternalEvoMappingRepairDsl.g:4025:1: ruleEvoApplicationConstraintTerm returns [EObject current=null] : (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4031:2: ( (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // InternalEvoMappingRepairDsl.g:4032:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // InternalEvoMappingRepairDsl.g:4032:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // InternalEvoMappingRepairDsl.g:4033:3: otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoApplicationConstraintTermAccess().getACKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoApplicationConstraintTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:4041:3: ( ( ruleQualifiedName ) )
            // InternalEvoMappingRepairDsl.g:4042:4: ( ruleQualifiedName )
            {
            // InternalEvoMappingRepairDsl.g:4042:4: ( ruleQualifiedName )
            // InternalEvoMappingRepairDsl.g:4043:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoApplicationConstraintTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4065:1: entryRuleEvoFeatureType returns [EObject current=null] : iv_ruleEvoFeatureType= ruleEvoFeatureType EOF ;
    public final EObject entryRuleEvoFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureType = null;


        try {
            // InternalEvoMappingRepairDsl.g:4065:55: (iv_ruleEvoFeatureType= ruleEvoFeatureType EOF )
            // InternalEvoMappingRepairDsl.g:4066:2: iv_ruleEvoFeatureType= ruleEvoFeatureType EOF
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
    // InternalEvoMappingRepairDsl.g:4072:1: ruleEvoFeatureType returns [EObject current=null] : ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) ) ;
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
            // InternalEvoMappingRepairDsl.g:4078:2: ( ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) ) )
            // InternalEvoMappingRepairDsl.g:4079:2: ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) )
            {
            // InternalEvoMappingRepairDsl.g:4079:2: ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) )
            // InternalEvoMappingRepairDsl.g:4080:3: () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) )
            {
            // InternalEvoMappingRepairDsl.g:4080:3: ()
            // InternalEvoMappingRepairDsl.g:4081:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoFeatureTypeAccess().getEvoFeatureTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoFeatureTypeAccess().getFeatureTypeKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:4091:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' )
            // InternalEvoMappingRepairDsl.g:4092:4: otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,13,FOLLOW_24); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoFeatureTypeAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalEvoMappingRepairDsl.g:4096:4: ( (lv_variables_3_0= ruleEvoVariableTerm ) )
            // InternalEvoMappingRepairDsl.g:4097:5: (lv_variables_3_0= ruleEvoVariableTerm )
            {
            // InternalEvoMappingRepairDsl.g:4097:5: (lv_variables_3_0= ruleEvoVariableTerm )
            // InternalEvoMappingRepairDsl.g:4098:6: lv_variables_3_0= ruleEvoVariableTerm
            {

            						newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getVariablesEvoVariableTermParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_15);
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

            // InternalEvoMappingRepairDsl.g:4115:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==25) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:4116:5: otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_24); 

            	    					newLeafNode(otherlv_4, grammarAccess.getEvoFeatureTypeAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalEvoMappingRepairDsl.g:4120:5: ( (lv_variables_5_0= ruleEvoVariableTerm ) )
            	    // InternalEvoMappingRepairDsl.g:4121:6: (lv_variables_5_0= ruleEvoVariableTerm )
            	    {
            	    // InternalEvoMappingRepairDsl.g:4121:6: (lv_variables_5_0= ruleEvoVariableTerm )
            	    // InternalEvoMappingRepairDsl.g:4122:7: lv_variables_5_0= ruleEvoVariableTerm
            	    {

            	    							newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getVariablesEvoVariableTermParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    break loop51;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_54); 

            				newLeafNode(otherlv_6, grammarAccess.getEvoFeatureTypeAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_7=(Token)match(input,19,FOLLOW_55); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoFeatureTypeAccess().getEqualsSignEqualsSignKeyword_3());
            		
            // InternalEvoMappingRepairDsl.g:4149:3: ( (lv_type_8_0= ruleHyFeatureTypeEnum ) )
            // InternalEvoMappingRepairDsl.g:4150:4: (lv_type_8_0= ruleHyFeatureTypeEnum )
            {
            // InternalEvoMappingRepairDsl.g:4150:4: (lv_type_8_0= ruleHyFeatureTypeEnum )
            // InternalEvoMappingRepairDsl.g:4151:5: lv_type_8_0= ruleHyFeatureTypeEnum
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
    // InternalEvoMappingRepairDsl.g:4172:1: entryRuleEvoGroupType returns [EObject current=null] : iv_ruleEvoGroupType= ruleEvoGroupType EOF ;
    public final EObject entryRuleEvoGroupType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupType = null;


        try {
            // InternalEvoMappingRepairDsl.g:4172:53: (iv_ruleEvoGroupType= ruleEvoGroupType EOF )
            // InternalEvoMappingRepairDsl.g:4173:2: iv_ruleEvoGroupType= ruleEvoGroupType EOF
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
    // InternalEvoMappingRepairDsl.g:4179:1: ruleEvoGroupType returns [EObject current=null] : ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) ) ;
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
            // InternalEvoMappingRepairDsl.g:4185:2: ( ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) ) )
            // InternalEvoMappingRepairDsl.g:4186:2: ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) )
            {
            // InternalEvoMappingRepairDsl.g:4186:2: ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) )
            // InternalEvoMappingRepairDsl.g:4187:3: () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) )
            {
            // InternalEvoMappingRepairDsl.g:4187:3: ()
            // InternalEvoMappingRepairDsl.g:4188:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoGroupTypeAccess().getEvoGroupTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoGroupTypeAccess().getGroupTypeKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:4198:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' )
            // InternalEvoMappingRepairDsl.g:4199:4: otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,13,FOLLOW_24); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoGroupTypeAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalEvoMappingRepairDsl.g:4203:4: ( (lv_variables_3_0= ruleEvoGroupTerm ) )
            // InternalEvoMappingRepairDsl.g:4204:5: (lv_variables_3_0= ruleEvoGroupTerm )
            {
            // InternalEvoMappingRepairDsl.g:4204:5: (lv_variables_3_0= ruleEvoGroupTerm )
            // InternalEvoMappingRepairDsl.g:4205:6: lv_variables_3_0= ruleEvoGroupTerm
            {

            						newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getVariablesEvoGroupTermParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_15);
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

            // InternalEvoMappingRepairDsl.g:4222:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==25) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:4223:5: otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_24); 

            	    					newLeafNode(otherlv_4, grammarAccess.getEvoGroupTypeAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalEvoMappingRepairDsl.g:4227:5: ( (lv_variables_5_0= ruleEvoGroupTerm ) )
            	    // InternalEvoMappingRepairDsl.g:4228:6: (lv_variables_5_0= ruleEvoGroupTerm )
            	    {
            	    // InternalEvoMappingRepairDsl.g:4228:6: (lv_variables_5_0= ruleEvoGroupTerm )
            	    // InternalEvoMappingRepairDsl.g:4229:7: lv_variables_5_0= ruleEvoGroupTerm
            	    {

            	    							newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getVariablesEvoGroupTermParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    break loop52;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_54); 

            				newLeafNode(otherlv_6, grammarAccess.getEvoGroupTypeAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_7=(Token)match(input,19,FOLLOW_56); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoGroupTypeAccess().getEqualsSignEqualsSignKeyword_3());
            		
            // InternalEvoMappingRepairDsl.g:4256:3: ( (lv_type_8_0= ruleHyGroupTypeEnum ) )
            // InternalEvoMappingRepairDsl.g:4257:4: (lv_type_8_0= ruleHyGroupTypeEnum )
            {
            // InternalEvoMappingRepairDsl.g:4257:4: (lv_type_8_0= ruleHyGroupTypeEnum )
            // InternalEvoMappingRepairDsl.g:4258:5: lv_type_8_0= ruleHyGroupTypeEnum
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
    // InternalEvoMappingRepairDsl.g:4279:1: entryRuleEvoGroupTerm returns [EObject current=null] : iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF ;
    public final EObject entryRuleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupTerm = null;


        try {
            // InternalEvoMappingRepairDsl.g:4279:53: (iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF )
            // InternalEvoMappingRepairDsl.g:4280:2: iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF
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
    // InternalEvoMappingRepairDsl.g:4286:1: ruleEvoGroupTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4292:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalEvoMappingRepairDsl.g:4293:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalEvoMappingRepairDsl.g:4293:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalEvoMappingRepairDsl.g:4294:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalEvoMappingRepairDsl.g:4294:3: ( ( ruleQualifiedName ) )
            // InternalEvoMappingRepairDsl.g:4295:4: ( ruleQualifiedName )
            {
            // InternalEvoMappingRepairDsl.g:4295:4: ( ruleQualifiedName )
            // InternalEvoMappingRepairDsl.g:4296:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoGroupTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_53);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoMappingRepairDsl.g:4310:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=73 && LA53_0<=75)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:4311:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalEvoMappingRepairDsl.g:4311:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalEvoMappingRepairDsl.g:4312:5: lv_type_1_0= ruleEvoVariableType
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
    // InternalEvoMappingRepairDsl.g:4333:1: entryRuleEvoSetTerm returns [EObject current=null] : iv_ruleEvoSetTerm= ruleEvoSetTerm EOF ;
    public final EObject entryRuleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetTerm = null;


        try {
            // InternalEvoMappingRepairDsl.g:4333:51: (iv_ruleEvoSetTerm= ruleEvoSetTerm EOF )
            // InternalEvoMappingRepairDsl.g:4334:2: iv_ruleEvoSetTerm= ruleEvoSetTerm EOF
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
    // InternalEvoMappingRepairDsl.g:4340:1: ruleEvoSetTerm returns [EObject current=null] : (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4346:2: ( (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) )
            // InternalEvoMappingRepairDsl.g:4347:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            {
            // InternalEvoMappingRepairDsl.g:4347:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            // InternalEvoMappingRepairDsl.g:4348:3: otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSetTermAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalEvoMappingRepairDsl.g:4352:3: ( (lv_variables_1_0= ruleEvoSetVariable ) )
            // InternalEvoMappingRepairDsl.g:4353:4: (lv_variables_1_0= ruleEvoSetVariable )
            {
            // InternalEvoMappingRepairDsl.g:4353:4: (lv_variables_1_0= ruleEvoSetVariable )
            // InternalEvoMappingRepairDsl.g:4354:5: lv_variables_1_0= ruleEvoSetVariable
            {

            					newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
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

            // InternalEvoMappingRepairDsl.g:4371:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==25) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalEvoMappingRepairDsl.g:4372:4: otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_57); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetTermAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalEvoMappingRepairDsl.g:4376:4: ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    // InternalEvoMappingRepairDsl.g:4377:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    {
            	    // InternalEvoMappingRepairDsl.g:4377:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    // InternalEvoMappingRepairDsl.g:4378:6: lv_variables_3_0= ruleEvoSetVariable
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_58);
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
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,68,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4404:1: entryRuleEvoSetVariable returns [EObject current=null] : iv_ruleEvoSetVariable= ruleEvoSetVariable EOF ;
    public final EObject entryRuleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetVariable = null;


        try {
            // InternalEvoMappingRepairDsl.g:4404:55: (iv_ruleEvoSetVariable= ruleEvoSetVariable EOF )
            // InternalEvoMappingRepairDsl.g:4405:2: iv_ruleEvoSetVariable= ruleEvoSetVariable EOF
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
    // InternalEvoMappingRepairDsl.g:4411:1: ruleEvoSetVariable returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) ;
    public final EObject ruleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject this_EvoVariableTerm_0 = null;

        EObject this_EvoSetTerm_1 = null;

        EObject this_EvoNot_2 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4417:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) )
            // InternalEvoMappingRepairDsl.g:4418:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            {
            // InternalEvoMappingRepairDsl.g:4418:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt55=1;
                }
                break;
            case 67:
                {
                alt55=2;
                }
                break;
            case 62:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:4419:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
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
                    // InternalEvoMappingRepairDsl.g:4428:3: this_EvoSetTerm_1= ruleEvoSetTerm
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
                    // InternalEvoMappingRepairDsl.g:4437:3: this_EvoNot_2= ruleEvoNot
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
    // InternalEvoMappingRepairDsl.g:4449:1: entryRuleEvoParentOf returns [EObject current=null] : iv_ruleEvoParentOf= ruleEvoParentOf EOF ;
    public final EObject entryRuleEvoParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoParentOf = null;


        try {
            // InternalEvoMappingRepairDsl.g:4449:52: (iv_ruleEvoParentOf= ruleEvoParentOf EOF )
            // InternalEvoMappingRepairDsl.g:4450:2: iv_ruleEvoParentOf= ruleEvoParentOf EOF
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
    // InternalEvoMappingRepairDsl.g:4456:1: ruleEvoParentOf returns [EObject current=null] : (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoParentOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4462:2: ( (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalEvoMappingRepairDsl.g:4463:2: (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalEvoMappingRepairDsl.g:4463:2: (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalEvoMappingRepairDsl.g:4464:3: otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoParentOfAccess().getParentOfKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoParentOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:4472:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalEvoMappingRepairDsl.g:4473:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoMappingRepairDsl.g:4473:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalEvoMappingRepairDsl.g:4474:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoParentOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4499:1: entryRuleEvoSiblingsOf returns [EObject current=null] : iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF ;
    public final EObject entryRuleEvoSiblingsOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSiblingsOf = null;


        try {
            // InternalEvoMappingRepairDsl.g:4499:54: (iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF )
            // InternalEvoMappingRepairDsl.g:4500:2: iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF
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
    // InternalEvoMappingRepairDsl.g:4506:1: ruleEvoSiblingsOf returns [EObject current=null] : (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoSiblingsOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4512:2: ( (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalEvoMappingRepairDsl.g:4513:2: (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalEvoMappingRepairDsl.g:4513:2: (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalEvoMappingRepairDsl.g:4514:3: otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSiblingsOfAccess().getSibilingsOfKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoSiblingsOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:4522:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalEvoMappingRepairDsl.g:4523:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoMappingRepairDsl.g:4523:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalEvoMappingRepairDsl.g:4524:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoSiblingsOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4549:1: entryRuleEvoChildrenOf returns [EObject current=null] : iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF ;
    public final EObject entryRuleEvoChildrenOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoChildrenOf = null;


        try {
            // InternalEvoMappingRepairDsl.g:4549:54: (iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF )
            // InternalEvoMappingRepairDsl.g:4550:2: iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF
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
    // InternalEvoMappingRepairDsl.g:4556:1: ruleEvoChildrenOf returns [EObject current=null] : (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoChildrenOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4562:2: ( (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalEvoMappingRepairDsl.g:4563:2: (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalEvoMappingRepairDsl.g:4563:2: (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalEvoMappingRepairDsl.g:4564:3: otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoChildrenOfAccess().getChildrenOfKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoChildrenOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoMappingRepairDsl.g:4572:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalEvoMappingRepairDsl.g:4573:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoMappingRepairDsl.g:4573:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalEvoMappingRepairDsl.g:4574:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoChildrenOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4599:1: ruleEvoMappingRelativeVersionRestrictionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleEvoMappingRelativeVersionRestrictionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4605:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // InternalEvoMappingRepairDsl.g:4606:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // InternalEvoMappingRepairDsl.g:4606:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt56=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt56=1;
                }
                break;
            case 26:
                {
                alt56=2;
                }
                break;
            case 72:
                {
                alt56=3;
                }
                break;
            case 28:
                {
                alt56=4;
                }
                break;
            case 27:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:4607:3: (enumLiteral_0= '<' )
                    {
                    // InternalEvoMappingRepairDsl.g:4607:3: (enumLiteral_0= '<' )
                    // InternalEvoMappingRepairDsl.g:4608:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoMappingRepairDsl.g:4615:3: (enumLiteral_1= '<=' )
                    {
                    // InternalEvoMappingRepairDsl.g:4615:3: (enumLiteral_1= '<=' )
                    // InternalEvoMappingRepairDsl.g:4616:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoMappingRepairDsl.g:4623:3: (enumLiteral_2= '=' )
                    {
                    // InternalEvoMappingRepairDsl.g:4623:3: (enumLiteral_2= '=' )
                    // InternalEvoMappingRepairDsl.g:4624:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEvoMappingRepairDsl.g:4631:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEvoMappingRepairDsl.g:4631:3: (enumLiteral_3= '>=' )
                    // InternalEvoMappingRepairDsl.g:4632:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEvoMappingRepairDsl.g:4639:3: (enumLiteral_4= '>' )
                    {
                    // InternalEvoMappingRepairDsl.g:4639:3: (enumLiteral_4= '>' )
                    // InternalEvoMappingRepairDsl.g:4640:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4650:1: ruleEvoVariableType returns [Enumerator current=null] : ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) ;
    public final Enumerator ruleEvoVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4656:2: ( ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) )
            // InternalEvoMappingRepairDsl.g:4657:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            {
            // InternalEvoMappingRepairDsl.g:4657:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt57=1;
                }
                break;
            case 74:
                {
                alt57=2;
                }
                break;
            case 75:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:4658:3: (enumLiteral_0= '@ident' )
                    {
                    // InternalEvoMappingRepairDsl.g:4658:3: (enumLiteral_0= '@ident' )
                    // InternalEvoMappingRepairDsl.g:4659:4: enumLiteral_0= '@ident'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoMappingRepairDsl.g:4666:3: (enumLiteral_1= '@pre' )
                    {
                    // InternalEvoMappingRepairDsl.g:4666:3: (enumLiteral_1= '@pre' )
                    // InternalEvoMappingRepairDsl.g:4667:4: enumLiteral_1= '@pre'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoMappingRepairDsl.g:4674:3: (enumLiteral_2= '@post' )
                    {
                    // InternalEvoMappingRepairDsl.g:4674:3: (enumLiteral_2= '@post' )
                    // InternalEvoMappingRepairDsl.g:4675:4: enumLiteral_2= '@post'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4685:1: ruleHyFeatureTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) ;
    public final Enumerator ruleHyFeatureTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4691:2: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) )
            // InternalEvoMappingRepairDsl.g:4692:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            {
            // InternalEvoMappingRepairDsl.g:4692:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==76) ) {
                alt58=1;
            }
            else if ( (LA58_0==77) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:4693:3: (enumLiteral_0= 'optional' )
                    {
                    // InternalEvoMappingRepairDsl.g:4693:3: (enumLiteral_0= 'optional' )
                    // InternalEvoMappingRepairDsl.g:4694:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoMappingRepairDsl.g:4701:3: (enumLiteral_1= 'mandatory' )
                    {
                    // InternalEvoMappingRepairDsl.g:4701:3: (enumLiteral_1= 'mandatory' )
                    // InternalEvoMappingRepairDsl.g:4702:4: enumLiteral_1= 'mandatory'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

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
    // InternalEvoMappingRepairDsl.g:4712:1: ruleHyGroupTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) ;
    public final Enumerator ruleHyGroupTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoMappingRepairDsl.g:4718:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) )
            // InternalEvoMappingRepairDsl.g:4719:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            {
            // InternalEvoMappingRepairDsl.g:4719:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt59=1;
                }
                break;
            case 79:
                {
                alt59=2;
                }
                break;
            case 80:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalEvoMappingRepairDsl.g:4720:3: (enumLiteral_0= 'and' )
                    {
                    // InternalEvoMappingRepairDsl.g:4720:3: (enumLiteral_0= 'and' )
                    // InternalEvoMappingRepairDsl.g:4721:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoMappingRepairDsl.g:4728:3: (enumLiteral_1= 'or' )
                    {
                    // InternalEvoMappingRepairDsl.g:4728:3: (enumLiteral_1= 'or' )
                    // InternalEvoMappingRepairDsl.g:4729:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoMappingRepairDsl.g:4736:3: (enumLiteral_2= 'alternative' )
                    {
                    // InternalEvoMappingRepairDsl.g:4736:3: (enumLiteral_2= 'alternative' )
                    // InternalEvoMappingRepairDsl.g:4737:4: enumLiteral_2= 'alternative'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

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


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\1\14\13\uffff";
    static final String dfa_3s = "\1\4\1\16\13\uffff";
    static final String dfa_4s = "\1\55\1\51\13\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\6\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\6\6\uffff\1\2\17\uffff\1\3\4\uffff\1\12\1\4\2\uffff\2\7\1\5\3\uffff\1\10\1\11",
            "\1\14\2\uffff\21\14\7\uffff\1\13",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1261:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\44\1\uffff\1\5\1\35\1\5\2\uffff\1\35";
    static final String dfa_10s = "\1\47\1\uffff\1\5\1\51\1\5\2\uffff\1\51";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\3\1\2\1\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\2\uffff\1\2",
            "",
            "\1\3",
            "\1\6\7\uffff\1\5\3\uffff\1\4",
            "\1\7",
            "",
            "",
            "\1\6\7\uffff\1\5\3\uffff\1\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1691:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000031CC20002050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000009000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000001C800000L,0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xE980000000002020L,0x00000000000000EFL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xE980000000002060L,0x00000000000000EFL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000020L,0x0000000000000009L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000E00L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000020L,0x0000000000000008L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000010L});

}