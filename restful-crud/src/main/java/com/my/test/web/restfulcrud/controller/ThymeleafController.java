package com.my.test.web.restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {

    @GetMapping("success")
    public String success(Map<String, Object> params) {
        params.put("hello", "<h2>你好</h2>");
        List<String> list = Arrays.asList("zhansan", "lisi", "wangwu");
        params.put("users", list);
        return "success";
    }
}
