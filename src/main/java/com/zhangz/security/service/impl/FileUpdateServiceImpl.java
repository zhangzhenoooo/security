package com.zhangz.security.service.impl;

import com.zhangz.security.dto.FileDTO;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.service.FileUpdateService;
import com.zhangz.security.utils.FileUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/17 20:27
 */
@Service
public class FileUpdateServiceImpl implements FileUpdateService {
    private final static String FILE_UPLOAD_PATH = "src/main/resources/uploadFile/";
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
    @Override
    public FileDTO fileUpdate(String type, MultipartFile file, String fileName) throws IOException {
        if (StringUtils.isEmpty(file.getName())|| file.getSize() == 0){
            return new FileDTO();
        }
         String     basePath = FILE_UPLOAD_PATH+type;
        FileDTO fileDTO = null;
        String format = sdf.format(new Date());
        File folder = new File(basePath);
        if (!folder.isDirectory()) {
            //如果文件夹不存在则创建
            folder.mkdirs();
        }
        // 文件保存
        fileDTO = FileUtil.upload(basePath, file, fileName);
        return fileDTO;
    }

    @Override
    public String getNewFileName(MultipartFile file) {

        if (StringUtils.isEmpty(file.getName())|| file.getSize() == 0){
            return "";
        }
        // 对上传的文件重命名，避免文件重名
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString()
                + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        return newName;
    }

    @Override
    public ResultDTO deleteFile(String fileType, String fileName) {
        String path = "E:/IdeaProjects/security/src/main/resources/uploadFile/";
        String  basePath = path+"/"+fileType;
        File file = new File(basePath+fileName);
        if (file.exists()){
            return ResultDTO.successOf();
        }else {
            return ResultDTO.errorOf(CustomizeErrorCode.DELECT_FILE_FAILD);
        }
    }
}
