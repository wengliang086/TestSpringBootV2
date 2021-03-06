package com.test.springboot.v2.demo.dao.mybatis.mapper;

import com.test.springboot.v2.demo.dao.mybatis.vo.VoteInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.VoteInfoExample;
import com.test.springboot.v2.demo.dao.mybatis.vo.VoteInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface VoteInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    long countByExample(VoteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int deleteByExample(VoteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(VoteInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int insert(VoteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int insertSelective(VoteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    List<VoteInfo> selectByExample(VoteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    VoteInfo selectByPrimaryKey(VoteInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VoteInfo record, @Param("example") VoteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VoteInfo record, @Param("example") VoteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VoteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VoteInfo record);


	       ////*******自定义开始********/
        //***********自定义结束****////
}
