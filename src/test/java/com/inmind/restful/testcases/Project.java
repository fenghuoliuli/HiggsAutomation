package com.inmind.restful.testcases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.inmind.general.APITest;
import com.inmind.http.APIRequest;
import com.inmind.http.APIResponse;
import com.inmind.utils.DBCtrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 

public class Project {
	private static final Logger LOGGER = LogManager.getLogger(Question.class);
	static ArrayList<String> cookies= new ArrayList<String>();
	DBCtrl dbCtrl = new DBCtrl();
	private Connection conn;
    private static  String cookievalue;
	private static final  String uri = APITest.getValue("baseuri");
	
  
	@Test(groups="Postive")
	public void GetProject(){		  
		  try {
				LOGGER.info("*****************Test case: Get Project Started*****************");
				LOGGER.info("*****************************************************************");
				  ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM project WHERE title=\"Zhao API testing\"");
				  while (resultSet.next()) {
					  int id=resultSet.getInt(1);
					  String sqlstatement="DELETE FROM  project WHERE id="+id;
					  LOGGER.info("Deleting exsiting Zhao API Testing record in the DB");
					  dbCtrl.executeSql(conn,sqlstatement);

			  }
			LOGGER.info("Insert the Zhao API Testing record to the DB");  
			  String sqlstatement="INSERT INTO project (id, `type`, task_mode, status, grade, title, org_id, address_id, fee_mode, fee_scale, headcount, forecast_turnover, salary_detail, salary_lower, salary_upper, signed_contract_at, warranty_period, expected_start_at, expected_start_days, probation_days, payback_days, pause_at, started_at, ended_at, job_duty, job_requirement, job_analysis_id, work_years_lower, work_years_upper, age_lower, age_upper, gender_code, bd_id, leader_id, created_by, sorted_by, created_at, updated_at) VALUES(4, 0, 0, '', '', 'Zhao API testing ', 1, 0, '', 0, 0, 0, '', 0, 0, '2016-11-14 00:00:00', 1, '2016-11-15 00:00:00', 0, 0, 0, '2017-11-11 00:00:00', '2016-11-11 00:00:00', '2017-11-11 00:00:00', '', '', 0, 0, 0, 0, 0, '', 0, 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
			  LOGGER.info("Executing the sql statement:"+sqlstatement);
			  dbCtrl.executeSql(conn,sqlstatement);
			  ResultSet result=dbCtrl.query(conn,"SELECT * FROM project WHERE title=\"\";");
			  if (result.getRow()>=1)
			  {
				  LOGGER.info("Insert record success");
			  }
			  ResultSet resultSetNew=dbCtrl.query(conn, "SELECT id FROM project WHERE title=\"Zhao API testing\"");
			  int id2=0;
			  while (resultSetNew.next()) {
				  id2=resultSetNew.getInt(1);
			  }

			  LOGGER.info("Sending Get request");
			  APIResponse response=APIRequest.GET(uri).path("/project/"+id2).header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
				response.assertBodyContains("204");
				response.assertBodyContains("Zhao API testing");
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}finally {
			LOGGER.info("*****************Test case: Get Project Ended*****************");
			LOGGER.info("*****************************************************************");
		}
  }
	
	@Test (groups="Nagtive")
	public void GetProjectwithBadId(){
		LOGGER.info("*****************Test case: Get Project  with Bad Id Started*****************");
		LOGGER.info("*****************************************************************************");
		  try {				  			
			  LOGGER.info("Sending Get request");
			  String idtest= "test";
				APIResponse response=APIRequest.GET(uri).path("/project/"+idtest).header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
				response.assertBodyContains("404");
			
		}
		  finally {
				LOGGER.info("*****************Test case: Get Project  with Bad Id Ended*****************");
				LOGGER.info("*****************************************************************************");
		}
}	
	
	@Test
	public void GetProjectwithWrongId(){
		LOGGER.info("*****************Test case: Get Project  with Wrong Id Started*****************");
		LOGGER.info("*****************************************************************************");
		  try {				  			
			  LOGGER.info("Sending Get request");
				APIResponse response=APIRequest.GET(uri).path("/project/-1").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
				response.assertBodyContains("500");
				response.assertBody("项目下不存在该-1记录");
			
		}
		  finally {
				LOGGER.info("*****************Test case: Get Project  with Wrong Id Ended*****************");
				LOGGER.info("*****************************************************************************");
		}
	}
	
	@Test (groups="Nagtive")
	public void Get_Project_with_Bad_Cookie(){
		LOGGER.info("*****************Test case: Get Project  with Wrong Id Started*****************");
		LOGGER.info("*****************************************************************************");
		  try {
			  LOGGER.info("Sending Get request");
				APIResponse response=APIRequest.GET(uri).path("/project/1").type(MediaType.APPLICATION_JSON_TYPE).param("cookie",cookievalue+1).invoke();
				response.assertBodyContains("403");
		}
		  finally {
				LOGGER.info("*****************Test case: Get Project  with Wrong Id Ended*****************");
				LOGGER.info("*****************************************************************************");
		}
}	
	@Test
	public void GetProjectwithNoCookie(){
		LOGGER.info("*****************Test case: Get Project  with Wrong Id Started*****************");
		LOGGER.info("*****************************************************************************");
		  try {
			  	LOGGER.info("Sending Get request");
				APIResponse response=APIRequest.GET(uri).path("/project/1").type(MediaType.APPLICATION_JSON_TYPE).invoke();
				response.assertBodyContains("401");
		}
		  finally {
				LOGGER.info("*****************Test case: Get Project  with Wrong Id Ended*****************");
				LOGGER.info("*****************************************************************************");
		}
	}
	@Test 
	public void GetProjectwithNoId() {
		try {
			 LOGGER.info("*****************Test case: Get Project getOne with no id Started*****************");
			 System.out.println("*****************Test case: Get Project getOne with no id Started*****************");
			String uri = APITest.getValue("baseuri");
			  LOGGER.info("Sending Get request");
				APIResponse response=APIRequest.GET(uri).path("/project/").type(MediaType.APPLICATION_JSON_TYPE).param("cookie", cookievalue).invoke();
				response.assertBodyContains("405");
		} finally {
			 LOGGER.info("*****************Test case: Get Project getOne with no id Ended*****************");
			 System.out.println("*****************Test case: Get Project getOne with no id Ended*****************");
		}
	}

	
	@Test(groups="Postive")
	public void PostProject(){
		LOGGER.info("**************************************************************************");
		LOGGER.info("*****************Test case: Post Project Create Started*****************");
		System.out.println("*****************Test case: Post Project Create Started*****************");
		  try {
				APIResponse response=APIRequest.POST(uri).path("/project").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
				response.assertBodyContains("200");
				System.out.println("");
			
		} finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Project add Ended*****************");
			System.out.println("*****************Test case: Post Project add Ended*****************");
		}
  }
	
	@Test 
	public void PostProjectwithid(){
		LOGGER.info("**************************************************************************");
		LOGGER.info("*****************Test case: Post Project with id Started*****************");
		System.out.println("*****************Test case: Post Project with id Started*****************");
		  try {
			  

				APIResponse response=APIRequest.POST(uri).path("/project").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).
			    invoke();
				response.assertBodyContains("200");
			
		} finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Project with id Ended*****************");
			System.out.println("*****************Test case: Post Project with id Ended*****************");
		}
	}
	
	public void PostProjectContact(){
		LOGGER.info("**************************************************************************");
		LOGGER.info("*****************Test case: Post Project Contact Started*****************");
		System.out.println("*****************Test case: Post Project Contact Started*****************");
		  try {
			  
			  String uri = APITest.getValue("baseuri");
			  String cookievalue= cookies.get(0);
			  System.out.println(cookievalue);
			  String sql = "INSERT INTO am_dev.resume\n" +
					  "(id, people_id, copy_name, copy_reason, avatar, chinese_name, english_name, gender, mobile, work_tel, other_tel, private_email, work_email, other_email, birthday, marital_status, register_location_id, address_id, started_work_at, introduce, wechat_no, qq_no, weibo, linkedin_url, home_page, `source`, job_search_status, expect_org_ids, expect_location_ids, expect_salary, `type`, owner_id, created_by, updated_by, created_at, updated_at, status, work_phone, locked, locked_at, unlocked_at)\n" +
					  "VALUES(0, 0, '', '', '', '', '', 0, '', '', '', '', '', '', '', 0, 0, 0, '', '', '', '', '', '', '', 0, 0, '', '', ?, 0, 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, '', 0, '', '');\n";
			  String palyload="{\n" +
					  "\t\"id\":4,\n" +
					  "\t\"contactList\":[{\n" +
					  "\t\t\"id\":11\n" +
					  "\t\t\"peopleId\":11\n" +
					  "\t}]\n" +
					  "}";
				APIResponse response=APIRequest.POST(uri).path("/project/contact").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(palyload).invoke();
				response.assertBodyContains("200");
			
		} finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Project Contact Ended*****************");
			System.out.println("*****************Test case: Post Project Contact Ended*****************");
		}
	}
	@Test
	public void GetProjectClient(){
		LOGGER.info("**************************************************************************");
		LOGGER.info("*****************Test case: Post Project Client Started*****************");
		  try {
			  String orgName="test";
				APIResponse response=APIRequest.POST(uri).path("/project").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).param("orgName", orgName).invoke();
				response.assertBodyContains("200");
			
		} finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Project Client Ended*****************");
		}
	}
  
	@Test
	public void GetProjectClientwithWrongOrgName(){
		LOGGER.info("**************************************************************************");
		LOGGER.info("*****************Test case: Post Project Client with Wrong OrgName Started*****************");
		  try {
			  String orgName="test";
				APIResponse response=APIRequest.POST(uri).path("/project").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).param("orgName", orgName).invoke();
				response.assertBodyContains("500");
			
		} finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Project Client with Wrong OrgNae Ended*****************");
		}
	}
  @BeforeSuite
  public void setup() throws SQLException {
	  
	  LOGGER.info("*****************Test suit: Project*****************");
		String uri = APITest.getValue("baseuri");
		String path = APITest.getValue("login.path");
		//String payload = String.format(APITest.loadFile("jsonfile.json"), "62ab92bab49692ea813c99b3d2b4ebbdb3aa99ffede992762b5edc612f162814", "f57405304f15cba90c214252f85b925407704d3bb67b598bb49ada0460161b63");		
		APIResponse response=APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=koth&password=1").invoke();

		final Map<String,NewCookie> cookie=response.getcookie();
	    for (String name : cookie.keySet()) {
	        Cookie cookievalue = cookie.get(name);
	        System.out.println("Cookie: " + name + "=" + cookievalue.getValue());
	        cookies.add(name + "=" + cookievalue.getValue());
	    }
	    cookievalue= cookies.get(0);
		response.assertBodyContains("200");
		conn=dbCtrl.set_connection();
  }

  @AfterSuite
  public void teardown() {
	  dbCtrl.Close_DB_Connection(conn);
	  LOGGER.info("*****************Test suit: Project Ended*****************");
  }
}
