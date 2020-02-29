package com.zhangz.security.enums;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/2/29 16:06
 */
public enum  UserTypeEnum {
    PRODUCER(1),//生产商
    DETECTION(2),//检测部门
    ADMINISTRATOR(3)//管理员
        ;
    private Integer type;

    UserTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
