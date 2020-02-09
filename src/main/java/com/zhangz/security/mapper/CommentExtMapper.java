package com.zhangz.security.mapper;

import com.zhangz.security.model.Comment;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/1/28 22:05
 */
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}
