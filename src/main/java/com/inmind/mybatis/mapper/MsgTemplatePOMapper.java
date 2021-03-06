package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.MsgTemplatePO;
import com.inmind.mybatis.entity.MsgTemplatePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface MsgTemplatePOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    long countByExample(MsgTemplatePOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    int deleteByExample(MsgTemplatePOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    @Insert({
        "insert into msg_template (name, title, ",
        "type, owner_type, ",
        "created_by, is_delete, ",
        "created_at, updated_at, ",
        "body)",
        "values (#{name,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{ownerType,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=BIGINT}, #{isDelete,jdbcType=INTEGER}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{body,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(MsgTemplatePO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    int insertSelective(MsgTemplatePO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    List<MsgTemplatePO> selectByExampleWithBLOBsWithRowbounds(MsgTemplatePOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    List<MsgTemplatePO> selectByExampleWithBLOBs(MsgTemplatePOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    List<MsgTemplatePO> selectByExampleWithRowbounds(MsgTemplatePOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    List<MsgTemplatePO> selectByExample(MsgTemplatePOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MsgTemplatePO record, @Param("example") MsgTemplatePOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") MsgTemplatePO record, @Param("example") MsgTemplatePOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_template
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MsgTemplatePO record, @Param("example") MsgTemplatePOExample example);
}