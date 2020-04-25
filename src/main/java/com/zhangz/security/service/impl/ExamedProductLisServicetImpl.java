package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.ExamedproductlistMapper;
import com.zhangz.security.model.Examedproductlist;
import com.zhangz.security.model.ExamedproductlistExample;
import com.zhangz.security.service.ExamedProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/25 9:40
 */
@Service
public class ExamedProductLisServicetImpl implements ExamedProductListService {
    @Autowired
    private ExamedproductlistMapper examedproductlistMapper;

    @Override
    public Examedproductlist selectByKeyWords(String itemId, String siteId, String batchId, String examStatus) {

        ExamedproductlistExample examedExample = new ExamedproductlistExample();
        ExamedproductlistExample.Criteria criteria = examedExample.createCriteria();
        if (!StringUtils.isEmpty(itemId)){
            criteria.andItemIdEqualTo(itemId);
        }
        if (!StringUtils.isEmpty(siteId)){
            criteria.andSiteIdEqualTo(siteId);
        }
        if (!StringUtils.isEmpty(batchId)){
            criteria.andBatchIdEqualTo(batchId);
        }
        if (!StringUtils.isEmpty(examStatus)){
            criteria.andExamStatusEqualTo(examStatus);
        }
        List<Examedproductlist> examedproductlists = examedproductlistMapper.selectByExample(examedExample);
        if (examedproductlists.size() > 0 ){
            return examedproductlists.get(0);
        }else {
            return  new Examedproductlist();
        }
    }
}
