package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.ExamMapper;
import com.zhangz.security.model.Exam;
import com.zhangz.security.model.ExamExample;
import com.zhangz.security.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/3 20:03
 */
@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Override
    public List<Exam> listByVendorId(Long vendorId) {
        ExamExample examExample = new ExamExample();
        examExample.createCriteria()
                .andVendorIdEqualTo(vendorId);
        List<Exam> exams = examMapper.selectByExample(examExample);
        if (exams.size() == 0 ){
            return  new ArrayList<>();
        }else {
            return exams;
        }
    }
}
