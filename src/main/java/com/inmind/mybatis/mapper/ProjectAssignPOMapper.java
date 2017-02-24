package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.ProjectAssignPO;
import com.inmind.mybatis.entity.ProjectAssignPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface ProjectAssignPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    long countByExample(ProjectAssignPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    int deleteByExample(ProjectAssignPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    @Insert({
        "insert into project_assign (company_id, owner_id, ",
        "project_id, project_role, ",
        "status, dealed_at, ",
        "created_by, updated_by, ",
        "created_at, updated_at)",
        "values (#{companyId,jdbcType=BIGINT}, #{ownerId,jdbcType=BIGINT}, ",
        "#{projectId,jdbcType=BIGINT}, #{projectRole,jdbcType=INTEGER}, ",
        "#{status,jdbcType=VARCHAR}, #{dealedAt,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ProjectAssignPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    int insertSelective(ProjectAssignPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    List<ProjectAssignPO> selectByExampleWithRowbounds(ProjectAssignPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    List<ProjectAssignPO> selectByExample(ProjectAssignPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProjectAssignPO record, @Param("example") ProjectAssignPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_assign
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProjectAssignPO record, @Param("example") ProjectAssignPOExample example);
}