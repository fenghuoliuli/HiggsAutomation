package com.inmind.mail.domain;

/**
 * Created by zhao on 2017/2/23.
 */
public class DMailContact extends MailContact {
  private String chineseName;

  private String englishName;

  private String privateEmail;

  private String workingEmail;

  private String otherEmail;

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

  public String getPrivateEmail() {
    return privateEmail;
  }

  public void setPrivateEmail(String privateEmail) {
    this.privateEmail = privateEmail;
  }

  public String getWorkingEmail() {
    return workingEmail;
  }

  public void setWorkingEmail(String workingEmail) {
    this.workingEmail = workingEmail;
  }

  public String getOtherEmail() {
    return otherEmail;
  }

  public void setOtherEmail(String otherEmail) {
    this.otherEmail = otherEmail;
  }
}
