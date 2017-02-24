package com.inmind.security.dao;


import com.inmind.mybatis.entity.AccountPO;
import com.inmind.mybatis.mapper.AccountPOMapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by zhao on 2017/2/24.
 */
public interface AccountDao extends AccountPOMapper{
  AccountPO selectAccountById(@Param("accountId") Long accountId);
}
