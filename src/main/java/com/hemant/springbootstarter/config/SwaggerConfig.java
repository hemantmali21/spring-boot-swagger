package com.hemant.springbootstarter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.hemant.springbootstarter.controllers.UserController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;



@EnableSwagger2
@ComponentScan(basePackageClasses=UserController.class)
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                 .apiInfo(metaData())
                 .select()
                 .paths(regex("/api.*"))
                 .build();
    }
    private ApiInfo metaData() {
    	return new ApiInfoBuilder()
        .title("User REST API")
        .contact("Hemant")
        .description("RESTFul API for Users")
        .license("Apache License Version 2.0")
        .version("2.0")
        .build();
    }
}