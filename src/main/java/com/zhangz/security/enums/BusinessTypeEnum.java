package com.zhangz.security.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/10 13:55
 */
public enum  BusinessTypeEnum {
    VENDOR_IMPORT_PRODUCT("VENDOR_IMPORT_PRODUCT"),
    ;
    private String type;
    private String[] headers;

    BusinessTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public void setType(String type) {
        this.type = type;
        this.headers = initHeader(type);
    }

    private final  static  String[] vendorImportHeaders = {"hello world", "welcome to java", "I love China" };

    private String[]  initHeader(String type){
       if ("VENDOR_IMPORT_PRODUCT".equals(type)){
           return  vendorImportHeaders;
       }else {
           return new String[0];
       }
    }
}
