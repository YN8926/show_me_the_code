package hz.simplejee.springframework.spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Configuration
@ComponentScan(basePackages = "hz.simplejee.springframework.spel")
@Component
@PropertySource("classpath:hz/simplejee/springframework/spel/test.properties")
public class SpELMain {

    /**
     * 注入普通字符串
     */
    @Value("普通字面值")
    private String commonValue;

    /**
     * 注入操作系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 注入表达式结果
     */
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    /**
     * 注入其他Bean的属性
     */
    @Value("#{myService.prop}")
    private String prop;

    /**
     * 注入文件资源
     */
    @Value("classpath:hz/simplejee/springframework/spel/test.properties")
    private Resource myFile;

    /**
     * 注入网址资源
     */
    @Value("http://www.baidu.com")
    private Resource myUrl;

    /**
     * 注入配置文件替换符
     */
    @Value("#{${name}}")
    private String name;

    @Autowired
    private Environment environment;
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(SpELMain.class);
        SpELMain bean = cxt.getBean(SpELMain.class);
        System.out.println(bean.getCommonValue());
        System.out.println("环境变量>>" + bean.getOsName());
        System.out.println("方法调用>>" + bean.getRandomNumber());
    }

    public String getCommonValue() {
        return commonValue;
    }

    public String getOsName() {
        return osName;
    }

    public double getRandomNumber() {
        return randomNumber;
    }
}
