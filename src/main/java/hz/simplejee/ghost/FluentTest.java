package hz.simplejee.ghost;

public class FluentTest {

	/**
	 * 1.如果参数过多，相比较于一个一个参数设置，通过一个实体类设置显然更加方便，单这个实体类如果参数过多，会导致构造函数异常复杂
	 */
	public void testConstructor() {
		QueryUserEvent q = new QueryUserEvent("", 12, UserType.NORMAL);
	}
	
	/**
	 * 2.Fluent风格的代码多余多参数的设置会变得风格简单
	 */
	public void testFluent() {
		QueryUserEvent q = new QueryUserEvent().setUser("Fishcats").setAge(12).setType(UserType.GOLD);
	}
	static class QueryUserEvent {
		
		private String user;
		private Integer age;
		private UserType type;
		
		public QueryUserEvent() {
			
		}
		public QueryUserEvent(String user, Integer age, UserType type) {
			super();
			this.user = user;
			this.age = age;
			this.type = type;
		}
		public String getUser() {
			return user;
		}
		public QueryUserEvent setUser(String user) {
			this.user = user;
			return this;
		}
		public Integer getAge() {
			return age;
		}
		public QueryUserEvent setAge(Integer age) {
			this.age = age;
			return this;
		}
		public UserType getType() {
			return type;
		}
		public QueryUserEvent setType(UserType type) {
			this.type = type;
			return this;
		}
		
	}
	
	static enum UserType{
		NORMAL, GOLD;
	}
}
