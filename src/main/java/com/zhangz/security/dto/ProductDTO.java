package com.zhangz.security.dto;

import com.zhangz.security.model.Batch;
import com.zhangz.security.model.Item;
import com.zhangz.security.model.Site;
import lombok.Data;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 20:14
 */
@Data
public class ProductDTO {

    private String productId;
    private String siteId;
    private String batchId;
    private String itemId;
    private String productName;
    private String description;
    private String composition;
    private Integer isDelete;
    private Site site;
    private Item item;
    private String siteName;
    private String itemName;
    private String vendor;
    private String vendorName;
    private Batch batch;
}
