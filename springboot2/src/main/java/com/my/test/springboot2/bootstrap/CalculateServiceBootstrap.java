package com.my.test.springboot2.bootstrap;

import com.my.test.springboot2.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.my.test.springboot2.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java7")// 注意：这里不设置Profile的话，会报错
                .run(args);
        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService);
        context.close();
    }
}
