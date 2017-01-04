package hz.simplejee.springframework.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = cxt.getBean(AsyncTaskService.class);
        for(int i = 0; i < 10; i++) {
            service.execute();
        }
        cxt.close();
    }
}
