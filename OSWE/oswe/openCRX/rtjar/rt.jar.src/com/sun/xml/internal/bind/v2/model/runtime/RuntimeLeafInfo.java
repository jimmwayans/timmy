package com.sun.xml.internal.bind.v2.model.runtime;

import com.sun.xml.internal.bind.v2.model.core.LeafInfo;
import com.sun.xml.internal.bind.v2.runtime.Transducer;
import java.lang.reflect.Type;
import javax.xml.namespace.QName;

public interface RuntimeLeafInfo extends LeafInfo<Type, Class>, RuntimeNonElement {
  <V> Transducer<V> getTransducer();
  
  Class getClazz();
  
  QName[] getTypeNames();
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/bind/v2/model/runtime/RuntimeLeafInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */