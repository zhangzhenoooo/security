package com.zhangz.security.service.impl;

import com.zhangz.security.dto.CommentDTO;
import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.mapper.BatchMapper;
import com.zhangz.security.mapper.ItemMapper;
import com.zhangz.security.mapper.ProductMapper;
import com.zhangz.security.mapper.SiteMapper;
import com.zhangz.security.model.*;
import com.zhangz.security.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/2 20:22
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private SiteMapper siteMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private BatchMapper batchMapper;

    @Override
    public List<ProductDTO> list(Long vendorId,Long siteId ,Long batchId) {

        ProductExample productExample = new ProductExample();

        ProductExample.Criteria criteria =  productExample.createCriteria()
                .andVendorEqualTo(vendorId);

        if (!ObjectUtils.isEmpty(siteId)){
            criteria.andSiteIdEqualTo(siteId);
        }
        if (!ObjectUtils.isEmpty(batchId)){
            criteria .andBatchIdEqualTo(batchId);
        }
        List<Product> products = productMapper.selectByExample(productExample);
        if (products.size() == 0){
            return new ArrayList<>();
        }
        // 获取去重的batch
        Set<Long> batches = products.stream().map(product -> product.getBatchId()).collect(Collectors.toSet());
        List<Long> batchIds = new ArrayList();
        batchIds.addAll(batches);

        // 获取batch并转换为 Map
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andBatchIdIn(batchIds);
        List<Batch> batchList = batchMapper.selectByExample(batchExample);
        Map<Long, Batch> batchMap = batchList.stream().collect(Collectors.toMap(b -> b.getBatchId(), b -> b));


        // 转换 productDTO
        List<ProductDTO> productDTOS = products.stream().map(product -> {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product, productDTO);
            productDTO.setBatch(batchMap.get(product.getBatchId()));
            return productDTO;
        }).collect(Collectors.toList());
        return productDTOS;
    }
}
