package com.sun.xml.internal.ws.wsdl.writer.document.soap;

import com.sun.xml.internal.txw2.TypedXmlWriter;
import com.sun.xml.internal.txw2.annotation.XmlAttribute;

public interface BodyType extends TypedXmlWriter {
  @XmlAttribute
  BodyType encodingStyle(String paramString);
  
  @XmlAttribute
  BodyType namespace(String paramString);
  
  @XmlAttribute
  BodyType use(String paramString);
  
  @XmlAttribute
  BodyType parts(String paramString);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/ws/wsdl/writer/document/soap/BodyType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */