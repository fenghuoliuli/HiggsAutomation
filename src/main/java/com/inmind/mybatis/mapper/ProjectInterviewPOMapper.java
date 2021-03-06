package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.ProjectInterviewPO;
import com.inmind.mybatis.entity.ProjectInterviewPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface ProjectInterviewPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    long countByExample(ProjectInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    int deleteByExample(ProjectInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    @Insert({
        "insert into project_interview (company_id, project_id, ",
        "resume_id, people_id, ",
        "start_at, address, ",
        "step, is_last, interviewers, ",
        "task_interview_status, client_status, ",
        "candidate_status, created_by, ",
        "updated_by, created_at, ",
        "updated_at, interview_type, ",
        "interviewer_style, hr_question, ",
        "contactor, status, ",
        "remark)",
        "values (#{companyId,jdbcType=BIGINT}, #{projectId,jdbcType=BIGINT}, ",
        "#{resumeId,jdbcType=BIGINT}, #{peopleId,jdbcType=BIGINT}, ",
        "#{startAt,jdbcType=TIMESTAMP}, #{address,jdbcType=VARCHAR}, ",
        "#{step,jdbcType=INTEGER}, #{isLast,jdbcType=INTEGER}, #{interviewers,jdbcType=VARCHAR}, ",
        "#{taskInterviewStatus,jdbcType=INTEGER}, #{clientStatus,jdbcType=INTEGER}, ",
        "#{candidateStatus,jdbcType=INTEGER}, #{createdBy,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{interviewType,jdbcType=INTEGER}, ",
        "#{interviewerStyle,jdbcType=VARCHAR}, #{hrQuestion,jdbcType=VARCHAR}, ",
        "#{contactor,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ProjectInterviewPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    int insertSelective(ProjectInterviewPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    List<ProjectInterviewPO> selectByExampleWithBLOBsWithRowbounds(ProjectInterviewPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    List<ProjectInterviewPO> selectByExampleWithBLOBs(ProjectInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    List<ProjectInterviewPO> selectByExampleWithRowbounds(ProjectInterviewPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    List<ProjectInterviewPO> selectByExample(ProjectInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProjectInterviewPO record, @Param("example") ProjectInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ProjectInterviewPO record, @Param("example") ProjectInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_interview
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProjectInterviewPO record, @Param("example") ProjectInterviewPOExample example);
}