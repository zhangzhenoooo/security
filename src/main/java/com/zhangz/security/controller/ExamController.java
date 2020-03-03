package com.zhangz.security.controller;

import com.zhangz.security.model.Exam;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.ExamServiceImpl;
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
 * @date 2020/3/3 19:48
 */
@Controller
public class ExamController {

    @Autowired
    private ExamServiceImpl examServiceImpl;

    /**
     *
     * @description 送件管理
     * @author zhangz
     * @date 2020:03:03 19:50:03
     * @param model
     * @param session
     * @return
     **/
    @GetMapping("/exam/examManagement")
    public String examManagement(Model model,
                                 HttpSession session){
        return "exam_management";
    }


    @ResponseBody
    @RequestMapping(value = "/exam/listByVendorId",method = RequestMethod.POST)
    public List<Exam>listByVendorId(HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Exam> exams = examServiceImpl.listByVendorId(user.getUserId());
        return exams;
    }

}
