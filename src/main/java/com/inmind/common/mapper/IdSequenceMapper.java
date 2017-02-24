package com.inmind.common.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by zhao on 2017/2/23.
 */
public interface IdSequenceMapper {
  @Select("select value from id_sequence limit 1")
  Long getValue();

  @Update("update id_sequence set value=value+1")
  int updateNext();
}
