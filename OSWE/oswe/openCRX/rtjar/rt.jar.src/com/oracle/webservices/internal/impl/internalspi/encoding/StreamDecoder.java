package com.oracle.webservices.internal.impl.internalspi.encoding;

import com.sun.xml.internal.ws.api.SOAPVersion;
import com.sun.xml.internal.ws.api.message.AttachmentSet;
import com.sun.xml.internal.ws.api.message.Message;
import java.io.IOException;
import java.io.InputStream;

public interface StreamDecoder {
  Message decode(InputStream paramInputStream, String paramString, AttachmentSet paramAttachmentSet, SOAPVersion paramSOAPVersion) throws IOException;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/oracle/webservices/internal/impl/internalspi/encoding/StreamDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */