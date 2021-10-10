/*    */ package com.sun.xml.internal.bind.v2.schemagen;
/*    */ 
/*    */ import com.sun.xml.internal.bind.v2.schemagen.xmlschema.ContentModelContainer;
/*    */ import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Particle;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ enum GroupKind
/*    */ {
/* 37 */   ALL("all"), SEQUENCE("sequence"), CHOICE("choice");
/*    */   
/*    */   private final String name;
/*    */   
/*    */   GroupKind(String name) {
/* 42 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   Particle write(ContentModelContainer parent) {
/* 49 */     return (Particle)parent._element(this.name, Particle.class);
/*    */   }
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/bind/v2/schemagen/GroupKind.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */