package com.zhangz.security.controller;

import com.zhangz.security.model.Notification;
import com.zhangz.security.service.impl.NotificationServieImpl;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/23 21:52
 */
@Controller
public class NotificationController {

    @Autowired
    private NotificationServieImpl notificationServieImpl;
    /**
     *
     * @description 管理员：跳转添加公告
     * @author zhangz
     * @date 2020:03:23 21:54:04
     * @param model
     * @return
     **/
    @GetMapping("/notification/addNotification")
    public String addNotification(Model model){
        return "admin_add_notification";
    }

    @GetMapping("/notification/addNotification/{notificationId}")
    public String addNotification(@PathVariable(name = "notificationId") String notificationId,
                                  Model model){
        Notification notification = notificationServieImpl.selectById(notificationId);
        model.addAttribute("notification",notification);
        return "admin_add_notification";
    }

    /**
     *
     * @description 管理员：公告列表
     * @author zhangz
     * @date 2020:03:23 21:54:04
     * @param model
     * @return
     **/
    @GetMapping("/notification/notificationList")
    public String notificationList(Model model){
        return "admin_notification_list";
    }
   /**
    *
    * @description 管理员：添加公告
    * @author zhangz
    * @date 2020:03:24 15:05:36
    * @param notification
    * @return
    **/
    @GetMapping("/notification/doAddNotification")
    public String doAddNotification(Notification notification,
                                    Model model){
        notification.setCreateDate(DateUtil.getData());
        notification.setModifyDate(DateUtil.getData());
        notification.setIsDelete(false);
        int affectRows = notificationServieImpl.insertORUpdate(notification);
        if (affectRows <= 0){
            model.addAttribute("notification",notification);
            model.addAttribute("message","添加失败");

        }else {
            model.addAttribute("message","添加成功");
        }
        return "admin_add_notification";

    }

    /**
     *
     * @description 获取所有的公告信息
     * @author zhangz
     * @date 2020:03:24 15:36:28
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/notification/getList",method = RequestMethod.POST)
    public List<Notification> getList(){
        List<Notification> list = notificationServieImpl.list();
        return list;
    }
}
