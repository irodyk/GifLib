package com.irodyk.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.irodyk.giflib")
public class AppConfig {

    public static void main(String[] args){
        SpringApplication.run(AppConfig.class, args);
    }
}
