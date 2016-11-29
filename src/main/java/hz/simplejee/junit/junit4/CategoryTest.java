package hz.simplejee.junit.junit4;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by wanghui on 26/11/2016.
 */
public class CategoryTest {

    @Test
    @Category(MyCategory.class)
    public void testFun1() {
        System.out.println("fun1");
    }

    @Test
    public void testFun2() {
        System.out.println("fun2");
    }
}

