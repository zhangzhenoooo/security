package com.zhangz.security.service.impl;

import com.zhangz.security.dto.EChartsResult;
import com.zhangz.security.dto.EChartsResultDTO;
import com.zhangz.security.mapper.ItemExtMapper;
import com.zhangz.security.mapper.ItemMapper;
import com.zhangz.security.model.Item;
import com.zhangz.security.model.ItemExample;
import com.zhangz.security.plugin.SnowIdUtils;
import com.zhangz.security.service.ItemService;
import com.zhangz.security.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/3 17:10
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private  ItemMapper itemMapper;
    @Autowired
    private ItemExtMapper itemExtMapper;

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
    public EChartsResultDTO getItemKindsBySiteId(String sited) {
        EChartsResultDTO  eChartsResultDTO = new EChartsResultDTO();
        List<EChartsResult> eChartsResults = itemExtMapper.getItemKindsBySiteId(sited);
        if (eChartsResults.size() <= 0){
            return eChartsResultDTO;
        }
        List<String> names = eChartsResults.stream().map(t -> t.getName()).collect(Collectors.toList());
        List<Long> values = eChartsResults.stream().map(t -> t.getValue()).collect(Collectors.toList());
        eChartsResultDTO.setName(names);
        eChartsResultDTO.setValues(values);
        eChartsResultDTO.setData(eChartsResults);
        return eChartsResultDTO;
    }

    @Override
    public boolean insertOrUpdate(Item item) {
        Item dbSite = itemMapper.selectByPrimaryKey(item.getItemId());
        int affectedRow;
        if (ObjectUtils.isEmpty(dbSite)){
            //insertORUpdate
            item.setItemId(SnowIdUtils.uniqueLongHex());
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
