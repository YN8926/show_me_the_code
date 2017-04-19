package hz.simplejee.unittest.assertj;

import com.google.common.collect.Lists;
import org.assertj.core.data.Index;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 11:41 AM
 * @Motto 一生伏首拜阳明
 */
public class ListTest {
    @Test
    public void testEmpty() {
        assertThat(Lists.newArrayList()).isEmpty();
    }

    @Test
    public void test1() {
        assertThat(Lists.newArrayList(1, 2, 3, 4)).startsWith(1).endsWith(4);
    }

    @Test
    public void testIndex() {
        assertThat(Lists.newArrayList(1, 2, 3, 4))
                .contains(1, atIndex(0))
                .contains(2, atIndex(1))
                .isSorted();
    }

    @Test
    public void testSubset(){
       assertThat(Lists.newArrayList(1,2,3)).isSubsetOf(1,2,3,4,5,6);
    }
}
