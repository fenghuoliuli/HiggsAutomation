package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.AttachmentRefPO;
import com.inmind.mybatis.entity.AttachmentRefPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface AttachmentRefPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    long countByExample(AttachmentRefPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    int deleteByExample(AttachmentRefPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    @Insert({
        "insert into attachment_ref (company_id, target_type, ",
        "target_id, attachment_id, ",
        "created_by, updated_by, ",
        "created_at, updated_at)",
        "values (#{companyId,jdbcType=BIGINT}, #{targetType,jdbcType=INTEGER}, ",
        "#{targetId,jdbcType=BIGINT}, #{attachmentId,jdbcType=BIGINT}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(AttachmentRefPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    int insertSelective(AttachmentRefPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    List<AttachmentRefPO> selectByExampleWithRowbounds(AttachmentRefPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    List<AttachmentRefPO> selectByExample(AttachmentRefPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AttachmentRefPO record, @Param("example") AttachmentRefPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment_ref
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AttachmentRefPO record, @Param("example") AttachmentRefPOExample example);
}