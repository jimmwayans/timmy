package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public interface DSAPublicKey extends DSAKey, PublicKey {
  public static final long serialVersionUID = 1234526332779022332L;
  
  BigInteger getY();
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/java/security/interfaces/DSAPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */