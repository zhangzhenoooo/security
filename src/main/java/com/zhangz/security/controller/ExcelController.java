package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/10 13:54
 */
public class ExcelController {


    /**
     * 表格导入
     * @description
     * @author zhangz
     * @date 2020:03:11 09:14:52
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/execl/import",method = RequestMethod.POST)
    public ResultDTO excelImport(){
        return  ResultDTO.successOf();
    }

}
