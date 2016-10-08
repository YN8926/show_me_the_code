package hz.simplejee.jdk.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 测试一下ExecutorService的shutdown方法是否会在所有任务执行完毕之后才关闭
 * @author mokala
 *
 */
public class EexcutorTest1 {

	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(3);
		for(int i = 0; i < 13; i++){
			e.execute(new MyThread(i));
		}
		e.shutdown();
		System.out.println("end.....");
		
	}
	static class MyThread extends Thread {
		private String name;
		public MyThread(int i){
			this.name = "name-" + i;
		}
		
		@Override
		public void run() {
			System.out.println(String.format("Run Thread[%s] started", this.name));
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(String.format("Run Thread[%s] end.", this.name));
		}
	}
}
