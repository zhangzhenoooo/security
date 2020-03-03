package com.zhangz.security.service;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 20:20
 */
public interface ProductService <T>{
    List<T> list(Long vendorId,Long batchId);
}
