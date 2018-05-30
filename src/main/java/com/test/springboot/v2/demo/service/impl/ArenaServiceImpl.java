package com.test.springboot.v2.demo.service.impl;

import com.google.common.base.Strings;
import com.test.springboot.v2.demo.dao.ArenaInfoDao;
import com.test.springboot.v2.demo.dao.UserInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;
import com.test.springboot.v2.demo.exceptioin.InnsException;
import com.test.springboot.v2.demo.exceptioin.InnsExceptionEnum;
import com.test.springboot.v2.demo.service.ArenaService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class ArenaServiceImpl implements ArenaService {

    @Resource
    private ArenaInfoDao arenaInfoDao;

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public ArenaInfo add(ArenaInfo arenaInfo, long uid) {
        if (userInfoDao.get(uid) == null) {
            throw new InnsException(InnsExceptionEnum.ACCOUNT_NOT_EXIST);
        }
        if (Strings.isNullOrEmpty(arenaInfo.getTitle())) {
            throw new InnsException("title 不能为空");
        }
        arenaInfo.setCreateTime(new Date());
        arenaInfo.setUid(uid);
        arenaInfoDao.save(arenaInfo);
        return arenaInfo;
    }

    @Override
    public List<ArenaInfo> findAll() {
        return arenaInfoDao.findAll();
    }

    @Override
    public ArenaInfo delete(long arenaId) {
        ArenaInfo arenaInfo = arenaInfoDao.get(arenaId);
        if (arenaInfo == null) {
            throw new InnsException("arenaId 错误");
        }
        arenaInfoDao.delete(arenaId);
        return arenaInfo;
    }

    @Override
    public ArenaInfo update(ArenaInfo arenaInfo) {
        ArenaInfo arenaInfo1 = arenaInfoDao.get(arenaInfo.getId());
        if (arenaInfo1 == null) {
            throw new InnsException("arenaId 不能为空");
        }
        if (Strings.isNullOrEmpty(arenaInfo.getTitle())) {
            arenaInfo1.setTitle(arenaInfo.getTitle());
        }
        if (Strings.isNullOrEmpty(arenaInfo.getArenaDescribe())) {
            arenaInfo1.setArenaDescribe(arenaInfo.getArenaDescribe());
        }
        if (arenaInfo.getStatus() != null) {
            arenaInfo1.setStatus(arenaInfo.getStatus());
        }
        arenaInfoDao.update(arenaInfo1);
        return arenaInfo1;
    }
}
