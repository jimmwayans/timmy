/*    */ package com.sun.corba.se.spi.activation;
/*    */ 
/*    */ import org.omg.CORBA.TypeCode;
/*    */ import org.omg.CORBA.portable.InputStream;
/*    */ import org.omg.CORBA.portable.OutputStream;
/*    */ import org.omg.CORBA.portable.Streamable;
/*    */ 
/*    */ 
/*    */ public final class ActivatorHolder
/*    */   implements Streamable
/*    */ {
/* 12 */   public Activator value = null;
/*    */ 
/*    */ 
/*    */   
/*    */   public ActivatorHolder() {}
/*    */ 
/*    */   
/*    */   public ActivatorHolder(Activator paramActivator) {
/* 20 */     this.value = paramActivator;
/*    */   }
/*    */ 
/*    */   
/*    */   public void _read(InputStream paramInputStream) {
/* 25 */     this.value = ActivatorHelper.read(paramInputStream);
/*    */   }
/*    */ 
/*    */   
/*    */   public void _write(OutputStream paramOutputStream) {
/* 30 */     ActivatorHelper.write(paramOutputStream, this.value);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeCode _type() {
/* 35 */     return ActivatorHelper.type();
/*    */   }
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/corba/se/spi/activation/ActivatorHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */