package com.zhangz.security.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.mapper.BatchMapper;
import com.zhangz.security.mapper.SiteMapper;
import com.zhangz.security.model.*;
import com.zhangz.security.service.impl.ExamServiceImpl;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/3 19:48
 */
@Controller
public class ExamController {

    @Autowired
    private ExamServiceImpl examServiceImpl;
    @Autowired
    private SiteMapper siteMapper;
    @Autowired
    private BatchMapper batchMapper;

    /**
     *
     * @description 送检管理
     * @author zhangz
     * @date 2020:03:03 19:50:03
     * @param model
     * @param session
     * @return
     **/
    @GetMapping("/exam/examManagement")
    public String examManagement(Model model,
                                 HttpSession session){
        User user = (User) session.getAttribute("user");
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andIsDeleteEqualTo(false)
                .andCreatorIdEqualTo(user.getUserId());
        List<Batch> batches = batchMapper.selectByExample(batchExample);
        model.addAttribute("batches",batches) ;

        SiteExample siteExaample = new SiteExample();
        siteExaample.createCriteria()
                .andProducerIdEqualTo(user.getUserId());
        List<Site> sites = siteMapper.selectByExample(siteExaample);
        model.addAttribute("sites",sites) ;
        return "provider_examed_list";
    }


    /**
     *
     * @description 根据生产商和送检状态选择产品信息
     * @author zhangz
     * @date 2020:03:05 13:35:53
     * @param session
     * @param map
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/exam/listByVendorId",method = RequestMethod.POST)
    public List<Exam>listByVendorId(HttpSession session,
                                    @RequestBody Map<String,String> map){
        String examStatus = map.get("examStatus");
        User user = (User) session.getAttribute("user");
        List<Exam> exams = examServiceImpl.listByVendorId(user.getUserId(),examStatus);
        return exams;
    }
    /**
     *
     * @description 检测部门:已检测列表
     * @author zhangz
     * @date 2020:03:04 21:54:57
     * @return
     **/
    @GetMapping("/exam/productManagement")
    public String productManagement(){
        return "examed_product_list";
    }

    /**
     *
     * @description 检测部门：待检测列表
     * @author zhangz
     * @date 2020:03:04 21:54:57
     * @return
     **/
    @GetMapping("/exam/listOfNeedExam")
    public String listOfNeedExam(){
        return "need_exam_product_list";
    }


    /**
     *
     * @description 根据检测状态获取检测数据
     * @author zhangz
     * @date 2020:03:04 17:21:23
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/exam/listByExamStatus",method = RequestMethod.POST)
    public List<Exam>listByExamStatus( @RequestBody Map<String,String> map){

        String examStatus = map.get("examStatus");
        List<Exam> exams = examServiceImpl.listByExamStatus(examStatus);
        return exams;
    }


    @ResponseBody
    @PostMapping("/exam/approve")
    public ResultDTO approve(@RequestParam(name = "examId") String examId,
                             @RequestParam(name = "examStatus") String examStatus,
                             HttpSession session){
        User user = (User) session.getAttribute("user");
        Exam exam = new Exam();
        exam.setExamerId(user.getUserId());
        exam.setExamStatus(examStatus);
        exam.setExamDate(DateUtil.getData());
        boolean affectRow = examServiceImpl.updateByExamId(exam, examId);
        if (affectRow){
            return  ResultDTO.successOf();
        }else {
            return  ResultDTO.errorOf(CustomizeErrorCode.APPROVE_FALSE);
        }

    }

    /**
     *
     * @description  添加送检产品
     * @author zhangz
     * @date 2020:03:04 11:03:32
     * @param
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/exam/insertExams",method = RequestMethod.POST)
    public ResultDTO  insertExams(@RequestBody String productList){
        ArrayList<ProductDTO> productDTOS  =
                JSON.parseObject(productList, new TypeReference<ArrayList<ProductDTO>>(){});
        boolean result = examServiceImpl.insertExams(productDTOS);
        if (result){
            return  ResultDTO.successOf();
        }else {
            return  ResultDTO.errorOf(CustomizeErrorCode.EXAM_INSERT_FALSE);
        }
    }

    /**
     *
     * @description  跳转生产商添加将要送去检测到的检测产品信息页面
     * @author zhangz
     * @date 2020:03:07 14:45:10
     * @param model
     * @param session
     * @return
     **/
    @GetMapping("/exam/andExamProduct")
    public String andExamProduct(Model model,
                                 HttpSession session){
        User user = (User) session.getAttribute("user");
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andIsDeleteEqualTo(false)
                .andCreatorIdEqualTo(user.getUserId());
        List<Batch> batches = batchMapper.selectByExample(batchExample);
        model.addAttribute("batches",batches) ;

        SiteExample siteExaample = new SiteExample();
        siteExaample.createCriteria()
                .andProducerIdEqualTo(user.getUserId());
        List<Site> sites = siteMapper.selectByExample(siteExaample);
        model.addAttribute("sites",sites) ;
        return "provider_add_examproduct";
    }



}
