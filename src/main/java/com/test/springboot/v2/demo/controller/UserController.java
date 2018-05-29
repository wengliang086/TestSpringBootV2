package com.test.springboot.v2.demo.controller;

import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import com.test.springboot.v2.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user/")
public class UserController {

    @Resource
    private UserService userService;

    //add?phone=12311112222&password=123456&code=111111
    @GetMapping("add")
    public Object addUser(UserInfo userInfo, String code) {
        return userService.addUser(userInfo, code);
    }

    //login?phone=12311112222&password=123456
    @GetMapping("login")
    public Object login(String phone, String password) {
        return userService.login(phone, password);
    }

    @GetMapping("findAll")
    public Object findAll() {
        return userService.findAll();
    }
}
