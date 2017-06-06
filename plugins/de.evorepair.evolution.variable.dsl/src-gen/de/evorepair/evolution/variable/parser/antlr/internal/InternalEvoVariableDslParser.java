package de.evorepair.evolution.variable.parser.antlr.internal;

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
import de.evorepair.evolution.variable.services.EvoVariableDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoVariableDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'_'", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'"
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

        public InternalEvoVariableDslParser(TokenStream input, EvoVariableDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EvoVariableDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEvoVariableDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEvoVariableDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalEvoVariableDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEvoVariableDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_variables_0_0= ruleEvoVariable ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:78:2: ( ( (lv_variables_0_0= ruleEvoVariable ) )* )
            // InternalEvoVariableDsl.g:79:2: ( (lv_variables_0_0= ruleEvoVariable ) )*
            {
            // InternalEvoVariableDsl.g:79:2: ( (lv_variables_0_0= ruleEvoVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:80:3: (lv_variables_0_0= ruleEvoVariable )
            	    {
            	    // InternalEvoVariableDsl.g:80:3: (lv_variables_0_0= ruleEvoVariable )
            	    // InternalEvoVariableDsl.g:81:4: lv_variables_0_0= ruleEvoVariable
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_variables_0_0=ruleEvoVariable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variables",
            	    					lv_variables_0_0,
            	    					"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariable");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoVariableDsl.g:101:1: entryRuleEvoVariable returns [EObject current=null] : iv_ruleEvoVariable= ruleEvoVariable EOF ;
    public final EObject entryRuleEvoVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariable = null;


        try {
            // InternalEvoVariableDsl.g:101:52: (iv_ruleEvoVariable= ruleEvoVariable EOF )
            // InternalEvoVariableDsl.g:102:2: iv_ruleEvoVariable= ruleEvoVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoVariable=ruleEvoVariable();

            state._fsp--;

             current =iv_ruleEvoVariable; 
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
    // $ANTLR end "entryRuleEvoVariable"


    // $ANTLR start "ruleEvoVariable"
    // InternalEvoVariableDsl.g:108:1: ruleEvoVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) ) ;
    public final EObject ruleEvoVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        Enumerator lv_variableType_4_0 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:114:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) ) )
            // InternalEvoVariableDsl.g:115:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) )
            {
            // InternalEvoVariableDsl.g:115:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) )
            // InternalEvoVariableDsl.g:116:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoVariableAccess().getVarKeyword_0());
            		
            // InternalEvoVariableDsl.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvoVariableDsl.g:138:3: (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) )
            // InternalEvoVariableDsl.g:139:4: otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoVariableAccess().get_Keyword_2_0());
            			
            // InternalEvoVariableDsl.g:143:4: ( (lv_index_3_0= RULE_INT ) )
            // InternalEvoVariableDsl.g:144:5: (lv_index_3_0= RULE_INT )
            {
            // InternalEvoVariableDsl.g:144:5: (lv_index_3_0= RULE_INT )
            // InternalEvoVariableDsl.g:145:6: lv_index_3_0= RULE_INT
            {
            lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            						newLeafNode(lv_index_3_0, grammarAccess.getEvoVariableAccess().getIndexINTTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEvoVariableRule());
            						}
            						setWithLastConsumed(
            							current,
            							"index",
            							lv_index_3_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            // InternalEvoVariableDsl.g:162:3: ( (lv_variableType_4_0= ruleEvoVariableType ) )
            // InternalEvoVariableDsl.g:163:4: (lv_variableType_4_0= ruleEvoVariableType )
            {
            // InternalEvoVariableDsl.g:163:4: (lv_variableType_4_0= ruleEvoVariableType )
            // InternalEvoVariableDsl.g:164:5: lv_variableType_4_0= ruleEvoVariableType
            {

            					newCompositeNode(grammarAccess.getEvoVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_variableType_4_0=ruleEvoVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoVariableRule());
            					}
            					set(
            						current,
            						"variableType",
            						lv_variableType_4_0,
            						"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariableType");
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
    // $ANTLR end "ruleEvoVariable"


    // $ANTLR start "ruleEvoVariableType"
    // InternalEvoVariableDsl.g:185:1: ruleEvoVariableType returns [Enumerator current=null] : ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) ;
    public final Enumerator ruleEvoVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:191:2: ( ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) )
            // InternalEvoVariableDsl.g:192:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            {
            // InternalEvoVariableDsl.g:192:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEvoVariableDsl.g:193:3: (enumLiteral_0= '@ident' )
                    {
                    // InternalEvoVariableDsl.g:193:3: (enumLiteral_0= '@ident' )
                    // InternalEvoVariableDsl.g:194:4: enumLiteral_0= '@ident'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:201:3: (enumLiteral_1= '@pre' )
                    {
                    // InternalEvoVariableDsl.g:201:3: (enumLiteral_1= '@pre' )
                    // InternalEvoVariableDsl.g:202:4: enumLiteral_1= '@pre'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:209:3: (enumLiteral_2= '@post' )
                    {
                    // InternalEvoVariableDsl.g:209:3: (enumLiteral_2= '@post' )
                    // InternalEvoVariableDsl.g:210:4: enumLiteral_2= '@post'
                    {
                    enumLiteral_2=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "ruleEvoFeatureVariableType"
    // InternalEvoVariableDsl.g:220:1: ruleEvoFeatureVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) ) ;
    public final Enumerator ruleEvoFeatureVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:226:2: ( ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) ) )
            // InternalEvoVariableDsl.g:227:2: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) )
            {
            // InternalEvoVariableDsl.g:227:2: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
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
                    // InternalEvoVariableDsl.g:228:3: (enumLiteral_0= 'parent' )
                    {
                    // InternalEvoVariableDsl.g:228:3: (enumLiteral_0= 'parent' )
                    // InternalEvoVariableDsl.g:229:4: enumLiteral_0= 'parent'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:236:3: (enumLiteral_1= 'source' )
                    {
                    // InternalEvoVariableDsl.g:236:3: (enumLiteral_1= 'source' )
                    // InternalEvoVariableDsl.g:237:4: enumLiteral_1= 'source'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:244:3: (enumLiteral_2= 'child' )
                    {
                    // InternalEvoVariableDsl.g:244:3: (enumLiteral_2= 'child' )
                    // InternalEvoVariableDsl.g:245:4: enumLiteral_2= 'child'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEvoFeatureVariableType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});

}