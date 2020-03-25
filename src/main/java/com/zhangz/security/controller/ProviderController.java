package com.zhangz.security.controller;

import com.zhangz.security.model.Address;
import com.zhangz.security.model.Site;
import com.zhangz.security.service.impl.AddressServiceImpl;
import com.zhangz.security.service.impl.SiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/24 19:00
 */
@Controller
public class ProviderController {

    @Autowired
    private AddressServiceImpl addressServiceImpl;
    @Autowired
    private SiteServiceImpl siteServiceImpl;



    /**
     *
     * @description 生产商：跳转到添加基地页面
     * @author zhangz
     * @date 2020:03:24 19:01:45
     * @param model
     * @return
     **/
    @GetMapping("/provider/addSite")
    public String addSite(Model model){
        List<Address> provinces = addressServiceImpl.listOfProvince();
        List<Address> cities = addressServiceImpl.listOfCity();
        List<Address> counties = addressServiceImpl.listOfCountry();
        model.addAttribute("provinces",provinces);
        model.addAttribute("cities",cities);
        model.addAttribute("counties",counties);
        return "provider_site_add";
    }

    /**
     *
     * @description 修改site信息
     * @author zhangz
     * @date 2020:03:24 19:23:41
     * @param siteId
     * @param model
     * @return
     **/
    @GetMapping("/provider/siteModify/{siteId}")
    public String addSite(@PathVariable(name = "siteId") String siteId,
                           Model model){
        Site site = siteServiceImpl.selectById(siteId);
        List<Address> provinces = addressServiceImpl.listOfProvince();
        List<Address> cities = addressServiceImpl.listOfCity();
        List<Address> counties = addressServiceImpl.listOfCountry();
        model.addAttribute("provinces",provinces);
        model.addAttribute("cities",cities);
        model.addAttribute("counties",counties);
        model.addAttribute("site",site);
        return "provider_site_add";
    }

}
