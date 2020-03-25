package com.zhangz.security.service;

import com.zhangz.security.model.Product;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 20:20
 */
public interface ProductService <T>{
    List<T> list(String vendorId, String siteId, String batchId);

    int insert(Product record);

    int batchInsert(List<Product> list);
}
