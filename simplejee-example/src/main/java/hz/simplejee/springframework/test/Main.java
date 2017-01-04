package hz.simplejee.springframework.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
@ActiveProfiles("dev")
@Configuration
public class Main {

    @Autowired
    private MyTestService myTestService;

    @Test
    public void test() {
        Assert.assertEquals("devhello", myTestService.sayHello("hello"));
    }
    @Bean
    @Profile("dev")
    public MyTestService devService() {
        return new MyTestService("dev");
    }

    @Bean
    @Profile("prd")
    public MyTestService prdService() {
        return new MyTestService("prd");
    }
}
