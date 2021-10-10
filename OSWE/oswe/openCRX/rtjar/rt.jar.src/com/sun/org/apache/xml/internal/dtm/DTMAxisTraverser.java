/*    */ package com.sun.org.apache.xml.internal.dtm;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DTMAxisTraverser
/*    */ {
/*    */   public int first(int context) {
/* 63 */     return next(context, context);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int first(int context, int extendedTypeID) {
/* 82 */     return next(context, context, extendedTypeID);
/*    */   }
/*    */   
/*    */   public abstract int next(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract int next(int paramInt1, int paramInt2, int paramInt3);
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/org/apache/xml/internal/dtm/DTMAxisTraverser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */