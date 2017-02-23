package hz.simplejee.canal;

import ch.qos.logback.core.joran.conditional.ThenAction;
import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.common.utils.AddressUtils;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import javafx.scene.Camera;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wanghui on 22/02/2017.
 */
public class ConcurrentTest {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService p = Executors.newCachedThreadPool();
        int THREAD_SIZE = 10;
        final CountDownLatch latch = new CountDownLatch(THREAD_SIZE);
        for(int i =0; i < THREAD_SIZE; i++) {
            p.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.await();
                        System.out.println("conn.....");
                        CanalConnector conn = CanalConnectors.newSingleConnector(new InetSocketAddress(AddressUtils.getHostIp(), 11111),
                                "legend", "root", "");

                        int BATCH_SIEZ = 100;
                        conn.connect();
                        conn.subscribe(".*\\..*");
                        int totalEntryCount = 120;
                        int emptyCount = 0;
                        while (emptyCount < totalEntryCount) {
                            Message message = conn.getWithoutAck(BATCH_SIEZ);
                            long batchId = message.getId();
                            int size = message.getEntries().size();
                            if (batchId == -1 && size == 0) {
                                System.out.println("Empty Message!");
                                TimeUnit.SECONDS.sleep(5);
                                emptyCount++;
                            } else {
                                printEntry(message.getEntries());
                                emptyCount = 0;
                                conn.ack(batchId);
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            latch.countDown();
        }

    }

    private static void printEntry(List<CanalEntry.Entry> entrys) {
        for (CanalEntry.Entry entry : entrys) {
            if (entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONBEGIN || entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONEND) {
                continue;
            }

            CanalEntry.RowChange rowChage = null;
            try {
                rowChage = CanalEntry.RowChange.parseFrom(entry.getStoreValue());
            } catch (Exception e) {
                throw new RuntimeException("ERROR ## parser of eromanga-event has an error , data:" + entry.toString(),
                        e);
            }

            CanalEntry.EventType eventType = rowChage.getEventType();
            System.out.println(String.format("[%s]================> binlog[%s:%s] , name[%s,%s] , eventType : %s", Thread.currentThread().getName(),
                    entry.getHeader().getLogfileName(), entry.getHeader().getLogfileOffset(),
                    entry.getHeader().getSchemaName(), entry.getHeader().getTableName(),
                    eventType));

            for (CanalEntry.RowData rowData : rowChage.getRowDatasList()) {
                if (eventType == CanalEntry.EventType.DELETE) {
                    printColumn(rowData.getBeforeColumnsList());
                } else if (eventType == CanalEntry.EventType.INSERT) {
                    printColumn(rowData.getAfterColumnsList());
                } else {
                    System.out.println("-------> before");
                    printColumn(rowData.getBeforeColumnsList());
                    System.out.println("-------> after");
                    printColumn(rowData.getAfterColumnsList());
                }
            }
        }
    }

    private static void printColumn(List<CanalEntry.Column> columns) {
        for (CanalEntry.Column column : columns) {
            System.out.println(column.getName() + " : " + column.getValue() + "    update=" + column.getUpdated());
        }
    }
}
