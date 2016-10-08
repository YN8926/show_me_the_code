package hz.simplejee.dp.singleton;

/**
 * 比较完美的延迟加载方案
 * @author mokala
 *
 */
public class StaticSingleton {

	private StaticSingleton() {
		System.out.println("Singleton is create.");
	}
	/**
	 * 内部类实现延迟加载
	 * @author mokala
	 *
	 */
	private static class SingletonHolder {
		private static StaticSingleton instance = new StaticSingleton();
	}
	
	public static StaticSingleton getInstance() {
		return SingletonHolder.instance;
	}
}
