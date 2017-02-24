package com.inmind.People.domain;

import com.inmind.mybatis.entity.ResumeProjectPO;
import com.inmind.organization.domain.DOrganization;

/**
 * Created by zhao on 2017/2/23.
 */
public class DResumeProject extends ResumeProjectPO{
  private DOrganization org;

  public DOrganization getOrg() {
    return org;
  }

  public void setOrg(DOrganization org) {
    this.org = org;
  }
}
