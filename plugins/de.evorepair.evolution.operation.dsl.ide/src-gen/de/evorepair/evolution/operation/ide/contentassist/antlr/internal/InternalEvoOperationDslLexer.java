package de.evorepair.evolution.operation.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoOperationDslLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DATE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalEvoOperationDslLexer() {;} 
    public InternalEvoOperationDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEvoOperationDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEvoOperationDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:11:7: ( 'parentOf' )
            // InternalEvoOperationDsl.g:11:9: 'parentOf'
            {
            match("parentOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:12:7: ( 'siblingOf' )
            // InternalEvoOperationDsl.g:12:9: 'siblingOf'
            {
            match("siblingOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:13:7: ( 'childOf' )
            // InternalEvoOperationDsl.g:13:9: 'childOf'
            {
            match("childOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:14:7: ( 'operation' )
            // InternalEvoOperationDsl.g:14:9: 'operation'
            {
            match("operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:15:7: ( '{' )
            // InternalEvoOperationDsl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:16:7: ( 'variables' )
            // InternalEvoOperationDsl.g:16:9: 'variables'
            {
            match("variables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:17:7: ( ';' )
            // InternalEvoOperationDsl.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:18:7: ( '}' )
            // InternalEvoOperationDsl.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:19:7: ( 'date' )
            // InternalEvoOperationDsl.g:19:9: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:20:7: ( ':' )
            // InternalEvoOperationDsl.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:21:7: ( 'feature' )
            // InternalEvoOperationDsl.g:21:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:22:7: ( 'reference' )
            // InternalEvoOperationDsl.g:22:9: 'reference'
            {
            match("reference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:23:7: ( '(' )
            // InternalEvoOperationDsl.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:24:7: ( ')' )
            // InternalEvoOperationDsl.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:25:7: ( ',' )
            // InternalEvoOperationDsl.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:26:7: ( 'group' )
            // InternalEvoOperationDsl.g:26:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:27:7: ( 'value' )
            // InternalEvoOperationDsl.g:27:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:28:7: ( '=' )
            // InternalEvoOperationDsl.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:29:7: ( 'set' )
            // InternalEvoOperationDsl.g:29:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:30:7: ( 'mapping' )
            // InternalEvoOperationDsl.g:30:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:31:7: ( 'configuration' )
            // InternalEvoOperationDsl.g:31:9: 'configuration'
            {
            match("configuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2331:11: ( '\"' ( '0' .. '9' )* '/' ( '0' | '1' ) '0' .. '9' '/' ( '0' '1' .. '9' | '1' '0' .. '9' | '2' '0' .. '9' | '3' '0' .. '1' ) ' ' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9' '\"' )
            // InternalEvoOperationDsl.g:2331:13: '\"' ( '0' .. '9' )* '/' ( '0' | '1' ) '0' .. '9' '/' ( '0' '1' .. '9' | '1' '0' .. '9' | '2' '0' .. '9' | '3' '0' .. '1' ) ' ' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9' '\"'
            {
            match('\"'); 
            // InternalEvoOperationDsl.g:2331:17: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:2331:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('/'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            matchRange('0','9'); 
            match('/'); 
            // InternalEvoOperationDsl.g:2331:56: ( '0' '1' .. '9' | '1' '0' .. '9' | '2' '0' .. '9' | '3' '0' .. '1' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt2=1;
                }
                break;
            case '1':
                {
                alt2=2;
                }
                break;
            case '2':
                {
                alt2=3;
                }
                break;
            case '3':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEvoOperationDsl.g:2331:57: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:2331:70: '1' '0' .. '9'
                    {
                    match('1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:2331:83: '2' '0' .. '9'
                    {
                    match('2'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 4 :
                    // InternalEvoOperationDsl.g:2331:96: '3' '0' .. '1'
                    {
                    match('3'); 
                    matchRange('0','1'); 

                    }
                    break;

            }

            match(' '); 
            matchRange('0','5'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','5'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','5'); 
            matchRange('0','9'); 
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2333:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEvoOperationDsl.g:2333:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEvoOperationDsl.g:2333:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvoOperationDsl.g:2333:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEvoOperationDsl.g:2333:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2335:10: ( ( '0' .. '9' )+ )
            // InternalEvoOperationDsl.g:2335:12: ( '0' .. '9' )+
            {
            // InternalEvoOperationDsl.g:2335:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:2335:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2337:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEvoOperationDsl.g:2337:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEvoOperationDsl.g:2337:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEvoOperationDsl.g:2337:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEvoOperationDsl.g:2337:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalEvoOperationDsl.g:2337:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEvoOperationDsl.g:2337:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:2337:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEvoOperationDsl.g:2337:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEvoOperationDsl.g:2337:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEvoOperationDsl.g:2337:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2339:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEvoOperationDsl.g:2339:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEvoOperationDsl.g:2339:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:2339:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2341:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEvoOperationDsl.g:2341:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEvoOperationDsl.g:2341:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:2341:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalEvoOperationDsl.g:2341:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEvoOperationDsl.g:2341:41: ( '\\r' )? '\\n'
                    {
                    // InternalEvoOperationDsl.g:2341:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEvoOperationDsl.g:2341:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2343:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEvoOperationDsl.g:2343:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEvoOperationDsl.g:2343:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvoOperationDsl.g:2345:16: ( . )
            // InternalEvoOperationDsl.g:2345:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalEvoOperationDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=29;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalEvoOperationDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalEvoOperationDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalEvoOperationDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalEvoOperationDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalEvoOperationDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalEvoOperationDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalEvoOperationDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalEvoOperationDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalEvoOperationDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalEvoOperationDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalEvoOperationDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalEvoOperationDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalEvoOperationDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalEvoOperationDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalEvoOperationDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalEvoOperationDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalEvoOperationDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalEvoOperationDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalEvoOperationDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalEvoOperationDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalEvoOperationDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalEvoOperationDsl.g:1:136: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 23 :
                // InternalEvoOperationDsl.g:1:146: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalEvoOperationDsl.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // InternalEvoOperationDsl.g:1:163: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalEvoOperationDsl.g:1:175: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalEvoOperationDsl.g:1:191: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalEvoOperationDsl.g:1:207: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalEvoOperationDsl.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\4\34\1\uffff\1\34\2\uffff\1\34\1\uffff\2\34\3\uffff\1\34\1\uffff\1\34\2\32\2\uffff\2\32\2\uffff\1\34\1\uffff\5\34\1\uffff\1\34\2\uffff\1\34\1\uffff\2\34\3\uffff\1\34\1\uffff\1\34\7\uffff\2\34\1\107\12\34\1\uffff\2\34\1\uffff\5\34\1\132\4\34\1\uffff\6\34\1\146\1\uffff\2\34\1\151\1\34\1\uffff\6\34\1\uffff\2\34\1\uffff\1\34\4\uffff\2\34\1\176\3\34\1\u0082\1\34\1\u0084\4\uffff\1\u0086\1\34\1\uffff\3\34\1\uffff\1\34\3\uffff\1\u008d\1\34\1\u008f\1\u0090\1\u0091\2\uffff\1\34\4\uffff\1\34\1\uffff\1\34\1\uffff\1\u0099\7\uffff";
    static final String DFA14_eofS =
        "\u009f\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\145\1\150\1\160\1\uffff\1\141\2\uffff\1\141\1\uffff\2\145\3\uffff\1\162\1\uffff\1\141\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\162\1\uffff\1\142\1\164\1\151\1\156\1\145\1\uffff\1\154\2\uffff\1\164\1\uffff\1\141\1\146\3\uffff\1\157\1\uffff\1\160\2\0\5\uffff\1\145\1\154\1\60\1\154\1\146\1\162\1\151\1\165\1\145\1\164\1\145\1\165\1\160\1\0\1\156\1\151\1\uffff\1\144\1\151\2\141\1\145\1\60\1\165\1\162\1\160\1\151\1\0\1\164\1\156\1\117\1\147\1\164\1\142\1\60\1\uffff\1\162\1\145\1\60\1\156\1\0\1\117\1\147\1\146\1\165\1\151\1\154\1\uffff\1\145\1\156\1\uffff\1\147\4\0\1\146\1\117\1\60\1\162\1\157\1\145\1\60\1\143\1\60\4\0\1\60\1\146\1\uffff\1\141\1\156\1\163\1\uffff\1\145\1\uffff\1\0\1\uffff\1\60\1\164\3\60\1\0\1\uffff\1\151\3\uffff\1\0\1\157\1\0\1\156\1\0\1\60\1\0\1\uffff\3\0\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\141\1\151\1\157\1\160\1\uffff\1\141\2\uffff\1\141\1\uffff\2\145\3\uffff\1\162\1\uffff\1\141\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\162\1\uffff\1\142\1\164\1\151\1\156\1\145\1\uffff\1\162\2\uffff\1\164\1\uffff\1\141\1\146\3\uffff\1\157\1\uffff\1\160\2\uffff\5\uffff\1\145\1\154\1\172\1\154\1\146\1\162\1\151\1\165\1\145\1\164\1\145\1\165\1\160\1\uffff\1\156\1\151\1\uffff\1\144\1\151\2\141\1\145\1\172\1\165\1\162\1\160\1\151\1\uffff\1\164\1\156\1\117\1\147\1\164\1\142\1\172\1\uffff\1\162\1\145\1\172\1\156\1\uffff\1\117\1\147\1\146\1\165\1\151\1\154\1\uffff\1\145\1\156\1\uffff\1\147\4\uffff\1\146\1\117\1\172\1\162\1\157\1\145\1\172\1\143\1\172\4\uffff\1\172\1\146\1\uffff\1\141\1\156\1\163\1\uffff\1\145\1\uffff\1\uffff\1\uffff\1\172\1\164\3\172\1\uffff\1\uffff\1\151\3\uffff\1\uffff\1\157\1\uffff\1\156\1\uffff\1\172\1\uffff\1\uffff\3\uffff\2\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\5\1\uffff\1\7\1\10\1\uffff\1\12\2\uffff\1\15\1\16\1\17\1\uffff\1\22\3\uffff\1\27\1\30\2\uffff\1\34\1\35\1\uffff\1\27\5\uffff\1\5\1\uffff\1\7\1\10\1\uffff\1\12\2\uffff\1\15\1\16\1\17\1\uffff\1\22\3\uffff\1\31\1\30\1\32\1\33\1\34\20\uffff\1\23\22\uffff\1\11\13\uffff\1\21\2\uffff\1\20\24\uffff\1\3\3\uffff\1\13\1\uffff\1\24\1\uffff\1\1\6\uffff\1\2\1\uffff\1\4\1\6\1\14\7\uffff\1\25\3\uffff\2\26";
    static final String DFA14_specialS =
        "\1\30\22\uffff\1\0\3\uffff\1\2\30\uffff\1\1\1\3\22\uffff\1\5\15\uffff\1\6\14\uffff\1\4\13\uffff\1\7\1\10\1\12\1\14\11\uffff\1\11\1\13\1\15\1\16\11\uffff\1\17\6\uffff\1\20\5\uffff\1\21\1\uffff\1\22\1\uffff\1\23\1\uffff\1\24\1\uffff\1\25\1\26\1\27\2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\23\4\32\1\27\1\15\1\16\2\32\1\17\2\32\1\30\12\26\1\12\1\7\1\32\1\21\3\32\32\25\3\32\1\24\1\25\1\32\2\25\1\3\1\11\1\25\1\13\1\20\5\25\1\22\1\25\1\4\1\1\1\25\1\14\1\2\2\25\1\6\4\25\1\5\1\32\1\10\uff82\32",
            "\1\33",
            "\1\36\3\uffff\1\35",
            "\1\37\6\uffff\1\40",
            "\1\41",
            "",
            "\1\43",
            "",
            "",
            "\1\46",
            "",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "\1\55",
            "",
            "\1\57",
            "\57\62\1\61\12\60\uffc6\62",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\62",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "\1\76\5\uffff\1\75",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "\1\102",
            "",
            "\1\103",
            "\57\62\1\61\12\60\uffc6\62",
            "\60\62\2\104\uffce\62",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\60\62\12\122\uffc6\62",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\57\62\1\137\uffd0\62",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\147",
            "\1\150",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\152",
            "\60\62\1\153\1\154\1\155\1\156\uffcc\62",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\61\62\11\170\uffc6\62",
            "\60\62\12\171\uffc6\62",
            "\60\62\12\172\uffc6\62",
            "\60\62\2\173\uffce\62",
            "\1\174",
            "\1\175",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0083",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\40\62\1\u0085\uffdf\62",
            "\40\62\1\u0085\uffdf\62",
            "\40\62\1\u0085\uffdf\62",
            "\40\62\1\u0085\uffdf\62",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "",
            "\60\62\6\u008c\uffca\62",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u008e",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\60\62\12\u0092\uffc6\62",
            "",
            "\1\u0093",
            "",
            "",
            "",
            "\72\62\1\u0094\uffc5\62",
            "\1\u0095",
            "\60\62\6\u0096\uffca\62",
            "\1\u0097",
            "\60\62\12\u0098\uffc6\62",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\72\62\1\u009a\uffc5\62",
            "",
            "\60\62\6\u009b\uffca\62",
            "\60\62\12\u009c\uffc6\62",
            "\42\62\1\u009d\uffdd\62",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_19 = input.LA(1);

                        s = -1;
                        if ( ((LA14_19>='0' && LA14_19<='9')) ) {s = 48;}

                        else if ( (LA14_19=='/') ) {s = 49;}

                        else if ( ((LA14_19>='\u0000' && LA14_19<='.')||(LA14_19>=':' && LA14_19<='\uFFFF')) ) {s = 50;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_48 = input.LA(1);

                        s = -1;
                        if ( ((LA14_48>='\u0000' && LA14_48<='.')||(LA14_48>=':' && LA14_48<='\uFFFF')) ) {s = 50;}

                        else if ( (LA14_48=='/') ) {s = 49;}

                        else if ( ((LA14_48>='0' && LA14_48<='9')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 50;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_49 = input.LA(1);

                        s = -1;
                        if ( ((LA14_49>='0' && LA14_49<='1')) ) {s = 68;}

                        else if ( ((LA14_49>='\u0000' && LA14_49<='/')||(LA14_49>='2' && LA14_49<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_95 = input.LA(1);

                        s = -1;
                        if ( (LA14_95=='0') ) {s = 107;}

                        else if ( (LA14_95=='1') ) {s = 108;}

                        else if ( (LA14_95=='2') ) {s = 109;}

                        else if ( (LA14_95=='3') ) {s = 110;}

                        else if ( ((LA14_95>='\u0000' && LA14_95<='/')||(LA14_95>='4' && LA14_95<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_68 = input.LA(1);

                        s = -1;
                        if ( ((LA14_68>='0' && LA14_68<='9')) ) {s = 82;}

                        else if ( ((LA14_68>='\u0000' && LA14_68<='/')||(LA14_68>=':' && LA14_68<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_82 = input.LA(1);

                        s = -1;
                        if ( (LA14_82=='/') ) {s = 95;}

                        else if ( ((LA14_82>='\u0000' && LA14_82<='.')||(LA14_82>='0' && LA14_82<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_107 = input.LA(1);

                        s = -1;
                        if ( ((LA14_107>='1' && LA14_107<='9')) ) {s = 120;}

                        else if ( ((LA14_107>='\u0000' && LA14_107<='0')||(LA14_107>=':' && LA14_107<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_108 = input.LA(1);

                        s = -1;
                        if ( ((LA14_108>='0' && LA14_108<='9')) ) {s = 121;}

                        else if ( ((LA14_108>='\u0000' && LA14_108<='/')||(LA14_108>=':' && LA14_108<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_120 = input.LA(1);

                        s = -1;
                        if ( ((LA14_120>='\u0000' && LA14_120<='\u001F')||(LA14_120>='!' && LA14_120<='\uFFFF')) ) {s = 50;}

                        else if ( (LA14_120==' ') ) {s = 133;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_109 = input.LA(1);

                        s = -1;
                        if ( ((LA14_109>='0' && LA14_109<='9')) ) {s = 122;}

                        else if ( ((LA14_109>='\u0000' && LA14_109<='/')||(LA14_109>=':' && LA14_109<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_121 = input.LA(1);

                        s = -1;
                        if ( ((LA14_121>='\u0000' && LA14_121<='\u001F')||(LA14_121>='!' && LA14_121<='\uFFFF')) ) {s = 50;}

                        else if ( (LA14_121==' ') ) {s = 133;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_110 = input.LA(1);

                        s = -1;
                        if ( ((LA14_110>='0' && LA14_110<='1')) ) {s = 123;}

                        else if ( ((LA14_110>='\u0000' && LA14_110<='/')||(LA14_110>='2' && LA14_110<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_122 = input.LA(1);

                        s = -1;
                        if ( ((LA14_122>='\u0000' && LA14_122<='\u001F')||(LA14_122>='!' && LA14_122<='\uFFFF')) ) {s = 50;}

                        else if ( (LA14_122==' ') ) {s = 133;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_123 = input.LA(1);

                        s = -1;
                        if ( (LA14_123==' ') ) {s = 133;}

                        else if ( ((LA14_123>='\u0000' && LA14_123<='\u001F')||(LA14_123>='!' && LA14_123<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_133 = input.LA(1);

                        s = -1;
                        if ( ((LA14_133>='0' && LA14_133<='5')) ) {s = 140;}

                        else if ( ((LA14_133>='\u0000' && LA14_133<='/')||(LA14_133>='6' && LA14_133<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_140 = input.LA(1);

                        s = -1;
                        if ( ((LA14_140>='0' && LA14_140<='9')) ) {s = 146;}

                        else if ( ((LA14_140>='\u0000' && LA14_140<='/')||(LA14_140>=':' && LA14_140<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_146 = input.LA(1);

                        s = -1;
                        if ( (LA14_146==':') ) {s = 148;}

                        else if ( ((LA14_146>='\u0000' && LA14_146<='9')||(LA14_146>=';' && LA14_146<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_148 = input.LA(1);

                        s = -1;
                        if ( ((LA14_148>='0' && LA14_148<='5')) ) {s = 150;}

                        else if ( ((LA14_148>='\u0000' && LA14_148<='/')||(LA14_148>='6' && LA14_148<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_150 = input.LA(1);

                        s = -1;
                        if ( ((LA14_150>='0' && LA14_150<='9')) ) {s = 152;}

                        else if ( ((LA14_150>='\u0000' && LA14_150<='/')||(LA14_150>=':' && LA14_150<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_152 = input.LA(1);

                        s = -1;
                        if ( (LA14_152==':') ) {s = 154;}

                        else if ( ((LA14_152>='\u0000' && LA14_152<='9')||(LA14_152>=';' && LA14_152<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_154 = input.LA(1);

                        s = -1;
                        if ( ((LA14_154>='0' && LA14_154<='5')) ) {s = 155;}

                        else if ( ((LA14_154>='\u0000' && LA14_154<='/')||(LA14_154>='6' && LA14_154<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_155 = input.LA(1);

                        s = -1;
                        if ( ((LA14_155>='0' && LA14_155<='9')) ) {s = 156;}

                        else if ( ((LA14_155>='\u0000' && LA14_155<='/')||(LA14_155>=':' && LA14_155<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA14_156 = input.LA(1);

                        s = -1;
                        if ( (LA14_156=='\"') ) {s = 157;}

                        else if ( ((LA14_156>='\u0000' && LA14_156<='!')||(LA14_156>='#' && LA14_156<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='p') ) {s = 1;}

                        else if ( (LA14_0=='s') ) {s = 2;}

                        else if ( (LA14_0=='c') ) {s = 3;}

                        else if ( (LA14_0=='o') ) {s = 4;}

                        else if ( (LA14_0=='{') ) {s = 5;}

                        else if ( (LA14_0=='v') ) {s = 6;}

                        else if ( (LA14_0==';') ) {s = 7;}

                        else if ( (LA14_0=='}') ) {s = 8;}

                        else if ( (LA14_0=='d') ) {s = 9;}

                        else if ( (LA14_0==':') ) {s = 10;}

                        else if ( (LA14_0=='f') ) {s = 11;}

                        else if ( (LA14_0=='r') ) {s = 12;}

                        else if ( (LA14_0=='(') ) {s = 13;}

                        else if ( (LA14_0==')') ) {s = 14;}

                        else if ( (LA14_0==',') ) {s = 15;}

                        else if ( (LA14_0=='g') ) {s = 16;}

                        else if ( (LA14_0=='=') ) {s = 17;}

                        else if ( (LA14_0=='m') ) {s = 18;}

                        else if ( (LA14_0=='\"') ) {s = 19;}

                        else if ( (LA14_0=='^') ) {s = 20;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||LA14_0=='e'||(LA14_0>='h' && LA14_0<='l')||LA14_0=='n'||LA14_0=='q'||(LA14_0>='t' && LA14_0<='u')||(LA14_0>='w' && LA14_0<='z')) ) {s = 21;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 25;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}