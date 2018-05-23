package com.test.springboot.v2.demo.dao.mybatis.impl;

import com.test.springboot.v2.demo.dao.CodeInfoDao;
import com.test.springboot.v2.demo.dao.mybatis.mapper.CodeInfoMapper;
import com.test.springboot.v2.demo.dao.mybatis.vo.CodeInfo;
import java.lang.String;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;




@Repository
public class CodeInfoDaoImpl implements CodeInfoDao {
	
	@Resource
	private CodeInfoMapper codeInfoMapper;

	@Override
	public void save(CodeInfo codeInfo){
		codeInfoMapper.insert(codeInfo);
	}

	@Override
	public CodeInfo get(String phone) {
		return codeInfoMapper.selectByPrimaryKey(phone);
	}

	@Override
	public void update(CodeInfo codeInfo) {
		codeInfoMapper.updateByPrimaryKey(codeInfo);
	}

	@Override
	public void delete(String phone) {
		codeInfoMapper.deleteByPrimaryKey(phone);
	}
	
	 
	////*******自定义开始********//
	//**********自定义结束*****////
	
}
