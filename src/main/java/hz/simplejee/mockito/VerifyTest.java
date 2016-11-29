package hz.simplejee.mockito;

import io.swagger.models.auth.In;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by wanghui on 29/11/2016.
 */
public class VerifyTest {
    /**
     * 验证行为是否发生过
     */
    @Test
    public void test_1() {
        List<String> list = mock(List.class);
        list.clear();
        //断言clear方法是否被执行过
        verify(list).clear();
    }

    /**
     * 验证调用次数
     */
    @Test
    public void test_2() {
        List<Integer> l = mock(List.class);
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(3);
        //此方法被执行了一次
        verify(l, times(1)).add(1);
        //此方法被执行了二次
        verify(l, times(2)).add(2);
        //此方法被执行了三次
        verify(l, times(3)).add(3);
        //此方法没有被执行过
        verify(l, never()).add(4);
        //至少执行了一次
        verify(l, atLeastOnce()).add(1);
        //至少执行二次
        verify(l, atLeast(2)).add(2);
        //最多执行二次
        verify(l, atMost(2)).add(2);
    }

    /**
     * 验证执行顺序
     */
    @Test
    public void test_3() {
        List<Integer> l1 = mock(List.class);
        List<Integer> l2 = mock(List.class);
        l1.add(1);
        l2.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(2);
        InOrder inOrder = inOrder(l1, l2);
        inOrder.verify(l1).add(1);
        inOrder.verify(l2).add(1);
        inOrder.verify(l1).add(2);
        inOrder.verify(l1).add(3);
        inOrder.verify(l2).add(2);
    }

}
