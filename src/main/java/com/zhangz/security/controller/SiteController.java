package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.enums.ExamTypeEnum;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Kindlist;
import com.zhangz.security.model.Site;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.ItemServiceImpl;
import com.zhangz.security.service.impl.KindListServiceImpl;
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
    @Autowired
    private KindListServiceImpl  kindListServiceImpl;

    @GetMapping("/site/siteManagement")
    public String baseManagement(){
        return "base_management";
    }


    @GetMapping("/site/siteDetails/{siteId}")
    public String siteDetails(Model model,
                              @PathVariable (name = "siteId") String siteId){
        Site site = siteServiceImpl.selectById(siteId);
        List<Kindlist> kinds = kindListServiceImpl.list();

        model.addAttribute("site",site);
        model.addAttribute("kinds",kinds);
        return "site_details";
    }


    /**
     *
     * @description 厂商根据一定条件删选自己的块地
     * @author zhangz
     * @date 2020:03:05 14:16:43
     * @param session
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/site/listByVendor",method = RequestMethod.POST)
    public List<Site> listByVendor(HttpSession session,
                                   @RequestBody Map<String,String> map){
        User user = (User) session.getAttribute("user");
        String examStatus = map.get("ExamStatus");
        Site site = new Site();
        site.setProducerId(user.getUserId());
        site.setExamStatus(examStatus);
        List<Site> sites = siteServiceImpl.listBySelective(site);
        return sites;
    }


    @ResponseBody
    @RequestMapping(value = "/site/insertOrUpdate",method = RequestMethod.POST)
    public ResultDTO insertOrUpdate(@RequestParam(name = "siteId",required = false) String siteId,
                                    @RequestParam(name = "siteName") String siteName,
                                    @RequestParam(name = "province")String province,
                                    @RequestParam(name = "city") String city,
                                    @RequestParam(name = "county") String county,
                                    @RequestParam(name = "address") String address,
                                    HttpSession session){
        User user = (User)session.getAttribute("user");
        Site site = new Site();
        site.setSiteId(siteId);
        site.setProvinceCode(province);
        site.setCityCode(city);
        site.setCountyCode(county);
        site.setAddress(address);
        site.setSiteName(siteName);
        site.setProducerId(user.getUserId());
        site.setProvinceName(user.getUserName());
        site.setExamStatus(ExamTypeEnum.NOT_APPROVAL.getStatus());
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
    public Site selectById(@PathVariable(name = "siteId") String siteId,
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
     * @description 检测人员根据检测状态获取site数据
     * @author zhangz
     * @date 2020:03:04 17:21:23
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/site/listByExamStatus",method = RequestMethod.POST)
    public List<Site>listByExamStatus( @RequestBody Map<String,String> map){
        String examStatus = map.get("examStatus");
        Site site = new Site();
        site.setExamStatus(examStatus);
        List<Site> sites = siteServiceImpl.listBySelective(site);
        return sites;
    }

    @ResponseBody
    @PostMapping("/site/approve")
    public ResultDTO approve(@RequestParam(name = "siteId") String siteId,
                             @RequestParam(name = "examStatus") String examStatus,
                             HttpSession session){
        User user = (User) session.getAttribute("user");
        Site site = new Site();
        site.setExamStatus(examStatus);
        site.setExamDate(DateUtil.getData());
        site.setVerifier(user.getUserId());
        site.setVerifiername(user.getUserName());
        boolean affectRow = siteServiceImpl.updateBySiteId(site, siteId);
        if (affectRow){
            return  ResultDTO.successOf();
        }else {
            return  ResultDTO.errorOf(CustomizeErrorCode.APPROVE_FALSE);
        }

    }
    /**
     *
     * @description 管理员:待审批基地列表
     * @author zhangz
     * @date 2020:03:23 21:58:52
     * @param model
     * @return
     **/
    @GetMapping("/site/siteNeedApproveList")
    public String siteNeedApproveList(Model model){
        return "admin_site_need_approve";
    }

    /**
     *
     * @description 管理员:已审批基地列表
     * @author zhangz
     * @date 2020:03:23 21:58:52
     * @param model
     * @return
     **/
    @GetMapping("/site/siteApprovedList")
    public String siteApprovedList(Model model){
        return "admin_site_approved_list";
    }

    /**
     *
     * @description 管理员:添加基地
     * @author zhangz
     * @date 2020:03:23 21:58:52
     * @param model
     * @return
     **/
    @GetMapping("/site/addSite")
    public String addSite(Model model){
        return "provider_site_add";
    }




}
