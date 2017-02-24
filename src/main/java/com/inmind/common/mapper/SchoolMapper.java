package com.inmind.common.mapper;

import com.inmind.common.domain.DSchool;
import com.inmind.mybatis.mapper.SchoolPOMapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface SchoolMapper extends SchoolPOMapper{

  /**
   * 根据关键字进行模糊查询.
   *
   * @param text the text
   * @return list
   */
  @Results( {
      @Result(property = "createdAt", column = "created_at"),
      @Result(property = "updatedAt", column = "updated_at")})
  @Select(" select id, code, name, aliases, grade, created_at, updated_at "
      + " from school "
      + " where name like CONCAT('%','${text}','%' ) "
      + " OR "
      + " aliases like CONCAT('%','${text}','%' )")
  List<DSchool> fuzzyByName(@Param("text") String text);
}
