package javax.xml.ws;

import java.security.Principal;
import javax.xml.ws.handler.MessageContext;
import org.w3c.dom.Element;

public interface WebServiceContext {
  MessageContext getMessageContext();
  
  Principal getUserPrincipal();
  
  boolean isUserInRole(String paramString);
  
  EndpointReference getEndpointReference(Element... paramVarArgs);
  
  <T extends EndpointReference> T getEndpointReference(Class<T> paramClass, Element... paramVarArgs);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/javax/xml/ws/WebServiceContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */