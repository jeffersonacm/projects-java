package br.com.codenation.Aplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                    .apis(RequestHandlerSelectors.basePackage("br.com.codenation.Aplication.controller"))
                    .paths(PathSelectors.regex("/.*"))
                    .build().apiInfo(apiInfo());
    }

    public ApiInfo apiInfo() {
        return new ApiInfo(
                "aplication.api",
                "codenation", "1.0.0-RELEASE",
                "Terms of service", new Contact("Jefferson Monteiro",
                                                                "http://linkedin.com/jeffersonacm",
                                                                "jeffersonacm@hotmail.com"),
                "licesce api", "uri licesce", Collections.emptyList());
    }
}

