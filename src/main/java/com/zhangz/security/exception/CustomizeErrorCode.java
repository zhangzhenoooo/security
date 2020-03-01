package com.zhangz.security.exception;

/**
 * Created by codedrinker on 2019/5/28.
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    SITE_INSERT_FALSE(2001, "插入失败，请重试！"),
    USER_NOT_EXIST(2002,"用户不存在！"),
    USER_PASSWORD_WRONG(2003,"密码错误"),
    ;


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
