package com.microservice.cric.scoreinfo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ScoreinfoConfig { 
  
   public Docket SwaggerApi() { 
       return new Docket(DocumentationType.SWAGGER_2) 
               .select() 
               .apis(RequestHandlerSelectors.any()) 
               .paths(PathSelectors.any()) 
               .build(); 
   }
   
   @Bean
   public Docket api() {
       return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.microservice.cric.scoreinfo"))
               .paths(PathSelectors.any())
               .build()
               .apiInfo(apiInfo()); // Completely Optional
   }

   private ApiInfo apiInfo() {
       return new ApiInfoBuilder()
               .title("Score Info")
               .description("Demonstration of all write portal API")
               .version("1.0")
               .build();
   }
}