package com.zhangz.security.dto;

import lombok.Data;

import java.util.List;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/11 18:06
 */
@Data
public class EChartsResultDTO {

    private List<String> name;
    private List<EChartsResult> data;
    private List<Long> values;


}
