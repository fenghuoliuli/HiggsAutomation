package com.inmind.restful.testcases;

import org.testng.annotations.Test;

import com.inmind.general.APITest;
import com.inmind.http.APIRequest;
import com.inmind.http.APIResponse;
import com.inmind.utils.DBCtrl;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Task {
	private static Logger LOGGER = LogManager.getLogger(Question.class);
	ArrayList<String> cookies= new ArrayList<String>();
	DBCtrl dbCtrl = new DBCtrl();
	private Connection conn;
  @Test (groups="Positive")
  public void Get_Task_GetOne() {
	  LOGGER.info("*****************Test case: Get Task GetOne Started*****************");
	  try {
		 
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/task/getOne").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).param("id", "1").
		    invoke();
			response.assertBodyContains("200");
		
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Get Question Task GetOne Ended*****************");
	}
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
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
  public void setup() {
	  LOGGER.info("*****************Test suit: Task*****************");


		try {
			String uri = APITest.getValue("baseuri");
			String path = APITest.getValue("login.path");
			//String payload = String.format(APITest.loadFile("jsonfile.json"), "62ab92bab49692ea813c99b3d2b4ebbdb3aa99ffede992762b5edc612f162814", "f57405304f15cba90c214252f85b925407704d3bb67b598bb49ada0460161b63");		
			APIResponse response=APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=koth&password=1")
		    .invoke();
			response.assertStatus(200);
			final Map<String,NewCookie> cookie=response.getcookie();
		    for (String name : cookie.keySet()) {
		        Cookie cookievalue = cookie.get(name);
		        System.out.println("Cookie: " + name + "=" + cookievalue.getValue());
		        cookies.add(name + "=" + cookievalue.getValue());
		    }
			conn=dbCtrl.set_connection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

  @AfterSuite
  public void teardown() {
	  dbCtrl.Close_DB_Connection(conn);
  }

}
