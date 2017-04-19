package hz.simplejee.unittest.assertj;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 2:08 PM
 * @Motto 一生伏首拜阳明
 */
public class ClassTest {
    @Test
    public void test1() {
        assertThat(ClassTest.class).isNotAnnotation()
                .isNotInterface();
    }

    @Test
    public void test2() {
        assertThat("abc").isInstanceOf(String.class);
    }
}
