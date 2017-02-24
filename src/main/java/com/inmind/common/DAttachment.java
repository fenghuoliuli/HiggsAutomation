package com.inmind.common;

import com.inmind.mybatis.entity.AttachmentPO;
import com.inmind.security.domain.DAccount;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class DAttachment extends AttachmentPO{
  private List<DAttachmentRef> attachmentRefs;

  private DAccount uploadedByAccount;

  private DAccount createdByAccount;

  private DAccount updatedByAccount;

  public List<DAttachmentRef> getAttachmentRefs() {
    return attachmentRefs;
  }

  public void setAttachmentRefs(List<DAttachmentRef> attachmentRefs) {
    this.attachmentRefs = attachmentRefs;
  }

  public DAccount getUploadedByAccount() {
    return uploadedByAccount;
  }

  public void setUploadedByAccount(DAccount uploadedByAccount) {
    this.uploadedByAccount = uploadedByAccount;
  }

  public DAccount getCreatedByAccount() {
    return createdByAccount;
  }

  public void setCreatedByAccount(DAccount createdByAccount) {
    this.createdByAccount = createdByAccount;
  }

  public DAccount getUpdatedByAccount() {
    return updatedByAccount;
  }

  public void setUpdatedByAccount(DAccount updatedByAccount) {
    this.updatedByAccount = updatedByAccount;
  }
}
