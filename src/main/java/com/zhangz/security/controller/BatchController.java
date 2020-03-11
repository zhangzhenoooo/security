package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Batch;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.BatchServiceImpl;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/7 17:47
 */
@Controller
public class BatchController {

    @Autowired
    private BatchServiceImpl batchServiceImpl;

@GetMapping("/batch/batchManagement")
    public String batchManagement(Model model,
                                  HttpSession session){
        return "batch_management";
    }

    /**
     *
     * @description 新增
     * @author zhangz
     * @date 2020:03:07 17:58:45
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/batch/insertBatch",method = RequestMethod.POST)
    public ResultDTO insertBatch(@RequestParam(name = "batchId",required = false) Long batchId,
                                 @RequestParam(name = "batchName") String batchName,
                                 @RequestParam(name = "description") String description,
                                 HttpSession session){
        User user = (User) session.getAttribute("user");

        Batch batch = new Batch();
        batch.setBatchId(batchId);
        batch.setBatchName(batchName);
        batch.setDescription(description);
        batch.setCreateDate(DateUtil.getData());
        batch.setModifyDate(DateUtil.getData());
        batch.setCreatorId(user.getUserId());
        batch.setIsDelete(false);
        int insert = batchServiceImpl.insert(batch);
        if (insert > 0){
            return ResultDTO.successOf();
        }else {
            return ResultDTO.errorOf(CustomizeErrorCode.ITEM_INSERT_FALSE);
        }
    }


    @ResponseBody
    @RequestMapping(value = "/batch/listByCreatorId",method = RequestMethod.POST)
    public List<Batch> list(HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Batch> batchList = batchServiceImpl.listByCreatorId(user.getUserId());
        return batchList;
    }

    @ResponseBody
    @RequestMapping("/batch/getBatchById")
    public  Batch getBatchById(@PathVariable (name = "batchId") Long batchId){
        Batch batch = batchServiceImpl.selectById(batchId);
        return batch;
    }


}
