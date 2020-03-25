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

    @GetMapping("/approval/approvalList")
    public String approvalList(Model model) {
//        //获取待审批账号
//        List<User> users = userServiceImpl.selectNeedApprove( UserStatusEnum.DELETED_OR_NOT_APPROVED.isDelete());
//        List<User> producers = new ArrayList<>();
//        List<User> checkers = new ArrayList<>();
//        for (User user:users){
////            根据账号类型分类：1 生产商 2检测部门
//            if (UserTypeEnum.PRODUCER.equals(user.getType())){
//                //producer
//                producers.add(user);
//            }
//            if (UserTypeEnum.DETECTION.equals(user.getType())){
//                checkers.add(user);
//            }
//        }
//        model.addAttribute("producers",producers);
//        model.addAttribute("checkers",checkers);
        return "approval_management";
    }

    @ResponseBody
    @RequestMapping(value = "/approval/list", method = RequestMethod.POST)
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
