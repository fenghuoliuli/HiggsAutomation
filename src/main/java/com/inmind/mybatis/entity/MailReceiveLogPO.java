package com.inmind.mybatis.entity;

import java.util.Date;

public class MailReceiveLogPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_receive_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_receive_log.last_mail_uid
     *
     * @mbg.generated
     */
    private Long lastMailUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_receive_log.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_receive_log.id
     *
     * @return the value of mail_receive_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_receive_log.id
     *
     * @param id the value for mail_receive_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_receive_log.last_mail_uid
     *
     * @return the value of mail_receive_log.last_mail_uid
     *
     * @mbg.generated
     */
    public Long getLastMailUid() {
        return lastMailUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_receive_log.last_mail_uid
     *
     * @param lastMailUid the value for mail_receive_log.last_mail_uid
     *
     * @mbg.generated
     */
    public void setLastMailUid(Long lastMailUid) {
        this.lastMailUid = lastMailUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_receive_log.created_at
     *
     * @return the value of mail_receive_log.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_receive_log.created_at
     *
     * @param createdAt the value for mail_receive_log.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}