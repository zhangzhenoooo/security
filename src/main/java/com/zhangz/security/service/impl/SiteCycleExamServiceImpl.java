package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.SiteCycleExamExtMapper;
import com.zhangz.security.mapper.SiteCycleExamMapper;
import com.zhangz.security.model.SiteCycleExam;
import com.zhangz.security.model.SiteCycleExamExample;
import com.zhangz.security.plugin.SnowIdUtils;
import com.zhangz.security.service.SiteCyCleExamService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/20 22:34
 */
@Service
public class SiteCycleExamServiceImpl implements SiteCyCleExamService {

    @Autowired
    private SiteCycleExamMapper siteCycleExamMapper;
    @Autowired
    private SiteCycleExamExtMapper siteCycleExamExtMapper;

    @Override
    public int insert(SiteCycleExam cycleExam) {
        cycleExam.setSiteCycleExamId(SnowIdUtils.uniqueLongHex());
        int insert = siteCycleExamMapper.insert(cycleExam);
        return insert;
    }

    @Override
    public int updateBySelective(SiteCycleExam siteCycleExam) {
        return 0;
    }

    @Override
    public int deleteById(String siteCycleExamId) {
        int i = siteCycleExamMapper.deleteByPrimaryKey(siteCycleExamId);
        return i;
    }

    @Override
    public List<SiteCycleExam> listBySiteId(String siteId) {
        SiteCycleExamExample siteCycleExamExample = new SiteCycleExamExample();
        siteCycleExamExample.createCriteria()
                .andSiteIdEqualTo(siteId);
        List<SiteCycleExam> siteCycleExams = siteCycleExamMapper.selectByExample(siteCycleExamExample);
        if (siteCycleExams.size() > 0){
            return siteCycleExams;
        }else {
            return new ArrayList<>();
        }

    }

    @Override
    public List<SiteCycleExam> listByExamDate(String fromDate, String toDate) {
        SiteCycleExamExample siteCycleExamExample = new SiteCycleExamExample();
        siteCycleExamExample.createCriteria()
                .andExamDateBetween(getDateOfYYMMDD(fromDate),getDateOfYYMMDD(toDate));
        List<SiteCycleExam> siteCycleExams = siteCycleExamMapper.selectByExample(siteCycleExamExample);
        if (siteCycleExams.size() > 0){
            return siteCycleExams;
        }else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<SiteCycleExam> listBySelective(SiteCycleExam siteCycleExam) {
        return null;
    }

    @Override
    public SiteCycleExam selectLatestSiteCycleExamBySiteId(String siteId) {
        SiteCycleExamExample siteCycleExamExample = new SiteCycleExamExample();
        siteCycleExamExample.createCriteria()
                .andSiteIdEqualTo(siteId);
        List<SiteCycleExam> siteCycleExams = siteCycleExamMapper.selectByExample(siteCycleExamExample);
        if (siteCycleExams.size() > 0){
            siteCycleExams = siteCycleExams.stream().sorted(Comparator.comparing(SiteCycleExam::getExamDate).reversed()).collect(Collectors.toList());//根据时间倒排
            return siteCycleExams.get(0);
        }else {
            return new SiteCycleExam();
        }
    }

    @Override
    public List<SiteCycleExam> listLatestSiteCycleExamGroupByExamDate() {

        List<SiteCycleExam> siteCycleExams = siteCycleExamExtMapper.listLatestSiteCycleExamGroupByExamDate();
        if (siteCycleExams.size() >0){
            return siteCycleExams;
        }else {
            return new ArrayList<>();
        }

    }

    private Date getDateOfYYMMDD(String date){
        Date d = new Date();
        try {
             d = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return d;
    }
}
