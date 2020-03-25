package com.zhangz.security.model;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.site_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String siteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.site_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String siteName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.batch_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String batchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.batch_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String batchName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.item_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.item_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String itemName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.vendor
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String vendor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.vendor_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String vendorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.composition
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String composition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.kindlist_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String kindlistId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.kind_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private String kindName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.is_delete
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    private Integer isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_id
     *
     * @return the value of product.product_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_id
     *
     * @param productId the value for product.product_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.site_id
     *
     * @return the value of product.site_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.site_id
     *
     * @param siteId the value for product.site_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.site_name
     *
     * @return the value of product.site_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.site_name
     *
     * @param siteName the value for product.site_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.batch_id
     *
     * @return the value of product.batch_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.batch_id
     *
     * @param batchId the value for product.batch_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.batch_name
     *
     * @return the value of product.batch_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getBatchName() {
        return batchName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.batch_name
     *
     * @param batchName the value for product.batch_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.item_id
     *
     * @return the value of product.item_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.item_id
     *
     * @param itemId the value for product.item_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.item_name
     *
     * @return the value of product.item_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.item_name
     *
     * @param itemName the value for product.item_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.vendor
     *
     * @return the value of product.vendor
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.vendor
     *
     * @param vendor the value for product.vendor
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.vendor_name
     *
     * @return the value of product.vendor_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.vendor_name
     *
     * @param vendorName the value for product.vendor_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_name
     *
     * @return the value of product.product_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_name
     *
     * @param productName the value for product.product_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.composition
     *
     * @return the value of product.composition
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getComposition() {
        return composition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.composition
     *
     * @param composition the value for product.composition
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setComposition(String composition) {
        this.composition = composition == null ? null : composition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.kindlist_id
     *
     * @return the value of product.kindlist_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getKindlistId() {
        return kindlistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.kindlist_id
     *
     * @param kindlistId the value for product.kindlist_id
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setKindlistId(String kindlistId) {
        this.kindlistId = kindlistId == null ? null : kindlistId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.kind_name
     *
     * @return the value of product.kind_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public String getKindName() {
        return kindName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.kind_name
     *
     * @param kindName the value for product.kind_name
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.is_delete
     *
     * @return the value of product.is_delete
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.is_delete
     *
     * @param isDelete the value for product.is_delete
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}