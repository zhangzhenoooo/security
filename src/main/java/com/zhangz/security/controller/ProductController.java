package com.zhangz.security.controller;

import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.mapper.BatchMapper;
import com.zhangz.security.mapper.ItemMapper;
import com.zhangz.security.mapper.SiteMapper;
import com.zhangz.security.model.*;
import com.zhangz.security.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 19:55
 */
@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;
    @Autowired
    private BatchMapper batchMapper;
    @Autowired
    private SiteMapper siteMapper;
    @Autowired
    private ItemMapper ItemMapper;

    @GetMapping("/product/productManagement")
    public String  productManagement(HttpSession session,
                                     Model model){
        BatchExample batchExample = new BatchExample();
        User user = (User) session.getAttribute("user");
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


        Set<Long> commentators = sites.stream().map(site -> site.getProducerId()).collect(Collectors.toSet());
        List<Long> siteIds = new ArrayList();
        siteIds.addAll(commentators);

        ItemExample itemExample = new ItemExample();
        itemExample.createCriteria()
                .andSiteIdIn(siteIds);
        List<Item> items = ItemMapper.selectByExample(itemExample);
        model.addAttribute("items",items) ;

        return "product_management";
    }

    @ResponseBody
    @RequestMapping(value = "product/list",method = RequestMethod.POST)
    public List<ProductDTO> list (@RequestBody Map<String,Long> map,
                                  HttpSession session){
        Long batchId = map.get("batchId");
        Long siteId = map.get("siteId");
        User user = (User) session.getAttribute("user");
        List<ProductDTO> productDTOS = productServiceImpl.list(user.getUserId(),siteId,batchId);
        return productDTOS;
    }

    @ResponseBody
    @RequestMapping(value = "/product/insert",method = RequestMethod.POST)
    public ResultDTO insert(@RequestParam(name = "siteId") Long siteId,
                            @RequestParam(name = "batchId") Long batchId,
                            @RequestParam(name ="itemId" )Long itemId,
                            @RequestParam(name ="description" )String description,
                            @RequestParam(name ="composition" )String composition,
                            HttpSession session){
        User user = (User) session.getAttribute("user");
        Product product = new Product();
        product.setSiteId(siteId);
        product.setItemId(itemId);
        product.setBatchId(batchId);
        product.setComposition(composition);
        product.setDescription(description);
        product.setIsDelete(0);
        product.setVendor(user.getUserId());
        product.setVendorName(user.getUserName());
        int insert = productServiceImpl.insert(product);
        if (insert > 0){
            return ResultDTO.successOf();
        }else {
            return ResultDTO.errorOf(CustomizeErrorCode.EXAM_INSERT_FALSE);
        }

    }
}
