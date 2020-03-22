package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.model.Address;
import com.zhangz.security.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/22 15:12
 */
@Controller
public class AddressController {

    @Autowired
    private AddressServiceImpl addressServiceImpl;


    @ResponseBody
    @RequestMapping(value = "/address/getAddressListByParentId",method = RequestMethod.POST)
    public ResultDTO getAddressListByParentId(@RequestParam(name = "id") Long parentId){
//        System.out.println("/address/getAddressListByParentId ========================="+parentId);
        List<Address> addresses = addressServiceImpl.listByParentId(parentId);
        return  ResultDTO.successOf(addresses);
    }
}
