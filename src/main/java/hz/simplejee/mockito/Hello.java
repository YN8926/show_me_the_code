package hz.simplejee.mockito;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wanghui on 29/11/2016.
 */
public class Hello {
    @Test
    public void test_1(){
        Iterator<String> ltr = mock(Iterator.class);
        when(ltr.next()).thenReturn("Hello").thenReturn("World");
        Assert.assertArrayEquals(new String[]{"Hello", "World"}, new String[]{ltr.next(), ltr.next()});
        verify(ltr, times(2)).next();
    }

    @Test
    public void test_2(){
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("abc");
        Assert.assertEquals("abc", list.get(0));
        verify(list, times(1)).get(0);
    }
}
