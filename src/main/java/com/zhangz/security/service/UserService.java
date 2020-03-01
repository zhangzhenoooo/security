package com.zhangz.security.service;


import com.zhangz.security.model.User;
import org.springframework.stereotype.Service;

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
    //修改
    boolean updateByEmail(User user,String email);

}
