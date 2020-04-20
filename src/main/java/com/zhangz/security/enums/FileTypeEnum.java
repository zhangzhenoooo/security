package com.zhangz.security.enums;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/2/29 16:06
 */
public enum FileTypeEnum {
    IMG(1),//生产商
    WORD(2),//检测部门
    EXCEL(3),//管理员
    TXT(4)
        ;
    private Integer type;

    FileTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
