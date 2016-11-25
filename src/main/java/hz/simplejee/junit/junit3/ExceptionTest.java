package hz.simplejee.junit.junit3;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by wanghui on 25/11/2016.
 */
public class ExceptionTest extends TestCase{
    public static void testException(){
        try {
            Long.parseLong("123");
            fail("throw");
        } catch (NumberFormatException e) {
            Assert.assertTrue(true);
        }
    }
}
