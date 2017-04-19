package hz.simplejee.unittest.assertj;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 11:34 AM
 * @Motto 一生伏首拜阳明
 */
public class NumberTest {
    @Test
    public void test1() {
        assertThat(2).isGreaterThan(1).isLessThan(4);
    }

    @Test
    public void testZero() {
        assertThat(0).isZero();
    }

    @Test
    public void test2() {
        assertThat(1).isPositive().isNotNegative();
    }
}
