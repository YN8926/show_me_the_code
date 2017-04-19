package hz.simplejee.unittest.assertj;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 11:23 AM
 * @Motto 一生伏首拜阳明
 */
public class NullTest {

    @Test
    public void testNull() {
        Object object = null;
        assertThat(object).isNull();
    }
}
