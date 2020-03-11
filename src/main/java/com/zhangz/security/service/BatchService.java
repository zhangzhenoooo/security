package com.zhangz.security.service;

import com.zhangz.security.model.Batch;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/7 17:49
 */
public interface BatchService {

    List<Batch> listByCreatorId(Long creatorId);
    int insert(Batch record);
    Batch selectById(Long Id);
}
