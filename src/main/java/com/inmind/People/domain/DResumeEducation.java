package com.inmind.People.domain;

import com.inmind.common.domain.DDict;
import com.inmind.common.domain.DSchool;
import com.inmind.mybatis.entity.ResumeEducationPO;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class DResumeEducation extends ResumeEducationPO {
  private DSchool school;

  private DDict majorDict;

  private List<DDict> schoolGrades;

  public DSchool getSchool() {
    return school;
  }

  public void setSchool(DSchool school) {
    this.school = school;
  }

  public DDict getMajorDict() {
    return majorDict;
  }

  public void setMajorDict(DDict majorDict) {
    this.majorDict = majorDict;
  }

  public List<DDict> getSchoolGrades() {
    return schoolGrades;
  }

  public void setSchoolGrades(List<DDict> schoolGrades) {
    this.schoolGrades = schoolGrades;
  }
}
