package com.inmind.common.mapper;

import com.inmind.common.Pagination;
import com.inmind.common.bean.ContactRecordRef;
import com.inmind.common.bean.ContactRecordResp;
import com.inmind.common.bean.ListContactRecord;
import com.inmind.mybatis.mapper.ContactPOMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public interface ContactRecordMapper extends ContactPOMapper {
  /**List<ContactRecordRef> getContactRecordRef(
      @Param("params") ListContactRecord listContactRecord,
      @Param("pagination") Pagination<ContactRecordResp> pagination);

  Integer countContactRecordRef(@Param("params") ListContactRecord listContactRecord);
      */
}
