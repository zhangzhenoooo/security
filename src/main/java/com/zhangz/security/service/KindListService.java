package com.zhangz.security.service;

import com.zhangz.security.model.Kindlist;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/22 19:29
 */
public interface KindListService {
    List<Kindlist> list();

    Kindlist selectById(Long id);
}
