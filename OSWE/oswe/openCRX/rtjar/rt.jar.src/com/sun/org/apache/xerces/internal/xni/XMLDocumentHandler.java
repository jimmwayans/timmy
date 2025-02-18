package com.sun.org.apache.xerces.internal.xni;

import com.sun.org.apache.xerces.internal.xni.parser.XMLDocumentSource;

public interface XMLDocumentHandler {
  void startDocument(XMLLocator paramXMLLocator, String paramString, NamespaceContext paramNamespaceContext, Augmentations paramAugmentations) throws XNIException;
  
  void xmlDecl(String paramString1, String paramString2, String paramString3, Augmentations paramAugmentations) throws XNIException;
  
  void doctypeDecl(String paramString1, String paramString2, String paramString3, Augmentations paramAugmentations) throws XNIException;
  
  void comment(XMLString paramXMLString, Augmentations paramAugmentations) throws XNIException;
  
  void processingInstruction(String paramString, XMLString paramXMLString, Augmentations paramAugmentations) throws XNIException;
  
  void startElement(QName paramQName, XMLAttributes paramXMLAttributes, Augmentations paramAugmentations) throws XNIException;
  
  void emptyElement(QName paramQName, XMLAttributes paramXMLAttributes, Augmentations paramAugmentations) throws XNIException;
  
  void startGeneralEntity(String paramString1, XMLResourceIdentifier paramXMLResourceIdentifier, String paramString2, Augmentations paramAugmentations) throws XNIException;
  
  void textDecl(String paramString1, String paramString2, Augmentations paramAugmentations) throws XNIException;
  
  void endGeneralEntity(String paramString, Augmentations paramAugmentations) throws XNIException;
  
  void characters(XMLString paramXMLString, Augmentations paramAugmentations) throws XNIException;
  
  void ignorableWhitespace(XMLString paramXMLString, Augmentations paramAugmentations) throws XNIException;
  
  void endElement(QName paramQName, Augmentations paramAugmentations) throws XNIException;
  
  void startCDATA(Augmentations paramAugmentations) throws XNIException;
  
  void endCDATA(Augmentations paramAugmentations) throws XNIException;
  
  void endDocument(Augmentations paramAugmentations) throws XNIException;
  
  void setDocumentSource(XMLDocumentSource paramXMLDocumentSource);
  
  XMLDocumentSource getDocumentSource();
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/org/apache/xerces/internal/xni/XMLDocumentHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */