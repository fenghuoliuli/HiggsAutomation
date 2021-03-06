package com.inmind.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ContactPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.company_id
     *
     * @mbg.generated
     */
    private Long companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.people_id
     *
     * @mbg.generated
     */
    private Long peopleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.avatar
     *
     * @mbg.generated
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.chinese_name
     *
     * @mbg.generated
     */
    private String chineseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.english_name
     *
     * @mbg.generated
     */
    private String englishName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.gender
     *
     * @mbg.generated
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.work_tel
     *
     * @mbg.generated
     */
    private String workTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.work_phone
     *
     * @mbg.generated
     */
    private String workPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.other_tel
     *
     * @mbg.generated
     */
    private String otherTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.private_email
     *
     * @mbg.generated
     */
    private String privateEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.work_email
     *
     * @mbg.generated
     */
    private String workEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.other_email
     *
     * @mbg.generated
     */
    private String otherEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.wechat_no
     *
     * @mbg.generated
     */
    private String wechatNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.qq_no
     *
     * @mbg.generated
     */
    private String qqNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.weibo
     *
     * @mbg.generated
     */
    private String weibo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.contact_integrity
     *
     * @mbg.generated
     */
    private BigDecimal contactIntegrity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.org_id
     *
     * @mbg.generated
     */
    private Long orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.org_name
     *
     * @mbg.generated
     */
    private String orgName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.industry
     *
     * @mbg.generated
     */
    private Integer industry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.position
     *
     * @mbg.generated
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.contact_type
     *
     * @mbg.generated
     */
    private Integer contactType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.recruit_location_ids
     *
     * @mbg.generated
     */
    private String recruitLocationIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.recruit_functions
     *
     * @mbg.generated
     */
    private String recruitFunctions;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.owner_id
     *
     * @mbg.generated
     */
    private Long ownerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.latest_contact_at
     *
     * @mbg.generated
     */
    private Date latestContactAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.introduce
     *
     * @mbg.generated
     */
    private String introduce;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.id
     *
     * @return the value of contact.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.id
     *
     * @param id the value for contact.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.company_id
     *
     * @return the value of contact.company_id
     *
     * @mbg.generated
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.company_id
     *
     * @param companyId the value for contact.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.people_id
     *
     * @return the value of contact.people_id
     *
     * @mbg.generated
     */
    public Long getPeopleId() {
        return peopleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.people_id
     *
     * @param peopleId the value for contact.people_id
     *
     * @mbg.generated
     */
    public void setPeopleId(Long peopleId) {
        this.peopleId = peopleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.avatar
     *
     * @return the value of contact.avatar
     *
     * @mbg.generated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.avatar
     *
     * @param avatar the value for contact.avatar
     *
     * @mbg.generated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.chinese_name
     *
     * @return the value of contact.chinese_name
     *
     * @mbg.generated
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.chinese_name
     *
     * @param chineseName the value for contact.chinese_name
     *
     * @mbg.generated
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.english_name
     *
     * @return the value of contact.english_name
     *
     * @mbg.generated
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.english_name
     *
     * @param englishName the value for contact.english_name
     *
     * @mbg.generated
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.gender
     *
     * @return the value of contact.gender
     *
     * @mbg.generated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.gender
     *
     * @param gender the value for contact.gender
     *
     * @mbg.generated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.mobile
     *
     * @return the value of contact.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.mobile
     *
     * @param mobile the value for contact.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.work_tel
     *
     * @return the value of contact.work_tel
     *
     * @mbg.generated
     */
    public String getWorkTel() {
        return workTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.work_tel
     *
     * @param workTel the value for contact.work_tel
     *
     * @mbg.generated
     */
    public void setWorkTel(String workTel) {
        this.workTel = workTel == null ? null : workTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.work_phone
     *
     * @return the value of contact.work_phone
     *
     * @mbg.generated
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.work_phone
     *
     * @param workPhone the value for contact.work_phone
     *
     * @mbg.generated
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone == null ? null : workPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.other_tel
     *
     * @return the value of contact.other_tel
     *
     * @mbg.generated
     */
    public String getOtherTel() {
        return otherTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.other_tel
     *
     * @param otherTel the value for contact.other_tel
     *
     * @mbg.generated
     */
    public void setOtherTel(String otherTel) {
        this.otherTel = otherTel == null ? null : otherTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.private_email
     *
     * @return the value of contact.private_email
     *
     * @mbg.generated
     */
    public String getPrivateEmail() {
        return privateEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.private_email
     *
     * @param privateEmail the value for contact.private_email
     *
     * @mbg.generated
     */
    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail == null ? null : privateEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.work_email
     *
     * @return the value of contact.work_email
     *
     * @mbg.generated
     */
    public String getWorkEmail() {
        return workEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.work_email
     *
     * @param workEmail the value for contact.work_email
     *
     * @mbg.generated
     */
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail == null ? null : workEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.other_email
     *
     * @return the value of contact.other_email
     *
     * @mbg.generated
     */
    public String getOtherEmail() {
        return otherEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.other_email
     *
     * @param otherEmail the value for contact.other_email
     *
     * @mbg.generated
     */
    public void setOtherEmail(String otherEmail) {
        this.otherEmail = otherEmail == null ? null : otherEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.wechat_no
     *
     * @return the value of contact.wechat_no
     *
     * @mbg.generated
     */
    public String getWechatNo() {
        return wechatNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.wechat_no
     *
     * @param wechatNo the value for contact.wechat_no
     *
     * @mbg.generated
     */
    public void setWechatNo(String wechatNo) {
        this.wechatNo = wechatNo == null ? null : wechatNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.qq_no
     *
     * @return the value of contact.qq_no
     *
     * @mbg.generated
     */
    public String getQqNo() {
        return qqNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.qq_no
     *
     * @param qqNo the value for contact.qq_no
     *
     * @mbg.generated
     */
    public void setQqNo(String qqNo) {
        this.qqNo = qqNo == null ? null : qqNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.weibo
     *
     * @return the value of contact.weibo
     *
     * @mbg.generated
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.weibo
     *
     * @param weibo the value for contact.weibo
     *
     * @mbg.generated
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.contact_integrity
     *
     * @return the value of contact.contact_integrity
     *
     * @mbg.generated
     */
    public BigDecimal getContactIntegrity() {
        return contactIntegrity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.contact_integrity
     *
     * @param contactIntegrity the value for contact.contact_integrity
     *
     * @mbg.generated
     */
    public void setContactIntegrity(BigDecimal contactIntegrity) {
        this.contactIntegrity = contactIntegrity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.org_id
     *
     * @return the value of contact.org_id
     *
     * @mbg.generated
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.org_id
     *
     * @param orgId the value for contact.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.org_name
     *
     * @return the value of contact.org_name
     *
     * @mbg.generated
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.org_name
     *
     * @param orgName the value for contact.org_name
     *
     * @mbg.generated
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.industry
     *
     * @return the value of contact.industry
     *
     * @mbg.generated
     */
    public Integer getIndustry() {
        return industry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.industry
     *
     * @param industry the value for contact.industry
     *
     * @mbg.generated
     */
    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.position
     *
     * @return the value of contact.position
     *
     * @mbg.generated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.position
     *
     * @param position the value for contact.position
     *
     * @mbg.generated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.contact_type
     *
     * @return the value of contact.contact_type
     *
     * @mbg.generated
     */
    public Integer getContactType() {
        return contactType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.contact_type
     *
     * @param contactType the value for contact.contact_type
     *
     * @mbg.generated
     */
    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.recruit_location_ids
     *
     * @return the value of contact.recruit_location_ids
     *
     * @mbg.generated
     */
    public String getRecruitLocationIds() {
        return recruitLocationIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.recruit_location_ids
     *
     * @param recruitLocationIds the value for contact.recruit_location_ids
     *
     * @mbg.generated
     */
    public void setRecruitLocationIds(String recruitLocationIds) {
        this.recruitLocationIds = recruitLocationIds == null ? null : recruitLocationIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.recruit_functions
     *
     * @return the value of contact.recruit_functions
     *
     * @mbg.generated
     */
    public String getRecruitFunctions() {
        return recruitFunctions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.recruit_functions
     *
     * @param recruitFunctions the value for contact.recruit_functions
     *
     * @mbg.generated
     */
    public void setRecruitFunctions(String recruitFunctions) {
        this.recruitFunctions = recruitFunctions == null ? null : recruitFunctions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.owner_id
     *
     * @return the value of contact.owner_id
     *
     * @mbg.generated
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.owner_id
     *
     * @param ownerId the value for contact.owner_id
     *
     * @mbg.generated
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.created_by
     *
     * @return the value of contact.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.created_by
     *
     * @param createdBy the value for contact.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.updated_by
     *
     * @return the value of contact.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.updated_by
     *
     * @param updatedBy the value for contact.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.created_at
     *
     * @return the value of contact.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.created_at
     *
     * @param createdAt the value for contact.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.updated_at
     *
     * @return the value of contact.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.updated_at
     *
     * @param updatedAt the value for contact.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.latest_contact_at
     *
     * @return the value of contact.latest_contact_at
     *
     * @mbg.generated
     */
    public Date getLatestContactAt() {
        return latestContactAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.latest_contact_at
     *
     * @param latestContactAt the value for contact.latest_contact_at
     *
     * @mbg.generated
     */
    public void setLatestContactAt(Date latestContactAt) {
        this.latestContactAt = latestContactAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.introduce
     *
     * @return the value of contact.introduce
     *
     * @mbg.generated
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.introduce
     *
     * @param introduce the value for contact.introduce
     *
     * @mbg.generated
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}