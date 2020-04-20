package com.zhangz.security.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/10 13:55
 */
public enum  BusinessTypeEnum {
    VENDOR_IMPORT_PRODUCT("products"),
    EXAM_IMPORT_PRODUCT("exam"),
    ;
    private String type;
    private List<String> headers;

    BusinessTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public List getHeaders() {
        return headers;
    }

    public void setHeaders(List headers) {
        this.headers = headers;
    }

    public void setType(String type) {
        this.type = type;
        this.headers = initHeader(type);
    }


    private List<String>  initHeader(String type){
         final    String[] vendorImportHeaders = {"productId ","productName","siteId", "siteName", "batchId","itemId","itemName","vendor","vendorName","description" ,"composition","isDelete"};
        final    String[] examImportHeaders = {"examId ","examName","productId","productName", "examBatchId", "examBatchName","launchDate","examDate","examStatus","siteId","siteName" ,"batchId","batchName","productedDate","effectiveDate","vendorId","vendorName","itemId"};

        if ("products".equals(type)){
           return Arrays.asList(vendorImportHeaders);
       }else if ("exam".equals(type)){
            return Arrays.asList(examImportHeaders);
        } else {
           return  new ArrayList();
       }
    }

}
