package com.zhangz.security.dto;

import lombok.Data;

/**
 *
 * @description
 * @author zhangz
 * @date 2020:03:11 19:58:45
 * @return
 **/
@Data
public class FileDTO {
    private int success;
    private String message;
    private String url;
    private String fileName;

}
