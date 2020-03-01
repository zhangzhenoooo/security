package com.zhangz.security.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/1 20:12
 */
public class DateUtil {

    /**
     *
     * @description 获取当前日期 yyyy:MMM:dd
     * @author zhangz
     * @date 2020:03:01 20:14:54
     * @return date
     **/
    public static Date getData(){
        Instant localDate =  LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(localDate);
        return date;
    }
}
