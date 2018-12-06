package com.my.test.springboot1.web.servlet;

import com.my.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterTestController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.sayHello(name);
    }
}
