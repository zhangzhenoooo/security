package com.zhangz.security.controller;

import com.zhangz.security.dto.FileDTO;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.model.Attachment;
import com.zhangz.security.service.impl.AttachmentServiceImpl;
import com.zhangz.security.service.impl.FileUpdateServiceImpl;
import com.zhangz.security.utils.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @description
 * @author zhangz
 * @date 2020:04:10 10:06:17
 * @return
 **/

@Controller
@Slf4j
public class FileUploadController {
    private final static String FILE_UPLOAD_PATH = "src/main/resources/uploadFile/";
    @Autowired
    private AttachmentServiceImpl attachmentServiceImpl;
    @Autowired
    private FileUpdateServiceImpl  fileUpdateServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/file/upload",method = RequestMethod.POST)
    public FileDTO upload(@RequestParam(name = "file",required = false) MultipartFile file,
                          HttpServletRequest request,
                          @RequestParam(name = "type",defaultValue = "default") String type,
                          @RequestParam(name = "parentId") String  parentId) {
        FileDTO fileDTO = new FileDTO();
        String newName = fileUpdateServiceImpl.getNewFileName(file);
        try {
            // 文件保存
             fileDTO = fileUpdateServiceImpl.fileUpdate(type,file,newName);
                Attachment attachment = new Attachment();
                attachment.setParentId(parentId);
                attachment.setUrl(newName);
                attachment.setType(type);
                attachmentServiceImpl.insert(attachment);
            return fileDTO;
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileDTO.setUrl("");
        fileDTO.setSuccess(0);
        fileDTO.setMessage("上传失败");
        return fileDTO;
    }

    @ResponseBody
    @RequestMapping(value = "/file/delete",method = RequestMethod.POST)
    public ResultDTO delete(@RequestParam(name ="attachmentId" )String attachmentId,
                            @RequestParam(name = "type")String type,
                            @RequestParam(name = "fileName")String fileName){
        attachmentServiceImpl.deleteById(attachmentId);
        ResultDTO resultDTO = fileUpdateServiceImpl.deleteFile(type, fileName);
        return resultDTO;
    }
}