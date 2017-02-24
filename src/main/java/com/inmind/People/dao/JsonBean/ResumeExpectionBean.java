package com.inmind.People.dao.JsonBean;

import java.util.List;

/**
 * Created by zhao on 2017/2/24.
 */
public class ResumeExpectionBean {
  private long dimissionPeriod;
  private String evaluate;
  private long resumeId;
  private List<ExpectFunctionDicts> expectFunctionDicts;
  private List<ExpectIndustryDicts> expectIndustryDicts;
  private List<Long> expectLocations;
  private List<ExpectOrgHighlightDicts>expectOrgHighlightDicts;
  private List<ExpectOrgs> expectOrgs;
  private ExpectSalary expectSalary;
  private List<LeftReasonDicts> leftReasonDicts;

  public static class ExpectFunctionDicts{
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
  public static class ExpectIndustryDicts {
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

  public static class ExpectOrgHighlightDicts{
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

  public static class ExpectOrgs{
    private long id;
    private String name;
    private String type;

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
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

  public static class ExpectSalary{
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

  public static class LeftReasonDicts{
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

  public long getDimissionPeriod() {
    return dimissionPeriod;
  }

  public void setDimissionPeriod(long dimissionPeriod) {
    this.dimissionPeriod = dimissionPeriod;
  }

  public String getEvaluate() {
    return evaluate;
  }

  public void setEvaluate(String evaluate) {
    this.evaluate = evaluate;
  }

  public long getResumeId() {
    return resumeId;
  }

  public void setResumeId(long resumeId) {
    this.resumeId = resumeId;
  }

  public List<ExpectFunctionDicts> getExpectFunctionDicts() {
    return expectFunctionDicts;
  }

  public void setExpectFunctionDicts(List<ExpectFunctionDicts> expectFunctionDicts) {
    this.expectFunctionDicts = expectFunctionDicts;
  }

  public List<ExpectIndustryDicts> getExpectIndustryDicts() {
    return expectIndustryDicts;
  }

  public void setExpectIndustryDicts(List<ExpectIndustryDicts> expectIndustryDicts) {
    this.expectIndustryDicts = expectIndustryDicts;
  }

  public List<Long> getExpectLocations() {
    return expectLocations;
  }

  public void setExpectLocations(List<Long> expectLocations) {
    this.expectLocations = expectLocations;
  }

  public List<ExpectOrgHighlightDicts> getExpectOrgHighlightDicts() {
    return expectOrgHighlightDicts;
  }

  public void setExpectOrgHighlightDicts(List<ExpectOrgHighlightDicts> expectOrgHighlightDicts) {
    this.expectOrgHighlightDicts = expectOrgHighlightDicts;
  }

  public List<ExpectOrgs> getExpectOrgs() {
    return expectOrgs;
  }

  public void setExpectOrgs(List<ExpectOrgs> expectOrgs) {
    this.expectOrgs = expectOrgs;
  }

  public ExpectSalary getExpectSalary() {
    return expectSalary;
  }

  public void setExpectSalary(ExpectSalary expectSalary) {
    this.expectSalary = expectSalary;
  }

  public List<LeftReasonDicts> getLeftReasonDicts() {
    return leftReasonDicts;
  }

  public void setLeftReasonDicts(List<LeftReasonDicts> leftReasonDicts) {
    this.leftReasonDicts = leftReasonDicts;
  }
}
