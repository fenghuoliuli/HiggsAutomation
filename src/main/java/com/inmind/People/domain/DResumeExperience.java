package com.inmind.People.domain;

import com.inmind.common.domain.DDict;
import com.inmind.mybatis.entity.ResumeExperiencePO;
import com.inmind.organization.domain.DOrgDept;
import com.inmind.organization.domain.DOrganization;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class DResumeExperience extends ResumeExperiencePO {
  private DOrganization org;

  private List<DDict> functionDicts;

  private DDict industryDict;

  private DOrgDept dept;

  private List<DDict> recruitmentFunctions;

  private List<Long> recruitmentLocations;

  public DOrganization getOrg() {
    return org;
  }

  public void setOrg(DOrganization org) {
    this.org = org;
  }

  public List<DDict> getFunctionDicts() {
    return functionDicts;
  }

  public void setFunctionDicts(List<DDict> functionDicts) {
    this.functionDicts = functionDicts;
  }

  public DDict getIndustryDict() {
    return industryDict;
  }

  public void setIndustryDict(DDict industryDict) {
    this.industryDict = industryDict;
  }

  public DOrgDept getDept() {
    return dept;
  }

  public void setDept(DOrgDept dept) {
    this.dept = dept;
  }

  public List<DDict> getRecruitmentFunctions() {
    return recruitmentFunctions;
  }

  public void setRecruitmentFunctions(List<DDict> recruitmentFunctions) {
    this.recruitmentFunctions = recruitmentFunctions;
  }

  public List<Long> getRecruitmentLocations() {
    return recruitmentLocations;
  }

  public void setRecruitmentLocations(List<Long> recruitmentLocations) {
    this.recruitmentLocations = recruitmentLocations;
  }
}
