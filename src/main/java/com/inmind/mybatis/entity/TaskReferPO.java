package com.inmind.mybatis.entity;

import java.util.Date;

public class TaskReferPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.refer_id
     *
     * @mbg.generated
     */
    private Long referId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.refer_name
     *
     * @mbg.generated
     */
    private String referName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.org_id
     *
     * @mbg.generated
     */
    private Long orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.refer_type
     *
     * @mbg.generated
     */
    private Integer referType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_refer.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.id
     *
     * @return the value of task_refer.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.id
     *
     * @param id the value for task_refer.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.refer_id
     *
     * @return the value of task_refer.refer_id
     *
     * @mbg.generated
     */
    public Long getReferId() {
        return referId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.refer_id
     *
     * @param referId the value for task_refer.refer_id
     *
     * @mbg.generated
     */
    public void setReferId(Long referId) {
        this.referId = referId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.refer_name
     *
     * @return the value of task_refer.refer_name
     *
     * @mbg.generated
     */
    public String getReferName() {
        return referName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.refer_name
     *
     * @param referName the value for task_refer.refer_name
     *
     * @mbg.generated
     */
    public void setReferName(String referName) {
        this.referName = referName == null ? null : referName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.org_id
     *
     * @return the value of task_refer.org_id
     *
     * @mbg.generated
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.org_id
     *
     * @param orgId the value for task_refer.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.refer_type
     *
     * @return the value of task_refer.refer_type
     *
     * @mbg.generated
     */
    public Integer getReferType() {
        return referType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.refer_type
     *
     * @param referType the value for task_refer.refer_type
     *
     * @mbg.generated
     */
    public void setReferType(Integer referType) {
        this.referType = referType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.created_by
     *
     * @return the value of task_refer.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.created_by
     *
     * @param createdBy the value for task_refer.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.updated_by
     *
     * @return the value of task_refer.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.updated_by
     *
     * @param updatedBy the value for task_refer.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.created_at
     *
     * @return the value of task_refer.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.created_at
     *
     * @param createdAt the value for task_refer.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_refer.updated_at
     *
     * @return the value of task_refer.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_refer.updated_at
     *
     * @param updatedAt the value for task_refer.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}