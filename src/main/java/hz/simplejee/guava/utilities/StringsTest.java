package hz.simplejee.guava.utilities;

import org.junit.Test;

import com.google.common.base.Strings;

import junit.framework.Assert;

/**
 * Created by wanghui on 6/16/16.
 */
public class StringsTest {
    @Test
    public void testNullOrEmpty(){
        String str = null;
        Assert.assertTrue(Strings.isNullOrEmpty(""));
        Assert.assertTrue(Strings.isNullOrEmpty(str));
    }

    @Test
    public void testCommonPrefix(){
        String a = "io.github.fishcats.guava.hello";
        String b = "io.github.fishcats.spring.hello";
        Assert.assertEquals("io.github.fishcats.", Strings.commonPrefix(a, b));

        Assert.assertEquals(".hello", Strings.commonSuffix(a, b));
    }

    @Test
    public void testPad(){
        System.out.println(Strings.padEnd("@@",10, '#'));
    }
}
