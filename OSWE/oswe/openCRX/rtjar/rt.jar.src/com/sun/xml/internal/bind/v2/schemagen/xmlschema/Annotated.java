package com.sun.xml.internal.bind.v2.schemagen.xmlschema;

import com.sun.xml.internal.txw2.TypedXmlWriter;
import com.sun.xml.internal.txw2.annotation.XmlAttribute;
import com.sun.xml.internal.txw2.annotation.XmlElement;

public interface Annotated extends TypedXmlWriter {
  @XmlElement
  Annotation annotation();
  
  @XmlAttribute
  Annotated id(String paramString);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/bind/v2/schemagen/xmlschema/Annotated.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */