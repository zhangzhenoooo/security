package com.zhangz.security.mapper;

import com.zhangz.security.dto.EChartsResult;
import com.zhangz.security.dto.EChartsResultDTO;
import com.zhangz.security.model.Item;
import com.zhangz.security.model.ItemExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ItemExtMapper {
   List<EChartsResult> getItemKindsBySiteId(String siteId);

}