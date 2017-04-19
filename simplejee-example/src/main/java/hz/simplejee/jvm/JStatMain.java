package hz.simplejee.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Author 辉辉大侠
 * @Date 2017-03-13 16:07
 * @Motto 一生伏首拜阳明
 */
public class JStatMain {
    private final static int _1MB = 1024 * 1024;
    private final static int MAX_LIST_SIZE = 30;
    private byte[] data;

    public JStatMain() {
        /**
         * 1M数据
         */
        data = new byte[_1MB];
    }

    public static void main(String[] args) throws InterruptedException {
        List<JStatMain> list = new ArrayList<JStatMain>();
        Random random = new Random();
        /**
         * 循环30次操作
         */
        for (int i = 0; i < 30; i++) {
            while (true) {
                int randomInt = Math.abs(random.nextInt()) % 10 + 1;
                System.out.println("增加" + randomInt + "MB数据.");
                while (randomInt > 0) {
                    list.add(new JStatMain());
                    if (list.size() >= MAX_LIST_SIZE) {
                        break;
                    }
                    randomInt--;
                }
                if (list.size() >= MAX_LIST_SIZE) {
                    break;
                }
                /**
                 * 每扩容一次数据,线程sleep 3秒
                 */
                TimeUnit.SECONDS.sleep(3);
            }
            System.out.println("清空" + list.size() + "MB数据.");
            list.clear();
        }
    }
}
