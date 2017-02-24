package com.inmind.mybatis.entity;

import java.util.Date;

public class TRemindPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.company_id
     *
     * @mbg.generated
     */
    private Long companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.task_id
     *
     * @mbg.generated
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.project_id
     *
     * @mbg.generated
     */
    private Long projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.account_id
     *
     * @mbg.generated
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.remind_at
     *
     * @mbg.generated
     */
    private Date remindAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.priority
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.source_type
     *
     * @mbg.generated
     */
    private Integer sourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.source_id
     *
     * @mbg.generated
     */
    private Long sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.remind_ref_id
     *
     * @mbg.generated
     */
    private Long remindRefId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.remind_type
     *
     * @mbg.generated
     */
    private Integer remindType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.repeat_day
     *
     * @mbg.generated
     */
    private String repeatDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.repeat_type
     *
     * @mbg.generated
     */
    private Integer repeatType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.started_at
     *
     * @mbg.generated
     */
    private Date startedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.finished_at
     *
     * @mbg.generated
     */
    private Date finishedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remind.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.id
     *
     * @return the value of t_remind.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.id
     *
     * @param id the value for t_remind.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.company_id
     *
     * @return the value of t_remind.company_id
     *
     * @mbg.generated
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.company_id
     *
     * @param companyId the value for t_remind.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.task_id
     *
     * @return the value of t_remind.task_id
     *
     * @mbg.generated
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.task_id
     *
     * @param taskId the value for t_remind.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.project_id
     *
     * @return the value of t_remind.project_id
     *
     * @mbg.generated
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.project_id
     *
     * @param projectId the value for t_remind.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.account_id
     *
     * @return the value of t_remind.account_id
     *
     * @mbg.generated
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.account_id
     *
     * @param accountId the value for t_remind.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.remind_at
     *
     * @return the value of t_remind.remind_at
     *
     * @mbg.generated
     */
    public Date getRemindAt() {
        return remindAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.remind_at
     *
     * @param remindAt the value for t_remind.remind_at
     *
     * @mbg.generated
     */
    public void setRemindAt(Date remindAt) {
        this.remindAt = remindAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.priority
     *
     * @return the value of t_remind.priority
     *
     * @mbg.generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.priority
     *
     * @param priority the value for t_remind.priority
     *
     * @mbg.generated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.title
     *
     * @return the value of t_remind.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.title
     *
     * @param title the value for t_remind.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.source_type
     *
     * @return the value of t_remind.source_type
     *
     * @mbg.generated
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.source_type
     *
     * @param sourceType the value for t_remind.source_type
     *
     * @mbg.generated
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.source_id
     *
     * @return the value of t_remind.source_id
     *
     * @mbg.generated
     */
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.source_id
     *
     * @param sourceId the value for t_remind.source_id
     *
     * @mbg.generated
     */
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.remind_ref_id
     *
     * @return the value of t_remind.remind_ref_id
     *
     * @mbg.generated
     */
    public Long getRemindRefId() {
        return remindRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.remind_ref_id
     *
     * @param remindRefId the value for t_remind.remind_ref_id
     *
     * @mbg.generated
     */
    public void setRemindRefId(Long remindRefId) {
        this.remindRefId = remindRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.remind_type
     *
     * @return the value of t_remind.remind_type
     *
     * @mbg.generated
     */
    public Integer getRemindType() {
        return remindType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.remind_type
     *
     * @param remindType the value for t_remind.remind_type
     *
     * @mbg.generated
     */
    public void setRemindType(Integer remindType) {
        this.remindType = remindType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.repeat_day
     *
     * @return the value of t_remind.repeat_day
     *
     * @mbg.generated
     */
    public String getRepeatDay() {
        return repeatDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.repeat_day
     *
     * @param repeatDay the value for t_remind.repeat_day
     *
     * @mbg.generated
     */
    public void setRepeatDay(String repeatDay) {
        this.repeatDay = repeatDay == null ? null : repeatDay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.repeat_type
     *
     * @return the value of t_remind.repeat_type
     *
     * @mbg.generated
     */
    public Integer getRepeatType() {
        return repeatType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.repeat_type
     *
     * @param repeatType the value for t_remind.repeat_type
     *
     * @mbg.generated
     */
    public void setRepeatType(Integer repeatType) {
        this.repeatType = repeatType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.status
     *
     * @return the value of t_remind.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.status
     *
     * @param status the value for t_remind.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.started_at
     *
     * @return the value of t_remind.started_at
     *
     * @mbg.generated
     */
    public Date getStartedAt() {
        return startedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.started_at
     *
     * @param startedAt the value for t_remind.started_at
     *
     * @mbg.generated
     */
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.finished_at
     *
     * @return the value of t_remind.finished_at
     *
     * @mbg.generated
     */
    public Date getFinishedAt() {
        return finishedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.finished_at
     *
     * @param finishedAt the value for t_remind.finished_at
     *
     * @mbg.generated
     */
    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.created_by
     *
     * @return the value of t_remind.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.created_by
     *
     * @param createdBy the value for t_remind.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.updated_by
     *
     * @return the value of t_remind.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.updated_by
     *
     * @param updatedBy the value for t_remind.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.created_at
     *
     * @return the value of t_remind.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.created_at
     *
     * @param createdAt the value for t_remind.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.updated_at
     *
     * @return the value of t_remind.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.updated_at
     *
     * @param updatedAt the value for t_remind.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remind.description
     *
     * @return the value of t_remind.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remind.description
     *
     * @param description the value for t_remind.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}