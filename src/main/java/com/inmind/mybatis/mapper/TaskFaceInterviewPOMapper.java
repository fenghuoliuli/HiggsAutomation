package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.TaskFaceInterviewPO;
import com.inmind.mybatis.entity.TaskFaceInterviewPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface TaskFaceInterviewPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    long countByExample(TaskFaceInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    int deleteByExample(TaskFaceInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    @Insert({
        "insert into task_face_interview (task_id, target_id, ",
        "relate_id, remind_at, ",
        "remind_execute_status, interview_at, ",
        "address, remind_before, ",
        "created_by, updated_by, ",
        "created_at, updated_at, ",
        "face_interview_status, remark)",
        "values (#{taskId,jdbcType=BIGINT}, #{targetId,jdbcType=BIGINT}, ",
        "#{relateId,jdbcType=BIGINT}, #{remindAt,jdbcType=TIMESTAMP}, ",
        "#{remindExecuteStatus,jdbcType=INTEGER}, #{interviewAt,jdbcType=TIMESTAMP}, ",
        "#{address,jdbcType=VARCHAR}, #{remindBefore,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{faceInterviewStatus,jdbcType=INTEGER}, #{remark,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TaskFaceInterviewPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    int insertSelective(TaskFaceInterviewPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    List<TaskFaceInterviewPO> selectByExampleWithBLOBsWithRowbounds(TaskFaceInterviewPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    List<TaskFaceInterviewPO> selectByExampleWithBLOBs(TaskFaceInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    List<TaskFaceInterviewPO> selectByExampleWithRowbounds(TaskFaceInterviewPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    List<TaskFaceInterviewPO> selectByExample(TaskFaceInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskFaceInterviewPO record, @Param("example") TaskFaceInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TaskFaceInterviewPO record, @Param("example") TaskFaceInterviewPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskFaceInterviewPO record, @Param("example") TaskFaceInterviewPOExample example);
}