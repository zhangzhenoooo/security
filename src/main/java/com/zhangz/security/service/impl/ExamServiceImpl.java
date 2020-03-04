package com.zhangz.security.service.impl;

import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.mapper.ExamMapper;
import com.zhangz.security.model.Exam;
import com.zhangz.security.model.ExamExample;
import com.zhangz.security.model.Product;
import com.zhangz.security.service.ExamService;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.DateUtils;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
    public List<Exam> listByVendorId(Long vendorId,String examStatus) {
        ExamExample examExample = new ExamExample();
        examExample.createCriteria()
                .andVendorIdEqualTo(vendorId);
        if (!StringUtils.isEmpty(examStatus)&&!("".equals(examStatus))){
            examExample.createCriteria()
                    .andExamStatusEqualTo(examStatus);
        }
        List<Exam> exams = examMapper.selectByExample(examExample);
        if (exams.size() == 0 ){
            return  new ArrayList<>();
        }else {
            return exams;
        }
    }

    @Override
    public boolean insertExams(List<ProductDTO> productDTOS) {
        List<Exam> exams = productDTOS.stream().map(productDTO -> {
            Exam exam = new Exam();
            BeanUtils.copyProperties(productDTO,exam);
            exam.setLaunchDate(DateUtil.getData());
            return exam;
        }).collect(Collectors.toList());


//         System.out.println("exam.productId = ========"+exams.get(0).getProductId());
        int affectRow = examMapper.insertBatch(exams);

        boolean result = affectRow > 0 ? true : false;
        return result;
    }

    @Override
    public List<Exam> listByExamStatus(String examStatus) {
        ExamExample examExample = new ExamExample();
//        System.out.println("exam==============="+examStatus);
        if (!StringUtils.isEmpty(examStatus)&&!("".equals(examStatus))){
            examExample.createCriteria()
                    .andExamStatusEqualTo(examStatus);
        }
        List<Exam> exams = examMapper.selectByExample(examExample);
        if (exams.size() == 0 ){
            return  new ArrayList<>();
        }else {
            return exams;

        }
    }

    @Override
    public boolean updateByExamId(Exam exam, Long examId) {
        ExamExample examExample = new ExamExample();
        examExample.createCriteria()
                .andExamIdEqualTo(examId);
        int i = examMapper.updateByExampleSelective(exam, examExample);
        return  i>0 ? true :false;
    }
}
