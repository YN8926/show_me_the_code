package hz.simplejee.jdk.io.nio.hello;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class ServerMain {

	public static void main(String[] args) {
		try {
			//打开channel
			ServerSocketChannel servChannel = ServerSocketChannel.open();
			
			//绑定监听端口，设置连接为非阻塞模式
			servChannel.socket().bind(new InetSocketAddress("127.0.0.1", 8091));
			servChannel.configureBlocking(false);
			
			Selector selector = Selector.open();
			
			servChannel.register(selector, SelectionKey.OP_ACCEPT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
