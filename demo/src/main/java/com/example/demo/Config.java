package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Car.class)
public class Config {
    @Bean
    public Brand getBrand() {
        return new Brand("Toyota", 2023);
    }
}
