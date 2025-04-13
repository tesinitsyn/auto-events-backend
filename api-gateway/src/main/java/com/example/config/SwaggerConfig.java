package com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info().title("API Gateway").version("1.0").description("Шлюз для микросервисов"));
    }

    @Bean
    public GroupedOpenApi gatewayGroup() {
        return GroupedOpenApi.builder()
            .group("gateway")
            .pathsToMatch("/**")
            .build();
    }
}
