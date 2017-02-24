package com.inmind.project.domain;

import com.inmind.People.domain.DContact;
import com.inmind.common.DAttachment;
import com.inmind.common.domain.DDict;
import com.inmind.mybatis.entity.ProjectPO;
import com.inmind.organization.domain.DExternalJob;
import com.inmind.organization.domain.DOrgDept;
import com.inmind.organization.domain.DOrganization;
import com.inmind.security.domain.DAccount;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class DProject extends ProjectPO{
  private Integer progressionDays;

  private List<DAttachment> attachments;

  private DOrganization client;

  private DOrgDept belongingDepartment;

  private List<DAccount> consultantList;

  private DAccount contactWindow;

  private List<Long> positionAddressList;

  private List<DContact> contactList;

  private List<DOrganization> targetOrgList;

  private List<DDict> positionIndustrialList;

  private List<DDict> positionFunctionList;

  private List<DDict> positionGradeList;

  private List<DDict> positionHighlightList;

  private List<DDict> industrialList;

  private List<DDict> functionList;

  private List<DDict> skillList;

  private List<DDict> targetOrgTypeList;

  private List<DDict> schoolTypeList;

  private List<DDict> degreeList;

  private List<DDict> majorList;

  private List<DDict> certificationList;

  private List<DDict> langList;

  private DAccount bdEmployee;

  private DAccount creator;

  private List<DProjectAssign> projectAssignList;

  private DOrganization organizationObject;

  private DProjectCodeStat projectCodeStat;

  private DExternalJob.DOrgDevContract orgDevContract;

  public DExternalJob.DOrgDevContract getOrgDevContract() {
    return orgDevContract;
  }

  public void setOrgDevContract(DExternalJob.DOrgDevContract orgDevContract) {
    this.orgDevContract = orgDevContract;
  }

  public DProjectCodeStat getProjectCodeStat() {
    return projectCodeStat;
  }

  public void setProjectCodeStat(DProjectCodeStat projectCodeStat) {
    this.projectCodeStat = projectCodeStat;
  }

  public Integer getProgressionDays() {
    return progressionDays;
  }

  public void setProgressionDays(Integer progressionDays) {
    this.progressionDays = progressionDays;
  }

  public List<DAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<DAttachment> attachments) {
    this.attachments = attachments;
  }

  public DOrganization getClient() {
    return client;
  }

  public void setClient(DOrganization client) {
    this.client = client;
  }

  public DOrgDept getBelongingDepartment() {
    return belongingDepartment;
  }

  public void setBelongingDepartment(DOrgDept belongingDepartment) {
    this.belongingDepartment = belongingDepartment;
  }

  public List<DAccount> getConsultantList() {
    return consultantList;
  }

  public void setConsultantList(List<DAccount> consultantList) {
    this.consultantList = consultantList;
  }

  public DAccount getContactWindow() {
    return contactWindow;
  }

  public void setContactWindow(DAccount contactWindow) {
    this.contactWindow = contactWindow;
  }

  public List<Long> getPositionAddressList() {
    return positionAddressList;
  }

  public void setPositionAddressList(List<Long> positionAddressList) {
    this.positionAddressList = positionAddressList;
  }

  public List<DContact> getContactList() {
    return contactList;
  }

  public void setContactList(List<DContact> contactList) {
    this.contactList = contactList;
  }

  public List<DOrganization> getTargetOrgList() {
    return targetOrgList;
  }

  public void setTargetOrgList(List<DOrganization> targetOrgList) {
    this.targetOrgList = targetOrgList;
  }

  public List<DDict> getPositionIndustrialList() {
    return positionIndustrialList;
  }

  public void setPositionIndustrialList(List<DDict> positionIndustrialList) {
    this.positionIndustrialList = positionIndustrialList;
  }

  public List<DDict> getPositionFunctionList() {
    return positionFunctionList;
  }

  public void setPositionFunctionList(List<DDict> positionFunctionList) {
    this.positionFunctionList = positionFunctionList;
  }

  public List<DDict> getPositionGradeList() {
    return positionGradeList;
  }

  public void setPositionGradeList(List<DDict> positionGradeList) {
    this.positionGradeList = positionGradeList;
  }

  public List<DDict> getPositionHighlightList() {
    return positionHighlightList;
  }

  public void setPositionHighlightList(List<DDict> positionHighlightList) {
    this.positionHighlightList = positionHighlightList;
  }

  public List<DDict> getIndustrialList() {
    return industrialList;
  }

  public void setIndustrialList(List<DDict> industrialList) {
    this.industrialList = industrialList;
  }

  public List<DDict> getFunctionList() {
    return functionList;
  }

  public void setFunctionList(List<DDict> functionList) {
    this.functionList = functionList;
  }

  public List<DDict> getSkillList() {
    return skillList;
  }

  public void setSkillList(List<DDict> skillList) {
    this.skillList = skillList;
  }

  public List<DDict> getTargetOrgTypeList() {
    return targetOrgTypeList;
  }

  public void setTargetOrgTypeList(List<DDict> targetOrgTypeList) {
    this.targetOrgTypeList = targetOrgTypeList;
  }

  public List<DDict> getSchoolTypeList() {
    return schoolTypeList;
  }

  public void setSchoolTypeList(List<DDict> schoolTypeList) {
    this.schoolTypeList = schoolTypeList;
  }

  public List<DDict> getDegreeList() {
    return degreeList;
  }

  public void setDegreeList(List<DDict> degreeList) {
    this.degreeList = degreeList;
  }

  public List<DDict> getMajorList() {
    return majorList;
  }

  public void setMajorList(List<DDict> majorList) {
    this.majorList = majorList;
  }

  public List<DDict> getCertificationList() {
    return certificationList;
  }

  public void setCertificationList(List<DDict> certificationList) {
    this.certificationList = certificationList;
  }

  public List<DDict> getLangList() {
    return langList;
  }

  public void setLangList(List<DDict> langList) {
    this.langList = langList;
  }

  public DAccount getBdEmployee() {
    return bdEmployee;
  }

  public void setBdEmployee(DAccount bdEmployee) {
    this.bdEmployee = bdEmployee;
  }

  public DAccount getCreator() {
    return creator;
  }

  public void setCreator(DAccount creator) {
    this.creator = creator;
  }

  public List<DProjectAssign> getProjectAssignList() {
    return projectAssignList;
  }

  public void setProjectAssignList(List<DProjectAssign> projectAssignList) {
    this.projectAssignList = projectAssignList;
  }

  public DOrganization getOrganizationObject() {
    return organizationObject;
  }

  public void setOrganizationObject(DOrganization organizationObject) {
    this.organizationObject = organizationObject;
  }
}
