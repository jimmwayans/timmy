package com.sun.xml.internal.ws.api;

import com.sun.istack.internal.NotNull;
import java.util.Set;

public interface ComponentRegistry extends Component {
  @NotNull
  Set<Component> getComponents();
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/ws/api/ComponentRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */