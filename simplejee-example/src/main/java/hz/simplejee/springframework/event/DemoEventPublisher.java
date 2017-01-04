package hz.simplejee.springframework.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Component
public class DemoEventPublisher {
    @Autowired
    ApplicationContext cxt;
    public void publish(String msg) {
        cxt.publishEvent(new DemoEvent(this, msg));
    }
}
