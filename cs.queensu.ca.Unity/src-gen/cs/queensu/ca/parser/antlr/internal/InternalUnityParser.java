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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MetaObject'", "':'", "'car'", "'rover'", "'others'", "'{'", "'}'", "'Action'", "'('", "')'", "'return'", "','", "'.'", "'property'", "'range'", "'bool'", "'int'", "'string'", "'real'", "'-'", "'Object'", "'override'", "'config'", "'='", "'Env'", "'Instance'", "'Channel'", "'cardinality'", "'load'", "'map'", "'from'", "'qname'", "'area'", "'port'", "'portnumber'", "'TCP'", "'IPC'", "'or'", "'and'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+'", "'*'", "'/'", "'%'", "'!'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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

                if ( (LA2_0==12||LA2_0==32||LA2_0==36) ) {
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
            	    case 32:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 36:
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
    // InternalUnity.g:141:1: ruleMetaObject returns [EObject current=null] : (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleMetaObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_kind_3_1=null;
        Token lv_kind_3_2=null;
        Token lv_kind_3_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_properties_5_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:147:2: ( (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' ) )
            // InternalUnity.g:148:2: (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' )
            {
            // InternalUnity.g:148:2: (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' )
            // InternalUnity.g:149:3: otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMetaObjectAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:175:3: ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) ) )
            // InternalUnity.g:176:4: ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) )
            {
            // InternalUnity.g:176:4: ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' ) )
            // InternalUnity.g:177:5: (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' )
            {
            // InternalUnity.g:177:5: (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'others' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
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
                    lv_kind_3_1=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
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
                    lv_kind_3_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
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
                    // InternalUnity.g:200:6: lv_kind_3_3= 'others'
                    {
                    lv_kind_3_3=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_3, grammarAccess.getMetaObjectAccess().getKindOthersKeyword_3_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMetaObjectAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUnity.g:217:3: ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }
                else if ( (LA4_0==19) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUnity.g:218:4: ( (lv_properties_5_0= ruleAttribute ) )
            	    {
            	    // InternalUnity.g:218:4: ( (lv_properties_5_0= ruleAttribute ) )
            	    // InternalUnity.g:219:5: (lv_properties_5_0= ruleAttribute )
            	    {
            	    // InternalUnity.g:219:5: (lv_properties_5_0= ruleAttribute )
            	    // InternalUnity.g:220:6: lv_properties_5_0= ruleAttribute
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
            	    // InternalUnity.g:238:4: ( (lv_actions_6_0= ruleAction ) )
            	    {
            	    // InternalUnity.g:238:4: ( (lv_actions_6_0= ruleAction ) )
            	    // InternalUnity.g:239:5: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalUnity.g:239:5: (lv_actions_6_0= ruleAction )
            	    // InternalUnity.g:240:6: lv_actions_6_0= ruleAction
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

            otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:266:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalUnity.g:266:47: (iv_ruleAction= ruleAction EOF )
            // InternalUnity.g:267:2: iv_ruleAction= ruleAction EOF
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
    // InternalUnity.g:273:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' ) ;
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
        Token otherlv_11=null;
        EObject lv_payload_3_0 = null;

        EObject lv_returnPayload_7_0 = null;

        EObject lv_expressions_10_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:279:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' ) )
            // InternalUnity.g:280:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' )
            {
            // InternalUnity.g:280:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' )
            // InternalUnity.g:281:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
              		
            }
            // InternalUnity.g:285:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:286:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:286:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:287:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUnity.g:307:3: ( (lv_payload_3_0= rulePayload ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnity.g:308:4: (lv_payload_3_0= rulePayload )
                    {
                    // InternalUnity.g:308:4: (lv_payload_3_0= rulePayload )
                    // InternalUnity.g:309:5: lv_payload_3_0= rulePayload
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

            otherlv_4=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalUnity.g:330:3: (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' )
            // InternalUnity.g:331:4: otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')'
            {
            otherlv_5=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getReturnKeyword_5_0());
              			
            }
            otherlv_6=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getLeftParenthesisKeyword_5_1());
              			
            }
            // InternalUnity.g:339:4: ( (lv_returnPayload_7_0= rulePayload ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUnity.g:340:5: (lv_returnPayload_7_0= rulePayload )
                    {
                    // InternalUnity.g:340:5: (lv_returnPayload_7_0= rulePayload )
                    // InternalUnity.g:341:6: lv_returnPayload_7_0= rulePayload
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

            otherlv_8=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getRightParenthesisKeyword_5_3());
              			
            }

            }

            otherlv_9=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalUnity.g:367:3: ( (lv_expressions_10_0= ruleExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==20||LA7_0==31||LA7_0==61) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUnity.g:368:4: (lv_expressions_10_0= ruleExpression )
            	    {
            	    // InternalUnity.g:368:4: (lv_expressions_10_0= ruleExpression )
            	    // InternalUnity.g:369:5: lv_expressions_10_0= ruleExpression
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

            otherlv_11=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_8());
              		
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
    // InternalUnity.g:394:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalUnity.g:394:48: (iv_rulePayload= rulePayload EOF )
            // InternalUnity.g:395:2: iv_rulePayload= rulePayload EOF
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
    // InternalUnity.g:401:1: rulePayload returns [EObject current=null] : ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:407:2: ( ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* ) )
            // InternalUnity.g:408:2: ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* )
            {
            // InternalUnity.g:408:2: ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* )
            // InternalUnity.g:409:3: ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )*
            {
            // InternalUnity.g:409:3: ( (lv_params_0_0= ruleParam ) )
            // InternalUnity.g:410:4: (lv_params_0_0= ruleParam )
            {
            // InternalUnity.g:410:4: (lv_params_0_0= ruleParam )
            // InternalUnity.g:411:5: lv_params_0_0= ruleParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPayloadAccess().getParamsParamParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            // InternalUnity.g:428:3: (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUnity.g:429:4: otherlv_1= ',' ( (lv_params_2_0= ruleParam ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPayloadAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalUnity.g:433:4: ( (lv_params_2_0= ruleParam ) )
            	    // InternalUnity.g:434:5: (lv_params_2_0= ruleParam )
            	    {
            	    // InternalUnity.g:434:5: (lv_params_2_0= ruleParam )
            	    // InternalUnity.g:435:6: lv_params_2_0= ruleParam
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPayloadAccess().getParamsParamParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop8;
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
    // InternalUnity.g:457:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalUnity.g:457:46: (iv_ruleParam= ruleParam EOF )
            // InternalUnity.g:458:2: iv_ruleParam= ruleParam EOF
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
    // InternalUnity.g:464:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:470:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) )
            // InternalUnity.g:471:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            {
            // InternalUnity.g:471:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            // InternalUnity.g:472:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) )
            {
            // InternalUnity.g:472:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUnity.g:473:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUnity.g:473:4: (lv_name_0_0= RULE_ID )
            // InternalUnity.g:474:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,13,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:494:3: ( (lv_type_2_0= ruleVarType ) )
            // InternalUnity.g:495:4: (lv_type_2_0= ruleVarType )
            {
            // InternalUnity.g:495:4: (lv_type_2_0= ruleVarType )
            // InternalUnity.g:496:5: lv_type_2_0= ruleVarType
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
    // InternalUnity.g:517:1: entryRuleDotExpression returns [EObject current=null] : iv_ruleDotExpression= ruleDotExpression EOF ;
    public final EObject entryRuleDotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotExpression = null;


        try {
            // InternalUnity.g:517:54: (iv_ruleDotExpression= ruleDotExpression EOF )
            // InternalUnity.g:518:2: iv_ruleDotExpression= ruleDotExpression EOF
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
    // InternalUnity.g:524:1: ruleDotExpression returns [EObject current=null] : (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SingleRef_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:530:2: ( (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalUnity.g:531:2: (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalUnity.g:531:2: (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalUnity.g:532:3: this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDotExpressionAccess().getSingleRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_SingleRef_0=ruleSingleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SingleRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:540:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUnity.g:541:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalUnity.g:541:4: ()
            	    // InternalUnity.g:542:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDotExpressionAccess().getDotExpressionHeadAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:552:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalUnity.g:553:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalUnity.g:553:5: (otherlv_3= RULE_ID )
            	    // InternalUnity.g:554:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDotExpressionRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getDotExpressionAccess().getTailPropertyCrossReference_1_2_0());
            	      					
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
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleSingleRef"
    // InternalUnity.g:570:1: entryRuleSingleRef returns [EObject current=null] : iv_ruleSingleRef= ruleSingleRef EOF ;
    public final EObject entryRuleSingleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRef = null;


        try {
            // InternalUnity.g:570:50: (iv_ruleSingleRef= ruleSingleRef EOF )
            // InternalUnity.g:571:2: iv_ruleSingleRef= ruleSingleRef EOF
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
    // InternalUnity.g:577:1: ruleSingleRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSingleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUnity.g:583:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUnity.g:584:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUnity.g:584:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalUnity.g:585:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalUnity.g:585:3: ()
            // InternalUnity.g:586:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSingleRefAccess().getSingleRefAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:592:3: ( (otherlv_1= RULE_ID ) )
            // InternalUnity.g:593:4: (otherlv_1= RULE_ID )
            {
            // InternalUnity.g:593:4: (otherlv_1= RULE_ID )
            // InternalUnity.g:594:5: otherlv_1= RULE_ID
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
    // InternalUnity.g:609:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalUnity.g:609:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalUnity.g:610:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalUnity.g:616:1: ruleProperty returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Instance_1= ruleInstance | this_Param_2= ruleParam ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Instance_1 = null;

        EObject this_Param_2 = null;



        	enterRule();

        try {
            // InternalUnity.g:622:2: ( (this_Attribute_0= ruleAttribute | this_Instance_1= ruleInstance | this_Param_2= ruleParam ) )
            // InternalUnity.g:623:2: (this_Attribute_0= ruleAttribute | this_Instance_1= ruleInstance | this_Param_2= ruleParam )
            {
            // InternalUnity.g:623:2: (this_Attribute_0= ruleAttribute | this_Instance_1= ruleInstance | this_Param_2= ruleParam )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUnity.g:624:3: this_Attribute_0= ruleAttribute
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
                    // InternalUnity.g:633:3: this_Instance_1= ruleInstance
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getInstanceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Instance_1=ruleInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Instance_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:642:3: this_Param_2= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getParamParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Param_2=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Param_2;
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
    // InternalUnity.g:654:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUnity.g:654:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUnity.g:655:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUnity.g:661:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? ) ;
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
            // InternalUnity.g:667:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? ) )
            // InternalUnity.g:668:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? )
            {
            // InternalUnity.g:668:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? )
            // InternalUnity.g:669:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getPropertyKeyword_0());
              		
            }
            // InternalUnity.g:673:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:674:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:674:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:675:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:695:3: ( (lv_propertyType_3_0= ruleVarType ) )
            // InternalUnity.g:696:4: (lv_propertyType_3_0= ruleVarType )
            {
            // InternalUnity.g:696:4: (lv_propertyType_3_0= ruleVarType )
            // InternalUnity.g:697:5: lv_propertyType_3_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getPropertyTypeVarTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalUnity.g:714:3: (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUnity.g:715:4: otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getRangeKeyword_4_0());
                      			
                    }
                    // InternalUnity.g:719:4: ( (lv_range_5_0= ruleRange ) )
                    // InternalUnity.g:720:5: (lv_range_5_0= ruleRange )
                    {
                    // InternalUnity.g:720:5: (lv_range_5_0= ruleRange )
                    // InternalUnity.g:721:6: lv_range_5_0= ruleRange
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
    // InternalUnity.g:743:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // InternalUnity.g:743:48: (iv_ruleVarType= ruleVarType EOF )
            // InternalUnity.g:744:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalUnity.g:750:1: ruleVarType returns [EObject current=null] : ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalUnity.g:756:2: ( ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) ) )
            // InternalUnity.g:757:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) )
            {
            // InternalUnity.g:757:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) )
            // InternalUnity.g:758:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) )
            {
            // InternalUnity.g:758:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) )
            // InternalUnity.g:759:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' )
            {
            // InternalUnity.g:759:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUnity.g:760:5: lv_name_0_1= 'bool'
                    {
                    lv_name_0_1=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUnity.g:771:5: lv_name_0_2= 'int'
                    {
                    lv_name_0_2=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUnity.g:782:5: lv_name_0_3= 'string'
                    {
                    lv_name_0_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUnity.g:793:5: lv_name_0_4= 'real'
                    {
                    lv_name_0_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:809:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalUnity.g:809:46: (iv_ruleRange= ruleRange EOF )
            // InternalUnity.g:810:2: iv_ruleRange= ruleRange EOF
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
    // InternalUnity.g:816:1: ruleRange returns [EObject current=null] : (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:822:2: ( (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // InternalUnity.g:823:2: (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // InternalUnity.g:823:2: (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' )
            // InternalUnity.g:824:3: otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUnity.g:828:3: ( (lv_from_1_0= ruleValue ) )
            // InternalUnity.g:829:4: (lv_from_1_0= ruleValue )
            {
            // InternalUnity.g:829:4: (lv_from_1_0= ruleValue )
            // InternalUnity.g:830:5: lv_from_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getFromValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalUnity.g:851:3: ( (lv_to_3_0= ruleValue ) )
            // InternalUnity.g:852:4: (lv_to_3_0= ruleValue )
            {
            // InternalUnity.g:852:4: (lv_to_3_0= ruleValue )
            // InternalUnity.g:853:5: lv_to_3_0= ruleValue
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:878:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalUnity.g:878:46: (iv_ruleValue= ruleValue EOF )
            // InternalUnity.g:879:2: iv_ruleValue= ruleValue EOF
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
    // InternalUnity.g:885:1: ruleValue returns [EObject current=null] : ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_minues_0_0=null;
        Token lv_value_1_0=null;
        EObject lv_fixedPointValue_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:891:2: ( ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) ) )
            // InternalUnity.g:892:2: ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) )
            {
            // InternalUnity.g:892:2: ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==24) ) {
                    alt14=2;
                }
                else if ( (LA14_2==EOF||LA14_2==21||LA14_2==31) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUnity.g:893:3: ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUnity.g:893:3: ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUnity.g:894:4: ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUnity.g:894:4: ( (lv_minues_0_0= '-' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==31) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalUnity.g:895:5: (lv_minues_0_0= '-' )
                            {
                            // InternalUnity.g:895:5: (lv_minues_0_0= '-' )
                            // InternalUnity.g:896:6: lv_minues_0_0= '-'
                            {
                            lv_minues_0_0=(Token)match(input,31,FOLLOW_20); if (state.failed) return current;
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

                    // InternalUnity.g:908:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUnity.g:909:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUnity.g:909:5: (lv_value_1_0= RULE_INT )
                    // InternalUnity.g:910:6: lv_value_1_0= RULE_INT
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
                    // InternalUnity.g:928:3: ( (lv_fixedPointValue_2_0= ruleRealLiteral ) )
                    {
                    // InternalUnity.g:928:3: ( (lv_fixedPointValue_2_0= ruleRealLiteral ) )
                    // InternalUnity.g:929:4: (lv_fixedPointValue_2_0= ruleRealLiteral )
                    {
                    // InternalUnity.g:929:4: (lv_fixedPointValue_2_0= ruleRealLiteral )
                    // InternalUnity.g:930:5: lv_fixedPointValue_2_0= ruleRealLiteral
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
    // InternalUnity.g:951:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalUnity.g:951:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalUnity.g:952:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalUnity.g:958:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intPart_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalPart_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:964:2: ( ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) ) )
            // InternalUnity.g:965:2: ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) )
            {
            // InternalUnity.g:965:2: ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) )
            // InternalUnity.g:966:3: ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) )
            {
            // InternalUnity.g:966:3: ( (lv_intPart_0_0= RULE_INT ) )
            // InternalUnity.g:967:4: (lv_intPart_0_0= RULE_INT )
            {
            // InternalUnity.g:967:4: (lv_intPart_0_0= RULE_INT )
            // InternalUnity.g:968:5: lv_intPart_0_0= RULE_INT
            {
            lv_intPart_0_0=(Token)match(input,RULE_INT,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_intPart_0_0, grammarAccess.getRealLiteralAccess().getIntPartINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"intPart",
              						lv_intPart_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRealLiteralAccess().getFullStopKeyword_1());
              		
            }
            // InternalUnity.g:988:3: ( (lv_decimalPart_2_0= RULE_INT ) )
            // InternalUnity.g:989:4: (lv_decimalPart_2_0= RULE_INT )
            {
            // InternalUnity.g:989:4: (lv_decimalPart_2_0= RULE_INT )
            // InternalUnity.g:990:5: lv_decimalPart_2_0= RULE_INT
            {
            lv_decimalPart_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_decimalPart_2_0, grammarAccess.getRealLiteralAccess().getDecimalPartINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"decimalPart",
              						lv_decimalPart_2_0,
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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleUnityObject"
    // InternalUnity.g:1010:1: entryRuleUnityObject returns [EObject current=null] : iv_ruleUnityObject= ruleUnityObject EOF ;
    public final EObject entryRuleUnityObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnityObject = null;


        try {
            // InternalUnity.g:1010:52: (iv_ruleUnityObject= ruleUnityObject EOF )
            // InternalUnity.g:1011:2: iv_ruleUnityObject= ruleUnityObject EOF
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
    // InternalUnity.g:1017:1: ruleUnityObject returns [EObject current=null] : (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' ) ;
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
            // InternalUnity.g:1023:2: ( (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' ) )
            // InternalUnity.g:1024:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' )
            {
            // InternalUnity.g:1024:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' )
            // InternalUnity.g:1025:3: otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnityObjectAccess().getObjectKeyword_0());
              		
            }
            // InternalUnity.g:1029:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1030:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1030:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1031:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnityObjectAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:1051:3: ( (otherlv_3= RULE_ID ) )
            // InternalUnity.g:1052:4: (otherlv_3= RULE_ID )
            {
            // InternalUnity.g:1052:4: (otherlv_3= RULE_ID )
            // InternalUnity.g:1053:5: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,17,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getUnityObjectAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUnity.g:1068:3: ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )*
            loop15:
            do {
                int alt15=5;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    alt15=1;
                    }
                    break;
                case 19:
                    {
                    alt15=2;
                    }
                    break;
                case 33:
                    {
                    alt15=3;
                    }
                    break;
                case 25:
                    {
                    alt15=4;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalUnity.g:1069:4: ( (lv_configurations_5_0= ruleConfigAssignment ) )
            	    {
            	    // InternalUnity.g:1069:4: ( (lv_configurations_5_0= ruleConfigAssignment ) )
            	    // InternalUnity.g:1070:5: (lv_configurations_5_0= ruleConfigAssignment )
            	    {
            	    // InternalUnity.g:1070:5: (lv_configurations_5_0= ruleConfigAssignment )
            	    // InternalUnity.g:1071:6: lv_configurations_5_0= ruleConfigAssignment
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
            	    // InternalUnity.g:1089:4: ( (lv_newActions_6_0= ruleAction ) )
            	    {
            	    // InternalUnity.g:1089:4: ( (lv_newActions_6_0= ruleAction ) )
            	    // InternalUnity.g:1090:5: (lv_newActions_6_0= ruleAction )
            	    {
            	    // InternalUnity.g:1090:5: (lv_newActions_6_0= ruleAction )
            	    // InternalUnity.g:1091:6: lv_newActions_6_0= ruleAction
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
            	    // InternalUnity.g:1109:4: ( (lv_overrideActions_7_0= ruleOverrideAction ) )
            	    {
            	    // InternalUnity.g:1109:4: ( (lv_overrideActions_7_0= ruleOverrideAction ) )
            	    // InternalUnity.g:1110:5: (lv_overrideActions_7_0= ruleOverrideAction )
            	    {
            	    // InternalUnity.g:1110:5: (lv_overrideActions_7_0= ruleOverrideAction )
            	    // InternalUnity.g:1111:6: lv_overrideActions_7_0= ruleOverrideAction
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
            	    // InternalUnity.g:1129:4: ( (lv_properties_8_0= ruleAttribute ) )
            	    {
            	    // InternalUnity.g:1129:4: ( (lv_properties_8_0= ruleAttribute ) )
            	    // InternalUnity.g:1130:5: (lv_properties_8_0= ruleAttribute )
            	    {
            	    // InternalUnity.g:1130:5: (lv_properties_8_0= ruleAttribute )
            	    // InternalUnity.g:1131:6: lv_properties_8_0= ruleAttribute
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
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:1157:1: entryRuleOverrideAction returns [EObject current=null] : iv_ruleOverrideAction= ruleOverrideAction EOF ;
    public final EObject entryRuleOverrideAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideAction = null;


        try {
            // InternalUnity.g:1157:55: (iv_ruleOverrideAction= ruleOverrideAction EOF )
            // InternalUnity.g:1158:2: iv_ruleOverrideAction= ruleOverrideAction EOF
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
    // InternalUnity.g:1164:1: ruleOverrideAction returns [EObject current=null] : (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' ) ;
    public final EObject ruleOverrideAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1170:2: ( (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' ) )
            // InternalUnity.g:1171:2: (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' )
            {
            // InternalUnity.g:1171:2: (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' )
            // InternalUnity.g:1172:3: otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOverrideActionAccess().getOverrideKeyword_0());
              		
            }
            // InternalUnity.g:1176:3: ( (otherlv_1= RULE_ID ) )
            // InternalUnity.g:1177:4: (otherlv_1= RULE_ID )
            {
            // InternalUnity.g:1177:4: (otherlv_1= RULE_ID )
            // InternalUnity.g:1178:5: otherlv_1= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOverrideActionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUnity.g:1193:3: ( (lv_expressions_3_0= ruleExpression ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==20||LA16_0==31||LA16_0==61) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUnity.g:1194:4: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // InternalUnity.g:1194:4: (lv_expressions_3_0= ruleExpression )
            	    // InternalUnity.g:1195:5: lv_expressions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOverrideActionAccess().getExpressionsExpressionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:1220:1: entryRuleConfigAssignment returns [EObject current=null] : iv_ruleConfigAssignment= ruleConfigAssignment EOF ;
    public final EObject entryRuleConfigAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigAssignment = null;


        try {
            // InternalUnity.g:1220:57: (iv_ruleConfigAssignment= ruleConfigAssignment EOF )
            // InternalUnity.g:1221:2: iv_ruleConfigAssignment= ruleConfigAssignment EOF
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
    // InternalUnity.g:1227:1: ruleConfigAssignment returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' ) ;
    public final EObject ruleConfigAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_configs_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1233:2: ( (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' ) )
            // InternalUnity.g:1234:2: (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' )
            {
            // InternalUnity.g:1234:2: (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' )
            // InternalUnity.g:1235:3: otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigAssignmentAccess().getConfigKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigAssignmentAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUnity.g:1243:3: ()
            // InternalUnity.g:1244:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigAssignmentAccess().getConfigAssignmentAction_2(),
              					current);
              			
            }

            }

            // InternalUnity.g:1250:3: ( (lv_configs_3_0= ruleConfig ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUnity.g:1251:4: (lv_configs_3_0= ruleConfig )
            	    {
            	    // InternalUnity.g:1251:4: (lv_configs_3_0= ruleConfig )
            	    // InternalUnity.g:1252:5: lv_configs_3_0= ruleConfig
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConfigAssignmentAccess().getConfigsConfigParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:1277:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalUnity.g:1277:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalUnity.g:1278:2: iv_ruleConfig= ruleConfig EOF
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
    // InternalUnity.g:1284:1: ruleConfig returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_propertyValue_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1290:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) ) )
            // InternalUnity.g:1291:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) )
            {
            // InternalUnity.g:1291:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) )
            // InternalUnity.g:1292:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) )
            {
            // InternalUnity.g:1292:3: ( (otherlv_0= RULE_ID ) )
            // InternalUnity.g:1293:4: (otherlv_0= RULE_ID )
            {
            // InternalUnity.g:1293:4: (otherlv_0= RULE_ID )
            // InternalUnity.g:1294:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getPropertyNameAttributeCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalUnity.g:1309:3: ( (lv_propertyValue_2_0= ruleExpression ) )
            // InternalUnity.g:1310:4: (lv_propertyValue_2_0= ruleExpression )
            {
            // InternalUnity.g:1310:4: (lv_propertyValue_2_0= ruleExpression )
            // InternalUnity.g:1311:5: lv_propertyValue_2_0= ruleExpression
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
    // InternalUnity.g:1332:1: entryRuleENV returns [EObject current=null] : iv_ruleENV= ruleENV EOF ;
    public final EObject entryRuleENV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENV = null;


        try {
            // InternalUnity.g:1332:44: (iv_ruleENV= ruleENV EOF )
            // InternalUnity.g:1333:2: iv_ruleENV= ruleENV EOF
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
    // InternalUnity.g:1339:1: ruleENV returns [EObject current=null] : (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' ) ;
    public final EObject ruleENV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_channels_3_0 = null;

        EObject lv_maps_4_0 = null;

        EObject lv_instances_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_initCodes_7_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1345:2: ( (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' ) )
            // InternalUnity.g:1346:2: (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' )
            {
            // InternalUnity.g:1346:2: (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' )
            // InternalUnity.g:1347:3: otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getENVAccess().getEnvKeyword_0());
              		
            }
            // InternalUnity.g:1351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1352:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1353:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getENVAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUnity.g:1373:3: ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )*
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt18=1;
                    }
                    break;
                case 40:
                    {
                    alt18=2;
                    }
                    break;
                case 37:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (LA18_4==RULE_ID) ) {
                        int LA18_6 = input.LA(3);

                        if ( (LA18_6==13) ) {
                            int LA18_7 = input.LA(4);

                            if ( (LA18_7==RULE_ID) ) {
                                alt18=3;
                            }


                        }


                    }


                    }
                    break;
                case RULE_ID:
                case 25:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalUnity.g:1374:4: ( (lv_channels_3_0= ruleChannel ) )
            	    {
            	    // InternalUnity.g:1374:4: ( (lv_channels_3_0= ruleChannel ) )
            	    // InternalUnity.g:1375:5: (lv_channels_3_0= ruleChannel )
            	    {
            	    // InternalUnity.g:1375:5: (lv_channels_3_0= ruleChannel )
            	    // InternalUnity.g:1376:6: lv_channels_3_0= ruleChannel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getChannelsChannelParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    // InternalUnity.g:1394:4: ( (lv_maps_4_0= ruleMap ) )
            	    {
            	    // InternalUnity.g:1394:4: ( (lv_maps_4_0= ruleMap ) )
            	    // InternalUnity.g:1395:5: (lv_maps_4_0= ruleMap )
            	    {
            	    // InternalUnity.g:1395:5: (lv_maps_4_0= ruleMap )
            	    // InternalUnity.g:1396:6: lv_maps_4_0= ruleMap
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getMapsMapParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    // InternalUnity.g:1414:4: ( (lv_instances_5_0= ruleInstance ) )
            	    {
            	    // InternalUnity.g:1414:4: ( (lv_instances_5_0= ruleInstance ) )
            	    // InternalUnity.g:1415:5: (lv_instances_5_0= ruleInstance )
            	    {
            	    // InternalUnity.g:1415:5: (lv_instances_5_0= ruleInstance )
            	    // InternalUnity.g:1416:6: lv_instances_5_0= ruleInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getInstancesInstanceParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    // InternalUnity.g:1434:4: ( (lv_properties_6_0= ruleProperty ) )
            	    {
            	    // InternalUnity.g:1434:4: ( (lv_properties_6_0= ruleProperty ) )
            	    // InternalUnity.g:1435:5: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalUnity.g:1435:5: (lv_properties_6_0= ruleProperty )
            	    // InternalUnity.g:1436:6: lv_properties_6_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getPropertiesPropertyParserRuleCall_3_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop18;
                }
            } while (true);

            // InternalUnity.g:1454:3: ( (lv_initCodes_7_0= ruleInit ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUnity.g:1455:4: (lv_initCodes_7_0= ruleInit )
                    {
                    // InternalUnity.g:1455:4: (lv_initCodes_7_0= ruleInit )
                    // InternalUnity.g:1456:5: lv_initCodes_7_0= ruleInit
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

            otherlv_8=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getENVAccess().getRightCurlyBracketKeyword_5());
              		
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


    // $ANTLR start "entryRuleInstance"
    // InternalUnity.g:1481:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalUnity.g:1481:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalUnity.g:1482:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalUnity.g:1488:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUnity.g:1494:2: ( (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalUnity.g:1495:2: (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalUnity.g:1495:2: (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalUnity.g:1496:3: otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
              		
            }
            // InternalUnity.g:1500:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1501:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1501:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1502:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:1522:3: ( (otherlv_3= RULE_ID ) )
            // InternalUnity.g:1523:4: (otherlv_3= RULE_ID )
            {
            // InternalUnity.g:1523:4: (otherlv_3= RULE_ID )
            // InternalUnity.g:1524:5: otherlv_3= RULE_ID
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
    // InternalUnity.g:1539:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalUnity.g:1539:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalUnity.g:1540:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalUnity.g:1546:1: ruleChannel returns [EObject current=null] : (otherlv_0= 'Channel' ( (lv_interfaceName_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleinterfaceType ) ) (otherlv_3= 'cardinality' ( (lv_cardinality_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) ) | ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) ) ) otherlv_12= ')' ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_interfaceName_1_0=null;
        Token otherlv_3=null;
        Token lv_cardinality_4_0=null;
        Token otherlv_5=null;
        Token lv_ip_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_type_2_0 = null;

        EObject lv_port_8_0 = null;

        EObject lv_areaname_9_0 = null;

        EObject lv_qname_11_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1552:2: ( (otherlv_0= 'Channel' ( (lv_interfaceName_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleinterfaceType ) ) (otherlv_3= 'cardinality' ( (lv_cardinality_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) ) | ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) ) ) otherlv_12= ')' ) )
            // InternalUnity.g:1553:2: (otherlv_0= 'Channel' ( (lv_interfaceName_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleinterfaceType ) ) (otherlv_3= 'cardinality' ( (lv_cardinality_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) ) | ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) ) ) otherlv_12= ')' )
            {
            // InternalUnity.g:1553:2: (otherlv_0= 'Channel' ( (lv_interfaceName_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleinterfaceType ) ) (otherlv_3= 'cardinality' ( (lv_cardinality_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) ) | ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) ) ) otherlv_12= ')' )
            // InternalUnity.g:1554:3: otherlv_0= 'Channel' ( (lv_interfaceName_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleinterfaceType ) ) (otherlv_3= 'cardinality' ( (lv_cardinality_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) ) | ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
              		
            }
            // InternalUnity.g:1558:3: ( (lv_interfaceName_1_0= RULE_ID ) )
            // InternalUnity.g:1559:4: (lv_interfaceName_1_0= RULE_ID )
            {
            // InternalUnity.g:1559:4: (lv_interfaceName_1_0= RULE_ID )
            // InternalUnity.g:1560:5: lv_interfaceName_1_0= RULE_ID
            {
            lv_interfaceName_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_interfaceName_1_0, grammarAccess.getChannelAccess().getInterfaceNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChannelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"interfaceName",
              						lv_interfaceName_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUnity.g:1576:3: ( (lv_type_2_0= ruleinterfaceType ) )
            // InternalUnity.g:1577:4: (lv_type_2_0= ruleinterfaceType )
            {
            // InternalUnity.g:1577:4: (lv_type_2_0= ruleinterfaceType )
            // InternalUnity.g:1578:5: lv_type_2_0= ruleinterfaceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChannelAccess().getTypeInterfaceTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_type_2_0=ruleinterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChannelRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"cs.queensu.ca.Unity.interfaceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUnity.g:1595:3: (otherlv_3= 'cardinality' ( (lv_cardinality_4_0= RULE_INT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUnity.g:1596:4: otherlv_3= 'cardinality' ( (lv_cardinality_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getCardinalityKeyword_3_0());
                      			
                    }
                    // InternalUnity.g:1600:4: ( (lv_cardinality_4_0= RULE_INT ) )
                    // InternalUnity.g:1601:5: (lv_cardinality_4_0= RULE_INT )
                    {
                    // InternalUnity.g:1601:5: (lv_cardinality_4_0= RULE_INT )
                    // InternalUnity.g:1602:6: lv_cardinality_4_0= RULE_INT
                    {
                    lv_cardinality_4_0=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_cardinality_4_0, grammarAccess.getChannelAccess().getCardinalityINTTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getChannelRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"cardinality",
                      							lv_cardinality_4_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalUnity.g:1623:3: ( ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) ) | ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==44) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUnity.g:1624:4: ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) )
                    {
                    // InternalUnity.g:1624:4: ( ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) ) )
                    // InternalUnity.g:1625:5: ( (lv_ip_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_port_8_0= rulePort ) )
                    {
                    // InternalUnity.g:1625:5: ( (lv_ip_6_0= RULE_ID ) )
                    // InternalUnity.g:1626:6: (lv_ip_6_0= RULE_ID )
                    {
                    // InternalUnity.g:1626:6: (lv_ip_6_0= RULE_ID )
                    // InternalUnity.g:1627:7: lv_ip_6_0= RULE_ID
                    {
                    lv_ip_6_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_ip_6_0, grammarAccess.getChannelAccess().getIpIDTerminalRuleCall_5_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getChannelRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"ip",
                      								lv_ip_6_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getChannelAccess().getCommaKeyword_5_0_1());
                      				
                    }
                    // InternalUnity.g:1647:5: ( (lv_port_8_0= rulePort ) )
                    // InternalUnity.g:1648:6: (lv_port_8_0= rulePort )
                    {
                    // InternalUnity.g:1648:6: (lv_port_8_0= rulePort )
                    // InternalUnity.g:1649:7: lv_port_8_0= rulePort
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getChannelAccess().getPortPortParserRuleCall_5_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_port_8_0=rulePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getChannelRule());
                      							}
                      							set(
                      								current,
                      								"port",
                      								lv_port_8_0,
                      								"cs.queensu.ca.Unity.Port");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnity.g:1668:4: ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) )
                    {
                    // InternalUnity.g:1668:4: ( ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) ) )
                    // InternalUnity.g:1669:5: ( (lv_areaname_9_0= ruleAreaName ) ) otherlv_10= ',' ( (lv_qname_11_0= ruleQName ) )
                    {
                    // InternalUnity.g:1669:5: ( (lv_areaname_9_0= ruleAreaName ) )
                    // InternalUnity.g:1670:6: (lv_areaname_9_0= ruleAreaName )
                    {
                    // InternalUnity.g:1670:6: (lv_areaname_9_0= ruleAreaName )
                    // InternalUnity.g:1671:7: lv_areaname_9_0= ruleAreaName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getChannelAccess().getAreanameAreaNameParserRuleCall_5_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_31);
                    lv_areaname_9_0=ruleAreaName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getChannelRule());
                      							}
                      							set(
                      								current,
                      								"areaname",
                      								lv_areaname_9_0,
                      								"cs.queensu.ca.Unity.AreaName");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getChannelAccess().getCommaKeyword_5_1_1());
                      				
                    }
                    // InternalUnity.g:1692:5: ( (lv_qname_11_0= ruleQName ) )
                    // InternalUnity.g:1693:6: (lv_qname_11_0= ruleQName )
                    {
                    // InternalUnity.g:1693:6: (lv_qname_11_0= ruleQName )
                    // InternalUnity.g:1694:7: lv_qname_11_0= ruleQName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getChannelAccess().getQnameQNameParserRuleCall_5_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_qname_11_0=ruleQName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getChannelRule());
                      							}
                      							set(
                      								current,
                      								"qname",
                      								lv_qname_11_0,
                      								"cs.queensu.ca.Unity.QName");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getChannelAccess().getRightParenthesisKeyword_6());
              		
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


    // $ANTLR start "entryRuleInit"
    // InternalUnity.g:1721:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalUnity.g:1721:45: (iv_ruleInit= ruleInit EOF )
            // InternalUnity.g:1722:2: iv_ruleInit= ruleInit EOF
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
    // InternalUnity.g:1728:1: ruleInit returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1734:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) )
            // InternalUnity.g:1735:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            {
            // InternalUnity.g:1735:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            // InternalUnity.g:1736:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitAccess().getConfigKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUnity.g:1744:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==20||LA22_0==31||LA22_0==61) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUnity.g:1745:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalUnity.g:1745:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalUnity.g:1746:5: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitAccess().getExpressionsExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:1771:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalUnity.g:1771:44: (iv_ruleMap= ruleMap EOF )
            // InternalUnity.g:1772:2: iv_ruleMap= ruleMap EOF
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
    // InternalUnity.g:1778:1: ruleMap returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_mapName_2_0=null;
        Token otherlv_3=null;
        EObject lv_pathName_4_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1784:2: ( (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) ) )
            // InternalUnity.g:1785:2: (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) )
            {
            // InternalUnity.g:1785:2: (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) )
            // InternalUnity.g:1786:3: otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getLoadKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getMapKeyword_1());
              		
            }
            // InternalUnity.g:1794:3: ( (lv_mapName_2_0= RULE_ID ) )
            // InternalUnity.g:1795:4: (lv_mapName_2_0= RULE_ID )
            {
            // InternalUnity.g:1795:4: (lv_mapName_2_0= RULE_ID )
            // InternalUnity.g:1796:5: lv_mapName_2_0= RULE_ID
            {
            lv_mapName_2_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,42,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMapAccess().getFromKeyword_3());
              		
            }
            // InternalUnity.g:1816:3: ( (lv_pathName_4_0= ruleStLiteral ) )
            // InternalUnity.g:1817:4: (lv_pathName_4_0= ruleStLiteral )
            {
            // InternalUnity.g:1817:4: (lv_pathName_4_0= ruleStLiteral )
            // InternalUnity.g:1818:5: lv_pathName_4_0= ruleStLiteral
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
    // InternalUnity.g:1839:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // InternalUnity.g:1839:46: (iv_ruleQName= ruleQName EOF )
            // InternalUnity.g:1840:2: iv_ruleQName= ruleQName EOF
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
    // InternalUnity.g:1846:1: ruleQName returns [EObject current=null] : (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1852:2: ( (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUnity.g:1853:2: (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUnity.g:1853:2: (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUnity.g:1854:3: otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQNameAccess().getQnameKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQNameAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1862:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUnity.g:1863:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUnity.g:1863:4: (lv_name_2_0= RULE_ID )
            // InternalUnity.g:1864:5: lv_name_2_0= RULE_ID
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
    // InternalUnity.g:1884:1: entryRuleAreaName returns [EObject current=null] : iv_ruleAreaName= ruleAreaName EOF ;
    public final EObject entryRuleAreaName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaName = null;


        try {
            // InternalUnity.g:1884:49: (iv_ruleAreaName= ruleAreaName EOF )
            // InternalUnity.g:1885:2: iv_ruleAreaName= ruleAreaName EOF
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
    // InternalUnity.g:1891:1: ruleAreaName returns [EObject current=null] : (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAreaName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1897:2: ( (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUnity.g:1898:2: (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUnity.g:1898:2: (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUnity.g:1899:3: otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAreaNameAccess().getAreaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAreaNameAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1907:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUnity.g:1908:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUnity.g:1908:4: (lv_name_2_0= RULE_ID )
            // InternalUnity.g:1909:5: lv_name_2_0= RULE_ID
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
    // InternalUnity.g:1929:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalUnity.g:1929:45: (iv_rulePort= rulePort EOF )
            // InternalUnity.g:1930:2: iv_rulePort= rulePort EOF
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
    // InternalUnity.g:1936:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'portnumber' otherlv_4= ':' ( (lv_portnumber_5_0= RULE_INT ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_portnumber_5_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1942:2: ( (otherlv_0= 'port' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'portnumber' otherlv_4= ':' ( (lv_portnumber_5_0= RULE_INT ) ) ) )
            // InternalUnity.g:1943:2: (otherlv_0= 'port' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'portnumber' otherlv_4= ':' ( (lv_portnumber_5_0= RULE_INT ) ) )
            {
            // InternalUnity.g:1943:2: (otherlv_0= 'port' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'portnumber' otherlv_4= ':' ( (lv_portnumber_5_0= RULE_INT ) ) )
            // InternalUnity.g:1944:3: otherlv_0= 'port' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'portnumber' otherlv_4= ':' ( (lv_portnumber_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1952:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUnity.g:1953:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUnity.g:1953:4: (lv_name_2_0= RULE_ID )
            // InternalUnity.g:1954:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getPortnumberKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPortAccess().getColonKeyword_4());
              		
            }
            // InternalUnity.g:1978:3: ( (lv_portnumber_5_0= RULE_INT ) )
            // InternalUnity.g:1979:4: (lv_portnumber_5_0= RULE_INT )
            {
            // InternalUnity.g:1979:4: (lv_portnumber_5_0= RULE_INT )
            // InternalUnity.g:1980:5: lv_portnumber_5_0= RULE_INT
            {
            lv_portnumber_5_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_portnumber_5_0, grammarAccess.getPortAccess().getPortnumberINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"portnumber",
              						lv_portnumber_5_0,
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
    // InternalUnity.g:2000:1: entryRuleinterfaceType returns [EObject current=null] : iv_ruleinterfaceType= ruleinterfaceType EOF ;
    public final EObject entryRuleinterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterfaceType = null;


        try {
            // InternalUnity.g:2000:54: (iv_ruleinterfaceType= ruleinterfaceType EOF )
            // InternalUnity.g:2001:2: iv_ruleinterfaceType= ruleinterfaceType EOF
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
    // InternalUnity.g:2007:1: ruleinterfaceType returns [EObject current=null] : ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) ) ;
    public final EObject ruleinterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalUnity.g:2013:2: ( ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) ) )
            // InternalUnity.g:2014:2: ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) )
            {
            // InternalUnity.g:2014:2: ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) )
            // InternalUnity.g:2015:3: ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) )
            {
            // InternalUnity.g:2015:3: ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) )
            // InternalUnity.g:2016:4: (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' )
            {
            // InternalUnity.g:2016:4: (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            else if ( (LA23_0==48) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUnity.g:2017:5: lv_name_0_1= 'TCP'
                    {
                    lv_name_0_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUnity.g:2028:5: lv_name_0_2= 'IPC'
                    {
                    lv_name_0_2=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:2044:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUnity.g:2044:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUnity.g:2045:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalUnity.g:2051:1: ruleExpression returns [EObject current=null] : this_Assign_0= ruleAssign ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2057:2: (this_Assign_0= ruleAssign )
            // InternalUnity.g:2058:2: this_Assign_0= ruleAssign
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
    // InternalUnity.g:2069:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalUnity.g:2069:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalUnity.g:2070:2: iv_ruleAssign= ruleAssign EOF
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
    // InternalUnity.g:2076:1: ruleAssign returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2082:2: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* ) )
            // InternalUnity.g:2083:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            {
            // InternalUnity.g:2083:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            // InternalUnity.g:2084:3: this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2092:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUnity.g:2093:4: () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) )
            	    {
            	    // InternalUnity.g:2093:4: ()
            	    // InternalUnity.g:2094:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAssignAccess().getAssignLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2104:4: ( (lv_right_3_0= ruleOrExpression ) )
            	    // InternalUnity.g:2105:5: (lv_right_3_0= ruleOrExpression )
            	    {
            	    // InternalUnity.g:2105:5: (lv_right_3_0= ruleOrExpression )
            	    // InternalUnity.g:2106:6: lv_right_3_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignAccess().getRightOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop24;
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
    // InternalUnity.g:2128:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalUnity.g:2128:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalUnity.g:2129:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalUnity.g:2135:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2141:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalUnity.g:2142:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalUnity.g:2142:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalUnity.g:2143:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2151:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUnity.g:2152:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalUnity.g:2152:4: ()
            	    // InternalUnity.g:2153:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2163:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalUnity.g:2164:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalUnity.g:2164:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalUnity.g:2165:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop25;
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
    // InternalUnity.g:2187:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalUnity.g:2187:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalUnity.g:2188:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalUnity.g:2194:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperators_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2200:2: ( (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* ) )
            // InternalUnity.g:2201:2: (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* )
            {
            // InternalUnity.g:2201:2: (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* )
            // InternalUnity.g:2202:3: this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonOperatorsParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_ComparisonOperators_0=ruleComparisonOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonOperators_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2210:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUnity.g:2211:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) )
            	    {
            	    // InternalUnity.g:2211:4: ()
            	    // InternalUnity.g:2212:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2222:4: ( (lv_right_3_0= ruleComparisonOperators ) )
            	    // InternalUnity.g:2223:5: (lv_right_3_0= ruleComparisonOperators )
            	    {
            	    // InternalUnity.g:2223:5: (lv_right_3_0= ruleComparisonOperators )
            	    // InternalUnity.g:2224:6: lv_right_3_0= ruleComparisonOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonOperatorsParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop26;
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
    // InternalUnity.g:2246:1: entryRuleComparisonOperators returns [EObject current=null] : iv_ruleComparisonOperators= ruleComparisonOperators EOF ;
    public final EObject entryRuleComparisonOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperators = null;


        try {
            // InternalUnity.g:2246:60: (iv_ruleComparisonOperators= ruleComparisonOperators EOF )
            // InternalUnity.g:2247:2: iv_ruleComparisonOperators= ruleComparisonOperators EOF
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
    // InternalUnity.g:2253:1: ruleComparisonOperators returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* ) ;
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
            // InternalUnity.g:2259:2: ( (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* ) )
            // InternalUnity.g:2260:2: (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* )
            {
            // InternalUnity.g:2260:2: (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* )
            // InternalUnity.g:2261:3: this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getAdditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Addition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2269:3: ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==51) && (synpred1_InternalUnity())) {
                    alt28=1;
                }
                else if ( (LA28_0==52) && (synpred1_InternalUnity())) {
                    alt28=1;
                }
                else if ( (LA28_0==53) && (synpred1_InternalUnity())) {
                    alt28=1;
                }
                else if ( (LA28_0==54) && (synpred1_InternalUnity())) {
                    alt28=1;
                }
                else if ( (LA28_0==55) && (synpred1_InternalUnity())) {
                    alt28=1;
                }
                else if ( (LA28_0==56) && (synpred1_InternalUnity())) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUnity.g:2270:4: ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) )
            	    {
            	    // InternalUnity.g:2270:4: ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) )
            	    // InternalUnity.g:2271:5: ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) )
            	    {
            	    // InternalUnity.g:2309:5: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) )
            	    int alt27=6;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt27=5;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt27=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // InternalUnity.g:2310:6: ( () otherlv_2= '>' )
            	            {
            	            // InternalUnity.g:2310:6: ( () otherlv_2= '>' )
            	            // InternalUnity.g:2311:7: () otherlv_2= '>'
            	            {
            	            // InternalUnity.g:2311:7: ()
            	            // InternalUnity.g:2312:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getGTLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2324:6: ( () otherlv_4= '<' )
            	            {
            	            // InternalUnity.g:2324:6: ( () otherlv_4= '<' )
            	            // InternalUnity.g:2325:7: () otherlv_4= '<'
            	            {
            	            // InternalUnity.g:2325:7: ()
            	            // InternalUnity.g:2326:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getLTLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getComparisonOperatorsAccess().getLessThanSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:2338:6: ( () otherlv_6= '>=' )
            	            {
            	            // InternalUnity.g:2338:6: ( () otherlv_6= '>=' )
            	            // InternalUnity.g:2339:7: () otherlv_6= '>='
            	            {
            	            // InternalUnity.g:2339:7: ()
            	            // InternalUnity.g:2340:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getGELeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,53,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalUnity.g:2352:6: ( () otherlv_8= '<=' )
            	            {
            	            // InternalUnity.g:2352:6: ( () otherlv_8= '<=' )
            	            // InternalUnity.g:2353:7: () otherlv_8= '<='
            	            {
            	            // InternalUnity.g:2353:7: ()
            	            // InternalUnity.g:2354:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getLELeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,54,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getComparisonOperatorsAccess().getLessThanSignEqualsSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalUnity.g:2366:6: ( () otherlv_10= '==' )
            	            {
            	            // InternalUnity.g:2366:6: ( () otherlv_10= '==' )
            	            // InternalUnity.g:2367:7: () otherlv_10= '=='
            	            {
            	            // InternalUnity.g:2367:7: ()
            	            // InternalUnity.g:2368:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getEQLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,55,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getComparisonOperatorsAccess().getEqualsSignEqualsSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalUnity.g:2380:6: ( () otherlv_12= '!=' )
            	            {
            	            // InternalUnity.g:2380:6: ( () otherlv_12= '!=' )
            	            // InternalUnity.g:2381:7: () otherlv_12= '!='
            	            {
            	            // InternalUnity.g:2381:7: ()
            	            // InternalUnity.g:2382:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getNELeftAction_1_0_0_5_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_12=(Token)match(input,56,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_12, grammarAccess.getComparisonOperatorsAccess().getExclamationMarkEqualsSignKeyword_1_0_0_5_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2395:4: ( (lv_rest_13_0= ruleAddition ) )
            	    // InternalUnity.g:2396:5: (lv_rest_13_0= ruleAddition )
            	    {
            	    // InternalUnity.g:2396:5: (lv_rest_13_0= ruleAddition )
            	    // InternalUnity.g:2397:6: lv_rest_13_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRestAdditionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    break loop28;
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
    // InternalUnity.g:2419:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalUnity.g:2419:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalUnity.g:2420:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalUnity.g:2426:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2432:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalUnity.g:2433:2: (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalUnity.g:2433:2: (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalUnity.g:2434:3: this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2442:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // InternalUnity.g:2443:4: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalUnity.g:2443:4: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) )
            	    // InternalUnity.g:2444:5: ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    {
            	    // InternalUnity.g:2458:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==57) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==31) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalUnity.g:2459:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalUnity.g:2459:6: ( () otherlv_2= '+' )
            	            // InternalUnity.g:2460:7: () otherlv_2= '+'
            	            {
            	            // InternalUnity.g:2460:7: ()
            	            // InternalUnity.g:2461:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,57,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2473:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalUnity.g:2473:6: ( () otherlv_4= '-' )
            	            // InternalUnity.g:2474:7: () otherlv_4= '-'
            	            {
            	            // InternalUnity.g:2474:7: ()
            	            // InternalUnity.g:2475:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2488:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalUnity.g:2489:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalUnity.g:2489:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalUnity.g:2490:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    break loop30;
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
    // InternalUnity.g:2512:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalUnity.g:2512:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalUnity.g:2513:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalUnity.g:2519:1: ruleMultiplication returns [EObject current=null] : (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Unary_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2525:2: ( (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* ) )
            // InternalUnity.g:2526:2: (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* )
            {
            // InternalUnity.g:2526:2: (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* )
            // InternalUnity.g:2527:3: this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getUnaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_Unary_0=ruleUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Unary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2535:3: ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==58) && (synpred3_InternalUnity())) {
                    alt32=1;
                }
                else if ( (LA32_0==59) && (synpred3_InternalUnity())) {
                    alt32=1;
                }
                else if ( (LA32_0==60) && (synpred3_InternalUnity())) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUnity.g:2536:4: ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) )
            	    {
            	    // InternalUnity.g:2536:4: ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) )
            	    // InternalUnity.g:2537:5: ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    {
            	    // InternalUnity.g:2557:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 58:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // InternalUnity.g:2558:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalUnity.g:2558:6: ( () otherlv_2= '*' )
            	            // InternalUnity.g:2559:7: () otherlv_2= '*'
            	            {
            	            // InternalUnity.g:2559:7: ()
            	            // InternalUnity.g:2560:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,58,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2572:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalUnity.g:2572:6: ( () otherlv_4= '/' )
            	            // InternalUnity.g:2573:7: () otherlv_4= '/'
            	            {
            	            // InternalUnity.g:2573:7: ()
            	            // InternalUnity.g:2574:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getDivideLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,59,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:2586:6: ( () otherlv_6= '%' )
            	            {
            	            // InternalUnity.g:2586:6: ( () otherlv_6= '%' )
            	            // InternalUnity.g:2587:7: () otherlv_6= '%'
            	            {
            	            // InternalUnity.g:2587:7: ()
            	            // InternalUnity.g:2588:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getModuloLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,60,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2601:4: ( (lv_right_7_0= ruleUnary ) )
            	    // InternalUnity.g:2602:5: (lv_right_7_0= ruleUnary )
            	    {
            	    // InternalUnity.g:2602:5: (lv_right_7_0= ruleUnary )
            	    // InternalUnity.g:2603:6: lv_right_7_0= ruleUnary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightUnaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleUnary"
    // InternalUnity.g:2625:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // InternalUnity.g:2625:46: (iv_ruleUnary= ruleUnary EOF )
            // InternalUnity.g:2626:2: iv_ruleUnary= ruleUnary EOF
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
    // InternalUnity.g:2632:1: ruleUnary returns [EObject current=null] : (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpressionNotPlusMinus_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2638:2: ( (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) ) )
            // InternalUnity.g:2639:2: (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) )
            {
            // InternalUnity.g:2639:2: (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==20||LA33_0==61) ) {
                alt33=1;
            }
            else if ( (LA33_0==31) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalUnity.g:2640:3: this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus
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
                    // InternalUnity.g:2649:3: ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) )
                    {
                    // InternalUnity.g:2649:3: ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) )
                    // InternalUnity.g:2650:4: () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) )
                    {
                    // InternalUnity.g:2650:4: ()
                    // InternalUnity.g:2651:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryAccess().getUnaryExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalUnity.g:2661:4: ( (lv_exp_3_0= ruleUnary ) )
                    // InternalUnity.g:2662:5: (lv_exp_3_0= ruleUnary )
                    {
                    // InternalUnity.g:2662:5: (lv_exp_3_0= ruleUnary )
                    // InternalUnity.g:2663:6: lv_exp_3_0= ruleUnary
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
    // InternalUnity.g:2685:1: entryRuleUnaryExpressionNotPlusMinus returns [EObject current=null] : iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF ;
    public final EObject entryRuleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpressionNotPlusMinus = null;


        try {
            // InternalUnity.g:2685:68: (iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF )
            // InternalUnity.g:2686:2: iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF
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
    // InternalUnity.g:2692:1: ruleUnaryExpressionNotPlusMinus returns [EObject current=null] : (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject this_NotBooleanExpression_0 = null;

        EObject this_PrimaryExpression_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:2698:2: ( (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression ) )
            // InternalUnity.g:2699:2: (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            {
            // InternalUnity.g:2699:2: (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==20) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalUnity.g:2700:3: this_NotBooleanExpression_0= ruleNotBooleanExpression
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
                    // InternalUnity.g:2709:3: this_PrimaryExpression_1= rulePrimaryExpression
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
    // InternalUnity.g:2721:1: entryRuleNotBooleanExpression returns [EObject current=null] : iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF ;
    public final EObject entryRuleNotBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotBooleanExpression = null;


        try {
            // InternalUnity.g:2721:61: (iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF )
            // InternalUnity.g:2722:2: iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF
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
    // InternalUnity.g:2728:1: ruleNotBooleanExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) ) ;
    public final EObject ruleNotBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2734:2: ( (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) ) )
            // InternalUnity.g:2735:2: (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) )
            {
            // InternalUnity.g:2735:2: (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) )
            // InternalUnity.g:2736:3: otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotBooleanExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalUnity.g:2740:3: ( (lv_exp_1_0= ruleUnary ) )
            // InternalUnity.g:2741:4: (lv_exp_1_0= ruleUnary )
            {
            // InternalUnity.g:2741:4: (lv_exp_1_0= ruleUnary )
            // InternalUnity.g:2742:5: lv_exp_1_0= ruleUnary
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
    // InternalUnity.g:2763:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalUnity.g:2763:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalUnity.g:2764:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalUnity.g:2770:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralOrIdentifier_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalUnity.g:2776:2: ( (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalUnity.g:2777:2: (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalUnity.g:2777:2: (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)) ) {
                alt35=1;
            }
            else if ( (LA35_0==20) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalUnity.g:2778:3: this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier
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
                    // InternalUnity.g:2787:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalUnity.g:2787:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalUnity.g:2788:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
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
                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUnity.g:2809:1: entryRuleLiteralOrIdentifier returns [EObject current=null] : iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF ;
    public final EObject entryRuleLiteralOrIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOrIdentifier = null;


        try {
            // InternalUnity.g:2809:60: (iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF )
            // InternalUnity.g:2810:2: iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF
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
    // InternalUnity.g:2816:1: ruleLiteralOrIdentifier returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier ) ;
    public final EObject ruleLiteralOrIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:2822:2: ( (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier ) )
            // InternalUnity.g:2823:2: (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier )
            {
            // InternalUnity.g:2823:2: (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_INT && LA36_0<=RULE_STRING)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalUnity.g:2824:3: this_Literal_0= ruleLiteral
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
                    // InternalUnity.g:2833:3: this_Identifier_1= ruleIdentifier
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
    // InternalUnity.g:2845:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalUnity.g:2845:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalUnity.g:2846:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalUnity.g:2852:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_BoolLiteral_1 = null;

        EObject this_StLiteral_2 = null;

        EObject this_RealLiteral_3 = null;



        	enterRule();

        try {
            // InternalUnity.g:2858:2: ( (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral ) )
            // InternalUnity.g:2859:2: (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral )
            {
            // InternalUnity.g:2859:2: (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral )
            int alt37=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==24) ) {
                    alt37=4;
                }
                else if ( (LA37_1==EOF||(LA37_1>=RULE_ID && LA37_1<=RULE_STRING)||LA37_1==18||(LA37_1>=20 && LA37_1<=21)||LA37_1==31||LA37_1==35||(LA37_1>=49 && LA37_1<=61)) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                alt37=2;
                }
                break;
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalUnity.g:2860:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalUnity.g:2869:3: this_BoolLiteral_1= ruleBoolLiteral
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
                    // InternalUnity.g:2878:3: this_StLiteral_2= ruleStLiteral
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
                    // InternalUnity.g:2887:3: this_RealLiteral_3= ruleRealLiteral
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
    // InternalUnity.g:2899:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalUnity.g:2899:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalUnity.g:2900:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalUnity.g:2906:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_int_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_int_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:2912:2: ( ( () ( (lv_int_1_0= RULE_INT ) ) ) )
            // InternalUnity.g:2913:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
            {
            // InternalUnity.g:2913:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
            // InternalUnity.g:2914:3: () ( (lv_int_1_0= RULE_INT ) )
            {
            // InternalUnity.g:2914:3: ()
            // InternalUnity.g:2915:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:2921:3: ( (lv_int_1_0= RULE_INT ) )
            // InternalUnity.g:2922:4: (lv_int_1_0= RULE_INT )
            {
            // InternalUnity.g:2922:4: (lv_int_1_0= RULE_INT )
            // InternalUnity.g:2923:5: lv_int_1_0= RULE_INT
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
    // InternalUnity.g:2943:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalUnity.g:2943:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalUnity.g:2944:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
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
    // InternalUnity.g:2950:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:2956:2: ( ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) ) )
            // InternalUnity.g:2957:2: ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalUnity.g:2957:2: ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) )
            // InternalUnity.g:2958:3: () ( (lv_bool_1_0= RULE_BOOLEAN ) )
            {
            // InternalUnity.g:2958:3: ()
            // InternalUnity.g:2959:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:2965:3: ( (lv_bool_1_0= RULE_BOOLEAN ) )
            // InternalUnity.g:2966:4: (lv_bool_1_0= RULE_BOOLEAN )
            {
            // InternalUnity.g:2966:4: (lv_bool_1_0= RULE_BOOLEAN )
            // InternalUnity.g:2967:5: lv_bool_1_0= RULE_BOOLEAN
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
    // InternalUnity.g:2987:1: entryRuleStLiteral returns [EObject current=null] : iv_ruleStLiteral= ruleStLiteral EOF ;
    public final EObject entryRuleStLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStLiteral = null;


        try {
            // InternalUnity.g:2987:50: (iv_ruleStLiteral= ruleStLiteral EOF )
            // InternalUnity.g:2988:2: iv_ruleStLiteral= ruleStLiteral EOF
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
    // InternalUnity.g:2994:1: ruleStLiteral returns [EObject current=null] : ( () ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:3000:2: ( ( () ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalUnity.g:3001:2: ( () ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalUnity.g:3001:2: ( () ( (lv_string_1_0= RULE_STRING ) ) )
            // InternalUnity.g:3002:3: () ( (lv_string_1_0= RULE_STRING ) )
            {
            // InternalUnity.g:3002:3: ()
            // InternalUnity.g:3003:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStLiteralAccess().getStLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:3009:3: ( (lv_string_1_0= RULE_STRING ) )
            // InternalUnity.g:3010:4: (lv_string_1_0= RULE_STRING )
            {
            // InternalUnity.g:3010:4: (lv_string_1_0= RULE_STRING )
            // InternalUnity.g:3011:5: lv_string_1_0= RULE_STRING
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
    // InternalUnity.g:3031:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalUnity.g:3031:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalUnity.g:3032:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalUnity.g:3038:1: ruleIdentifier returns [EObject current=null] : ( (lv_Refrence_0_0= ruleDotExpression ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject lv_Refrence_0_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:3044:2: ( ( (lv_Refrence_0_0= ruleDotExpression ) ) )
            // InternalUnity.g:3045:2: ( (lv_Refrence_0_0= ruleDotExpression ) )
            {
            // InternalUnity.g:3045:2: ( (lv_Refrence_0_0= ruleDotExpression ) )
            // InternalUnity.g:3046:3: (lv_Refrence_0_0= ruleDotExpression )
            {
            // InternalUnity.g:3046:3: (lv_Refrence_0_0= ruleDotExpression )
            // InternalUnity.g:3047:4: lv_Refrence_0_0= ruleDotExpression
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
        // InternalUnity.g:2271:5: ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )
        // InternalUnity.g:2271:6: ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) )
        {
        // InternalUnity.g:2271:6: ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) )
        int alt38=6;
        switch ( input.LA(1) ) {
        case 51:
            {
            alt38=1;
            }
            break;
        case 52:
            {
            alt38=2;
            }
            break;
        case 53:
            {
            alt38=3;
            }
            break;
        case 54:
            {
            alt38=4;
            }
            break;
        case 55:
            {
            alt38=5;
            }
            break;
        case 56:
            {
            alt38=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 38, 0, input);

            throw nvae;
        }

        switch (alt38) {
            case 1 :
                // InternalUnity.g:2272:6: ( () '>' )
                {
                // InternalUnity.g:2272:6: ( () '>' )
                // InternalUnity.g:2273:7: () '>'
                {
                // InternalUnity.g:2273:7: ()
                // InternalUnity.g:2274:7: 
                {
                }

                match(input,51,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2278:6: ( () '<' )
                {
                // InternalUnity.g:2278:6: ( () '<' )
                // InternalUnity.g:2279:7: () '<'
                {
                // InternalUnity.g:2279:7: ()
                // InternalUnity.g:2280:7: 
                {
                }

                match(input,52,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalUnity.g:2284:6: ( () '>=' )
                {
                // InternalUnity.g:2284:6: ( () '>=' )
                // InternalUnity.g:2285:7: () '>='
                {
                // InternalUnity.g:2285:7: ()
                // InternalUnity.g:2286:7: 
                {
                }

                match(input,53,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalUnity.g:2290:6: ( () '<=' )
                {
                // InternalUnity.g:2290:6: ( () '<=' )
                // InternalUnity.g:2291:7: () '<='
                {
                // InternalUnity.g:2291:7: ()
                // InternalUnity.g:2292:7: 
                {
                }

                match(input,54,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalUnity.g:2296:6: ( () '==' )
                {
                // InternalUnity.g:2296:6: ( () '==' )
                // InternalUnity.g:2297:7: () '=='
                {
                // InternalUnity.g:2297:7: ()
                // InternalUnity.g:2298:7: 
                {
                }

                match(input,55,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 6 :
                // InternalUnity.g:2302:6: ( () '!=' )
                {
                // InternalUnity.g:2302:6: ( () '!=' )
                // InternalUnity.g:2303:7: () '!='
                {
                // InternalUnity.g:2303:7: ()
                // InternalUnity.g:2304:7: 
                {
                }

                match(input,56,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_InternalUnity

    // $ANTLR start synpred2_InternalUnity
    public final void synpred2_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2444:5: ( ( ( () '+' ) | ( () '-' ) ) )
        // InternalUnity.g:2444:6: ( ( () '+' ) | ( () '-' ) )
        {
        // InternalUnity.g:2444:6: ( ( () '+' ) | ( () '-' ) )
        int alt39=2;
        int LA39_0 = input.LA(1);

        if ( (LA39_0==57) ) {
            alt39=1;
        }
        else if ( (LA39_0==31) ) {
            alt39=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 39, 0, input);

            throw nvae;
        }
        switch (alt39) {
            case 1 :
                // InternalUnity.g:2445:6: ( () '+' )
                {
                // InternalUnity.g:2445:6: ( () '+' )
                // InternalUnity.g:2446:7: () '+'
                {
                // InternalUnity.g:2446:7: ()
                // InternalUnity.g:2447:7: 
                {
                }

                match(input,57,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2451:6: ( () '-' )
                {
                // InternalUnity.g:2451:6: ( () '-' )
                // InternalUnity.g:2452:7: () '-'
                {
                // InternalUnity.g:2452:7: ()
                // InternalUnity.g:2453:7: 
                {
                }

                match(input,31,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred2_InternalUnity

    // $ANTLR start synpred3_InternalUnity
    public final void synpred3_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2537:5: ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )
        // InternalUnity.g:2537:6: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )
        {
        // InternalUnity.g:2537:6: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )
        int alt40=3;
        switch ( input.LA(1) ) {
        case 58:
            {
            alt40=1;
            }
            break;
        case 59:
            {
            alt40=2;
            }
            break;
        case 60:
            {
            alt40=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 40, 0, input);

            throw nvae;
        }

        switch (alt40) {
            case 1 :
                // InternalUnity.g:2538:6: ( () '*' )
                {
                // InternalUnity.g:2538:6: ( () '*' )
                // InternalUnity.g:2539:7: () '*'
                {
                // InternalUnity.g:2539:7: ()
                // InternalUnity.g:2540:7: 
                {
                }

                match(input,58,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2544:6: ( () '/' )
                {
                // InternalUnity.g:2544:6: ( () '/' )
                // InternalUnity.g:2545:7: () '/'
                {
                // InternalUnity.g:2545:7: ()
                // InternalUnity.g:2546:7: 
                {
                }

                match(input,59,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalUnity.g:2550:6: ( () '%' )
                {
                // InternalUnity.g:2550:6: ( () '%' )
                // InternalUnity.g:2551:7: () '%'
                {
                // InternalUnity.g:2551:7: ()
                // InternalUnity.g:2552:7: 
                {
                }

                match(input,60,FOLLOW_2); if (state.failed) return ;

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


    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\1\24\uffff";
    static final String dfa_3s = "\1\4\20\uffff\1\0\3\uffff";
    static final String dfa_4s = "\1\75\20\uffff\1\0\3\uffff";
    static final String dfa_5s = "\1\uffff\1\2\22\uffff\1\1";
    static final String dfa_6s = "\1\0\20\uffff\1\1\3\uffff}>";
    static final String[] dfa_7s = {
            "\4\1\12\uffff\1\1\1\uffff\2\1\11\uffff\1\21\3\uffff\1\1\15\uffff\10\1\1\24\3\uffff\1\1",
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

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2442:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==EOF||(LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==18||(LA30_0>=20 && LA30_0<=21)||LA30_0==35||(LA30_0>=49 && LA30_0<=56)||LA30_0==61) ) {s = 1;}

                        else if ( (LA30_0==31) ) {s = 17;}

                        else if ( (LA30_0==57) && (synpred2_InternalUnity())) {s = 20;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_17 = input.LA(1);

                         
                        int index30_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalUnity()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001100001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000020C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x20000000801400F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000800000E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000006020C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x20000000801000F0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000016402040010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x01F8000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000080000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1C00000000000002L});

}