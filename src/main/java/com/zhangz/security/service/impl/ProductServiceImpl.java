package com.zhangz.security.service.impl;

import com.zhangz.security.dto.ProductDTO;
import com.zhangz.security.mapper.*;
import com.zhangz.security.model.*;
import com.zhangz.security.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

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
    private ProductExtMapper productExtMapper;
    @Autowired
    private SiteMapper siteMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private BatchMapper batchMapper;
    @Autowired
    private ExamServiceImpl  examServiceImpl;
    @Override
    public List<ProductDTO> list(String vendorId, String siteId , String batchId) {

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
        Set<String> batches = products.stream().map(product -> product.getBatchId()).collect(Collectors.toSet());
        List<String> batchIds = new ArrayList();
        batchIds.addAll(batches);

        // 获取batch并转换为 Map
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andBatchIdIn(batchIds);
        List<Batch> batchList = batchMapper.selectByExample(batchExample);
        Map<String, Batch> batchMap = batchList.stream().collect(Collectors.toMap(b -> b.getBatchId(), b -> b));


        // 转换 productDTO
        List<ProductDTO> productDTOS = products.stream().map(product -> {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product, productDTO);
            productDTO.setBatch(batchMap.get(product.getBatchId()));
            return productDTO;
        }).collect(Collectors.toList());
        return productDTOS;
    }

    @Override
    public int insert(Product record) {
        Site dbSite = siteMapper.selectByPrimaryKey(record.getSiteId());
        Batch dbBatch = batchMapper.selectByPrimaryKey(record.getBatchId());
        Item dbItem = itemMapper.selectByPrimaryKey(record.getItemId());
        record.setSiteName(dbSite.getSiteName());
        record.setItemName(dbItem.getItemName());
        record.setProductName(dbItem.getItemName());
        int insert = productMapper.insert(record);
        return insert;
    }

    @Override
    public ProductDTO selectById(String productId) {
        ProductDTO productDTO = new ProductDTO();
//        ProductExample productExample = new ProductExample();
//        productExample.createCriteria()
//                .andProductIdEqualTo(productId);
       Product product = productMapper.selectByPrimaryKey(productId);
       BeanUtils.copyProperties(product,productDTO);
        Site site = siteMapper.selectByPrimaryKey(product.getSiteId());
        productDTO.setSite(site);
        return productDTO;

    }

    @Override
    public List<Product> selectByExampleSelective(Product product) {

        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        if (!StringUtils.isEmpty(product.getProductId())){
            criteria.andProductIdEqualTo(product.getProductId());
        }
        if (!StringUtils.isEmpty(product.getProductName())){
            criteria.andProductNameEqualTo(product.getProductName());
        }
        if (!StringUtils.isEmpty(product.getKindName())){
            criteria.andKindNameLike(product.getKindName());
        }
        List<Product> products = productMapper.selectByExample(productExample);
        if (products.size() > 0 ){
            return products;
        }else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<ProductDTO> listOfNeedExamed(String vendorId, String siteId, String batchId) {
        List<Exam> exams = examServiceImpl.list();
        List<String>  examedProductIds = exams.stream().map(e->e.getProductId()).collect(Collectors.toList());
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria =  productExample.createCriteria()
                .andVendorEqualTo(vendorId)
                .andProductIdNotIn(examedProductIds);

        if (!StringUtils.isEmpty(siteId)){
            criteria.andSiteIdEqualTo(siteId);
        }
        if (!StringUtils.isEmpty(batchId)){
            criteria .andBatchIdEqualTo(batchId);
        }
        List<Product> products = productMapper.selectByExample(productExample);
        if (products.size() == 0){
            return new ArrayList<>();
        }
        // 获取去重的batch
        Set<String> batches = products.stream().map(product -> product.getBatchId()).collect(Collectors.toSet());
        List<String> batchIds = new ArrayList();
        batchIds.addAll(batches);

        // 获取batch并转换为 Map
        BatchExample batchExample = new BatchExample();
        batchExample.createCriteria()
                .andBatchIdIn(batchIds);
        List<Batch> batchList = batchMapper.selectByExample(batchExample);
        Map<String, Batch> batchMap = batchList.stream().collect(Collectors.toMap(b -> b.getBatchId(), b -> b));


        // 转换 productDTO
        List<ProductDTO> productDTOS = products.stream().map(product -> {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product, productDTO);
            productDTO.setBatch(batchMap.get(product.getBatchId()));
            return productDTO;
        }).collect(Collectors.toList());
        return productDTOS;

    }

    @Override
    public int batchInsert(List list) {
        int i = productExtMapper.batchInsert(list);
        return i;
    }
}
