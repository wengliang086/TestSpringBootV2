package com.my.test.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.my.test.springboot1.web.servlet")
public class Springboot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }
}
