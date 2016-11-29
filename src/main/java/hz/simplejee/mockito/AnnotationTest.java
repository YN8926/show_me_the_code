package hz.simplejee.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by wanghui on 29/11/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {
    @Mock
    private List<Integer> list;
    @Test
    public void test_1(){
        when(list.get(0)).thenReturn(999);
        Assert.assertEquals(Integer.valueOf(999), list.get(0));
    }
}
