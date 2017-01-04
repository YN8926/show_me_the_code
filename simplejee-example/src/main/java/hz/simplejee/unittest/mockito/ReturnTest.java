package hz.simplejee.unittest.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.Iterator;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by wanghui on 29/11/2016.
 */
public class ReturnTest {
    /**
     * 返回结果
     */
    @Test
    public void test_1() {
        /**
         * 第一种写法
         */
        Iterator<String> ltr = mock(Iterator.class);
        when(ltr.next()).thenReturn("Hello").thenReturn("World");
        Assert.assertEquals("HelloWorld", ltr.next() + ltr.next());

        /**
         * 第二种写法
         */
        ltr = mock(Iterator.class);
        when(ltr.next()).thenReturn("abc", "def");
        Assert.assertEquals("abcdef", ltr.next() + ltr.next());
    }

    /**
     * 使用回调生成结果
     */
    @Test
    public void test_2() {
        List<String> list = mock(List.class);
        when(list.get(0)).thenAnswer(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock invocation) throws Throwable {
                return "abc" + invocation.getArguments()[0];
            }
        });
        Assert.assertEquals("abc0", list.get(0));
    }

    /**
     * 测试返回为空的情况
     */
    @Test
    public void test_3() {
        List<String> list = mock(List.class);
        doNothing().when(list).clear();
        list.clear();
        verify(list, times(1)).clear();
    }
}
