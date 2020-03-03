package com.zhangz.security.controller;

import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.mapper.BatchMapper;
import com.zhangz.security.model.Batch;
import com.zhangz.security.model.BatchExample;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.ProductServiceImpl;
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
 * @date 2020/3/2 19:55
 */
@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;
    @Autowired
    private BatchMapper batchMapper;

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
        return "product_management";
    }

    @ResponseBody
    @RequestMapping(value = "product/list",method = RequestMethod.POST)
    public List<ProductDTO> list (@RequestBody Map<String,Long> map,
                                  HttpSession session){
        User user = (User) session.getAttribute("user");
        List<ProductDTO> productDTOS = productServiceImpl.list(user.getUserId(),map.get("batchId"));
        return productDTOS;
    }
}
