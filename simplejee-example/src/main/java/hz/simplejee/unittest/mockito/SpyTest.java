package hz.simplejee.unittest.mockito;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * spy 的意思是你可以修改某个真实对象的某些方法的行为特征，而不改变他的基本行为特征，这种策略的使用跟 AOP 有点类似
 * Created by wanghui on 29/11/2016.
 */
public class SpyTest {

    @Test
    public void test_1(){
        List<String> list = new ArrayList<>();
        List<String> spy = spy(list);
        when(spy.size()).thenReturn(999);
        Assert.assertEquals(999,spy.size());
    }


}
