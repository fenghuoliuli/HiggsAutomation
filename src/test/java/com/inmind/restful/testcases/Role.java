package com.inmind.restful.testcases;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.inmind.general.APITest;
import com.inmind.http.APIRequest;
import com.inmind.http.APIResponse;
import com.inmind.utils.DBCtrl;
import com.restfulapi.test.testdata.Oppermission;
import com.restfulapi.test.testdata.PostOppermission;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.log4testng.Logger;

import javax.ws.rs.DELETE;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Role {
  public static final Logger LOGGER = Logger.getLogger(Question.class);
  ArrayList<String> cookies= new ArrayList<String>();
  DBCtrl dbCtrl = new DBCtrl();
  public Connection conn;
  @Test
  public void Post_Role() {
    LOGGER.info("*****************Test case: Post role Started*****************");
    System.out.println("*****************Test case: Post role  Started*****************");
    try{
      String uri = APITest.getValue("baseuri");
      String cookievalue= cookies.get(0);
      System.out.println(cookievalue);
      String payload= String.format(APITest.loadFile("Post_Role_Add.json"));
      JsonObject role = new JsonParser().parse(payload).getAsJsonObject();
      APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
      response.assertBodyContains("200");
      ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
      Assert.assertEquals(role.get("roleName").getAsString(),resultSet.getString("role_name"));
      Assert.assertEquals(role.get("roleCode").getAsString(),resultSet.getString("role_code"));
      Assert.assertEquals(role.get("roleDesc").getAsString(),resultSet.getString("role_desc"));
      Assert.assertEquals(role.get("updatedAt").getAsString(),resultSet.getString("updated_at"));
      Assert.assertEquals(role.get("createdAt").getAsString(), resultSet.getString("created_at"));
      Assert.assertEquals(role.get("createdBy").getAsLong(),resultSet.getLong("created_by"));
      Assert.assertEquals(role.get("updatedBy").getAsLong(),resultSet.getLong("updated_by"));
    }
    catch (Exception e)
    {}
    finally {
      ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
      try {
		while (resultSet.next()) {
		    int id=resultSet.getInt(1);
		    String sqlstatement="DELETE FROM role WHERE id="+id;
		    dbCtrl.executeSql(conn,sqlstatement);
		  }
	    } catch (SQLException e) {

		  e.printStackTrace();
	    }
      System.out.println("*****************Test case: Post Role add Ended*****************");
      LOGGER.info("*****************Test case: Post Role add Ended*****************");
    }
  }

  @Test
  public void Post_Role_duplicate(){
	  try {
		    LOGGER.info("*****************Test case: Post role duplicate Started*****************");
		    System.out.println("*****************Test case: Post role duplicate  Started*****************");
		  String insertsql="INSERT INTO role\n" +
	              "(id, role_name, role_code, role_desc, created_by, updated_by, created_at, updated_at)\n" +
	              "VALUES(0, 'zhao test', 'zhao test', 'zhao test', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
	      dbCtrl.executeSql(conn,insertsql);
	      String uri = APITest.getValue("baseuri");
	      String cookievalue= cookies.get(0);
	      System.out.println(cookievalue);
	      String payload= String.format(APITest.loadFile("Post_Role_Add.json"));
	      JsonObject role = new JsonParser().parse(payload).getAsJsonObject();
	      APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
	      response.assertBodyContains("500");
	      response.assertBodyContains("角色名称已存在");	      
		
	}finally {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
	      try {
			while (resultSet.next()) {
			    int id=resultSet.getInt(1);
			    String sqlstatement="DELETE FROM automind_test.role WHERE id="+id;
			    dbCtrl.executeSql(conn,sqlstatement);
			  }
		    } catch (SQLException e) {

			  e.printStackTrace();
		    }
	     System.out.println("*****************Test case: Post Role duplicate Ended*****************");
	      LOGGER.info("*****************Test case: Post Role duplicate Ended*****************");
	      
	}
	  
  }
  
  @Test
  public void  Post_role_update() {
	try {
		LOGGER.info("*****************Test case: Post role update Started*****************");
		System.out.println("*****************Test case: Post role update Started*****************");
		String insertsql="INSERT INTO automind_test.`role`\n" +
            "(id, role_name, role_code, role_desc, created_by, updated_by, created_at, updated_at)\n" +
            "VALUES(0, 'zhao test', 'zhao test', 'zhao test', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
		dbCtrl.executeSql(conn,insertsql);
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
		int id=0;
		while (resultSet.next()) {
      
			id=resultSet.getInt(1);
		} 
		/*JsonObject RoleObject=new JsonObject();
		RoleObject.addProperty("id", id);
		RoleObject.addProperty("roleName", "zhao test update");
		RoleObject.addProperty("roleDesc", "Updated for zhao test");*/
		String value = "{\"id\":"+id+",\"roleName\":\"zhao test update\",\"roleDesc\":\"Updated for zhao test\"}";
		String uri = APITest.getValue("baseuri");
	    String cookievalue= cookies.get(0);
	    APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
	    String responsbody=response.getBody();
		JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
		JsonObject body=jsonObject.getAsJsonObject("_body");
		ResultSet roleresultSet=dbCtrl.query(conn, "SELECT * FROM role WHERE id="+id+";");
		while (resultSet.next()){
		Assert.assertEquals(body.get("createdAt").getAsLong(), roleresultSet.getTimestamp("created_at").getTime());
		Assert.assertEquals(body.get("roleName").getAsString(), roleresultSet.getString("role_name"));
		Assert.assertEquals(body.get("roleDesc"), roleresultSet.getString("role_desc"));
		}
	}
  catch (SQLException e) {
	e.printStackTrace();
	}
	finally {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
	      try {
			while (resultSet.next()) {
			    int id=resultSet.getInt(1);
			    String sqlstatement="DELETE FROM automind_test.role WHERE id="+id;
			    dbCtrl.executeSql(conn,sqlstatement);
			  }
			ResultSet updateresultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test update\";");
			while (updateresultSet.next()) {
				  int id=updateresultSet.getInt(1);
				  String sqlstatement="DELETE FROM role WHERE id="+id;
				  dbCtrl.executeSql(conn,sqlstatement);
			}
		 } catch (SQLException e) {
			  e.printStackTrace();
		 }
			LOGGER.info("*****************Test case: Post role update ended*****************");
			System.out.println("*****************Test case: Post role update ended*****************"); 
	}
 }
  
  @Test
  public void  Post_role_update_Miss_Element() {
	try {
		LOGGER.info("*****************Test case: Post role update miss element Started*****************");
		System.out.println("*****************Test case: Post role update miss element Started*****************");
		String insertsql="INSERT INTO automind_test.`role`\n" +
            "(id, role_name, role_code, role_desc, created_by, updated_by, created_at, updated_at)\n" +
            "VALUES(0, 'zhao test', 'zhao test', 'zhao test', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
		dbCtrl.executeSql(conn,insertsql);
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
		int id=0;
		while (resultSet.next()) {
      
			id=resultSet.getInt(1);
		} 
		/*JsonObject RoleObject=new JsonObject();
		RoleObject.addProperty("id", id);
		RoleObject.addProperty("roleName", "zhao test update");
		RoleObject.addProperty("roleDesc", "Updated for zhao test");*/
		String value = "{\"id\":"+id+"";
		String uri = APITest.getValue("baseuri");
	    String cookievalue= cookies.get(0);
	    APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
	    String responsbody=response.getBody();
		JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
		JsonObject body=jsonObject.getAsJsonObject("_body");
		ResultSet roleresultSet=dbCtrl.query(conn, "SELECT * FROM role WHERE id="+id+";");
		while (resultSet.next()){
		Assert.assertEquals(body.get("createdAt").getAsLong(), roleresultSet.getTimestamp("created_at").getTime());
		Assert.assertEquals(body.get("roleName").getAsString(), roleresultSet.getString("role_name"));
		Assert.assertEquals(body.get("roleDesc"), roleresultSet.getString("role_desc"));
		}
	}
  catch (SQLException e) {
	e.printStackTrace();
	}
	finally {
		ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
	      try {
			while (resultSet.next()) {
			    int id=resultSet.getInt(1);
			    String sqlstatement="DELETE FROM automind_test.role WHERE id="+id;
			    dbCtrl.executeSql(conn,sqlstatement);
			  }
			ResultSet updateresultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test update\";");
			while (updateresultSet.next()) {
				  int id=updateresultSet.getInt(1);
				  String sqlstatement="DELETE FROM role WHERE id="+id;
				  dbCtrl.executeSql(conn,sqlstatement);
			}
		 } catch (SQLException e) {
			  e.printStackTrace();
		 }
			LOGGER.info("*****************Test case: Post role update miss element ended*****************");
			System.out.println("*****************Test case: Post role update miss element ended*****************"); 
	}
 } 
  
 @Test
 public void  Post_role_update_with_wrong_id(){
	 try{
		 LOGGER.info("*****************Test case: Post role update with wrong id Started*****************");
		System.out.println("*****************Test case: Post role update with wrong id Started*****************");
		/*JsonObject RoleObject=new JsonObject();
		RoleObject.addProperty("id", "-1");
		RoleObject.addProperty("roleName", "zhao test update");
		RoleObject.addProperty("roleDesc", "Updated for zhao test");*/
		String value = "{\"id\":-1,\"roleName\":\"zhao test update\",\"roleDesc\":\"Updated for zhao test\"}";
		String uri = APITest.getValue("baseuri");
	    String cookievalue= cookies.get(0);
	    APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
	    response.assertBodyContains("500");
	 }
	 finally {
		 LOGGER.info("*****************Test case: Post role update with wrong id ended*****************");
		System.out.println("*****************Test case: Post role update with wrong id ended*****************");
	}
 }
  @Test
  public void Post_Role_with_No_Cookie(){
    LOGGER.info("*****************Test case: Post role with No Cookie Started*****************");
    System.out.println("*****************Test case: Post role with No Cookie  Started*****************");
    try{
      String uri = APITest.getValue("baseuri");
      String cookievalue= cookies.get(0);
      System.out.println(cookievalue);
      String payload= String.format(APITest.loadFile("Post_Role_Add.json"));
      APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
      response.assertBodyContains("401");
    }
    catch (Exception e)
    {}
    finally {
      ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
      try {
        while (resultSet.next()) {
          int id=resultSet.getInt(1);
          String sqlstatement="DELETE FROM automind_test.role WHERE id="+id;
          dbCtrl.executeSql(conn,sqlstatement);
        }
        
      } catch (SQLException e) {

        e.printStackTrace();
      }
      System.out.println("*****************Test case: Post Role with No Cookie Ended*****************");
      LOGGER.info("*****************Test case: Post Role with No Cookie Ended*****************");
    }

  }

  @Test
  public void Post_Role_with_Bad_Cookie(){
    LOGGER.info("*****************Test case: Post role with Bad Cookie Started*****************");
    System.out.println("*****************Test case: Post role  with Bad Cookie Started*****************");
    try{
      String uri = APITest.getValue("baseuri");
      String cookievalue= cookies.get(0);
      System.out.println(cookievalue);
      String payload= String.format(APITest.loadFile("Post_Role_Add.json"));
      APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue+"1").body(payload).invoke();
      response.assertBodyContains("403");
    }
    catch (Exception e)
    {}
    finally {
      ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
      try {
        while (resultSet.next()) {
          int id=resultSet.getInt(1);
          String sqlstatement="DELETE FROM role WHERE id="+id;
          dbCtrl.executeSql(conn,sqlstatement);
        }
      } catch (SQLException e) {

        e.printStackTrace();
      }
      System.out.println("*****************Test case: Post Role with Bad Cookie Ended*****************");
      LOGGER.info("*****************Test case: Post Role with Bad Cookie Ended*****************");
    }
  }

  @Test
  public void Post_Role_with_Bad_Body(){
    LOGGER.info("*****************Test case: Post role with Bad Body Started*****************");
    System.out.println("*****************Test case: Post role  with Bad Body Started*****************");
    try{
      String uri = APITest.getValue("baseuri");
      String cookievalue= cookies.get(0);
      System.out.println(cookievalue);
      String payload= String.format(APITest.loadFile("Post_Role_Add_with_Bad_Body.json"));
      APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
      response.assertBodyContains("400");
    }
    catch (Exception e)
    {}
    finally {
      ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
      try {
        while (resultSet.next()) {
          int id=resultSet.getInt(1);
          String sqlstatement="DELETE FROM automind_test.role WHERE id="+id;
          dbCtrl.executeSql(conn,sqlstatement);
        }
      } catch (SQLException e) {

        e.printStackTrace();
      }
      System.out.println("*****************Test case: Post Role with Bad Body Ended*****************");
      LOGGER.info("*****************Test case: Post Role with Bad Body Ended*****************");
    }
  }

  @Test
  public void Post_Role_Add_with_Bad_Element(){
    LOGGER.info("*****************Test case: Post role with Bad Element Started*****************");
    System.out.println("*****************Test case: Post role  with Bad Element Started*****************");
    try{
      String uri = APITest.getValue("baseuri");
      String cookievalue= cookies.get(0);
      System.out.println(cookievalue);
      String payload= String.format(APITest.loadFile("Post_Role_Add_with_Bad_Element.json"));
      APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
      response.assertBodyContains("400");
    }
    catch (Exception e)
    {}
    finally {
      ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao test\";");
      try {
        while (resultSet.next()) {
          int id=resultSet.getInt(1);
          String sqlstatement="DELETE FROM automind_test.role WHERE id="+id;
          dbCtrl.executeSql(conn,sqlstatement);
        }
      } catch (SQLException e) {

        e.printStackTrace();
      }
      System.out.println("*****************Test case: Post Role with Bad Element Ended*****************");
      LOGGER.info("*****************Test case: Post Role with Bad Element Ended*****************");
    }
  }

  @Test
  public void Delete_Role(){
    LOGGER.info("*****************Test case: Delete Started*****************");
    System.out.println("*****************Test case: Delete role Started*****************");
    try {
    	int roleid = 0;
      ResultSet roleresultSet = dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao testing\";");
      while (roleresultSet.next()) {
        int id = roleresultSet.getInt(1);
        String sqlstatement = "DELETE FROM role WHERE id=" + id;
        dbCtrl.executeSql(conn, sqlstatement);
      }
      String insertsql="INSERT INTO automind_test.`role`\n" +
              "(id, role_name, role_code, role_desc, created_by, updated_by, created_at, updated_at)\n" +
              "VALUES(0, 'zhao testing', 'zhao test', 'zhao test', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
      dbCtrl.executeSql(conn,insertsql);
      ResultSet role = dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao testing\";");
      
      while (roleresultSet.next()) {
        roleid = roleresultSet.getInt(1);
      }
      String uri = APITest.getValue("baseuri");
      String cookievalue= cookies.get(0);

      APIResponse response=APIRequest.DELETE(uri).path("/role/"+String.valueOf(roleid)).header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
      response.assertBodyContains("200");
      ResultSet roledeleted = dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao testing\";");
      roledeleted.last();
      Assert.assertEquals(roledeleted.getRow(),0);

    }
    catch (SQLException e)
    {

    }
    finally {
        ResultSet roleresultSet = dbCtrl.query(conn, "SELECT id FROM role WHERE role_name=\"zhao testing\";");
        try {
			while (roleresultSet.next()) {
			  int id = roleresultSet.getInt(1);
			  String sqlstatement = "DELETE FROM role WHERE id=" + id;
			  dbCtrl.executeSql(conn, sqlstatement);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      System.out.println("*****************Test case: Delete Role Ended*****************");
      LOGGER.info("*****************Test case: Delete Role Ended*****************");
    }
  }

  @Test
  public  void Delete_Role_with_Wrong_id() {
    try {
      LOGGER.info("*****************Test case: Delete Role with Wrong id Started*****************");
      System.out.println("*****************Test case: Delete role with Wrong id Started*****************");
      String uri = APITest.getValue("baseuri");
      String cookievalue = cookies.get(0);
      APIResponse response = APIRequest.DELETE(uri).path("/role/" + "-1").header("cookie", cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
      response.assertBodyContains("200");
    }
    finally {
      LOGGER.info("*****************Test case: Delete Role with Wrong id Ended*****************");
      System.out.println("*****************Test case: Delete role with Wrong id Ended*****************");
    }
  }

  @Test
  public  void Delete_Role_with_No_id(){
	  try {
        LOGGER.info("*****************Test case: Delete Role with No id Started*****************");
        System.out.println("*****************Test case: Delete role with No id Started*****************");
        String uri = APITest.getValue("baseuri");
        String cookievalue = cookies.get(0);
        APIResponse response = APIRequest.DELETE(uri).path("/role/").header("cookie", cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
        response.assertBodyContains("404");
	} finally {
        LOGGER.info("*****************Test case: Delete Role with Wrong id ended*****************");
        System.out.println("*****************Test case: Delete role with Wrong id ended*****************");
	}
  }


  @Test
  public  void Delete_Role_with_Bad_id(){
    try {
      LOGGER.info("*****************Test case: Delete Role with Bad id Started*****************");
      System.out.println("*****************Test case: Delete role with Bad id Started*****************");
      String uri = APITest.getValue("baseuri");
      String cookievalue = cookies.get(0);
      APIResponse response = APIRequest.DELETE(uri).path("/role/" + "Test").header("cookie", cookievalue).type(MediaType.APPLICATION_JSON_TYPE).invoke();
      response.assertBodyContains("404");
    } finally {
      LOGGER.info("*****************Test case: Delete Role with Bad id ended*****************");
      System.out.println("*****************Test case: Delete role with Bad id ended*****************");
    }
  }


  @Test
  public  void Delete_Role_with_Bad_Cookie(){
    try {
      LOGGER.info("*****************Test case: Delete Role with Bad Cookie Started*****************");
      System.out.println("*****************Test case: Delete role with Bad Cookie Started*****************");
      String uri = APITest.getValue("baseuri");
      String cookievalue = cookies.get(0);
      APIResponse response = APIRequest.DELETE(uri).path("/role/" + "1").header("cookie", cookievalue+"test").type(MediaType.APPLICATION_JSON_TYPE).invoke();
      response.assertBodyContains("403");
    } finally {
      LOGGER.info("*****************Test case: Delete Role with Bad Cookie ended*****************");
      System.out.println("*****************Test case: Delete role with Bad Cookie ended*****************");
    }
  }

  @Test
  public  void Delete_Role_with_no_Cookie(){
    try {
      LOGGER.info("*****************Test case: Delete Role with Bad Cookie Started*****************");
      System.out.println("*****************Test case: Delete role with Bad Cookie Started*****************");
      String uri = APITest.getValue("baseuri");
      //String cookievalue = cookies.get(0);
      APIResponse response = APIRequest.DELETE(uri).path("/role/" + "1").type(MediaType.APPLICATION_JSON_TYPE).invoke();
      response.assertBodyContains("401");

    } finally {
      LOGGER.info("*****************Test case: Post Role Search ended*****************");
      System.out.println("*****************Test case: Post Role Search ended*****************");
    }
  }
  
@Test (dataProvider="PostRoleParam")
public void Post_Role_Search(int size, int page){
	try {
        LOGGER.info("*****************Test case: Post Role Search Started*****************");
        System.out.println("*****************Test case: Post Role Search Started*****************");
        String value = "{\"page\":"+page+",\"size\":"+size+"}";
		JsonObject RoleObject=new JsonObject();
	    RoleObject.addProperty("page", page);
	    RoleObject.addProperty("size", size);
	    String uri = APITest.getValue("baseuri");
	    String cookievalue= cookies.get(0);
	    APIResponse response=APIRequest.POST(uri).path("/role/search").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
	    response.assertBodyContains("200");
        String responsbody=response.getBody();
        JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
        ResultSet resultSet=dbCtrl.query(conn, "SELECT * FROM role;");
        resultSet.last();
        if (resultSet.getRow()< size*(page-1)+size) {
            Assert.assertEquals(jsonObject.get("_body").getAsString(),"");
        }

        else {
            JsonArray body = jsonObject.getAsJsonArray("_body");

            for (int i = 0; i < body.size(); i++) {
                resultSet.next();
                JsonObject subObject = body.get(i).getAsJsonObject();
                Assert.assertEquals(subObject.get("createdAt").getAsLong(), resultSet.getTimestamp("created_at").getTime());
                Assert.assertEquals(subObject.get("roleDesc").getAsString(), resultSet.getString("role_desc"));
                Assert.assertEquals(subObject.get("updatedBy").getAsLong(), resultSet.getLong("updated_by"));
                Assert.assertEquals(subObject.get("createdBy").getAsLong(), resultSet.getLong("created_by"));
                Assert.assertEquals(subObject.get("roleName").getAsString(), resultSet.getString("role_name"));
                Assert.assertEquals(subObject.get("id").getAsLong(), resultSet.getLong("id"));
                Assert.assertEquals(subObject.get("updatedAt").getAsLong(), resultSet.getLong("updated_at"));
            }
        }
	    JsonObject meta=jsonObject.getAsJsonObject("_meta");
	    ResultSet roletotal=dbCtrl.query(conn, "SELECT * FROM role;");
	    roletotal.last();
	    Assert.assertEquals(meta.get("total").getAsInt(), roletotal.getRow());
        int total = meta.get("total").getAsInt();
        Assert.assertEquals(meta.get("size").getAsInt(),size);
        int pages=0;
        if(roletotal.getRow()%size==0)
        {
            pages=(roletotal.getRow())/size;
        }
        else {
            pages = roletotal.getRow()/size+1;
        }
        Assert.assertEquals(meta.get("totalPages").getAsInt(),pages);
        Assert.assertEquals(meta.get("pages").getAsInt(),page);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
        LOGGER.info("*****************Test case: Post Role Search ended*****************");
        System.out.println("*****************Test case: Post Role Search ended*****************");
    }
}
    @DataProvider
    public Object[][] PostRoleParam() {
        return new Object[][] {
                { 1, 1 },
                { 5, 5 },
                { 10, 1 },
                { 20, 1 },
        };
    }



    @Test
    public void Post_Role_Search_specific(){
        try {
            LOGGER.info("*****************Test case: Post Role Search specific Started*****************");
            System.out.println("*****************Test case: Post Role Search specific Started*****************");
            String value = "{\"page\":-1,\"size\":-1}";
            String uri = APITest.getValue("baseuri");
            String cookievalue= cookies.get(0);
            APIResponse response=APIRequest.POST(uri).path("/role").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
            response.assertBodyContains("200");
            String responsbody=response.getBody();
            JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
            JsonArray body=jsonObject.getAsJsonArray("_body");
            ResultSet resultSet=dbCtrl.query(conn, "SELECT * FROM role ;");
            for(int i=0;i<body.size();i++){
                resultSet.next();
                JsonObject subObject=body.get(i).getAsJsonObject();
                Assert.assertEquals(subObject.get("createdAt").getAsLong(), resultSet.getTimestamp("created_at").getTime());
                Assert.assertEquals(subObject.get("roleDesc").getAsString(), resultSet.getString("role_desc"));
                Assert.assertEquals(subObject.get("updatedBy").getAsLong(), resultSet.getLong("updated_by"));
                Assert.assertEquals(subObject.get("createdBy").getAsLong(), resultSet.getLong("created_by"));
                Assert.assertEquals(subObject.get("roleName").getAsString(), resultSet.getString("role_name"));
                Assert.assertEquals(subObject.get("id").getAsLong(), resultSet.getLong("id"));
                Assert.assertEquals(subObject.get("updatedAt").getAsLong(), resultSet.getLong("updated_at"));
            }
            JsonObject meta=jsonObject.getAsJsonObject("_meta");
            ResultSet roletotal=dbCtrl.query(conn, "SELECT * FROM role;");
            roletotal.last();
            if (roletotal.getRow()<10){
            Assert.assertEquals(body.size(), roletotal.getRow());
            }
            else{
            	Assert.assertEquals(body.size(), 10);
            }
            Assert.assertEquals(meta.get("total").getAsInt(), roletotal.getRow());
            int total = meta.get("total").getAsInt();
            Assert.assertEquals(total,10);
            Assert.assertEquals(meta.get("totalPages").getAsInt(),total/10+1);
            Assert.assertEquals(meta.get("page").getAsInt(),1);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            LOGGER.info("*****************Test case: Post Role Search ended*****************");
            System.out.println("*****************Test case: Post Role Search ended*****************");
        }
    }
    @Test(dataProvider="GetOppermission",dataProviderClass=Oppermission.class)
    public void GetOppermission(Map<?, ?> param){
  	  try {
  		LOGGER.info("*****************Test case: Get oppermission Started*****************");
        System.out.println("*****************Test case: Get oppermissino Started*****************");
        String cookievalue= cookies.get(0);
        String uri = APITest.getValue("baseuri");
        APIResponse response=APIRequest.GET(uri).path("/oppermission").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).param("roleId", (String)param.get("roleid")).param("module", (String)param.get("module")).invoke();
        response.assertBodyContains("200");
        String responsbody=response.getBody();
        JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
        JsonArray body=jsonObject.getAsJsonArray("_body");
        ResultSet roledeleted = dbCtrl.query(conn, "SELECT id FROM op_permission WHERE module=\""+(String)param.get("module")+"\";");
        for(int i=0;i<body.size();i++)
        {
        	roledeleted.next();
        	System.out.println("---------------");
            JsonObject subObject=body.get(i).getAsJsonObject();
            Assert.assertEquals(subObject.get("type").getAsInt(), roledeleted.getInt("type"));
            Assert.assertEquals(subObject.get("name").getAsString(), roledeleted.getString("name"));
            Assert.assertEquals(subObject.get("id").getAsLong(), roledeleted.getLong("id"));
            Assert.assertEquals(subObject.get("description").getAsString(), roledeleted.getString("description"));
            Assert.assertEquals(subObject.get("module").getAsInt(), roledeleted.getInt("module"));
            Assert.assertEquals(subObject.get("selected").getAsInt(), roledeleted.getInt("selected"));
            ResultSet configured= dbCtrl.query(conn, "SELECT id FROM role_op_permission WHERE op_permission_id=\""+roledeleted.getLong("id")+"\";");
            configured.last();
            if (configured.getRow()==1){
            	Assert.assertEquals(subObject.get("configured").getAsInt(), 1);
            }
            else{
            	Assert.assertEquals(subObject.get("configured").getAsInt(), 0);
            }
            	
        }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
        LOGGER.info("*****************Test case: Get oppermission ended*****************");
        System.out.println("*****************Test case: Get oppermission ended*****************");
	}
    }
    
    @Test
    public void GetOppermissionWrongId() {
		try {
			LOGGER.info("*****************Test case: Get oppermission Wrong Id Started*****************");
	        System.out.println("*****************Test case: Get oppermission Wrong Id Started*****************");
	        String cookievalue= cookies.get(0);
	        String uri = APITest.getValue("baseuri");
	        APIResponse response=APIRequest.GET(uri).path("/oppermission").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).param("roleId", "-1").param("module", "-1").invoke();
	        response.assertBodyContains("200");
		} finally {
	        LOGGER.info("*****************Test case: Get oppermission Wrong Id ended*****************");
	        System.out.println("*****************Test case: Get oppermission Wrong Id ended*****************");
		}

	}
    
    @Test(dataProvider="PostOppermission",dataProviderClass=PostOppermission.class)
    public void PostOppermission(Map<?, ?> param){
    	  try {
    	  		LOGGER.info("*****************Test case: Post oppermission Started*****************");
    	        System.out.println("*****************Test case: Post oppermissino Started*****************");
    	        String cookievalue= cookies.get(0);
    	        String uri = APITest.getValue("baseuri");
    	        String oppermissionid=(String)param.get("oppermissionid");
    	        String [] oppermission=oppermissionid.split(",");
    	        String value = "{\"roleId\":"+(String)param.get("roleid")+", \"module\":"+(String)param.get("module")+", \"opPermissionIds\":["+(String)param.get("oppermissionid")+"]}";
    	        APIResponse response=APIRequest.POST(uri).path("/oppermission").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
    	        response.assertBodyContains("200");
    	        response.assertBodyContains("success");	       
    	        ResultSet roledeleted = dbCtrl.query(conn, "SELECT id FROM role_op_permission WHERE role_id=\""+(String)param.get("roleid")+" AND op_permission_id in ("+(String)param.get("oppermissionid")+")\";");
    	        for (String op : oppermission) {
					while(roledeleted.next()){
					Assert.assertEquals(roledeleted.getString("op_permission_id"), op);
    	        	Assert.assertEquals(Integer.valueOf(roledeleted.getInt("module")), (Integer)param.get("module"));
					}
				}
    	        
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				dbCtrl.executeSql(conn, "DELETE FROM  role_op_permission WHERE op_permission_id in ("+(String)param.get("oppermissionid")+")\";");
    	        LOGGER.info("*****************Test case: Post oppermission ended*****************");
    	        System.out.println("*****************Test case: Post oppermission ended*****************");
    	    }
    }
    
    @Test
    public void PostOppermissionDuplicated(Map<?, ?> param){
  	  try {
  	  		LOGGER.info("*****************Test case: Post oppermission duplicated Started*****************");
  	        System.out.println("*****************Test case: Post oppermissin duplicated Started*****************");
  	        String cookievalue= cookies.get(0);
  	        String uri = APITest.getValue("baseuri");
  	        String oppermissionid=(String)param.get("oppermissionid");
  	        String [] oppermission=oppermissionid.split(",");
  	        String value = "{\"roleId\":"+(String)param.get("roleid")+", \"module\":"+(String)param.get("module")+", \"opPermissionIds\":["+(String)param.get("oppermissionid")+"]}";
  	        APIResponse response=APIRequest.POST(uri).path("/oppermission").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
  	        response.assertBodyContains("200");
  	        response.assertBodyContains("success");	       
  	        ResultSet roledeleted = dbCtrl.query(conn, "SELECT id FROM role_op_permission WHERE role_id=\""+(String)param.get("roleid")+" AND op_permission_id in ("+(String)param.get("oppermissionid")+")\";");
  	        for (String op : oppermission) {
					while(roledeleted.next()){
					Assert.assertEquals(roledeleted.getString("op_permission_id"), op);
  	        	Assert.assertEquals(Integer.valueOf(roledeleted.getInt("module")), (Integer)param.get("module"));
					}
				}
  	        
  		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				dbCtrl.executeSql(conn, "DELETE FROM  role_op_permission WHERE op_permission_id in ("+(String)param.get("oppermissionid")+")\";");
  	        LOGGER.info("*****************Test case: Post oppermission duplicated ended*****************");
  	        System.out.println("*****************Test case: Post oppermission duplicated ended*****************");
  	    }
  }
    
    @Test   
    public void PostOppermissionBadformmat(){
	 try {
		 	LOGGER.info("*****************Test case: Post oppermission bad format Started*****************");
	        System.out.println("*****************Test case: Post oppermissin bad format Started*****************");
	        String cookievalue= cookies.get(0);
  	        String uri = APITest.getValue("baseuri");
  	        String value = "{\"roleId\": 1, \"module2\":2, \"opPermissionIds\":3}";
  	        APIResponse response=APIRequest.POST(uri).path("/oppermission").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
  	        response.assertBodyContains("400");
	} finally {
	        LOGGER.info("*****************Test case: Post oppermission bad format ended*****************");
	        System.out.println("*****************Test case: Post oppermission bad format ended*****************");
	}
   }
    
    
   @Test
   public void PostOppermissionBadElement() {
		 try {
			 	LOGGER.info("*****************Test case: Post oppermission bad element Started*****************");
		        System.out.println("*****************Test case: Post oppermissin bad element Started*****************");
		        String cookievalue= cookies.get(0);
	  	        String uri = APITest.getValue("baseuri");
	  	        String value = "{\"roleId\": 1, \"module2\":2, \"opPermissionIds\":3}";
	  	        APIResponse response=APIRequest.POST(uri).path("/oppermission").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
	  	        response.assertBodyContains("500");
		} finally {
		        LOGGER.info("*****************Test case: Post oppermission bad element ended*****************");
		        System.out.println("*****************Test case: Post oppermission bad element ended*****************");
		}

}
   
   
   @Test
   public void GetAccountconfigSysaccess(){
	   try {
		    LOGGER.info("*****************Test case: Get Accountconfig Sysaccess Started*****************");
	        System.out.println("*****************Test case: Get Accountconfig Sysaccess Started*****************");
	        String cookievalue= cookies.get(0);
  	        String uri = APITest.getValue("baseuri");
  	        APIResponse response=APIRequest.GET(uri).path("/accountconfig/sysaccess").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
  	       response.assertBodyContains("200");
  	        String responsbody = response.getBody();
  	        JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
  	        JsonObject body = jsonObject.getAsJsonObject("_body");
  	        ResultSet config = dbCtrl.query(conn, "SELECT * FROM account_config");
  	        config.next();
  	        String value = body.get("value").getAsString();
  	        Assert.assertEquals(value, config.getString("value"));
  	      
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		   LOGGER.info("*****************Test case: Get Accountconfig Sysaccess ended*****************");
	        System.out.println("*****************Test case: Get Accountconfig Sysaccess ended*****************");
	}
   }
   
   @Test
   public void PostAccountconfigSysaccess(){
	  try {
		  LOGGER.info("*****************Test case: POST Accountconfig Sysaccess Started*****************");
	        System.out.println("*****************Test case: POST Accountconfig Sysaccess Started*****************");
	        String cookievalue= cookies.get(0);
	        String uri = APITest.getValue("baseuri");
	        String value = "{\"value\": {\"ipStrict\":\"127.0.0.1,192.168.1.1,192.168.1.234\",\"timeStrict\":\"07:00,23:30\",\"rateStrict\":\"5000,5000\"}}";
	        APIResponse response=APIRequest.POST(uri).path("/accountconfig/sysaccess").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
	        response.assertBodyContains("200");		
 	        ResultSet config = dbCtrl.query(conn, "SELECT * FROM account_config");
 	        config.next();
 	        Assert.assertEquals(config.getRow(), 1);
 	        Assert.assertEquals(value, config.getString("value"));
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		  LOGGER.info("*****************Test case: POST Accountconfig Sysaccess Ended*****************");
	      System.out.println("*****************Test case: POST Accountconfig Sysaccess Ended*****************");
	}
   }
   
   @Test
   public void PostAccountconfigSysaccessDuplicate(){
		  try {
			  LOGGER.info("*****************Test case: POST Accountconfig Sysaccess duplicate Started*****************");
		        System.out.println("*****************Test case: POST Accountconfig Sysaccess duplicate Started*****************");
		        String cookievalue= cookies.get(0);
		        String uri = APITest.getValue("baseuri");
		        String value = "{\"value\": {\"ipStrict\":\"127.0.0.1,192.168.1.1,192.168.1.234\",\"timeStrict\":\"07:00,23:30\",\"rateStrict\":\"5000,5000\"}}";
		        APIResponse response=APIRequest.POST(uri).path("/accountconfig/sysaccess").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(value).invoke();
		       response.assertBodyContains("200");		
	 	        ResultSet config = dbCtrl.query(conn, "SELECT * FROM account_config");
	 	        config.next();
	 	        Assert.assertEquals(config.getRow(), 1);
	 	        Assert.assertEquals(value, config.getString("value"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			  LOGGER.info("*****************Test case: POST Accountconfig Sysaccess duplicate Ended*****************");
		      System.out.println("*****************Test case: POST Accountconfig Sysaccess duplicate Ended*****************");
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
  public void setup() throws SQLException {
    LOGGER.info("*****************Test suit: Org*****************");
    System.out.println("*****************Test suit: Org*****************");
    String uri = APITest.getValue("baseuri");
    String path = APITest.getValue("login.path");
    //String payload = String.format(APITest.loadFile("jsonfile.json"), "62ab92bab49692ea813c99b3d2b4ebbdb3aa99ffede992762b5edc612f162814", "f57405304f15cba90c214252f85b925407704d3bb67b598bb49ada0460161b63");
    APIResponse response= APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=koth&password=1")
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
  public void afterSuite() {
  }


}
