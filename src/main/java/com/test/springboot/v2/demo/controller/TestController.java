package com.test.springboot.v2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class TestController {

    @GetMapping("ok")
    public String ok() {
        return "ok";
    }

    public static void main(String[] args) {
        String s = "a707b010e44f4edf833f51e78d88c78e|a707b010e44f4edf833f51e78d88c78e|0.10|182044749460|";
        String s1 = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println(s1);
    }
}
