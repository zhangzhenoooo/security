package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Item;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.ItemServiceImpl;
import com.zhangz.security.utils.DateUtil;
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
 * @date 2020/3/3 17:13
 */
@Controller
public class ItemController {

    @Autowired
    private ItemServiceImpl itemServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/item/listBySiteId",method = RequestMethod.POST)
    public List<Item>  listBySiteId(@RequestBody  Map<String,Long> map){
        List<Item> sites = itemServiceImpl.listBySiteId(map.get("siteId"));
        return sites;
    }

    @ResponseBody
    @RequestMapping(value = "/item/insertOrUpdate",method = RequestMethod.POST)
    public ResultDTO insertOrUpdate(@RequestParam(name = "itemId",required = false) Long itemId,
                                    @RequestParam(name = "itemName") String itemName,
                                    @RequestParam(name = "description") String description,
                                    @RequestParam (name = "siteId") Long siteId,
                                    HttpSession session){
        User user = (User)session.getAttribute("user");
        Item item = new Item();
        item.setDescription(description);
        item.setItemId(itemId);
        item.setItemName(itemName);
        item.setSiteId(siteId);
        item.setIsDelete(true);
        boolean result = itemServiceImpl.insertOrUpdate(item);
        if (result){
            return ResultDTO.successOf();
        }else {
            return ResultDTO.errorOf(CustomizeErrorCode.ITEM_INSERT_FALSE);
        }
    }

    @ResponseBody
    @RequestMapping(value = "item/{itemId}",method = RequestMethod.GET)
    public Item selectById(@PathVariable(name = "itemId") Long itemId,
                           Model model){
        Item item = itemServiceImpl.selectById(itemId);
        return item;
    }
}
