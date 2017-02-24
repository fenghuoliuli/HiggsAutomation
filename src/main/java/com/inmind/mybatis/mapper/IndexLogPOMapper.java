package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.IndexLogPO;
import com.inmind.mybatis.entity.IndexLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IndexLogPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    long countByExample(IndexLogPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    int deleteByExample(IndexLogPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    @Insert({
        "insert into index_log (reindex_at)",
        "values (#{reindexAt,jdbcType=TIMESTAMP})"
    })
    int insert(IndexLogPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    int insertSelective(IndexLogPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    List<IndexLogPO> selectByExampleWithRowbounds(IndexLogPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    List<IndexLogPO> selectByExample(IndexLogPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IndexLogPO record, @Param("example") IndexLogPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IndexLogPO record, @Param("example") IndexLogPOExample example);
}