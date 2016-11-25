package hz.simplejee.junit.junit3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by wanghui on 25/11/2016.
 */
public class MyTestCase extends TestCase {
    public static Test suite(){
        TestSuite t = new TestSuite();
        t.addTestSuite(Test1.class);
        t.addTestSuite(Test2.class);
        return t;
    }
}
