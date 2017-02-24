package com.inmind.organization.mapper;

import com.inmind.mybatis.entity.OrgDeptPO;
import com.inmind.mybatis.mapper.OrgDeptPOMapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface OrgDeptMapper extends OrgDeptPOMapper {
  @Select( {
      "<script>",
      "select",
      "id, org_id, name, tel_no, created_by, updated_by, created_at, updated_at",
      "FROM org_dept ",
      "where org_id = #{orgId,jdbcType=INTEGER}",
      "<if test=\"text != null\">",
      "  and LOWER(name) like LOWER(concat('%',#{text, jdbcType=VARCHAR},'%'))",
      "</if>",
      "</script>"
  })
  @ResultMap( {"com.inmind.automind.datalayer.mapper.OrgDeptPOMapper.BaseResultMap"})
  List<OrgDeptPO> fuzzySearchByName(@Param("orgId") Long orgId, @Param("text") String text);
}
