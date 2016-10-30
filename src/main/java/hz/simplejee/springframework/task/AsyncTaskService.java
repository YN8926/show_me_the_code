package hz.simplejee.springframework.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
@Service
public class AsyncTaskService {

    @Async//通过该注解表明该方法是一个异步方法,若注解在class上,则此类的所有方法均是异步方法
    public void execute() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Task execute!!!");
    }
}
