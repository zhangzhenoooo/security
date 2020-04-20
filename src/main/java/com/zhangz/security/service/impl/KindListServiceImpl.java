package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.KindlistMapper;
import com.zhangz.security.model.Kindlist;
import com.zhangz.security.model.KindlistExample;
import com.zhangz.security.plugin.SnowIdUtils;
import com.zhangz.security.service.KindListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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
    public Kindlist selectById(String id) {
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

    @Override
    public int insetOrUpdate(Kindlist kindlist) {
        Kindlist dbKindList = selectById(kindlist.getKindId());
        int result = 0;
        if (ObjectUtils.isEmpty(dbKindList.getKindId())) {
            //insertORUpdate
            kindlist.setKindId(SnowIdUtils.uniqueLongHex());
             result = kindlistMapper.insert(kindlist);
        }else {
            //update
            result =  updateByExampleSelective(kindlist);
        }

        return result;
    }

    @Override
    public int updateByExampleSelective(Kindlist kindlist) {
        KindlistExample kindListExample = new KindlistExample();
        kindListExample.createCriteria()
                .andKindIdEqualTo(kindlist.getKindId());
        int i = kindlistMapper.updateByExampleSelective(kindlist, kindListExample);
        return i;
    }
}
