package hz.simplejee.junit.junit4;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wanghui on 26/11/2016.
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {
    private int a;
    private int b;
    private int c;

    @Test
    public void testMax() {
        Assert.assertEquals(c, Math.max(a, b));
    }

    public ParameterizedTest(int[] t) {
        this.a = t[0];
        this.b = t[1];
        this.c = t[2];
    }

    @Parameterized.Parameters
    public static List<int[]> getParams() {
        return Arrays.asList(new int[][]{{1, 2, 2}, {1, 1, 1}, {4, -1, 4}, {9, 1, 9}});
    }
}
