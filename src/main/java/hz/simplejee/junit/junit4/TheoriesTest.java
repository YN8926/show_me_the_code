package hz.simplejee.junit.junit4;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Created by wanghui on 26/11/2016.
 */
@RunWith(Theories.class)
public class TheoriesTest {
    @DataPoints
    public static int[] as = new int[]{1, 0, 9, -2};
    @DataPoints
    public static int[] bValue1 = new int[]{2, -1, 8, -4};
    @DataPoints
    public static int[] cs = new int[]{2, 0, 9, -2};

    @Theory
    public void testMax(int a, int b, int c) {
        Assert.assertEquals(c, Math.max(a, b));
    }
}
