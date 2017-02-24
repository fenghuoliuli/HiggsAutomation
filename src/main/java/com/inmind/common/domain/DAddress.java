package com.inmind.common.domain;

import com.inmind.mybatis.entity.AddressPO;

/**
 * Created by zhao on 2017/2/23.
 */
public class DAddress extends AddressPO {
  private DLocation location;

  public DLocation getLocation() {
    return location;
  }

  public void setLocation(DLocation location) {
    this.location = location;
  }
}

