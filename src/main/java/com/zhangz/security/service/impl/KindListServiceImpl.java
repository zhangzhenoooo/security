package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.KindlistMapper;
import com.zhangz.security.model.Kindlist;
import com.zhangz.security.model.KindlistExample;
import com.zhangz.security.plugin.AutoId;
import com.zhangz.security.service.KindListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/22 19:31
 */
@Service
public class KindListServiceImpl implements KindListService {
    @Autowired
    private KindlistMapper kindlistMapper;

    @Override
    public List<Kindlist> list() {
        KindlistExample kindListExample = new KindlistExample();
        kindListExample.createCriteria()
                .andIsDeleteEqualTo(false);
        List<Kindlist> kindlists = kindlistMapper.selectByExample(kindListExample);
        return kindlists;
    }

    @Override
    public Kindlist selectById(Long id) {
        KindlistExample kindListExample = new KindlistExample();
        kindListExample.createCriteria()
                .andKindIdEqualTo(id)
                .andIsDeleteEqualTo(false);
        List<Kindlist> kindlists = kindlistMapper.selectByExample(kindListExample);
        if (kindlists.size() > 0){
            return kindlists.get(0);
        }else {
            return  null;
        }
    }
}
