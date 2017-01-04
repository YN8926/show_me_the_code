package hz.simplejee.netty.hello;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		EventLoopGroup workerGroup = new NioEventLoopGroup();

		try {
			Bootstrap b = new Bootstrap();
			b.group(workerGroup).channel(NioSocketChannel.class).option(ChannelOption.TCP_NODELAY, true)
					.handler(new LoggingHandler(LogLevel.TRACE))
					.handler(new ChannelInitializer<SocketChannel>() {
						
						
						
						@Override
						protected void initChannel(SocketChannel ch) throws Exception {
							ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
								@Override
								public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
									//super.channelRead(ctx, msg);
									System.out.println("reading....");
									ByteBuf buf = (ByteBuf)msg;
									byte bytes[] = new byte[buf.readableBytes()];
									buf.readBytes(bytes);
									System.out.println("readed: " + new String(bytes));
									buf.release();
								}
								@Override
								public void channelActive(ChannelHandlerContext ctx) throws Exception {
									super.channelActive(ctx);
									System.out.println("开始向服务器发送报文...");
									String msg = "Hello , I'm a client.";
									ByteBuf buf = ctx.alloc().buffer(4 * msg.length());
									buf.writeBytes(msg.getBytes());
									ctx.write(buf);
									ctx.flush();
									System.out.println("向Server发送消息完毕.");
								}
							});
						}
					});
			ChannelFuture f = b.connect("localhost", 9999).sync();
			System.out.println("连接Server成功.");
			f.channel().closeFuture().sync();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			workerGroup.shutdownGracefully();
		}
	}
}
