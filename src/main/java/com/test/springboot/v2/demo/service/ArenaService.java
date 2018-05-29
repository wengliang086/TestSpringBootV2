package com.test.springboot.v2.demo.service;

import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;

import java.util.List;

public interface ArenaService {

    ArenaInfo add(ArenaInfo userInfo);

    List<ArenaInfo> findAll();

    ArenaInfo delete(long arenaId);

    ArenaInfo update(ArenaInfo arenaInfo);
}
