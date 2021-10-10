package com.sun.corba.se.spi.activation;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocation;
import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

public interface LocatorOperations {
  ServerLocation locateServer(int paramInt, String paramString) throws NoSuchEndPoint, ServerNotRegistered, ServerHeldDown;
  
  ServerLocationPerORB locateServerForORB(int paramInt, String paramString) throws InvalidORBid, ServerNotRegistered, ServerHeldDown;
  
  int getEndpoint(String paramString) throws NoSuchEndPoint;
  
  int getServerPortForType(ServerLocationPerORB paramServerLocationPerORB, String paramString) throws NoSuchEndPoint;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/corba/se/spi/activation/LocatorOperations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */