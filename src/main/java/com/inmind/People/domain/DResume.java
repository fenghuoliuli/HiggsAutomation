package com.inmind.People.domain;

import com.inmind.common.domain.DAddress;
import com.inmind.common.domain.DDict;
import com.inmind.mybatis.entity.ResumePO;
import com.inmind.organization.domain.DOrganization;
import com.inmind.security.domain.DAccount;


import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */


public class DResume extends ResumePO {

  private DResume basic;

  private Integer isContact;

  private List<DResumeExperience> resumeExperiences;

  private List<DResumeProject> resumeProjects;

  private List<DResumeEducation> resumeEducations;

  private Integer seniority;

  private DAddress address;

  private List<DDict> skillDicts;

  private List<DDict> certificateDicts;

  private List<DResumeLang> resumeLangs;

  private List<DDict> leftReasonDicts;

  private List<DDict> expectIndustryDicts;

  private List<DDict> expectFunctionDicts;

  private List<DDict> expectOrgHighlightDicts;

  private DAccount owner;

  private DAccount createdByAccount;

  private DAccount updatedByAccount;

  private List<DOrganization> expectOrgs;

  private Long copyCount;

  private String displayName;

  private Integer workTelType;

  private List<Long> expectLocations;

  private BigDecimal integrityRungs;

  private Long viewCount;

  private Long editorCount;

  private Long refCandidateId;

  private Long refContactId;

  private Integer locked;

  private List<String> homePages;

  private Long excludeOwnerId;

  private Date latestContactAt;

  public static String getDisplayName(String chineseName, String engName) {
    String displayName = StringUtils.isBlank(chineseName) ? engName :
        chineseName;
    return displayName;
  }

  public DResume getBasic() {
    return basic;
  }

  public void setBasic(DResume basic) {
    this.basic = basic;
  }

  public Integer getIsContact() {
    return isContact;
  }

  public void setIsContact(Integer isContact) {
    this.isContact = isContact;
  }

  public List<DResumeExperience> getResumeExperiences() {
    return resumeExperiences;
  }

  public void setResumeExperiences(List<DResumeExperience> resumeExperiences) {
    this.resumeExperiences = resumeExperiences;
  }

  public List<DResumeProject> getResumeProjects() {
    return resumeProjects;
  }

  public void setResumeProjects(List<DResumeProject> resumeProjects) {
    this.resumeProjects = resumeProjects;
  }

  public List<DResumeEducation> getResumeEducations() {
    return resumeEducations;
  }

  public void setResumeEducations(List<DResumeEducation> resumeEducations) {
    this.resumeEducations = resumeEducations;
  }

  /**
   * 工作年限,特殊计算
   */
  public Integer getSeniority() {
    if (seniority == null) {
      if (getStartedWorkAt() == null) {
        return null;
      }
      int nowYear = Calendar.getInstance().get(Calendar.YEAR);
      int startedWorkAtYear = DateUtils.toCalendar(getStartedWorkAt()).get(Calendar.YEAR);

      return nowYear - startedWorkAtYear;
    }
    return seniority;
  }

  public void setSeniority(Integer seniority) {
    this.seniority = seniority;
    if (seniority != null) {
      setStartedWorkAt(DateUtils.addYears(new Date(), -seniority));
    } else {
      setStartedWorkAt(null);
    }
  }

  public DAddress getAddress() {
    return address;
  }

  public void setAddress(DAddress address) {
    this.address = address;
  }

  public List<DDict> getSkillDicts() {
    return skillDicts;
  }

  public void setSkillDicts(List<DDict> skillDicts) {
    this.skillDicts = skillDicts;
  }

  public List<DDict> getCertificateDicts() {
    return certificateDicts;
  }

  public void setCertificateDicts(List<DDict> certificateDicts) {
    this.certificateDicts = certificateDicts;
  }

  public List<DResumeLang> getResumeLangs() {
    return resumeLangs;
  }

  public void setResumeLangs(List<DResumeLang> resumeLangs) {
    this.resumeLangs = resumeLangs;
  }

  public List<DDict> getLeftReasonDicts() {
    return leftReasonDicts;
  }

  public void setLeftReasonDicts(List<DDict> leftReasonDicts) {
    this.leftReasonDicts = leftReasonDicts;
  }

  public List<DDict> getExpectIndustryDicts() {
    return expectIndustryDicts;
  }

  public void setExpectIndustryDicts(List<DDict> expectIndustryDicts) {
    this.expectIndustryDicts = expectIndustryDicts;
  }

  public List<DDict> getExpectFunctionDicts() {
    return expectFunctionDicts;
  }

  public void setExpectFunctionDicts(List<DDict> expectFunctionDicts) {
    this.expectFunctionDicts = expectFunctionDicts;
  }

  public List<DDict> getExpectOrgHighlightDicts() {
    return expectOrgHighlightDicts;
  }

  public void setExpectOrgHighlightDicts(List<DDict> expectOrgHighlightDicts) {
    this.expectOrgHighlightDicts = expectOrgHighlightDicts;
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

  public List<DOrganization> getExpectOrgs() {
    return expectOrgs;
  }

  public void setExpectOrgs(List<DOrganization> expectOrgs) {
    this.expectOrgs = expectOrgs;
  }

  public Long getCopyCount() {
    return copyCount;
  }

  public void setCopyCount(Long copyCount) {
    this.copyCount = copyCount;
  }

  public Integer getWorkTelType() {
    return workTelType;
  }

  public void setWorkTelType(Integer workTelType) {
    this.workTelType = workTelType;
  }

  public List<Long> getExpectLocations() {
    return expectLocations;
  }

  public void setExpectLocations(List<Long> expectLocations) {
    this.expectLocations = expectLocations;
  }

  public BigDecimal getIntegrityRungs() {
    return integrityRungs;
  }

  public void setIntegrityRungs(BigDecimal integrityRungs) {
    this.integrityRungs = integrityRungs;
  }

  public Long getViewCount() {
    return viewCount;
  }

  public void setViewCount(Long viewCount) {
    this.viewCount = viewCount;
  }

  public Long getEditorCount() {
    return editorCount;
  }

  public void setEditorCount(Long editorCount) {
    this.editorCount = editorCount;
  }

  public Long getRefCandidateId() {
    return refCandidateId;
  }

  public void setRefCandidateId(Long refCandidateId) {
    this.refCandidateId = refCandidateId;
  }

  public Long getRefContactId() {
    return refContactId;
  }

  public void setRefContactId(Long refContactId) {
    this.refContactId = refContactId;
  }

  public Integer getLocked() {
    return locked;
  }

  public void setLocked(Integer locked) {
    this.locked = locked;
  }

  public List<String> getHomePages() {
    return homePages;
  }

  public void setHomePages(List<String> homePages) {
    this.homePages = homePages;
  }

  public Long getExcludeOwnerId() {
    return excludeOwnerId;
  }

  public void setExcludeOwnerId(Long excludeOwnerId) {
    this.excludeOwnerId = excludeOwnerId;
  }

  public String getDisplayName() {
    return StringUtils.isNotBlank(this.getChineseName()) ? getChineseName() : getEnglishName();
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Integer getType() {
    return 0;
  }

  public Date getLatestContactAt() {
    return latestContactAt;
  }

  public void setLatestContactAt(Date latestContactAt) {
    this.latestContactAt = latestContactAt;
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

