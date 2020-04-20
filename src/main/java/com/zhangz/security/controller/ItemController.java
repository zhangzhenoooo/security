package com.zhangz.security.controller;

import com.zhangz.security.dto.EChartsResultDTO;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.enums.ExamTypeEnum;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.*;
import com.zhangz.security.service.impl.AttachmentServiceImpl;
import com.zhangz.security.service.impl.ItemServiceImpl;
import com.zhangz.security.service.impl.KindListServiceImpl;
import com.zhangz.security.service.impl.SiteServiceImpl;
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
    private SiteServiceImpl SiteServiceImpl;
    @Autowired
    private AttachmentServiceImpl attachmentServiceImpl;
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

    @GetMapping(value = "/itemDetails/{itemId}")
    public String itemDetails(@PathVariable(name = "itemId") String itemId,
                              Model model){
        Item item  = itemServiceImpl.selectById(itemId);
        Site site = SiteServiceImpl.selectById(item.getSiteId());
        List<Attachment> attachments = attachmentServiceImpl.listByParentId(itemId);
        model.addAttribute("site",site);
        model.addAttribute("item",item);
        model.addAttribute("attachments",attachments);
        return "item_details.html";
    }

    /**
     *
     * @description 查询基地产品种类的及占比
     * @author zhangz
     * @date 2020:04:11 21:59:52
     * @param siteId
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/item/getItemKindsBySiteId",method = RequestMethod.POST)
    public EChartsResultDTO getItemKindsBySiteId(@RequestParam(name = "siteId") String siteId){
        EChartsResultDTO eChartsResultDTO = itemServiceImpl.getItemKindsBySiteId(siteId);
        return eChartsResultDTO;
    }


}
