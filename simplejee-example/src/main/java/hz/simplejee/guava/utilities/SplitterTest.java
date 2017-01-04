package hz.simplejee.guava.utilities;

import java.util.Map;

import org.junit.Test;

import com.google.common.base.Splitter;

/**
 * Created by wanghui on 6/16/16.
 */
public class SplitterTest {
    /**
     * 简单字符串拆分
     */
    @Test
    public void testSpliter(){
        String str = "a=b   ;  ; c=d;e=f ";
        Iterable<String> strings = Splitter.onPattern(";")
                .trimResults()
                .omitEmptyStrings()//忽略空字符串
                .split(str);
        System.out.println(strings);
    }

    /**
     * 做二次拆分
     */
    @Test
    public void testSplitter2() {
        String str = "a=b; c=d; e=f   ;;";
        Map<String, String> o = Splitter.onPattern(";")
                .trimResults()
                .omitEmptyStrings()
                .withKeyValueSeparator("=")
                .split(str);
        System.out.println(o);
    }
}
