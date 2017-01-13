package hz.simplejee.springframework.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by wanghui on 14/01/2017.
 */
@Configuration
public class ProfileConfig {
    @Profile("dev")
    @Bean
    public DemoBean devBean() {
        return new DemoBean("开发环境");
    }

    @Profile("prod")
    @Bean
    public DemoBean prodBean() {
        return new DemoBean("生产环境");
    }
}
