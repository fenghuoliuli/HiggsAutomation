package com.inmind.mybatis.entity;

import java.util.Date;

public class TaskSchedulePO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_schedule.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_schedule.relate_id
     *
     * @mbg.generated
     */
    private Long relateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_schedule.schedule_type
     *
     * @mbg.generated
     */
    private Integer scheduleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_schedule.created_time
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_schedule.id
     *
     * @return the value of task_schedule.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_schedule.id
     *
     * @param id the value for task_schedule.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_schedule.relate_id
     *
     * @return the value of task_schedule.relate_id
     *
     * @mbg.generated
     */
    public Long getRelateId() {
        return relateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_schedule.relate_id
     *
     * @param relateId the value for task_schedule.relate_id
     *
     * @mbg.generated
     */
    public void setRelateId(Long relateId) {
        this.relateId = relateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_schedule.schedule_type
     *
     * @return the value of task_schedule.schedule_type
     *
     * @mbg.generated
     */
    public Integer getScheduleType() {
        return scheduleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_schedule.schedule_type
     *
     * @param scheduleType the value for task_schedule.schedule_type
     *
     * @mbg.generated
     */
    public void setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_schedule.created_time
     *
     * @return the value of task_schedule.created_time
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_schedule.created_time
     *
     * @param createdTime the value for task_schedule.created_time
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}