package hz.simplejee.springframework.mvc.hello.controller.support;

public class Result {

	private boolean success;
	private Object data;
	
	public Result(){
		this.success = true;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
