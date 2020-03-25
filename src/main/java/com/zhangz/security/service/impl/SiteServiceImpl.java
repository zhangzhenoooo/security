package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.AddressMapper;
import com.zhangz.security.mapper.SiteMapper;
import com.zhangz.security.model.Address;
import com.zhangz.security.model.AddressExample;
import com.zhangz.security.model.Site;
import com.zhangz.security.model.SiteExample;
import com.zhangz.security.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
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
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List list(String LoginUserId, Integer type) {
        SiteExample siteExample = new SiteExample();
        List<Site> sites = siteMapper.selectByExample(siteExample);
        return sites;
    }

    @Override
    public boolean insertOrUpdate(Site site) {
        Site dbSite = siteMapper.selectByPrimaryKey(site.getSiteId());
        List<String> ids = new ArrayList<>();
        ids.add(site.getProvinceCode());
        ids.add(site.getCityCode());
        ids.add(site.getCountyCode());

        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria()
                .andIdIn(ids);
        List<Address> addresses = addressMapper.selectByExample(addressExample);
        for (Address address:addresses){
            if (address.getId().equals(site.getProvinceCode())){
                site.setProvinceName(address.getName());
            }else if (address.getId().equals(site.getCityCode())){
                site.setCityName(address.getName());
            }else  if (site.getCountyCode().equals(address.getId())){
                site.setCountyName(address.getName());
            }
        }

        int affectedRow;
        if (dbSite == null ){
            //insertORUpdate
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
    public Site selectById(String siteId) {
        Site site = siteMapper.selectByPrimaryKey(siteId);
        return site;
    }

    @Override
    public List<Site> listByExamStatus(String examStatus) {
        SiteExample siteExample = new SiteExample();
//        System.out.println("exam==============="+examStatus);
        if (!StringUtils.isEmpty(examStatus)&&!("".equals(examStatus))){
            siteExample.createCriteria()
                    .andExamStatusEqualTo(examStatus);
        }
        List<Site> sites = siteMapper.selectByExample(siteExample);
        if (sites.size() == 0 ){
            return  new ArrayList<>();
        }else {
            return sites;

        }
    }

    @Override
    public boolean updateBySiteId(Site site, String siteId) {
        SiteExample siteExample = new SiteExample();
        siteExample.createCriteria()
                .andSiteIdEqualTo(siteId);
        int i = siteMapper.updateByExampleSelective(site, siteExample);
        return  i>0 ? true :false;
    }

    @Override
    public List<Site> listBySelective(Site site) {

        SiteExample siteExample = getSelectiveExample(site);
        List<Site> sites = siteMapper.selectByExample(siteExample);
        if (sites.size() == 0 ){
            return  new ArrayList<>();
        }else {
            return sites;

        }

    }

    /**
     *
     * @description  根据多条件查询site信息，属性为空就调过
     * @author zhangz
     * @date 2020:03:05 14:38:54
     * @param site
     * @return
     **/
    private SiteExample getSelectiveExample(Site site){
        SiteExample siteExample = new SiteExample();
        SiteExample.Criteria criteria = siteExample.createCriteria();
        if (!ObjectUtils.isEmpty(site.getSiteId())){
            //id
           criteria.andSiteIdEqualTo(site.getSiteId());
        }
        if (!ObjectUtils.isEmpty(site.getExamStatus())){
            //审批状态
            criteria.andExamStatusEqualTo(site.getExamStatus());
        }
        if (!ObjectUtils.isEmpty(site.getProducerId())){
            //生产商
            criteria.andProducerIdEqualTo(site.getProducerId());
        }
        if (!ObjectUtils.isEmpty(site.getSiteName())){
            criteria.andSiteNameEqualTo(site.getSiteName());
        }
        return siteExample;
    }
}
