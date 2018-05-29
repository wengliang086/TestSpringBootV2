package com.test.springboot.v2.demo.dao.mybatis.impl;

import com.test.springboot.v2.demo.dao.VoteInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.mapper.VoteInfoMapper;
import com.test.springboot.v2.demo.dao.mybatis.vo.VoteInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.VoteInfoKey;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;




@Repository
public class VoteInfoDaoImpl implements VoteInfoDao {
	
	@Resource
	private VoteInfoMapper voteInfoMapper;

	@Override
	public void save(VoteInfo voteInfo){
		voteInfoMapper.insert(voteInfo);
	}

	@Override
	public VoteInfo get(VoteInfoKey voteInfoKey) {
		return voteInfoMapper.selectByPrimaryKey(voteInfoKey);
	}

	@Override
	public void update(VoteInfo voteInfo) {
		voteInfoMapper.updateByPrimaryKey(voteInfo);
	}

	@Override
	public void delete(VoteInfoKey voteInfoKey) {
		voteInfoMapper.deleteByPrimaryKey(voteInfoKey);
	}
	
	 
	////*******自定义开始********//
	//**********自定义结束*****////
	
}
