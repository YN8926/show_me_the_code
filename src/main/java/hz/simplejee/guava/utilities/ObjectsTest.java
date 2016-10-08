package hz.simplejee.guava.utilities;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Objects;

public class ObjectsTest {

    /**
     * 判断二个对象是否相等
     */
    @Test
    public void testEqual(){
        String a = "123";
        String b = new String("123");
        Assert.assertFalse(Objects.equal(a, b));
    }

}
