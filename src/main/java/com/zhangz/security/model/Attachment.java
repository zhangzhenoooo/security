package com.zhangz.security.model;

public class Attachment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.attachment_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String attachmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.parent_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.url
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.type
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.attachment_id
     *
     * @return the value of attachment.attachment_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.attachment_id
     *
     * @param attachmentId the value for attachment.attachment_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId == null ? null : attachmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.parent_id
     *
     * @return the value of attachment.parent_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.parent_id
     *
     * @param parentId the value for attachment.parent_id
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.url
     *
     * @return the value of attachment.url
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.url
     *
     * @param url the value for attachment.url
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.type
     *
     * @return the value of attachment.type
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.type
     *
     * @param type the value for attachment.type
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}