/*     */ package com.sun.jmx.defaults;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JmxProperties
/*     */ {
/*     */   public static final String JMX_INITIAL_BUILDER = "javax.management.builder.initial";
/*     */   public static final String MLET_LIB_DIR = "jmx.mlet.library.dir";
/*     */   public static final String JMX_SPEC_NAME = "jmx.specification.name";
/*     */   public static final String JMX_SPEC_VERSION = "jmx.specification.version";
/*     */   public static final String JMX_SPEC_VENDOR = "jmx.specification.vendor";
/*     */   public static final String JMX_IMPL_NAME = "jmx.implementation.name";
/*     */   public static final String JMX_IMPL_VENDOR = "jmx.implementation.vendor";
/*     */   public static final String JMX_IMPL_VERSION = "jmx.implementation.version";
/*     */   public static final String MBEANSERVER_LOGGER_NAME = "javax.management.mbeanserver";
/* 123 */   public static final Logger MBEANSERVER_LOGGER = Logger.getLogger("javax.management.mbeanserver");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String MLET_LOGGER_NAME = "javax.management.mlet";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 135 */   public static final Logger MLET_LOGGER = Logger.getLogger("javax.management.mlet");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String MONITOR_LOGGER_NAME = "javax.management.monitor";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 147 */   public static final Logger MONITOR_LOGGER = Logger.getLogger("javax.management.monitor");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TIMER_LOGGER_NAME = "javax.management.timer";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 159 */   public static final Logger TIMER_LOGGER = Logger.getLogger("javax.management.timer");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String NOTIFICATION_LOGGER_NAME = "javax.management.notification";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 171 */   public static final Logger NOTIFICATION_LOGGER = Logger.getLogger("javax.management.notification");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String RELATION_LOGGER_NAME = "javax.management.relation";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 183 */   public static final Logger RELATION_LOGGER = Logger.getLogger("javax.management.relation");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String MODELMBEAN_LOGGER_NAME = "javax.management.modelmbean";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 195 */   public static final Logger MODELMBEAN_LOGGER = Logger.getLogger("javax.management.modelmbean");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String MISC_LOGGER_NAME = "javax.management.misc";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 207 */   public static final Logger MISC_LOGGER = Logger.getLogger("javax.management.misc");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String SNMP_LOGGER_NAME = "javax.management.snmp";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 219 */   public static final Logger SNMP_LOGGER = Logger.getLogger("javax.management.snmp");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String SNMP_ADAPTOR_LOGGER_NAME = "javax.management.snmp.daemon";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 231 */   public static final Logger SNMP_ADAPTOR_LOGGER = Logger.getLogger("javax.management.snmp.daemon");
/*     */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/jmx/defaults/JmxProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */