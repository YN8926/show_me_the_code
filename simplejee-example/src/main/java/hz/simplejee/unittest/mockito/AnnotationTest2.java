package hz.simplejee.unittest.mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by wanghui on 29/11/2016.
 */
public class AnnotationTest2 {
    @Mock
    private List<Integer> list;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_1() {
        when(list.size()).thenReturn(2);
        Assert.assertTrue(2 == list.size());
    }
}
