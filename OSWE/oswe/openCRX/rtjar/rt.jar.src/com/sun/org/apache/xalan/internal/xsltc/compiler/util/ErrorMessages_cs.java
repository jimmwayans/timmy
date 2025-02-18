/*    */ package com.sun.org.apache.xalan.internal.xsltc.compiler.util;
/*    */ 
/*    */ import java.util.ListResourceBundle;
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
/*    */ public class ErrorMessages_cs
/*    */   extends ListResourceBundle
/*    */ {
/*    */   public Object[][] getContents() {
/* 99 */     return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "Více než jedna předloha stylu je definována ve stejném souboru." }, { "TEMPLATE_REDEF_ERR", "Šablona ''{0}'' je již v této předloze stylu definována." }, { "TEMPLATE_UNDEF_ERR", "Šablona ''{0}'' není v této předloze stylu definována." }, { "VARIABLE_REDEF_ERR", "Proměnná ''{0}'' je několikanásobně definována ve stejném oboru." }, { "VARIABLE_UNDEF_ERR", "Proměnná nebo parametr ''{0}'' nejsou definovány." }, { "CLASS_NOT_FOUND_ERR", "Nelze najít třídu ''{0}''." }, { "METHOD_NOT_FOUND_ERR", "Nelze najít externí metodu ''{0}'' (musí být veřejná)." }, { "ARGUMENT_CONVERSION_ERR", "Nelze převést argument/návratový typ ve volání metody ''{0}''" }, { "FILE_NOT_FOUND_ERR", "Soubor nebo URI ''{0}'' nebyl nalezen." }, { "INVALID_URI_ERR", "Neplatné URI ''{0}''." }, { "FILE_ACCESS_ERR", "Nelze otevřít soubor nebo URI ''{0}''." }, { "MISSING_ROOT_ERR", "Byl očekáván prvek <xsl:stylesheet> nebo <xsl:transform>." }, { "NAMESPACE_UNDEF_ERR", "Předpona oboru názvů ''{0}'' není deklarována." }, { "FUNCTION_RESOLVE_ERR", "Nelze vyřešit volání funkce ''{0}''." }, { "NEED_LITERAL_ERR", "Argument pro ''{0}'' musí být řetězcem literálu." }, { "XPATH_PARSER_ERR", "Chyba při analýze výrazu XPath ''{0}''." }, { "REQUIRED_ATTR_ERR", "Požadovaný atribut ''{0}'' chybí." }, { "ILLEGAL_CHAR_ERR", "Neplatný znak ''{0}'' ve výrazu XPath." }, { "ILLEGAL_PI_ERR", "Neplatný název ''{0}'' pro zpracování instrukce." }, { "STRAY_ATTRIBUTE_ERR", "Atribut ''{0}'' je vně prvku." }, { "ILLEGAL_ATTRIBUTE_ERR", "Neplatný atribut ''{0}''." }, { "CIRCULAR_INCLUDE_ERR", "Cyklický import/zahrnutí. Předloha stylu ''{0}'' je již zavedena." }, { "RESULT_TREE_SORT_ERR", "Fragmenty stromu výsledků nemohou být řazeny (prvky <xsl:sort> se ignorují). Při vytváření stromu výsledků musíte seřadit uzly." }, { "SYMBOLS_REDEF_ERR", "Desetinné formátování ''{0}'' je již definováno." }, { "XSL_VERSION_ERR", "Verze XSL ''{0}'' není produktem XSLTC podporována." }, { "CIRCULAR_VARIABLE_ERR", "Cyklický odkaz na proměnnou/parametr v ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Neznámý operátor pro binární výraz." }, { "ILLEGAL_ARG_ERR", "Neplatný argument pro volání funkce." }, { "DOCUMENT_ARG_ERR", "Druhý argument pro funkci document() musí být node-set." }, { "MISSING_WHEN_ERR", "Alespoň jeden prvek <xsl:when> se vyžaduje v <xsl:choose>." }, { "MULTIPLE_OTHERWISE_ERR", "Jen jeden prvek <xsl:otherwise> je povolen v <xsl:choose>." }, { "STRAY_OTHERWISE_ERR", "Prvek <xsl:otherwise> může být použit jen v <xsl:choose>." }, { "STRAY_WHEN_ERR", "Prvek <xsl:when> může být použit jen v <xsl:choose>." }, { "WHEN_ELEMENT_ERR", "Pouze prvky <xsl:when> a <xsl:otherwise> jsou povoleny v <xsl:choose>." }, { "UNNAMED_ATTRIBSET_ERR", "V prvku <xsl:attribute-set> chybí atribut 'name'." }, { "ILLEGAL_CHILD_ERR", "Neplatný prvek potomka." }, { "ILLEGAL_ELEM_NAME_ERR", "Nelze volat prvek ''{0}''" }, { "ILLEGAL_ATTR_NAME_ERR", "Nelze volat atribut ''{0}''" }, { "ILLEGAL_TEXT_NODE_ERR", "Textová data jsou vně prvku nejvyšší úrovně <xsl:stylesheet>." }, { "SAX_PARSER_CONFIG_ERR", "Analyzátor JAXP je nesprávně konfigurován." }, { "INTERNAL_ERR", "Neopravitelná chyba XSLTC-internal: ''{0}''" }, { "UNSUPPORTED_XSL_ERR", "Nepodporovaný prvek XSL ''{0}''." }, { "UNSUPPORTED_EXT_ERR", "Nerozpoznaná přípona XSLTC ''{0}''." }, { "MISSING_XSLT_URI_ERR", "Vstupní dokument není předloha stylu (obor názvů XSL není deklarován v kořenovém elementu)." }, { "MISSING_XSLT_TARGET_ERR", "Nelze najít cílovou předlohu se stylem ''{0}''." }, { "ACCESSING_XSLT_TARGET_ERR", "Could not read stylesheet target ''{0}'', because ''{1}'' access is not allowed." }, { "NOT_IMPLEMENTED_ERR", "Neimplementováno: ''{0}''." }, { "NOT_STYLESHEET_ERR", "Vstupní dokument neobsahuje předlohu stylu XSL." }, { "ELEMENT_PARSE_ERR", "Nelze analyzovat prvek ''{0}''" }, { "KEY_USE_ATTR_ERR", "Atribut use proměnné <key> musí být typu node, node-set, string nebo number." }, { "OUTPUT_VERSION_ERR", "Výstupní verze dokumentu XML by měla být 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "Neznámý operátor pro relační výraz" }, { "ATTRIBSET_UNDEF_ERR", "Pokus použít neexistující sadu atributů ''{0}''." }, { "ATTR_VAL_TEMPLATE_ERR", "Nelze analyzovat šablonu hodnoty atributu ''{0}''." }, { "UNKNOWN_SIG_TYPE_ERR", "Neznámý datový typ proměnné signature pro třídu ''{0}''." }, { "DATA_CONVERSION_ERR", "Nelze převést datový typ ''{0}'' na ''{1}''." }, { "NO_TRANSLET_CLASS_ERR", "Tato šablona neobsahuje platnou definici třídy translet." }, { "NO_MAIN_TRANSLET_ERR", "Tato šablona neobsahuje třídu se jménem ''{0}''." }, { "TRANSLET_CLASS_ERR", "Nelze zavést třídu translet ''{0}''." }, { "TRANSLET_OBJECT_ERR", "Třída translet byla zavedena, avšak nelze vytvořit instanci translet." }, { "ERROR_LISTENER_NULL_ERR", "Pokus nastavit objekt ErrorListener pro ''{0}'' na hodnotu null" }, { "JAXP_UNKNOWN_SOURCE_ERR", "Pouze proměnné StreamSource, SAXSource a DOMSource jsou podporovány produktem XSLTC" }, { "JAXP_NO_SOURCE_ERR", "Zdrojový objekt předaný ''{0}'' nemá žádný obsah." }, { "JAXP_COMPILE_ERR", "Nelze kompilovat předlohu se stylem" }, { "JAXP_INVALID_ATTR_ERR", "Třída TransformerFactory nerozpoznala atribut ''{0}''." }, { "JAXP_SET_RESULT_ERR", "Metoda setResult() musí být volána před metodou startDocument()." }, { "JAXP_NO_TRANSLET_ERR", "Objekt Transformer nemá žádný zapouzdřený objekt translet." }, { "JAXP_NO_HANDLER_ERR", "Neexistuje žádný definovaný výstupní obslužný program pro výsledek transformace." }, { "JAXP_NO_RESULT_ERR", "Výsledný objekt předaný ''{0}'' je neplatný." }, { "JAXP_UNKNOWN_PROP_ERR", "Pokus o přístup k neplatné vlastnosti objektu Transformer: ''{0}''." }, { "SAX2DOM_ADAPTER_ERR", "Nelze vytvořit adaptér SAX2DOM: ''{0}''." }, { "XSLTC_SOURCE_ERR", "Byla volána metoda XSLTCSource.build(), aniž by byla nastavena hodnota systemId." }, { "COMPILE_STDIN_ERR", "Volba -i musí být použita s volbou -o." }, { "COMPILE_USAGE_STR", "SYNOPSIS\n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile [-o <output>]\n      [-d <directory>] [-j <jarfile>] [-p <package>]\n      [-n] [-x] [-s] [-u] [-v] [-h] { <stylesheet> | -i }\n\nVOLBY\n   -o <output>    přiřazuje název <output> generovanému\n                  transletu. Standardně je název transletu\n                  převzat z názvu <stylesheet>. Tato volba\n                   se ignoruje, pokud se kompilují násobné předlohy stylů.\n   -d <directory> určuje výchozí adresář pro translet\n   -j <jarfile>   zabalí třídu transletu do souboru jar\n     pojmenovaného jako <jarfile>\n   -p <package>   určuje předponu názvu balíčku pro všechny generované \n třídy transletu.\n   -n             povoluje zarovnání šablony (výchozí chování je v průměru lepší\n                  .\n   -x             zapne další výstup zprávy ladění\n   -s             zakáže volání System.exit\n   -u             interpretuje <stylesheet> argumenty jako URL\n   -i             vynutí kompilátor číst předlohu stylů ze stdin\n   -v             tiskne verzi kompilátoru \n   -h             tiskne výpis tohoto použití \n" }, { "TRANSFORM_USAGE_STR", "SYNOPSIS \n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Transform [-j <jarfile>]\n      [-x] [-s] [-n <iterations>] {-u <document_url> | <document>}\n      <class> [<param1>=<value1> ...]\n\n   použije translet <class> k transformaci dokumentu XML \n určeného jako <document>. Translet <class> je buď v\n   v uživatelské cestě CLASSPATH nebo ve volitelně určeném souboru <jarfile>.\nVOLBY\n     -j <jarfile>    určuje soubor jarfile, ze kterého se zavede translet\n   -x      převede další výstup zprávy ladění\n   -s              vypne volání System.exit\n   -n <iterations> spustí transformaci <iterations> krát a\n                   zobrazí informaci  o profilu\n   -u <document_url> určí vstupní dokument XML jako URL\n" }, { "STRAY_SORT_ERR", "Prvek <xsl:sort> může být použit jen v <xsl:for-each> nebo <xsl:apply-templates>." }, { "UNSUPPORTED_ENCODING", "Výstupní kódování ''{0}'' není v tomto prostředí JVM podporováno." }, { "SYNTAX_ERR", "Chyba syntaxe v ''{0}''." }, { "CONSTRUCTOR_NOT_FOUND", "Nelze najít vnější konstruktor ''{0}''." }, { "NO_JAVA_FUNCT_THIS_REF", "První argument nestatické funkce Java ''{0}'' není platným odkazem na objekt." }, { "TYPE_CHECK_ERR", "Chyba při kontrole typu výrazu ''{0}''." }, { "TYPE_CHECK_UNK_LOC_ERR", "Chyba při kontrole typu výrazu na neznámém místě." }, { "ILLEGAL_CMDLINE_OPTION_ERR", "Volba příkazového řádku ''{0}'' není platná." }, { "CMDLINE_OPT_MISSING_ARG_ERR", "Volbě příkazového řádku ''{0}'' chybí požadovaný argument." }, { "WARNING_PLUS_WRAPPED_MSG", "VAROVÁNÍ: ''{0}''\n        :{1}" }, { "WARNING_MSG", "VAROVÁNÍ: ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "ZÁVAŽNÁ CHYBA: ''{0}''\n             :{1}" }, { "FATAL_ERR_MSG", "ZÁVAŽNÁ CHYBA: ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "CHYBA: ''{0}''\n     :{1}" }, { "ERROR_MSG", "CHYBA: ''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "Transformace použitím transletu ''{0}'' " }, { "TRANSFORM_WITH_JAR_STR", "Transformace použitím transletu ''{0}'' ze souboru jar ''{1}''" }, { "COULD_NOT_CREATE_TRANS_FACT", "Nelze vytvořit instanci třídy TransformerFactory ''{0}''." }, { "COMPILER_ERROR_KEY", "Chyby kompilátoru:" }, { "COMPILER_WARNING_KEY", "Varování kompilátoru:" }, { "RUNTIME_ERROR_KEY", "Chyby transletu:" }, { "JAXP_SECUREPROCESSING_FEATURE", "FEATURE_SECURE_PROCESSING: Cannot set the feature to false when security manager is present." } };
/*    */   }
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/org/apache/xalan/internal/xsltc/compiler/util/ErrorMessages_cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */