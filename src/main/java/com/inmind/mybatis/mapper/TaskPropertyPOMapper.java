package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.TaskPropertyPO;
import com.inmind.mybatis.entity.TaskPropertyPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface TaskPropertyPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    long countByExample(TaskPropertyPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    int deleteByExample(TaskPropertyPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    @Insert({
        "insert into task_property (name, code, ",
        "task_type, interval_time, ",
        "dead_time, remind_time, ",
        "show_order, task_group_code, ",
        "created_by, updated_by, ",
        "created_at, updated_at, ",
        "project_roles, helper_role, ",
        "prop_status, pot_co_role)",
        "values (#{name,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
        "#{taskType,jdbcType=INTEGER}, #{intervalTime,jdbcType=INTEGER}, ",
        "#{deadTime,jdbcType=VARCHAR}, #{remindTime,jdbcType=VARCHAR}, ",
        "#{showOrder,jdbcType=INTEGER}, #{taskGroupCode,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{projectRoles,jdbcType=VARCHAR}, #{helperRole,jdbcType=VARCHAR}, ",
        "#{propStatus,jdbcType=INTEGER}, #{potCoRole,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TaskPropertyPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    int insertSelective(TaskPropertyPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    List<TaskPropertyPO> selectByExampleWithRowbounds(TaskPropertyPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    List<TaskPropertyPO> selectByExample(TaskPropertyPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskPropertyPO record, @Param("example") TaskPropertyPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_property
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskPropertyPO record, @Param("example") TaskPropertyPOExample example);
}