package com.zhangz.security.controller;

import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.enums.ExamTypeEnum;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Item;
import com.zhangz.security.model.Kindlist;
import com.zhangz.security.model.User;
import com.zhangz.security.service.impl.ItemServiceImpl;
import com.zhangz.security.service.impl.KindListServiceImpl;
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

    @Autowired
    private KindListServiceImpl kindListServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/item/listBySiteId",method = RequestMethod.POST)
    public List<Item>  listBySiteId(@RequestBody  Map<String,String> map){
        List<Item> items = itemServiceImpl.listBySiteId(map.get("siteId"));
        return items;
    }

    @ResponseBody
    @RequestMapping(value = "/item/insertOrUpdate",method = RequestMethod.POST)
    public ResultDTO insertOrUpdate(@RequestParam(name = "itemId",required = false) String itemId,
                                    @RequestParam(name = "itemName") String itemName,
                                    @RequestParam(name = "description") String description,
                                    @RequestParam (name = "siteId") String siteId,
                                    @RequestParam (name = "kindId") String kindId,
                                    HttpSession session){
        User user = (User)session.getAttribute("user");
        Item item = new Item();
        item.setDescription(description);
        item.setItemId(itemId);
        item.setItemName(itemName);
        item.setSiteId(siteId);
        item.setExamStatus(ExamTypeEnum.NOT_APPROVAL.getStatus());
        item.setIsDelete(false);
        item.setKindId(kindId);
        Kindlist kindlist = kindListServiceImpl.selectById(kindId);
        item.setKindName(kindlist.getKindName());
        boolean result = itemServiceImpl.insertOrUpdate(item);
        if (result){
            return ResultDTO.successOf();
        }else {
            return ResultDTO.errorOf(CustomizeErrorCode.INSERT_FALSE);
        }
    }


    @ResponseBody
    @RequestMapping(value = "item/{itemId}",method = RequestMethod.GET)
    public Item selectById(@PathVariable(name = "itemId") String itemId,
                           Model model){
        Item item = itemServiceImpl.selectById(itemId);
        return item;
    }
}
