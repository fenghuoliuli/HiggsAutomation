package com.inmind.common.domain;

import com.inmind.mybatis.entity.DictPO;

/**
 * Created by zhao on 2017/2/23.
 */
public class DDict extends DictPO{

  private Integer generated;

  public Integer getGenerated() {
    return generated;
  }

  public void setGenerated(Integer generated) {
    this.generated = generated;
  }
}
