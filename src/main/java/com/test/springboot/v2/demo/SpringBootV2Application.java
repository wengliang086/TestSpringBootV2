package com.test.springboot.v2.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.test.springboot.v2.demo.dao.mybatis.mapper")
public class SpringBootV2Application extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootV2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootV2Application.class, args);
        logger.info("start success!");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootV2Application.class);
    }
}
