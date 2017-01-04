package hz.simplejee.springframework.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
public class DemoEvent extends ApplicationEvent {
    private String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
