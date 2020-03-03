package com.zhangz.security.service;


import com.zhangz.security.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/1 16:39
 */
@Service
public interface UserService {
    //根据邮箱查询用户
    User selectByEmail(String email );
    //插入用户
    boolean insert(User user);
    /**
     *
     * @description 更新用户信息
     * @author zhangz
     * @date 2020:03:02 11:07:10
     * @param user
     * @param email email是唯一的根据email确定需要更改的用户
     * @return boolean
     **/
    boolean updateByEmail(User user,String email);
    /**
     *
     * @description 查询待审批的账号，
     * @author zhangz
     * @date 2020:03:02 11:05:02
     * @param userType true/1：生产商；2：检测部门
     * @return list
     **/
    List<User> selectNeedApprove(Integer userType);

}
