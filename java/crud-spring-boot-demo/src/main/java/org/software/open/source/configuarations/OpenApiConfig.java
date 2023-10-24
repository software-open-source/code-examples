package org.software.open.source.configuarations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI() {
        Contact contact =  new Contact().name("Software Open Source").url("https://github.com/software-open-source").email("richardvu.work@gmail.com");
        return new OpenAPI().components(new Components()).info(new Info().title("CRUD Spring Boot Application").description("CRUD spring boot application don't use the database").termsOfService("https://github.com/software-open-source").contact(contact));
    }

}
