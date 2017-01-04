package hz.simplejee.temp;

public class T {

	private static final int LIMIT = 2000;
	
	public static void main(String[] args) {
		int count = 2001;
		 for (int offset = 0; offset < count; offset += LIMIT) {
			 System.out.println(String.format("offset:%d,limit:%d",offset, LIMIT));
		 }
	}
}
