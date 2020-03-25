package com.zhangz.security.model;

import java.util.Date;

public class ExamBatch {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.batch_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String batchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.batch_name
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String batchName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.create_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.modify_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.description
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.producted_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private Date productedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.effective_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private Date effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.is_delete
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.site_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String siteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.creator_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.exam_status
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String examStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.product_batch_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String productBatchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exambatch.product_batch_name
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String productBatchName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.batch_id
     *
     * @return the value of exambatch.batch_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.batch_id
     *
     * @param batchId the value for exambatch.batch_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.batch_name
     *
     * @return the value of exambatch.batch_name
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getBatchName() {
        return batchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.batch_name
     *
     * @param batchName the value for exambatch.batch_name
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.create_date
     *
     * @return the value of exambatch.create_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.create_date
     *
     * @param createDate the value for exambatch.create_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.modify_date
     *
     * @return the value of exambatch.modify_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.modify_date
     *
     * @param modifyDate the value for exambatch.modify_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.description
     *
     * @return the value of exambatch.description
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.description
     *
     * @param description the value for exambatch.description
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.producted_date
     *
     * @return the value of exambatch.producted_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public Date getProductedDate() {
        return productedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.producted_date
     *
     * @param productedDate the value for exambatch.producted_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setProductedDate(Date productedDate) {
        this.productedDate = productedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.effective_date
     *
     * @return the value of exambatch.effective_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.effective_date
     *
     * @param effectiveDate the value for exambatch.effective_date
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.is_delete
     *
     * @return the value of exambatch.is_delete
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.is_delete
     *
     * @param isDelete the value for exambatch.is_delete
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.site_id
     *
     * @return the value of exambatch.site_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.site_id
     *
     * @param siteId the value for exambatch.site_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.creator_id
     *
     * @return the value of exambatch.creator_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.creator_id
     *
     * @param creatorId the value for exambatch.creator_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.exam_status
     *
     * @return the value of exambatch.exam_status
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getExamStatus() {
        return examStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.exam_status
     *
     * @param examStatus the value for exambatch.exam_status
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus == null ? null : examStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.product_batch_id
     *
     * @return the value of exambatch.product_batch_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getProductBatchId() {
        return productBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.product_batch_id
     *
     * @param productBatchId the value for exambatch.product_batch_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setProductBatchId(String productBatchId) {
        this.productBatchId = productBatchId == null ? null : productBatchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exambatch.product_batch_name
     *
     * @return the value of exambatch.product_batch_name
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getProductBatchName() {
        return productBatchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exambatch.product_batch_name
     *
     * @param productBatchName the value for exambatch.product_batch_name
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setProductBatchName(String productBatchName) {
        this.productBatchName = productBatchName == null ? null : productBatchName.trim();
    }
}