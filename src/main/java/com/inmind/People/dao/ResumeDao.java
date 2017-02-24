package com.inmind.People.dao;

import com.inmind.mybatis.entity.ResumeEducationPO;
import com.inmind.mybatis.entity.ResumeExperiencePO;
import com.inmind.mybatis.entity.ResumeLangPO;
import com.inmind.mybatis.entity.ResumePO;
import com.inmind.mybatis.entity.ResumeProjectPO;
import com.inmind.mybatis.mapper.ResumePOMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface ResumeDao extends ResumePOMapper {
  ResumePO selectResumeBasic(@Param("resumeId") Long resumeId);
  ResumeEducationPO selectEducationById(@Param("resumeId") Long resumeId);
  ResumeExperiencePO selectExperienceById(@Param("resumeId") Long resumeId);
  ResumeLangPO selectLangById(@Param("resumeId") Long resumeId);
  ResumeProjectPO selectProjectById(@Param("resumeId") Long resumeId);

}
