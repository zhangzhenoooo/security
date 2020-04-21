package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.NotificationExtMapper;
import com.zhangz.security.mapper.NotificationMapper;
import com.zhangz.security.model.Notification;
import com.zhangz.security.model.NotificationExample;
import com.zhangz.security.plugin.SnowIdUtils;
import com.zhangz.security.service.NotificationService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/24 15:12
 */
@Service
public class NotificationServieImpl implements NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;
    @Autowired
    private NotificationExtMapper NotificationExampleMapper;

    @Override
    public int insertORUpdate(Notification notification) {
        int insert = 0;
        if (ObjectUtils.isEmpty(notification.getNotificationId())){
            notification.setNotificationId(SnowIdUtils.uniqueLongHex());
             insert = notificationMapper.insert(notification);
        }else {
            Notification dbNotication = selectById(notification.getNotificationId());
            if (ObjectUtils.isEmpty(dbNotication)){
                notification.setNotificationId(SnowIdUtils.uniqueLongHex());
                insert = notificationMapper.insert(notification);
            }else {
                NotificationExample notificationExample = new NotificationExample();
                notificationExample.createCriteria()
                        .andNotificationIdEqualTo(notification.getNotificationId());
                insert = notificationMapper.updateByExampleSelective(notification, notificationExample);
            }
        }
        return insert;
    }

    @Override
    public List<Notification> list() {
        NotificationExample notificationExample = new NotificationExample();
        notificationExample.createCriteria()
                .andIsDeleteEqualTo(false);
        List<Notification> notifications = notificationMapper.selectByExample(notificationExample);
        return notifications;
    }

    @Override
    public Notification selectById(String id) {
        NotificationExample notificationExample = new NotificationExample();
        notificationExample.createCriteria()
                .andNotificationIdEqualTo(id)
                .andIsDeleteEqualTo(false);
        List<Notification> notifications = notificationMapper.selectByExample(notificationExample);
        if (notifications.size() > 0 ){
            return notifications.get(0);
        }else{
            return new Notification();
        }
    }

    @Override
    public List<Notification> listByExampleSelective(Notification notification) {
        NotificationExample notificationExample = new NotificationExample();
        NotificationExample.Criteria criteria = notificationExample.createCriteria();
        if (!ObjectUtils.isEmpty(notification.getNotificationId())){
            criteria.andNotificationIdEqualTo(notification.getNotificationId());
        }
        if (!ObjectUtils.isEmpty(notification.getNotificationName())){
            criteria.andNotificationNameEqualTo(notification.getNotificationName());
        }
        List<Notification> notifications = notificationMapper.selectByExample(notificationExample);
        return notifications;
    }

    @Override
    public List<Notification> listOfLatest(int limitedNum) {
        int pageIndex=1,pageSize=limitedNum;
        RowBounds rowBounds=new RowBounds((pageIndex-1)*pageSize,pageSize);

        NotificationExample notificationExample = new NotificationExample();
        notificationExample.createCriteria()
                .andIsDeleteEqualTo(false);
        List<Notification> notifications = notificationMapper.selectByExampleWithRowbounds(notificationExample, rowBounds);
        List<Notification> notifications1 = notificationMapper.selectByExample(notificationExample);

        if (notifications.size() <= 0 ){
            return new ArrayList<>();
        }else {
            return notifications;
        }

    }
}
