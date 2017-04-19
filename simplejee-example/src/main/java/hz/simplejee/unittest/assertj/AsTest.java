package hz.simplejee.unittest.assertj;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 11:13 AM
 * @Motto 一生伏首拜阳明
 */
public class AsTest {
    @Test
    public void testAs() {
        assertThat("abc").as("检验abc").isEqualTo("abcd");
    }

@Test
public void testAsPlaceholder() {
    assertThat("abc").as("测试占位符：%s", "占位符啦啦啦").hasSize(1);
}
}
