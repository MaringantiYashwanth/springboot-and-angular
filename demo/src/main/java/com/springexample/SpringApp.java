package com.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringApp {
    private static ApplicationContext applicationContext;
    @Bean
//    public SpringBean springBean() {
//        return new SpringBean();
//    }

    public static void main(String[] args) {
//        applicationContext = AnnotationConfigApplicationContext(SpringComponentScanApp.class);
    }
}
