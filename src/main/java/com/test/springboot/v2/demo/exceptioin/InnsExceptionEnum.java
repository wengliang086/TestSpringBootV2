package com.test.springboot.v2.demo.exceptioin;

/**
 * 异常枚举
 */
public enum InnsExceptionEnum implements ResultCode {

    SUCCESS(1, "成功"),
    /**
     * 其他
     */
    UNKNOW_ERROR(-1, "未知错误"),
    USER_NOT_FIND(2, "IMEI 不存在"),
    BUILD_ID_NOT_FIND(3, "BUILD_ID 不存在"),
    TIME_ERROR(4, "时间错误"),
    TIME_TYPE_ERROR(5, "时间类型错误"),
    APP_ID_ERROR(6, "appid错误"),

    SERVER_ERROR(500, "服务器异常");

    InnsExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return message;
    }

}
