package com.inmind.mybatis.entity;

import java.util.Date;

public class AttachmentPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.company_id
     *
     * @mbg.generated
     */
    private Long companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.file_type
     *
     * @mbg.generated
     */
    private String fileType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.uri
     *
     * @mbg.generated
     */
    private String uri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.uploaded_by
     *
     * @mbg.generated
     */
    private Long uploadedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.id
     *
     * @return the value of attachment.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.id
     *
     * @param id the value for attachment.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.company_id
     *
     * @return the value of attachment.company_id
     *
     * @mbg.generated
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.company_id
     *
     * @param companyId the value for attachment.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.name
     *
     * @return the value of attachment.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.name
     *
     * @param name the value for attachment.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.type
     *
     * @return the value of attachment.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.type
     *
     * @param type the value for attachment.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.file_type
     *
     * @return the value of attachment.file_type
     *
     * @mbg.generated
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.file_type
     *
     * @param fileType the value for attachment.file_type
     *
     * @mbg.generated
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.uri
     *
     * @return the value of attachment.uri
     *
     * @mbg.generated
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.uri
     *
     * @param uri the value for attachment.uri
     *
     * @mbg.generated
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.uploaded_by
     *
     * @return the value of attachment.uploaded_by
     *
     * @mbg.generated
     */
    public Long getUploadedBy() {
        return uploadedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.uploaded_by
     *
     * @param uploadedBy the value for attachment.uploaded_by
     *
     * @mbg.generated
     */
    public void setUploadedBy(Long uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.created_by
     *
     * @return the value of attachment.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.created_by
     *
     * @param createdBy the value for attachment.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.updated_by
     *
     * @return the value of attachment.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.updated_by
     *
     * @param updatedBy the value for attachment.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.created_at
     *
     * @return the value of attachment.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.created_at
     *
     * @param createdAt the value for attachment.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.updated_at
     *
     * @return the value of attachment.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.updated_at
     *
     * @param updatedAt the value for attachment.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}