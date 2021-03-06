package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.TTaskGroupPO;
import com.inmind.mybatis.entity.TTaskGroupPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface TTaskGroupPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    long countByExample(TTaskGroupPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    int deleteByExample(TTaskGroupPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_task_group (company_id, name, ",
        "code, type, show_order, ",
        "created_by, updated_by, ",
        "created_at, updated_at)",
        "values (#{companyId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{code,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, #{showOrder,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TTaskGroupPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    int insertSelective(TTaskGroupPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    List<TTaskGroupPO> selectByExampleWithRowbounds(TTaskGroupPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    List<TTaskGroupPO> selectByExample(TTaskGroupPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TTaskGroupPO record, @Param("example") TTaskGroupPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TTaskGroupPO record, @Param("example") TTaskGroupPOExample example);
}