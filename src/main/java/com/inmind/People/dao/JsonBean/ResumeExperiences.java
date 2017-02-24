package com.inmind.People.dao.JsonBean;

import java.util.List;

/**
 * Created by zhao on 2017/2/22.
 */
public class ResumeExperiences {
  private Integer isContact;
  private SalaryDetail salaryDetails;
  private long id;
  private String description;
  private List<FunctionDicts> functionDicts;
  private IndustryDict industryDict;
  private String leftReason;
  private String orgDescription;
  private String performance;
  private long resumeId;
  private String superiorPosition;

  public static class SalaryDetail{
    private double salary;
    private int salaryType;

    public double getSalary() {
      return salary;
    }

    public void setSalary(double salary) {
      this.salary = salary;
    }

    public int getSalaryType() {
      return salaryType;
    }

    public void setSalaryType(int salaryType) {
      this.salaryType = salaryType;
    }
  }
  public static class FunctionDicts{
    private long code;
    private String name;
    private String type;

    public long getCode() {
      return code;
    }

    public void setCode(long code) {
      this.code = code;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }
  }

  public static class IndustryDict{
    private long code;
    private String name;
    private String type;

    public long getCode() {
      return code;
    }

    public void setCode(long code) {
      this.code = code;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }
  }

  public Integer getIsContact() {
    return isContact;
  }

  public void setIsContact(Integer isContact) {
    this.isContact = isContact;
  }

  public SalaryDetail getSalaryDetails() {
    return salaryDetails;
  }

  public void setSalaryDetails(SalaryDetail salaryDetails) {
    this.salaryDetails = salaryDetails;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<FunctionDicts> getFunctionDicts() {
    return functionDicts;
  }

  public void setFunctionDicts(List<FunctionDicts> functionDicts) {
    this.functionDicts = functionDicts;
  }

  public IndustryDict getIndustryDict() {
    return industryDict;
  }

  public void setIndustryDict(IndustryDict industryDict) {
    this.industryDict = industryDict;
  }

  public String getLeftReason() {
    return leftReason;
  }

  public void setLeftReason(String leftReason) {
    this.leftReason = leftReason;
  }

  public String getOrgDescription() {
    return orgDescription;
  }

  public void setOrgDescription(String orgDescription) {
    this.orgDescription = orgDescription;
  }

  public String getPerformance() {
    return performance;
  }

  public void setPerformance(String performance) {
    this.performance = performance;
  }

  public long getResumeId() {
    return resumeId;
  }

  public void setResumeId(long resumeId) {
    this.resumeId = resumeId;
  }

  public String getSuperiorPosition() {
    return superiorPosition;
  }

  public void setSuperiorPosition(String superiorPosition) {
    this.superiorPosition = superiorPosition;
  }
}
