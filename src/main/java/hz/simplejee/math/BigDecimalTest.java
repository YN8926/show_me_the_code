package hz.simplejee.math;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by wanghui on 08/12/2016.
 */
public class BigDecimalTest {
    @Test
    public void test_scale() {
        BigDecimal d = new BigDecimal(295.00000000d);
        d = d.add(new BigDecimal(35));
        BigDecimal dd = d.divide(new BigDecimal(2), 4, BigDecimal.ROUND_HALF_UP);
        System.out.println(dd);
    }
}
