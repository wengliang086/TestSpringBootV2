package com.test.springboot.v2.demo.dao.mybatis.impl;

import com.test.springboot.v2.demo.dao.ArenaInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.mapper.ArenaInfoMapper;
import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;
import java.lang.Long;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;




@Repository
public class ArenaInfoDaoImpl implements ArenaInfoDao {
	
	@Resource
	private ArenaInfoMapper arenaInfoMapper;

	@Override
	public void save(ArenaInfo arenaInfo){
		arenaInfoMapper.insert(arenaInfo);
	}

	@Override
	public ArenaInfo get(Long id) {
		return arenaInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(ArenaInfo arenaInfo) {
		arenaInfoMapper.updateByPrimaryKey(arenaInfo);
	}

	@Override
	public void delete(Long id) {
		arenaInfoMapper.deleteByPrimaryKey(id);
	}
	
	 
	////*******自定义开始********//
	//**********自定义结束*****////
	
}
