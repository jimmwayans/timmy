package com.sun.xml.internal.bind.v2.runtime.reflect;

import javax.xml.bind.JAXBException;
import org.xml.sax.SAXException;

public interface ListIterator<E> {
  boolean hasNext();
  
  E next() throws SAXException, JAXBException;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/bind/v2/runtime/reflect/ListIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */