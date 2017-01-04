package hz.simplejee.unittest.junitinaction.ch1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanghui on 28/12/2016.
 */
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.add(3, 7),0);
    }
    @Test
    public void testAdd_Zero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(-5, 5), 0);
    }
}
