package com.inmind.mybatis.entity;

import java.util.Date;

public class AccountPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.chinese_name
     *
     * @mbg.generated
     */
    private String chineseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.english_name
     *
     * @mbg.generated
     */
    private String englishName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.company_id
     *
     * @mbg.generated
     */
    private Long companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.team_id
     *
     * @mbg.generated
     */
    private Long teamId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.gender
     *
     * @mbg.generated
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.working_phone
     *
     * @mbg.generated
     */
    private String workingPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.working_email
     *
     * @mbg.generated
     */
    private String workingEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.working_years
     *
     * @mbg.generated
     */
    private Integer workingYears;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.hired_at
     *
     * @mbg.generated
     */
    private Date hiredAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.is_freeze
     *
     * @mbg.generated
     */
    private Integer isFreeze;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.password_reset
     *
     * @mbg.generated
     */
    private Integer passwordReset;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.reset_password_at
     *
     * @mbg.generated
     */
    private Date resetPasswordAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.latest_login_at
     *
     * @mbg.generated
     */
    private Date latestLoginAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.latest_login_ip
     *
     * @mbg.generated
     */
    private String latestLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.login_fail_times
     *
     * @mbg.generated
     */
    private Integer loginFailTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.avaya_seat_no
     *
     * @mbg.generated
     */
    private String avayaSeatNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.avaya_seat_group
     *
     * @mbg.generated
     */
    private String avayaSeatGroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.avaya_ext
     *
     * @mbg.generated
     */
    private String avayaExt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.avaya_pwd
     *
     * @mbg.generated
     */
    private String avayaPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.created_by
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.updated_by
     *
     * @mbg.generated
     */
    private Long updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.industry_codes
     *
     * @mbg.generated
     */
    private String industryCodes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.function_codes
     *
     * @mbg.generated
     */
    private String functionCodes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.location_ids
     *
     * @mbg.generated
     */
    private String locationIds;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.username
     *
     * @return the value of account.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.username
     *
     * @param username the value for account.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.password
     *
     * @return the value of account.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.password
     *
     * @param password the value for account.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.chinese_name
     *
     * @return the value of account.chinese_name
     *
     * @mbg.generated
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.chinese_name
     *
     * @param chineseName the value for account.chinese_name
     *
     * @mbg.generated
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.english_name
     *
     * @return the value of account.english_name
     *
     * @mbg.generated
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.english_name
     *
     * @param englishName the value for account.english_name
     *
     * @mbg.generated
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.nickname
     *
     * @return the value of account.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.nickname
     *
     * @param nickname the value for account.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.email
     *
     * @return the value of account.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.email
     *
     * @param email the value for account.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.mobile
     *
     * @return the value of account.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.mobile
     *
     * @param mobile the value for account.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.company_id
     *
     * @return the value of account.company_id
     *
     * @mbg.generated
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.company_id
     *
     * @param companyId the value for account.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.team_id
     *
     * @return the value of account.team_id
     *
     * @mbg.generated
     */
    public Long getTeamId() {
        return teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.team_id
     *
     * @param teamId the value for account.team_id
     *
     * @mbg.generated
     */
    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.gender
     *
     * @return the value of account.gender
     *
     * @mbg.generated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.gender
     *
     * @param gender the value for account.gender
     *
     * @mbg.generated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.working_phone
     *
     * @return the value of account.working_phone
     *
     * @mbg.generated
     */
    public String getWorkingPhone() {
        return workingPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.working_phone
     *
     * @param workingPhone the value for account.working_phone
     *
     * @mbg.generated
     */
    public void setWorkingPhone(String workingPhone) {
        this.workingPhone = workingPhone == null ? null : workingPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.working_email
     *
     * @return the value of account.working_email
     *
     * @mbg.generated
     */
    public String getWorkingEmail() {
        return workingEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.working_email
     *
     * @param workingEmail the value for account.working_email
     *
     * @mbg.generated
     */
    public void setWorkingEmail(String workingEmail) {
        this.workingEmail = workingEmail == null ? null : workingEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.working_years
     *
     * @return the value of account.working_years
     *
     * @mbg.generated
     */
    public Integer getWorkingYears() {
        return workingYears;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.working_years
     *
     * @param workingYears the value for account.working_years
     *
     * @mbg.generated
     */
    public void setWorkingYears(Integer workingYears) {
        this.workingYears = workingYears;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.hired_at
     *
     * @return the value of account.hired_at
     *
     * @mbg.generated
     */
    public Date getHiredAt() {
        return hiredAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.hired_at
     *
     * @param hiredAt the value for account.hired_at
     *
     * @mbg.generated
     */
    public void setHiredAt(Date hiredAt) {
        this.hiredAt = hiredAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.is_freeze
     *
     * @return the value of account.is_freeze
     *
     * @mbg.generated
     */
    public Integer getIsFreeze() {
        return isFreeze;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.is_freeze
     *
     * @param isFreeze the value for account.is_freeze
     *
     * @mbg.generated
     */
    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.password_reset
     *
     * @return the value of account.password_reset
     *
     * @mbg.generated
     */
    public Integer getPasswordReset() {
        return passwordReset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.password_reset
     *
     * @param passwordReset the value for account.password_reset
     *
     * @mbg.generated
     */
    public void setPasswordReset(Integer passwordReset) {
        this.passwordReset = passwordReset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.reset_password_at
     *
     * @return the value of account.reset_password_at
     *
     * @mbg.generated
     */
    public Date getResetPasswordAt() {
        return resetPasswordAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.reset_password_at
     *
     * @param resetPasswordAt the value for account.reset_password_at
     *
     * @mbg.generated
     */
    public void setResetPasswordAt(Date resetPasswordAt) {
        this.resetPasswordAt = resetPasswordAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.status
     *
     * @return the value of account.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.status
     *
     * @param status the value for account.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.latest_login_at
     *
     * @return the value of account.latest_login_at
     *
     * @mbg.generated
     */
    public Date getLatestLoginAt() {
        return latestLoginAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.latest_login_at
     *
     * @param latestLoginAt the value for account.latest_login_at
     *
     * @mbg.generated
     */
    public void setLatestLoginAt(Date latestLoginAt) {
        this.latestLoginAt = latestLoginAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.latest_login_ip
     *
     * @return the value of account.latest_login_ip
     *
     * @mbg.generated
     */
    public String getLatestLoginIp() {
        return latestLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.latest_login_ip
     *
     * @param latestLoginIp the value for account.latest_login_ip
     *
     * @mbg.generated
     */
    public void setLatestLoginIp(String latestLoginIp) {
        this.latestLoginIp = latestLoginIp == null ? null : latestLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.login_fail_times
     *
     * @return the value of account.login_fail_times
     *
     * @mbg.generated
     */
    public Integer getLoginFailTimes() {
        return loginFailTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.login_fail_times
     *
     * @param loginFailTimes the value for account.login_fail_times
     *
     * @mbg.generated
     */
    public void setLoginFailTimes(Integer loginFailTimes) {
        this.loginFailTimes = loginFailTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.avaya_seat_no
     *
     * @return the value of account.avaya_seat_no
     *
     * @mbg.generated
     */
    public String getAvayaSeatNo() {
        return avayaSeatNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.avaya_seat_no
     *
     * @param avayaSeatNo the value for account.avaya_seat_no
     *
     * @mbg.generated
     */
    public void setAvayaSeatNo(String avayaSeatNo) {
        this.avayaSeatNo = avayaSeatNo == null ? null : avayaSeatNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.avaya_seat_group
     *
     * @return the value of account.avaya_seat_group
     *
     * @mbg.generated
     */
    public String getAvayaSeatGroup() {
        return avayaSeatGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.avaya_seat_group
     *
     * @param avayaSeatGroup the value for account.avaya_seat_group
     *
     * @mbg.generated
     */
    public void setAvayaSeatGroup(String avayaSeatGroup) {
        this.avayaSeatGroup = avayaSeatGroup == null ? null : avayaSeatGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.avaya_ext
     *
     * @return the value of account.avaya_ext
     *
     * @mbg.generated
     */
    public String getAvayaExt() {
        return avayaExt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.avaya_ext
     *
     * @param avayaExt the value for account.avaya_ext
     *
     * @mbg.generated
     */
    public void setAvayaExt(String avayaExt) {
        this.avayaExt = avayaExt == null ? null : avayaExt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.avaya_pwd
     *
     * @return the value of account.avaya_pwd
     *
     * @mbg.generated
     */
    public String getAvayaPwd() {
        return avayaPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.avaya_pwd
     *
     * @param avayaPwd the value for account.avaya_pwd
     *
     * @mbg.generated
     */
    public void setAvayaPwd(String avayaPwd) {
        this.avayaPwd = avayaPwd == null ? null : avayaPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.created_by
     *
     * @return the value of account.created_by
     *
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.created_by
     *
     * @param createdBy the value for account.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.updated_by
     *
     * @return the value of account.updated_by
     *
     * @mbg.generated
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.updated_by
     *
     * @param updatedBy the value for account.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.created_at
     *
     * @return the value of account.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.created_at
     *
     * @param createdAt the value for account.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.updated_at
     *
     * @return the value of account.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.updated_at
     *
     * @param updatedAt the value for account.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.industry_codes
     *
     * @return the value of account.industry_codes
     *
     * @mbg.generated
     */
    public String getIndustryCodes() {
        return industryCodes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.industry_codes
     *
     * @param industryCodes the value for account.industry_codes
     *
     * @mbg.generated
     */
    public void setIndustryCodes(String industryCodes) {
        this.industryCodes = industryCodes == null ? null : industryCodes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.function_codes
     *
     * @return the value of account.function_codes
     *
     * @mbg.generated
     */
    public String getFunctionCodes() {
        return functionCodes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.function_codes
     *
     * @param functionCodes the value for account.function_codes
     *
     * @mbg.generated
     */
    public void setFunctionCodes(String functionCodes) {
        this.functionCodes = functionCodes == null ? null : functionCodes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.location_ids
     *
     * @return the value of account.location_ids
     *
     * @mbg.generated
     */
    public String getLocationIds() {
        return locationIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.location_ids
     *
     * @param locationIds the value for account.location_ids
     *
     * @mbg.generated
     */
    public void setLocationIds(String locationIds) {
        this.locationIds = locationIds == null ? null : locationIds.trim();
    }
}