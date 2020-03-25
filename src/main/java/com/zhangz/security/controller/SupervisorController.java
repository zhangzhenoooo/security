package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Kindlist;
import com.zhangz.security.service.impl.KindListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/25 14:05
 */
@Controller
public class SupervisorController {
    @Autowired
    private KindListServiceImpl kindListServiceImpl;
    /**
     *
     * @description  供应商;添加检测食品
     * @author zhangz
     * @date 2020:03:23 22:19:03
     * @param model
     * @return
     **/
    @GetMapping("/supervisor/examAddProduct")
    public String addExamProduct(Model model){
        return "supervisor_exam_add_product";
    }

    /**
     *
     * @description
     * @author zhangz
     * @date 2020:03:24 20:19:03
     * @param kindListId
     * @param model
     * @return
     **/
    @GetMapping("/supervisor/examAddProduct/{kindListId}")
    public String addExamProduct(@PathVariable(name = "kindListId") String kindListId,
                                 Model model){
        Kindlist kindlist = kindListServiceImpl.selectById(kindListId);
        model.addAttribute("kind",kindlist);
        return "supervisor_exam_add_product";
    }

    /**
     *
     * @description 检测机构添加新的检测食品名单
     * @author zhangz
     * @date 2020:03:24 20:16:38
     * @param kindId
     * @param kindName
     * @param description
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/supervisor/doExamAddProduct",method = RequestMethod.POST)
    public ResultDTO doExamAddProduct(@RequestParam(name = "kindId",defaultValue = "0") String kindId,
                                      @RequestParam(name = "kindName") String kindName,
                                      @RequestParam(name = "description") String description){

        Kindlist kindlist = new Kindlist();
        kindlist.setKindId(kindId);
        kindlist.setKindName(kindName);
        kindlist.setDescription(description);
        kindlist.setIsDelete(false);
        int inser = kindListServiceImpl.insetOrUpdate(kindlist);
        if (inser > 0){
            return ResultDTO.successOf();
        }else {
            return ResultDTO.errorOf(CustomizeErrorCode.INSERT_FALSE);
        }

    }

    /**
     *
     * @description  供应商;检测食品菜单列表
     * @author zhangz
     * @date 2020:03:23 22:19:03
     * @param model
     * @return
     **/
    @GetMapping("/supervisor/examProductMenu")
    public String examProductMenu(Model model){
        return "supervisor_exam_product_list";
    }


    @ResponseBody
    @RequestMapping(value = "/supervisor/getKindList",method = RequestMethod.POST)
    public List<Kindlist> getKindList(){
        List<Kindlist> list = kindListServiceImpl.list();
        return list;
    }
}
