package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.TagPO;
import com.inmind.mybatis.entity.TagPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface TagPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    long countByExample(TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    int deleteByExample(TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    @Insert({
        "insert into tag (target_type, target_id, ",
        "property, dict_type, ",
        "dict_code, is_generated, ",
        "deleted, created_by, ",
        "updated_by, created_at, ",
        "updated_at)",
        "values (#{targetType,jdbcType=INTEGER}, #{targetId,jdbcType=BIGINT}, ",
        "#{property,jdbcType=VARCHAR}, #{dictType,jdbcType=VARCHAR}, ",
        "#{dictCode,jdbcType=INTEGER}, #{isGenerated,jdbcType=INTEGER}, ",
        "#{deleted,jdbcType=INTEGER}, #{createdBy,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TagPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    int insertSelective(TagPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    List<TagPO> selectByExampleWithRowbounds(TagPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    List<TagPO> selectByExample(TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TagPO record, @Param("example") TagPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TagPO record, @Param("example") TagPOExample example);
}