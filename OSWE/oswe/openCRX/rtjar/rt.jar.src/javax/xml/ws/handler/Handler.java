package javax.xml.ws.handler;

public interface Handler<C extends MessageContext> {
  boolean handleMessage(C paramC);
  
  boolean handleFault(C paramC);
  
  void close(MessageContext paramMessageContext);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/javax/xml/ws/handler/Handler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */