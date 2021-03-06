package com.lhm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger-ui的配置
 * api页面 /swagger-ui.html 或者/swagger/index.html ()
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig  {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lhm.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("心愿屋测试接口")
                .termsOfServiceUrl("https://github.com/LHMSDYWED")
                .description("实现每一个小心愿")
                .contact(new Contact("心愿屋","https://github.com/LHMSDYWED","1224301484@qq.com"))
                .version("1.0")
                .build();
    }

}
