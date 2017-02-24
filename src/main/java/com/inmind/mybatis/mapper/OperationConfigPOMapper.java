package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.OperationConfigPO;
import com.inmind.mybatis.entity.OperationConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface OperationConfigPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    long countByExample(OperationConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    int deleteByExample(OperationConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    @Insert({
        "insert into operation_config (table_name, busi_name, ",
        "created_by, updated_by, ",
        "created_at, updated_at)",
        "values (#{tableName,jdbcType=VARCHAR}, #{busiName,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=BIGINT}, #{updatedBy,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OperationConfigPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    int insertSelective(OperationConfigPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    List<OperationConfigPO> selectByExampleWithRowbounds(OperationConfigPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    List<OperationConfigPO> selectByExample(OperationConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OperationConfigPO record, @Param("example") OperationConfigPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OperationConfigPO record, @Param("example") OperationConfigPOExample example);
}