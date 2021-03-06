package com.inmind.mybatis.entity;

import java.util.Date;

public class TaskOwnerPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.task_id
     *
     * @mbg.generated
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.target_id
     *
     * @mbg.generated
     */
    private Long targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.account_id
     *
     * @mbg.generated
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.role
     *
     * @mbg.generated
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.project_role
     *
     * @mbg.generated
     */
    private String projectRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.desc_text
     *
     * @mbg.generated
     */
    private String descText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_owner.main_target_id
     *
     * @mbg.generated
     */
    private Long mainTargetId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.id
     *
     * @return the value of task_owner.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.id
     *
     * @param id the value for task_owner.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.task_id
     *
     * @return the value of task_owner.task_id
     *
     * @mbg.generated
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.task_id
     *
     * @param taskId the value for task_owner.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.target_id
     *
     * @return the value of task_owner.target_id
     *
     * @mbg.generated
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.target_id
     *
     * @param targetId the value for task_owner.target_id
     *
     * @mbg.generated
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.account_id
     *
     * @return the value of task_owner.account_id
     *
     * @mbg.generated
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.account_id
     *
     * @param accountId the value for task_owner.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.role
     *
     * @return the value of task_owner.role
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.role
     *
     * @param role the value for task_owner.role
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.project_role
     *
     * @return the value of task_owner.project_role
     *
     * @mbg.generated
     */
    public String getProjectRole() {
        return projectRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.project_role
     *
     * @param projectRole the value for task_owner.project_role
     *
     * @mbg.generated
     */
    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole == null ? null : projectRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.desc_text
     *
     * @return the value of task_owner.desc_text
     *
     * @mbg.generated
     */
    public String getDescText() {
        return descText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.desc_text
     *
     * @param descText the value for task_owner.desc_text
     *
     * @mbg.generated
     */
    public void setDescText(String descText) {
        this.descText = descText == null ? null : descText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.created_by
     *
     * @return the value of task_owner.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.created_by
     *
     * @param createdBy the value for task_owner.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.updated_by
     *
     * @return the value of task_owner.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.updated_by
     *
     * @param updatedBy the value for task_owner.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.created_at
     *
     * @return the value of task_owner.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.created_at
     *
     * @param createdAt the value for task_owner.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.updated_at
     *
     * @return the value of task_owner.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.updated_at
     *
     * @param updatedAt the value for task_owner.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_owner.main_target_id
     *
     * @return the value of task_owner.main_target_id
     *
     * @mbg.generated
     */
    public Long getMainTargetId() {
        return mainTargetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_owner.main_target_id
     *
     * @param mainTargetId the value for task_owner.main_target_id
     *
     * @mbg.generated
     */
    public void setMainTargetId(Long mainTargetId) {
        this.mainTargetId = mainTargetId;
    }
}