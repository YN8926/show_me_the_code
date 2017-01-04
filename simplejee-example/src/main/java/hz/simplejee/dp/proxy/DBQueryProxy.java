package hz.simplejee.dp.proxy;

/**
 * 代理类可达到重量级的真实对象延迟加载
 * @author mokala
 *
 */
public class DBQueryProxy implements DBQuery {

	private DBQuery dbQuery = null;
	@Override
	public String query() {
		if(dbQuery == null) {
			dbQuery = new DBQueryImpl();
		}
		return dbQuery.query();
	}
}
