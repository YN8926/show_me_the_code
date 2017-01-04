package hz.simplejee.netty;

import org.junit.Test;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ByteBufTest {

	/**
	 * 测试读写操作
	 */
	@Test
	public void testRW(){
		ByteBuf buf = Unpooled.buffer();
		buf.writeLong(123L);
		System.out.println(buf.readLong());
	}
	
	/**
	 * 并不清空缓冲区内容本身
	 */
	public void testClar() {
		
	}
	/**
	 * mark readerIndex
	 */
	@Test
	public void testMarkReaderIndex() {
		ByteBuf buf = Unpooled.buffer();
		buf.writeInt(999);
		buf.markReaderIndex();
		System.out.println(buf.readInt());
		buf.resetReaderIndex();
		System.out.println(buf.readInt());
		buf.resetReaderIndex();
		System.out.println(buf.readInt());
	}
	/**
	 * 查找操作
	 * @see io.netty.buffer.ByteBuf.indexOf(int, int, byte)
	 * @see io.netty.buffer.ByteBuf.bytesBefore(byte)
	 * @see io.netty.buffer.ByteBuf.forEachByte(ByteBufProcessor)
	 */
	
	/**
	 * 复制操作
	 * @see io.netty.buffer.ByteBuf.duplicate()
	 * @see io.netty.buffer.ByteBuf.copy()
	 * @see io.netty.buffer.ByteBuf.slice()
	 */
	
	/**
	 * 转换成标准的ByteBuffer
	 * @see io.netty.buffer.ByteBuf.nioBuffer()
	 */
	
	/**
	 * 随机读写(set/get)
	 */
}
