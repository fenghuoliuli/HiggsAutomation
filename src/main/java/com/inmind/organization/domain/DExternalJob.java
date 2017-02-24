package com.inmind.organization.domain;

import com.inmind.mybatis.entity.ExternalJobPO;

/**
 * Created by zhao on 2017/2/23.
 */
public class DExternalJob extends ExternalJobPO {
  private String locationStr;

  private String pubAtStr;

  public String getLocationStr() {
    return locationStr;
  }

  public void setLocationStr(String locationStr) {
    this.locationStr = locationStr;
  }

  public String getPubAtStr() {
    return pubAtStr;
  }

  public void setPubAtStr(String pubAtStr) {
    this.pubAtStr = pubAtStr;
  }

  /**
   * Created by zhao on 2017/2/23.
   */
  public static class DOrgDevContract {
  }
}
