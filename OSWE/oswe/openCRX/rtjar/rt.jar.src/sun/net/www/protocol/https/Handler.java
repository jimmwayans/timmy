/*    */ package sun.net.www.protocol.https;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.Proxy;
/*    */ import java.net.URL;
/*    */ import java.net.URLConnection;
/*    */ import sun.net.www.protocol.http.Handler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Handler
/*    */   extends Handler
/*    */ {
/*    */   protected String proxy;
/*    */   protected int proxyPort;
/*    */   
/*    */   protected int getDefaultPort() {
/* 42 */     return 443;
/*    */   }
/*    */   
/*    */   public Handler() {
/* 46 */     this.proxy = null;
/* 47 */     this.proxyPort = -1;
/*    */   }
/*    */   
/*    */   public Handler(String paramString, int paramInt) {
/* 51 */     this.proxy = paramString;
/* 52 */     this.proxyPort = paramInt;
/*    */   }
/*    */ 
/*    */   
/*    */   protected URLConnection openConnection(URL paramURL) throws IOException {
/* 57 */     return openConnection(paramURL, (Proxy)null);
/*    */   }
/*    */ 
/*    */   
/*    */   protected URLConnection openConnection(URL paramURL, Proxy paramProxy) throws IOException {
/* 62 */     return new HttpsURLConnectionImpl(paramURL, paramProxy, this);
/*    */   }
/*    */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/sun/net/www/protocol/https/Handler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */