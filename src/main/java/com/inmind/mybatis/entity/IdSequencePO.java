package com.inmind.mybatis.entity;

import java.util.Date;

public class IdSequencePO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column id_sequence.value
     *
     * @mbg.generated
     */
    private Long value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column id_sequence.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column id_sequence.value
     *
     * @return the value of id_sequence.value
     *
     * @mbg.generated
     */
    public Long getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column id_sequence.value
     *
     * @param value the value for id_sequence.value
     *
     * @mbg.generated
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column id_sequence.updated_at
     *
     * @return the value of id_sequence.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column id_sequence.updated_at
     *
     * @param updatedAt the value for id_sequence.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}