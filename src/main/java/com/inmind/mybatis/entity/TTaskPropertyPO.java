package com.inmind.mybatis.entity;

import java.util.Date;

public class TTaskPropertyPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.company_id
     *
     * @mbg.generated
     */
    private Long companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.task_type
     *
     * @mbg.generated
     */
    private Integer taskType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.interval_time
     *
     * @mbg.generated
     */
    private Integer intervalTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.dead_time
     *
     * @mbg.generated
     */
    private String deadTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.remind_time
     *
     * @mbg.generated
     */
    private String remindTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.priority
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.task_group_code
     *
     * @mbg.generated
     */
    private String taskGroupCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.executor_role
     *
     * @mbg.generated
     */
    private String executorRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.target_req
     *
     * @mbg.generated
     */
    private Integer targetReq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.is_autoclose
     *
     * @mbg.generated
     */
    private Integer isAutoclose;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_property.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.id
     *
     * @return the value of t_task_property.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.id
     *
     * @param id the value for t_task_property.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.company_id
     *
     * @return the value of t_task_property.company_id
     *
     * @mbg.generated
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.company_id
     *
     * @param companyId the value for t_task_property.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.name
     *
     * @return the value of t_task_property.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.name
     *
     * @param name the value for t_task_property.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.code
     *
     * @return the value of t_task_property.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.code
     *
     * @param code the value for t_task_property.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.task_type
     *
     * @return the value of t_task_property.task_type
     *
     * @mbg.generated
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.task_type
     *
     * @param taskType the value for t_task_property.task_type
     *
     * @mbg.generated
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.interval_time
     *
     * @return the value of t_task_property.interval_time
     *
     * @mbg.generated
     */
    public Integer getIntervalTime() {
        return intervalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.interval_time
     *
     * @param intervalTime the value for t_task_property.interval_time
     *
     * @mbg.generated
     */
    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.dead_time
     *
     * @return the value of t_task_property.dead_time
     *
     * @mbg.generated
     */
    public String getDeadTime() {
        return deadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.dead_time
     *
     * @param deadTime the value for t_task_property.dead_time
     *
     * @mbg.generated
     */
    public void setDeadTime(String deadTime) {
        this.deadTime = deadTime == null ? null : deadTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.remind_time
     *
     * @return the value of t_task_property.remind_time
     *
     * @mbg.generated
     */
    public String getRemindTime() {
        return remindTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.remind_time
     *
     * @param remindTime the value for t_task_property.remind_time
     *
     * @mbg.generated
     */
    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime == null ? null : remindTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.priority
     *
     * @return the value of t_task_property.priority
     *
     * @mbg.generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.priority
     *
     * @param priority the value for t_task_property.priority
     *
     * @mbg.generated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.task_group_code
     *
     * @return the value of t_task_property.task_group_code
     *
     * @mbg.generated
     */
    public String getTaskGroupCode() {
        return taskGroupCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.task_group_code
     *
     * @param taskGroupCode the value for t_task_property.task_group_code
     *
     * @mbg.generated
     */
    public void setTaskGroupCode(String taskGroupCode) {
        this.taskGroupCode = taskGroupCode == null ? null : taskGroupCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.created_by
     *
     * @return the value of t_task_property.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.created_by
     *
     * @param createdBy the value for t_task_property.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.updated_by
     *
     * @return the value of t_task_property.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.updated_by
     *
     * @param updatedBy the value for t_task_property.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.created_at
     *
     * @return the value of t_task_property.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.created_at
     *
     * @param createdAt the value for t_task_property.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.updated_at
     *
     * @return the value of t_task_property.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.updated_at
     *
     * @param updatedAt the value for t_task_property.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.executor_role
     *
     * @return the value of t_task_property.executor_role
     *
     * @mbg.generated
     */
    public String getExecutorRole() {
        return executorRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.executor_role
     *
     * @param executorRole the value for t_task_property.executor_role
     *
     * @mbg.generated
     */
    public void setExecutorRole(String executorRole) {
        this.executorRole = executorRole == null ? null : executorRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.target_req
     *
     * @return the value of t_task_property.target_req
     *
     * @mbg.generated
     */
    public Integer getTargetReq() {
        return targetReq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.target_req
     *
     * @param targetReq the value for t_task_property.target_req
     *
     * @mbg.generated
     */
    public void setTargetReq(Integer targetReq) {
        this.targetReq = targetReq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.status
     *
     * @return the value of t_task_property.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.status
     *
     * @param status the value for t_task_property.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.is_autoclose
     *
     * @return the value of t_task_property.is_autoclose
     *
     * @mbg.generated
     */
    public Integer getIsAutoclose() {
        return isAutoclose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.is_autoclose
     *
     * @param isAutoclose the value for t_task_property.is_autoclose
     *
     * @mbg.generated
     */
    public void setIsAutoclose(Integer isAutoclose) {
        this.isAutoclose = isAutoclose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_property.description
     *
     * @return the value of t_task_property.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_property.description
     *
     * @param description the value for t_task_property.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}