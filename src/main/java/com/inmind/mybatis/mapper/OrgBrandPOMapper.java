package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.OrgBrandPO;
import com.inmind.mybatis.entity.OrgBrandPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface OrgBrandPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    long countByExample(OrgBrandPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    int deleteByExample(OrgBrandPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    @Insert({
        "insert into org_brand (org_id, type, ",
        "img_url, trademark, ",
        "title, site_url, ",
        "created_by, updated_by, ",
        "created_at, updated_at, ",
        "description)",
        "values (#{orgId,jdbcType=BIGINT}, #{type,jdbcType=INTEGER}, ",
        "#{imgUrl,jdbcType=VARCHAR}, #{trademark,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{siteUrl,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{description,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OrgBrandPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    int insertSelective(OrgBrandPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    List<OrgBrandPO> selectByExampleWithBLOBsWithRowbounds(OrgBrandPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    List<OrgBrandPO> selectByExampleWithBLOBs(OrgBrandPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    List<OrgBrandPO> selectByExampleWithRowbounds(OrgBrandPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    List<OrgBrandPO> selectByExample(OrgBrandPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrgBrandPO record, @Param("example") OrgBrandPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") OrgBrandPO record, @Param("example") OrgBrandPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrgBrandPO record, @Param("example") OrgBrandPOExample example);
}