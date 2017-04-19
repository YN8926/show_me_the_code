package hz.simplejee.unittest.mockito.official;

import org.junit.Test;
import scala.xml.Null;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-19 9:52 AM
 * @Motto 一生伏首拜阳明
 */
public class HelloTest {
    @Test
    public void testList() {
        List list = mock(List.class);
        list.add("one");
        list.clear();

        verify(list).add("one");
        verify(list).clear();
    }

    @Test(expected = NullPointerException.class)
    public void testLinkedList() {
        LinkedList list = mock(LinkedList.class);
        when(list.get(0)).thenReturn("one");
        when(list.get(1)).thenThrow(new NullPointerException());

        assertThat(list.get(0)).isEqualTo("one");
        list.get(1);
    }
}
