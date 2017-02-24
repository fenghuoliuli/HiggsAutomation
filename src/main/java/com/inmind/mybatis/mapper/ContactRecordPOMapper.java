package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.ContactRecordPO;
import com.inmind.mybatis.entity.ContactRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface ContactRecordPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    long countByExample(ContactRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    int deleteByExample(ContactRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    @Insert({
        "insert into contact_record (company_id, ref_id, ",
        "ref_type, org_id, people_id, ",
        "resume_id, contact_id, ",
        "project_id, account_id, ",
        "org_dev_id, project_stage_id, ",
        "project_stage_code, org_dev_stage_id, ",
        "contact_type, type, ",
        "call_duration, created_by, ",
        "updated_by, created_at, ",
        "updated_at)",
        "values (#{companyId,jdbcType=BIGINT}, #{refId,jdbcType=BIGINT}, ",
        "#{refType,jdbcType=INTEGER}, #{orgId,jdbcType=BIGINT}, #{peopleId,jdbcType=BIGINT}, ",
        "#{resumeId,jdbcType=BIGINT}, #{contactId,jdbcType=BIGINT}, ",
        "#{projectId,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{orgDevId,jdbcType=BIGINT}, #{projectStageId,jdbcType=BIGINT}, ",
        "#{projectStageCode,jdbcType=VARCHAR}, #{orgDevStageId,jdbcType=BIGINT}, ",
        "#{contactType,jdbcType=INTEGER}, #{type,jdbcType=VARCHAR}, ",
        "#{callDuration,jdbcType=INTEGER}, #{createdBy,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ContactRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    int insertSelective(ContactRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    List<ContactRecordPO> selectByExampleWithRowbounds(ContactRecordPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    List<ContactRecordPO> selectByExample(ContactRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ContactRecordPO record, @Param("example") ContactRecordPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ContactRecordPO record, @Param("example") ContactRecordPOExample example);
}