package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.SiteMapper;
import com.zhangz.security.model.Site;
import com.zhangz.security.model.SiteExample;
import com.zhangz.security.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/2/29 16:00
 */
@Service
public class SiteServiceImpl implements SiteService {

    @Autowired
    private  SiteMapper siteMapper;

    @Override
    public List list(Long LoginUserId, Integer type) {
        SiteExample siteExample = new SiteExample();
        List<Site> sites = siteMapper.selectByExample(siteExample);
        return sites;
    }

    @Override
    public boolean insert(Site site) {
       int affectedRow =  siteMapper.insert(site);
        boolean reslut = affectedRow > 0 ? true : false;
        return reslut;
    }
}
