package hz.simplejee.unittest.assertj;

import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 11:26 AM
 * @Motto 一生伏首拜阳明
 */
public class StringTest {
    @Test
    public void testNull() {
        String abc = null;
        assertThat(abc).isNullOrEmpty();
    }

    @Test
    public void testEmpty(){
        assertThat("").isEmpty();
    }

    @Test
    public void testEquals() {
       assertThat("Langdo").isEqualToIgnoringCase("langdo");
    }

    @Test
    public void testStartwith() {
        assertThat("abcdef").as("start....").startsWith("ac").as("end....").endsWith("d");
    }

    @Test
    public void testContain() {
       assertThat("abc").contains("a").containsOnlyOnce("a");
       assertThat("abc").doesNotContain("f");
    }

    @Test
    public void testMatch() {
        assertThat("abc-wanghui").matches("\\w+-\\w+");
    }
}
