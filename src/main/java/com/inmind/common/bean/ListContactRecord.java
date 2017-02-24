package com.inmind.common.bean;

/**
 * Created by zhao on 2017/2/23.
 */
public class ListContactRecord {
  private Long resumeId;//联系人
  private Long contactId;//候选人
  private Long orgId;//公司
  private Long projectId;//项目
  private Long orgDevId;//BD开发

  public Long getResumeId() {
    return resumeId;
  }

  public void setResumeId(Long resumeId) {
    this.resumeId = resumeId;
  }

  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Long getOrgDevId() {
    return orgDevId;
  }

  public void setOrgDevId(Long orgDevId) {
    this.orgDevId = orgDevId;
  }
}
