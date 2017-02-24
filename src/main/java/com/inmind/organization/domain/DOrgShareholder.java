package com.inmind.organization.domain;

import com.inmind.mybatis.entity.OrgShareholderPO;

/**
 * Created by zhao on 2017/2/23.
 */
public class DOrgShareholder extends OrgShareholderPO {
  private DOrganization org;

  public DOrganization getOrg() {
    return org;
  }

  public void setOrg(DOrganization org) {
    this.org = org;
  }
}
