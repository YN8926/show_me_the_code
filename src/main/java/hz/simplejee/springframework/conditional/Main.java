package hz.simplejee.springframework.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
@Configuration
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(Arrays.toString(cxt.getBeanDefinitionNames()));
        ListFileService service = cxt.getBean(ListFileService.class);
        System.out.println(service.list());
    }


    @Bean
    @Conditional(WindowsCondition.class)
    public ListFileService windowsService() {
        return new ListFileService() {
            @Override
            public String list() {
                return "dir";
            }
        };
    }

    @Bean
    @Conditional(OSXCondition.class)
    public ListFileService linuxService() {
        return new ListFileService() {
            @Override
            public String list() {
                return "ls";
            }
        };
    }
}
