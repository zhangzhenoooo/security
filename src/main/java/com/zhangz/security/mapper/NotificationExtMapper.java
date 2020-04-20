package com.zhangz.security.mapper;

import com.zhangz.security.model.Notification;
import com.zhangz.security.model.NotificationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface NotificationExtMapper {

    int insert(Notification record);

}