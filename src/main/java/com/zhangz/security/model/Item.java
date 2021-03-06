package com.zhangz.security.model;

import java.util.Date;

public class Item {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.item_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.item_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String itemName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.description
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.site_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String siteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.composition
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String composition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.create_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.modify_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.is_delete
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.exam_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Date examDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.exam_status
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String examStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.verifier
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String verifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.effective_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private Integer effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.kind_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String kindId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.kind_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String kindName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.item_id
     *
     * @return the value of item.item_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.item_id
     *
     * @param itemId the value for item.item_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.item_name
     *
     * @return the value of item.item_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.item_name
     *
     * @param itemName the value for item.item_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.description
     *
     * @return the value of item.description
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.description
     *
     * @param description the value for item.description
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.site_id
     *
     * @return the value of item.site_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.site_id
     *
     * @param siteId the value for item.site_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.composition
     *
     * @return the value of item.composition
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getComposition() {
        return composition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.composition
     *
     * @param composition the value for item.composition
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setComposition(String composition) {
        this.composition = composition == null ? null : composition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.create_date
     *
     * @return the value of item.create_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.create_date
     *
     * @param createDate the value for item.create_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.modify_date
     *
     * @return the value of item.modify_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.modify_date
     *
     * @param modifyDate the value for item.modify_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.is_delete
     *
     * @return the value of item.is_delete
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.is_delete
     *
     * @param isDelete the value for item.is_delete
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.exam_date
     *
     * @return the value of item.exam_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Date getExamDate() {
        return examDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.exam_date
     *
     * @param examDate the value for item.exam_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.exam_status
     *
     * @return the value of item.exam_status
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getExamStatus() {
        return examStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.exam_status
     *
     * @param examStatus the value for item.exam_status
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus == null ? null : examStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.verifier
     *
     * @return the value of item.verifier
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getVerifier() {
        return verifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.verifier
     *
     * @param verifier the value for item.verifier
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.effective_date
     *
     * @return the value of item.effective_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Integer getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.effective_date
     *
     * @param effectiveDate the value for item.effective_date
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setEffectiveDate(Integer effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.kind_id
     *
     * @return the value of item.kind_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getKindId() {
        return kindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.kind_id
     *
     * @param kindId the value for item.kind_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setKindId(String kindId) {
        this.kindId = kindId == null ? null : kindId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.kind_name
     *
     * @return the value of item.kind_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getKindName() {
        return kindName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.kind_name
     *
     * @param kindName the value for item.kind_name
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }
}