package com.inmind.organization.mapper;

import com.inmind.mybatis.entity.ExternalJobPO;
import com.inmind.mybatis.mapper.ExternalJobPOMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface ExternalJobMapper extends ExternalJobPOMapper{
  /**long count(@Param("param") ExternalJobFilterParam param);

  List<ExternalJobPO> pagedQuery(@Param("param") ExternalJobFilterParam param,
                                 @Param("offset") Integer offset,
                                 @Param("limit") Integer limit);
                                 */
}
