package com.sun.xml.internal.ws.api.pipe;

import com.sun.istack.internal.NotNull;
import com.sun.xml.internal.ws.api.message.AttachmentSet;
import com.sun.xml.internal.ws.api.message.Message;
import javax.xml.stream.XMLStreamReader;

public interface StreamSOAPCodec extends Codec {
  @NotNull
  Message decode(@NotNull XMLStreamReader paramXMLStreamReader);
  
  @NotNull
  Message decode(@NotNull XMLStreamReader paramXMLStreamReader, @NotNull AttachmentSet paramAttachmentSet);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/ws/api/pipe/StreamSOAPCodec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */