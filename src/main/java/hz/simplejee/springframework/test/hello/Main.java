package hz.simplejee.springframework.test.hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wanghui on 29/11/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hz/simplejee/springframework/test/hello/applicationContext.xml"})
public class Main {

    @Autowired
    private HelloService helloService;

    @Test
    public void test() {
        Assert.assertEquals("Hello Mokala", this.helloService.sayHello("Mokala"));
    }
}
