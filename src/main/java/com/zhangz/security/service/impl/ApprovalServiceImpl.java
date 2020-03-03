package com.zhangz.security.service.impl;

import com.zhangz.security.enums.UserTypeEnum;
import com.zhangz.security.mapper.ApprovalMapper;
import com.zhangz.security.mapper.UserMapper;
import com.zhangz.security.model.Approval;
import com.zhangz.security.model.User;
import com.zhangz.security.model.UserExample;
import com.zhangz.security.service.ApprovalService;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 16:11
 */
//@Component
@Service
public class ApprovalServiceImpl implements ApprovalService {

    @Autowired
    private ApprovalMapper approvalMapper;
    @Autowired
    private UserMapper userMapper;
    private UserServiceImpl userServiceImpl;

    @Override
    public boolean approve(User approver,Long userId,boolean status) {

        //添加审批记录
        Approval approval = new Approval();
        approval.setApproveDate(DateUtil.getData());
        approval.setApprovededId(userId);
        approval.setApproverId(approver.getUserId());
        approval.setApproverName(approver.getUserName());
        approval.setApproveStatus(true);
        approval.setType(UserTypeEnum.PRODUCER.getType());
        approvalMapper.insert(approval);

     //审批;修改 user 的is_delete 字段为false
        User user = new User();
        user.setUserId(userId);
        user.setIsDelete(status);
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andUserIdEqualTo(userId);
        userMapper.updateByExampleSelective(user,userExample);
        return  true;
    }
}
