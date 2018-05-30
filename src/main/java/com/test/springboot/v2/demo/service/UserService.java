package com.test.springboot.v2.demo.service;

import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;

import java.util.List;

public interface UserService {

    UserInfo addUser(UserInfo userInfo, String code);

    Integer getRegisterCode(String phone);

    UserInfo login(String phone, String password);

    List<UserInfo> findAll();
}
