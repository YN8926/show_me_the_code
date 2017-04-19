package hz.simplejee.unittest.assertj;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

    @Test
    public void testHelloworld() {
        assertThat("abc").as("断言测试").isEqualTo("abc   ");
    }

    @Test
    public void testHelloworld2() {
        assertThat("abcdef").as("测试断言-1").isEqualTo("abcdef")
                .as("测试断言-2").contains("abc");
    }

    @Test
    public void testHelloworld3() {
        String str = null;
        assertThat(str).as("为空判断").isNotNull();
    }

    @Test
    public void testHellworld4() {
        ArrayList<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        assertThat(list).isIn(Lists.newArrayList(1,2,4), Lists.newArrayList(1,2,3,4));
    }
}
