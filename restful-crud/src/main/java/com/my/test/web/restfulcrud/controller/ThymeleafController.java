package com.my.test.web.restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ThymeleafController {

    @GetMapping("success")
    public String success(Map<String, String> params) {
        params.put("key1", "value1");
        return "success";
    }
}
