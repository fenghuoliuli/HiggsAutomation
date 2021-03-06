package com.inmind.mybatis.entity;

import java.util.Date;

public class TagPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.target_type
     *
     * @mbg.generated
     */
    private Integer targetType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.target_id
     *
     * @mbg.generated
     */
    private Long targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.property
     *
     * @mbg.generated
     */
    private String property;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.dict_type
     *
     * @mbg.generated
     */
    private String dictType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.dict_code
     *
     * @mbg.generated
     */
    private Integer dictCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.is_generated
     *
     * @mbg.generated
     */
    private Integer isGenerated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.id
     *
     * @return the value of tag.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.id
     *
     * @param id the value for tag.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.target_type
     *
     * @return the value of tag.target_type
     *
     * @mbg.generated
     */
    public Integer getTargetType() {
        return targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.target_type
     *
     * @param targetType the value for tag.target_type
     *
     * @mbg.generated
     */
    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.target_id
     *
     * @return the value of tag.target_id
     *
     * @mbg.generated
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.target_id
     *
     * @param targetId the value for tag.target_id
     *
     * @mbg.generated
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.property
     *
     * @return the value of tag.property
     *
     * @mbg.generated
     */
    public String getProperty() {
        return property;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.property
     *
     * @param property the value for tag.property
     *
     * @mbg.generated
     */
    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.dict_type
     *
     * @return the value of tag.dict_type
     *
     * @mbg.generated
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.dict_type
     *
     * @param dictType the value for tag.dict_type
     *
     * @mbg.generated
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.dict_code
     *
     * @return the value of tag.dict_code
     *
     * @mbg.generated
     */
    public Integer getDictCode() {
        return dictCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.dict_code
     *
     * @param dictCode the value for tag.dict_code
     *
     * @mbg.generated
     */
    public void setDictCode(Integer dictCode) {
        this.dictCode = dictCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.is_generated
     *
     * @return the value of tag.is_generated
     *
     * @mbg.generated
     */
    public Integer getIsGenerated() {
        return isGenerated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.is_generated
     *
     * @param isGenerated the value for tag.is_generated
     *
     * @mbg.generated
     */
    public void setIsGenerated(Integer isGenerated) {
        this.isGenerated = isGenerated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.deleted
     *
     * @return the value of tag.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.deleted
     *
     * @param deleted the value for tag.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.created_by
     *
     * @return the value of tag.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.created_by
     *
     * @param createdBy the value for tag.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.updated_by
     *
     * @return the value of tag.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.updated_by
     *
     * @param updatedBy the value for tag.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.created_at
     *
     * @return the value of tag.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.created_at
     *
     * @param createdAt the value for tag.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.updated_at
     *
     * @return the value of tag.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.updated_at
     *
     * @param updatedAt the value for tag.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}