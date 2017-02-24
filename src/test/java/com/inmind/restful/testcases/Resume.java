package com.inmind.restful.testcases;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientResponse;
import org.testng.annotations.Test;

import com.inmind.People.dao.JsonBean.ResumeEducationBean;
import com.inmind.People.domain.DResume;
import com.inmind.http.APIRequest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import com.inmind.general.APITest;

import com.inmind.http.APIResponse;
import com.inmind.mybatis.entity.ResumePO;
import com.inmind.utils.JsonUtil;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

public class Resume {
	private static Logger LOGGER = LogManager.getLogger(Resume.class.getName());
  ArrayList<String> cookies= new ArrayList<String>();

  @Test
  public void AddCandidate()
  {
    ResumePO resumePO = new ResumePO();
    Date date = new Date();
    DateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String time = format.format(date);
    resumePO.setChineseName("测试"+time);
    resumePO.setEnglishName("ceshi");
    resumePO.setMobile("19819819809");
    LOGGER.info("*****************Test case: Post Organization Brands Started*****************");
    String uri = APITest.getValue("baseuri");
    String cookievalue= cookies.get(0);

    //String payload= String.format(APITest.loadFile("Post_Org_Brands.json"));
    String payload= String.format(APITest.loadFile("PostResume.json"));
    APIResponse postresponse=APIRequest.POST(uri).path("/resumes").header("cookie",cookievalue).type(MediaType
        .APPLICATION_JSON_TYPE).body(payload).invoke();
    postresponse.assertBodyContains("200");

  }

  @Test
  public void EditCandidateBsic(){
    String uri = APITest.getValue("baseuri");
    String cookievalue= cookies.get(0);

    //String payload= String.format(APITest.loadFile("Post_Org_Brands.json"));
    String payload= "addressDetail\n"
        + ":\n"
        + "\"上海徐汇区某某路125号\"\n"
        + "birthday\n"
        + ":\n"
        + "\"1990-02-22T00:00:00+08:00\"\n"
        + "introduce\n"
        + ":\n"
        + "\"个人描述\"\n"
        + "nativeLocationId\n"
        + ":\n"
        + "310104\n"
        + "otherEmail\n"
        + ":\n"
        + "\"ll@llll.com\"\n"
        + "otherTel\n"
        + ":\n"
        + "\"111111111\"\n"
        + "privateEmail\n"
        + ":\n"
        + "\"lll@ll.com\"\n"
        + "registerLocationId\n"
        + ":\n"
        + "310104\n"
        + "resumeId\n"
        + ":\n"
        + "10000077\n"
        + "startedWorkAt\n"
        + ":\n"
        + "\"2010-02-01T08:00:00+08:00\"\n"
        + "techCapacity\n"
        + ":\n"
        + "\"个人描述\"\n"
        + "workEmail\n"
        + ":\n"
        + "\"ll@ll.com\"";
    APIResponse postresponse=APIRequest.POST(uri).path("/resumes/basic").header("cookie",cookievalue).type(MediaType
        .APPLICATION_JSON_TYPE).body(payload).invoke();
    postresponse.assertBodyContains("200");

  }

  @Test
  public void EditCandidateSalaryandWelfares(){
    String uri = APITest.getValue("baseuri");
    String cookievalue= cookies.get(0);
    String payload=String.format(APITest.loadFile("PostResumeSalary.json"));
    APIResponse postresponse=APIRequest.POST(uri).path("/resumes/basic").header("cookie",cookievalue).type(MediaType
        .APPLICATION_JSON_TYPE).body(payload).invoke();
    postresponse.assertBodyContains("200");
    DResume resumeResponse= JsonUtil.fromJson(postresponse.toString(),DResume.class);
  }

  @Test
  public void EditCandidateEducation(){
    String uri = APITest.getValue("baseuri");
    String cookievalue= cookies.get(0);
    ResumeEducationBean resumeEducationBean= new ResumeEducationBean();
    resumeEducationBean.setResumeId(20290005);
    resumeEducationBean.setDegree(2);
    resumeEducationBean.setEndedAt("2010-02-01T08:00:00+08:00");
    resumeEducationBean.setStartedAt("2016-02-01T08:00:00+08:00");
    ResumeEducationBean.School school= new ResumeEducationBean.School();
    school.setCode(312000300);
    school.setName("上海交通大学");
    resumeEducationBean.setSchool(school);
    ResumeEducationBean.MajorDict majorDict = new ResumeEducationBean.MajorDict();
    majorDict.setCode(31544);
    majorDict.setName("电子科学与技术");
    majorDict.setType("USER_SCHOOL_MAJOR");
    //String payload=String.format(APITest.loadFile("PostResumeExpect.json"));
    String payload = JsonUtil.toJson(resumeEducationBean).toString();
    System.out.println(payload);
    APIResponse postresponse=APIRequest.POST(uri).path("/resumes/resumeEducations").header("cookie",cookievalue).type(MediaType
        .APPLICATION_JSON_TYPE).body(payload).invoke();
    postresponse.assertBodyContains("200");
  }
    @Test
    public void EditCandidateProjectExperience(){
      String uri = APITest.getValue("baseuri");
      String cookievalue= cookies.get(0);
      String payload=String.format(APITest.loadFile("PostResumeProject.json"));
      APIResponse postresponse=APIRequest.POST(uri).path("/resumes/basic").header("cookie",cookievalue).type(MediaType
          .APPLICATION_JSON_TYPE).body(payload).invoke();
      postresponse.assertBodyContains("200");
    }

  @BeforeMethod
  /*
   * Set the connection
   */


  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
    LOGGER.info("*****************Test suit: Resume*****************");
    String uri = APITest.getValue("baseuri");
    String path = APITest.getValue("login.path");
    //String payload = String.format(APITest.loadFile("jsonfile.json"), "62ab92bab49692ea813c99b3d2b4ebbdb3aa99ffede992762b5edc612f162814", "f57405304f15cba90c214252f85b925407704d3bb67b598bb49ada0460161b63");
    APIResponse response=APIRequest.POST("http://am2-test.imd.com/api/xauth").type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=pp&password=123456").invoke();

    final Map<String,NewCookie> cookie=response.getcookie();
    for (String name : cookie.keySet()) {
      Cookie cookievalue = cookie.get(name);
      System.out.println("Cookie: " + name + "=" + cookievalue.getValue());
      cookies.add(name + "=" + cookievalue.getValue());
    }
    //response.assertBodyContains("200");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
