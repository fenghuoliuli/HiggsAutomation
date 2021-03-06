package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.OrgDeptPO;
import com.inmind.mybatis.entity.OrgDeptPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface OrgDeptPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    long countByExample(OrgDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    int deleteByExample(OrgDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    @Insert({
        "insert into org_dept (org_id, name, ",
        "tel_no, created_by, ",
        "updated_by, created_at, ",
        "updated_at)",
        "values (#{orgId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{telNo,jdbcType=VARCHAR}, #{createdBy,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OrgDeptPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    int insertSelective(OrgDeptPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    List<OrgDeptPO> selectByExampleWithRowbounds(OrgDeptPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    List<OrgDeptPO> selectByExample(OrgDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrgDeptPO record, @Param("example") OrgDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_dept
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrgDeptPO record, @Param("example") OrgDeptPOExample example);
}