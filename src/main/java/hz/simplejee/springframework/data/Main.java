package hz.simplejee.springframework.data;

import hz.simplejee.springframework.data.entity.User;
import hz.simplejee.springframework.data.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 辉辉大侠 on 25/10/2016.
 */
public class Main {
    private ApplicationContext appCxt;
    private UserRepository r;

    @Before
    public void setUp() {
        appCxt = new ClassPathXmlApplicationContext(Main.class.getResource("applicationContext-data.xml").toExternalForm());
        r = appCxt.getBean(UserRepository.class);
    }

    @Test
    public void testAdd() {
        User u = new User("Mokala", 36);
        r.save(u);
    }

    @Test
    public void testFindByName() {
        List<User> uList = r.findUserByName("Mokala");
        System.out.println(uList);
    }
}
