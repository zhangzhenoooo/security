package com.zhangz.security.service;

import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.model.Exam;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/3 19:59
 */
public interface ExamService {

    List<Exam> listByVendorId(String vendorId, String examStatus);
    boolean  insertExams(List<ProductDTO> productDTOS);

    List<Exam> listByExamStatus(String examStatus);

    boolean updateByExamId(Exam exam, String examId);

    int batchInsert(List<Exam> exams);
}
