package com.zhangz.security.service;

import com.zhangz.security.model.Approval;
import com.zhangz.security.model.User;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 15:56
 */
public interface ApprovalService {

    boolean approve(User approver,Long userId,boolean status);
}
