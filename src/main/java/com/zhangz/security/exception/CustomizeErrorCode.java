package com.zhangz.security.exception;

/**
 * Created by codedrinker on 2019/5/28.
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    SITE_INSERT_FALSE(2001, "插入失败，请重试！"),
    USER_NOT_EXIST(2002,"用户不存在！"),
    USER_PASSWORD_WRONG(2003,"密码错误"),
    ACCOUNT_NOT_APPROVED(2004,"账号还未通过审批！"),
    APPROVE_FALSE(2005,"审批失败，请重试"),
    ITEM_INSERT_FALSE(2006,"新增失败"),
    EXAM_INSERT_FALSE(2007,"插入失败"),
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
