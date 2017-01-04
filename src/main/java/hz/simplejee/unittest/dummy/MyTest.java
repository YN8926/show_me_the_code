package hz.simplejee.unittest.dummy;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by wanghui on 28/12/2016.
 */
public class MyTest {

    @Test
    public void dummy_test() {
        List<Foo> fooList = Lists.newArrayList();
        fooList.add(new FooDummy());
        fooList.add(new FooDummy());
        Assert.assertEquals(2, fooList.size());
    }

    class FooDummy implements Foo {

        @Override
        public String bar() {
            return "abc";
        }
    }
}
