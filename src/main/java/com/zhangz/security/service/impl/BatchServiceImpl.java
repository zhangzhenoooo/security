package com.zhangz.security.service.impl;

import com.zhangz.security.mapper.BatchMapper;
import com.zhangz.security.model.Batch;
import com.zhangz.security.model.BatchExample;
import com.zhangz.security.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/7 17:51
 */
@Service
public class BatchServiceImpl implements BatchService {
    @Autowired
    private BatchMapper batchMapper;
    @Override
    public List<Batch> listByCreatorId(Long creatorId) {
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andIsDeleteEqualTo(false)
                .andCreatorIdEqualTo(creatorId);
        List<Batch> batches = batchMapper.selectByExample(batchExample);
        if (batches.size() == 0 ){
            return  new ArrayList<>();
        }else {
            return batches;
        }
    }

    @Override
    public int insert(Batch record) {
        int insert = batchMapper.insert(record);
        return insert;
    }

    @Override
    public Batch selectById(Long Id) {
        Batch batch = batchMapper.selectByPrimaryKey(Id);
        return batch;
    }

}
