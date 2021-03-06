package com.inmind.mybatis.entity;

import java.util.Date;

public class PeoplePO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.company_id
     *
     * @mbg.generated
     */
    private Long companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.locked
     *
     * @mbg.generated
     */
    private Integer locked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.locked_at
     *
     * @mbg.generated
     */
    private Date lockedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.unlocked_at
     *
     * @mbg.generated
     */
    private Date unlockedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.candidate_id
     *
     * @mbg.generated
     */
    private Long candidateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.contact_id
     *
     * @mbg.generated
     */
    private Long contactId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.owner_id
     *
     * @mbg.generated
     */
    private Long ownerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.latest_contact_at
     *
     * @mbg.generated
     */
    private Date latestContactAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.src_resume_id
     *
     * @mbg.generated
     */
    private Long srcResumeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.id
     *
     * @return the value of people.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.id
     *
     * @param id the value for people.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.company_id
     *
     * @return the value of people.company_id
     *
     * @mbg.generated
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.company_id
     *
     * @param companyId the value for people.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.name
     *
     * @return the value of people.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.name
     *
     * @param name the value for people.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.created_at
     *
     * @return the value of people.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.created_at
     *
     * @param createdAt the value for people.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.updated_at
     *
     * @return the value of people.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.updated_at
     *
     * @param updatedAt the value for people.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.locked
     *
     * @return the value of people.locked
     *
     * @mbg.generated
     */
    public Integer getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.locked
     *
     * @param locked the value for people.locked
     *
     * @mbg.generated
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.locked_at
     *
     * @return the value of people.locked_at
     *
     * @mbg.generated
     */
    public Date getLockedAt() {
        return lockedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.locked_at
     *
     * @param lockedAt the value for people.locked_at
     *
     * @mbg.generated
     */
    public void setLockedAt(Date lockedAt) {
        this.lockedAt = lockedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.unlocked_at
     *
     * @return the value of people.unlocked_at
     *
     * @mbg.generated
     */
    public Date getUnlockedAt() {
        return unlockedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.unlocked_at
     *
     * @param unlockedAt the value for people.unlocked_at
     *
     * @mbg.generated
     */
    public void setUnlockedAt(Date unlockedAt) {
        this.unlockedAt = unlockedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.candidate_id
     *
     * @return the value of people.candidate_id
     *
     * @mbg.generated
     */
    public Long getCandidateId() {
        return candidateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.candidate_id
     *
     * @param candidateId the value for people.candidate_id
     *
     * @mbg.generated
     */
    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.contact_id
     *
     * @return the value of people.contact_id
     *
     * @mbg.generated
     */
    public Long getContactId() {
        return contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.contact_id
     *
     * @param contactId the value for people.contact_id
     *
     * @mbg.generated
     */
    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.owner_id
     *
     * @return the value of people.owner_id
     *
     * @mbg.generated
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.owner_id
     *
     * @param ownerId the value for people.owner_id
     *
     * @mbg.generated
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.latest_contact_at
     *
     * @return the value of people.latest_contact_at
     *
     * @mbg.generated
     */
    public Date getLatestContactAt() {
        return latestContactAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.latest_contact_at
     *
     * @param latestContactAt the value for people.latest_contact_at
     *
     * @mbg.generated
     */
    public void setLatestContactAt(Date latestContactAt) {
        this.latestContactAt = latestContactAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.src_resume_id
     *
     * @return the value of people.src_resume_id
     *
     * @mbg.generated
     */
    public Long getSrcResumeId() {
        return srcResumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.src_resume_id
     *
     * @param srcResumeId the value for people.src_resume_id
     *
     * @mbg.generated
     */
    public void setSrcResumeId(Long srcResumeId) {
        this.srcResumeId = srcResumeId;
    }
}