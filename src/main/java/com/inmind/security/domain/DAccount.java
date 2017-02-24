package com.inmind.security.domain;

import com.inmind.utils.StringUtil;

import java.util.Date;
import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class DAccount{
    private Long id;

    private String username;

    private String password;

    private String chineseName;

    private String displayName;

    private String englishName;

    private String nickname;

    private String email;

    private String mobile;

    private Integer passwordReset;

    private Date resetPasswordAt;

    private Integer status;

    private Date latestLoginAt;

    private Integer latestLoginIp;

    private Integer loginFailTimes;

    private List<String> roles;

    private String websocket;

    private String token;

    private List<DPermission> permissions;

    private Long createdBy;

    private Long updatedBy;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public String getChineseName() {
      return chineseName;
    }

    public void setChineseName(String chineseName) {
      this.chineseName = chineseName;
    }

    /**
     * 特殊函数
     */
    public String getDisplayName() {

      if (!StringUtil.isEmpty(getEnglishName())) {
        return getEnglishName();
      }
      if (!StringUtil.isEmpty(getChineseName())) {
        return getChineseName();
      }
      if (!StringUtil.isEmpty(getNickname())) {
        return getNickname();
      }
      return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;


    }

    public String getEnglishName() {
      return englishName;
    }

    public void setEnglishName(String englishName) {
      this.englishName = englishName;
    }

    public String getNickname() {
      return nickname;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getMobile() {
      return mobile;
    }

    public void setMobile(String mobile) {
      this.mobile = mobile;
    }

    public Integer getPasswordReset() {
      return passwordReset;
    }

    public void setPasswordReset(Integer passwordReset) {
      this.passwordReset = passwordReset;
    }

    public Date getResetPasswordAt() {
      return resetPasswordAt;
    }

    public void setResetPasswordAt(Date resetPasswordAt) {
      this.resetPasswordAt = resetPasswordAt;
    }

    public Integer getStatus() {
      return status;
    }

    public void setStatus(Integer status) {
      this.status = status;
    }

    public Date getLatestLoginAt() {
      return latestLoginAt;
    }

    public void setLatestLoginAt(Date latestLoginAt) {
      this.latestLoginAt = latestLoginAt;
    }

    public Integer getLatestLoginIp() {
      return latestLoginIp;
    }

    public void setLatestLoginIp(Integer latestLoginIp) {
      this.latestLoginIp = latestLoginIp;
    }

    public Integer getLoginFailTimes() {
      return loginFailTimes;
    }

    public void setLoginFailTimes(Integer loginFailTimes) {
      this.loginFailTimes = loginFailTimes;
    }

    public List<String> getRoles() {
      return roles;
    }

    public void setRoles(List<String> roles) {
      this.roles = roles;
    }

    public String getWebsocket() {
      return websocket;
    }

    public void setWebsocket(String websocket) {
      this.websocket = websocket;
    }

    public String getToken() {
      return token;
    }

    public void setToken(String token) {
      this.token = token;
    }

    public List<DPermission> getPermissions() {
      return permissions;
    }

    public void setPermissions(List<DPermission> permissions) {
      this.permissions = permissions;
    }

    public Long getCreatedBy() {
      return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
      this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
      return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
      this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
      return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
      return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
    }

    /**
     * 公用的账号初始化名称的函数.
     */
    public static void initAccountDisplayName(DAccount account) {
      //    if (!StringUtil.isEmpty(account.getEnglishName())) {
      //      account.setDisplayName(account.getEnglishName());
      //      return;
      //    }
      //    if (!StringUtil.isEmpty(account.getChineseName())) {
      //      account.setDisplayName(account.getChineseName());
      //      return;
      //    }
      //    if (!StringUtil.isEmpty(account.getNickname())) {
      //      account.setDisplayName(account.getNickname());
      //      return;
      //    }
    }
}
