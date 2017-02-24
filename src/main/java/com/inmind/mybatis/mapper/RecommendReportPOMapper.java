package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.RecommendReportPO;
import com.inmind.mybatis.entity.RecommendReportPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface RecommendReportPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    long countByExample(RecommendReportPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    int deleteByExample(RecommendReportPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    @Insert({
        "insert into recommend_report (company_id, resume_id, ",
        "project_id, attachment_id, ",
        "md5sum, created_by, ",
        "updated_by, created_at, ",
        "updated_at)",
        "values (#{companyId,jdbcType=BIGINT}, #{resumeId,jdbcType=BIGINT}, ",
        "#{projectId,jdbcType=BIGINT}, #{attachmentId,jdbcType=BIGINT}, ",
        "#{md5sum,jdbcType=VARCHAR}, #{createdBy,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(RecommendReportPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    int insertSelective(RecommendReportPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    List<RecommendReportPO> selectByExampleWithRowbounds(RecommendReportPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    List<RecommendReportPO> selectByExample(RecommendReportPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RecommendReportPO record, @Param("example") RecommendReportPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend_report
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RecommendReportPO record, @Param("example") RecommendReportPOExample example);
}