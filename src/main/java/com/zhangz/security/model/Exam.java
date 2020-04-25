package com.zhangz.security.model;

import java.util.Date;

public class Exam {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.exam_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.product_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.product_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.exam_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String examName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.exam_batch_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String examBatchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.exam_batch_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String examBatchName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.examer_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String examerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.launch_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Date launchDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.exam_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Date examDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.exam_status
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String examStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.site_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String siteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.site_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String siteName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.batch_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String batchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.batch_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String batchName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.producted_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Date productedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.effective_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Date effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.vendor_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String vendorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.vendor_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String vendorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.item_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String itemId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.exam_id
     *
     * @return the value of exam.exam_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.exam_id
     *
     * @param examId the value for exam.exam_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.product_id
     *
     * @return the value of exam.product_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.product_id
     *
     * @param productId the value for exam.product_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.product_name
     *
     * @return the value of exam.product_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.product_name
     *
     * @param productName the value for exam.product_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.exam_name
     *
     * @return the value of exam.exam_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getExamName() {
        return examName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.exam_name
     *
     * @param examName the value for exam.exam_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.exam_batch_id
     *
     * @return the value of exam.exam_batch_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getExamBatchId() {
        return examBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.exam_batch_id
     *
     * @param examBatchId the value for exam.exam_batch_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamBatchId(String examBatchId) {
        this.examBatchId = examBatchId == null ? null : examBatchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.exam_batch_name
     *
     * @return the value of exam.exam_batch_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getExamBatchName() {
        return examBatchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.exam_batch_name
     *
     * @param examBatchName the value for exam.exam_batch_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamBatchName(String examBatchName) {
        this.examBatchName = examBatchName == null ? null : examBatchName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.examer_id
     *
     * @return the value of exam.examer_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getExamerId() {
        return examerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.examer_id
     *
     * @param examerId the value for exam.examer_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamerId(String examerId) {
        this.examerId = examerId == null ? null : examerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.launch_date
     *
     * @return the value of exam.launch_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Date getLaunchDate() {
        return launchDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.launch_date
     *
     * @param launchDate the value for exam.launch_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.exam_date
     *
     * @return the value of exam.exam_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Date getExamDate() {
        return examDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.exam_date
     *
     * @param examDate the value for exam.exam_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.exam_status
     *
     * @return the value of exam.exam_status
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getExamStatus() {
        return examStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.exam_status
     *
     * @param examStatus the value for exam.exam_status
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus == null ? null : examStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.site_id
     *
     * @return the value of exam.site_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.site_id
     *
     * @param siteId the value for exam.site_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.site_name
     *
     * @return the value of exam.site_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.site_name
     *
     * @param siteName the value for exam.site_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.batch_id
     *
     * @return the value of exam.batch_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.batch_id
     *
     * @param batchId the value for exam.batch_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.batch_name
     *
     * @return the value of exam.batch_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getBatchName() {
        return batchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.batch_name
     *
     * @param batchName the value for exam.batch_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.producted_date
     *
     * @return the value of exam.producted_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Date getProductedDate() {
        return productedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.producted_date
     *
     * @param productedDate the value for exam.producted_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setProductedDate(Date productedDate) {
        this.productedDate = productedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.effective_date
     *
     * @return the value of exam.effective_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.effective_date
     *
     * @param effectiveDate the value for exam.effective_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.vendor_id
     *
     * @return the value of exam.vendor_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.vendor_id
     *
     * @param vendorId the value for exam.vendor_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.vendor_name
     *
     * @return the value of exam.vendor_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.vendor_name
     *
     * @param vendorName the value for exam.vendor_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.item_id
     *
     * @return the value of exam.item_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.item_id
     *
     * @param itemId the value for exam.item_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }
}