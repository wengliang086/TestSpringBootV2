package com.test.springboot.v2.demo.service.impl;

import com.test.springboot.v2.demo.dao.UserInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import com.test.springboot.v2.demo.service.UserService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserServiceImpl implements UserService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo addUser(UserInfo userInfo) {
        userInfoDao.save(userInfo);
        return userInfo;
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }
}
