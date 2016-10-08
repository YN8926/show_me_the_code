package hz.simplejee.unit.junit;

import org.junit.Test;

/**
 * Created by 辉辉大侠 on 8/1/16.
 */
public class ExceptionTest {
    @Test(expected=RuntimeException.class)
    public void testException() {
        throw new RuntimeException("测试异常");
    }
}
