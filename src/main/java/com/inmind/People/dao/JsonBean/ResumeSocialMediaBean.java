package com.inmind.People.dao.JsonBean;

import java.util.List;

/**
 * Created by zhao on 2017/2/22.
 */
public class ResumeSocialMediaBean {
  private String linkedinUrl;
  private String qqNo;
  private String wechatNo;
  private String weibo;
  List<String> homePages;

  public String getLinkedinUrl() {
    return linkedinUrl;
  }

  public void setLinkedinUrl(String linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  public String getQqNo() {
    return qqNo;
  }

  public void setQqNo(String qqNo) {
    this.qqNo = qqNo;
  }

  public String getWechatNo() {
    return wechatNo;
  }

  public void setWechatNo(String wechatNo) {
    this.wechatNo = wechatNo;
  }

  public String getWeibo() {
    return weibo;
  }

  public void setWeibo(String weibo) {
    this.weibo = weibo;
  }

  public List<String> getHomePages() {
    return homePages;
  }

  public void setHomePages(List<String> homePages) {
    this.homePages = homePages;
  }
}
