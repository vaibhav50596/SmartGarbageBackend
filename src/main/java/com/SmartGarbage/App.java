package com.SmartGarbage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
        System.out.println("starting an app");
        SpringApplication.run(App.class, args);
    }

    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/getgarbage").allowedOrigins("http://localhost:4200");
                registry.addMapping("/postgarbage").allowedOrigins("http://localhost:4200");
            }
        };
    }
}
