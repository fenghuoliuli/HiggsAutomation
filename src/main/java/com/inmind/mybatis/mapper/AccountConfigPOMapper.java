package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.AccountConfigPO;
import com.inmind.mybatis.entity.AccountConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface AccountConfigPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    long countByExample(AccountConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    int deleteByExample(AccountConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    @Insert({
        "insert into account_config (company_id, account_id, ",
        "kkey, created_by, ",
        "updated_by, created_at, ",
        "updated_at, value)",
        "values (#{companyId,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{kkey,jdbcType=VARCHAR}, #{createdBy,jdbcType=BIGINT}, ",
        "#{updatedBy,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{value,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(AccountConfigPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    int insertSelective(AccountConfigPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    List<AccountConfigPO> selectByExampleWithBLOBsWithRowbounds(AccountConfigPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    List<AccountConfigPO> selectByExampleWithBLOBs(AccountConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    List<AccountConfigPO> selectByExampleWithRowbounds(AccountConfigPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    List<AccountConfigPO> selectByExample(AccountConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AccountConfigPO record, @Param("example") AccountConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") AccountConfigPO record, @Param("example") AccountConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AccountConfigPO record, @Param("example") AccountConfigPOExample example);
}