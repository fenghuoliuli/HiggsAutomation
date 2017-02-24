package com.inmind.People.dao.JsonBean;

import java.util.List;

/**
 * Created by zhao on 2017/2/22.
 */
public class ResumePersonSkillBean {
  List<CertificateDicts> certificateDictses;
  private long resumeId;
  List<SkillDicts> skillDictses;

  public static class CertificateDicts{
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

  public static class ResumeLangs{
    private int grade;
    private long id;
    List<Lang> langs;
    public static class Lang{
      private int code;
      private String name;
      private String type;

      public int getCode() {
        return code;
      }

      public void setCode(int code) {
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

    public int getGrade() {
      return grade;
    }

    public void setGrade(int grade) {
      this.grade = grade;
    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public List<Lang> getLangs() {
      return langs;
    }

    public void setLangs(List<Lang> langs) {
      this.langs = langs;
    }
  }
  public static class SkillDicts{
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


}
