package hz.simplejee.dp.singleton;
/**
 * 懒汉式单例，存在同步的性能问题
 * @author mokala
 *
 */
public class LazySingleton {
	private LazySingleton() {
		System.out.println("Lazy Singleton create.");
	}
	
	private static LazySingleton instance = null;
	
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	//TODO 使用main方法测试性能
}
