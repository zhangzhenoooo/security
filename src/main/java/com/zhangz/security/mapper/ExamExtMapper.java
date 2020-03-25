package com.zhangz.security.mapper;

import com.zhangz.security.model.Exam;

import java.util.List;

public interface ExamExtMapper {

    List<String> selectAllId();
    int insertBatch(List<Exam> record);

}