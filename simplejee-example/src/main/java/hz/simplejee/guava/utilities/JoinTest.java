package hz.simplejee.guava.utilities;

import java.util.HashMap;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

/**
 * Created by wanghui on 6/16/16.
 */
public class JoinTest {
    @Test
    public void testJoin(){
        String strings = Joiner.on(" ").join(new String[]{"hello", "world", "."});
        System.out.println(strings);
    }

    @Test
    public void testMapJoin(){
        HashMap<String, String> map = Maps.newHashMap();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");

        String strings = Joiner.on(",")
                .withKeyValueSeparator("=")
                .join(map);
        System.out.println(strings);
    }
}
