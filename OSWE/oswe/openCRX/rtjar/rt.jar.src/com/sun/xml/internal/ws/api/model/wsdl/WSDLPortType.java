package com.sun.xml.internal.ws.api.model.wsdl;

import javax.xml.namespace.QName;

public interface WSDLPortType extends WSDLObject, WSDLExtensible {
  QName getName();
  
  WSDLOperation get(String paramString);
  
  Iterable<? extends WSDLOperation> getOperations();
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/ws/api/model/wsdl/WSDLPortType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */