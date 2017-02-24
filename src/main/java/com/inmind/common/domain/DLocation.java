package com.inmind.common.domain;

import com.inmind.mybatis.entity.LocationPO;
import com.inmind.mybatis.mapper.LocationPOMapper;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class DLocation extends LocationPO {
  private Integer locationType;

  private DLocation parent;

  private List<DLocation> children;

  public Integer getLocationType() {
    return locationType;
  }

  public void setLocationType(Integer locationType) {
    this.locationType = locationType;
  }

  public DLocation getParent() {
    return parent;
  }

  public void setParent(DLocation parent) {
    this.parent = parent;
  }

  public List<DLocation> getChildren() {
    return children;
  }

  public void setChildren(List<DLocation> children) {
    this.children = children;
  }
}
