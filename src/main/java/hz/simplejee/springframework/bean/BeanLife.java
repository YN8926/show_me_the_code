package hz.simplejee.springframework.bean;

import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
public class BeanLife {

    @Bean(initMethod = "before", destroyMethod = "after")
    public static BeanLife myBean() {
        return new BeanLife();
    }


    @PostConstruct
    public void before() {

    }

    @PreDestroy
    public void after() {
    }
}
