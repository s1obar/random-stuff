package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiCustomers() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                .paths(regex("/api/v1/.*"))
                .build()
                .groupName("aws")
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Random Stuff")
                .version("1.0")
                .description("Testing aws with localstack")
                .build();
    }
}