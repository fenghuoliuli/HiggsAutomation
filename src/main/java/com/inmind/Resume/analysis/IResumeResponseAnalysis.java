package com.inmind.Resume.analysis;

/**
 * Created by zhao on 2017/2/23.
 */
public interface IResumeResponseAnalysis {
  void checkResumeBasic();
  void checkResumeEducation(long resumeId);
  void checkResumeExperience();
  void checkResumeExperienceWorkmat();
  void checkResumeLang();
  void checkResumeProject();
  void checkOrg();
  void checkCreatedByAccount();
  void checkOwner();
  void checkUpdatedByAccount();

}
