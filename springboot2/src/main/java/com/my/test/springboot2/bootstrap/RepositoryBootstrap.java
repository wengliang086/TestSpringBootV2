package com.my.test.springboot2.bootstrap;

import com.my.test.springboot2.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.my.test.springboot2.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.my.test.springboot2.repository");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        applicationContext.close();*/

        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        System.out.println(applicationContext.getBean(MyFirstLevelRepository.class));
        applicationContext.close();
    }
}
