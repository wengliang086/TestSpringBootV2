package com.test.springboot.v2.demo.exceptioin;

/**
 * 抽象接口
 */
public interface ResultCode {

    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMsg();
}
