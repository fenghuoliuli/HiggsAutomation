package com.inmind.restful.testcases;

import org.testng.annotations.Test;
import com.inmind.utils.*;


import com.inmind.general.APITest;
import com.inmind.http.APIRequest;
import com.inmind.http.APIResponse;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.sound.midi.VoiceStatus;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Question {
	//protected static final Logger LOGGER = LoggerFactory.getLogger(Question.class);
	private static Logger LOGGER = LogManager.getLogger(Question.class.getName());
	ArrayList<String> cookies= new ArrayList<String>();
	DBCtrl dbCtrl = new DBCtrl();
	private Connection conn;
	//private Gson gson = new Gson();
	
  @Test(groups={"Get_Question_List", "Postive"})
  public void Get_Question_List() {

	  try {
		  
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/question/listAll").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).
		    invoke();
			response.assertBodyContains("200");
			ArrayList<Integer> id = new ArrayList<Integer>();
			ArrayList<String> title = new ArrayList<String>();
			ArrayList<Integer> type = new ArrayList<Integer>();
			ArrayList<Integer> refer_type= new ArrayList<Integer>();
			ArrayList<Integer> required = new ArrayList<Integer>();
			ArrayList<String> options = new ArrayList<String>();
			ArrayList<String> description = new ArrayList<String>();
			ArrayList<Integer> deleted = new ArrayList<Integer>();
			ArrayList<Integer> created_by = new  ArrayList<Integer>();
			ArrayList<Integer> updated_by = new ArrayList<Integer>();
			ArrayList<Long> created_at = new ArrayList<Long>();
			ArrayList<Long> updated_at = new ArrayList<Long>();
			ResultSet resultSet=dbCtrl.query(conn, "SELECT * FROM automind_test.question;");
			while (resultSet.next()) {
				//id.add(resultSet.getInt(1));
				id.add(resultSet.getInt("id"));
				title.add(resultSet.getString("title"));
				System.out.println(resultSet.getInt("refer_type"));
				refer_type.add(Integer.valueOf(resultSet.getInt("refer_type")));
				type.add(resultSet.getInt("type"));
				required.add(resultSet.getInt("required"));
				options.add(resultSet.getString("options"));
				description.add(resultSet.getString("description"));
				deleted.add(resultSet.getInt("deleted"));
				created_by.add(resultSet.getInt("created_by"));
				updated_by.add(resultSet.getInt("updated_by"));
//				created_at.add(resultSet.getDate(11));
				created_at.add(resultSet.getTimestamp("created_at").getTime());
				updated_at.add(resultSet.getTimestamp("updated_at").getTime());			
			}
			String responsbody=response.getBody();
			JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
			JsonArray array=jsonObject.get("_body").getAsJsonArray();    
            for(int i=0;i<array.size();i++){
                System.out.println("---------------");
                JsonObject subObject=array.get(i).getAsJsonObject();
//                long createdate=subObject.get("createdAt").getAsLong();
//                Date date=new Date(createdate);
//                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//                String actual_create_At=format.format(date);
                int number=id.indexOf(subObject.get("id").getAsInt());
                //int number=created_at.indexOf(subObject.get("createdAt").getAsLong());
                if(number>=0)
                {
                	Assert.assertEquals(Long.valueOf(subObject.get("createdAt").getAsLong()), created_at.get(number));
                	Assert.assertEquals(subObject.get("deleted").getAsInt(),deleted.get(number).intValue());
                	Assert.assertEquals(subObject.get("updatedBy").getAsInt(), updated_by.get(number).intValue());
                	Assert.assertEquals(subObject.get("createdBy").getAsInt(), created_by.get(number).intValue());
                	Assert.assertEquals(subObject.get("options").getAsString(), options.get(number));
                	if (subObject.has("referType"))
                	{
                		Assert.assertEquals(subObject.get("referType").getAsInt(), refer_type.get(number).intValue());
                	}
                	if (subObject.has("description"))
                	{
                		Assert.assertEquals(subObject.get("description").getAsString(), description.get(number));;
                	}
                	Assert.assertEquals(subObject.get("id").getAsInt(), id.get(number).intValue());
                	if (subObject.has("title"))
                	{
                		Assert.assertEquals(subObject.get("title").getAsString(), title.get(number));
                	}
                	Assert.assertEquals(subObject.get("type").getAsInt(), type.get(number).intValue());
                	if (subObject.has("required"))
                	{
                		Assert.assertEquals(subObject.get("required").getAsInt(), required.get(number).intValue());
                	}
                	Assert.assertEquals(Long.valueOf(subObject.get("updatedAt").getAsLong()), updated_at.get(number));
                }
                else
                	{
                		LOGGER.error("There is no same create at time in the DB");
                		Assert.fail();
                	}
                
            }
			
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		LOGGER.info("*****************Test case: Get Question List Ended*****************");
		System.out.println("*****************Test case: Get Question List Ended*****************");
	}
	  
	  
  }

  @Test (groups = {"Get_Question_List","Nagtive"})
  public void Get_Question_List_with_No_Cookie() {
	  
	  LOGGER.info("*****************Test case: Get Question List with No Cookie Started*****************");
	  System.out.println("*****************Test case: Get Question List with No Cookie Started*****************");
	  try {
		  
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/question/listAll").type(MediaType.APPLICATION_JSON_TYPE).
		    invoke();
			response.assertBodyContains("401");
		
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Get Question with Wrong Auth List Ended*****************");
		System.out.println("*****************Test case: Get Question with Wrong Auth List Ended*****************");
	}

}  
  @Test (groups={"Get_Question_List","Nagtive"})
  public void Get_Question_List_with_Wrong_Cookie() {
	  
	  LOGGER.info("*****************Test case: Get Question List with No Cookie Started*****************");
	  System.out.println("*****************Test case: Get Question List with No Cookie Started*****************");
	  try {
		  
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/question/listAll").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue+"0").
		    invoke();
			response.assertBodyContains("403");
		
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Get Question with Wrong Auth List Ended*****************");
		System.out.println("*****************Test case: Get Question with Wrong Auth List Ended*****************");
	}

}
  

  
  @Test(groups={"Post_Question_Add","Nagtive"})
  public void Post_Question_Add() throws SQLException {
	  
	  LOGGER.info("*****************Test case: Post Question add Started*****************");
	  System.out.println("*****************Test case: Post Question add Started*****************");
	  try
	  {
		  ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);				 
				}
	 String uri = APITest.getValue("baseuri");
	  String cookievalue= cookies.get(0);
	  String payload= String.format(APITest.loadFile("Post_Question_Add.json"));
	  System.out.println(cookievalue);
	  LOGGER.info("Post request body is:"+payload);
	  APIResponse response=APIRequest.POST(uri).path("/question/add").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();	   
	  LOGGER.info("Post Question Add's response body is: "+response.toString());
	  response.assertBodyContains("200");
	  String sqlstatement="SELECT id FROM question WHERE title=\"zhao testing\";";
	  Thread.sleep(1000);
	  ResultSet resultSet2=dbCtrl.query(conn, sqlstatement);
	  resultSet2.last();
	  Assert.assertEquals(resultSet2.getRow(), 1);
	  
	/*APIResponse responseverify=APIRequest.GET(uri).path("/question/listAll").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
	responseverify.assertStatus(200);
	LOGGER.info("The reponse body is: "+ responseverify.getBody());
	responseverify.assertBodyContains("zhao testing");
	*/
	  }
	  catch (Exception e) {
		// TODO: handle exception
	}
	 finally
	 {
		 ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);
				 
		}
			System.out.println("*****************Test case: Post Question add Ended*****************");
			LOGGER.info("*****************Test case: Post Question add Ended*****************");
	 }
	  
  }
  
  @Test
  public void Post_Question_Add_Duplicate(){
	  try{
		  LOGGER.info("*****************Test case: Post Question add duplicate Started*****************");
		  System.out.println("*****************Test case: Post Question add duplicate Started*****************");
		 String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  String payload= String.format(APITest.loadFile("Post_Question_Add.json"));
		  System.out.println(cookievalue);
		  LOGGER.info("Post request body is:"+payload);
		  APIResponse response=APIRequest.POST(uri).path("/question/add").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();	
		  String sqlstatement="INSERT INTO question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		  LOGGER.info("Executing the sql statement:"+sqlstatement);
		  dbCtrl.executeSql(conn,sqlstatement);
	
		  LOGGER.info("Post Question Add's response body is: "+response.toString());
		  }
	  finally {
			System.out.println("*****************Test case: Post Question add Duplicate Ended*****************");
			LOGGER.info("*****************Test case: Post Question add Duplicate Ended*****************");
	}
  }
  
  
  @Test(groups={"Post_Question_Add","Nagtive"})
  public void Post_Question_Add_with_No_Cookie() throws SQLException {
	  
	  LOGGER.info("*****************Test case: Post Question add Started*****************");
	  System.out.println("*****************Test case: Post Question add Started*****************");
	  try
	  {
		  ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);				 
				}
	 String uri = APITest.getValue("baseuri");
	  String cookievalue= cookies.get(0);
	  String payload= String.format(APITest.loadFile("Post_Question_Add.json"));
	  System.out.println(cookievalue);
	  LOGGER.info("Post request body is:"+payload);
	  APIResponse response=APIRequest.POST(uri).path("/question/add").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();	   
	  LOGGER.info("Post Question Add's response body is: "+response.toString());
	  response.assertBodyContains("401");
	  
	/*APIResponse responseverify=APIRequest.GET(uri).path("/question/listAll").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
	responseverify.assertStatus(200);
	LOGGER.info("The reponse body is: "+ responseverify.getBody());
	responseverify.assertBodyContains("zhao testing");
	*/
	  }
	  catch (Exception e) {
		// TODO: handle exception
	}
	 finally
	 {
		 ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);
				 
		}
			System.out.println("*****************Test case: Post Question add Ended*****************");
			LOGGER.info("*****************Test case: Post Question add Ended*****************");
	 }
	  
  }
 
  @Test(groups={"Post_Question_Add","Nagtive"})
  public void Post_Question_Add_with_Bad_Cookie() throws SQLException {
	  
	  LOGGER.info("*****************Test case: Post Question add Started*****************");
	  System.out.println("*****************Test case: Post Question add Started*****************");
	  try
	  {
		  ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);				 
				}
	 String uri = APITest.getValue("baseuri");
	  String cookievalue= cookies.get(0);
	  String payload= String.format(APITest.loadFile("Post_Question_Add.json"));
	  System.out.println(cookievalue);
	  LOGGER.info("Post request body is:"+payload);
	  APIResponse response=APIRequest.POST(uri).path("/question/add").header("cookie",cookievalue+"2").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();	   
	  LOGGER.info("Post Question Add's response body is: "+response.toString());
	  response.assertBodyContains("403");
	  
	  }
	  catch (Exception e) {
		// TODO: handle exception
	}
	 finally
	 {
		 ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);
				 
		}
			System.out.println("*****************Test case: Post Question add Ended*****************");
			LOGGER.info("*****************Test case: Post Question add Ended*****************");
	 }
	  
  }
  
  @Test(groups={"Post_Question_Add","Nagtive"})
  public void Post_Question_Add_with_Bad_Body() throws SQLException {
	  
	  LOGGER.info("*****************Test case: Post Question add Started*****************");
	  System.out.println("*****************Test case: Post Question add Started*****************");
	  try
	  {
		  ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);				 
				}
	 String uri = APITest.getValue("baseuri");
	  String cookievalue= cookies.get(0);
	  String payload= String.format(APITest.loadFile("Post_Question_Add_Bad_Body.json"));
	  System.out.println(cookievalue);
	  LOGGER.info("Post request body is:"+payload);
	  APIResponse response=APIRequest.POST(uri).path("/question/add").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();	   
	  LOGGER.info("Post Question Add's response body is: "+response.toString());
	  response.assertBodyContains("400");
	
	  }
	  catch (Exception e) {
		// TODO: handle exception
	}
	 finally
	 {		
			System.out.println("*****************Test case: Post Question add Ended*****************");
			LOGGER.info("*****************Test case: Post Question add Ended*****************");
	 }
	  
  }
  
  @Test(groups={"Post_Question_Add","Nagtive"})
  public void Post_Question_Add_with_Missing_Element() throws SQLException {
	  
	  LOGGER.info("*****************Test case: Post Question add Started*****************");
	  System.out.println("*****************Test case: Post Question add Started*****************");
	  try
	  {
		  ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE title=\"zhao testing\";");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);				 
				}
	 String uri = APITest.getValue("baseuri");
	  String cookievalue= cookies.get(0);
	  String payload= String.format(APITest.loadFile("Post_Question_Add_Missing_Element.json"));
	  System.out.println(cookievalue);
	  LOGGER.info("Post request body is:"+payload);
	  APIResponse response=APIRequest.POST(uri).path("/question/add").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();	   
	  LOGGER.info("Post Question Add's response body is: "+response.toString());
	  response.assertBodyContains("400");
	
	  }
	  catch (Exception e) {
		// TODO: handle exception
	}
	 finally
	 {		
			System.out.println("*****************Test case: Post Question add Ended*****************");
			LOGGER.info("*****************Test case: Post Question add Ended*****************");
	 }
	  
  }
 
  
  
  
  @Test(groups="Postive")
  public void Post_Question_Delete()
  {
	  LOGGER.info("*****************Test case: Post Question Delete Started*****************");
	try {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		while (resultSet.next()) {
			int id=resultSet.getInt(1);
			 String sqlstatement="DELETE FROM  question WHERE id="+id;
			 LOGGER.info("Deleting the record which id=123 in the DB");
			 dbCtrl.executeSql(conn,sqlstatement);			 
	}
		
		  String sqlstatement="INSERT INTO automind_test.question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		  LOGGER.info("Executing the sql statement:"+sqlstatement);
		  dbCtrl.executeSql(conn,sqlstatement);
		  //ResultSet result=dbCtrl.query(conn,"SELECT id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at FROM automind_test.question WHERE title=\"\";");
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  String payload= String.format(APITest.loadFile("Post_Question_Add.json"));
		  APIResponse response=APIRequest.POST(uri).path("/question/delete").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		  response.assertStatus(200);
		  APIResponse responseverify=APIRequest.GET(uri).path("/question/listAll").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
			responseverify.assertStatus(200);
			LOGGER.info("The reponse body is: "+ responseverify.getBody());
			responseverify.assertBodyNotContains(payload);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Post Question Delete Ended*****************");
	  
	}
}

  @Test(groups="Nagtive")
  public void Post_Question_Delete_with_Bad_Request()
  {
	  LOGGER.info("*****************Test case: Post Question Delete eith Bad Request Started*****************");
	try {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		while (resultSet.next()) {
			int id=resultSet.getInt(1);
			 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
			 LOGGER.info("Deleting the record which id=123 in the DB");
			 dbCtrl.executeSql(conn,sqlstatement);			 
	}
		
		  String sqlstatement="INSERT INTO automind_test.question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		  LOGGER.info("Executing the sql statement:"+sqlstatement);
		  dbCtrl.executeSql(conn,sqlstatement);
		  //ResultSet result=dbCtrl.query(conn,"SELECT id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at FROM automind_test.question WHERE title=\"\";");
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  String payload= String.format(APITest.loadFile("Post_Question_Delete_Bad_Body.json"));
		  APIResponse response=APIRequest.POST(uri).path("/question/delete").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		  response.assertBodyContains("400");
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Post Question Delete with Bad Request body Ended*****************");
	}
	  
}
  
  @Test(groups={"Question","Nagtive"})
  public void Post_Question_Delete_with_Bad_Element()
  {
	  LOGGER.info("*****************Test case: Post Question Delete with Bad Element Started*****************");
	  System.out.println("*****************Test case: Post Question Delete with Bad Element Started*****************");
	try {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		while (resultSet.next()) {
			int id=resultSet.getInt(1);
			 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
			 LOGGER.info("Deleting the record which id=123 in the DB");
			 dbCtrl.executeSql(conn,sqlstatement);			 
	}
		
		  String sqlstatement="INSERT INTO automind_test.question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		  LOGGER.info("Executing the sql statement:"+sqlstatement);
		  dbCtrl.executeSql(conn,sqlstatement);
		  //ResultSet result=dbCtrl.query(conn,"SELECT id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at FROM automind_test.question WHERE title=\"\";");
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  String payload= String.format(APITest.loadFile("Post_Question_Delete_Bad_Element.json"));
		  APIResponse response=APIRequest.POST(uri).path("/question/delete").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		  response.assertBodyContains("400");
		  ResultSet resultSet1=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		  Assert.assertEquals(resultSet1.getRow(), 1);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		// TODO: handle finally clause
		ResultSet resultSet2=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		try {
			while (resultSet2.next()) {
				int id=resultSet2.getInt(1);
				 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
				 LOGGER.info("Deleting the record which id=123 in the DB");
				 dbCtrl.executeSql(conn,sqlstatement);			 
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.info("*****************Test case: Post Question Delete with Bad Element Ended*****************");
		System.out.println("*****************Test case: Post Question Delete with Bad Element Ended*****************");
	}
	  
}
  
  @Test(groups={"Question","Nagtive"})
  public void Post_Question_Delete_with_Missing_Element()
  {
	  LOGGER.info("*****************Test case: Post Question Delete with Missing Element Started*****************");
	  System.out.println("*****************Test case: Post Question Delete with Missing Element Started*****************");
	try {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		while (resultSet.next()) {
			int id=resultSet.getInt(1);
			 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
			 LOGGER.info("Deleting the record which id=123 in the DB");
			 dbCtrl.executeSql(conn,sqlstatement);			 
	}
		
		  String sqlstatement="INSERT INTO automind_test.question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		  LOGGER.info("Executing the sql statement:"+sqlstatement);
		  dbCtrl.executeSql(conn,sqlstatement);		  
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  String payload= String.format(APITest.loadFile("Post_Question_Delete_Missing_Element.json"));
		  APIResponse response=APIRequest.POST(uri).path("/question/delete").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		  response.assertBodyContains("400");
		  ResultSet resultSet1=dbCtrl.query(conn, "SELECT id FROM automind_test.question WHERE id=123;");
		  Assert.assertEquals(resultSet1.getRow(), 1);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		// TODO: handle finally clause
		ResultSet resultSet2=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		try {
			while (resultSet2.next()) {
				int id=resultSet2.getInt(1);
				 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
				 LOGGER.info("Deleting the record which id=123 in the DB");
				 dbCtrl.executeSql(conn,sqlstatement);			 
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.info("*****************Test case: Post Question Delete with Missing Element Ended*****************");
		System.out.println("*****************Test case: Post Question Delete with Missing Element Ended*****************");
	}
	  
}
  @Test(groups="Nagtive")
  public void Post_Question_Delete_with_Bad_Cookie()
  {
	  LOGGER.info("*****************Test case: Post Question Delete with Bad Cookie Started*****************");
	try {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
		while (resultSet.next()) {
			int id=resultSet.getInt(1);
			 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
			 LOGGER.info("Deleting the record which id=123 in the DB");
			 dbCtrl.executeSql(conn,sqlstatement);			 
	}
		
		  String sqlstatement="INSERT INTO question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		  LOGGER.info("Executing the sql statement:"+sqlstatement);
		  dbCtrl.executeSql(conn,sqlstatement);		 
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  String payload= String.format(APITest.loadFile("Post_Question_Add.json"));
		  APIResponse response=APIRequest.POST(uri).path("/question/delete").header("cookie",cookievalue+"2").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		  response.assertBodyContains("403");
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Post Question Delete with Bad Cookie body Ended*****************");
		System.out.println("*****************Test case: Post Question Delete with Bad Cookie body Ended*****************");
	}
	  
}
  
  @Test(groups="Nagtive")
  public void Post_Question_Delete_with_No_Cookie()
  {
	  LOGGER.info("*****************Test case: Post Question Delete with Bad Cookie Started*****************");
	try {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM automind_test.question WHERE id=123;");
		while (resultSet.next()) {
			int id=resultSet.getInt(1);
			 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
			 LOGGER.info("Deleting the record which id=123 in the DB");
			 dbCtrl.executeSql(conn,sqlstatement);			 
	}
		
		  String sqlstatement="INSERT INTO question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		  LOGGER.info("Executing the sql statement:"+sqlstatement);
		  dbCtrl.executeSql(conn,sqlstatement);		  
		  String uri = APITest.getValue("baseuri");
		  String payload= String.format(APITest.loadFile("Post_Question_Add.json"));
		  APIResponse response=APIRequest.POST(uri).path("/question/delete").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		  response.assertBodyContains("401");
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Post Question Delete with Bad Cookie body Ended*****************");
		System.out.println("*****************Test case: Post Question Delete with Bad Cookie body Ended*****************");
	}
	  
}
  
  @Test(groups={"Question","Postive"})
  
  public void Post_Question_Update() throws InterruptedException

  {
	  LOGGER.info("*****************Test case: Post Question Update Started*****************");
	  System.out.println("*****************Test case: Post Question Update Started*****************");
		try {
				 
			String sqlstatement="INSERT INTO question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
			  LOGGER.info("Executing the sql statement:"+sqlstatement);
			  dbCtrl.executeSql(conn,sqlstatement);	  
			  String uri = APITest.getValue("baseuri");
			  String cookievalue= cookies.get(0);
			  String payload= String.format(APITest.loadFile("Post_Question_Update.json"));
			  APIResponse response=APIRequest.POST(uri).path("/question/update").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			  response.assertStatus(200);
			  Thread.sleep(1000);
			  ResultSet resultSet2=dbCtrl.query(conn, "SELECT id FROM question WHERE description=\"Update for zhao testing\";");
			  resultSet2.last();
			  Assert.assertEquals(resultSet2.getRow(), 1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE description=\"Update for zhao testing\";");
			try {
				while (resultSet.next()) {
					int id=resultSet.getInt(1);
					 String sqlstatement="DELETE FROM  question WHERE id="+id;
					 dbCtrl.executeSql(conn,sqlstatement);
				LOGGER.info("*****************Test case: Post Question Update Ended*****************");
				System.out.println("*****************Test case: Post Question Update Ended*****************");
  
}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
  }

  @Test(groups={"Question","Nagtive"})
  public void Post_Question_Update_with_no_Cookie() throws InterruptedException

  {
	  LOGGER.info("*****************Test case: Post Question Update with no Cookie Started*****************");
	  System.out.println("*****************Test case: Post Question Update with no Cookie Started*****************");
		try {
			ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM question WHERE id=123;");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  automind_test.question WHERE id="+id;
				 LOGGER.info("Deleting the record");
				 dbCtrl.executeSql(conn,sqlstatement);			 
		}
			String sqlstatement="INSERT INTO question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
			  LOGGER.info("Executing the sql statement:"+sqlstatement);
			  dbCtrl.executeSql(conn,sqlstatement);	  
			  String uri = APITest.getValue("baseuri");
			  String payload= String.format(APITest.loadFile("Post_Question_Update.json"));
			  APIResponse response=APIRequest.POST(uri).path("/question/update").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			  response.assertBodyContains("401");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Question Update with no Cookie Ended*****************");
			System.out.println("*****************Test case: Post Question Update with no Cookie Ended*****************");
		  
		}
  }

@Test(groups={"Question","Postive"})
  
  public void Post_Question_Update_with_Bad_Cookie() throws InterruptedException

  {
	  LOGGER.info("*****************Test case: Post Question Update with Bad Cookie Started*****************");
	  System.out.println("*****************Test case: Post Question Update with Bad Cookie Started*****************");
		try {
			ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM automind_test.question WHERE id=123;");
			while (resultSet.next()) {
				int id=resultSet.getInt(1);
				 String sqlstatement="DELETE FROM  question WHERE id="+id;
				 LOGGER.info("Deleting the record which id=123 in the DB");
				 dbCtrl.executeSql(conn,sqlstatement);			 
		}
			String sqlstatement="INSERT INTO question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
			  LOGGER.info("Executing the sql statement:"+sqlstatement);
			  dbCtrl.executeSql(conn,sqlstatement);	  
			  String uri = APITest.getValue("baseuri");
			  String cookievalue= cookies.get(0);
			  String payload= String.format(APITest.loadFile("Post_Question_Update.json"));
			  APIResponse response=APIRequest.POST(uri).path("/question/update").header("cookie",cookievalue+"2").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			  response.assertBodyContains("403");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Question Update with Bad Cookie Ended*****************");
			System.out.println("*****************Test case: Post Question Update with Bad Cookie Ended*****************");
		  
		}
  }
  
  @Test(groups={"Question","Nagitive"})

public void Post_Question_Update_with_Bad_Element() throws InterruptedException

{
	  LOGGER.info("*****************Test case: Post Question Update with Bad Element Started*****************");
	  System.out.println("*****************Test case: Post Question Update with Bad Element Started**********");
	  try{
			  String uri = APITest.getValue("baseuri");
			  String cookievalue= cookies.get(0);
			  String payload= String.format(APITest.loadFile("Post_Question_Update_Bad_Element.json"));
			  APIResponse response=APIRequest.POST(uri).path("/question/update").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			  response.assertBodyContains("204");
		}  finally {
			// TODO: handle finally clause
			LOGGER.info("*****************Test case: Post Question Update with Bad Element Ended*****************");
			System.out.println("*****************Test case: Post Question Update with Bad Element Ended*****************");
		  
		}
}
  
  @Test(groups={"Question","Nagitive"})

  public void Post_Question_Update_with_Missing_Element() throws InterruptedException

  {
  	  LOGGER.info("*****************Test case: Post Question Update with Missing Element Started*****************");
  	  System.out.println("*****************Test case: Post Question Update with Missing Element Started**********");
  	  try{
  			  String uri = APITest.getValue("baseuri");
  			  String cookievalue= cookies.get(0);
  			  String payload= String.format(APITest.loadFile("Post_Question_Update_Missing_Element.json"));
  			  APIResponse response=APIRequest.POST(uri).path("/question/update").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
  			  response.assertBodyContains("204");
  		}  finally {
  			// TODO: handle finally clause
  			LOGGER.info("*****************Test case: Post Question Update with Missing Element Ended*****************");
  			System.out.println("*****************Test case: Post Question Update with Missing Element Ended*****************");
  		  
  		}
  } 
  
  @Test(groups={"Question","Nagitive"})

  public void Post_Question_Update_with_Bad_Body() throws InterruptedException

  {
  	  LOGGER.info("*****************Test case: Post Question Update with Bad Body Started*****************");
  	  System.out.println("*****************Test case: Post Question Update with Bad Body Started**********");
  	  try{
  			  String uri = APITest.getValue("baseuri");
  			  String cookievalue= cookies.get(0);
  			  String payload= String.format(APITest.loadFile("Post_Question_Update_Bad_Body.json"));
  			  APIResponse response=APIRequest.POST(uri).path("/question/update").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
  			  response.assertBodyContains("400");
  		}  finally {
  			// TODO: handle finally clause
  			LOGGER.info("*****************Test case: Post Question Update with Bad Element Ended*****************");
  			System.out.println("*****************Test case: Post Question Update with Bad Element Ended*****************");
  		  
  		}
  }
  
 
  
  @Test(groups={"Question","Positive"})
  public void  Get_Question_getByTaskCode() {
	  LOGGER.info("*****************Test case: Get Question by task code Started*****************");
	  System.out.println("*****************Test case: Get Question by task code Started*****************");
	  try {
		  
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/question/GetByTaskCode").header("cookie",cookievalue).param("taskCode", "2").type(MediaType.APPLICATION_JSON_TYPE).
		    invoke();
			response.assertBodyContains("200");
		
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Get Question By Task Code Ended*****************");
		System.out.println("*****************Test case: Get Question By Task Code Ended*****************");
	}	 
}

  @Test(groups={"Question","Nagtive"})
  public void  Get_Question_getByTaskCode_with_no_Cookie() {
	  LOGGER.info("*****************Test case: Get Question by task code with no cookie Started*****************");
	  System.out.println("*****************Test case: Get Question by task code with no cookie Started*****************");
	  try {
		  
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/question/GetByTaskCode").param("taskCode", "2").type(MediaType.APPLICATION_JSON_TYPE).
		    invoke();
			response.assertBodyContains("401");
		
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Get Question By Task Code with no cookie Ended*****************");
		System.out.println("*****************Test case: Get Question By Task Code with no cookie Ended*****************");
	}	 
}
  
  @Test(groups={"Question","Nagtive"})
  public void  Get_Question_getByTaskCode_with_Bad_Cookie() {
	  LOGGER.info("*****************Test case: Get Question by task code with Bad cookie Started*****************");
	  System.out.println("*****************Test case: Get Question by task code with Bad cookie Started*****************");
	  try {
		  
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/question/GetByTaskCode").header("cookie",cookievalue+"2").param("taskCode", "2").type(MediaType.APPLICATION_JSON_TYPE).
		    invoke();
			response.assertBodyContains("403");
		
	} finally {
		// TODO: handle finally clause
		LOGGER.info("*****************Test case: Get Question By Task Code with Bad cookie Ended*****************");
		System.out.println("*****************Test case: Get Question By Task Code with Bad cookie Ended*****************");
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
	  //BasicConfigurator.configure();
	  LOGGER.info("*****************Class: Get Question Started*****************");
	  System.out.println("*****************Class: Get Question Started*****************");
  }

  @AfterClass
  public void afterClass() {
	  LOGGER.info("*****************Class:Question Ended*****************");
	  System.out.println("*****************Class: Question Ended*****************");
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void setup() throws SQLException {
	  
	  LOGGER.info("*****************Test suit: Question*****************");
	  System.out.println("*****************Test suit: Question*****************");
		String uri = APITest.getValue("baseuri");
		String path = APITest.getValue("login.path");
		//String payload = String.format(APITest.loadFile("jsonfile.json"), "62ab92bab49692ea813c99b3d2b4ebbdb3aa99ffede992762b5edc612f162814", "f57405304f15cba90c214252f85b925407704d3bb67b598bb49ada0460161b63");		
		APIResponse response=APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=koth&password=1")
	    .invoke();

		final Map<String,NewCookie> cookie=response.getcookie();
	    for (String name : cookie.keySet()) {
	        Cookie cookievalue = cookie.get(name);
	        System.out.println("Cookie: " + name + "=" + cookievalue.getValue());
	        cookies.add(name + "=" + cookievalue.getValue());
	    }
		response.assertStatus(200);
		conn=dbCtrl.set_connection();
  }

  @AfterSuite
  public void teardown() {
	  dbCtrl.Close_DB_Connection(conn);
  }

}
