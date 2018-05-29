package com.test.springboot.v2.demo.dao;

import com.test.springboot.v2.demo.dao.mybatis.vo.UserInfo;
import java.lang.Long;
import java.util.List;


public interface UserInfoDao extends Dao<UserInfo,Long>{

	
	////*******自定义开始********//
    List<UserInfo> getByPhone(String phone);

    List<UserInfo> findAll();
	//**********自定义结束*****////

}
