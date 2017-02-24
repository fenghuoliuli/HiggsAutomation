package com.inmind.People.service.iml;

import com.inmind.People.domain.DResume;
import com.inmind.utils.CommonUtil;

/**
 * Created by zhao on 2017/2/24.
 */
public class PostResumeResponseAnalysis {
  public void PostResumeResponse(DResume resume1,DResume resume2){
    CommonUtil commonUtil = new CommonUtil();
    commonUtil.AssertEqualsCustomize(resume1,resume2);
  }
}
