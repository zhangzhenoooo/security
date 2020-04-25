package com.zhangz.security.controller;

import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.mapper.BatchMapper;
import com.zhangz.security.mapper.ItemMapper;
import com.zhangz.security.mapper.SiteMapper;
import com.zhangz.security.model.*;
import com.zhangz.security.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.java2d.loops.GeneralRenderer;

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
    private ExamedProductLisServicetImpl examedProductLisServicetImpl;
    @Autowired
    private ProductServiceImpl productServiceImpl;
    @Autowired
    private UserServiceImpl  userServiceImpl;
    @Autowired
    private AttachmentServiceImpl attachmentServiceImpl;
    @Autowired
    private BatchMapper batchMapper;
    @Autowired
    private SiteMapper siteMapper;
    @Autowired
    private ItemMapper ItemMapper;

    @GetMapping("/product/productManagement")
    public String  productManagement(HttpSession session,
                                     Model model){
        User user = (User) session.getAttribute("user");
//        获取批次
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andIsDeleteEqualTo(false)
                .andCreatorIdEqualTo(user.getUserId());
        List<Batch> batches = batchMapper.selectByExample(batchExample);
        model.addAttribute("batches",batches) ;
//获取产地列表
        SiteExample siteExample = new SiteExample();
        siteExample.createCriteria()
                .andProducerIdEqualTo(user.getUserId());
        List<Site> sites = siteMapper.selectByExample(siteExample);
        model.addAttribute("sites",sites) ;
        List<String> siteIds = sites.stream().map(s ->s.getSiteId()).collect(Collectors.toList());
//获取产品列表
        ItemExample itemExample = new ItemExample();
        itemExample.createCriteria()
                .andSiteIdIn(siteIds);
        List<Item> items = ItemMapper.selectByExample(itemExample);
        model.addAttribute("items",items) ;

        return "product_management";
    }

    @ResponseBody
    @RequestMapping(value = "product/list",method = RequestMethod.POST)
    public List<ProductDTO> list (@RequestBody Map<String,String> map,
                                  HttpSession session){
        String batchId = map.get("batchId");
        String siteId = map.get("siteId");
        User user = (User) session.getAttribute("user");
//        List<ProductDTO> productDTOS = productServiceImpl.list(user.getUserId(),siteId,batchId);
        List<ProductDTO> productDTOS = productServiceImpl.listByVonder(user.getUserId());
        return productDTOS;
    }

    @ResponseBody
    @RequestMapping(value = "/product/insert",method = RequestMethod.POST)
    public ResultDTO insert(@RequestParam(name = "siteId") String siteId,
                            @RequestParam(name = "batchId") String batchId,
                            @RequestParam(name ="itemId" )String itemId,
                            @RequestParam(name ="description" )String description,
                            @RequestParam(name ="composition" )String composition,
                            HttpSession session){
        User user = (User) session.getAttribute("user");
        if (user == null){
            return ResultDTO.errorOf(CustomizeErrorCode.NOT_LOGIN);
        }
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
            return ResultDTO.errorOf(CustomizeErrorCode.INSERT_FALSE);
        }

    }

    @GetMapping(value = "/product/{productId}")
    public String productDetails(@PathVariable(name = "productId") String productId,
                                 Model model){
        ProductDTO productDTO = productServiceImpl.selectById(productId);
        model.addAttribute("productDTO",productDTO);
        return "product_details.html";
    }


    @ResponseBody
    @RequestMapping(value = "product/listOfNeedExamed",method = RequestMethod.POST)
    public List<ProductDTO> listOfNeedExamed (@RequestBody Map<String,String> map,
                                              HttpSession session){
        String batchId = map.get("batchId");
        String siteId = map.get("siteId");
        User user = (User) session.getAttribute("user");
        List<ProductDTO> productDTOS = productServiceImpl.listOfNeedExamed(user.getUserId(),siteId,batchId);
        return productDTOS;
    }

    @GetMapping (value = "/product/productDetailsBySearch/{productId}")
    public String productDetailsBySearch (Model model,
                                          @PathVariable String productId){
//        食品信息
        ProductDTO productDTO = productServiceImpl.selectById(productId);
//        食品附件（图片）
        List<Attachment> productAttachments = attachmentServiceImpl.listByParentId(productId);
//        生产基地信息
        Site site = productDTO.getSite();
//        生产基地附件（环境图片）
        List<Attachment> siteAttachments = attachmentServiceImpl.listByParentId(site.getSiteId());
//        检测信息
        Examedproductlist exam = examedProductLisServicetImpl.selectByKeyWords(productDTO.getItemId(),productDTO.getSiteId(),productDTO.getBatchId(),"");
//     生产商信息
        User user = userServiceImpl.selectByUserId(productDTO.getVendor());
//检测机构
        User examer = userServiceImpl.selectByUserId(exam.getExamerId());
        model.addAttribute("product",productDTO);
        model.addAttribute("productAttachments",productAttachments);
        model.addAttribute("site",site);
        model.addAttribute("siteAttachments",siteAttachments);
        model.addAttribute("exam",exam);
        model.addAttribute("user",user);
        model.addAttribute("examer",examer);

        return "product_details";
    }






}
