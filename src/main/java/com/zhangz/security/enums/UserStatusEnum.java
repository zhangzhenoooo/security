package com.zhangz.security.enums;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 11:11
 */
public enum UserStatusEnum {
    DELETED_OR_NOT_APPROVED(true),
    ACTIVE(false),
    ;

    private boolean  isDelete;

    UserStatusEnum(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
