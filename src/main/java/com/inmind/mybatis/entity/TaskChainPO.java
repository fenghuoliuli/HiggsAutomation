package com.inmind.mybatis.entity;

import java.util.Date;

public class TaskChainPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.chain_status
     *
     * @mbg.generated
     */
    private Integer chainStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.chain_name
     *
     * @mbg.generated
     */
    private String chainName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_chain.rules
     *
     * @mbg.generated
     */
    private String rules;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.id
     *
     * @return the value of task_chain.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.id
     *
     * @param id the value for task_chain.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.chain_status
     *
     * @return the value of task_chain.chain_status
     *
     * @mbg.generated
     */
    public Integer getChainStatus() {
        return chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.chain_status
     *
     * @param chainStatus the value for task_chain.chain_status
     *
     * @mbg.generated
     */
    public void setChainStatus(Integer chainStatus) {
        this.chainStatus = chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.chain_name
     *
     * @return the value of task_chain.chain_name
     *
     * @mbg.generated
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.chain_name
     *
     * @param chainName the value for task_chain.chain_name
     *
     * @mbg.generated
     */
    public void setChainName(String chainName) {
        this.chainName = chainName == null ? null : chainName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.created_by
     *
     * @return the value of task_chain.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.created_by
     *
     * @param createdBy the value for task_chain.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.updated_by
     *
     * @return the value of task_chain.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.updated_by
     *
     * @param updatedBy the value for task_chain.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.created_at
     *
     * @return the value of task_chain.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.created_at
     *
     * @param createdAt the value for task_chain.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.updated_at
     *
     * @return the value of task_chain.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.updated_at
     *
     * @param updatedAt the value for task_chain.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_chain.rules
     *
     * @return the value of task_chain.rules
     *
     * @mbg.generated
     */
    public String getRules() {
        return rules;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_chain.rules
     *
     * @param rules the value for task_chain.rules
     *
     * @mbg.generated
     */
    public void setRules(String rules) {
        this.rules = rules == null ? null : rules.trim();
    }
}