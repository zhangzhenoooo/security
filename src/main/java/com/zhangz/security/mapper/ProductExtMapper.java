package com.zhangz.security.mapper;

import com.zhangz.security.model.Product;
import com.zhangz.security.model.ProductExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ProductExtMapper {

    int batchInsert(List<Product> list);
}