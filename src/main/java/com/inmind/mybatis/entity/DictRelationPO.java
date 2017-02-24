package com.inmind.mybatis.entity;

import java.util.Date;

public class DictRelationPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.dict_type
     *
     * @mbg.generated
     */
    private String dictType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.parent_code
     *
     * @mbg.generated
     */
    private Integer parentCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.child_code
     *
     * @mbg.generated
     */
    private Integer childCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_relation.parent_type
     *
     * @mbg.generated
     */
    private String parentType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.id
     *
     * @return the value of dict_relation.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.id
     *
     * @param id the value for dict_relation.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.dict_type
     *
     * @return the value of dict_relation.dict_type
     *
     * @mbg.generated
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.dict_type
     *
     * @param dictType the value for dict_relation.dict_type
     *
     * @mbg.generated
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.parent_code
     *
     * @return the value of dict_relation.parent_code
     *
     * @mbg.generated
     */
    public Integer getParentCode() {
        return parentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.parent_code
     *
     * @param parentCode the value for dict_relation.parent_code
     *
     * @mbg.generated
     */
    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.child_code
     *
     * @return the value of dict_relation.child_code
     *
     * @mbg.generated
     */
    public Integer getChildCode() {
        return childCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.child_code
     *
     * @param childCode the value for dict_relation.child_code
     *
     * @mbg.generated
     */
    public void setChildCode(Integer childCode) {
        this.childCode = childCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.created_by
     *
     * @return the value of dict_relation.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.created_by
     *
     * @param createdBy the value for dict_relation.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.updated_by
     *
     * @return the value of dict_relation.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.updated_by
     *
     * @param updatedBy the value for dict_relation.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.created_at
     *
     * @return the value of dict_relation.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.created_at
     *
     * @param createdAt the value for dict_relation.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.updated_at
     *
     * @return the value of dict_relation.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.updated_at
     *
     * @param updatedAt the value for dict_relation.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_relation.parent_type
     *
     * @return the value of dict_relation.parent_type
     *
     * @mbg.generated
     */
    public String getParentType() {
        return parentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_relation.parent_type
     *
     * @param parentType the value for dict_relation.parent_type
     *
     * @mbg.generated
     */
    public void setParentType(String parentType) {
        this.parentType = parentType == null ? null : parentType.trim();
    }
}