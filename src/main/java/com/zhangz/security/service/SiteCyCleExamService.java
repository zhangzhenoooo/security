package com.zhangz.security.service;

import com.zhangz.security.model.Site;
import com.zhangz.security.model.SiteCycleExam;
import org.w3c.dom.ls.LSInput;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/20 22:21
 */
public interface SiteCyCleExamService {
    int insert(SiteCycleExam cycleExam);
    int updateBySelective(SiteCycleExam siteCycleExam);
    int deleteById(String siteCycleExamId);
    List<SiteCycleExam> listBySiteId(String siteId);
    List<SiteCycleExam> listByExamDate(String fromDate,String toDate);
    List<SiteCycleExam> listBySelective(SiteCycleExam siteCycleExam);
    SiteCycleExam selectLatestSiteCycleExamBySiteId(String siteId);
//    获取最新一次的检测记录
    List<SiteCycleExam> listLatestSiteCycleExamGroupByExamDate();
}
