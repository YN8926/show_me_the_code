package hz.simplejee.guava.utilities;

import org.junit.Test;

import com.google.common.base.Preconditions;

public class PreconditionsTest {

    @Test
    public void test1(){
        Preconditions.checkNotNull(null, "参数不能为空");
    }

    @Test
    public void testCheckArgument(){
        Preconditions.checkArgument(false, "测试");
    }

    @Test
    public void testCheckState(){
        Preconditions.checkState(false, "dddd");
    }
}
