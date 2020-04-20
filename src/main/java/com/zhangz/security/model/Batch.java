package com.zhangz.security.model;

import java.util.Date;

public class Batch {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.batch_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private String batchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.batch_name
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private String batchName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.create_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.modify_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.description
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.producted_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private Date productedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.effective_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private Date effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.is_delete
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.site_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private String siteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.creator_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch.exam_status
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    private String examStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.batch_id
     *
     * @return the value of batch.batch_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.batch_id
     *
     * @param batchId the value for batch.batch_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.batch_name
     *
     * @return the value of batch.batch_name
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public String getBatchName() {
        return batchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.batch_name
     *
     * @param batchName the value for batch.batch_name
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.create_date
     *
     * @return the value of batch.create_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.create_date
     *
     * @param createDate the value for batch.create_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.modify_date
     *
     * @return the value of batch.modify_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.modify_date
     *
     * @param modifyDate the value for batch.modify_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.description
     *
     * @return the value of batch.description
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.description
     *
     * @param description the value for batch.description
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.producted_date
     *
     * @return the value of batch.producted_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public Date getProductedDate() {
        return productedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.producted_date
     *
     * @param productedDate the value for batch.producted_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setProductedDate(Date productedDate) {
        this.productedDate = productedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.effective_date
     *
     * @return the value of batch.effective_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.effective_date
     *
     * @param effectiveDate the value for batch.effective_date
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.is_delete
     *
     * @return the value of batch.is_delete
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.is_delete
     *
     * @param isDelete the value for batch.is_delete
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.site_id
     *
     * @return the value of batch.site_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.site_id
     *
     * @param siteId the value for batch.site_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.creator_id
     *
     * @return the value of batch.creator_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.creator_id
     *
     * @param creatorId the value for batch.creator_id
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch.exam_status
     *
     * @return the value of batch.exam_status
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public String getExamStatus() {
        return examStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch.exam_status
     *
     * @param examStatus the value for batch.exam_status
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus == null ? null : examStatus.trim();
    }
}