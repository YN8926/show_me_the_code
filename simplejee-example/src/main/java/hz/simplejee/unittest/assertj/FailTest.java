package hz.simplejee.unittest.assertj;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 2:20 PM
 * @Motto 一生伏首拜阳明
 */
public class FailTest {
    @Test
    public void test1() {
        fail("异常信息喔.");
    }
}
