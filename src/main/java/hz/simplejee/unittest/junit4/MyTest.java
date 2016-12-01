package hz.simplejee.unittest.junit4;

import org.junit.*;

/**
 * Created by wanghui on 26/11/2016.
 */
public class MyTest {
    @BeforeClass
    public static void setUpOnce() {
        System.out.println("@BeforeClass");
    }

    @Before
    public void setUp() {
        System.out.println("@Before");
    }

    @AfterClass
    public static void tearDownOnce() {
        System.out.println("@AfterClass");
    }

    @After
    public void tearDown() {
        System.out.println("@After");
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        throw new RuntimeException();
    }
    @Test
    public void testFun1(){
        System.out.println("fun1");
    }
    @Test
    public void testFun2(){
        System.out.println("fun2");
    }
}
