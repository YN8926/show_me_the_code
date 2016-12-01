package hz.simplejee.unittest.junit4;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by 辉辉大侠 on 8/1/16.
 */
public class TimeoutTest {

    @Ignore
    @Test(timeout = 200)
    public void testTimeout() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
