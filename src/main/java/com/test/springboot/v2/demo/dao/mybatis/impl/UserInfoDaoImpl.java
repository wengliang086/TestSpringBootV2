package com.test.springboot.v2.demo.dao.mybatis.impl;

import com.test.springboot.v2.demo.dao.UserInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.mapper.UserInfoMapper;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfoExample;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;




@Repository
public class UserInfoDaoImpl implements UserInfoDao {
	
	@Resource
	private UserInfoMapper userInfoMapper;

	@Override
	public void save(UserInfo userInfo){
		userInfoMapper.insert(userInfo);
	}

	@Override
	public UserInfo get(Long uid) {
		return userInfoMapper.selectByPrimaryKey(uid);
	}

	@Override
	public void update(UserInfo userInfo) {
		userInfoMapper.updateByPrimaryKey(userInfo);
	}

	@Override
	public void delete(Long uid) {
		userInfoMapper.deleteByPrimaryKey(uid);
	}
	
	 
	////*******自定义开始********//

	@Override
	public List<UserInfo> findAll() {
		UserInfoExample example = new UserInfoExample();
		return userInfoMapper.selectByExample(example);
	}

	//**********自定义结束*****////
	
}
