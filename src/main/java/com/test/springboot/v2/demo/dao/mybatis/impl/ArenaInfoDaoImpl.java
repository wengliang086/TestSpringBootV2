package com.test.springboot.v2.demo.dao.mybatis.impl;

import com.test.springboot.v2.demo.dao.ArenaInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.mapper.ArenaInfoMapper;
import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfo;
import java.lang.Long;
import java.util.List;
import javax.annotation.Resource;

import com.test.springboot.v2.demo.dao.mybatis.vo.ArenaInfoExample;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfoExample;
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

	@Override
	public List<ArenaInfo> findAll() {
		ArenaInfoExample example = new ArenaInfoExample();
		return arenaInfoMapper.selectByExample(example);
	}

	//**********自定义结束*****////
	
}
