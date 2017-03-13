package hz.simplejee.jvm.jps;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author 辉辉大侠
 * @Date 2017-03-11 09:43
 * @Motto 一生伏首拜阳明
 */
public class JPSMain {
    public static void main(String[] args) throws InterruptedException {
        int i = 100;
        while (i > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println(sdf.format(new Date()));
            TimeUnit.SECONDS.sleep(10);
        }
    }
}
