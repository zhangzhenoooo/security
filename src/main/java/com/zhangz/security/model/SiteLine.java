package com.zhangz.security.model;

public class SiteLine {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column siteline.siteline_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String sitelineId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column siteline.site_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String siteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column siteline.url
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column siteline.siteline_id
     *
     * @return the value of siteline.siteline_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getSitelineId() {
        return sitelineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column siteline.siteline_id
     *
     * @param sitelineId the value for siteline.siteline_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setSitelineId(String sitelineId) {
        this.sitelineId = sitelineId == null ? null : sitelineId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column siteline.site_id
     *
     * @return the value of siteline.site_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column siteline.site_id
     *
     * @param siteId the value for siteline.site_id
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column siteline.url
     *
     * @return the value of siteline.url
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column siteline.url
     *
     * @param url the value for siteline.url
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}