package com.test.springboot.v2.demo.service;

import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;

import java.util.List;

public interface UserService {

    UserInfo addUser(UserInfo userInfo);

    List<UserInfo> findAll();
}
