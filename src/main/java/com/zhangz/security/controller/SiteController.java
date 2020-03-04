package com.zhangz.security.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Item;
import com.zhangz.security.model.Site;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.ItemServiceImpl;
import com.zhangz.security.service.impl.SiteServiceImpl;
import com.zhangz.security.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/2/29 12:40
 */
@Controller
@Slf4j
public class SiteController {

    @Autowired
    private SiteServiceImpl siteServiceImpl;
    @Autowired
    private  ItemServiceImpl itemServiceImpl;

    @GetMapping("/site/siteManagement")
    public String baseManagement(){
        return "base_management";
    }


    @GetMapping("/site/siteDetails/{siteId}")
    public String siteDetails(Model model,
                              @PathVariable (name = "siteId")Long siteId){
        Site site = siteServiceImpl.selectById(siteId);
        model.addAttribute("site",site);
        return "site_details";
    }


    @ResponseBody
    @RequestMapping(value = "/site/siteList",method = RequestMethod.POST)
    public List<Site> baseList(HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Site> sites = siteServiceImpl.list(user.getUserId(), user.getType());
//        System.out.println("sites ==============="+sites.size());
        return sites;
    }

    @ResponseBody
    @RequestMapping(value = "/site/insertOrUpdate",method = RequestMethod.POST)
    public ResultDTO insertOrUpdate(@RequestParam(name = "siteId",required = false) Long siteId,
                                    @RequestParam(name = "siteName") String siteName,
                                    @RequestParam(name = "address") String address,
                                    HttpSession session){
        User user = (User)session.getAttribute("user");
        Site site = new Site();
        site.setSiteId(siteId);
        site.setAddress(address);
        site.setSiteName(siteName);
        site.setProducerId(user.getUserId());
        site.setIsDelete(false);
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

    /**
     *
     * @description 跳转到场地监管界面
     * @author zhangz
     * @date 2020:03:04 20:22:05
     * @return
     **/
    @GetMapping("/site/supervise")
    public String  supervise(){
        return "site_supervise";
    }

    /**
     *
     * @description 根据检测状态获取检测数据
     * @author zhangz
     * @date 2020:03:04 17:21:23
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/site/listByExamStatus",method = RequestMethod.POST)
    public List<Site>listByExamStatus( @RequestBody Map<String,String> map){

        String examStatus = map.get("examStatus");
        List<Site> sites = siteServiceImpl.listByExamStatus(examStatus);
        return sites;
    }

    @ResponseBody
    @PostMapping("/site/approve")
    public ResultDTO approve(@RequestParam(name = "siteId")Long siteId,
                             @RequestParam(name = "examStatus") String examStatus,
                             HttpSession session){
        User user = (User) session.getAttribute("user");
        Site site = new Site();
        site.setExamStatus(examStatus);
        site.setExamDate(DateUtil.getData());
        site.setVerifier(user.getUserId());
        boolean affectRow = siteServiceImpl.updateBySiteId(site, siteId);
        if (affectRow){
            return  ResultDTO.successOf();
        }else {
            return  ResultDTO.errorOf(CustomizeErrorCode.APPROVE_FALSE);
        }

    }

}
