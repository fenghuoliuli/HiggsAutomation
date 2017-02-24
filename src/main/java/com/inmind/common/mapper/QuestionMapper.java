package com.inmind.common.mapper;

import com.inmind.mybatis.entity.QuestionPO;
import com.inmind.mybatis.mapper.QuestionPOMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface QuestionMapper extends QuestionPOMapper {
  List<QuestionPO> getQuestionByGroupCode(@Param("groupCode") String groupCode);
}
