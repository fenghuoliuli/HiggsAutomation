package com.inmind.mybatis.mapper;

import com.inmind.mybatis.entity.EventTriggerPO;
import com.inmind.mybatis.entity.EventTriggerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.RowBounds;

public interface EventTriggerPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    long countByExample(EventTriggerPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    int deleteByExample(EventTriggerPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    @Insert({
        "insert into event_trigger (processor, task_id, ",
        "trigger_value, trigger_type, ",
        "created_at, updated_at, ",
        "event_json)",
        "values (#{processor,jdbcType=VARCHAR}, #{taskId,jdbcType=INTEGER}, ",
        "#{triggerValue,jdbcType=VARCHAR}, #{triggerType,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{eventJson,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(EventTriggerPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    int insertSelective(EventTriggerPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    List<EventTriggerPO> selectByExampleWithBLOBsWithRowbounds(EventTriggerPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    List<EventTriggerPO> selectByExampleWithBLOBs(EventTriggerPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    List<EventTriggerPO> selectByExampleWithRowbounds(EventTriggerPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    List<EventTriggerPO> selectByExample(EventTriggerPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EventTriggerPO record, @Param("example") EventTriggerPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EventTriggerPO record, @Param("example") EventTriggerPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_trigger
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EventTriggerPO record, @Param("example") EventTriggerPOExample example);
}