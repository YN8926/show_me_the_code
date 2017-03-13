package hz.simplejee.jvm;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author 辉辉大侠
 * @Date 2017-03-12 08:48
 * @Motto 一生伏首拜阳明
 */
public class OOMObject {
    private byte[] objects;

    public OOMObject() {
        /**
         * 1M数据
         */
        objects = new byte[1024 * 1024];
    }

    public static void main(String[] args) throws InterruptedException {
        List<OOMObject> list = new LinkedList<>();
        while (true) {
            list.add(new OOMObject());
            System.out.println("object size:" + list.size());
            TimeUnit.SECONDS.sleep(4);
            if (list.size() > Integer.MAX_VALUE) {
                break;
            }
        }
    }
}
