package com.inmind.mybatis.entity;

import java.util.Date;

public class EventTriggerPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.processor
     *
     * @mbg.generated
     */
    private String processor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.task_id
     *
     * @mbg.generated
     */
    private Integer taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.trigger_value
     *
     * @mbg.generated
     */
    private String triggerValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.trigger_type
     *
     * @mbg.generated
     */
    private String triggerType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_trigger.event_json
     *
     * @mbg.generated
     */
    private String eventJson;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.id
     *
     * @return the value of event_trigger.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.id
     *
     * @param id the value for event_trigger.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.processor
     *
     * @return the value of event_trigger.processor
     *
     * @mbg.generated
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.processor
     *
     * @param processor the value for event_trigger.processor
     *
     * @mbg.generated
     */
    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.task_id
     *
     * @return the value of event_trigger.task_id
     *
     * @mbg.generated
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.task_id
     *
     * @param taskId the value for event_trigger.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.trigger_value
     *
     * @return the value of event_trigger.trigger_value
     *
     * @mbg.generated
     */
    public String getTriggerValue() {
        return triggerValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.trigger_value
     *
     * @param triggerValue the value for event_trigger.trigger_value
     *
     * @mbg.generated
     */
    public void setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue == null ? null : triggerValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.trigger_type
     *
     * @return the value of event_trigger.trigger_type
     *
     * @mbg.generated
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.trigger_type
     *
     * @param triggerType the value for event_trigger.trigger_type
     *
     * @mbg.generated
     */
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType == null ? null : triggerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.created_at
     *
     * @return the value of event_trigger.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.created_at
     *
     * @param createdAt the value for event_trigger.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.updated_at
     *
     * @return the value of event_trigger.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.updated_at
     *
     * @param updatedAt the value for event_trigger.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_trigger.event_json
     *
     * @return the value of event_trigger.event_json
     *
     * @mbg.generated
     */
    public String getEventJson() {
        return eventJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_trigger.event_json
     *
     * @param eventJson the value for event_trigger.event_json
     *
     * @mbg.generated
     */
    public void setEventJson(String eventJson) {
        this.eventJson = eventJson == null ? null : eventJson.trim();
    }
}