package com.sun.xml.internal.ws.api.model.wsdl;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import javax.xml.namespace.QName;

public interface WSDLService extends WSDLObject, WSDLExtensible {
  @NotNull
  WSDLModel getParent();
  
  @NotNull
  QName getName();
  
  WSDLPort get(QName paramQName);
  
  WSDLPort getFirstPort();
  
  @Nullable
  WSDLPort getMatchingPort(QName paramQName);
  
  Iterable<? extends WSDLPort> getPorts();
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/ws/api/model/wsdl/WSDLService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */