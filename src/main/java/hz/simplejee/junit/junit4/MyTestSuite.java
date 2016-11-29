package hz.simplejee.junit.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by wanghui on 26/11/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MyTest.class, MyTest2.class})
public class MyTestSuite {
}
