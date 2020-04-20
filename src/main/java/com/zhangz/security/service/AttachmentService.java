package com.zhangz.security.service;

import com.zhangz.security.model.Attachment;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/11 8:53
 */
public interface AttachmentService {
    List<Attachment> listByParentId(String parentId);
    Attachment selectById(String attachmentId);
    int insert(Attachment attachment);
    int updateBySelective(Attachment attachment);
    int deleteByParentId(String parentId);
    int deleteById(String  attachmentId);

}
