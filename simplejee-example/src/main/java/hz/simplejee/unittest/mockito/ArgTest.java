package hz.simplejee.unittest.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentMatcher;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by wanghui on 29/11/2016.
 */
public class ArgTest {
    /**
     * 匹配任意参数
     */
    @Test
    public void test_1() {
        List<Integer> l = mock(List.class);
        when(l.get(anyInt())).thenReturn(1);
        Assert.assertEquals(Integer.valueOf(1), l.get(1));
        Assert.assertEquals(Integer.valueOf(1), l.get(2));
    }

    /**
     * 匹配任意参数
     */
    @Test
    public void test_2() {
        List<Integer> l = mock(List.class);
        when(l.contains(argThat(new ArgumentMatcher<Integer>() {
            @Override
            public boolean matches(Object argument) {
                return true;
            }
        }))).thenReturn(true);
        Assert.assertTrue(l.contains(123));
    }
}
