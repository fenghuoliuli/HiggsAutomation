package com.inmind.People.service.iml;

import com.inmind.People.dao.ResumeDao;
import com.inmind.People.service.IResumeResponseService;
import com.inmind.Resume.analysis.IResumeResponseAnalysis;
import com.inmind.mybatis.entity.ResumeEducationPO;
import com.inmind.mybatis.entity.ResumeExperiencePO;
import com.inmind.mybatis.entity.ResumeLangPO;
import com.inmind.mybatis.entity.ResumePO;
import com.inmind.mybatis.entity.ResumeProjectPO;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhao on 2017/2/24.
 */
@Service
public class ResumeResponseServiceIml implements IResumeResponseService{
  @Resource
  private ResumeDao resumeDao;

  public ResumePO getResumeBasic(Long resumeId) {
    ResumePO resumePO;
    resumePO = resumeDao.selectResumeBasic(resumeId);
       return resumePO;
  }

  public ResumeEducationPO getEducation(Long resumeId) {
    ResumeEducationPO resumeEducationPO;
    resumeEducationPO = resumeDao.selectEducationById(resumeId);
    return resumeEducationPO;
  }

  public ResumeExperiencePO getExperience(Long resumeId) {
    ResumeExperiencePO resumeExperiencePO;
    resumeExperiencePO = resumeDao.selectExperienceById(resumeId);
    return resumeExperiencePO;
  }

  public ResumeProjectPO getProject(Long resumeId) {
    ResumeProjectPO resumeProjectPO;
    resumeProjectPO = resumeDao.selectProjectById(resumeId);
    return resumeProjectPO;
  }

  public ResumeLangPO getLang(Long resumeId) {
    ResumeLangPO resumeLangPO;
    resumeLangPO =  resumeDao.selectLangById(resumeId);
    return null;
  }
}
