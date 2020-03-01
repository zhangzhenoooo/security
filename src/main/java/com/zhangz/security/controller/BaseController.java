package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Site;
import com.zhangz.security.service.impl.SiteServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/2/29 12:40
 */
@Controller
@Slf4j
public class BaseController {

    @Autowired
    private SiteServiceImpl siteServiceImpl;

    @GetMapping("/site/siteManagement")
    public String baseManagement(){
        return "base_management";
    }

    @ResponseBody
    @RequestMapping(value = "/site/siteList",method = RequestMethod.POST)
    public List<Site> baseList(){
        List<Site> sites = siteServiceImpl.list(1L, 1);
//        System.out.println("sites ==============="+sites.size());
        return sites;
    }

    @ResponseBody
    @RequestMapping(value = "/site/insertOrUpdate",method = RequestMethod.POST)
    public ResultDTO insertOrUpdate(@RequestParam(name = "siteId",required = false) Long siteId,
                                    @RequestParam(name = "siteName") String siteName,
                                    @RequestParam(name = "address") String address){

        Site site = new Site();
        site.setSiteId(siteId);
        site.setAddress(address);
        site.setSiteName(siteName);
        boolean result = siteServiceImpl.insertOrUpdate(site);
        if (result){
            return ResultDTO.successOf();
        }else {
            return ResultDTO.errorOf(CustomizeErrorCode.SITE_INSERT_FALSE);
        }
    }
    @ResponseBody
    @RequestMapping(value = "site/{siteId}",method = RequestMethod.GET)
    public Site selectById(@PathVariable(name = "siteId") Long siteId,
                           Model model){
        Site site = siteServiceImpl.selectById(siteId);
        return site;
    }

}
