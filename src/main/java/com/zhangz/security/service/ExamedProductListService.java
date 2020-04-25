package com.zhangz.security.service;

import com.zhangz.security.model.Examedproductlist;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/25 9:37
 */
public interface ExamedProductListService {
    Examedproductlist selectByKeyWords(String itemId, String siteId, String batchId, String examStatus);
}
