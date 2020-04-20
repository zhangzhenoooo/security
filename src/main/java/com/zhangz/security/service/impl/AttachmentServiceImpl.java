package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.AttachmentMapper;
import com.zhangz.security.model.Attachment;
import com.zhangz.security.model.AttachmentExample;
import com.zhangz.security.plugin.SnowIdUtils;
import com.zhangz.security.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/11 8:57
 */
@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    private AttachmentMapper  attachmentMapper;

    @Override
    public List<Attachment> listByParentId(String parentId) {
        AttachmentExample attachmentExample = new AttachmentExample();
        attachmentExample.createCriteria()
                .andParentIdEqualTo(parentId);
        List<Attachment> attachments = attachmentMapper.selectByExample(attachmentExample);
        if (attachments.size() > 0 ){
            return attachments;
        }else {
            return new ArrayList<>();
        }

    }

    @Override
    public Attachment selectById(String attachmentId) {
        Attachment attachment = attachmentMapper.selectByPrimaryKey(attachmentId);
        if (ObjectUtils.isEmpty(attachment)){
            return new Attachment();
        }else {
            return  attachment;
        }
    }

    @Override
    public int insert(Attachment attachment) {
        attachment.setAttachmentId(SnowIdUtils.uniqueLongHex());
        int insert = attachmentMapper.insert(attachment);
       return insert;
    }

    @Override
    public int updateBySelective(Attachment attachment) {
        AttachmentExample attachmentExample = new AttachmentExample();
        attachmentExample.createCriteria()
                .andAttachmentIdEqualTo(attachment.getAttachmentId());
        int i = attachmentMapper.updateByExampleSelective(attachment, attachmentExample);
        return i;
    }

    @Override
    public int deleteByParentId(String parentId) {
        AttachmentExample attachmentExample = new AttachmentExample();
        attachmentExample.createCriteria()
                .andParentIdEqualTo(parentId);
        int i = attachmentMapper.deleteByExample(attachmentExample);
        return i;
    }

    @Override
    public int deleteById(String attachmentId) {
        int i = attachmentMapper.deleteByPrimaryKey(attachmentId);
        return i;
    }
}
