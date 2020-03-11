package com.zhangz.security.service;

import com.zhangz.security.model.Product;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 20:20
 */
public interface ProductService <T>{
    List<T> list(Long vendorId,Long siteId,Long batchId);

    int insert(Product record);
}
