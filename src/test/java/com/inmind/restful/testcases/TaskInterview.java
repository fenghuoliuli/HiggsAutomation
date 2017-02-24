package com.inmind.restful.testcases;

import org.testng.annotations.Test;

import com.inmind.general.APITest;
import com.inmind.http.APIRequest;
import com.inmind.http.APIResponse;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;


import javax.ws.rs.core.MediaType;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TaskInterview {
	protected static final Logger LOGGER = LoggerFactory.getLogger(TaskInterview.class);
  @Test(groups = { "post" })
  public void TaskInteviewPost() throws JSONException {
	  LOGGER.info("[** Case Start **]:post a task inteview");
	try {
			String uri = APITest.getValue("baseuri");
		String path = APITest.getValue("login.path");
		String payload = String.format(APITest.loadFile("jsonfile2.json"));		
		APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body(payload)
	    .invoke().assertStatus(200).assertBodyContains("200");
		
		APIResponse response=APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body(payload)
			    .invoke();
		String in=response.getBody(); 
		JSONObject obj;
	
			obj = new JSONObject(in);
			int taskid = obj.getInt("id");
			LOGGER.info("Get the task id:"+taskid);
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
	            LOGGER.info("[** Case Start **]:firstLoginAndChangePassword");
	            System.out.println("********************************************************");
	            System.out.println("");
		}

		
  }
 
  @Test(dependsOnGroups = { "post" })
		  public void name() {
			
		}
  
  @BeforeMethod
  /*
   * Set the connection
   */
  public void login() {
		String uri = APITest.getValue("baseuri");
		String path = APITest.getValue("login.path");
		//String payload = String.format(APITest.loadFile("jsonfile2.json"), "62ab92bab49692ea813c99b3d2b4ebbdb3aa99ffede992762b5edc612f162814", "f57405304f15cba90c214252f85b925407704d3bb67b598bb49ada0460161b63");		
		APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=koth&password=1")
	    .invoke().assertStatus(200).assertBodyContains("200");
  }

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
  }

  @AfterSuite
  public void afterSuite() {
  }

}
