package com.zhangz.security.controller;

import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.UserServiceImpl;
import com.zhangz.security.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/1 16:17
 */
@Controller
@Slf4j
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;


    @GetMapping("/user/login")
    public String login(){
        return "login";
    }

    @PostMapping("/user/checkLogin")
    public String checkLogin(@Param(value = "email") String email,
                             @Param(value = "password") String password,
                             Model model,
                             HttpSession session){
        User dbUser = null;
        dbUser = userServiceImpl.selectByEmail(email);
        if (dbUser != null){
            if (dbUser.getPassword().equals(password)) {
                //登录成功，将登录用户信息存入session
                dbUser.setPassword(null);
                session.setAttribute("user",dbUser);
                return "redirect:/";
            }else {
                //密码错误
                model.addAttribute("message","密码错误！");
                model.addAttribute("success",false);
                return "login";
            }
        }else {
            model.addAttribute("message","该用户不存在！");
            model.addAttribute("success",false);
            return "login";
        }
    }


    @GetMapping("/user/register")
    public String register(){return "register";}

    /**
     *
     * @description 注册
     * @author zhangz
     * @date 2020:03:01 20:38:31
     * @param email 邮箱
     * @param password 密码
     * @param password2
     * @param type 类型：1为生产商；2为检测机构
     * @param userName 用户名
     * @param model
     * @return
     **/

    @PostMapping(value = "/user/checkRegister")
    public String checkRegister(@Param(value = "email") String email,
                                @Param(value = "password") String password,
                                @Param(value = "password2")String password2,
                                @Param(value = "type")Integer type,
                                @Param(value = "userName")String userName,
                                Model model,
                                HttpServletResponse response) throws IOException {

        if (!password.equals(password2)){
            model.addAttribute("success",false);
            model.addAttribute("message","两次输入密码不一致");
            //注册失败
            return "register";
        }else {
            User dbUser = userServiceImpl.selectByEmail(email);
            if (dbUser != null) {
                model.addAttribute("success",false);
                model.addAttribute("message","该邮箱已经被注册过了");
                //注册失败
                return "register";
            } else {
                User user = new User();
                user.setPassword(password);
                user.setEmail(email);
                user.setType(1);
                user.setUserName(userName);
                user.setCreateDate(DateUtil.getData());
                user.setModifyDate(DateUtil.getData());
                user.setIsDelete(true);
                user.setLastAddress("123");

                boolean result = userServiceImpl.insert(user);
                if (result) {
                    //注册成功
//                    response.sendRedirect("/user/login");
                    return  "redirect:/user/login";
                }else {
                    model.addAttribute("success",false);
                    model.addAttribute("message","注册失败");
                    //注册失败
                    return "register";
                }
            }

        }
    }

}