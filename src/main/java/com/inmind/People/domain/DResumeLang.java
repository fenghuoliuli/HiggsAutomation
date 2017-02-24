package com.inmind.People.domain;

import com.inmind.common.domain.DDict;
import com.inmind.mybatis.entity.ResumeLangPO;

/**
 * Created by zhao on 2017/2/23.
 */
public class DResumeLang extends ResumeLangPO{
  private DDict lang;

  public DDict getLang() {
    return lang;
  }

  public void setLang(DDict lang) {
    this.lang = lang;
  }
}
