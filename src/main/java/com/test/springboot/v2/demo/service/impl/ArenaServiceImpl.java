package com.test.springboot.v2.demo.service.impl;

import com.test.springboot.v2.demo.dao.ArenaInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;
import com.test.springboot.v2.demo.service.ArenaService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ArenaServiceImpl implements ArenaService {

    @Resource
    private ArenaInfoDao arenaInfoDao;

    @Override
    public ArenaInfo add(ArenaInfo userInfo) {
        return null;
    }

    @Override
    public List<ArenaInfo> findAll() {
        return null;
    }
}
