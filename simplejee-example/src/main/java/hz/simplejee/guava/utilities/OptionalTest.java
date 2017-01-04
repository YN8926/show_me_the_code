package hz.simplejee.guava.utilities;

import org.junit.Test;

import com.google.common.base.Optional;

public class OptionalTest {

    @Test
    public void test1(){
        Optional<Object> t = Optional.of(null);
        t.get();
    }

    @Test
    public void test2() {
        Optional<Object> tt = Optional.absent();
        Object obj = tt.get();
        System.out.println(obj);
    }
}
