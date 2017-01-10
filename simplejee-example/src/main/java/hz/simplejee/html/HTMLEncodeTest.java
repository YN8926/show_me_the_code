package hz.simplejee.html;

import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.Test;

/**
 * Created by wanghui on 10/01/2017.
 */
public class HTMLEncodeTest {
    @Test
    public void testEscape(){
        String text = "我来\n\r自地球.";
        System.out.println(text);
        System.out.println(StringEscapeUtils.unescapeJava(text));
    }
}
