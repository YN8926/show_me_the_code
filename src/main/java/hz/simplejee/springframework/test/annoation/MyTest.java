package hz.simplejee.springframework.test.annoation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wanghui on 29/11/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyTest.class)
@Configuration
@ComponentScan(basePackageClasses = HelloService.class)
public class MyTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void test() {
        Assert.assertEquals("Hello::Mokala", this.helloService.sayHello("Mokala"));
    }
}
