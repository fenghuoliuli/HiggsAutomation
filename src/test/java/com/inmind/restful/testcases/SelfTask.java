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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SelfTask {
	private static Logger LOGGER = LogManager.getLogger(SelfTask.class);
  @Test(dataProvider = "dp")
  public void Post_Self_Task(Integer n, String s) {

		String uri = APITest.getValue("baseuri");
		String path = APITest.getValue("post.token");
		String payload = String.format(APITest.loadFile("SelfTask.json"));
		APIResponse response=APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body(payload)
			    .invoke();
		response.assertStatus(200);
		String in=response.getBody(); 
		JSONObject obj;	
		try {
			obj = new JSONObject(in);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
  @BeforeMethod
  public void beforeMethod() {
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
	  /*
	   * Set the connection
	   */
			String uri = APITest.getValue("baseuri");
			String path = APITest.getValue("login.path");
			String payload = String.format(APITest.loadFile("jsonfile.json"));
			APIResponse response=APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=koth&password=1")
				    .invoke();
			String in=response.getBody(); 
			JSONObject obj;
		
  }

  @AfterSuite
  public void afterSuite() {
  }

}
