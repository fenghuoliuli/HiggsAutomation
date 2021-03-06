package com.inmind.mybatis.entity;

import java.util.Date;

public class TaskPropertyPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.task_type
     *
     * @mbg.generated
     */
    private Integer taskType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.interval_time
     *
     * @mbg.generated
     */
    private Integer intervalTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.dead_time
     *
     * @mbg.generated
     */
    private String deadTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.remind_time
     *
     * @mbg.generated
     */
    private String remindTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.show_order
     *
     * @mbg.generated
     */
    private Integer showOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.task_group_code
     *
     * @mbg.generated
     */
    private String taskGroupCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.project_roles
     *
     * @mbg.generated
     */
    private String projectRoles;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.helper_role
     *
     * @mbg.generated
     */
    private String helperRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.prop_status
     *
     * @mbg.generated
     */
    private Integer propStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_property.pot_co_role
     *
     * @mbg.generated
     */
    private String potCoRole;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.id
     *
     * @return the value of task_property.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.id
     *
     * @param id the value for task_property.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.name
     *
     * @return the value of task_property.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.name
     *
     * @param name the value for task_property.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.code
     *
     * @return the value of task_property.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.code
     *
     * @param code the value for task_property.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.task_type
     *
     * @return the value of task_property.task_type
     *
     * @mbg.generated
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.task_type
     *
     * @param taskType the value for task_property.task_type
     *
     * @mbg.generated
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.interval_time
     *
     * @return the value of task_property.interval_time
     *
     * @mbg.generated
     */
    public Integer getIntervalTime() {
        return intervalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.interval_time
     *
     * @param intervalTime the value for task_property.interval_time
     *
     * @mbg.generated
     */
    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.dead_time
     *
     * @return the value of task_property.dead_time
     *
     * @mbg.generated
     */
    public String getDeadTime() {
        return deadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.dead_time
     *
     * @param deadTime the value for task_property.dead_time
     *
     * @mbg.generated
     */
    public void setDeadTime(String deadTime) {
        this.deadTime = deadTime == null ? null : deadTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.remind_time
     *
     * @return the value of task_property.remind_time
     *
     * @mbg.generated
     */
    public String getRemindTime() {
        return remindTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.remind_time
     *
     * @param remindTime the value for task_property.remind_time
     *
     * @mbg.generated
     */
    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime == null ? null : remindTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.show_order
     *
     * @return the value of task_property.show_order
     *
     * @mbg.generated
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.show_order
     *
     * @param showOrder the value for task_property.show_order
     *
     * @mbg.generated
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.task_group_code
     *
     * @return the value of task_property.task_group_code
     *
     * @mbg.generated
     */
    public String getTaskGroupCode() {
        return taskGroupCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.task_group_code
     *
     * @param taskGroupCode the value for task_property.task_group_code
     *
     * @mbg.generated
     */
    public void setTaskGroupCode(String taskGroupCode) {
        this.taskGroupCode = taskGroupCode == null ? null : taskGroupCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.created_by
     *
     * @return the value of task_property.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.created_by
     *
     * @param createdBy the value for task_property.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.updated_by
     *
     * @return the value of task_property.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.updated_by
     *
     * @param updatedBy the value for task_property.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.created_at
     *
     * @return the value of task_property.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.created_at
     *
     * @param createdAt the value for task_property.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.updated_at
     *
     * @return the value of task_property.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.updated_at
     *
     * @param updatedAt the value for task_property.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.project_roles
     *
     * @return the value of task_property.project_roles
     *
     * @mbg.generated
     */
    public String getProjectRoles() {
        return projectRoles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.project_roles
     *
     * @param projectRoles the value for task_property.project_roles
     *
     * @mbg.generated
     */
    public void setProjectRoles(String projectRoles) {
        this.projectRoles = projectRoles == null ? null : projectRoles.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.helper_role
     *
     * @return the value of task_property.helper_role
     *
     * @mbg.generated
     */
    public String getHelperRole() {
        return helperRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.helper_role
     *
     * @param helperRole the value for task_property.helper_role
     *
     * @mbg.generated
     */
    public void setHelperRole(String helperRole) {
        this.helperRole = helperRole == null ? null : helperRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.prop_status
     *
     * @return the value of task_property.prop_status
     *
     * @mbg.generated
     */
    public Integer getPropStatus() {
        return propStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.prop_status
     *
     * @param propStatus the value for task_property.prop_status
     *
     * @mbg.generated
     */
    public void setPropStatus(Integer propStatus) {
        this.propStatus = propStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_property.pot_co_role
     *
     * @return the value of task_property.pot_co_role
     *
     * @mbg.generated
     */
    public String getPotCoRole() {
        return potCoRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_property.pot_co_role
     *
     * @param potCoRole the value for task_property.pot_co_role
     *
     * @mbg.generated
     */
    public void setPotCoRole(String potCoRole) {
        this.potCoRole = potCoRole == null ? null : potCoRole.trim();
    }
}