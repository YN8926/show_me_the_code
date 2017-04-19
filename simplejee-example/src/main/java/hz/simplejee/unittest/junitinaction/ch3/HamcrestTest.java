package hz.simplejee.unittest.junitinaction.ch3;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-17 2:02 PM
 * @Motto 一生伏首拜阳明
 */
public class HamcrestTest {

    @Test
    public void testHelloWorld() {
        List<String> list = Lists.newArrayList("one", "two", "three");

        assertThat(list, hasItem(anyOf(equalTo("one"))));
    }
}
