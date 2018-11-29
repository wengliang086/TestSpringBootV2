package com.my.test.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Springboot2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Springboot2Application.class).run(args);
//        SpringApplication.run(Springboot2Application.class, args);
    }
}
