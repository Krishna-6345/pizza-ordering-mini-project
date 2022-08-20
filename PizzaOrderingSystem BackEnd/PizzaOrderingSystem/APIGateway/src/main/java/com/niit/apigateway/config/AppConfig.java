package com.niit.apigateway.config;



import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

@Bean
public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    return builder.routes()
            .route(p -> p
                    .path("/api/v1/**")
                    .uri("http://localhost:8099/"))
            .route(p->p
                    .path("/api/v2/**")
                    .uri("http://localhost:8084/"))
            .build();
}

}


