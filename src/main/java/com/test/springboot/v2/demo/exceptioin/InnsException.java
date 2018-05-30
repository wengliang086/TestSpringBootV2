package com.test.springboot.v2.demo.exceptioin;

public class InnsException extends RuntimeException implements ResultCode {

    private Integer code;

    public InnsException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.code = resultCode.getCode();
    }

    public InnsException(String message) {
        super(message);
        this.code = 200;
    }

    public InnsException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return getMessage();
    }

    @Override
    public String toString() {
        return "InnsException{" +
                "code=" + code +
                ", message=" + getMsg() +
                '}';
    }
}
