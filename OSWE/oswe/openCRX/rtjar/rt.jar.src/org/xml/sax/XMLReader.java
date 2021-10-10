package org.xml.sax;

import java.io.IOException;

public interface XMLReader {
  boolean getFeature(String paramString) throws SAXNotRecognizedException, SAXNotSupportedException;
  
  void setFeature(String paramString, boolean paramBoolean) throws SAXNotRecognizedException, SAXNotSupportedException;
  
  Object getProperty(String paramString) throws SAXNotRecognizedException, SAXNotSupportedException;
  
  void setProperty(String paramString, Object paramObject) throws SAXNotRecognizedException, SAXNotSupportedException;
  
  void setEntityResolver(EntityResolver paramEntityResolver);
  
  EntityResolver getEntityResolver();
  
  void setDTDHandler(DTDHandler paramDTDHandler);
  
  DTDHandler getDTDHandler();
  
  void setContentHandler(ContentHandler paramContentHandler);
  
  ContentHandler getContentHandler();
  
  void setErrorHandler(ErrorHandler paramErrorHandler);
  
  ErrorHandler getErrorHandler();
  
  void parse(InputSource paramInputSource) throws IOException, SAXException;
  
  void parse(String paramString) throws IOException, SAXException;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/org/xml/sax/XMLReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */