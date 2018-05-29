package com.test.springboot.v2.demo.dao;

import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfoExample;

import java.lang.Long;
import java.util.List;


public interface ArenaInfoDao extends Dao<ArenaInfo,Long>{

	
	////*******自定义开始********//
    List<ArenaInfo> findAll();
	//**********自定义结束*****////

}
