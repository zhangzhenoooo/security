package com.zhangz.security.utils;

import com.zhangz.security.enums.BusinessTypeEnum;
import com.zhangz.security.model.Exam;
import com.zhangz.security.model.Product;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExcelUtil <T> {

    private  ReadExcelUtil readExcelUtil = new ReadExcelUtil() ;
    //    private static final Logger logger = Logger.getLogger(ExcelUtil.class);
    public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
    public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";
    public static final String EMPTY = "";
    public static final String POINT = ".";
    public static SimpleDateFormat sdf =   new SimpleDateFormat("yyyy/MM/dd");

    /**
     * 获得path的后缀名
     * @param path
     * @return
     */
    public static String getPostfix(String path){
        if(path==null || EMPTY.equals(path.trim())){
            return EMPTY;
        }
        if(path.contains(POINT)){
            return path.substring(path.lastIndexOf(POINT)+1,path.length());
        }
        return EMPTY;
    }
    /**
     * 单元格格式
     * @param hssfCell
     * @return
     */
    @SuppressWarnings({ "static-access", "deprecation" })
    public static String getHValue(HSSFCell hssfCell){
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            String cellValue = "";
            if(HSSFDateUtil.isCellDateFormatted(hssfCell)){
                Date date = HSSFDateUtil.getJavaDate(hssfCell.getNumericCellValue());
                cellValue = sdf.format(date);
            }else{
                DecimalFormat df = new DecimalFormat("#.##");
                cellValue = df.format(hssfCell.getNumericCellValue());
                String strArr = cellValue.substring(cellValue.lastIndexOf(POINT)+1,cellValue.length());
                if(strArr.equals("00")){
                    cellValue = cellValue.substring(0, cellValue.lastIndexOf(POINT));
                }
            }
            return cellValue;
        } else {
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }
    /**
     * 单元格格式
     * @param xssfCell
     * @return
     */
    public static String getXValue(XSSFCell xssfCell){
        if (xssfCell.getCellTypeEnum() == CellType.BOOLEAN) {
            return String.valueOf(xssfCell.getBooleanCellValue());
        } else if (xssfCell.getCellTypeEnum() == CellType.NUMERIC) {
            String cellValue = "";
            if(XSSFDateUtil.isCellDateFormatted(xssfCell)){
                Date date = XSSFDateUtil.getJavaDate(xssfCell.getNumericCellValue());
                cellValue = sdf.format(date);
            }else{
                DecimalFormat df = new DecimalFormat("#.##");
                cellValue = df.format(xssfCell.getNumericCellValue());
                String strArr = cellValue.substring(cellValue.lastIndexOf(POINT)+1);
                if(strArr.equals("00")){
                    cellValue = cellValue.substring(0, cellValue.lastIndexOf(POINT));
                }
            }
            return cellValue;
        } else {
            return String.valueOf(xssfCell.getStringCellValue());
        }
    }
    /**
     * 自定义xssf日期工具类
     *
     */
    static class XSSFDateUtil extends DateUtil {
        protected static int absoluteDay(Calendar cal, boolean use1904windowing) {
            return DateUtil.absoluteDay(cal, use1904windowing);
        }
    }

    /**
     *
     * @description 检查列是否相符
     * @author zhangz
     * @date 2020:03:12 11:14:19
     * @param file
     * @param type
     * @return
     **/

    public boolean checkExcelColumns(MultipartFile file,String type ) {

        List<String> headers =getHeaders(type);

//            System.out.println("checkExcelColumns:file =++++++++++++++++++ "+file.getOriginalFilename());
        List<ArrayList<String>> arrayLists = readExcelUtil.readExcel(file);

//        System.out.println("checkExcelColumns:arrayLists =++++++++++++++++++ "+arrayLists.toString());
        if (arrayLists.size() > 0 ){
            //判断excel中是否有值
            ArrayList<String> excelHeaders = arrayLists.get(0);
            int excelHeaderSize = excelHeaders.size();
            int headerSize = headers.size();
            if ( excelHeaderSize < headerSize ){
                return false;
            }else {
                int i = 0;
                boolean result = true;
                for(String head : headers){
                    //比较两个head的字符是否一样
                    if (!(head.equals(excelHeaders.get(i)))){
                        result =   false;
                        break;
                    }
                    i++;
                }

                return result;
            }
        }else {
            return false;
        }

    }


    /**
     *
     * @description 将excel转成list
     * @author zhangz
     * @date 2020:03:12 13:14:51
     * @param file excel文件
     * @param type 标记文件内容，以转成对应的list
     * @return list
     **/
    @SuppressWarnings("deprecation")
    public List getExcelData(MultipartFile file, String type ) throws IOException {
//        boolean b = checkExcelColumns(file, type);
        if (true){
            List<ArrayList<String>> readExcel = readExcelUtil.readExcel(file);
            if (BusinessTypeEnum.VENDOR_IMPORT_PRODUCT.getType().equals(type)){
                //生产商导入产品信息
                List<Product> products = new ArrayList<>();
                int rows = readExcel.size();
                int cols = readExcel.get(0).size();
                for (int r = 1;r< rows;r++){
                    //行循环
                    ArrayList<String> rowData = readExcel.get(r);
                    Product product = new Product();
                    product.setProductId(Long.parseLong(rowData.get(0)));
                    product.setProductName(rowData.get(1));
                    product.setSiteId(Long.parseLong(rowData.get(2)));
                    product.setSiteName(rowData.get(3));
                    product.setBatchId(Long.parseLong(rowData.get(4)));
                    product.setItemId(Long.parseLong(rowData.get(5)));
                    product.setItemName(rowData.get(6));
                    product.setVendor(Long.parseLong(rowData.get(7)));
                    product.setVendorName(rowData.get(8));
                    product.setDescription(rowData.get(9));
                    product.setComposition(rowData.get(10));
                    product.setIsDelete(0); //默认为false
                    products.add(product);
                }
                return products;
            }else if (BusinessTypeEnum.EXAM_IMPORT_PRODUCT.getType().equals(type)){
                //生产商导入检测产品信息
                List<Exam> exams = new ArrayList<>();
                int rows = readExcel.size();
                int cols = readExcel.get(0).size();
                for (int r = 1;r< rows;r++){
                    //行循环
                    ArrayList<String> rowData = readExcel.get(r);

                    Exam exam = new Exam();
                    exam.setExamId(Long.parseLong(rowData.get(0)));
                    exam.setExamName(rowData.get(1));
                    exam.setProductId(Long.parseLong(rowData.get(2)));
                    exam.setProductName(rowData.get(3));
                    exam.setExamBatchId(Long.parseLong(rowData.get(4)));
                    exam.setExamBatchName(rowData.get(5));
                    exam.setLaunchDate(DateUtil.parseYYYYMMDDDate(rowData.get(6)));
                    exam.setExamDate(DateUtil.parseYYYYMMDDDate(rowData.get(7)));
                    exam.setExamStatus(rowData.get(8));
                    exam.setSiteId(Long.parseLong(rowData.get(9)));
                    exam.setSiteName(rowData.get(10));
                    exam.setBatchId(Long.parseLong(rowData.get(11)));
                    exam.setBatchName(rowData.get(12));
                    exam.setProductedDate(DateUtil.parseYYYYMMDDDate(rowData.get(13)));
                    exam.setEffectiveDate(DateUtil.parseYYYYMMDDDate(rowData.get(14)));
                    exam.setVendorId(Long.parseLong(rowData.get(15)));
                    exam.setVendorName(rowData.get(16));
                    exam.setItemId(Long.parseLong(rowData.get(17)));

                    exams.add(exam);
                }
                return exams;
            }else {
                return  new ArrayList();
            }

        }else {
            return new ArrayList();
        }

    }

    /**
     *
     * @description 根据文件类型获取文件的头
     * @author zhangz
     * @date 2020:03:12 11:20:14
     * @param type
     * @return
     **/
    public List<String> getHeaders(String type){
        List headers = new ArrayList<>() ;
        final    String[] vendorImportHeaders = {"productId"," productName","siteId", "siteName", "batchId","itemId","itemName","vendor","vendorName","description" ,"composition","isDelete"};

        if (BusinessTypeEnum.VENDOR_IMPORT_PRODUCT.getType().equals(type)) {
            //VENDOR_IMPORT_PRODUCT
            headers = Arrays.asList(vendorImportHeaders);
        }
        return headers;
    }


}
