package hz.simplejee.dp.proxy;

public class Main {

	public static void main(String[] args) {
		/**
		 * 在构建时并未初始化重量级对象，而是初始化了代理类
		 */
		DBQuery dbQuery = new DBQueryProxy();
		/**
		 * 真正调用时构建重量级对象，并执行其方法
		 */
		System.out.println(dbQuery.query());;
	}
}
