package com.inmind.Resume.analysis;

import com.inmind.People.dao.JsonBean.ResumeBasicBean;
import com.inmind.People.dao.JsonBean.ResumeEducationBean;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.JsonMappingException;

import java.io.IOException;
import java.io.StringWriter;


/**
 * Created by zhao on 2017/2/22.
 */
public class ResumePayload {
  public static void main(String[] args){
    ResumeBasicBean resumeBasicBean = new ResumeBasicBean();
    ResumeEducationBean resumeEducationBean = new ResumeEducationBean();
    resumeEducationBean.setDegree(2);
    resumeEducationBean.setEndedAt("2014-03-01T08:00:00+08:00");
    resumeEducationBean.setResumeId(10001329);
    resumeEducationBean.setEndedAt("2014-03-01T08:00:00+08:00");
    resumeEducationBean.setOnEdu(0);
    resumeEducationBean.setSchoolType(1);
    ResumeEducationBean.School school=new ResumeEducationBean.School();
    school.setCode(312000300);
    school.setName("上海交通大学");
    resumeEducationBean.setSchool(school);
    try {
      System.out.println("json1:::" + bean2Json(resumeEducationBean));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static String bean2Json(Object obj) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    StringWriter sw = new StringWriter();
    JsonGenerator gen = new JsonFactory().createJsonGenerator(sw);
    mapper.writeValue(gen, obj);
    gen.close();
    return sw.toString();
  }

  public static <T> T json2Bean(String jsonStr, Class<T> objClass)
      throws JsonParseException, JsonMappingException, IOException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readValue(jsonStr, objClass);
  }

}
