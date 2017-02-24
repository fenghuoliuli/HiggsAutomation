package com.inmind.common.domain;

import java.util.Date;

/**
 * Created by zhao on 2017/2/23.
 */
public class SearchDO {
  private Integer startRow;
  private Integer limitCount;

  private Long ownerId;

  private Date beginDate;
  private Date endDate;

  /**
   * Gets owner id.
   *
   * @return the owner id
   */
  public Long getOwnerId() {
    return ownerId;
  }

  /**
   * Sets owner id.
   *
   * @param ownerId the owner id
   */
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * Gets start row.
   *
   * @return the start row
   */
  public Integer getStartRow() {
    return startRow;
  }

  /**
   * Sets start row.
   *
   * @param startRow the start row
   */
  public void setStartRow(Integer startRow) {
    this.startRow = startRow;
  }

  /**
   * Gets limit count.
   *
   * @return the limit count
   */
  public Integer getLimitCount() {
    return limitCount;
  }

  /**
   * Sets limit count.
   *
   * @param limitCount the limit count
   */
  public void setLimitCount(Integer limitCount) {
    this.limitCount = limitCount;
  }

  /**
   * Gets begin date.
   *
   * @return the begin date
   */
  public Date getBeginDate() {
    return beginDate;
  }

  /**
   * Sets begin date.
   *
   * @param beginDate the begin date
   */
  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }

  /**
   * Gets end date.
   *
   * @return the end date
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * Sets end date.
   *
   * @param endDate the end date
   */
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
