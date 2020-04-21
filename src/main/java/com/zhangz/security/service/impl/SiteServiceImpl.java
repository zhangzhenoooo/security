package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.AddressMapper;
import com.zhangz.security.mapper.SiteCycleExamMapper;
import com.zhangz.security.mapper.SiteMapper;
import com.zhangz.security.model.*;
import com.zhangz.security.plugin.SnowIdUtils;
import com.zhangz.security.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.thymeleaf.util.StringUtils;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/2/29 16:00
 */
@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteCycleExamMapper siteCycleExamMapper;
    @Autowired
    private SiteCycleExamServiceImpl siteCycleExamServiceImpl;
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
            site.setSiteId(SnowIdUtils.uniqueLongHex());
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

    @Override
    public List<Site> listNeedExamofCycle() {

        Calendar cal=Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(6);
        int month12 = 12;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String d6 = Integer.toString(year+month+day);
        String d12 = Integer.toString(year+month12+day);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
        Date date6 = new Date();
        Date date12 = new Date();
        Date dateNow = new Date();
        Date date6From = new Date();
        Date date6To = new Date();
        Date date12From = new Date();
        Date date12To = new Date();
        try {
             date6 =simpleDateFormat.parse(year+"-06-01");
             date12 =simpleDateFormat.parse(d12);
             dateNow=new Date();
             date6From = simpleDateFormat.parse(year+"-04-01");
            date6From = simpleDateFormat.parse(year+"-04-30");
            date6From = simpleDateFormat.parse(year+"-12-01");
            date6From = simpleDateFormat.parse(year+"-12-01");


        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (!((dateNow.after(date6From)&&dateNow.before(date6To)) || (dateNow.after(date12From)&&dateNow.before(date12To)))){
            //不在检测时间段
            return  new ArrayList<>();
        }
        List<Site> sites = null;
        if (dateNow.after(date6From)&&dateNow.before(date6To)){
            //六月之间
            SiteExample siteExample1 = new SiteExample();
            siteExample1.createCriteria()
                    .andExamDateNotBetween(date6From,date6To);
             sites = siteMapper.selectByExample(siteExample1);
        }
        if ((dateNow.after(date12From)&&dateNow.before(date12To))){
            //12月
            SiteExample siteExample1 = new SiteExample();
            siteExample1.createCriteria()
                    .andExamDateNotBetween(date12From,date12To);
            sites = siteMapper.selectByExample(siteExample1);
        }
        if (sites.size() >0){
            return sites;
        }else {
            return new ArrayList<>();
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
