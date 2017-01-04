package hz.simplejee.springframework.mvc.hello.controller.support;

public class Result {

    private boolean success;
    private String message;
    private Object data;

    public Result() {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Result wrapErrorResult(String message) {
        return null;
    }

    public static Result wrapSuccessResult(String message) {
        return null;
    }

    public static Result wrapSuccessResult(String message, Object data) {
        return null;
    }
}
