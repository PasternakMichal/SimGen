package cs.queensu.ca.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cs.queensu.ca.services.UnityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUnityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MetaObject'", "':'", "'car'", "'rover'", "'generic'", "'others'", "'decoration'", "'{'", "'}'", "'Action'", "'('", "')'", "'return'", "','", "'.'", "'property'", "'range'", "'bool'", "'int'", "'string'", "'real'", "'-'", "'Object'", "'override'", "'config'", "'='", "'Env'", "'Focus'", "':('", "'Author'", "'Purpose'", "'Instance'", "'Channel'", "'direction'", "'type'", "'assign'", "'in'", "'out'", "'inout'", "'load'", "'map'", "'from'", "'qname'", "'area'", "'port'", "'TCP'", "'IPC'", "'or'", "'and'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+'", "'*'", "'/'", "'%'", "'!'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalUnityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUnity.g"; }



     	private UnityGrammarAccess grammarAccess;

        public InternalUnityParser(TokenStream input, UnityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Specification";
       	}

       	@Override
       	protected UnityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpecification"
    // InternalUnity.g:64:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalUnity.g:64:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalUnity.g:65:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalUnity.g:71:1: ruleSpecification returns [EObject current=null] : ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )* ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_spec_0_1 = null;

        EObject lv_spec_0_2 = null;

        EObject lv_spec_0_3 = null;



        	enterRule();

        try {
            // InternalUnity.g:77:2: ( ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )* )
            // InternalUnity.g:78:2: ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )*
            {
            // InternalUnity.g:78:2: ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==35||LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUnity.g:79:3: ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) )
            	    {
            	    // InternalUnity.g:79:3: ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) )
            	    // InternalUnity.g:80:4: (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV )
            	    {
            	    // InternalUnity.g:80:4: (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalUnity.g:81:5: lv_spec_0_1= ruleUnityObject
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSpecificationAccess().getSpecUnityObjectParserRuleCall_0_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_spec_0_1=ruleUnityObject();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	              					}
            	              					add(
            	              						current,
            	              						"spec",
            	              						lv_spec_0_1,
            	              						"cs.queensu.ca.Unity.UnityObject");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:97:5: lv_spec_0_2= ruleMetaObject
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSpecificationAccess().getSpecMetaObjectParserRuleCall_0_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_spec_0_2=ruleMetaObject();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	              					}
            	              					add(
            	              						current,
            	              						"spec",
            	              						lv_spec_0_2,
            	              						"cs.queensu.ca.Unity.MetaObject");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:113:5: lv_spec_0_3= ruleENV
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSpecificationAccess().getSpecENVParserRuleCall_0_2());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_spec_0_3=ruleENV();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	              					}
            	              					add(
            	              						current,
            	              						"spec",
            	              						lv_spec_0_3,
            	              						"cs.queensu.ca.Unity.ENV");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleMetaObject"
    // InternalUnity.g:134:1: entryRuleMetaObject returns [EObject current=null] : iv_ruleMetaObject= ruleMetaObject EOF ;
    public final EObject entryRuleMetaObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaObject = null;


        try {
            // InternalUnity.g:134:51: (iv_ruleMetaObject= ruleMetaObject EOF )
            // InternalUnity.g:135:2: iv_ruleMetaObject= ruleMetaObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaObject=ruleMetaObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaObject"


    // $ANTLR start "ruleMetaObject"
    // InternalUnity.g:141:1: ruleMetaObject returns [EObject current=null] : (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleMetaObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_kind_3_1=null;
        Token lv_kind_3_2=null;
        Token lv_kind_3_3=null;
        Token lv_kind_3_4=null;
        Token lv_kind_3_5=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_properties_5_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:147:2: ( (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' ) )
            // InternalUnity.g:148:2: (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' )
            {
            // InternalUnity.g:148:2: (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' )
            // InternalUnity.g:149:3: otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMetaObjectAccess().getMetaObjectKeyword_0());
              		
            }
            // InternalUnity.g:153:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:154:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:154:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:155:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMetaObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMetaObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMetaObjectAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:175:3: ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) ) )
            // InternalUnity.g:176:4: ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) )
            {
            // InternalUnity.g:176:4: ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' ) )
            // InternalUnity.g:177:5: (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' )
            {
            // InternalUnity.g:177:5: (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' | lv_kind_3_5= 'decoration' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUnity.g:178:6: lv_kind_3_1= 'car'
                    {
                    lv_kind_3_1=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_1, grammarAccess.getMetaObjectAccess().getKindCarKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:189:6: lv_kind_3_2= 'rover'
                    {
                    lv_kind_3_2=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_2, grammarAccess.getMetaObjectAccess().getKindRoverKeyword_3_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:200:6: lv_kind_3_3= 'generic'
                    {
                    lv_kind_3_3=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_3, grammarAccess.getMetaObjectAccess().getKindGenericKeyword_3_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalUnity.g:211:6: lv_kind_3_4= 'others'
                    {
                    lv_kind_3_4=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_4, grammarAccess.getMetaObjectAccess().getKindOthersKeyword_3_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalUnity.g:222:6: lv_kind_3_5= 'decoration'
                    {
                    lv_kind_3_5=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_5, grammarAccess.getMetaObjectAccess().getKindDecorationKeyword_3_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_5, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMetaObjectAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUnity.g:239:3: ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }
                else if ( (LA4_0==22) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUnity.g:240:4: ( (lv_properties_5_0= ruleAttribute ) )
            	    {
            	    // InternalUnity.g:240:4: ( (lv_properties_5_0= ruleAttribute ) )
            	    // InternalUnity.g:241:5: (lv_properties_5_0= ruleAttribute )
            	    {
            	    // InternalUnity.g:241:5: (lv_properties_5_0= ruleAttribute )
            	    // InternalUnity.g:242:6: lv_properties_5_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMetaObjectAccess().getPropertiesAttributeParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_properties_5_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMetaObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_5_0,
            	      							"cs.queensu.ca.Unity.Attribute");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnity.g:260:4: ( (lv_actions_6_0= ruleAction ) )
            	    {
            	    // InternalUnity.g:260:4: ( (lv_actions_6_0= ruleAction ) )
            	    // InternalUnity.g:261:5: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalUnity.g:261:5: (lv_actions_6_0= ruleAction )
            	    // InternalUnity.g:262:6: lv_actions_6_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMetaObjectAccess().getActionsActionParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_actions_6_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMetaObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actions",
            	      							lv_actions_6_0,
            	      							"cs.queensu.ca.Unity.Action");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMetaObjectAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMetaObject"


    // $ANTLR start "entryRuleAction"
    // InternalUnity.g:288:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalUnity.g:288:47: (iv_ruleAction= ruleAction EOF )
            // InternalUnity.g:289:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalUnity.g:295:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* ( (lv_description_11_0= rulePurpose ) )? otherlv_12= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_payload_3_0 = null;

        EObject lv_returnPayload_7_0 = null;

        EObject lv_expressions_10_0 = null;

        EObject lv_description_11_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:301:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* ( (lv_description_11_0= rulePurpose ) )? otherlv_12= '}' ) )
            // InternalUnity.g:302:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* ( (lv_description_11_0= rulePurpose ) )? otherlv_12= '}' )
            {
            // InternalUnity.g:302:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* ( (lv_description_11_0= rulePurpose ) )? otherlv_12= '}' )
            // InternalUnity.g:303:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* ( (lv_description_11_0= rulePurpose ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
              		
            }
            // InternalUnity.g:307:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:308:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:308:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:309:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUnity.g:329:3: ( (lv_payload_3_0= rulePayload ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnity.g:330:4: (lv_payload_3_0= rulePayload )
                    {
                    // InternalUnity.g:330:4: (lv_payload_3_0= rulePayload )
                    // InternalUnity.g:331:5: lv_payload_3_0= rulePayload
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActionAccess().getPayloadPayloadParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_payload_3_0=rulePayload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActionRule());
                      					}
                      					set(
                      						current,
                      						"payload",
                      						lv_payload_3_0,
                      						"cs.queensu.ca.Unity.Payload");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalUnity.g:352:3: (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' )
            // InternalUnity.g:353:4: otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')'
            {
            otherlv_5=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getReturnKeyword_5_0());
              			
            }
            otherlv_6=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getLeftParenthesisKeyword_5_1());
              			
            }
            // InternalUnity.g:361:4: ( (lv_returnPayload_7_0= rulePayload ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUnity.g:362:5: (lv_returnPayload_7_0= rulePayload )
                    {
                    // InternalUnity.g:362:5: (lv_returnPayload_7_0= rulePayload )
                    // InternalUnity.g:363:6: lv_returnPayload_7_0= rulePayload
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActionAccess().getReturnPayloadPayloadParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_returnPayload_7_0=rulePayload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActionRule());
                      						}
                      						set(
                      							current,
                      							"returnPayload",
                      							lv_returnPayload_7_0,
                      							"cs.queensu.ca.Unity.Payload");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getRightParenthesisKeyword_5_3());
              			
            }

            }

            otherlv_9=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalUnity.g:389:3: ( (lv_expressions_10_0= ruleExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_BOOLEAN)||LA7_0==23||LA7_0==34||LA7_0==72) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUnity.g:390:4: (lv_expressions_10_0= ruleExpression )
            	    {
            	    // InternalUnity.g:390:4: (lv_expressions_10_0= ruleExpression )
            	    // InternalUnity.g:391:5: lv_expressions_10_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getActionAccess().getExpressionsExpressionParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_expressions_10_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getActionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_10_0,
            	      						"cs.queensu.ca.Unity.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalUnity.g:408:3: ( (lv_description_11_0= rulePurpose ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==43) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUnity.g:409:4: (lv_description_11_0= rulePurpose )
                    {
                    // InternalUnity.g:409:4: (lv_description_11_0= rulePurpose )
                    // InternalUnity.g:410:5: lv_description_11_0= rulePurpose
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActionAccess().getDescriptionPurposeParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_description_11_0=rulePurpose();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_11_0,
                      						"cs.queensu.ca.Unity.Purpose");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePayload"
    // InternalUnity.g:435:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalUnity.g:435:48: (iv_rulePayload= rulePayload EOF )
            // InternalUnity.g:436:2: iv_rulePayload= rulePayload EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPayloadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePayload=rulePayload();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePayload; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePayload"


    // $ANTLR start "rulePayload"
    // InternalUnity.g:442:1: rulePayload returns [EObject current=null] : ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:448:2: ( ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* ) )
            // InternalUnity.g:449:2: ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* )
            {
            // InternalUnity.g:449:2: ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* )
            // InternalUnity.g:450:3: ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )*
            {
            // InternalUnity.g:450:3: ( (lv_params_0_0= ruleParam ) )
            // InternalUnity.g:451:4: (lv_params_0_0= ruleParam )
            {
            // InternalUnity.g:451:4: (lv_params_0_0= ruleParam )
            // InternalUnity.g:452:5: lv_params_0_0= ruleParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPayloadAccess().getParamsParamParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_params_0_0=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPayloadRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_0_0,
              						"cs.queensu.ca.Unity.Param");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUnity.g:469:3: (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUnity.g:470:4: otherlv_1= ',' ( (lv_params_2_0= ruleParam ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPayloadAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalUnity.g:474:4: ( (lv_params_2_0= ruleParam ) )
            	    // InternalUnity.g:475:5: (lv_params_2_0= ruleParam )
            	    {
            	    // InternalUnity.g:475:5: (lv_params_2_0= ruleParam )
            	    // InternalUnity.g:476:6: lv_params_2_0= ruleParam
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPayloadAccess().getParamsParamParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_params_2_0=ruleParam();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPayloadRule());
            	      						}
            	      						add(
            	      							current,
            	      							"params",
            	      							lv_params_2_0,
            	      							"cs.queensu.ca.Unity.Param");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePayload"


    // $ANTLR start "entryRuleParam"
    // InternalUnity.g:498:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalUnity.g:498:46: (iv_ruleParam= ruleParam EOF )
            // InternalUnity.g:499:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalUnity.g:505:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:511:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) )
            // InternalUnity.g:512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            {
            // InternalUnity.g:512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            // InternalUnity.g:513:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) )
            {
            // InternalUnity.g:513:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUnity.g:514:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUnity.g:514:4: (lv_name_0_0= RULE_ID )
            // InternalUnity.g:515:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:535:3: ( (lv_type_2_0= ruleVarType ) )
            // InternalUnity.g:536:4: (lv_type_2_0= ruleVarType )
            {
            // InternalUnity.g:536:4: (lv_type_2_0= ruleVarType )
            // InternalUnity.g:537:5: lv_type_2_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamAccess().getTypeVarTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"cs.queensu.ca.Unity.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDotExpression"
    // InternalUnity.g:558:1: entryRuleDotExpression returns [EObject current=null] : iv_ruleDotExpression= ruleDotExpression EOF ;
    public final EObject entryRuleDotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotExpression = null;


        try {
            // InternalUnity.g:558:54: (iv_ruleDotExpression= ruleDotExpression EOF )
            // InternalUnity.g:559:2: iv_ruleDotExpression= ruleDotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDotExpression=ruleDotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalUnity.g:565:1: ruleDotExpression returns [EObject current=null] : (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SingleRef_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:571:2: ( (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalUnity.g:572:2: (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalUnity.g:572:2: (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalUnity.g:573:3: this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDotExpressionAccess().getSingleRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_SingleRef_0=ruleSingleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SingleRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:581:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUnity.g:582:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalUnity.g:582:4: ()
            	    // InternalUnity.g:583:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDotExpressionAccess().getDotExpressionHeadAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:593:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalUnity.g:594:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalUnity.g:594:5: (otherlv_3= RULE_ID )
            	    // InternalUnity.g:595:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDotExpressionRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getDotExpressionAccess().getTailPropertyCrossReference_1_2_0());
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleSingleRef"
    // InternalUnity.g:611:1: entryRuleSingleRef returns [EObject current=null] : iv_ruleSingleRef= ruleSingleRef EOF ;
    public final EObject entryRuleSingleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRef = null;


        try {
            // InternalUnity.g:611:50: (iv_ruleSingleRef= ruleSingleRef EOF )
            // InternalUnity.g:612:2: iv_ruleSingleRef= ruleSingleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleRef=ruleSingleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleRef"


    // $ANTLR start "ruleSingleRef"
    // InternalUnity.g:618:1: ruleSingleRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSingleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUnity.g:624:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUnity.g:625:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUnity.g:625:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalUnity.g:626:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalUnity.g:626:3: ()
            // InternalUnity.g:627:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSingleRefAccess().getSingleRefAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:633:3: ( (otherlv_1= RULE_ID ) )
            // InternalUnity.g:634:4: (otherlv_1= RULE_ID )
            {
            // InternalUnity.g:634:4: (otherlv_1= RULE_ID )
            // InternalUnity.g:635:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleRefRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSingleRefAccess().getSingleRefPropertyCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSingleRef"


    // $ANTLR start "entryRuleProperty"
    // InternalUnity.g:650:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalUnity.g:650:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalUnity.g:651:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalUnity.g:657:1: ruleProperty returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Param_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:663:2: ( (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam ) )
            // InternalUnity.g:664:2: (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam )
            {
            // InternalUnity.g:664:2: (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUnity.g:665:3: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Attribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:674:3: this_Param_1= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getParamParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Param_1=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Param_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // InternalUnity.g:686:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUnity.g:686:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUnity.g:687:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUnity.g:693:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_propertyType_3_0 = null;

        EObject lv_range_5_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:699:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? ) )
            // InternalUnity.g:700:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? )
            {
            // InternalUnity.g:700:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? )
            // InternalUnity.g:701:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getPropertyKeyword_0());
              		
            }
            // InternalUnity.g:705:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:706:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:706:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:707:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:727:3: ( (lv_propertyType_3_0= ruleVarType ) )
            // InternalUnity.g:728:4: (lv_propertyType_3_0= ruleVarType )
            {
            // InternalUnity.g:728:4: (lv_propertyType_3_0= ruleVarType )
            // InternalUnity.g:729:5: lv_propertyType_3_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getPropertyTypeVarTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_propertyType_3_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"propertyType",
              						lv_propertyType_3_0,
              						"cs.queensu.ca.Unity.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUnity.g:746:3: (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUnity.g:747:4: otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getRangeKeyword_4_0());
                      			
                    }
                    // InternalUnity.g:751:4: ( (lv_range_5_0= ruleRange ) )
                    // InternalUnity.g:752:5: (lv_range_5_0= ruleRange )
                    {
                    // InternalUnity.g:752:5: (lv_range_5_0= ruleRange )
                    // InternalUnity.g:753:6: lv_range_5_0= ruleRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getRangeRangeParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_range_5_0=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"range",
                      							lv_range_5_0,
                      							"cs.queensu.ca.Unity.Range");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleVarType"
    // InternalUnity.g:775:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // InternalUnity.g:775:48: (iv_ruleVarType= ruleVarType EOF )
            // InternalUnity.g:776:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalUnity.g:782:1: ruleVarType returns [EObject current=null] : ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalUnity.g:788:2: ( ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) ) )
            // InternalUnity.g:789:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) )
            {
            // InternalUnity.g:789:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) )
            // InternalUnity.g:790:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) )
            {
            // InternalUnity.g:790:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) )
            // InternalUnity.g:791:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' )
            {
            // InternalUnity.g:791:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUnity.g:792:5: lv_name_0_1= 'bool'
                    {
                    lv_name_0_1=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getVarTypeAccess().getNameBoolKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:803:5: lv_name_0_2= 'int'
                    {
                    lv_name_0_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getVarTypeAccess().getNameIntKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:814:5: lv_name_0_3= 'string'
                    {
                    lv_name_0_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getVarTypeAccess().getNameStringKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalUnity.g:825:5: lv_name_0_4= 'real'
                    {
                    lv_name_0_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_4, grammarAccess.getVarTypeAccess().getNameRealKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_4, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleRange"
    // InternalUnity.g:841:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalUnity.g:841:46: (iv_ruleRange= ruleRange EOF )
            // InternalUnity.g:842:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalUnity.g:848:1: ruleRange returns [EObject current=null] : (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:854:2: ( (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // InternalUnity.g:855:2: (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // InternalUnity.g:855:2: (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' )
            // InternalUnity.g:856:3: otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUnity.g:860:3: ( (lv_from_1_0= ruleValue ) )
            // InternalUnity.g:861:4: (lv_from_1_0= ruleValue )
            {
            // InternalUnity.g:861:4: (lv_from_1_0= ruleValue )
            // InternalUnity.g:862:5: lv_from_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getFromValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_from_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_1_0,
              						"cs.queensu.ca.Unity.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalUnity.g:883:3: ( (lv_to_3_0= ruleValue ) )
            // InternalUnity.g:884:4: (lv_to_3_0= ruleValue )
            {
            // InternalUnity.g:884:4: (lv_to_3_0= ruleValue )
            // InternalUnity.g:885:5: lv_to_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getToValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_to_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_3_0,
              						"cs.queensu.ca.Unity.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleValue"
    // InternalUnity.g:910:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalUnity.g:910:46: (iv_ruleValue= ruleValue EOF )
            // InternalUnity.g:911:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalUnity.g:917:1: ruleValue returns [EObject current=null] : ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_minues_0_0=null;
        Token lv_value_1_0=null;
        EObject lv_fixedPointValue_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:923:2: ( ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) ) )
            // InternalUnity.g:924:2: ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) )
            {
            // InternalUnity.g:924:2: ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_REAL) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUnity.g:925:3: ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUnity.g:925:3: ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUnity.g:926:4: ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUnity.g:926:4: ( (lv_minues_0_0= '-' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==34) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalUnity.g:927:5: (lv_minues_0_0= '-' )
                            {
                            // InternalUnity.g:927:5: (lv_minues_0_0= '-' )
                            // InternalUnity.g:928:6: lv_minues_0_0= '-'
                            {
                            lv_minues_0_0=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_minues_0_0, grammarAccess.getValueAccess().getMinuesHyphenMinusKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getValueRule());
                              						}
                              						setWithLastConsumed(current, "minues", true, "-");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalUnity.g:940:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUnity.g:941:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUnity.g:941:5: (lv_value_1_0= RULE_INT )
                    // InternalUnity.g:942:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getValueAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getValueRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnity.g:960:3: ( (lv_fixedPointValue_2_0= ruleRealLiteral ) )
                    {
                    // InternalUnity.g:960:3: ( (lv_fixedPointValue_2_0= ruleRealLiteral ) )
                    // InternalUnity.g:961:4: (lv_fixedPointValue_2_0= ruleRealLiteral )
                    {
                    // InternalUnity.g:961:4: (lv_fixedPointValue_2_0= ruleRealLiteral )
                    // InternalUnity.g:962:5: lv_fixedPointValue_2_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueAccess().getFixedPointValueRealLiteralParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fixedPointValue_2_0=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getValueRule());
                      					}
                      					set(
                      						current,
                      						"fixedPointValue",
                      						lv_fixedPointValue_2_0,
                      						"cs.queensu.ca.Unity.RealLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalUnity.g:983:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalUnity.g:983:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalUnity.g:984:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalUnity.g:990:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_real_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:996:2: ( ( () ( (lv_real_1_0= RULE_REAL ) ) ) )
            // InternalUnity.g:997:2: ( () ( (lv_real_1_0= RULE_REAL ) ) )
            {
            // InternalUnity.g:997:2: ( () ( (lv_real_1_0= RULE_REAL ) ) )
            // InternalUnity.g:998:3: () ( (lv_real_1_0= RULE_REAL ) )
            {
            // InternalUnity.g:998:3: ()
            // InternalUnity.g:999:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:1005:3: ( (lv_real_1_0= RULE_REAL ) )
            // InternalUnity.g:1006:4: (lv_real_1_0= RULE_REAL )
            {
            // InternalUnity.g:1006:4: (lv_real_1_0= RULE_REAL )
            // InternalUnity.g:1007:5: lv_real_1_0= RULE_REAL
            {
            lv_real_1_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_real_1_0, grammarAccess.getRealLiteralAccess().getRealREALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"real",
              						lv_real_1_0,
              						"cs.queensu.ca.Unity.REAL");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleUnityObject"
    // InternalUnity.g:1027:1: entryRuleUnityObject returns [EObject current=null] : iv_ruleUnityObject= ruleUnityObject EOF ;
    public final EObject entryRuleUnityObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnityObject = null;


        try {
            // InternalUnity.g:1027:52: (iv_ruleUnityObject= ruleUnityObject EOF )
            // InternalUnity.g:1028:2: iv_ruleUnityObject= ruleUnityObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnityObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnityObject=ruleUnityObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnityObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnityObject"


    // $ANTLR start "ruleUnityObject"
    // InternalUnity.g:1034:1: ruleUnityObject returns [EObject current=null] : (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleUnityObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_configurations_5_0 = null;

        EObject lv_newActions_6_0 = null;

        EObject lv_overrideActions_7_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1040:2: ( (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' ) )
            // InternalUnity.g:1041:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' )
            {
            // InternalUnity.g:1041:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' )
            // InternalUnity.g:1042:3: otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnityObjectAccess().getObjectKeyword_0());
              		
            }
            // InternalUnity.g:1046:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1047:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1047:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1048:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getUnityObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnityObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnityObjectAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:1068:3: ( (otherlv_3= RULE_ID ) )
            // InternalUnity.g:1069:4: (otherlv_3= RULE_ID )
            {
            // InternalUnity.g:1069:4: (otherlv_3= RULE_ID )
            // InternalUnity.g:1070:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnityObjectRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getUnityObjectAccess().getTypeMetaObjectCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getUnityObjectAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUnity.g:1085:3: ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )*
            loop16:
            do {
                int alt16=5;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt16=1;
                    }
                    break;
                case 22:
                    {
                    alt16=2;
                    }
                    break;
                case 36:
                    {
                    alt16=3;
                    }
                    break;
                case 28:
                    {
                    alt16=4;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalUnity.g:1086:4: ( (lv_configurations_5_0= ruleConfigAssignment ) )
            	    {
            	    // InternalUnity.g:1086:4: ( (lv_configurations_5_0= ruleConfigAssignment ) )
            	    // InternalUnity.g:1087:5: (lv_configurations_5_0= ruleConfigAssignment )
            	    {
            	    // InternalUnity.g:1087:5: (lv_configurations_5_0= ruleConfigAssignment )
            	    // InternalUnity.g:1088:6: lv_configurations_5_0= ruleConfigAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getConfigurationsConfigAssignmentParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_configurations_5_0=ruleConfigAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"configurations",
            	      							lv_configurations_5_0,
            	      							"cs.queensu.ca.Unity.ConfigAssignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnity.g:1106:4: ( (lv_newActions_6_0= ruleAction ) )
            	    {
            	    // InternalUnity.g:1106:4: ( (lv_newActions_6_0= ruleAction ) )
            	    // InternalUnity.g:1107:5: (lv_newActions_6_0= ruleAction )
            	    {
            	    // InternalUnity.g:1107:5: (lv_newActions_6_0= ruleAction )
            	    // InternalUnity.g:1108:6: lv_newActions_6_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getNewActionsActionParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_newActions_6_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"newActions",
            	      							lv_newActions_6_0,
            	      							"cs.queensu.ca.Unity.Action");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnity.g:1126:4: ( (lv_overrideActions_7_0= ruleOverrideAction ) )
            	    {
            	    // InternalUnity.g:1126:4: ( (lv_overrideActions_7_0= ruleOverrideAction ) )
            	    // InternalUnity.g:1127:5: (lv_overrideActions_7_0= ruleOverrideAction )
            	    {
            	    // InternalUnity.g:1127:5: (lv_overrideActions_7_0= ruleOverrideAction )
            	    // InternalUnity.g:1128:6: lv_overrideActions_7_0= ruleOverrideAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getOverrideActionsOverrideActionParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_overrideActions_7_0=ruleOverrideAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"overrideActions",
            	      							lv_overrideActions_7_0,
            	      							"cs.queensu.ca.Unity.OverrideAction");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnity.g:1146:4: ( (lv_properties_8_0= ruleAttribute ) )
            	    {
            	    // InternalUnity.g:1146:4: ( (lv_properties_8_0= ruleAttribute ) )
            	    // InternalUnity.g:1147:5: (lv_properties_8_0= ruleAttribute )
            	    {
            	    // InternalUnity.g:1147:5: (lv_properties_8_0= ruleAttribute )
            	    // InternalUnity.g:1148:6: lv_properties_8_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getPropertiesAttributeParserRuleCall_5_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_properties_8_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_8_0,
            	      							"cs.queensu.ca.Unity.Attribute");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getUnityObjectAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnityObject"


    // $ANTLR start "entryRuleOverrideAction"
    // InternalUnity.g:1174:1: entryRuleOverrideAction returns [EObject current=null] : iv_ruleOverrideAction= ruleOverrideAction EOF ;
    public final EObject entryRuleOverrideAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideAction = null;


        try {
            // InternalUnity.g:1174:55: (iv_ruleOverrideAction= ruleOverrideAction EOF )
            // InternalUnity.g:1175:2: iv_ruleOverrideAction= ruleOverrideAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverrideActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOverrideAction=ruleOverrideAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverrideAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOverrideAction"


    // $ANTLR start "ruleOverrideAction"
    // InternalUnity.g:1181:1: ruleOverrideAction returns [EObject current=null] : (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' ) ;
    public final EObject ruleOverrideAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1187:2: ( (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' ) )
            // InternalUnity.g:1188:2: (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' )
            {
            // InternalUnity.g:1188:2: (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' )
            // InternalUnity.g:1189:3: otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOverrideActionAccess().getOverrideKeyword_0());
              		
            }
            // InternalUnity.g:1193:3: ( (otherlv_1= RULE_ID ) )
            // InternalUnity.g:1194:4: (otherlv_1= RULE_ID )
            {
            // InternalUnity.g:1194:4: (otherlv_1= RULE_ID )
            // InternalUnity.g:1195:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOverrideActionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getOverrideActionAccess().getActionNameActionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOverrideActionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUnity.g:1210:3: ( (lv_expressions_3_0= ruleExpression ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_BOOLEAN)||LA17_0==23||LA17_0==34||LA17_0==72) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUnity.g:1211:4: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // InternalUnity.g:1211:4: (lv_expressions_3_0= ruleExpression )
            	    // InternalUnity.g:1212:5: lv_expressions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOverrideActionAccess().getExpressionsExpressionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOverrideActionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_3_0,
            	      						"cs.queensu.ca.Unity.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOverrideActionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOverrideAction"


    // $ANTLR start "entryRuleConfigAssignment"
    // InternalUnity.g:1237:1: entryRuleConfigAssignment returns [EObject current=null] : iv_ruleConfigAssignment= ruleConfigAssignment EOF ;
    public final EObject entryRuleConfigAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigAssignment = null;


        try {
            // InternalUnity.g:1237:57: (iv_ruleConfigAssignment= ruleConfigAssignment EOF )
            // InternalUnity.g:1238:2: iv_ruleConfigAssignment= ruleConfigAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigAssignment=ruleConfigAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigAssignment"


    // $ANTLR start "ruleConfigAssignment"
    // InternalUnity.g:1244:1: ruleConfigAssignment returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' ) ;
    public final EObject ruleConfigAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_configs_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1250:2: ( (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' ) )
            // InternalUnity.g:1251:2: (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' )
            {
            // InternalUnity.g:1251:2: (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' )
            // InternalUnity.g:1252:3: otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigAssignmentAccess().getConfigKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigAssignmentAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUnity.g:1260:3: ()
            // InternalUnity.g:1261:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigAssignmentAccess().getConfigAssignmentAction_2(),
              					current);
              			
            }

            }

            // InternalUnity.g:1267:3: ( (lv_configs_3_0= ruleConfig ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUnity.g:1268:4: (lv_configs_3_0= ruleConfig )
            	    {
            	    // InternalUnity.g:1268:4: (lv_configs_3_0= ruleConfig )
            	    // InternalUnity.g:1269:5: lv_configs_3_0= ruleConfig
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConfigAssignmentAccess().getConfigsConfigParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_configs_3_0=ruleConfig();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConfigAssignmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"configs",
            	      						lv_configs_3_0,
            	      						"cs.queensu.ca.Unity.Config");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConfigAssignmentAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigAssignment"


    // $ANTLR start "entryRuleConfig"
    // InternalUnity.g:1294:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalUnity.g:1294:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalUnity.g:1295:2: iv_ruleConfig= ruleConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfig; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalUnity.g:1301:1: ruleConfig returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_propertyValue_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1307:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) ) )
            // InternalUnity.g:1308:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) )
            {
            // InternalUnity.g:1308:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) )
            // InternalUnity.g:1309:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) )
            {
            // InternalUnity.g:1309:3: ( (otherlv_0= RULE_ID ) )
            // InternalUnity.g:1310:4: (otherlv_0= RULE_ID )
            {
            // InternalUnity.g:1310:4: (otherlv_0= RULE_ID )
            // InternalUnity.g:1311:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getPropertyNameAttributeCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalUnity.g:1326:3: ( (lv_propertyValue_2_0= ruleExpression ) )
            // InternalUnity.g:1327:4: (lv_propertyValue_2_0= ruleExpression )
            {
            // InternalUnity.g:1327:4: (lv_propertyValue_2_0= ruleExpression )
            // InternalUnity.g:1328:5: lv_propertyValue_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigAccess().getPropertyValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_propertyValue_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigRule());
              					}
              					set(
              						current,
              						"propertyValue",
              						lv_propertyValue_2_0,
              						"cs.queensu.ca.Unity.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleENV"
    // InternalUnity.g:1349:1: entryRuleENV returns [EObject current=null] : iv_ruleENV= ruleENV EOF ;
    public final EObject entryRuleENV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENV = null;


        try {
            // InternalUnity.g:1349:44: (iv_ruleENV= ruleENV EOF )
            // InternalUnity.g:1350:2: iv_ruleENV= ruleENV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENVRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleENV=ruleENV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENV; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleENV"


    // $ANTLR start "ruleENV"
    // InternalUnity.g:1356:1: ruleENV returns [EObject current=null] : (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? ( (lv_focus_8_0= ruleFocus ) ) ( (lv_author_9_0= ruleAuthor ) )? ( (lv_purpose_10_0= rulePurpose ) )? otherlv_11= '}' ) ;
    public final EObject ruleENV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_11=null;
        EObject lv_channels_3_0 = null;

        EObject lv_maps_4_0 = null;

        EObject lv_instances_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_initCodes_7_0 = null;

        EObject lv_focus_8_0 = null;

        EObject lv_author_9_0 = null;

        EObject lv_purpose_10_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1362:2: ( (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? ( (lv_focus_8_0= ruleFocus ) ) ( (lv_author_9_0= ruleAuthor ) )? ( (lv_purpose_10_0= rulePurpose ) )? otherlv_11= '}' ) )
            // InternalUnity.g:1363:2: (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? ( (lv_focus_8_0= ruleFocus ) ) ( (lv_author_9_0= ruleAuthor ) )? ( (lv_purpose_10_0= rulePurpose ) )? otherlv_11= '}' )
            {
            // InternalUnity.g:1363:2: (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? ( (lv_focus_8_0= ruleFocus ) ) ( (lv_author_9_0= ruleAuthor ) )? ( (lv_purpose_10_0= rulePurpose ) )? otherlv_11= '}' )
            // InternalUnity.g:1364:3: otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? ( (lv_focus_8_0= ruleFocus ) ) ( (lv_author_9_0= ruleAuthor ) )? ( (lv_purpose_10_0= rulePurpose ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getENVAccess().getEnvKeyword_0());
              		
            }
            // InternalUnity.g:1368:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1369:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1369:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1370:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getENVAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getENVRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getENVAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUnity.g:1390:3: ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )*
            loop19:
            do {
                int alt19=5;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    alt19=1;
                    }
                    break;
                case 52:
                    {
                    alt19=2;
                    }
                    break;
                case 44:
                    {
                    alt19=3;
                    }
                    break;
                case RULE_ID:
                case 28:
                    {
                    alt19=4;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalUnity.g:1391:4: ( (lv_channels_3_0= ruleChannel ) )
            	    {
            	    // InternalUnity.g:1391:4: ( (lv_channels_3_0= ruleChannel ) )
            	    // InternalUnity.g:1392:5: (lv_channels_3_0= ruleChannel )
            	    {
            	    // InternalUnity.g:1392:5: (lv_channels_3_0= ruleChannel )
            	    // InternalUnity.g:1393:6: lv_channels_3_0= ruleChannel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getChannelsChannelParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_channels_3_0=ruleChannel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"channels",
            	      							lv_channels_3_0,
            	      							"cs.queensu.ca.Unity.Channel");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnity.g:1411:4: ( (lv_maps_4_0= ruleMap ) )
            	    {
            	    // InternalUnity.g:1411:4: ( (lv_maps_4_0= ruleMap ) )
            	    // InternalUnity.g:1412:5: (lv_maps_4_0= ruleMap )
            	    {
            	    // InternalUnity.g:1412:5: (lv_maps_4_0= ruleMap )
            	    // InternalUnity.g:1413:6: lv_maps_4_0= ruleMap
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getMapsMapParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_maps_4_0=ruleMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"maps",
            	      							lv_maps_4_0,
            	      							"cs.queensu.ca.Unity.Map");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnity.g:1431:4: ( (lv_instances_5_0= ruleInstance ) )
            	    {
            	    // InternalUnity.g:1431:4: ( (lv_instances_5_0= ruleInstance ) )
            	    // InternalUnity.g:1432:5: (lv_instances_5_0= ruleInstance )
            	    {
            	    // InternalUnity.g:1432:5: (lv_instances_5_0= ruleInstance )
            	    // InternalUnity.g:1433:6: lv_instances_5_0= ruleInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getInstancesInstanceParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_instances_5_0=ruleInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"instances",
            	      							lv_instances_5_0,
            	      							"cs.queensu.ca.Unity.Instance");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnity.g:1451:4: ( (lv_properties_6_0= ruleProperty ) )
            	    {
            	    // InternalUnity.g:1451:4: ( (lv_properties_6_0= ruleProperty ) )
            	    // InternalUnity.g:1452:5: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalUnity.g:1452:5: (lv_properties_6_0= ruleProperty )
            	    // InternalUnity.g:1453:6: lv_properties_6_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getPropertiesPropertyParserRuleCall_3_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_6_0,
            	      							"cs.queensu.ca.Unity.Property");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalUnity.g:1471:3: ( (lv_initCodes_7_0= ruleInit ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUnity.g:1472:4: (lv_initCodes_7_0= ruleInit )
                    {
                    // InternalUnity.g:1472:4: (lv_initCodes_7_0= ruleInit )
                    // InternalUnity.g:1473:5: lv_initCodes_7_0= ruleInit
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getENVAccess().getInitCodesInitParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    lv_initCodes_7_0=ruleInit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getENVRule());
                      					}
                      					set(
                      						current,
                      						"initCodes",
                      						lv_initCodes_7_0,
                      						"cs.queensu.ca.Unity.Init");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUnity.g:1490:3: ( (lv_focus_8_0= ruleFocus ) )
            // InternalUnity.g:1491:4: (lv_focus_8_0= ruleFocus )
            {
            // InternalUnity.g:1491:4: (lv_focus_8_0= ruleFocus )
            // InternalUnity.g:1492:5: lv_focus_8_0= ruleFocus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getENVAccess().getFocusFocusParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_focus_8_0=ruleFocus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getENVRule());
              					}
              					set(
              						current,
              						"focus",
              						lv_focus_8_0,
              						"cs.queensu.ca.Unity.Focus");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUnity.g:1509:3: ( (lv_author_9_0= ruleAuthor ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUnity.g:1510:4: (lv_author_9_0= ruleAuthor )
                    {
                    // InternalUnity.g:1510:4: (lv_author_9_0= ruleAuthor )
                    // InternalUnity.g:1511:5: lv_author_9_0= ruleAuthor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getENVAccess().getAuthorAuthorParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
                    lv_author_9_0=ruleAuthor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getENVRule());
                      					}
                      					set(
                      						current,
                      						"author",
                      						lv_author_9_0,
                      						"cs.queensu.ca.Unity.Author");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUnity.g:1528:3: ( (lv_purpose_10_0= rulePurpose ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUnity.g:1529:4: (lv_purpose_10_0= rulePurpose )
                    {
                    // InternalUnity.g:1529:4: (lv_purpose_10_0= rulePurpose )
                    // InternalUnity.g:1530:5: lv_purpose_10_0= rulePurpose
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getENVAccess().getPurposePurposeParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_purpose_10_0=rulePurpose();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getENVRule());
                      					}
                      					set(
                      						current,
                      						"purpose",
                      						lv_purpose_10_0,
                      						"cs.queensu.ca.Unity.Purpose");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getENVAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleENV"


    // $ANTLR start "entryRuleFocus"
    // InternalUnity.g:1555:1: entryRuleFocus returns [EObject current=null] : iv_ruleFocus= ruleFocus EOF ;
    public final EObject entryRuleFocus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFocus = null;


        try {
            // InternalUnity.g:1555:46: (iv_ruleFocus= ruleFocus EOF )
            // InternalUnity.g:1556:2: iv_ruleFocus= ruleFocus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFocusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFocus=ruleFocus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFocus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFocus"


    // $ANTLR start "ruleFocus"
    // InternalUnity.g:1562:1: ruleFocus returns [EObject current=null] : (otherlv_0= 'Focus' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':(' ( (lv_dx_4_0= RULE_REAL ) ) otherlv_5= ',' ( (lv_dy_6_0= RULE_REAL ) ) otherlv_7= ',' ( (lv_dz_8_0= RULE_REAL ) ) otherlv_9= ')' )? ) ;
    public final EObject ruleFocus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_dx_4_0=null;
        Token otherlv_5=null;
        Token lv_dy_6_0=null;
        Token otherlv_7=null;
        Token lv_dz_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalUnity.g:1568:2: ( (otherlv_0= 'Focus' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':(' ( (lv_dx_4_0= RULE_REAL ) ) otherlv_5= ',' ( (lv_dy_6_0= RULE_REAL ) ) otherlv_7= ',' ( (lv_dz_8_0= RULE_REAL ) ) otherlv_9= ')' )? ) )
            // InternalUnity.g:1569:2: (otherlv_0= 'Focus' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':(' ( (lv_dx_4_0= RULE_REAL ) ) otherlv_5= ',' ( (lv_dy_6_0= RULE_REAL ) ) otherlv_7= ',' ( (lv_dz_8_0= RULE_REAL ) ) otherlv_9= ')' )? )
            {
            // InternalUnity.g:1569:2: (otherlv_0= 'Focus' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':(' ( (lv_dx_4_0= RULE_REAL ) ) otherlv_5= ',' ( (lv_dy_6_0= RULE_REAL ) ) otherlv_7= ',' ( (lv_dz_8_0= RULE_REAL ) ) otherlv_9= ')' )? )
            // InternalUnity.g:1570:3: otherlv_0= 'Focus' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':(' ( (lv_dx_4_0= RULE_REAL ) ) otherlv_5= ',' ( (lv_dy_6_0= RULE_REAL ) ) otherlv_7= ',' ( (lv_dz_8_0= RULE_REAL ) ) otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFocusAccess().getFocusKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFocusAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1578:3: ( (otherlv_2= RULE_ID ) )
            // InternalUnity.g:1579:4: (otherlv_2= RULE_ID )
            {
            // InternalUnity.g:1579:4: (otherlv_2= RULE_ID )
            // InternalUnity.g:1580:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFocusRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getFocusAccess().getFocusObjectInstanceCrossReference_2_0());
              				
            }

            }


            }

            // InternalUnity.g:1591:3: (otherlv_3= ':(' ( (lv_dx_4_0= RULE_REAL ) ) otherlv_5= ',' ( (lv_dy_6_0= RULE_REAL ) ) otherlv_7= ',' ( (lv_dz_8_0= RULE_REAL ) ) otherlv_9= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUnity.g:1592:4: otherlv_3= ':(' ( (lv_dx_4_0= RULE_REAL ) ) otherlv_5= ',' ( (lv_dy_6_0= RULE_REAL ) ) otherlv_7= ',' ( (lv_dz_8_0= RULE_REAL ) ) otherlv_9= ')'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFocusAccess().getColonLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalUnity.g:1596:4: ( (lv_dx_4_0= RULE_REAL ) )
                    // InternalUnity.g:1597:5: (lv_dx_4_0= RULE_REAL )
                    {
                    // InternalUnity.g:1597:5: (lv_dx_4_0= RULE_REAL )
                    // InternalUnity.g:1598:6: lv_dx_4_0= RULE_REAL
                    {
                    lv_dx_4_0=(Token)match(input,RULE_REAL,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_dx_4_0, grammarAccess.getFocusAccess().getDxREALTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFocusRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"dx",
                      							lv_dx_4_0,
                      							"cs.queensu.ca.Unity.REAL");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFocusAccess().getCommaKeyword_3_2());
                      			
                    }
                    // InternalUnity.g:1618:4: ( (lv_dy_6_0= RULE_REAL ) )
                    // InternalUnity.g:1619:5: (lv_dy_6_0= RULE_REAL )
                    {
                    // InternalUnity.g:1619:5: (lv_dy_6_0= RULE_REAL )
                    // InternalUnity.g:1620:6: lv_dy_6_0= RULE_REAL
                    {
                    lv_dy_6_0=(Token)match(input,RULE_REAL,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_dy_6_0, grammarAccess.getFocusAccess().getDyREALTerminalRuleCall_3_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFocusRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"dy",
                      							lv_dy_6_0,
                      							"cs.queensu.ca.Unity.REAL");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFocusAccess().getCommaKeyword_3_4());
                      			
                    }
                    // InternalUnity.g:1640:4: ( (lv_dz_8_0= RULE_REAL ) )
                    // InternalUnity.g:1641:5: (lv_dz_8_0= RULE_REAL )
                    {
                    // InternalUnity.g:1641:5: (lv_dz_8_0= RULE_REAL )
                    // InternalUnity.g:1642:6: lv_dz_8_0= RULE_REAL
                    {
                    lv_dz_8_0=(Token)match(input,RULE_REAL,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_dz_8_0, grammarAccess.getFocusAccess().getDzREALTerminalRuleCall_3_5_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFocusRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"dz",
                      							lv_dz_8_0,
                      							"cs.queensu.ca.Unity.REAL");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFocusAccess().getRightParenthesisKeyword_3_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFocus"


    // $ANTLR start "entryRuleAuthor"
    // InternalUnity.g:1667:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // InternalUnity.g:1667:47: (iv_ruleAuthor= ruleAuthor EOF )
            // InternalUnity.g:1668:2: iv_ruleAuthor= ruleAuthor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuthorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAuthor=ruleAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAuthor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // InternalUnity.g:1674:1: ruleAuthor returns [EObject current=null] : (otherlv_0= 'Author' otherlv_1= ':' ( (lv_authorString_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_authorString_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1680:2: ( (otherlv_0= 'Author' otherlv_1= ':' ( (lv_authorString_2_0= RULE_STRING ) ) ) )
            // InternalUnity.g:1681:2: (otherlv_0= 'Author' otherlv_1= ':' ( (lv_authorString_2_0= RULE_STRING ) ) )
            {
            // InternalUnity.g:1681:2: (otherlv_0= 'Author' otherlv_1= ':' ( (lv_authorString_2_0= RULE_STRING ) ) )
            // InternalUnity.g:1682:3: otherlv_0= 'Author' otherlv_1= ':' ( (lv_authorString_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAuthorAccess().getAuthorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAuthorAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1690:3: ( (lv_authorString_2_0= RULE_STRING ) )
            // InternalUnity.g:1691:4: (lv_authorString_2_0= RULE_STRING )
            {
            // InternalUnity.g:1691:4: (lv_authorString_2_0= RULE_STRING )
            // InternalUnity.g:1692:5: lv_authorString_2_0= RULE_STRING
            {
            lv_authorString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_authorString_2_0, grammarAccess.getAuthorAccess().getAuthorStringSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAuthorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"authorString",
              						lv_authorString_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRulePurpose"
    // InternalUnity.g:1712:1: entryRulePurpose returns [EObject current=null] : iv_rulePurpose= rulePurpose EOF ;
    public final EObject entryRulePurpose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePurpose = null;


        try {
            // InternalUnity.g:1712:48: (iv_rulePurpose= rulePurpose EOF )
            // InternalUnity.g:1713:2: iv_rulePurpose= rulePurpose EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPurposeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePurpose=rulePurpose();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePurpose; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePurpose"


    // $ANTLR start "rulePurpose"
    // InternalUnity.g:1719:1: rulePurpose returns [EObject current=null] : (otherlv_0= 'Purpose' otherlv_1= ':' ( (lv_purposeString_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePurpose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_purposeString_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1725:2: ( (otherlv_0= 'Purpose' otherlv_1= ':' ( (lv_purposeString_2_0= RULE_STRING ) ) ) )
            // InternalUnity.g:1726:2: (otherlv_0= 'Purpose' otherlv_1= ':' ( (lv_purposeString_2_0= RULE_STRING ) ) )
            {
            // InternalUnity.g:1726:2: (otherlv_0= 'Purpose' otherlv_1= ':' ( (lv_purposeString_2_0= RULE_STRING ) ) )
            // InternalUnity.g:1727:3: otherlv_0= 'Purpose' otherlv_1= ':' ( (lv_purposeString_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPurposeAccess().getPurposeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPurposeAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1735:3: ( (lv_purposeString_2_0= RULE_STRING ) )
            // InternalUnity.g:1736:4: (lv_purposeString_2_0= RULE_STRING )
            {
            // InternalUnity.g:1736:4: (lv_purposeString_2_0= RULE_STRING )
            // InternalUnity.g:1737:5: lv_purposeString_2_0= RULE_STRING
            {
            lv_purposeString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_purposeString_2_0, grammarAccess.getPurposeAccess().getPurposeStringSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPurposeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"purposeString",
              						lv_purposeString_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePurpose"


    // $ANTLR start "entryRuleInstance"
    // InternalUnity.g:1757:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalUnity.g:1757:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalUnity.g:1758:2: iv_ruleInstance= ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalUnity.g:1764:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUnity.g:1770:2: ( (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalUnity.g:1771:2: (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalUnity.g:1771:2: (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalUnity.g:1772:3: otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
              		
            }
            // InternalUnity.g:1776:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1777:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1777:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1778:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:1798:3: ( (otherlv_3= RULE_ID ) )
            // InternalUnity.g:1799:4: (otherlv_3= RULE_ID )
            {
            // InternalUnity.g:1799:4: (otherlv_3= RULE_ID )
            // InternalUnity.g:1800:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getInstanceTypeUnityObjectCrossReference_3_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleChannel"
    // InternalUnity.g:1815:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalUnity.g:1815:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalUnity.g:1816:2: iv_ruleChannel= ruleChannel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalUnity.g:1822:1: ruleChannel returns [EObject current=null] : (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_direction_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_port_7_0 = null;

        EObject lv_areaname_8_0 = null;

        EObject lv_qname_10_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1828:2: ( (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? ) )
            // InternalUnity.g:1829:2: (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? )
            {
            // InternalUnity.g:1829:2: (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? )
            // InternalUnity.g:1830:3: otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
              		
            }
            // InternalUnity.g:1834:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1835:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1835:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1836:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChannelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUnity.g:1852:3: (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUnity.g:1853:4: otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) )
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getDirectionKeyword_2_0());
                      			
                    }
                    // InternalUnity.g:1857:4: ( (lv_direction_3_0= ruleDirection ) )
                    // InternalUnity.g:1858:5: (lv_direction_3_0= ruleDirection )
                    {
                    // InternalUnity.g:1858:5: (lv_direction_3_0= ruleDirection )
                    // InternalUnity.g:1859:6: lv_direction_3_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getDirectionDirectionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_direction_3_0=ruleDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getChannelRule());
                      						}
                      						set(
                      							current,
                      							"direction",
                      							lv_direction_3_0,
                      							"cs.queensu.ca.Unity.Direction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalUnity.g:1877:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUnity.g:1878:4: otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getChannelAccess().getTypeKeyword_3_0());
                      			
                    }
                    // InternalUnity.g:1882:4: ( (lv_type_5_0= ruleinterfaceType ) )
                    // InternalUnity.g:1883:5: (lv_type_5_0= ruleinterfaceType )
                    {
                    // InternalUnity.g:1883:5: (lv_type_5_0= ruleinterfaceType )
                    // InternalUnity.g:1884:6: lv_type_5_0= ruleinterfaceType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getTypeInterfaceTypeParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_type_5_0=ruleinterfaceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getChannelRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_5_0,
                      							"cs.queensu.ca.Unity.interfaceType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getChannelAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalUnity.g:1906:3: ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            else if ( (LA26_0==56) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUnity.g:1907:4: ( (lv_port_7_0= rulePort ) )
                    {
                    // InternalUnity.g:1907:4: ( (lv_port_7_0= rulePort ) )
                    // InternalUnity.g:1908:5: (lv_port_7_0= rulePort )
                    {
                    // InternalUnity.g:1908:5: (lv_port_7_0= rulePort )
                    // InternalUnity.g:1909:6: lv_port_7_0= rulePort
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getPortPortParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_port_7_0=rulePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getChannelRule());
                      						}
                      						set(
                      							current,
                      							"port",
                      							lv_port_7_0,
                      							"cs.queensu.ca.Unity.Port");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnity.g:1927:4: ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) )
                    {
                    // InternalUnity.g:1927:4: ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) )
                    // InternalUnity.g:1928:5: ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) )
                    {
                    // InternalUnity.g:1928:5: ( (lv_areaname_8_0= ruleAreaName ) )
                    // InternalUnity.g:1929:6: (lv_areaname_8_0= ruleAreaName )
                    {
                    // InternalUnity.g:1929:6: (lv_areaname_8_0= ruleAreaName )
                    // InternalUnity.g:1930:7: lv_areaname_8_0= ruleAreaName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getChannelAccess().getAreanameAreaNameParserRuleCall_5_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
                    lv_areaname_8_0=ruleAreaName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getChannelRule());
                      							}
                      							set(
                      								current,
                      								"areaname",
                      								lv_areaname_8_0,
                      								"cs.queensu.ca.Unity.AreaName");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getChannelAccess().getCommaKeyword_5_1_1());
                      				
                    }
                    // InternalUnity.g:1951:5: ( (lv_qname_10_0= ruleQName ) )
                    // InternalUnity.g:1952:6: (lv_qname_10_0= ruleQName )
                    {
                    // InternalUnity.g:1952:6: (lv_qname_10_0= ruleQName )
                    // InternalUnity.g:1953:7: lv_qname_10_0= ruleQName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getChannelAccess().getQnameQNameParserRuleCall_5_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_qname_10_0=ruleQName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getChannelRule());
                      							}
                      							set(
                      								current,
                      								"qname",
                      								lv_qname_10_0,
                      								"cs.queensu.ca.Unity.QName");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getChannelAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalUnity.g:1976:3: (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUnity.g:1977:4: otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getChannelAccess().getAssignKeyword_7_0());
                      			
                    }
                    // InternalUnity.g:1981:4: ( (otherlv_13= RULE_ID ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            int LA27_2 = input.LA(2);

                            if ( (LA27_2==EOF||LA27_2==RULE_ID||LA27_2==28||LA27_2==37||LA27_2==40||(LA27_2>=44 && LA27_2<=45)||LA27_2==52) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalUnity.g:1982:5: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalUnity.g:1982:5: (otherlv_13= RULE_ID )
                    	    // InternalUnity.g:1983:6: otherlv_13= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getChannelRule());
                    	      						}
                    	      					
                    	    }
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_13, grammarAccess.getChannelAccess().getBoundInstancesInstanceCrossReference_7_1_0());
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleDirection"
    // InternalUnity.g:1999:1: entryRuleDirection returns [String current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final String entryRuleDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirection = null;


        try {
            // InternalUnity.g:1999:49: (iv_ruleDirection= ruleDirection EOF )
            // InternalUnity.g:2000:2: iv_ruleDirection= ruleDirection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirection.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalUnity.g:2006:1: ruleDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | kw= 'inout' ) ;
    public final AntlrDatatypeRuleToken ruleDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnity.g:2012:2: ( (kw= 'in' | kw= 'out' | kw= 'inout' ) )
            // InternalUnity.g:2013:2: (kw= 'in' | kw= 'out' | kw= 'inout' )
            {
            // InternalUnity.g:2013:2: (kw= 'in' | kw= 'out' | kw= 'inout' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt29=1;
                }
                break;
            case 50:
                {
                alt29=2;
                }
                break;
            case 51:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalUnity.g:2014:3: kw= 'in'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2020:3: kw= 'out'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:2026:3: kw= 'inout'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDirectionAccess().getInoutKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleInit"
    // InternalUnity.g:2035:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalUnity.g:2035:45: (iv_ruleInit= ruleInit EOF )
            // InternalUnity.g:2036:2: iv_ruleInit= ruleInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalUnity.g:2042:1: ruleInit returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2048:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) )
            // InternalUnity.g:2049:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            {
            // InternalUnity.g:2049:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            // InternalUnity.g:2050:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitAccess().getConfigKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUnity.g:2058:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_BOOLEAN)||LA30_0==23||LA30_0==34||LA30_0==72) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUnity.g:2059:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalUnity.g:2059:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalUnity.g:2060:5: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitAccess().getExpressionsExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInitRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_2_0,
            	      						"cs.queensu.ca.Unity.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInitAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleMap"
    // InternalUnity.g:2085:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalUnity.g:2085:44: (iv_ruleMap= ruleMap EOF )
            // InternalUnity.g:2086:2: iv_ruleMap= ruleMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalUnity.g:2092:1: ruleMap returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_mapName_2_0=null;
        Token otherlv_3=null;
        EObject lv_pathName_4_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2098:2: ( (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) ) )
            // InternalUnity.g:2099:2: (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) )
            {
            // InternalUnity.g:2099:2: (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) )
            // InternalUnity.g:2100:3: otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getLoadKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getMapKeyword_1());
              		
            }
            // InternalUnity.g:2108:3: ( (lv_mapName_2_0= RULE_ID ) )
            // InternalUnity.g:2109:4: (lv_mapName_2_0= RULE_ID )
            {
            // InternalUnity.g:2109:4: (lv_mapName_2_0= RULE_ID )
            // InternalUnity.g:2110:5: lv_mapName_2_0= RULE_ID
            {
            lv_mapName_2_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_mapName_2_0, grammarAccess.getMapAccess().getMapNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapRule());
              					}
              					setWithLastConsumed(
              						current,
              						"mapName",
              						lv_mapName_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMapAccess().getFromKeyword_3());
              		
            }
            // InternalUnity.g:2130:3: ( (lv_pathName_4_0= ruleStLiteral ) )
            // InternalUnity.g:2131:4: (lv_pathName_4_0= ruleStLiteral )
            {
            // InternalUnity.g:2131:4: (lv_pathName_4_0= ruleStLiteral )
            // InternalUnity.g:2132:5: lv_pathName_4_0= ruleStLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapAccess().getPathNameStLiteralParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pathName_4_0=ruleStLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapRule());
              					}
              					set(
              						current,
              						"pathName",
              						lv_pathName_4_0,
              						"cs.queensu.ca.Unity.StLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleQName"
    // InternalUnity.g:2153:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // InternalUnity.g:2153:46: (iv_ruleQName= ruleQName EOF )
            // InternalUnity.g:2154:2: iv_ruleQName= ruleQName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQName=ruleQName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // InternalUnity.g:2160:1: ruleQName returns [EObject current=null] : (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:2166:2: ( (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUnity.g:2167:2: (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUnity.g:2167:2: (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUnity.g:2168:3: otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQNameAccess().getQnameKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQNameAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:2176:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUnity.g:2177:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUnity.g:2177:4: (lv_name_2_0= RULE_ID )
            // InternalUnity.g:2178:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getQNameAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQNameRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleAreaName"
    // InternalUnity.g:2198:1: entryRuleAreaName returns [EObject current=null] : iv_ruleAreaName= ruleAreaName EOF ;
    public final EObject entryRuleAreaName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaName = null;


        try {
            // InternalUnity.g:2198:49: (iv_ruleAreaName= ruleAreaName EOF )
            // InternalUnity.g:2199:2: iv_ruleAreaName= ruleAreaName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAreaNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAreaName=ruleAreaName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAreaName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAreaName"


    // $ANTLR start "ruleAreaName"
    // InternalUnity.g:2205:1: ruleAreaName returns [EObject current=null] : (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAreaName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:2211:2: ( (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUnity.g:2212:2: (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUnity.g:2212:2: (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUnity.g:2213:3: otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAreaNameAccess().getAreaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAreaNameAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:2221:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUnity.g:2222:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUnity.g:2222:4: (lv_name_2_0= RULE_ID )
            // InternalUnity.g:2223:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getAreaNameAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAreaNameRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAreaName"


    // $ANTLR start "entryRulePort"
    // InternalUnity.g:2243:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalUnity.g:2243:45: (iv_rulePort= rulePort EOF )
            // InternalUnity.g:2244:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalUnity.g:2250:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_portnumber_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:2256:2: ( (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) ) )
            // InternalUnity.g:2257:2: (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) )
            {
            // InternalUnity.g:2257:2: (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) )
            // InternalUnity.g:2258:3: otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:2266:3: ( (lv_portnumber_2_0= RULE_INT ) )
            // InternalUnity.g:2267:4: (lv_portnumber_2_0= RULE_INT )
            {
            // InternalUnity.g:2267:4: (lv_portnumber_2_0= RULE_INT )
            // InternalUnity.g:2268:5: lv_portnumber_2_0= RULE_INT
            {
            lv_portnumber_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_portnumber_2_0, grammarAccess.getPortAccess().getPortnumberINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"portnumber",
              						lv_portnumber_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleinterfaceType"
    // InternalUnity.g:2288:1: entryRuleinterfaceType returns [EObject current=null] : iv_ruleinterfaceType= ruleinterfaceType EOF ;
    public final EObject entryRuleinterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterfaceType = null;


        try {
            // InternalUnity.g:2288:54: (iv_ruleinterfaceType= ruleinterfaceType EOF )
            // InternalUnity.g:2289:2: iv_ruleinterfaceType= ruleinterfaceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinterfaceType=ruleinterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterfaceType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleinterfaceType"


    // $ANTLR start "ruleinterfaceType"
    // InternalUnity.g:2295:1: ruleinterfaceType returns [EObject current=null] : ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) ) ;
    public final EObject ruleinterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalUnity.g:2301:2: ( ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) ) )
            // InternalUnity.g:2302:2: ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) )
            {
            // InternalUnity.g:2302:2: ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) )
            // InternalUnity.g:2303:3: ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) )
            {
            // InternalUnity.g:2303:3: ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) )
            // InternalUnity.g:2304:4: (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' )
            {
            // InternalUnity.g:2304:4: (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            else if ( (LA31_0==59) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalUnity.g:2305:5: lv_name_0_1= 'TCP'
                    {
                    lv_name_0_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getInterfaceTypeAccess().getNameTCPKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInterfaceTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2316:5: lv_name_0_2= 'IPC'
                    {
                    lv_name_0_2=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getInterfaceTypeAccess().getNameIPCKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInterfaceTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleinterfaceType"


    // $ANTLR start "entryRuleExpression"
    // InternalUnity.g:2332:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUnity.g:2332:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUnity.g:2333:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalUnity.g:2339:1: ruleExpression returns [EObject current=null] : this_Assign_0= ruleAssign ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2345:2: (this_Assign_0= ruleAssign )
            // InternalUnity.g:2346:2: this_Assign_0= ruleAssign
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAssignParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Assign_0=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Assign_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssign"
    // InternalUnity.g:2357:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalUnity.g:2357:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalUnity.g:2358:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalUnity.g:2364:1: ruleAssign returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2370:2: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* ) )
            // InternalUnity.g:2371:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            {
            // InternalUnity.g:2371:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            // InternalUnity.g:2372:3: this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2380:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUnity.g:2381:4: () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) )
            	    {
            	    // InternalUnity.g:2381:4: ()
            	    // InternalUnity.g:2382:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAssignAccess().getAssignLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2392:4: ( (lv_right_3_0= ruleOrExpression ) )
            	    // InternalUnity.g:2393:5: (lv_right_3_0= ruleOrExpression )
            	    {
            	    // InternalUnity.g:2393:5: (lv_right_3_0= ruleOrExpression )
            	    // InternalUnity.g:2394:6: lv_right_3_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignAccess().getRightOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_right_3_0=ruleOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAssignRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"cs.queensu.ca.Unity.OrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleOrExpression"
    // InternalUnity.g:2416:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalUnity.g:2416:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalUnity.g:2417:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalUnity.g:2423:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2429:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalUnity.g:2430:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalUnity.g:2430:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalUnity.g:2431:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2439:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==60) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUnity.g:2440:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalUnity.g:2440:4: ()
            	    // InternalUnity.g:2441:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2451:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalUnity.g:2452:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalUnity.g:2452:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalUnity.g:2453:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"cs.queensu.ca.Unity.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalUnity.g:2475:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalUnity.g:2475:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalUnity.g:2476:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalUnity.g:2482:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperators_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2488:2: ( (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* ) )
            // InternalUnity.g:2489:2: (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* )
            {
            // InternalUnity.g:2489:2: (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* )
            // InternalUnity.g:2490:3: this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonOperatorsParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_ComparisonOperators_0=ruleComparisonOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonOperators_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2498:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==61) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUnity.g:2499:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) )
            	    {
            	    // InternalUnity.g:2499:4: ()
            	    // InternalUnity.g:2500:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2510:4: ( (lv_right_3_0= ruleComparisonOperators ) )
            	    // InternalUnity.g:2511:5: (lv_right_3_0= ruleComparisonOperators )
            	    {
            	    // InternalUnity.g:2511:5: (lv_right_3_0= ruleComparisonOperators )
            	    // InternalUnity.g:2512:6: lv_right_3_0= ruleComparisonOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonOperatorsParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_right_3_0=ruleComparisonOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"cs.queensu.ca.Unity.ComparisonOperators");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonOperators"
    // InternalUnity.g:2534:1: entryRuleComparisonOperators returns [EObject current=null] : iv_ruleComparisonOperators= ruleComparisonOperators EOF ;
    public final EObject entryRuleComparisonOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperators = null;


        try {
            // InternalUnity.g:2534:60: (iv_ruleComparisonOperators= ruleComparisonOperators EOF )
            // InternalUnity.g:2535:2: iv_ruleComparisonOperators= ruleComparisonOperators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperators=ruleComparisonOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperators; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonOperators"


    // $ANTLR start "ruleComparisonOperators"
    // InternalUnity.g:2541:1: ruleComparisonOperators returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* ) ;
    public final EObject ruleComparisonOperators() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_Addition_0 = null;

        EObject lv_rest_13_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2547:2: ( (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* ) )
            // InternalUnity.g:2548:2: (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* )
            {
            // InternalUnity.g:2548:2: (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* )
            // InternalUnity.g:2549:3: this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getAdditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Addition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2557:3: ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==62) && (synpred1_InternalUnity())) {
                    alt36=1;
                }
                else if ( (LA36_0==63) && (synpred1_InternalUnity())) {
                    alt36=1;
                }
                else if ( (LA36_0==64) && (synpred1_InternalUnity())) {
                    alt36=1;
                }
                else if ( (LA36_0==65) && (synpred1_InternalUnity())) {
                    alt36=1;
                }
                else if ( (LA36_0==66) && (synpred1_InternalUnity())) {
                    alt36=1;
                }
                else if ( (LA36_0==67) && (synpred1_InternalUnity())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUnity.g:2558:4: ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) )
            	    {
            	    // InternalUnity.g:2558:4: ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) )
            	    // InternalUnity.g:2559:5: ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) )
            	    {
            	    // InternalUnity.g:2597:5: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) )
            	    int alt35=6;
            	    switch ( input.LA(1) ) {
            	    case 62:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt35=5;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt35=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // InternalUnity.g:2598:6: ( () otherlv_2= '>' )
            	            {
            	            // InternalUnity.g:2598:6: ( () otherlv_2= '>' )
            	            // InternalUnity.g:2599:7: () otherlv_2= '>'
            	            {
            	            // InternalUnity.g:2599:7: ()
            	            // InternalUnity.g:2600:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getGTLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,62,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2612:6: ( () otherlv_4= '<' )
            	            {
            	            // InternalUnity.g:2612:6: ( () otherlv_4= '<' )
            	            // InternalUnity.g:2613:7: () otherlv_4= '<'
            	            {
            	            // InternalUnity.g:2613:7: ()
            	            // InternalUnity.g:2614:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getLTLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,63,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getComparisonOperatorsAccess().getLessThanSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:2626:6: ( () otherlv_6= '>=' )
            	            {
            	            // InternalUnity.g:2626:6: ( () otherlv_6= '>=' )
            	            // InternalUnity.g:2627:7: () otherlv_6= '>='
            	            {
            	            // InternalUnity.g:2627:7: ()
            	            // InternalUnity.g:2628:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getGELeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,64,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalUnity.g:2640:6: ( () otherlv_8= '<=' )
            	            {
            	            // InternalUnity.g:2640:6: ( () otherlv_8= '<=' )
            	            // InternalUnity.g:2641:7: () otherlv_8= '<='
            	            {
            	            // InternalUnity.g:2641:7: ()
            	            // InternalUnity.g:2642:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getLELeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,65,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getComparisonOperatorsAccess().getLessThanSignEqualsSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalUnity.g:2654:6: ( () otherlv_10= '==' )
            	            {
            	            // InternalUnity.g:2654:6: ( () otherlv_10= '==' )
            	            // InternalUnity.g:2655:7: () otherlv_10= '=='
            	            {
            	            // InternalUnity.g:2655:7: ()
            	            // InternalUnity.g:2656:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getEQLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,66,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getComparisonOperatorsAccess().getEqualsSignEqualsSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalUnity.g:2668:6: ( () otherlv_12= '!=' )
            	            {
            	            // InternalUnity.g:2668:6: ( () otherlv_12= '!=' )
            	            // InternalUnity.g:2669:7: () otherlv_12= '!='
            	            {
            	            // InternalUnity.g:2669:7: ()
            	            // InternalUnity.g:2670:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getNELeftAction_1_0_0_5_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_12=(Token)match(input,67,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_12, grammarAccess.getComparisonOperatorsAccess().getExclamationMarkEqualsSignKeyword_1_0_0_5_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2683:4: ( (lv_rest_13_0= ruleAddition ) )
            	    // InternalUnity.g:2684:5: (lv_rest_13_0= ruleAddition )
            	    {
            	    // InternalUnity.g:2684:5: (lv_rest_13_0= ruleAddition )
            	    // InternalUnity.g:2685:6: lv_rest_13_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRestAdditionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_rest_13_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonOperatorsRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rest",
            	      							lv_rest_13_0,
            	      							"cs.queensu.ca.Unity.Addition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparisonOperators"


    // $ANTLR start "entryRuleAddition"
    // InternalUnity.g:2707:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalUnity.g:2707:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalUnity.g:2708:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalUnity.g:2714:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2720:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalUnity.g:2721:2: (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalUnity.g:2721:2: (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalUnity.g:2722:3: this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2730:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // InternalUnity.g:2731:4: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalUnity.g:2731:4: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) )
            	    // InternalUnity.g:2732:5: ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    {
            	    // InternalUnity.g:2746:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==68) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==34) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalUnity.g:2747:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalUnity.g:2747:6: ( () otherlv_2= '+' )
            	            // InternalUnity.g:2748:7: () otherlv_2= '+'
            	            {
            	            // InternalUnity.g:2748:7: ()
            	            // InternalUnity.g:2749:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,68,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2761:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalUnity.g:2761:6: ( () otherlv_4= '-' )
            	            // InternalUnity.g:2762:7: () otherlv_4= '-'
            	            {
            	            // InternalUnity.g:2762:7: ()
            	            // InternalUnity.g:2763:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2776:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalUnity.g:2777:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalUnity.g:2777:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalUnity.g:2778:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"cs.queensu.ca.Unity.Multiplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalUnity.g:2800:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalUnity.g:2800:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalUnity.g:2801:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalUnity.g:2807:1: ruleMultiplication returns [EObject current=null] : (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Unary_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2813:2: ( (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* ) )
            // InternalUnity.g:2814:2: (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* )
            {
            // InternalUnity.g:2814:2: (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* )
            // InternalUnity.g:2815:3: this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getUnaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_Unary_0=ruleUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Unary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2823:3: ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==69) && (synpred3_InternalUnity())) {
                    alt40=1;
                }
                else if ( (LA40_0==70) && (synpred3_InternalUnity())) {
                    alt40=1;
                }
                else if ( (LA40_0==71) && (synpred3_InternalUnity())) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUnity.g:2824:4: ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) )
            	    {
            	    // InternalUnity.g:2824:4: ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) )
            	    // InternalUnity.g:2825:5: ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    {
            	    // InternalUnity.g:2845:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case 69:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // InternalUnity.g:2846:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalUnity.g:2846:6: ( () otherlv_2= '*' )
            	            // InternalUnity.g:2847:7: () otherlv_2= '*'
            	            {
            	            // InternalUnity.g:2847:7: ()
            	            // InternalUnity.g:2848:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,69,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2860:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalUnity.g:2860:6: ( () otherlv_4= '/' )
            	            // InternalUnity.g:2861:7: () otherlv_4= '/'
            	            {
            	            // InternalUnity.g:2861:7: ()
            	            // InternalUnity.g:2862:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getDivideLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,70,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:2874:6: ( () otherlv_6= '%' )
            	            {
            	            // InternalUnity.g:2874:6: ( () otherlv_6= '%' )
            	            // InternalUnity.g:2875:7: () otherlv_6= '%'
            	            {
            	            // InternalUnity.g:2875:7: ()
            	            // InternalUnity.g:2876:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getModuloLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,71,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2889:4: ( (lv_right_7_0= ruleUnary ) )
            	    // InternalUnity.g:2890:5: (lv_right_7_0= ruleUnary )
            	    {
            	    // InternalUnity.g:2890:5: (lv_right_7_0= ruleUnary )
            	    // InternalUnity.g:2891:6: lv_right_7_0= ruleUnary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightUnaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_right_7_0=ruleUnary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_7_0,
            	      							"cs.queensu.ca.Unity.Unary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleUnary"
    // InternalUnity.g:2913:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // InternalUnity.g:2913:46: (iv_ruleUnary= ruleUnary EOF )
            // InternalUnity.g:2914:2: iv_ruleUnary= ruleUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnary=ruleUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // InternalUnity.g:2920:1: ruleUnary returns [EObject current=null] : (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpressionNotPlusMinus_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2926:2: ( (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) ) )
            // InternalUnity.g:2927:2: (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) )
            {
            // InternalUnity.g:2927:2: (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_BOOLEAN)||LA41_0==23||LA41_0==72) ) {
                alt41=1;
            }
            else if ( (LA41_0==34) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalUnity.g:2928:3: this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryAccess().getUnaryExpressionNotPlusMinusParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpressionNotPlusMinus_0=ruleUnaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpressionNotPlusMinus_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2937:3: ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) )
                    {
                    // InternalUnity.g:2937:3: ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) )
                    // InternalUnity.g:2938:4: () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) )
                    {
                    // InternalUnity.g:2938:4: ()
                    // InternalUnity.g:2939:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryAccess().getUnaryExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalUnity.g:2949:4: ( (lv_exp_3_0= ruleUnary ) )
                    // InternalUnity.g:2950:5: (lv_exp_3_0= ruleUnary )
                    {
                    // InternalUnity.g:2950:5: (lv_exp_3_0= ruleUnary )
                    // InternalUnity.g:2951:6: lv_exp_3_0= ruleUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryAccess().getExpUnaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_3_0=ruleUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_3_0,
                      							"cs.queensu.ca.Unity.Unary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleUnaryExpressionNotPlusMinus"
    // InternalUnity.g:2973:1: entryRuleUnaryExpressionNotPlusMinus returns [EObject current=null] : iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF ;
    public final EObject entryRuleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpressionNotPlusMinus = null;


        try {
            // InternalUnity.g:2973:68: (iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF )
            // InternalUnity.g:2974:2: iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpressionNotPlusMinus=ruleUnaryExpressionNotPlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpressionNotPlusMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpressionNotPlusMinus"


    // $ANTLR start "ruleUnaryExpressionNotPlusMinus"
    // InternalUnity.g:2980:1: ruleUnaryExpressionNotPlusMinus returns [EObject current=null] : (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject this_NotBooleanExpression_0 = null;

        EObject this_PrimaryExpression_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:2986:2: ( (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression ) )
            // InternalUnity.g:2987:2: (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            {
            // InternalUnity.g:2987:2: (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==72) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_BOOLEAN)||LA42_0==23) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalUnity.g:2988:3: this_NotBooleanExpression_0= ruleNotBooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getNotBooleanExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotBooleanExpression_0=ruleNotBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotBooleanExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2997:3: this_PrimaryExpression_1= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getPrimaryExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_1=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryExpressionNotPlusMinus"


    // $ANTLR start "entryRuleNotBooleanExpression"
    // InternalUnity.g:3009:1: entryRuleNotBooleanExpression returns [EObject current=null] : iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF ;
    public final EObject entryRuleNotBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotBooleanExpression = null;


        try {
            // InternalUnity.g:3009:61: (iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF )
            // InternalUnity.g:3010:2: iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotBooleanExpression=ruleNotBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotBooleanExpression"


    // $ANTLR start "ruleNotBooleanExpression"
    // InternalUnity.g:3016:1: ruleNotBooleanExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) ) ;
    public final EObject ruleNotBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:3022:2: ( (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) ) )
            // InternalUnity.g:3023:2: (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) )
            {
            // InternalUnity.g:3023:2: (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) )
            // InternalUnity.g:3024:3: otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotBooleanExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalUnity.g:3028:3: ( (lv_exp_1_0= ruleUnary ) )
            // InternalUnity.g:3029:4: (lv_exp_1_0= ruleUnary )
            {
            // InternalUnity.g:3029:4: (lv_exp_1_0= ruleUnary )
            // InternalUnity.g:3030:5: lv_exp_1_0= ruleUnary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotBooleanExpressionAccess().getExpUnaryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_exp_1_0=ruleUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotBooleanExpressionRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_1_0,
              						"cs.queensu.ca.Unity.Unary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNotBooleanExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalUnity.g:3051:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalUnity.g:3051:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalUnity.g:3052:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalUnity.g:3058:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralOrIdentifier_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalUnity.g:3064:2: ( (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalUnity.g:3065:2: (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalUnity.g:3065:2: (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_BOOLEAN)) ) {
                alt43=1;
            }
            else if ( (LA43_0==23) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalUnity.g:3066:3: this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralOrIdentifierParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralOrIdentifier_0=ruleLiteralOrIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralOrIdentifier_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:3075:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalUnity.g:3075:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalUnity.g:3076:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteralOrIdentifier"
    // InternalUnity.g:3097:1: entryRuleLiteralOrIdentifier returns [EObject current=null] : iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF ;
    public final EObject entryRuleLiteralOrIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOrIdentifier = null;


        try {
            // InternalUnity.g:3097:60: (iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF )
            // InternalUnity.g:3098:2: iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralOrIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralOrIdentifier=ruleLiteralOrIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralOrIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralOrIdentifier"


    // $ANTLR start "ruleLiteralOrIdentifier"
    // InternalUnity.g:3104:1: ruleLiteralOrIdentifier returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier ) ;
    public final EObject ruleLiteralOrIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:3110:2: ( (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier ) )
            // InternalUnity.g:3111:2: (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier )
            {
            // InternalUnity.g:3111:2: (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_BOOLEAN)) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalUnity.g:3112:3: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralOrIdentifierAccess().getLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:3121:3: this_Identifier_1= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralOrIdentifierAccess().getIdentifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Identifier_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteralOrIdentifier"


    // $ANTLR start "entryRuleLiteral"
    // InternalUnity.g:3133:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalUnity.g:3133:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalUnity.g:3134:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalUnity.g:3140:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_BoolLiteral_1 = null;

        EObject this_StLiteral_2 = null;

        EObject this_RealLiteral_3 = null;



        	enterRule();

        try {
            // InternalUnity.g:3146:2: ( (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral ) )
            // InternalUnity.g:3147:2: (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral )
            {
            // InternalUnity.g:3147:2: (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral )
            int alt45=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt45=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt45=2;
                }
                break;
            case RULE_STRING:
                {
                alt45=3;
                }
                break;
            case RULE_REAL:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalUnity.g:3148:3: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:3157:3: this_BoolLiteral_1= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_1=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:3166:3: this_StLiteral_2= ruleStLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StLiteral_2=ruleStLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUnity.g:3175:3: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_3=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalUnity.g:3187:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalUnity.g:3187:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalUnity.g:3188:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalUnity.g:3194:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_int_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_int_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:3200:2: ( ( () ( (lv_int_1_0= RULE_INT ) ) ) )
            // InternalUnity.g:3201:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
            {
            // InternalUnity.g:3201:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
            // InternalUnity.g:3202:3: () ( (lv_int_1_0= RULE_INT ) )
            {
            // InternalUnity.g:3202:3: ()
            // InternalUnity.g:3203:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:3209:3: ( (lv_int_1_0= RULE_INT ) )
            // InternalUnity.g:3210:4: (lv_int_1_0= RULE_INT )
            {
            // InternalUnity.g:3210:4: (lv_int_1_0= RULE_INT )
            // InternalUnity.g:3211:5: lv_int_1_0= RULE_INT
            {
            lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_int_1_0, grammarAccess.getIntLiteralAccess().getIntINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"int",
              						lv_int_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalUnity.g:3231:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalUnity.g:3231:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalUnity.g:3232:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalUnity.g:3238:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:3244:2: ( ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) ) )
            // InternalUnity.g:3245:2: ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalUnity.g:3245:2: ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) )
            // InternalUnity.g:3246:3: () ( (lv_bool_1_0= RULE_BOOLEAN ) )
            {
            // InternalUnity.g:3246:3: ()
            // InternalUnity.g:3247:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:3253:3: ( (lv_bool_1_0= RULE_BOOLEAN ) )
            // InternalUnity.g:3254:4: (lv_bool_1_0= RULE_BOOLEAN )
            {
            // InternalUnity.g:3254:4: (lv_bool_1_0= RULE_BOOLEAN )
            // InternalUnity.g:3255:5: lv_bool_1_0= RULE_BOOLEAN
            {
            lv_bool_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_bool_1_0, grammarAccess.getBoolLiteralAccess().getBoolBOOLEANTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBoolLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"bool",
              						lv_bool_1_0,
              						"cs.queensu.ca.Unity.BOOLEAN");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStLiteral"
    // InternalUnity.g:3275:1: entryRuleStLiteral returns [EObject current=null] : iv_ruleStLiteral= ruleStLiteral EOF ;
    public final EObject entryRuleStLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStLiteral = null;


        try {
            // InternalUnity.g:3275:50: (iv_ruleStLiteral= ruleStLiteral EOF )
            // InternalUnity.g:3276:2: iv_ruleStLiteral= ruleStLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStLiteral=ruleStLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStLiteral"


    // $ANTLR start "ruleStLiteral"
    // InternalUnity.g:3282:1: ruleStLiteral returns [EObject current=null] : ( () ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:3288:2: ( ( () ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalUnity.g:3289:2: ( () ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalUnity.g:3289:2: ( () ( (lv_string_1_0= RULE_STRING ) ) )
            // InternalUnity.g:3290:3: () ( (lv_string_1_0= RULE_STRING ) )
            {
            // InternalUnity.g:3290:3: ()
            // InternalUnity.g:3291:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStLiteralAccess().getStLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:3297:3: ( (lv_string_1_0= RULE_STRING ) )
            // InternalUnity.g:3298:4: (lv_string_1_0= RULE_STRING )
            {
            // InternalUnity.g:3298:4: (lv_string_1_0= RULE_STRING )
            // InternalUnity.g:3299:5: lv_string_1_0= RULE_STRING
            {
            lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_string_1_0, grammarAccess.getStLiteralAccess().getStringSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"string",
              						lv_string_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStLiteral"


    // $ANTLR start "entryRuleIdentifier"
    // InternalUnity.g:3319:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalUnity.g:3319:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalUnity.g:3320:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalUnity.g:3326:1: ruleIdentifier returns [EObject current=null] : ( (lv_Refrence_0_0= ruleDotExpression ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject lv_Refrence_0_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:3332:2: ( ( (lv_Refrence_0_0= ruleDotExpression ) ) )
            // InternalUnity.g:3333:2: ( (lv_Refrence_0_0= ruleDotExpression ) )
            {
            // InternalUnity.g:3333:2: ( (lv_Refrence_0_0= ruleDotExpression ) )
            // InternalUnity.g:3334:3: (lv_Refrence_0_0= ruleDotExpression )
            {
            // InternalUnity.g:3334:3: (lv_Refrence_0_0= ruleDotExpression )
            // InternalUnity.g:3335:4: lv_Refrence_0_0= ruleDotExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIdentifierAccess().getRefrenceDotExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_Refrence_0_0=ruleDotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getIdentifierRule());
              				}
              				set(
              					current,
              					"Refrence",
              					lv_Refrence_0_0,
              					"cs.queensu.ca.Unity.DotExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIdentifier"

    // $ANTLR start synpred1_InternalUnity
    public final void synpred1_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2559:5: ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )
        // InternalUnity.g:2559:6: ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) )
        {
        // InternalUnity.g:2559:6: ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) )
        int alt46=6;
        switch ( input.LA(1) ) {
        case 62:
            {
            alt46=1;
            }
            break;
        case 63:
            {
            alt46=2;
            }
            break;
        case 64:
            {
            alt46=3;
            }
            break;
        case 65:
            {
            alt46=4;
            }
            break;
        case 66:
            {
            alt46=5;
            }
            break;
        case 67:
            {
            alt46=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 46, 0, input);

            throw nvae;
        }

        switch (alt46) {
            case 1 :
                // InternalUnity.g:2560:6: ( () '>' )
                {
                // InternalUnity.g:2560:6: ( () '>' )
                // InternalUnity.g:2561:7: () '>'
                {
                // InternalUnity.g:2561:7: ()
                // InternalUnity.g:2562:7: 
                {
                }

                match(input,62,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2566:6: ( () '<' )
                {
                // InternalUnity.g:2566:6: ( () '<' )
                // InternalUnity.g:2567:7: () '<'
                {
                // InternalUnity.g:2567:7: ()
                // InternalUnity.g:2568:7: 
                {
                }

                match(input,63,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalUnity.g:2572:6: ( () '>=' )
                {
                // InternalUnity.g:2572:6: ( () '>=' )
                // InternalUnity.g:2573:7: () '>='
                {
                // InternalUnity.g:2573:7: ()
                // InternalUnity.g:2574:7: 
                {
                }

                match(input,64,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalUnity.g:2578:6: ( () '<=' )
                {
                // InternalUnity.g:2578:6: ( () '<=' )
                // InternalUnity.g:2579:7: () '<='
                {
                // InternalUnity.g:2579:7: ()
                // InternalUnity.g:2580:7: 
                {
                }

                match(input,65,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalUnity.g:2584:6: ( () '==' )
                {
                // InternalUnity.g:2584:6: ( () '==' )
                // InternalUnity.g:2585:7: () '=='
                {
                // InternalUnity.g:2585:7: ()
                // InternalUnity.g:2586:7: 
                {
                }

                match(input,66,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 6 :
                // InternalUnity.g:2590:6: ( () '!=' )
                {
                // InternalUnity.g:2590:6: ( () '!=' )
                // InternalUnity.g:2591:7: () '!='
                {
                // InternalUnity.g:2591:7: ()
                // InternalUnity.g:2592:7: 
                {
                }

                match(input,67,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_InternalUnity

    // $ANTLR start synpred2_InternalUnity
    public final void synpred2_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2732:5: ( ( ( () '+' ) | ( () '-' ) ) )
        // InternalUnity.g:2732:6: ( ( () '+' ) | ( () '-' ) )
        {
        // InternalUnity.g:2732:6: ( ( () '+' ) | ( () '-' ) )
        int alt47=2;
        int LA47_0 = input.LA(1);

        if ( (LA47_0==68) ) {
            alt47=1;
        }
        else if ( (LA47_0==34) ) {
            alt47=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 47, 0, input);

            throw nvae;
        }
        switch (alt47) {
            case 1 :
                // InternalUnity.g:2733:6: ( () '+' )
                {
                // InternalUnity.g:2733:6: ( () '+' )
                // InternalUnity.g:2734:7: () '+'
                {
                // InternalUnity.g:2734:7: ()
                // InternalUnity.g:2735:7: 
                {
                }

                match(input,68,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2739:6: ( () '-' )
                {
                // InternalUnity.g:2739:6: ( () '-' )
                // InternalUnity.g:2740:7: () '-'
                {
                // InternalUnity.g:2740:7: ()
                // InternalUnity.g:2741:7: 
                {
                }

                match(input,34,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred2_InternalUnity

    // $ANTLR start synpred3_InternalUnity
    public final void synpred3_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2825:5: ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )
        // InternalUnity.g:2825:6: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )
        {
        // InternalUnity.g:2825:6: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )
        int alt48=3;
        switch ( input.LA(1) ) {
        case 69:
            {
            alt48=1;
            }
            break;
        case 70:
            {
            alt48=2;
            }
            break;
        case 71:
            {
            alt48=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 48, 0, input);

            throw nvae;
        }

        switch (alt48) {
            case 1 :
                // InternalUnity.g:2826:6: ( () '*' )
                {
                // InternalUnity.g:2826:6: ( () '*' )
                // InternalUnity.g:2827:7: () '*'
                {
                // InternalUnity.g:2827:7: ()
                // InternalUnity.g:2828:7: 
                {
                }

                match(input,69,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2832:6: ( () '/' )
                {
                // InternalUnity.g:2832:6: ( () '/' )
                // InternalUnity.g:2833:7: () '/'
                {
                // InternalUnity.g:2833:7: ()
                // InternalUnity.g:2834:7: 
                {
                }

                match(input,70,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalUnity.g:2838:6: ( () '%' )
                {
                // InternalUnity.g:2838:6: ( () '%' )
                // InternalUnity.g:2839:7: () '%'
                {
                // InternalUnity.g:2839:7: ()
                // InternalUnity.g:2840:7: 
                {
                }

                match(input,71,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred3_InternalUnity

    // Delegated rules

    public final boolean synpred2_InternalUnity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalUnity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalUnity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalUnity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalUnity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalUnity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\1\26\uffff";
    static final String dfa_3s = "\1\4\22\uffff\1\0\3\uffff";
    static final String dfa_4s = "\1\110\22\uffff\1\0\3\uffff";
    static final String dfa_5s = "\1\uffff\1\2\24\uffff\1\1";
    static final String dfa_6s = "\1\0\22\uffff\1\1\3\uffff}>";
    static final String[] dfa_7s = {
            "\5\1\14\uffff\1\1\1\uffff\2\1\11\uffff\1\23\3\uffff\1\1\4\uffff\1\1\20\uffff\10\1\1\26\3\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2730:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_0 = input.LA(1);

                         
                        int index38_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA38_0==EOF||(LA38_0>=RULE_ID && LA38_0<=RULE_BOOLEAN)||LA38_0==21||(LA38_0>=23 && LA38_0<=24)||LA38_0==38||LA38_0==43||(LA38_0>=60 && LA38_0<=67)||LA38_0==72) ) {s = 1;}

                        else if ( (LA38_0==34) ) {s = 19;}

                        else if ( (LA38_0==68) && (synpred2_InternalUnity())) {s = 22;}

                         
                        input.seek(index38_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_19 = input.LA(1);

                         
                        int index38_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalUnity()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008800002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080400A001F0L,0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000004000001E0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003010600000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400A001F0L,0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000004008001F0L,0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010312010000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C0000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000C00000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});

}