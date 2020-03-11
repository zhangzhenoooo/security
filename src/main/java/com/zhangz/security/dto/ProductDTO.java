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

    private Long productId;
    private Long siteId;
    private Long batchId;
    private Long itemId;
    private String productName;
    private String description;
    private String composition;
    private Integer isDelete;
    private Site site;
    private Item item;
    private String siteName;
    private String itemName;
    private String vendorName;
    private Batch batch;
}
