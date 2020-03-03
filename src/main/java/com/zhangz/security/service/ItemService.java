package com.zhangz.security.service;

import com.zhangz.security.model.Item;
import org.w3c.dom.ls.LSInput;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/3 17:09
 */
public interface ItemService {

    List<Item> listBySiteId(Long siteId);

    boolean insertOrUpdate(Item site);

    Item selectById(Long itemId);
}
