package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.ProjectPO;
import com.inmind.mybatis.entity.ProjectPOExample;
import com.inmind.mybatis.entity.ProjectPOWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface ProjectPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    long countByExample(ProjectPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int deleteByExample(ProjectPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    @Insert({
        "insert into project (company_id, type, ",
        "status, title, org_id, ",
        "address_ids, headcount, ",
        "forecast_turnover, salary_lower, ",
        "salary_upper, work_years_lower, ",
        "work_years_upper, age_lower, ",
        "age_upper, gender_code, ",
        "pause_at, belong_dept_id, ",
        "report_target, sub_count, ",
        "contact_ids, contract_id, ",
        "target_org_ids, warranty_period, ",
        "bd_id, created_by, updated_by, ",
        "created_at, updated_at, ",
        "grade, failure_reason, ",
        "failure_type, probation_days, ",
        "latest_event_at, latest_index_at, ",
        "salary_detail, job_duty, ",
        "job_requirement, contract_detail)",
        "values (#{companyId,jdbcType=BIGINT}, #{type,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, #{orgId,jdbcType=BIGINT}, ",
        "#{addressIds,jdbcType=VARCHAR}, #{headcount,jdbcType=INTEGER}, ",
        "#{forecastTurnover,jdbcType=DECIMAL}, #{salaryLower,jdbcType=DECIMAL}, ",
        "#{salaryUpper,jdbcType=DECIMAL}, #{workYearsLower,jdbcType=INTEGER}, ",
        "#{workYearsUpper,jdbcType=INTEGER}, #{ageLower,jdbcType=INTEGER}, ",
        "#{ageUpper,jdbcType=INTEGER}, #{genderCode,jdbcType=INTEGER}, ",
        "#{pauseAt,jdbcType=TIMESTAMP}, #{belongDeptId,jdbcType=BIGINT}, ",
        "#{reportTarget,jdbcType=VARCHAR}, #{subCount,jdbcType=INTEGER}, ",
        "#{contactIds,jdbcType=VARCHAR}, #{contractId,jdbcType=BIGINT}, ",
        "#{targetOrgIds,jdbcType=VARCHAR}, #{warrantyPeriod,jdbcType=INTEGER}, ",
        "#{bdId,jdbcType=BIGINT}, #{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{grade,jdbcType=INTEGER}, #{failureReason,jdbcType=VARCHAR}, ",
        "#{failureType,jdbcType=VARCHAR}, #{probationDays,jdbcType=INTEGER}, ",
        "#{latestEventAt,jdbcType=TIMESTAMP}, #{latestIndexAt,jdbcType=TIMESTAMP}, ",
        "#{salaryDetail,jdbcType=LONGVARCHAR}, #{jobDuty,jdbcType=LONGVARCHAR}, ",
        "#{jobRequirement,jdbcType=LONGVARCHAR}, #{contractDetail,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ProjectPOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int insertSelective(ProjectPOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    List<ProjectPOWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ProjectPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    List<ProjectPOWithBLOBs> selectByExampleWithBLOBs(ProjectPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    List<ProjectPO> selectByExampleWithRowbounds(ProjectPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    List<ProjectPO> selectByExample(ProjectPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProjectPOWithBLOBs record, @Param("example") ProjectPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ProjectPOWithBLOBs record, @Param("example") ProjectPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProjectPO record, @Param("example") ProjectPOExample example);
}