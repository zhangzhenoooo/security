package com.zhangz.security.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private Byte age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_date
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modify_date
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.type
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_address
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private String lastAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.company_name
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_delete
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public Byte getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_date
     *
     * @return the value of user.create_date
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_date
     *
     * @param createDate the value for user.create_date
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modify_date
     *
     * @return the value of user.modify_date
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modify_date
     *
     * @param modifyDate the value for user.modify_date
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.type
     *
     * @return the value of user.type
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.type
     *
     * @param type the value for user.type
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_address
     *
     * @return the value of user.last_address
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public String getLastAddress() {
        return lastAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_address
     *
     * @param lastAddress the value for user.last_address
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setLastAddress(String lastAddress) {
        this.lastAddress = lastAddress == null ? null : lastAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.company_name
     *
     * @return the value of user.company_name
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.company_name
     *
     * @param companyName the value for user.company_name
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_delete
     *
     * @return the value of user.is_delete
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_delete
     *
     * @param isDelete the value for user.is_delete
     *
     * @mbg.generated Sat Mar 07 16:19:21 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}