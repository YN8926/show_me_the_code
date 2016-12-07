package hz.simplejee.openfire;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

public class Test {

        public static boolean LongAccount(XMPPConnection connection,
                        String username, String password) {
                try {
                        connection.login(username, password);
                        return true;
                } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                }
        }

        public static void main(String[] args) throws XMPPException {
                XMPPConnection connection = Conn.getConnection("127.0.0.1",5222);
                boolean t = LongAccount(connection, "wangtao", "1234");
                System.out.println("t login =" + t);
                if(t){
                    ChatManager chatmanager = connection.getChatManager();  
                    //新建一个会话   
                    Chat newChat = chatmanager.createChat("wanghui@mokalas-macbook-pro.local", new MessageListener() {
                    public void processMessage(Chat chat, Message message) {  
                    	System.out.println("start me , Received from 【" + message.getFrom() + "】 message: " + message.getBody());  
                    }
                   });  
                    //发送消息   
                    newChat.sendMessage("客户端发来的消息xxx");
                }
        }
}