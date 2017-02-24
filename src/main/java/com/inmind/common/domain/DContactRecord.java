package com.inmind.common.domain;

import com.inmind.People.domain.DResume;
import com.inmind.mybatis.entity.ContactRecordPO;
import com.inmind.organization.domain.DOrganization;
import com.inmind.project.domain.DProject;

/**
 * Created by zhao on 2017/2/23.
 */
public class DContactRecord extends ContactRecordPO{
  private DOrganization organization;
  private DProject project;
  private DResume resume;

  public DOrganization getOrganization() {
    return organization;
  }

  public void setOrganization(DOrganization organization) {
    this.organization = organization;
  }

  public DProject getProject() {
    return project;
  }

  public void setProject(DProject project) {
    this.project = project;
  }

  public DResume getResume() {
    return resume;
  }

  public void setResume(DResume resume) {
    this.resume = resume;
  }
}
