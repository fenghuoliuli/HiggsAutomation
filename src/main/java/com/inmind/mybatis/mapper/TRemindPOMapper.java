package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.TRemindPO;
import com.inmind.mybatis.entity.TRemindPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface TRemindPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    long countByExample(TRemindPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    int deleteByExample(TRemindPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_remind (company_id, task_id, ",
        "project_id, account_id, ",
        "remind_at, priority, ",
        "title, source_type, ",
        "source_id, remind_ref_id, ",
        "remind_type, repeat_day, ",
        "repeat_type, status, ",
        "started_at, finished_at, ",
        "created_by, updated_by, ",
        "created_at, updated_at, ",
        "description)",
        "values (#{companyId,jdbcType=BIGINT}, #{taskId,jdbcType=BIGINT}, ",
        "#{projectId,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{remindAt,jdbcType=TIMESTAMP}, #{priority,jdbcType=INTEGER}, ",
        "#{title,jdbcType=VARCHAR}, #{sourceType,jdbcType=INTEGER}, ",
        "#{sourceId,jdbcType=BIGINT}, #{remindRefId,jdbcType=BIGINT}, ",
        "#{remindType,jdbcType=INTEGER}, #{repeatDay,jdbcType=VARCHAR}, ",
        "#{repeatType,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, ",
        "#{startedAt,jdbcType=TIMESTAMP}, #{finishedAt,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{description,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TRemindPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    int insertSelective(TRemindPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    List<TRemindPO> selectByExampleWithBLOBsWithRowbounds(TRemindPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    List<TRemindPO> selectByExampleWithBLOBs(TRemindPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    List<TRemindPO> selectByExampleWithRowbounds(TRemindPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    List<TRemindPO> selectByExample(TRemindPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TRemindPO record, @Param("example") TRemindPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TRemindPO record, @Param("example") TRemindPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_remind
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TRemindPO record, @Param("example") TRemindPOExample example);
}