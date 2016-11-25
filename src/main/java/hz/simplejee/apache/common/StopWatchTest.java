package hz.simplejee.apache.common;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by 辉辉大侠 on 23/11/2016.
 */
public class StopWatchTest {

    @Test
    public void testHello() throws InterruptedException {
        StopWatch sw = new StopWatch();
        sw.start();
        TimeUnit.SECONDS.sleep(1);
        sw.split();
        System.out.println(sw.toSplitString());
        TimeUnit.SECONDS.sleep(2);
        sw.split();
        System.out.println(sw.toSplitString());
        TimeUnit.SECONDS.sleep(1);
        sw.stop();
        System.out.println(sw.toSplitString());
    }

    @Test
    public void testSpringStopWatch() throws InterruptedException {
        org.springframework.util.StopWatch sw = new org.springframework.util.StopWatch();
        sw.start("1");
        TimeUnit.SECONDS.sleep(1);
        sw.stop();
        sw.start("2");
        TimeUnit.SECONDS.sleep(2);
        sw.stop();
        sw.start();
        TimeUnit.SECONDS.sleep(1);
        sw.stop();
        System.out.println(sw.prettyPrint());
    }
}
