package javax.management.remote;

import java.io.IOException;
import java.util.Map;
import javax.management.MBeanServer;

public interface JMXConnectorServerProvider {
  JMXConnectorServer newJMXConnectorServer(JMXServiceURL paramJMXServiceURL, Map<String, ?> paramMap, MBeanServer paramMBeanServer) throws IOException;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/javax/management/remote/JMXConnectorServerProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */