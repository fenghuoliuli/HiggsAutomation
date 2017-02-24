package com.inmind.People.service;
import com.inmind.People.dao.JsonBean.*;
import com.inmind.People.dao.ResumeDao;
import com.inmind.mybatis.entity.ResumeEducationPO;
import com.inmind.mybatis.entity.ResumeExperiencePO;
import com.inmind.mybatis.entity.ResumeLangPO;
import com.inmind.mybatis.entity.ResumePO;
import com.inmind.mybatis.entity.ResumeProjectPO;


/**
 * Created by zhao on 2017/2/23.
 */
public interface IResumeResponseService {

  ResumePO getResumeBasic(Long resumeId);
  ResumeEducationPO getEducation(Long resumeId);
  ResumeExperiencePO getExperience(Long resumeId);
  ResumeProjectPO getProject(Long resumeId);
  ResumeLangPO getLang(Long resumeId);
}
