package com.inmind.project.mapper;

import com.inmind.mybatis.entity.ProjectAssignPO;
import com.inmind.mybatis.mapper.ProjectAssignPOMapper;
import com.inmind.project.domain.DProjectAssign;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface ProjectAssignMapper extends ProjectAssignPOMapper{
  @Select("select * from project_assign where owner_id=#{ownerId} and project_id=#{projectId}")
  List<ProjectAssignPO> getByOwnerIdAndProjectId(@Param("ownerId") Long ownerId, @Param("projectId")
      Long projectId);

  @Select("select * from project_assign where  project_id=#{projectId} order by id asc")
  List<ProjectAssignPO> getAssignByProjectId(@Param("projectId") Long projectId);

  List<DProjectAssign> getTargetAssign(@Param("projectId") Long projectId, @Param("resumeId") Long resumeId);

  Long getTargetCByResume(@Param("projectId") Long projectId, @Param("resumeId") Long resumeId);
}
