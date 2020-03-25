package com.zhangz.security.service;

import com.zhangz.security.model.Notification;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/24 15:09
 */
public interface NotificationService {

    int insertORUpdate(Notification notification);
    List<Notification> list();
    Notification selectById(String id);
    List<Notification> listByExampleSelective(Notification notification);
}
