package com.test.springboot.v2.demo.controller;

import com.test.springboot.v2.demo.dao.UserInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class CommentController {

    @Resource
    private UserInfoDao userInfoDao;

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Object getById(Long id) {
        return userInfoDao.get(id);
    }

    @GetMapping("getAll")
    public Object getAll() {
        return "";
    }

    @PostMapping("delete")
    public Object delete(Long id) {
        UserInfo user = new UserInfo();
        user.setAccount("");
        userInfoDao.save(user);
        userInfoDao.delete(id);
        return "";
    }
}
