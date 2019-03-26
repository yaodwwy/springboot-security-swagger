package cn.adbyte.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Adam.Yao
 * @date: 2019/3/26 15:30
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Adam.Yao", "http://www.adbyte.cn", "yaodwwy@gmail.com");
        return new ApiInfoBuilder()
                .title("API接口")
                .description("API接口描述")
                .contact(contact)
                .version("1.1.0")
                .build();
    }
}
