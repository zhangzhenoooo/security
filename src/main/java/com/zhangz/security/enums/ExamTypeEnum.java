package com.zhangz.security.enums;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/5 15:32
 */
public enum ExamTypeEnum {
    NOT_APPROVAL("待审批"),
    APPROVAL_FALSE("未通过"),
    APPROVAL_TRUE("通过"),
    ;

    private String Status;

    ExamTypeEnum(String status) {
        Status = status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
