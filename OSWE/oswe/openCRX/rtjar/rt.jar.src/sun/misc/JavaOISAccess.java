package sun.misc;

import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public interface JavaOISAccess {
  void setObjectInputFilter(ObjectInputStream paramObjectInputStream, ObjectInputFilter paramObjectInputFilter);
  
  ObjectInputFilter getObjectInputFilter(ObjectInputStream paramObjectInputStream);
  
  void checkArray(ObjectInputStream paramObjectInputStream, Class<?> paramClass, int paramInt) throws InvalidClassException;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/sun/misc/JavaOISAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */