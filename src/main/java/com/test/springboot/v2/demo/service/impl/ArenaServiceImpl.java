package com.test.springboot.v2.demo.service.impl;

import com.test.springboot.v2.demo.dao.ArenaInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;
import com.test.springboot.v2.demo.exceptioin.InnsException;
import com.test.springboot.v2.demo.exceptioin.InnsExceptionEnum;
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
        arenaInfoDao.save(userInfo);
        return userInfo;
    }

    @Override
    public List<ArenaInfo> findAll() {
        return arenaInfoDao.findAll();
    }

    @Override
    public ArenaInfo delete(long arenaId) {
        ArenaInfo arenaInfo = arenaInfoDao.get(arenaId);
        if (arenaInfo == null) {
            throw new InnsException(InnsExceptionEnum.PARAMETERS_CAN_NOT_BE_REPEATED);
        }
        arenaInfoDao.delete(arenaId);
        return arenaInfo;
    }

    @Override
    public ArenaInfo update(ArenaInfo arenaInfo) {
        arenaInfoDao.update(arenaInfo);
        return arenaInfo;
    }
}
