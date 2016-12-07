package hz.simplejee.regex;

import org.junit.Test;

/**
 * Created by wanghui on 02/12/2016.
 */
public class BraceTest {
    @Test
    public void test() {
        String abc = "你好呀。【a中文】9999【a中文】";
        abc = abc.replaceAll("【", "[").replaceAll("】", "]");
        System.out.println(abc);
    }
}
