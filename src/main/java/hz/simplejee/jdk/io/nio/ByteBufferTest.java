package hz.simplejee.jdk.io.nio;

import java.nio.ByteBuffer;

import org.junit.Test;

public class ByteBufferTest {

	/**
	 * 由于只存在一个位置指针处理读写操作,因此每次读写的时候都要调用flip()和clear()
	 */
	@Test
	public void testFlip(){
		ByteBuffer buf = ByteBuffer.allocate(100);
		buf.put("我是Mokala".getBytes());
		buf.flip();
		byte bytes[] = new byte[buf.remaining()];
		buf.get(bytes);
		System.out.println(new String(bytes));
	}
}
