package com.zhangz.security.controller;

import com.zhangz.security.model.Notification;
import com.zhangz.security.model.Product;
import com.zhangz.security.service.impl.NotificationServieImpl;
import com.zhangz.security.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by codedrinker on 2019/4/24.
 */
@Controller
public class IndexController {

    @Autowired
    private NotificationServieImpl notificationServieImpl;
    @Autowired
    private ProductServiceImpl productServiceImpl;
//
//    @Autowired
//    private HotTagCache hotTagCache;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "10") Integer size,
                        @RequestParam(name = "search", required = false) String search,
                        @RequestParam(name = "tag", required = false) String tag,
                        @RequestParam(name = "sort", required = false) String sort) {
//        PaginationDTO pagination = questionService.list(search, tag, sort, page, size);
//        List<String> tags = hotTagCache.getHots();
//        model.addAttribute("pagination", pagination);
//        model.addAttribute("search", search);
//        model.addAttribute("tag", tag);
//        model.addAttribute("tags", tags);
//        model.addAttribute("sort", sort);
        return "index";
    }


    @GetMapping("/security")
    public String firstPage(Model model) {
        List<Notification> notifications = notificationServieImpl.listOfLatest(10);
        model.addAttribute("notifications",notifications);
        return "first_page.html";
    }

    /**
     * 食品查询
     * @description
     * @author zhangz
     * @date 2020:04:17 22:04:45
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public List<Product> search(@RequestBody Map<String,String> map){
        String searchText = map.get("searchText");
        Product product = new Product();
        product.setProductId(searchText);
        product.setProductName(searchText);
        product.setKindName(searchText);
        List<Product> products = productServiceImpl.search(product);
        return products;
    }


    @GetMapping(value = "/test")
    public String test(){
        return "template.html";
    }


}
