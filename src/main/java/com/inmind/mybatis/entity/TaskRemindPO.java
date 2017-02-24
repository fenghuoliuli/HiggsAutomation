package com.inmind.mybatis.entity;

import java.util.Date;

public class TaskRemindPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.task_id
     *
     * @mbg.generated
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.account_id
     *
     * @mbg.generated
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.remind_at
     *
     * @mbg.generated
     */
    private Date remindAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.target_id
     *
     * @mbg.generated
     */
    private Long targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.remind_status
     *
     * @mbg.generated
     */
    private Integer remindStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_remind.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.id
     *
     * @return the value of task_remind.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.id
     *
     * @param id the value for task_remind.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.task_id
     *
     * @return the value of task_remind.task_id
     *
     * @mbg.generated
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.task_id
     *
     * @param taskId the value for task_remind.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.account_id
     *
     * @return the value of task_remind.account_id
     *
     * @mbg.generated
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.account_id
     *
     * @param accountId the value for task_remind.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.remind_at
     *
     * @return the value of task_remind.remind_at
     *
     * @mbg.generated
     */
    public Date getRemindAt() {
        return remindAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.remind_at
     *
     * @param remindAt the value for task_remind.remind_at
     *
     * @mbg.generated
     */
    public void setRemindAt(Date remindAt) {
        this.remindAt = remindAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.target_id
     *
     * @return the value of task_remind.target_id
     *
     * @mbg.generated
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.target_id
     *
     * @param targetId the value for task_remind.target_id
     *
     * @mbg.generated
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.remind_status
     *
     * @return the value of task_remind.remind_status
     *
     * @mbg.generated
     */
    public Integer getRemindStatus() {
        return remindStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.remind_status
     *
     * @param remindStatus the value for task_remind.remind_status
     *
     * @mbg.generated
     */
    public void setRemindStatus(Integer remindStatus) {
        this.remindStatus = remindStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.created_by
     *
     * @return the value of task_remind.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.created_by
     *
     * @param createdBy the value for task_remind.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.updated_by
     *
     * @return the value of task_remind.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.updated_by
     *
     * @param updatedBy the value for task_remind.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.created_at
     *
     * @return the value of task_remind.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.created_at
     *
     * @param createdAt the value for task_remind.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.updated_at
     *
     * @return the value of task_remind.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.updated_at
     *
     * @param updatedAt the value for task_remind.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_remind.content
     *
     * @return the value of task_remind.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_remind.content
     *
     * @param content the value for task_remind.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}