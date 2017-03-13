package hz.simplejee.jvm.jinfo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author 辉辉大侠
 * @Date 2017-03-11 10:23
 * @Motto 一生伏首拜阳明
 */
public class JinfoMain {
    public static void main(String[] args) throws InterruptedException {
        int k = 100;
        while (k > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println(sdf.format(new Date()));
            TimeUnit.SECONDS.sleep(10);
            k--;
        }
    }
}
