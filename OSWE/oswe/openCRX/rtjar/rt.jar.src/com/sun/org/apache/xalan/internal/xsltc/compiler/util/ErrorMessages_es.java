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
/*    */ public class ErrorMessages_es
/*    */   extends ListResourceBundle
/*    */ {
/*    */   public Object[][] getContents() {
/* 96 */     return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "Se ha definido más de una hoja de estilo en el mismo archivo." }, { "TEMPLATE_REDEF_ERR", "La plantilla ''{0}'' ya se ha definido en esta hoja de estilo." }, { "TEMPLATE_UNDEF_ERR", "La plantilla ''{0}'' no se ha definido en esta hoja de estilo." }, { "VARIABLE_REDEF_ERR", "Se ha definido varias veces la variable ''{0}'' en el mismo ámbito." }, { "VARIABLE_UNDEF_ERR", "No se ha definido la variable o el parámetro ''{0}''." }, { "CLASS_NOT_FOUND_ERR", "No se ha encontrado la clase ''{0}''." }, { "METHOD_NOT_FOUND_ERR", "No se ha encontrado el método externo ''{0}'' (debe ser público)." }, { "ARGUMENT_CONVERSION_ERR", "No se puede convertir el tipo de argumento/retorno en la llamada al método ''{0}''" }, { "FILE_NOT_FOUND_ERR", "No se ha encontrado el archivo o URI ''{0}''." }, { "INVALID_URI_ERR", "URI ''{0}'' no válido." }, { "FILE_ACCESS_ERR", "No se puede abrir el archivo o URI ''{0}''." }, { "MISSING_ROOT_ERR", "Se esperaba el elemento <xsl:stylesheet> o <xsl:transform>." }, { "NAMESPACE_UNDEF_ERR", "No se ha declarado el prefijo de espacio de nombres ''{0}''." }, { "FUNCTION_RESOLVE_ERR", "No se ha podido resolver la llamada a la función ''{0}''." }, { "NEED_LITERAL_ERR", "El argumento en ''{0}'' debe ser una cadena literal." }, { "XPATH_PARSER_ERR", "Error al analizar la expresión XPath ''{0}''." }, { "REQUIRED_ATTR_ERR", "Falta el atributo ''{0}'' necesario." }, { "ILLEGAL_CHAR_ERR", "Carácter ''{0}'' no permitido en la expresión XPath." }, { "ILLEGAL_PI_ERR", "Nombre ''{0}'' no permitido para la instrucción de procesamiento." }, { "STRAY_ATTRIBUTE_ERR", "El atributo ''{0}'' está fuera del elemento." }, { "ILLEGAL_ATTRIBUTE_ERR", "Atributo ''{0}'' no permitido." }, { "CIRCULAR_INCLUDE_ERR", "Import/include circular. La hoja de estilo ''{0}'' ya se ha cargado." }, { "RESULT_TREE_SORT_ERR", "Los fragmentos del árbol de resultados no se pueden ordenar (los elementos <xsl:sort> se ignoran). Debe ordenar los nodos al crear el árbol de resultados." }, { "SYMBOLS_REDEF_ERR", "Ya se ha definido el formato decimal ''{0}''." }, { "XSL_VERSION_ERR", "La versión XSL ''{0}'' no está soportada por XSLTC." }, { "CIRCULAR_VARIABLE_ERR", "La referencia de variable/parámetro circular en ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Operador desconocido para la expresión binaria." }, { "ILLEGAL_ARG_ERR", "Argumentos no permitidos para la llamada de función." }, { "DOCUMENT_ARG_ERR", "El segundo argumento en la función document() debe ser un juego de nodos." }, { "MISSING_WHEN_ERR", "Se necesita al menos un elemento <xsl:when> en <xsl:choose>." }, { "MULTIPLE_OTHERWISE_ERR", "Sólo se permite un elemento <xsl:otherwise> en <xsl:choose>." }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> sólo se puede utilizar en <xsl:choose>." }, { "STRAY_WHEN_ERR", "<xsl:when> sólo se puede utilizar en <xsl:choose>." }, { "WHEN_ELEMENT_ERR", "Sólo se permiten los elementos <xsl:when> y <xsl:otherwise> en <xsl:choose>." }, { "UNNAMED_ATTRIBSET_ERR", "Falta el atributo 'name' en <xsl:attribute-set>" }, { "ILLEGAL_CHILD_ERR", "Elemento secundario no permitido." }, { "ILLEGAL_ELEM_NAME_ERR", "No se puede llamar ''{0}'' a un elemento" }, { "ILLEGAL_ATTR_NAME_ERR", "No se puede llamar ''{0}'' a un atributo" }, { "ILLEGAL_TEXT_NODE_ERR", "Datos de texto fuera del elemento <xsl:stylesheet> de nivel superior." }, { "SAX_PARSER_CONFIG_ERR", "El analizador JAXP no se ha configurado correctamente" }, { "INTERNAL_ERR", "Error interno de XSLTC irrecuperable: ''{0}''" }, { "UNSUPPORTED_XSL_ERR", "Elemento ''{0}'' de XSL no soportado." }, { "UNSUPPORTED_EXT_ERR", "Extensión ''{0}'' de XSLTC no reconocida." }, { "MISSING_XSLT_URI_ERR", "El documento de entrada no es una hoja de estilo (el espacio de nombres XSL no se ha declarado en el elemento raíz)." }, { "MISSING_XSLT_TARGET_ERR", "No se ha encontrado el destino de hoja de estilo ''{0}''." }, { "ACCESSING_XSLT_TARGET_ERR", "No se ha podido leer el destino de hoja de estilos ''{0}'', porque no se permite el acceso ''{1}'' debido a una restricción definida por la propiedad accessExternalStylesheet." }, { "NOT_IMPLEMENTED_ERR", "No implantado: ''{0}''." }, { "NOT_STYLESHEET_ERR", "El documento de entrada no contiene una hoja de estilo XSL." }, { "ELEMENT_PARSE_ERR", "No se ha podido analizar el elemento ''{0}''" }, { "KEY_USE_ATTR_ERR", "El atributo use de <key> debe ser node, node-set, string o number." }, { "OUTPUT_VERSION_ERR", "La versión del documento XML de salida debe ser 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "Operador desconocido para la expresión relacional" }, { "ATTRIBSET_UNDEF_ERR", "Se está intentando utilizar el juego de atributos ''{0}'' no existente." }, { "ATTR_VAL_TEMPLATE_ERR", "No se puede analizar la plantilla del valor de atributo ''{0}''." }, { "UNKNOWN_SIG_TYPE_ERR", "Tipo de datos desconocido en la firma para la clase ''{0}''." }, { "DATA_CONVERSION_ERR", "No se puede convertir el tipo de datos ''{0}'' en ''{1}''." }, { "NO_TRANSLET_CLASS_ERR", "Templates no contiene una definición de clase translet." }, { "NO_MAIN_TRANSLET_ERR", "Templates no contiene una clase con el nombre ''{0}''." }, { "TRANSLET_CLASS_ERR", "No se ha podido cargar la clase de translet ''{0}''." }, { "TRANSLET_OBJECT_ERR", "La clase de translet se ha cargado, pero no se puede crear una instancia de translet." }, { "ERROR_LISTENER_NULL_ERR", "Intentando definir ErrorListener para ''{0}'' como nulo" }, { "JAXP_UNKNOWN_SOURCE_ERR", "Sólo StreamSource, SAXSource y DOMSource están soportados por XSLTC" }, { "JAXP_NO_SOURCE_ERR", "El objeto Source que se ha transferido a ''{0}'' no tiene contenido." }, { "JAXP_COMPILE_ERR", "No se ha podido compilar la hoja de estilo" }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory no reconoce el atributo ''{0}''." }, { "JAXP_INVALID_ATTR_VALUE_ERR", "Valor no válido especificado para el atributo ''{0}''." }, { "JAXP_SET_RESULT_ERR", "setResult() debe llamarse antes de startDocument()." }, { "JAXP_NO_TRANSLET_ERR", "Transformer no tiene un objeto translet encapsulado." }, { "JAXP_NO_HANDLER_ERR", "No se ha definido el manejador de salida para el resultado de la transformación." }, { "JAXP_NO_RESULT_ERR", "El objeto Result que se ha pasado a ''{0}'' no es válido." }, { "JAXP_UNKNOWN_PROP_ERR", "Se está intentando acceder a la propiedad ''{0}'' de Transformer no válida." }, { "SAX2DOM_ADAPTER_ERR", "No se ha podido crear el adaptador SAX2DOM: ''{0}''." }, { "XSLTC_SOURCE_ERR", "Se ha llamado a XSLTCSource.build() sin haber definido la identificación del sistema." }, { "ER_RESULT_NULL", "El resultado no debe ser nulo" }, { "JAXP_INVALID_SET_PARAM_VALUE", "El valor del parámetro {0} debe ser un objeto Java válido" }, { "COMPILE_STDIN_ERR", "La opción -i debe utilizarse con la opción -o." }, { "COMPILE_USAGE_STR", "SINOPSIS\n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile [-o <salida>]\n      [-d <directorio>] [-j <archivo jar>] [-p <paquete>]\n      [-n] [-x] [-u] [-v] [-h] { <hoja de estilo> | -i }\n\nOPCIONES\n   -o <salida>    asigna el nombre de <salida> al translet\n                  generado. Por defecto, el nombre del translet se\n                  deriva del nombre de <hoja de estilo>. Esta opción\n                  se ignora si se compilan varias hojas de estilo.\n   -d <directorio> especifica un directorio de destino para el translet\n   -j <archivo jar>   empaqueta las clases de translet en un archivo jar del\n                  nombre especificado como <archivo jar>\n   -p <paquete>   especifica un prefijo de nombre de paquete para todas las clases de translet n\n                  generadas.\n   -n             permite poner en línea la plantilla (comportamiento por defecto mejor\n                  sobre la media).\n   -x             activa la salida del mensaje de depuración\n   -u             interpreta los argumentos <hoja de estilo> como URL\n   -i             obliga al compilador a leer la hoja de estilo de stdin\n   -v             imprime la versión del compilador\n   -h             imprime esta sentencia de uso\n" }, { "TRANSFORM_USAGE_STR", "SYNOPSIS \n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Transform [-j <archivo jar>]\n      [-x] [-n <iteraciones>] {-u <url_documento> | <documento>}\n      <clase> [<parámetro1>=<valor1> ...]\n\n   utiliza el translet <clase> para transformar un documento XML \n   especificado como <documento>. El translet <clase> se encuentra en\n   la CLASSPATH del usuario o en el <archivo jar> especificado opcionalmente.\nOPCIONES\n   -j <archivo jar>    especifica un archivo jar desde el que cargar el translet\n   -x              activa la salida del mensaje de depuración adicional\n   -n <iteraciones> ejecuta el número de <iteraciones> de una transformación y\n                   muestra la información de la creación de perfil\n   -u <url_documento> especifica el documento de entrada XML como una URL\n" }, { "STRAY_SORT_ERR", "<xsl:sort> sólo se puede utilizar en <xsl:for-each> o <xsl:apply-templates>." }, { "UNSUPPORTED_ENCODING", "La codificación de salida ''{0}'' no está soportada en esta JVM." }, { "SYNTAX_ERR", "Error de sintaxis en ''{0}''." }, { "CONSTRUCTOR_NOT_FOUND", "No se ha encontrado el constructor externo ''{0}''." }, { "NO_JAVA_FUNCT_THIS_REF", "El primer argumento de la función Java no estática ''{0}'' no es una referencia de objeto válida." }, { "TYPE_CHECK_ERR", "Error al comprobar el tipo de la expresión ''{0}''." }, { "TYPE_CHECK_UNK_LOC_ERR", "Error al comprobar el tipo de una expresión en una ubicación desconocida." }, { "ILLEGAL_CMDLINE_OPTION_ERR", "La opción de línea de comandos ''{0}'' no es válida." }, { "CMDLINE_OPT_MISSING_ARG_ERR", "Falta un argumento necesario en la opción de línea de comandos ''{0}''." }, { "WARNING_PLUS_WRAPPED_MSG", "WARNING:  ''{0}''\n       :{1}" }, { "WARNING_MSG", "WARNING:  ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "FATAL ERROR:  ''{0}''\n           :{1}" }, { "FATAL_ERR_MSG", "FATAL ERROR:  ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "ERROR:  ''{0}''\n     :{1}" }, { "ERROR_MSG", "ERROR:  ''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "Transformación que utiliza el translet ''{0}'' " }, { "TRANSFORM_WITH_JAR_STR", "Transformación que utiliza el translet ''{0}'' del archivo jar ''{1}''" }, { "COULD_NOT_CREATE_TRANS_FACT", "No se ha podido crear una instancia de la clase TransformerFactory ''{0}''." }, { "TRANSLET_NAME_JAVA_CONFLICT", "El nombre ''{0}'' no se ha podido utilizar como el nombre de la clase de translet porque contiene caracteres que no están permitidos en el nombre de la clase Java. Se ha utilizado el nombre ''{1}'' en su lugar." }, { "COMPILER_ERROR_KEY", "Errores del compilador:" }, { "COMPILER_WARNING_KEY", "Advertencias del compilador:" }, { "RUNTIME_ERROR_KEY", "Errores del translet:" }, { "INVALID_QNAME_ERR", "Un atributo cuyo valor debe ser un QName o lista de QNames separados por espacios en blanco tenía el valor ''{0}''" }, { "INVALID_NCNAME_ERR", "Un atributo cuyo valor debe ser un NCName tenía el valor ''{0}''" }, { "INVALID_METHOD_IN_OUTPUT", "El atributo method de un elemento <xsl:output> tenía el valor ''{0}''. El valor debe ser ''xml'', ''html'', ''text'' o qname-but-not-ncname" }, { "JAXP_GET_FEATURE_NULL_NAME", "El nombre de función no puede ser nulo en TransformerFactory.getFeature (nombre de cadena)." }, { "JAXP_SET_FEATURE_NULL_NAME", "El nombre de función no puede ser nulo en TransformerFactory.setFeature (nombre de cadena, valor booleano)." }, { "JAXP_UNSUPPORTED_FEATURE", "No se puede definir la función ''{0}''en esta fábrica del transformador." }, { "JAXP_SECUREPROCESSING_FEATURE", "FEATURE_SECURE_PROCESSING: no se puede definir la función en false cuando está presente el gestor de seguridad." }, { "OUTLINE_ERR_TRY_CATCH", "Error interno de XSLTC: el código de bytes generado contiene un bloque try-catch-finally y no se puede delimitar." }, { "OUTLINE_ERR_UNBALANCED_MARKERS", "Error interno de XSLTC: los marcadores OutlineableChunkStart y OutlineableChunkEnd deben estar equilibrados y correctamente anidados." }, { "OUTLINE_ERR_DELETED_TARGET", "Error interno de XSLTC: todavía se hace referencia a una instrucción que formaba parte de un bloque de código de bytes delimitado en el método original." }, { "OUTLINE_ERR_METHOD_TOO_BIG", "Error interno de XSLTC: un método en el translet excede la limitación de Java Virtual Machine de longitud de un método de 64 kilobytes. Normalmente, esto lo causan plantillas en una hoja de estilos demasiado grandes. Pruebe a reestructurar la hoja de estilos para utilizar plantillas más pequeñas." }, { "DESERIALIZE_TEMPLATES_ERR", "Cuando la seguridad de Java está activada, el soporte para anular la serialización de TemplatesImpl está desactivado. Esto se puede sustituir definiendo la propiedad del sistema jdk.xml.enableTemplatesImplDeserialization en true." } };
/*    */   }
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/org/apache/xalan/internal/xsltc/compiler/util/ErrorMessages_es.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */