package com.inmind.People.vobean;

import com.inmind.utils.DateUtil;

import com.inmind.common.*;
import org.apache.commons.lang.time.DateUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class CandidateSearchReq {
  private Integer isMyOwn;

  private Long ownerId;

  private Integer hidden;

  // 查询公司候选人时用
  private Long orgId;

  // 只看有附件
  private Integer hasAttachments;

  // 行业
  private String industries;

  // 职业
  private String positions;

  // 公司
  private String orgNames;

  // 关键字
  private String keywords;

  // 所在城市/行政区
  private List<Long> locationIds;

  // 学历
  private List<Long> degrees;

  // 工作经验
  private MinMaxInt seniority;

  // 年龄
  private MinMaxInt age;

  // 最近联系
  private MinMaxInt contactAt;

  // 完整度
  private MinMaxDecimal integrity;

  // 0： 候选人，1：联系人
  private Integer type;

  private Integer page;

  private Integer size;

  public Integer getIsMyOwn() {
    return isMyOwn;
  }

  public void setIsMyOwn(Integer isMyOwn) {
    this.isMyOwn = isMyOwn;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public Integer getHidden() {
    return hidden;
  }

  public void setHidden(Integer hidden) {
    this.hidden = hidden;
  }

  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public Integer getHasAttachments() {
    return hasAttachments;
  }

  public void setHasAttachments(Integer hasAttachments) {
    this.hasAttachments = hasAttachments;
  }

  public String getIndustries() {
    return industries;
  }

  public void setIndustries(String industries) {
    this.industries = industries;
  }

  public String getPositions() {
    return positions;
  }

  public void setPositions(String positions) {
    this.positions = positions;
  }

  public String getOrgNames() {
    return orgNames;
  }

  public void setOrgNames(String orgNames) {
    this.orgNames = orgNames;
  }

  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public List<Long> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<Long> locationIds) {
    this.locationIds = locationIds;
  }

  public List<Long> getDegrees() {
    return degrees;
  }

  public void setDegrees(List<Long> degrees) {
    this.degrees = degrees;
  }

  public MinMaxInt getSeniority() {
    return seniority;
  }

  public void setSeniority(MinMaxInt seniority) {
    this.seniority = seniority;
  }

  public MinMaxInt getAge() {
    return age;
  }

  public void setAge(MinMaxInt age) {
    this.age = age;
  }

  public MinMaxInt getContactAt() {
    return contactAt;
  }

  public void setContactAt(MinMaxInt contactAt) {
    this.contactAt = contactAt;
  }

  public MinMaxDecimal getIntegrity() {
    return integrity;
  }

  public void setIntegrity(MinMaxDecimal integrity) {
    this.integrity = integrity;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getPage() {
    if (page == null || page < 1) {
      return Pagination.FIRST_PAGE;
    }
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getSize() {
    if (size == null || size < 1) {
      return Pagination.DEFAULT_SIZE;
    }
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getWorkStartedAtMin() {
    if (seniority != null && seniority.getMax() != null) {
      Date date = DateUtils.addYears(new Date(), -seniority.getMax());
      return DateUtil.formatISO_8601(date);
    }
    return null;
  }

  public String getWorkStartedAtMax() {
    if (seniority != null && seniority.getMin() != null) {
      Date date = DateUtils.addYears(new Date(), -seniority.getMin());
      return DateUtil.formatISO_8601(date);
    }
    return null;
  }

  public String getBirthdayMin() {
    if (age != null && age.getMax() != null) {
      Date date = DateUtils.addYears(new Date(), -age.getMax());
      return DateUtil.formatISO_8601(date);
    }
    return null;
  }

  public String getBirthdayMax() {
    if (age != null && age.getMin() != null) {
      Date date = DateUtils.addYears(new Date(), -age.getMin());
      return DateUtil.formatISO_8601(date);
    }
    return null;
  }

  public String getContactAtMin() {
    if (contactAt != null && contactAt.getMax() != null) {
      Date date = DateUtils.addMonths(new Date(), -contactAt.getMax());
      return DateUtil.formatISO_8601(date);
    }
    return null;
  }

  public String getContactAtMax() {
    if (contactAt != null && contactAt.getMin() != null) {
      Date date = DateUtils.addMonths(new Date(), -contactAt.getMin());
      return DateUtil.formatISO_8601(date);
    }
    return null;
  }

  public BigDecimal getIntegrityMin() {
    if (integrity != null && integrity.getMin() != null) {
      return integrity.getMin();
    }
    return null;
  }

  public BigDecimal getIntegrityMax() {
    if (integrity != null && integrity.getMax() != null) {
      return integrity.getMax();
    }
    return null;
  }
}
