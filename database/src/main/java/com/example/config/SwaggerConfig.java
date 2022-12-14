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
    public Docket apiMongoDb() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.mongo.controller"))
                .paths(regex("/api/v1/.*"))
                .build()
                .groupName("mongo v1")
                .apiInfo(apiMongoInfo());
    }

    @Bean
    public Docket apiMySqlDb() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.mysql.controller"))
                .paths(regex("/api/v1/.*"))
                .build()
                .groupName("mysql v1")
                .apiInfo(apiMySqlInfo());
    }

    @Bean
    public Docket apiPostgresDb() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.postgres.controller"))
                .paths(regex("/api/v1/.*"))
                .build()
                .groupName("postgres v1")
                .apiInfo(apiPostgresInfo());
    }

    private ApiInfo apiMongoInfo(){
        return new ApiInfoBuilder()
                .title("Mongodb Demo")
                .version("1.0")
                .description("Different CRUD services with MongoDB")
                .build();
    }

    private ApiInfo apiMySqlInfo(){
        return new ApiInfoBuilder()
                .title("MySql Demo")
                .version("1.0")
                .description("Different CRUD services with MySql")
                .build();
    }

    private ApiInfo apiPostgresInfo(){
        return new ApiInfoBuilder()
                .title("Postgres Demo")
                .version("1.0")
                .description("Different CRUD services with Postgres")
                .build();
    }
}