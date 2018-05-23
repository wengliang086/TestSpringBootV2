package com.test.springboot.v2.demo.controller;

import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import com.test.springboot.v2.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("add")
    public Object addUser(UserInfo userInfo) {
        return userService.addUser(userInfo);
    }

    @GetMapping("findAll")
    public Object findAll() {
        return userService.findAll();
    }
}
