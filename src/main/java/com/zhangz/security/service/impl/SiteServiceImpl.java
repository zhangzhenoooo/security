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
    public boolean insertOrUpdate(Site site) {
        Site dbSite = siteMapper.selectByPrimaryKey(site.getSiteId());
        int affectedRow;
        if (dbSite == null ){
            //insert
            affectedRow = siteMapper.insert(site);
        }else {
            //updateByEmail
            SiteExample siteExample = new SiteExample();
            siteExample.createCriteria()
                    .andSiteIdEqualTo(site.getSiteId());
            affectedRow = siteMapper.updateByExampleSelective(site,siteExample);
        }
        boolean reslut = affectedRow > 0 ? true : false;
        return reslut;
    }

    @Override
    public Site selectById(Long siteId) {
        Site site = siteMapper.selectByPrimaryKey(siteId);
        return site;
    }
}
