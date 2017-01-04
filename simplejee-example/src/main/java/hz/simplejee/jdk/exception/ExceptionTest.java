package hz.simplejee.jdk.exception;

/**
 * Created by 辉辉大侠 on 09/10/2016.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            testException();
        } catch (Exception e) {
            System.out.println(e.getClass().getCanonicalName());
        }
    }

    public static void testException() {
        throw new RuntimeException("测试");
    }
}
