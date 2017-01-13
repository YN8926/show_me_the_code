package hz.simplejee.springframework.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wanghui on 13/01/2017.
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService function() {
        return new FunctionService();
    }

    @Bean
    public MyService service(FunctionService functionService) {
        return new MyService(functionService);
    }
}
