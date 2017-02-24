package com.inmind.mybatis.entity;

import java.util.Date;

public class OrgStockPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.org_id
     *
     * @mbg.generated
     */
    private Long orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.stock_exchange
     *
     * @mbg.generated
     */
    private Integer stockExchange;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.stock_code
     *
     * @mbg.generated
     */
    private String stockCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_stock.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.id
     *
     * @return the value of org_stock.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.id
     *
     * @param id the value for org_stock.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.org_id
     *
     * @return the value of org_stock.org_id
     *
     * @mbg.generated
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.org_id
     *
     * @param orgId the value for org_stock.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.stock_exchange
     *
     * @return the value of org_stock.stock_exchange
     *
     * @mbg.generated
     */
    public Integer getStockExchange() {
        return stockExchange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.stock_exchange
     *
     * @param stockExchange the value for org_stock.stock_exchange
     *
     * @mbg.generated
     */
    public void setStockExchange(Integer stockExchange) {
        this.stockExchange = stockExchange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.stock_code
     *
     * @return the value of org_stock.stock_code
     *
     * @mbg.generated
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.stock_code
     *
     * @param stockCode the value for org_stock.stock_code
     *
     * @mbg.generated
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.created_by
     *
     * @return the value of org_stock.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.created_by
     *
     * @param createdBy the value for org_stock.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.updated_by
     *
     * @return the value of org_stock.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.updated_by
     *
     * @param updatedBy the value for org_stock.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.created_at
     *
     * @return the value of org_stock.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.created_at
     *
     * @param createdAt the value for org_stock.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_stock.updated_at
     *
     * @return the value of org_stock.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_stock.updated_at
     *
     * @param updatedAt the value for org_stock.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}