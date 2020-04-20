package com.zhangz.security.model;

import com.zhangz.security.plugin.AutoId;

import java.util.Date;

public class Site {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.site_id
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    @AutoId
    private String siteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.site_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String siteName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.address
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.producer_id
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String producerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.producer_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String producerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.is_delete
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.exam_date
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private Date examDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.exam_status
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String examStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.verifier
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String verifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.verifierName
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String verifiername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.province_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String provinceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.province_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String provinceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.city_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String cityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.city_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String cityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.county_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String countyCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.county_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    private String countyName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.site_id
     *
     * @return the value of site.site_id
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.site_id
     *
     * @param siteId the value for site.site_id
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.site_name
     *
     * @return the value of site.site_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.site_name
     *
     * @param siteName the value for site.site_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.address
     *
     * @return the value of site.address
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.address
     *
     * @param address the value for site.address
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.producer_id
     *
     * @return the value of site.producer_id
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getProducerId() {
        return producerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.producer_id
     *
     * @param producerId the value for site.producer_id
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setProducerId(String producerId) {
        this.producerId = producerId == null ? null : producerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.producer_name
     *
     * @return the value of site.producer_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getProducerName() {
        return producerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.producer_name
     *
     * @param producerName the value for site.producer_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setProducerName(String producerName) {
        this.producerName = producerName == null ? null : producerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.is_delete
     *
     * @return the value of site.is_delete
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.is_delete
     *
     * @param isDelete the value for site.is_delete
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.exam_date
     *
     * @return the value of site.exam_date
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public Date getExamDate() {
        return examDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.exam_date
     *
     * @param examDate the value for site.exam_date
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.exam_status
     *
     * @return the value of site.exam_status
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getExamStatus() {
        return examStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.exam_status
     *
     * @param examStatus the value for site.exam_status
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus == null ? null : examStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.verifier
     *
     * @return the value of site.verifier
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getVerifier() {
        return verifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.verifier
     *
     * @param verifier the value for site.verifier
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.verifierName
     *
     * @return the value of site.verifierName
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getVerifiername() {
        return verifiername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.verifierName
     *
     * @param verifiername the value for site.verifierName
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setVerifiername(String verifiername) {
        this.verifiername = verifiername == null ? null : verifiername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.province_code
     *
     * @return the value of site.province_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.province_code
     *
     * @param provinceCode the value for site.province_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.province_name
     *
     * @return the value of site.province_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.province_name
     *
     * @param provinceName the value for site.province_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.city_code
     *
     * @return the value of site.city_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.city_code
     *
     * @param cityCode the value for site.city_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.city_name
     *
     * @return the value of site.city_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.city_name
     *
     * @param cityName the value for site.city_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.county_code
     *
     * @return the value of site.county_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.county_code
     *
     * @param countyCode the value for site.county_code
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.county_name
     *
     * @return the value of site.county_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.county_name
     *
     * @param countyName the value for site.county_name
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }
}