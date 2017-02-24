package com.inmind.People.dao.JsonBean;
import java.util.List;

/**
 * Created by zhao on 2017/2/22.
 */
public class ResumeBasicBean {
  private List<Basic.SalaryDetail.Welfares>  welfaresList;
  private SalaryDetail salaryDetail;
  private List<Basic.IndustryDict> industryDicts;
  private List<Basic.FunctionDicts> functionDictses;
  private List<Basic.SkillDicts> skillDictses;
  private List<Basic.LeftReasonDicts> leftReasonDictses;
  private List<Basic.ExpectFunctionDicts> expectFunctionDictses;
  private List<Basic.ExpectIndustryDicts> expectIndustryDictses;
  private List<Basic.ExpectOrgHighlightDicts> expectOrgHighlightDictses;
  public static class Basic{
    private Integer hidden;
    private Integer status;
    public static class IndustryDict{
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

    public Integer getHidden() {
      return hidden;
    }

    public void setHidden(Integer hidden) {
      this.hidden = hidden;
    }

    public Integer getStatus() {
      return status;
    }

    public void setStatus(Integer status) {
      this.status = status;
    }

    public int getIsContact() {
      return isContact;
    }

    public void setIsContact(int isContact) {
      this.isContact = isContact;
    }

    public int getContactType() {
      return contactType;
    }

    public void setContactType(int contactType) {
      this.contactType = contactType;
    }

    public String getChineseName() {
      return chineseName;
    }

    public void setChineseName(String chineseName) {
      this.chineseName = chineseName;
    }

    public String getEnglishName() {
      return englishName;
    }

    public void setEnglishName(String englishName) {
      this.englishName = englishName;
    }

    public int getMobile() {
      return mobile;
    }

    public void setMobile(int mobile) {
      this.mobile = mobile;
    }

    public int getWorkTelType() {
      return workTelType;
    }

    public void setWorkTelType(int workTelType) {
      this.workTelType = workTelType;
    }

    public String getWorkEmail() {
      return workEmail;
    }

    public void setWorkEmail(String workEmail) {
      this.workEmail = workEmail;
    }

    public long getCurrentLocationId() {
      return currentLocationId;
    }

    public void setCurrentLocationId(long currentLocationId) {
      this.currentLocationId = currentLocationId;
    }

    public static class FunctionDicts{

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

    public static class  SkillDicts{
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
    public static class SalaryDetail{
       private Integer salaryType;
      private Integer month;
      private Integer bonusType;
      public static class Welfares{
        private Integer welfare;
        private double ammount;
        private String name;

        public Integer getWelfare() {
          return welfare;
        }

        public void setWelfare(Integer welfare) {
          this.welfare = welfare;
        }

        public double getAmmount() {
          return ammount;
        }

        public void setAmmount(double ammount) {
          this.ammount = ammount;
        }

        public String getName() {
          return name;
        }

        public void setName(String name) {
          this.name = name;
        }
      }

      public Integer getSalaryType() {
        return salaryType;
      }

      public void setSalaryType(Integer salaryType) {
        this.salaryType = salaryType;
      }

      public Integer getMonth() {
        return month;
      }

      public void setMonth(Integer month) {
        this.month = month;
      }

      public Integer getBonusType() {
        return bonusType;
      }

      public void setBonusType(Integer bonusType) {
        this.bonusType = bonusType;
      }
    }
    public static class LeftReasonDicts{

    }

    public static class ExpectIndustryDicts{
      public int code;
      public String name;
      public String type;

    }
    public static class ExpectFunctionDicts{
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
    public static class ExpectOrgHighlightDicts{

    }
    private int isContact;
    private int contactType;
    private String chineseName;
    private String englishName;
    private int mobile;
    private int workTelType;
    private String workEmail;
    private long currentLocationId;


  }

  public List<Basic.SalaryDetail.Welfares> getWelfaresList() {
    return welfaresList;
  }

  public void setWelfaresList(List<Basic.SalaryDetail.Welfares> welfaresList) {
    this.welfaresList = welfaresList;
  }

  public SalaryDetail getSalaryDetail() {
    return salaryDetail;
  }

  public void setSalaryDetail(SalaryDetail salaryDetail) {
    this.salaryDetail = salaryDetail;
  }

  public List<Basic.IndustryDict> getIndustryDicts() {
    return industryDicts;
  }

  public void setIndustryDicts(List<Basic.IndustryDict> industryDicts) {
    this.industryDicts = industryDicts;
  }

  public List<Basic.FunctionDicts> getFunctionDictses() {
    return functionDictses;
  }

  public void setFunctionDictses(List<Basic.FunctionDicts> functionDictses) {
    this.functionDictses = functionDictses;
  }

  public List<Basic.SkillDicts> getSkillDictses() {
    return skillDictses;
  }

  public void setSkillDictses(List<Basic.SkillDicts> skillDictses) {
    this.skillDictses = skillDictses;
  }

  public List<Basic.LeftReasonDicts> getLeftReasonDictses() {
    return leftReasonDictses;
  }

  public void setLeftReasonDictses(List<Basic.LeftReasonDicts> leftReasonDictses) {
    this.leftReasonDictses = leftReasonDictses;
  }

  public List<Basic.ExpectFunctionDicts> getExpectFunctionDictses() {
    return expectFunctionDictses;
  }

  public void setExpectFunctionDictses(List<Basic.ExpectFunctionDicts> expectFunctionDictses) {
    this.expectFunctionDictses = expectFunctionDictses;
  }

  public List<Basic.ExpectIndustryDicts> getExpectIndustryDictses() {
    return expectIndustryDictses;
  }

  public void setExpectIndustryDictses(List<Basic.ExpectIndustryDicts> expectIndustryDictses) {
    this.expectIndustryDictses = expectIndustryDictses;
  }

  public List<Basic.ExpectOrgHighlightDicts> getExpectOrgHighlightDictses() {
    return expectOrgHighlightDictses;
  }

  public void setExpectOrgHighlightDictses(List<Basic.ExpectOrgHighlightDicts> expectOrgHighlightDictses) {
    this.expectOrgHighlightDictses = expectOrgHighlightDictses;
  }

  public static class SalaryDetail {

  }
}
