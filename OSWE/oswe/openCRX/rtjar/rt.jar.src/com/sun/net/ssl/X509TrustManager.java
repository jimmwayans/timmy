package com.sun.net.ssl;

import java.security.cert.X509Certificate;

@Deprecated
public interface X509TrustManager extends TrustManager {
  boolean isClientTrusted(X509Certificate[] paramArrayOfX509Certificate);
  
  boolean isServerTrusted(X509Certificate[] paramArrayOfX509Certificate);
  
  X509Certificate[] getAcceptedIssuers();
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/net/ssl/X509TrustManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */