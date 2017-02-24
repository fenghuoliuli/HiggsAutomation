package com.inmind.People.domain;

import com.inmind.common.domain.DDict;
import com.inmind.mybatis.entity.ContactPO;
import com.inmind.organization.domain.DOrganization;
import com.inmind.security.domain.DAccount;

import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class DContact extends ContactPO{
  private DOrganization org;

  private Integer workTelType;

  private List<Long> recruitLocations;

  private List<DDict> recruitFunctionDicts;

  private DDict industryDict;

  private DAccount owner;

  private DAccount createdByAccount;

  private DAccount updatedByAccount;

  private Long refCandidateId;

  private Integer locked;

  public String getDisplayName() {
    return StringUtils.isNotBlank(getChineseName()) ? getChineseName() : getEnglishName();
  }

  public DOrganization getOrg() {
    return org;
  }

  public void setOrg(DOrganization org) {
    this.org = org;
  }

  public Integer getWorkTelType() {
    return workTelType;
  }

  public void setWorkTelType(Integer workTelType) {
    this.workTelType = workTelType;
  }

  public List<Long> getRecruitLocations() {
    return recruitLocations;
  }

  public void setRecruitLocations(List<Long> recruitLocations) {
    this.recruitLocations = recruitLocations;
  }

  public List<DDict> getRecruitFunctionDicts() {
    return recruitFunctionDicts;
  }

  public void setRecruitFunctionDicts(List<DDict> recruitFunctionDicts) {
    this.recruitFunctionDicts = recruitFunctionDicts;
  }

  public DDict getIndustryDict() {
    return industryDict;
  }

  public void setIndustryDict(DDict industryDict) {
    this.industryDict = industryDict;
  }

  public DAccount getOwner() {
    return owner;
  }

  public void setOwner(DAccount owner) {
    this.owner = owner;
  }

  public DAccount getCreatedByAccount() {
    return createdByAccount;
  }

  public void setCreatedByAccount(DAccount createdByAccount) {
    this.createdByAccount = createdByAccount;
  }

  public DAccount getUpdatedByAccount() {
    return updatedByAccount;
  }

  public void setUpdatedByAccount(DAccount updatedByAccount) {
    this.updatedByAccount = updatedByAccount;
  }

  public Long getRefCandidateId() {
    return refCandidateId;
  }

  public void setRefCandidateId(Long refCandidateId) {
    this.refCandidateId = refCandidateId;
  }

  public Integer getLocked() {
    return locked;
  }

  public void setLocked(Integer locked) {
    this.locked = locked;
  }

  public Integer getType() {
    return 1;
  }

  @Override
  public String getWorkTel() {
    if (StringUtils.isEmpty(super.getWorkTel())) {
      if (!StringUtils.isEmpty(super.getWorkPhone())) {
        setWorkTelType(1);
        return super.getWorkPhone();
      }
    }
    setWorkTelType(2);
    return super.getWorkTel();
  }
}
