package com.inmind.common.bean;

import com.inmind.common.domain.DContactRecord;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class ContactRecordResp {

  private Object content;
  private List<DContactRecord> contactContext;

  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public List<DContactRecord> getContactContext() {
    return contactContext;
  }

  public void setContactContext(List<DContactRecord> contactContext) {
    this.contactContext = contactContext;
  }
}
