package com.test.springboot.v2.demo.dao.mybatis.mapper;

import com.test.springboot.v2.demo.dao.mybatis.vo.CodeInfo;
import com.test.springboot.v2.demo.dao.mybatis.vo.CodeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface CodeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    long countByExample(CodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int deleteByExample(CodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int insert(CodeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int insertSelective(CodeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    List<CodeInfo> selectByExample(CodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    CodeInfo selectByPrimaryKey(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CodeInfo record, @Param("example") CodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CodeInfo record, @Param("example") CodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CodeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CodeInfo record);


	       ////*******自定义开始********/
        //***********自定义结束****////
}
