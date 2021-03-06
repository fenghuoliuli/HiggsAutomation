package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.TTaskPO;
import com.inmind.mybatis.entity.TTaskPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface TTaskPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    long countByExample(TTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    int deleteByExample(TTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_task (company_id, name, ",
        "task_type, task_ref_id, ",
        "reason, priority, ",
        "task_rule_id, prop_code, ",
        "group_code, is_init_task, ",
        "parent_id, task_status, ",
        "executed_by, target_resume, ",
        "people_id, dead_line, ",
        "started_at, created_by, ",
        "updated_by, created_at, ",
        "updated_at, description)",
        "values (#{companyId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{taskType,jdbcType=INTEGER}, #{taskRefId,jdbcType=BIGINT}, ",
        "#{reason,jdbcType=VARCHAR}, #{priority,jdbcType=INTEGER}, ",
        "#{taskRuleId,jdbcType=BIGINT}, #{propCode,jdbcType=VARCHAR}, ",
        "#{groupCode,jdbcType=VARCHAR}, #{isInitTask,jdbcType=INTEGER}, ",
        "#{parentId,jdbcType=BIGINT}, #{taskStatus,jdbcType=INTEGER}, ",
        "#{executedBy,jdbcType=BIGINT}, #{targetResume,jdbcType=BIGINT}, ",
        "#{peopleId,jdbcType=BIGINT}, #{deadLine,jdbcType=TIMESTAMP}, ",
        "#{startedAt,jdbcType=TIMESTAMP}, #{createdBy,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{description,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TTaskPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    int insertSelective(TTaskPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    List<TTaskPO> selectByExampleWithBLOBsWithRowbounds(TTaskPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    List<TTaskPO> selectByExampleWithBLOBs(TTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    List<TTaskPO> selectByExampleWithRowbounds(TTaskPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    List<TTaskPO> selectByExample(TTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TTaskPO record, @Param("example") TTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TTaskPO record, @Param("example") TTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TTaskPO record, @Param("example") TTaskPOExample example);
}