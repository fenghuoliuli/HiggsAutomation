package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.OrgShareholderPO;
import com.inmind.mybatis.entity.OrgShareholderPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface OrgShareholderPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    long countByExample(OrgShareholderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    int deleteByExample(OrgShareholderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    @Insert({
        "insert into org_shareholder (org_id, holder_id, ",
        "hold_rate, invest_amount, ",
        "created_by, updated_by, ",
        "created_at, updated_at, ",
        "invest_detail)",
        "values (#{orgId,jdbcType=BIGINT}, #{holderId,jdbcType=BIGINT}, ",
        "#{holdRate,jdbcType=DECIMAL}, #{investAmount,jdbcType=DECIMAL}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{investDetail,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OrgShareholderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    int insertSelective(OrgShareholderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    List<OrgShareholderPO> selectByExampleWithBLOBsWithRowbounds(OrgShareholderPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    List<OrgShareholderPO> selectByExampleWithBLOBs(OrgShareholderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    List<OrgShareholderPO> selectByExampleWithRowbounds(OrgShareholderPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    List<OrgShareholderPO> selectByExample(OrgShareholderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrgShareholderPO record, @Param("example") OrgShareholderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") OrgShareholderPO record, @Param("example") OrgShareholderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_shareholder
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrgShareholderPO record, @Param("example") OrgShareholderPOExample example);
}