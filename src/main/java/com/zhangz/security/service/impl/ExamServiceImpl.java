package com.zhangz.security.service.impl;

import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.enums.ExamTypeEnum;
import com.zhangz.security.mapper.BatchMapper;
import com.zhangz.security.mapper.ExamBatchMapper;
import com.zhangz.security.mapper.ExamExtMapper;
import com.zhangz.security.mapper.ExamMapper;
import com.zhangz.security.model.*;
import com.zhangz.security.service.ExamService;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
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
    @Autowired
    private ExamExtMapper examExtMapper;
    @Autowired
    private ExamBatchMapper examBatchMapper;
    @Autowired
    private BatchMapper batchMapper;
    @Override
    public List<Exam> listByVendorId(String vendorId, String examStatus) {
        ExamExample examExample = new ExamExample();
        ExamExample.Criteria criteria =    examExample.createCriteria();

        if (!StringUtils.isEmpty(examStatus)&&!("".equals(examStatus))){
            criteria.andExamStatusEqualTo(examStatus);
        }
        criteria.andVendorIdEqualTo(vendorId);
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
            exam.setVendorId(productDTO.getVendor());
            exam.setBatchName(productDTO.getBatch().getBatchName());
            exam.setLaunchDate(DateUtil.getData());
            return exam;
        }).collect(Collectors.toList());


//         System.out.println("exam.productId = ========"+exams.get(0).getProductId());
        int affectRow = examExtMapper.insertBatch(exams);

        boolean result = affectRow > 0 ? true : false;
        return result;
    }

    @Override
    public List<Exam> listByExamStatus(String examStatus) {

        List<String> productIds = examExtMapper.selectAllId();
        ExamExample examExample = new ExamExample();
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
    public boolean updateByExamId(Exam exam, String examId) {
        Exam dbExam = examMapper.selectByPrimaryKey(examId);
        if (!ObjectUtils.isEmpty(dbExam)){

            ExamExample example = new ExamExample();
            exam.setBatchId(dbExam.getBatchId());
            List<Exam> exams = examMapper.selectByExample(example);
            boolean examStatus =true;
            for (Exam exam1: exams){
                //判断该批检测的产品若都通过为通过
                if (ExamTypeEnum.APPROVAL_FALSE.equals(exam1.getExamStatus())){
                    examStatus = false;
                }
            }
            if (examStatus){
                //            更新检测批次是否通过
                String examBatchId = dbExam.getExamBatchId();
                ExamBatchExample examBatchExample = new ExamBatchExample();
                examBatchExample.createCriteria()
                        .andBatchIdEqualTo(examBatchId);
                ExamBatch examBatch = new ExamBatch();
                examBatch.setExamStatus(exam.getExamStatus());
                examBatchMapper.updateByExampleSelective(examBatch,examBatchExample);
            //跟新批次是否检测通过
                BatchExample batchExample = new BatchExample();
                examBatchExample.createCriteria()
                        .andBatchIdEqualTo(examBatchId);
                Batch batch = new Batch();
                examBatch.setExamStatus(exam.getExamStatus());
                batchMapper.updateByExampleSelective(batch,batchExample);

            }

            ExamExample examExample = new ExamExample();
            examExample.createCriteria()
                    .andExamIdEqualTo(examId);
            int i = examMapper.updateByExampleSelective(exam, examExample);
            return  i>0 ? true :false;
        }else {
            return false;
        }

    }

    @Override
    public int batchInsert(List<Exam> exams) {
        int i = examExtMapper.insertBatch(exams);
        return i;
    }
}
