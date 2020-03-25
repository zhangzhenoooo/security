package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.ApprovalServiceImpl;
import com.zhangz.security.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 10:59
 */
@Controller
@Slf4j
public class ApprovalController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private ApprovalServiceImpl approvalServiceImpl;

    /**
     *
     * @description 管理员：账号待审批列表
     * @author zhangz
     * @date 2020:03:23 22:03:54
     * @param model
     * @return
     **/
    @GetMapping("/approval/approvalList")
    public String approvalList(Model model) {
        return "admin_account_need_approval_list";
    }

    /**
     *
     * @description 管理员：账号已审批列表
     * @author zhangz
     * @date 2020:03:23 22:03:54
     * @param model
     * @return
     **/
    @GetMapping("/approval/approvedList")
    public String approvedList(Model model) {
        return "admin_account_approved_list";
    }

    /**
     *
     * @description 获取需要审批的用户列表
     * @author zhangz
     * @date 2020:03:24 16:37:09
     * @param map
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/approval/listOfNeedApprove", method = RequestMethod.POST)
    public List<User> listOfNeedApprove(@RequestBody Map<String, Integer> map) {
        List<User> users = userServiceImpl.selectNeedApprove(map.get("userType"));
        return users;
    }

    @ResponseBody
    @RequestMapping(value = "/approval/approve", method = RequestMethod.POST)
    public ResultDTO approve(@RequestParam(name = "userId") String userId,
                             @RequestParam(name = "status") boolean status,
                             HttpSession session) {
        User user = (User) session.getAttribute("user");
        boolean result = approvalServiceImpl.approve(user, userId,status);
        if (result){
            return   ResultDTO.successOf();
        }else {
            return   ResultDTO.errorOf(CustomizeErrorCode.APPROVE_FALSE);
        }
    }

}
