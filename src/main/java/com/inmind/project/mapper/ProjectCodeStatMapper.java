package com.inmind.project.mapper;

import com.inmind.mybatis.mapper.ProjectCodeStatPOMapper;
import com.inmind.project.domain.DProjectCodeStat;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zhao on 2017/2/23.
 */
public interface ProjectCodeStatMapper extends ProjectCodeStatPOMapper {
  @Select("select * from project_code_stat a where a.project_id=#{projectId} limit 1")
  @ResultType(DProjectCodeStat.class)
  DProjectCodeStat getByProject(@Param("projectId") Long projectId);

  @Select("SELECT " +
      " sum(longlist) longlist, " +
      " sum(recommend) recommend, " +
      " sum(interview) interview, " +
      " sum(offer) offer, " +
      " sum(entry) entry, " +
      " sum(onboard) onboard " +
      "FROM " +
      " project_target a " +
      "WHERE " +
      " a.project_id = #{projectId} " +
      "AND a.created_by = #{userId}")
  @ResultType(DProjectCodeStat.class)
  DProjectCodeStat getFromProjectTargetByProjectAndUser(@Param("projectId") Long projectId,
                                                        @Param("userId") Long userId);

  Integer refreshItSelf(@Param("projectId") Long projectId, @Param("userId") Long userId);
}
