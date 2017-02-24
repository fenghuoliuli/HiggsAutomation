package com.inmind.common.mapper;

import com.inmind.mybatis.mapper.OperationLogPOMapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface OperationLogMapper extends OperationLogPOMapper {
  @Select("select id from ${sql}")
  List<Long> getIdByNativeSql(@Param("sql") String sql);
}
