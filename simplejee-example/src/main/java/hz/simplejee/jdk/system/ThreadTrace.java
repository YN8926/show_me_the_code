package hz.simplejee.jdk.system;

public class ThreadTrace {

	public static void main(String[] args) {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		StringBuilder sb = new StringBuilder();
		for(StackTraceElement s:stackTrace){
		
		}
	}
}
