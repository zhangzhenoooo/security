package com.zhangz.security.dto;

import com.zhangz.security.model.Site;
import com.zhangz.security.model.User;
import lombok.Data;

import java.util.Date;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/10 15:07
 */
@Data
public class ItemDTO {

    private String itemId;
    private String itemName;
    private String description;
    private String siteId;
    private String composition;
    private Date createDate;
    private Date modifyDate;
    private Boolean isDelete;
    private Date examDate;
    private String examStatus;
    private String verifier;
    private Integer effectiveDate;
    private String kindId;
    private String kindName;

    private Site site;
    private User provider ;
}
