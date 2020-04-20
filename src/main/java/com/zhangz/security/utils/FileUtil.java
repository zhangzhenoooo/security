package com.zhangz.security.utils;

import com.zhangz.security.dto.FileDTO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/13 15:18
 */
public class FileUtil {

    /**
     * @param file
     * @return
     * @description 上传文件
     * @author zhangz
     * @date 2020:03:13 15:29:15
     **/
    public static Boolean upload(String basePath, MultipartFile file) throws IOException {

        // 获取文件名，带后缀
        String originalFilename = getOriginalFileName(file);
        // 获取文件的后缀格式
        String fileSuffix = getFileSuffix(file);
        String path = null;//文件路径
        String newFileName; //重新命名文件
        byte[] bytes = file.getBytes();
        newFileName = originalFilename;
        path = basePath + "/" + newFileName;
        //save
        Path p = Paths.get(path); //文件路径
        Files.write(p, bytes);//保存到服务器
        return true;
    }
    /**
     * @param file
     * @return
     * @description 上传文件
     * @author zhangz
     * @date 2020:03:13 15:29:15
     **/
    public static FileDTO upload(String basePath, MultipartFile file, String fileName) throws IOException {

        // 获取文件名，带后缀
        String originalFilename = getOriginalFileName(file);
        // 获取文件的后缀格式
        String fileSuffix = getFileSuffix(file);
        String path = null;//文件路径
//        String newFileName; //重新命名文件
        byte[] bytes = file.getBytes();
//        newFileName = originalFilename;
        path = basePath + "/" + fileName;
        //save
        Path p = Paths.get(path); //文件路径
        Files.write(p, bytes);//保存到服务器
        FileDTO fileDTO = new FileDTO();
        fileDTO.setMessage("上传成功");
        fileDTO.setSuccess(200);
        fileDTO.setUrl(path);
        fileDTO.setFileName(fileName);
        return fileDTO;
    }

    /*
     *
     * @description // 获取文件名，带后缀
     * @author zhangz
     * @date 2020:03:13 15:33:48
     * @param file
     * @return
     **/
    public static String getOriginalFileName(MultipartFile file) {
        return file.getOriginalFilename();
    }

    /**
     * @param file
     * @return
     * @description 获取文件的后缀格式
     * @author zhangz
     * @date 2020:03:13 15:34:24
     **/
    public static String getFileSuffix(MultipartFile file) {
        String originalFileName = getOriginalFileName(file);
        return originalFileName.substring(originalFileName.lastIndexOf(".") + 1).toLowerCase();
    }

    /**
     * @param fileName
     * @param path
     * @param res
     * @return
     * @description 下载文件
     * @author zhangz
     * @date 2020:03:13 15:47:58
     **/
    public static void  download(String fileName, String path, HttpServletResponse res) throws IOException {
        // 发送给客户端的数据
        OutputStream outputStream = res.getOutputStream();
        byte[] buff = new byte[1024];
        BufferedInputStream bis = null;
        // 读取filename
        bis = new BufferedInputStream(new FileInputStream(new File(path + fileName)));
        int i = bis.read(buff);
        while (i != -1) {
            outputStream.write(buff, 0, buff.length);
            outputStream.flush();
            i = bis.read(buff);
        }
    }

}
