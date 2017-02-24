package com.inmind.People.dao.JsonBean;

import java.util.List;

/**
 * Created by zhao on 2017/2/22.
 */
public class ResumeSalaryBean {
  private double annualSalary;
  private long resumeId;
  private SalaryDetail salaryDetail;

  public static class SalaryDetail{
    private double baseSalary;
    private double bonus;
    private double bonusType;
    private int month;
    private double royalty;
    private int royaltyType;
    private int salaryType;
    private String stockOption;
    private List<Welfares> welfaresList;
    public static class Welfares{
      private double amount;
      private String name;
      private int welfare;

      public double getAmount() {
        return amount;
      }

      public void setAmount(double amount) {
        this.amount = amount;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public int getWelfare() {
        return welfare;
      }

      public void setWelfare(int welfare) {
        this.welfare = welfare;
      }
    }

    public double getBaseSalary() {
      return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
      this.baseSalary = baseSalary;
    }

    public double getBonus() {
      return bonus;
    }

    public void setBonus(double bonus) {
      this.bonus = bonus;
    }

    public double getBonusType() {
      return bonusType;
    }

    public void setBonusType(double bonusType) {
      this.bonusType = bonusType;
    }

    public int getMonth() {
      return month;
    }

    public void setMonth(int month) {
      this.month = month;
    }

    public double getRoyalty() {
      return royalty;
    }

    public void setRoyalty(double royalty) {
      this.royalty = royalty;
    }

    public int getRoyaltyType() {
      return royaltyType;
    }

    public void setRoyaltyType(int royaltyType) {
      this.royaltyType = royaltyType;
    }

    public int getSalaryType() {
      return salaryType;
    }

    public void setSalaryType(int salaryType) {
      this.salaryType = salaryType;
    }

    public String getStockOption() {
      return stockOption;
    }

    public void setStockOption(String stockOption) {
      this.stockOption = stockOption;
    }
  }

  public double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public long getResumeId() {
    return resumeId;
  }

  public void setResumeId(long resumeId) {
    this.resumeId = resumeId;
  }

  public SalaryDetail getSalaryDetail() {
    return salaryDetail;
  }

  public void setSalaryDetail(SalaryDetail salaryDetail) {
    this.salaryDetail = salaryDetail;
  }
}
