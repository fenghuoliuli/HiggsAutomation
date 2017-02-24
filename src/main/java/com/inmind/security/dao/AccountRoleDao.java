package com.inmind.security.dao;

import com.inmind.mybatis.entity.AccountRolePO;
import com.inmind.mybatis.mapper.AccountRolePOMapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by zhao on 2017/2/24.
 */
public interface AccountRoleDao extends AccountRolePOMapper{
  AccountRolePO selectByAccountId(@Param("accountId") Long accountId);
}
