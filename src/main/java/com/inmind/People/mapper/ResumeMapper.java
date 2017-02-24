package com.inmind.People.mapper;

import com.inmind.People.domain.DResume;
import com.inmind.People.vobean.CandidateSearchReq;
import com.inmind.mail.domain.DMailContact;
import com.inmind.mybatis.entity.ResumePO;
import com.inmind.mybatis.mapper.ResumePOMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface ResumeMapper extends ResumePOMapper {

  List<ResumePO> checkIfRepetition(DResume resume);
  List<ResumePO> selectResumeBasic(long resumeId);

  List<ResumePO> checkIfRepetitionInOrg(
      @Param("id") Long id,
      @Param("orgId") Long orgId,
      @Param("chineseName") String chineseName);

  List<ResumePO> batchGetResumeName(@Param("resumeList") List<Long> resumeList);

  List<ResumePO> batchGetResume(@Param("resumeList") List<Long> resumeList);

  List<ResumePO> selectAllCopies(@Param("peopleId") Long peopleId, @Param("ownerId") Long ownerId);

  Long countAllCopies(@Param("peopleId") Long peopleId, @Param("ownerId") Long ownerId);

  List<ResumePO> selectMyResumes(CandidateSearchReq resumeSearchReq);

  Long countMyResumes(CandidateSearchReq resumeSearchReq);

  Long countByOrgId(Long orgId);

  List<DMailContact> selectMailContact(@Param("accountId") Long accountId,
                                       @Param("name") String name);
}

