package hz.simplejee.beancopy.dozer;

import org.dozer.DozerBeanMapper;

/**
 * Created by 辉辉大侠 on 08/10/2016.
 */
public class HelloMain {

    public static void main(String[] args) {
        User u = new User(123L, "Mokala");
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(HelloMain.class.getResourceAsStream("dozer-hello.xml"));
        Customer c = mapper.map(u, Customer.class);
        System.out.println(c);
    }
}
