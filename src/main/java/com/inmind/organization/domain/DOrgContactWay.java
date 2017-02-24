package com.inmind.organization.domain;

import com.inmind.common.domain.DAddress;
import com.inmind.mybatis.entity.OrgContactWayPO;
import com.inmind.security.domain.DAccount;

/**
 * Created by zhao on 2017/2/23.
 */
public class DOrgContactWay extends OrgContactWayPO {
  private DAddress address;

  private DAccount createdByAccount;

  public DAddress getAddress() {
    return address;
  }

  public void setAddress(DAddress address) {
    this.address = address;
  }

  public DAccount getCreatedByAccount() {
    return createdByAccount;
  }

  public void setCreatedByAccount(DAccount createdByAccount) {
    this.createdByAccount = createdByAccount;
  }
}
