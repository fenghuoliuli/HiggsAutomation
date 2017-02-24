package com.inmind.People.dao.JsonBean;

/**
 * Created by zhao on 2017/2/22.
 */
public class ResumeEducationBean {
  private long id;
  private String startedAt;
  private String endedAt;
  private int type;
  private int degree;
  private int onEdu;
  private long resumeId;
  private School school;
  private MajorDict majorDict;
  private SchoolGrades schoolGrades;
  public static class School{
    private long code;
    private String name;

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


  }
  public static class MajorDict{
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
  private int schoolType;

  public static class SchoolGrades{}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  public String getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(String endedAt) {
    this.endedAt = endedAt;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getDegree() {
    return degree;
  }

  public void setDegree(int degree) {
    this.degree = degree;
  }

  public int getOnEdu() {
    return onEdu;
  }

  public void setOnEdu(int onEdu) {
    this.onEdu = onEdu;
  }

  public long getResumeId() {
    return resumeId;
  }

  public void setResumeId(long resumeId) {
    this.resumeId = resumeId;
  }

  public School getSchool() {
    return school;
  }

  public void setSchool(School school) {
    this.school = school;
  }

  public MajorDict getMajorDict() {
    return majorDict;
  }

  public void setMajorDict(MajorDict majorDict) {
    this.majorDict = majorDict;
  }

  public SchoolGrades getSchoolGrades() {
    return schoolGrades;
  }

  public void setSchoolGrades(SchoolGrades schoolGrades) {
    this.schoolGrades = schoolGrades;
  }

  public int getSchoolType() {
    return schoolType;
  }

  public void setSchoolType(int schoolType) {
    this.schoolType = schoolType;
  }
}
