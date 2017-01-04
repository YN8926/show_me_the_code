package hz.simplejee.unittest.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

/**
 * 只要在被测试类上标记@InjectMocks，Mockito就会自动将标记@Mock、@Spy等注解的属性值注入到被测试类中
 * 使用Spring自动装配时可Mock依赖,但是如果被测试类是代理类，那么注入会失效
 * Created by wanghui on 01/12/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class InjectMocksTest {

    @InjectMocks
    private UserService userService;
    @Mock
    private UserDao userDao;

    @Test
    public void test() {
        when(userDao.say(anyString())).thenReturn("Hello Mokala");

        Assert.assertEquals("Hello Mokala", userService.say("abc"));
    }

    public static class UserService {
        private UserDao userDao;

        public String say(String message) {
            return this.userDao.say("abc");
        }
    }

    public interface UserDao {
        String say(String message);
    }
}
