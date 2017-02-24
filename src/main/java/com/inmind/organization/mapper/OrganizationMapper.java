package com.inmind.organization.mapper;

import com.inmind.mybatis.entity.OrganizationPO;
import com.inmind.mybatis.mapper.OrganizationPOMapper;
import com.inmind.organization.domain.DOrganization;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface OrganizationMapper extends OrganizationPOMapper {

  @Select("select * from person order by name asc")
  @SuppressWarnings("rawtypes")
  List getAll();

  @Insert("insert into person(name, sex, age, comment) values(#{name}, #{sex}, #{age}, #{comment})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  int append(final DOrganization person);

  @Update("update person set name=#{name}, sex=#{sex}, age=#{age}, comment=#{comment} where " +
      "id=#{id}")
  int update(final DOrganization person);

  @Delete("delete from person where id=#{id}")
  int remove(@Param("id") final int id);

  @Select("select * from organization where id=#{id}")
  @ResultMap("com.inmind.automind.datalayer.mapper.OrganizationPOMapper.BaseResultMap")
  OrganizationPO getById1(int id);

  @Select( {"<script>",
      "select id, name ",
      "FROM organization ",
      "WHERE name IN",
      "<foreach item='item' index='index' collection='orgNames'",
      "open='(' separator=',' close=')'>",
      "#{item}",
      "</foreach>",
      "</script>"})
  @ResultMap("com.inmind.automind.datalayer.mapper.OrganizationPOMapper.BaseResultMap")
  List<OrganizationPO> getExistOrgNames(@Param("orgNames") List<String> orgNames);
}
