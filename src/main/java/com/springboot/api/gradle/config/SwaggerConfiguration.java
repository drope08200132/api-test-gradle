package com.springboot.api.gradle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
    public Docket defApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                   .select()                 
                   .apis(RequestHandlerSelectors.basePackage("com.springboot.api.gradle.controller"))
                   //.paths(regex("/persona.*"))
                   .paths(regex("/cliente.*"))
                   .build()
                   .apiInfo(metaData());
    }
    
    private ApiInfo metaData() {
    	
   	 return new ApiInfoBuilder()
        		.title("Microservicio de mantenimiento de Cliente")
                .description("Api destinada a las operaciones básicas de una tabla")
                .termsOfServiceUrl("Términos del Servicio")
                .version("1.0")
                .contact(new Contact("Kevin Pinchi", "www.google.com", "kevin.pinchi.garcia@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();    	

   }  
}