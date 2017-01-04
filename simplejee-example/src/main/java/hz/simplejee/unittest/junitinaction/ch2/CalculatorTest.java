package hz.simplejee.unittest.junitinaction.ch2;

import hz.simplejee.unittest.junitinaction.ch1.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameterized.Parameters
    public static Collection getTestParameters() {
        return Arrays.asList(new double[][]{
                {2, 1, 1},
                {3, 2, 1},
                {4, 3, 1}
        });
    }

    public CalculatorTest(double [] data) {
        this.expected = data[0];
        this.valueOne = data[1];
        this.valueTwo = data[2];
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(expected, new Calculator().add(valueOne, valueTwo), 0);
    }
}
