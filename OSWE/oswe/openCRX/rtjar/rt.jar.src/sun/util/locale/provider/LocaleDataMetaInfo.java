/*    */ package sun.util.locale.provider;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LocaleDataMetaInfo
/*    */ {
/* 43 */   private static final HashMap<String, String> resourceNameToLocales = new HashMap<>(7);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static {
/* 54 */     resourceNameToLocales.put("FormatData", "  en en-AU en-CA en-GB en-IE en-IN en-MT en-NZ en-PH en-SG en-US en-ZA |  ar ar-JO ar-LB ar-SY be be-BY bg bg-BG ca ca-ES cs cs-CZ da da-DK de de-AT de-CH de-DE de-LU el el-CY el-GR es es-AR es-BO es-CL es-CO es-CR es-DO es-EC es-ES es-GT es-HN es-MX es-NI es-PA es-PE es-PR es-PY es-SV es-US es-UY es-VE et et-EE fi fi-FI fr fr-BE fr-CA fr-CH fr-FR ga ga-IE hi-IN hr hr-HR hu hu-HU in in-ID is is-IS it it-CH it-IT iw iw-IL ja ja-JP ko ko-KR lt lt-LT lv lv-LV mk mk-MK ms ms-MY mt mt-MT nl nl-BE nl-NL no no-NO no-NO-NY pl pl-PL pt pt-BR pt-PT ro ro-RO ru ru-RU sk sk-SK sl sl-SI sq sq-AL sr sr-BA sr-CS sr-Latn sr-Latn-ME sr-ME sr-RS sv sv-SE th th-TH tr tr-TR uk uk-UA vi vi-VN zh zh-CN zh-HK zh-SG zh-TW ");
/*    */ 
/*    */     
/* 57 */     resourceNameToLocales.put("CollationData", "  |  ar be bg ca cs da el es et fi fr hi hr hu is iw ja ko lt lv mk no pl ro ru sk sl sq sr sr-Latn sv th tr uk vi zh zh-HK zh-TW ");
/*    */ 
/*    */     
/* 60 */     resourceNameToLocales.put("BreakIteratorInfo", "  |  th ");
/*    */ 
/*    */     
/* 63 */     resourceNameToLocales.put("BreakIteratorRules", "  |  th ");
/*    */ 
/*    */     
/* 66 */     resourceNameToLocales.put("TimeZoneNames", "  en en-CA en-GB en-IE |  de es fr hi it ja ko pt-BR sv zh-CN zh-HK zh-TW ");
/*    */ 
/*    */     
/* 69 */     resourceNameToLocales.put("LocaleNames", "  en en-MT en-PH en-SG |  ar be bg ca cs da de el el-CY es es-US et fi fr ga hi hr hu in is it iw ja ko lt lv mk ms mt nl no no-NO-NY pl pt pt-PT ro ru sk sl sq sr sr-Latn sv th tr uk vi zh zh-HK zh-SG zh-TW ");
/*    */ 
/*    */     
/* 72 */     resourceNameToLocales.put("CurrencyNames", "  en-AU en-CA en-GB en-IE en-IN en-MT en-NZ en-PH en-SG en-US en-ZA |  ar-AE ar-BH ar-DZ ar-EG ar-IQ ar-JO ar-KW ar-LB ar-LY ar-MA ar-OM ar-QA ar-SA ar-SD ar-SY ar-TN ar-YE be-BY bg-BG ca-ES cs-CZ da-DK de de-AT de-CH de-DE de-GR de-LU el-CY el-GR es es-AR es-BO es-CL es-CO es-CR es-CU es-DO es-EC es-ES es-GT es-HN es-MX es-NI es-PA es-PE es-PR es-PY es-SV es-US es-UY es-VE et-EE fi-FI fr fr-BE fr-CA fr-CH fr-FR fr-LU ga-IE hi-IN hr-HR hu-HU in-ID is-IS it it-CH it-IT iw-IL ja ja-JP ko ko-KR lt-LT lv-LV mk-MK ms-MY mt-MT nl-BE nl-NL no-NO pl-PL pt pt-BR pt-PT ro-RO ru-RU sk-SK sl-SI sq-AL sr-BA sr-CS sr-Latn-BA sr-Latn-ME sr-Latn-RS sr-ME sr-RS sv sv-SE th-TH tr-TR uk-UA vi-VN zh-CN zh-HK zh-SG zh-TW ");
/*    */ 
/*    */     
/* 75 */     resourceNameToLocales.put("CalendarData", "  en en-GB en-IE en-MT |  ar be bg ca cs da de el el-CY es es-ES es-US et fi fr fr-CA hi hr hu in-ID is it iw ja ko lt lv mk ms-MY mt mt-MT nl no pl pt pt-BR pt-PT ro ru sk sl sq sr sr-Latn-BA sr-Latn-ME sr-Latn-RS sv th tr uk vi zh ");
/*    */ 
/*    */     
/* 78 */     resourceNameToLocales.put("AvailableLocales", " en en-AU en-CA en-GB en-IE en-IN en-MT en-NZ en-PH en-SG en-US en-ZA | ar ar-AE ar-BH ar-DZ ar-EG ar-IQ ar-JO ar-KW ar-LB ar-LY ar-MA ar-OM ar-QA ar-SA ar-SD ar-SY ar-TN ar-YE be be-BY bg bg-BG ca ca-ES cs cs-CZ da da-DK de de-AT de-CH de-DE de-GR de-LU el el-CY el-GR es es-AR es-BO es-CL es-CO es-CR es-CU es-DO es-EC es-ES es-GT es-HN es-MX es-NI es-PA es-PE es-PR es-PY es-SV es-US es-UY es-VE et et-EE fi fi-FI fr fr-BE fr-CA fr-CH fr-FR fr-LU ga ga-IE hi hi-IN hr hr-HR hu hu-HU in in-ID is is-IS it it-CH it-IT iw iw-IL ja ja-JP ja-JP-JP ko ko-KR lt lt-LT lv lv-LV mk mk-MK ms ms-MY mt mt-MT nl nl-BE nl-NL no no-NO no-NO-NY pl pl-PL pt pt-BR pt-PT ro ro-RO ru ru-RU sk sk-SK sl sl-SI sq sq-AL sr sr-BA sr-CS sr-Latn sr-Latn-BA sr-Latn-ME sr-Latn-RS sr-ME sr-RS sv sv-SE th th-TH th-TH-TH tr tr-TR uk uk-UA vi vi-VN zh zh-CN zh-HK zh-SG zh-TW ");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getSupportedLocaleString(String paramString) {
/* 87 */     return resourceNameToLocales.get(paramString);
/*    */   }
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/sun/util/locale/provider/LocaleDataMetaInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */