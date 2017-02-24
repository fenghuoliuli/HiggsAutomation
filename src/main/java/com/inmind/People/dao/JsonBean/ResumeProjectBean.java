package com.inmind.People.dao.JsonBean;

/**
 * Created by zhao on 2017/2/22.
 */
public class ResumeProjectBean {
  private String description;
  private String devTech;
  private String endedAt;
  private int onPro;

  public static class org{
    private String displayName;
    private long id;
    private String name;

    public String getDisplayName() {
      return displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
  private String position;
  private long resumeId;
  private String startedAt;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDevTech() {
    return devTech;
  }

  public void setDevTech(String devTech) {
    this.devTech = devTech;
  }

  public String getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(String endedAt) {
    this.endedAt = endedAt;
  }

  public int getOnPro() {
    return onPro;
  }

  public void setOnPro(int onPro) {
    this.onPro = onPro;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public long getResumeId() {
    return resumeId;
  }

  public void setResumeId(long resumeId) {
    this.resumeId = resumeId;
  }

  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }
}
