package hz.simplejee.swagger.hello.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by 辉辉大侠 on 05/11/2016.
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan("hz.simplejee.swagger.hello.controller")
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(_apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("hz.simplejee.swagger.hello.controller"))
                .paths(PathSelectors.any())
                .build();


    }

    private ApiInfo _apiInfo() {
        return new ApiInfoBuilder()
                .title("Restful API调试控制台")
                .termsOfServiceUrl("http://www.qixiuyun.com/")
                .version("1.0.0-SNAPSHOT")
                .build();
    }
}