package hz.simplejee.dp.singleton;

/**
 * 一个最为基础的单例
 * @author mokala
 *
 */
public class SimpleSingleton {
	
	/**
	 * 构造函数必须私有
	 */
	private SimpleSingleton() {
		System.out.println("Singleton is create.");
	}
	
	/**
	 * 在类加载时初始化单例对象
	 * 由于是在类加载时初始化，故不存在多线程同步问题
	 */
	private static SimpleSingleton instance = new SimpleSingleton();
	/**
	 * 提供getInstance方法，修饰符为public static
	 * @return
	 */
	public static SimpleSingleton getInstance() {
		return instance;
	}
	
	/**
	 * 假设单例类扮演了其他角色,则这个功能的调用会导致类加载，也就导致单例的被动初始化，而无论单例实例是否会被用到，
	 * 由此引申除了延迟加载的需求
	 */
	public static void testFun() {
		System.out.println("这是类的另一个功能");
	}
}
