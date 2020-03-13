package com.zhangz.security.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhangz.security.dto.ResultDTO;
import com.zhangz.security.enums.BusinessTypeEnum;
import com.zhangz.security.exception.CustomizeErrorCode;
import com.zhangz.security.model.Exam;
import com.zhangz.security.model.Product;
import com.zhangz.security.service.impl.ExamServiceImpl;
import com.zhangz.security.service.impl.ProductServiceImpl;
import com.zhangz.security.utils.ExcelUtil;
import com.zhangz.security.utils.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/3/10 13:54
 */
@Controller
@Slf4j
public class ExcelController {
    @Autowired
    private ProductServiceImpl productServiceImpl;
    @Autowired
    private ExamServiceImpl examServiceImpl;

    private final static String FILE_UPLOAD_PATH = "src/main/resources/upload/";
    private ExcelUtil excelUtil = new ExcelUtil();

    /**
     *
     * @description 上传excel 到服务器并回显
     * @author zhangz
     * @date 2020:03:12 14:08:12
     * @param excelFile
     * @param guid
     * @param type
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/excel/upload",method = RequestMethod.POST)
    public ResultDTO Upload(@RequestParam(name = "excelFile") MultipartFile excelFile,
                            @RequestParam(name = "guid") String guid,
                            @RequestParam(name = "type",defaultValue = "") String type) {
        String folder = "";

        if (excelFile != null) {
            // 首先文件格式
            ArrayList<String> fileType = new ArrayList<>();
            fileType.add("xls");
            fileType.add("xlsx");

            // 获取文件名，带后缀
            String originalFilename = FileUtil.getOriginalFileName(excelFile);
            // 获取文件的后缀格式
            String fileSuffix = FileUtil.getFileSuffix(excelFile);
            String basePath = null;
            if (fileType.contains(fileSuffix)) {
                //     contains:包含
                try {
                    byte[]   bytes = excelFile.getBytes();
                    //判断excel内容
                    if (BusinessTypeEnum.VENDOR_IMPORT_PRODUCT.getType().equals(type)) {
                        //VENDOR_IMPORT_PRODUCT
//                        boolean b = excelUtil.checkExcelColumns(excelFile, type);
                        basePath = FILE_UPLOAD_PATH+type;
                        if (true){
                            List<Product> products = excelUtil.getExcelData(excelFile, type);
                            //save
                            FileUtil.upload( basePath,excelFile);
                            return ResultDTO.successOf(products);
                        }else {
                            //列不匹配
                            return ResultDTO.errorOf(CustomizeErrorCode.FIEL_COL_NOT_MATCH);
                        }
                    }else if (BusinessTypeEnum.EXAM_IMPORT_PRODUCT.getType().equals(type)){
                        //EXAM_IMPORT_PRODUCT
//                        boolean b = excelUtil.checkExcelColumns(excelFile, type);
                        basePath = FILE_UPLOAD_PATH+type;
                        if (true){
                            List<Exam> exams = excelUtil.getExcelData(excelFile, type);
                            //save
                            FileUtil.upload( basePath,excelFile);
                            return ResultDTO.successOf(exams);
                        }else {
                            //列不匹配
                            return ResultDTO.errorOf(CustomizeErrorCode.FIEL_COL_NOT_MATCH);
                        }
                    }else {
                        return ResultDTO.errorOf(CustomizeErrorCode.FILE_UPLOAD_ERROR);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    return ResultDTO.errorOf(CustomizeErrorCode.FILE_UPLOAD_ERROR);
                }

            } else {
                // 非法文件
                return ResultDTO.errorOf(CustomizeErrorCode.FILE_TYPE_WRONG);
            }

        } else {
            //文件内容空
            return  ResultDTO.errorOf(CustomizeErrorCode.FIEL_IS_NULL);
        }

    }

    /**
     *
     * @description 批量导入数据
     * @author zhangz
     * @date 2020:03:13 10:56:01
     * @param map 前端传递的值
     * @return ResultDTO
     **/
    @ResponseBody
    @RequestMapping(value = "/excel/batchImport",method = RequestMethod.POST)
    public ResultDTO batchImport(@RequestBody Map<String,Object> map){
        String type = (String) map.get("type");
        List<Product> list = (List<Product>) map.get("list");
//        System.out.println("list.size ==========================="+o.getProductName());
        ObjectMapper mapper = new ObjectMapper();


        if (!ObjectUtils.isEmpty(list)){
            if (BusinessTypeEnum.VENDOR_IMPORT_PRODUCT.getType().equals(type)){
                List<Product> products = mapper.convertValue(list,new TypeReference<List<Product>>(){});
                int affectRows = productServiceImpl.batchInsert(products);
                if (affectRows > 0 ){
                    //插入成功
                    return ResultDTO.successOf();
                }else {
//                    插入失败
                    return   ResultDTO.errorOf(CustomizeErrorCode.INSERT_FALSE);
                }
            }else if (BusinessTypeEnum.VENDOR_IMPORT_PRODUCT.getType().equals(type)){
                List<Exam> exams = mapper.convertValue(list,new TypeReference<List<Exam>>(){});
                int affectRows = examServiceImpl.batchInsert(exams);
                if (affectRows > 0 ){
                    //插入成功
                    return ResultDTO.successOf();
                }else {
//                    插入失败
                    return   ResultDTO.errorOf(CustomizeErrorCode.INSERT_FALSE);
                }
            }else {
                //没有这样的导入功能
                return  ResultDTO.errorOf(CustomizeErrorCode.FUNCTION_NOT_EXIST);
            }
        }else {
            //list为空
            return  ResultDTO.errorOf(CustomizeErrorCode.RESULT_NULL);
        }

    }

    /**
     *
     * @description
     * @author zhangz
     * @date 2020:03:13 15:09:27
     * @return
     **/


    @RequestMapping(value = "/excel/downLoadTemplate/{fileName}",method = RequestMethod.GET)
    public void downLoadTemplate(@PathVariable(value = "fileName")String fileName,
                                      HttpServletResponse response) {

        String   path = FILE_UPLOAD_PATH + "template" + "/";

        // 设置信息给客户端不解析
        String type1 = new MimetypesFileTypeMap().getContentType(fileName);
        // 设置contenttype，即告诉客户端所发送的数据属于什么类型
        response.setHeader("Content-type",type1);
        // 设置编码
        String hehe = null;
        try {
            hehe = new String(fileName.getBytes("utf-8"), "iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 设置扩展头，当Content-Type 的类型为要下载的类型时 , 这个信息头会告诉浏览器这个文件的名字和类型。
        response.setHeader("Content-Disposition", "attachment;filename=" + hehe);
        try {
            FileUtil.download(fileName,path, response);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
