package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.ItemMapper;
import com.zhangz.security.model.Item;
import com.zhangz.security.model.ItemExample;
import com.zhangz.security.service.ItemService;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/3 17:10
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private  ItemMapper itemMapper;

    @Override
    public List<Item> listBySiteId(String siteId) {
        ItemExample itemExample = new ItemExample();
        itemExample.createCriteria()
                .andIsDeleteEqualTo(false)
                .andSiteIdEqualTo(siteId);
        List<Item> items = itemMapper.selectByExample(itemExample);
        if (items.size() == 0){
            return  new ArrayList<>();
        }else {
            return items;
        }


    }

    @Override
    public boolean insertOrUpdate(Item item) {
        Item dbSite = itemMapper.selectByPrimaryKey(item.getItemId());
        int affectedRow;
        if (ObjectUtils.isEmpty(dbSite)){
            //insertORUpdate
            item.setCreateDate(DateUtil.getData());
            item.setModifyDate(DateUtil.getData());
            affectedRow = itemMapper.insert(item);
        }else {
            //update
            ItemExample itemExample = new ItemExample();
            itemExample.createCriteria()
                    .andSiteIdEqualTo(item.getItemId());
            item.setModifyDate(DateUtil.getData());
            affectedRow = itemMapper.updateByExampleSelective(item,itemExample);
        }
        return affectedRow > 0 ? true : false;
    }

    @Override
    public Item selectById(String itemId) {
        Item item = itemMapper.selectByPrimaryKey(itemId);
        return item;
    }


}
