package hz.simplejee.unittest.assertj;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 11:19 AM
 * @Motto 一生伏首拜阳明
 */
public class ChainAssertTest {

    @Test
    public void testChainAssert() {
        assertThat("abc").isEqualTo("abc").hasSize(3).contains("d");
    }
}
