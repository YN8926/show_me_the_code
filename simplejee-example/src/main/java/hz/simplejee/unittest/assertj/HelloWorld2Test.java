package hz.simplejee.unittest.assertj;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 10:44 AM
 * @Motto 一生伏首拜阳明
 */
public class HelloWorld2Test {

    @Test
    public void testHello1() {
        assertThat("hello").as("HelloWorld").endsWith("llo");
    }

    @Test
    public void testAs1() {
        assertThat("abc").as("这是描述信息").isEqualTo("abcd");
    }

    @Test
    public void testAs2() {
        assertThat("abc").as("错误描述信息:%s", "这是占位符").hasSize(1);
    }
}
