package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Address;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.AddressServiceImpl;
import com.zhangz.security.service.impl.UserServiceImpl;
import com.zhangz.security.utils.DateUtil;
import com.zhangz.security.utils.GetIP;
import com.zhangz.security.utils.SnowIdUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

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
    @Autowired
    private AddressServiceImpl addressServiceImpl;

    @GetMapping("/user/login")
    public String login(){
        return "login";
    }

    @PostMapping("/user/checkLogin")
    public String checkLogin(@Param(value = "email") String email,
                             @Param(value = "password") String password,
                             Model model,
                             HttpSession session,
                             HttpServletRequest request){
        User dbUser = null;
        dbUser = userServiceImpl.selectByEmail(email);
        if (dbUser != null){
            if (dbUser.getIsDelete()){
                //账号还未审批
                model.addAttribute("message",CustomizeErrorCode.ACCOUNT_NOT_APPROVED.getMessage());
                model.addAttribute("success",false);
                return "login";
            }
            if (dbUser.getPassword().equals(password)) {
                //登录成功，将登录用户信息存入session
                dbUser.setPassword(null);
                session.setAttribute("user",dbUser);
                String ipAddr = GetIP.getIpAddr(request);
                userServiceImpl.updateLastAddress(dbUser.getUserId(),ipAddr);
                return "redirect:/";
            }else {
                //密码错误
                model.addAttribute("message",CustomizeErrorCode.USER_PASSWORD_WRONG.getMessage());
                model.addAttribute("success",false);
                return "login";
            }
        }else {
            model.addAttribute("message", CustomizeErrorCode.USER_NOT_EXIST.getMessage());
            model.addAttribute("success",false);
            return "login";
        }
    }


    @GetMapping("/user/register")
    public String register(Model model){

        List<Address> provinces = addressServiceImpl.listOfProvince();
        List<Address> cities = addressServiceImpl.listOfCity();
        List<Address> counties = addressServiceImpl.listOfCountry();
        model.addAttribute("provinces",provinces);
        model.addAttribute("cities",cities);
        model.addAttribute("counties",counties);
        return "register";
    }

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
                                @Param(value = "province")String province,
                                @Param(value = "city")String city,
                                @Param(value = "county")String county,
                                @Param(value = "addressDetails")String addressDetails,
                                Model model,
                                HttpServletResponse response) throws IOException {

        List<Address> provinces = addressServiceImpl.listOfProvince();
        List<Address> cities = addressServiceImpl.listOfCity();
        List<Address> counties = addressServiceImpl.listOfCountry();
        model.addAttribute("provinces",provinces);
        model.addAttribute("cities",cities);
        model.addAttribute("counties",counties);

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
                user.setUserId(SnowIdUtils.uniqueLongHex());
                user.setPassword(password);
                user.setEmail(email);
                user.setType(1);
                user.setUserName(userName);
                user.setCreateDate(DateUtil.getData());
                user.setModifyDate(DateUtil.getData());
                user.setIsDelete(true);
                user.setLastAddress("123");
                user.setProvinceCode(province);
                user.setCityCode(city);
                user.setCountyCode(county);
                user.setAddress(addressDetails);

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

    /**
     *
     * @description  个人信息管理页面
     * @author zhangz
     * @date 2020:03:05 15:50:13
     * @param model
     * @return
     **/
    @GetMapping("/user/personManagement")
    public String personManagement(Model model,
                                   HttpSession session){
        User user = (User) session.getAttribute("user");

        List<Address> provinces = addressServiceImpl.listOfProvince();
        List<Address> cities = addressServiceImpl.listOfCity();
        List<Address> counties = addressServiceImpl.listOfCountry();
        model.addAttribute("provinces",provinces);
        model.addAttribute("cities",cities);
        model.addAttribute("counties",counties);

        if (ObjectUtils.isEmpty(user)){
            return  "redirect:/user/login";
        }else {
            model.addAttribute("user",user);
            return "person_management";
        }
    }

    /**
     *
     * @description 退出登录跳转到登录界面
     * @author zhangz
     * @date 2020:03:05 15:55:18
     * @param session
     * @return
     **/
    @GetMapping("/user/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return  "redirect:/user/login";
    }



}
