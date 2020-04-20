package com.zhangz.security.provider;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.User;
import com.zhangz.security.utils.Validator;
import org.springframework.boot.autoconfigure.validation.ValidatorAdapter;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/1 20:15
 */
public class UserProvider {


    public static ResultDTO isValidityOfUser(User user){
        if (StringUtils.isEmpty(user.getEmail())){
            //邮箱为空
           return ResultDTO.errorOf(CustomizeErrorCode.EMALI_IS_NULL);
        }
        if (ObjectUtils.isEmpty(user.getPassword())){
//            密码为空
            return ResultDTO.errorOf(CustomizeErrorCode.PASSWORD_IS_NULL);
        }
        if (!Validator.isEmail(user.getEmail())){
            return ResultDTO.errorOf(CustomizeErrorCode.IS_NOT_EMAIL);
        }
        if (!Validator.isPassword(user.getPassword())){
            return ResultDTO.errorOf(CustomizeErrorCode.IS_NOT_PASSWORD);
        }
        return ResultDTO.successOf();
    }
}
