package com.sun.xml.internal.ws.wsdl.writer.document;

import com.sun.xml.internal.txw2.TypedXmlWriter;
import com.sun.xml.internal.txw2.annotation.XmlAttribute;
import javax.xml.namespace.QName;

public interface ParamType extends TypedXmlWriter, Documented {
  @XmlAttribute
  ParamType message(QName paramQName);
  
  @XmlAttribute
  ParamType name(String paramString);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/ws/wsdl/writer/document/ParamType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */