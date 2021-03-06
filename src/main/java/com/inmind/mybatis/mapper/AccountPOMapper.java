package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.AccountPO;
import com.inmind.mybatis.entity.AccountPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface AccountPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    long countByExample(AccountPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    int deleteByExample(AccountPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    @Insert({
        "insert into account (username, password, ",
        "chinese_name, english_name, ",
        "nickname, email, ",
        "mobile, company_id, ",
        "team_id, gender, working_phone, ",
        "working_email, working_years, ",
        "hired_at, is_freeze, ",
        "password_reset, reset_password_at, ",
        "status, latest_login_at, ",
        "latest_login_ip, login_fail_times, ",
        "avaya_seat_no, avaya_seat_group, ",
        "avaya_ext, avaya_pwd, ",
        "created_by, updated_by, ",
        "created_at, updated_at, ",
        "industry_codes, function_codes, ",
        "location_ids)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{chineseName,jdbcType=VARCHAR}, #{englishName,jdbcType=VARCHAR}, ",
        "#{nickname,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{companyId,jdbcType=BIGINT}, ",
        "#{teamId,jdbcType=BIGINT}, #{gender,jdbcType=INTEGER}, #{workingPhone,jdbcType=VARCHAR}, ",
        "#{workingEmail,jdbcType=VARCHAR}, #{workingYears,jdbcType=INTEGER}, ",
        "#{hiredAt,jdbcType=TIMESTAMP}, #{isFreeze,jdbcType=INTEGER}, ",
        "#{passwordReset,jdbcType=INTEGER}, #{resetPasswordAt,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{latestLoginAt,jdbcType=TIMESTAMP}, ",
        "#{latestLoginIp,jdbcType=VARCHAR}, #{loginFailTimes,jdbcType=INTEGER}, ",
        "#{avayaSeatNo,jdbcType=VARCHAR}, #{avayaSeatGroup,jdbcType=VARCHAR}, ",
        "#{avayaExt,jdbcType=VARCHAR}, #{avayaPwd,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{industryCodes,jdbcType=VARCHAR}, #{functionCodes,jdbcType=VARCHAR}, ",
        "#{locationIds,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(AccountPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    int insertSelective(AccountPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    List<AccountPO> selectByExampleWithRowbounds(AccountPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    List<AccountPO> selectByExample(AccountPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AccountPO record, @Param("example") AccountPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AccountPO record, @Param("example") AccountPOExample example);
}