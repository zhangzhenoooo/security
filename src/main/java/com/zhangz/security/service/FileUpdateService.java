package com.zhangz.security.service;

import com.zhangz.security.dto.FileDTO;
import com.zhangz.security.dto.ResultDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/17 20:24
 */
public interface FileUpdateService {
    FileDTO fileUpdate(String type, MultipartFile file,String  fileName) throws IOException;
    String getNewFileName(MultipartFile file);
    ResultDTO deleteFile(String fileType,String fileName);
}
