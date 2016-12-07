package hz.simplejee.openfire;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

public class Conn {
        private static XMPPConnection connection = null ;
       
        public static XMPPConnection getConnection(ConnectionConfiguration domain)
                        throws XMPPException {
                XMPPConnection connection = new XMPPConnection(domain);
                connection.connect();
                return connection;
        }

        public static XMPPConnection getConnection(String domain, int port)  throws XMPPException {
                if(connection==null){
                        ConnectionConfiguration config = new ConnectionConfiguration(domain,port);
                        config.setSecurityMode(ConnectionConfiguration.SecurityMode.enabled);       
                        config.setSASLAuthenticationEnabled(true); 
                        connection = new XMPPConnection(config);
                        connection.connect();
                }
                return connection;
        }
}