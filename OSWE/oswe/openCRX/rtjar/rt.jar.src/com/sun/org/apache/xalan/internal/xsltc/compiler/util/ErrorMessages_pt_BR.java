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
/*    */ public class ErrorMessages_pt_BR
/*    */   extends ListResourceBundle
/*    */ {
/*    */   public Object[][] getContents() {
/* 96 */     return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "Mais de uma folha de estilos definida no mesmo arquivo." }, { "TEMPLATE_REDEF_ERR", "O modelo ''{0}'' já foi definido nesta folha de estilos." }, { "TEMPLATE_UNDEF_ERR", "O modelo ''{0}'' não foi definido nesta folha de estilos." }, { "VARIABLE_REDEF_ERR", "A variável ''{0}'' está definida várias vezes no mesmo escopo." }, { "VARIABLE_UNDEF_ERR", "Variável ou parâmetro ''{0}'' indefinido." }, { "CLASS_NOT_FOUND_ERR", "Não é possível localizar a classe ''{0}''." }, { "METHOD_NOT_FOUND_ERR", "Não é possível localizar o método externo ''{0}'' (deve ser público)." }, { "ARGUMENT_CONVERSION_ERR", "Não é possível converter o argumento/tipo de retorno na chamada para o método ''{0}''" }, { "FILE_NOT_FOUND_ERR", "Arquivo ou URI ''{0}'' não encontrado." }, { "INVALID_URI_ERR", "URI inválido ''{0}''." }, { "FILE_ACCESS_ERR", "Não é possível abrir o arquivo ou o URI ''{0}''." }, { "MISSING_ROOT_ERR", "elemento <xsl:stylesheet> ou <xsl:transform> esperado." }, { "NAMESPACE_UNDEF_ERR", "O prefixo do namespace ''{0}'' não foi declarado." }, { "FUNCTION_RESOLVE_ERR", "Não é possível resolver a chamada para a função ''{0}''." }, { "NEED_LITERAL_ERR", "O argumento para \"{0}'' deve ser uma string literal." }, { "XPATH_PARSER_ERR", "Erro durante o parsing da expressão XPath ''{0}''." }, { "REQUIRED_ATTR_ERR", "O atributo obrigatório ''{0}'' não foi encontrado." }, { "ILLEGAL_CHAR_ERR", "Caractere inválido ''{0}'' na expressão XPath." }, { "ILLEGAL_PI_ERR", "Nome inválido ''{0}'' para instrução de processamento." }, { "STRAY_ATTRIBUTE_ERR", "Atributo ''{0}'' fora do elemento." }, { "ILLEGAL_ATTRIBUTE_ERR", "Atributo ''{0}'' inválido." }, { "CIRCULAR_INCLUDE_ERR", "Import/Include circular. Folha de estilos ''{0}'' já carregada." }, { "RESULT_TREE_SORT_ERR", "Os fragmentos da árvore não podem ser classificados (os elementos <xsl:sort> foram ignorados). Você deve classificar os nós ao criar a árvore de resultados." }, { "SYMBOLS_REDEF_ERR", "A formatação decimal ''{0}'' já foi definida." }, { "XSL_VERSION_ERR", "A versão XSL \"{0}'' não é suportada por XSLTC." }, { "CIRCULAR_VARIABLE_ERR", "Referência de variável/parâmetro circulares ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Operador desconhecido para a expressão binária." }, { "ILLEGAL_ARG_ERR", "Argumento(s) inválido(s) para a chamada da função." }, { "DOCUMENT_ARG_ERR", "O segundo argumento para a função document() deve ser um conjunto de nós." }, { "MISSING_WHEN_ERR", "É necessário, pelo menos, um elemento <xsl:when> em <xsl:choose>." }, { "MULTIPLE_OTHERWISE_ERR", "É permitido somente um elemento <xsl:otherwise> em <xsl:choose>." }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> só pode ser usado em <xsl:choose>." }, { "STRAY_WHEN_ERR", "<xsl:when> só pode ser usado em <xsl:choose>." }, { "WHEN_ELEMENT_ERR", "Somente os elementos <xsl:when> e <xsl:otherwise> são permitidos em <xsl:choose>." }, { "UNNAMED_ATTRIBSET_ERR", "<xsl:attribute-set> não encontrado no atributo 'name'." }, { "ILLEGAL_CHILD_ERR", "Elemento filho inválido." }, { "ILLEGAL_ELEM_NAME_ERR", "Você não pode chamar um elemento ''{0}''" }, { "ILLEGAL_ATTR_NAME_ERR", "Você não pode chamar um atributo ''{0}''" }, { "ILLEGAL_TEXT_NODE_ERR", "Dados de texto fora do elemento <xsl:stylesheet> de nível superior." }, { "SAX_PARSER_CONFIG_ERR", "Parser de JAXP não configurado corretamente" }, { "INTERNAL_ERR", "Erro interno-XSLTC irrecuperável: ''{0}''" }, { "UNSUPPORTED_XSL_ERR", "Elemento XSL não suportado ''{0}''." }, { "UNSUPPORTED_EXT_ERR", "Extensão de XSLTC não reconhecida ''{0}''." }, { "MISSING_XSLT_URI_ERR", "O documento de entrada não é uma folha de estilos (o namespace XSL não foi declarado no elemento-raiz)." }, { "MISSING_XSLT_TARGET_ERR", "Não foi possível localizar o alvo da folha de estilos ''{0}''." }, { "ACCESSING_XSLT_TARGET_ERR", "Não foi possível ler o alvo ''{0}'' da folha de estilos, porque o acesso a ''{1}'' não é permitido em virtude da restrição definida pela propriedade accessExternalStylesheet." }, { "NOT_IMPLEMENTED_ERR", "Não implementado: ''{0}''." }, { "NOT_STYLESHEET_ERR", "O documento de entrada não contém uma folha de estilos XSL." }, { "ELEMENT_PARSE_ERR", "Não foi possível fazer parsing do elemento ''{0}''" }, { "KEY_USE_ATTR_ERR", "O atributo use de <key> deve ser node, node-set, string ou number." }, { "OUTPUT_VERSION_ERR", "A versão do documento XML de saída deve ser 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "Operação desconhecida para a expressão relacional" }, { "ATTRIBSET_UNDEF_ERR", "Tentativa de usar um conjunto de atributos ''{0}'' não existente." }, { "ATTR_VAL_TEMPLATE_ERR", "Não é possível fazer parsing do modelo do valor do atributo ''{0}''." }, { "UNKNOWN_SIG_TYPE_ERR", "Tipo de dados desconhecido na assinatura da classe ''{0}''." }, { "DATA_CONVERSION_ERR", "Não é possível converter o tipo de dados ''{0}'' em ''{1}''." }, { "NO_TRANSLET_CLASS_ERR", "Este Templates não contém uma definição de classe translet válida." }, { "NO_MAIN_TRANSLET_ERR", "Este Templates não contém uma classe com o nome ''{0}''." }, { "TRANSLET_CLASS_ERR", "Não foi possível carregar a classe translet ''{0}''." }, { "TRANSLET_OBJECT_ERR", "Classe translet carregada, mas não é possível criar uma instância translet." }, { "ERROR_LISTENER_NULL_ERR", "Tentativa de definir ErrorListener para ''{0}'' como nulo" }, { "JAXP_UNKNOWN_SOURCE_ERR", "Somente StreamSource, SAXSource e DOMSource são suportados por XSLTC" }, { "JAXP_NO_SOURCE_ERR", "O objeto source especificado para ''{0}'' não tem conteúdo." }, { "JAXP_COMPILE_ERR", "Não foi possível compilar a folha de estilos" }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory não reconhece o atributo ''{0}''." }, { "JAXP_INVALID_ATTR_VALUE_ERR", "Valor incorreto especificado para o atributo ''{0}''." }, { "JAXP_SET_RESULT_ERR", "setResult() deve ser chamado antes de startDocument()." }, { "JAXP_NO_TRANSLET_ERR", "O Transformer não tem um objeto translet encapsulado." }, { "JAXP_NO_HANDLER_ERR", "Nenhum handler de saída definido para o resultado da transformação." }, { "JAXP_NO_RESULT_ERR", "O objeto result especificado para ''{0}'' é inválido." }, { "JAXP_UNKNOWN_PROP_ERR", "Tentativa de acessar a propriedade ''{0}'' do Transformer inválida." }, { "SAX2DOM_ADAPTER_ERR", "Não foi possível criar o adaptador SAX2DOM: ''{0}''." }, { "XSLTC_SOURCE_ERR", "XSLTCSource.build() chamado sem o systemId ser definido." }, { "ER_RESULT_NULL", "O resultado não deve ser nulo" }, { "JAXP_INVALID_SET_PARAM_VALUE", "O valor do parâmetro {0} deve ser um Objeto Java válido" }, { "COMPILE_STDIN_ERR", "A opção -i deve ser usada com a opção -o." }, { "COMPILE_USAGE_STR", "SINOPSE\n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile [-o <saída>]\n      [-d <diretório>] [-j <jarfile>] [-p <pacote>]\n      [-n] [-x] [-u] [-v] [-h] { <folha de estilos> | -i }\n\nOPÇÕES\n   -o <saída>    atribui o nome <saída> ao translet\n                  gerado.  Por padrão, o nome translet\n                  origina-se do nome <folha de estilos>.  Esta opção\n                  é ignorada caso sejam compiladas várias folhas de estilos.\n   -d <diretório> especifica um diretório de destino para translet\n   -j <arquivo jar>   empacota as classes translet em um arquivo jar do\n                  nome especificado como <arquivo jar>\n   -p <pacote>   especifica um prefixo de nome do pacote para todas as classes\n                  translet geradas.\n   -n             permite a inclusão do modelo na linha (comportamento padrão melhor\n                  em média).\n   -x             ativa a saída de mensagens de depuração adicionais\n   -u             interpreta os argumentos <folha de estilos> como URLs\n   -i             obriga o compilador a ler a folha de estilos de stdin\n   -v             imprime a versão do compilador\n   -h             imprime esta instrução de uso\n" }, { "TRANSFORM_USAGE_STR", "SINOPSE \n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Transforme [-j <arquivo jar>]\n      [-x] [-n <iterações>] {-u <url_documento> | <documento>}\n      <classe> [<parâm1>=<valor1> ...]\n\n   usa a <classe> translet para transformar um documento XML \n   especificado como <documento>. O translet <classe> está no\n   CLASSPATH do usuário ou no <arquivo jar> opcionalmente especificado.\nOPÇÕES\n   -j <arquivo jar>    especifica um arquivo jar com base no qual será carregado o translet\n   -x              ativa a saída de mensagens de depuração adicionais\n   -n <iterações> executa a transformação <iterações> vezes e\n                   exibe as informações de perfis\n   -u <url_documento> especifica o documento XML de entrada na forma de URL\n" }, { "STRAY_SORT_ERR", "<xsl:sort> só pode ser usado dentro de <xsl:for-each> ou <xsl:apply-templates>." }, { "UNSUPPORTED_ENCODING", "A codificação de saída ''{0}'' não é suportada nesta JVM." }, { "SYNTAX_ERR", "Erro de sintaxe em ''{0}''." }, { "CONSTRUCTOR_NOT_FOUND", "Não é possível localizar o construtor externo ''{0}''." }, { "NO_JAVA_FUNCT_THIS_REF", "O primeiro argumento para a função Java não static ''{0}'' não é uma referência de objeto válida." }, { "TYPE_CHECK_ERR", "Erro ao verificar o tipo de expressão ''{0}''." }, { "TYPE_CHECK_UNK_LOC_ERR", "Erro ao verificar o tipo de uma expressão em uma localização desconhecida." }, { "ILLEGAL_CMDLINE_OPTION_ERR", "A opção da linha de comandos ''{0}'' não é válida." }, { "CMDLINE_OPT_MISSING_ARG_ERR", "A opção da linha de comandos ''{0}'' não encontrou um argumento obrigatório." }, { "WARNING_PLUS_WRAPPED_MSG", "WARNING:  ''{0}''\n       :{1}" }, { "WARNING_MSG", "WARNING:  ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "FATAL ERROR:  ''{0}''\n           :{1}" }, { "FATAL_ERR_MSG", "FATAL ERROR:  ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "ERROR:  ''{0}''\n     :{1}" }, { "ERROR_MSG", "ERROR:  ''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "Transformar usando translet ''{0}'' " }, { "TRANSFORM_WITH_JAR_STR", "Transformar usando translet ''{0}'' do arquivo jar ''{1}''" }, { "COULD_NOT_CREATE_TRANS_FACT", "Não foi possível criar uma instância da classe TransformerFactory ''{0}''." }, { "TRANSLET_NAME_JAVA_CONFLICT", "Não foi possível usar o nome ''{0}'' como o nome da classe translet, pois ele contém caracteres que não são permitidos no nome da classe Java. O nome ''{1}'' foi usado." }, { "COMPILER_ERROR_KEY", "Erros do compilador:" }, { "COMPILER_WARNING_KEY", "Advertências do compilador:" }, { "RUNTIME_ERROR_KEY", "Erros de translet:" }, { "INVALID_QNAME_ERR", "Um atributo cujo valor deve ser um QName ou uma lista de QNames separada por espaços em branco tinha o valor ''{0}''" }, { "INVALID_NCNAME_ERR", "Um atributo cujo valor deve ser um NCName tinha o valor ''{0}''" }, { "INVALID_METHOD_IN_OUTPUT", "O atributo method de um elemento <xsl:output> tinha o valor ''{0}''. O valor deve ser um dos seguintes: ''xml'', ''html'', ''text'', ou qname, mas não ncname" }, { "JAXP_GET_FEATURE_NULL_NAME", "O nome do recurso não pode ser nulo em TransformerFactory.getFeature(Nome da string)." }, { "JAXP_SET_FEATURE_NULL_NAME", "O nome do recurso não pode ser nulo em TransformerFactory.setFeature(Nome da string, valor booliano)." }, { "JAXP_UNSUPPORTED_FEATURE", "Não é possível definir o recurso ''{0}'' nesta TransformerFactory." }, { "JAXP_SECUREPROCESSING_FEATURE", "FEATURE_SECURE_PROCESSING: Não é possível definir o recurso como falso quando o gerenciador de segurança está presente." }, { "OUTLINE_ERR_TRY_CATCH", "Erro interno de XSLTC: o byte code gerado contém um bloco try-catch-finally e não pode ser outlined." }, { "OUTLINE_ERR_UNBALANCED_MARKERS", "Erro interno de XSLTC: os marcadores OutlineableChunkStart e OutlineableChunkEnd devem ser balanceados e aninhados corretamente." }, { "OUTLINE_ERR_DELETED_TARGET", "Erro interno de XSLTC: ainda há referência no método original a uma instrução que fazia parte de um bloco de byte code que foi outlined." }, { "OUTLINE_ERR_METHOD_TOO_BIG", "Erro interno de XSLTC: um método no translet excede a limitação da Máquina Virtual Java quanto ao tamanho de um método de de 64 kilobytes. Em geral, essa situação é causada por modelos de uma folha de estilos que são muito grandes. Tente reestruturar sua folha de estilos de forma a usar modelos menores." }, { "DESERIALIZE_TEMPLATES_ERR", "Quando a segurança do Java está ativada, o suporte para desserializar TemplatesImpl fica desativado. Essa situação pode ser corrigida definindo a propriedade do sistema jdk.xml.enableTemplatesImplDeserialization como true." } };
/*    */   }
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/org/apache/xalan/internal/xsltc/compiler/util/ErrorMessages_pt_BR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */