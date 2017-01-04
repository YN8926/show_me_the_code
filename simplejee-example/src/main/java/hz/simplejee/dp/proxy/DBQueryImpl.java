package hz.simplejee.dp.proxy;

import java.util.concurrent.TimeUnit;

public class DBQueryImpl implements DBQuery{

	/**
	 * 假设初始化是一个非常耗时的操作
	 */
	public DBQueryImpl() {
		try {
			TimeUnit.SECONDS.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String query() {
		return "Hello World";
	}
}
