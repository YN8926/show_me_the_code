package hz.simplejee.mock.mockito;

import org.mockito.Mockito;

public class HelloMain {

	public static void main(String[] args) {
		User user = Mockito.mock(User.class);
		System.out.println(String.format("userName:%s, age:%d", user.getUsername(), user.getAge()));
	}
	
	static class User{
		private String username;
		private Integer age;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "User [username=" + username + ", age=" + age + "]";
		}
	}
}
