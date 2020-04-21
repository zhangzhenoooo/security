package com.zhangz.security.mapper;

import com.zhangz.security.model.SiteCycleExam;
import com.zhangz.security.model.SiteCycleExamExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SiteCycleExamExtMapper {
    //    获取最新一次的检测记录
    List<SiteCycleExam> listLatestSiteCycleExamGroupByExamDate();
}