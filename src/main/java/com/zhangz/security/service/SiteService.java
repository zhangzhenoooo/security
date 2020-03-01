package com.zhangz.security.service;

import com.zhangz.security.model.Site;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/2/29 15:48
 */
@Service
public interface SiteService {
    /**
     *
     * @description 根据当前用户以及用户类型返回site信息
     * @author zhangz
     * @date 2020:02:29 15:57:18
     * @param LoginUserId
     * @param type
     * @return list
     **/
        List<Site> list(Long LoginUserId, Integer type) ;
        //添加新场地
        boolean insertOrUpdate(Site site);
        //根据id获取site信息
        Site selectById(Long siteId);

}