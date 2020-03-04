package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.UserMapper;
import com.zhangz.security.model.User;
import com.zhangz.security.model.UserExample;
import com.zhangz.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/1 16:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectByEmail(String email) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andEmailEqualTo(email);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() >0 ){
            return users.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean insert(User user) {
        int affectedRow = userMapper.insert(user);
       if (affectedRow > 0){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public boolean updateByEmail(User user,String email) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andEmailEqualTo(email);
        int affectedRow = userMapper.updateByExampleSelective(user,userExample);
        return affectedRow > 0? true:false;
    }

    @Override
    public List<User> selectNeedApprove( Integer userType) {

        UserExample userExample  = new UserExample();
        userExample.createCriteria()
                .andIsDeleteEqualTo(true)
                .andTypeEqualTo(userType);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public boolean updateLastAddress(Long userId,String lastAddress) {
        User user = new User();
        user.setLastAddress(lastAddress);
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andUserIdEqualTo(userId);
        int i = userMapper.updateByExampleSelective(user, userExample);
        return  i > 0 ?  true:false;
    }


}
