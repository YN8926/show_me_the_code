package hz.simplejee.unittest.mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wanghui on 02/12/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpyAnnotationTest.class)
@Configuration
public class SpyAnnotationTest {

    @Spy
    @Autowired
    private Hello hello;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() {
        Mockito.when(hello.hello1()).thenReturn("Hello1");
        Assert.assertEquals("Hello1", hello.hello1());
        Assert.assertEquals("hello2", hello.hello2());

        Mockito.reset(hello);
        Assert.assertEquals("hello1", hello.hello1());
    }

    @Bean
    public Hello helloBean() {
        return new Hello();
    }

    static class Hello {
        public String hello1() {
            return "hello1";
        }

        public String hello2() {
            return "hello2";
        }
    }
}
